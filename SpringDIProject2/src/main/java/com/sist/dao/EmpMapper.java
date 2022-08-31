package com.sist.dao;
import java.util.*;
import org.apache.ibatis.annotations.Select;
public interface EmpMapper{
	@Select("SELECT empno,ename,job,hiredate,sal,deptno "
			+"FROM emp")
public List<EmpVO> empListData();
  //   resultType   id        parameterType
  // public List<EmpVO> findAll();
	@Select("SELECT * FROM emp "
			+"WHERE empno=#{empno}")
	public EmpVO empDetailData(int empno);
	//    resultType    id       parameterType
	/*
	 * 		<select id="empDetailData" resultType="EmpVO" parameterType="int">
	 * 			SELECT * FROM emp
	 * 			WHERE empno=#{empno}
	 * 		</select>
	 */
}
