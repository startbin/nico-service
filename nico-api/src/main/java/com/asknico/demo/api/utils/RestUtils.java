package com.asknico.demo.api.utils;

import java.lang.reflect.Field;
import java.sql.Timestamp;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

public class RestUtils {

	@SuppressWarnings("null")
	public static <T> Map<String, Map<String, String>> parseList2Map(
			Class<T> clazz, List<T> list, String map1Key, String map2Key,
			String map2Value) throws IllegalArgumentException,
			IllegalAccessException {
		Map<String, Map<String, String>> map = null;
		Map<String, String> subMap = null;
		T model = null;
		String key1 = null, key2 = null, value2 = null;
		for (T t : list) {
			model = t;
			for (Field field : clazz.getDeclaredFields()) {
				field.setAccessible(true);
				if (field.getName().equals(map1Key))
					key1 = field.get(model).toString();
				if (field.getName().equals(map2Key))
					key2 = field.get(model).toString();
				if (field.getName().equals(map2Value))
					value2 = field.get(model).toString();
			}
			subMap.put(key2, value2);
			map.put(key1, subMap);
		}
		return map;
	}

	// List<Map<String,Object>> -> Map<String,Object>
	public static Map<String, Object> parseList2Map(
			List<Map<String, Object>> list, String strKey, String strValue) {
		Map<String, Object> map = new LinkedHashMap<>();
		for (Map<String, Object> m : list) {
			map.put((String) m.get(strKey), m.get(strValue));
		}
		return map;
	}

	// map -> Response
	public static Response map2Response(Map<String, Object> map) {
		if (map != null) {
			return Response.status(Status.OK).entity(map).build();
		} else {
			return Response.status(Status.INTERNAL_SERVER_ERROR).entity("err")
					.build();
		}
	}

	// map -> Response
	public static Response mapStrStr2Response(Map<String, String> map) {
		if (map != null) {
			return Response.status(Status.OK).entity(map).build();
		} else {
			return Response.status(Status.INTERNAL_SERVER_ERROR).entity("err")
					.build();
		}
	}

	// list -> Response
	public static Response list2Response(List<Object> list) {
		if (list != null) {
			return Response.status(Status.OK).entity(list).build();
		} else {
			return Response.status(Status.INTERNAL_SERVER_ERROR).entity("err")
					.build();
		}
	}

	// list -> Response
	public static Response listStr2Response(List<String> list) {
		if (list != null) {
			return Response.status(Status.OK).entity(list).build();
		} else {
			return Response.status(Status.INTERNAL_SERVER_ERROR).entity("err")
					.build();
		}
	}

	// Object -> Response
	public static Response obj2Response(Object obj) {
		if (obj != null) {
			return Response.status(Status.OK).entity(obj).build();
		} else {
			return Response.status(Status.INTERNAL_SERVER_ERROR).entity("err")
					.build();
		}
	}

	// List<Object> -> Response
	public static Response listObject2Response(List<Object> list) {
		if (list != null) {
			return Response.status(Status.OK).entity(list).build();
		} else {
			return Response.status(Status.INTERNAL_SERVER_ERROR).entity("err")
					.build();
		}
	}

	// create -> Response
	public static Response create2Response(int num) {
		if (num > 0) {
			return Response.status(Status.OK).entity(num).build();
		} else {
			return Response.status(Status.NOT_ACCEPTABLE).entity("err").build();
		}
	}

	// update -> Response
	public static Response update2Response(int num) {
		if (num > 0) {
			return Response.status(Status.OK).entity(num).build();
		} else {
			return Response.status(Status.NOT_ACCEPTABLE).entity("err").build();
		}
	}

	// delete -> Response
	public static Response delete2Response(int num) {
		if (num > 0) {
			return Response.status(Status.OK).entity(num).build();
		} else {
			return Response.status(Status.NOT_ACCEPTABLE).entity("err").build();
		}
	}

	// count -> Response
	public static Response count2Response(int num) {
		return Response.status(Status.OK).entity(num).build();
		/*
		 * if(num > 0) { return Response.status(Status.OK).entity(num).build();
		 * } else { return
		 * Response.status(Status.NOT_ACCEPTABLE).entity("err").build(); }
		 */
	}



}
