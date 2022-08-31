package com.sist.spring3;
import java.util.*;
public class Container {
	private Map map=new HashMap();
	public Container()
	{
		map.put("a", new A());
		map.put("b", new B());
		map.put("c", new C());
	}
	public Object getBean(String key)
	{
		return map.get(key); // DL : 키로 주소값을 클래스로 찾아오는것
	}
}
