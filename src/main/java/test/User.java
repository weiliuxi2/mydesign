package test;

/**
 * Person.java
 *
 * @author  weiliuxi
 * @since   1.0
 * @version 2018年4月4日 weiliuxi
 */
public class User {
	 /**  */
	private Long id;
	 /**  */
	private String name;
	
	public User(){
		
	}
	
	/**
	 * 构造函数
	 * @param id id
	 * @param name name
	 */
	public User(Long id,String name) {
		this.id = id;
		this.name = name;
	}
	/**
	 * @return 获取 id属性值
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id 设置 id 属性值为参数值 id
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return 获取 name属性值
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name 设置 name 属性值为参数值 name
	 */
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}
	
	
}
