package typingsJapgolly.fibjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** module Or Internal Object */
/**
	* @brief 64位整数对象
	* @detail 创建方法：,```JavaScript,var n = new Int64(123);,```
	*/
@JSGlobal("Class_Int64")
@js.native
/**
	 * 
	 * @brief Int64 构造函数
	 * @param num 初始化的值
	 * 
	 * 
	 * 
	 */
class ClassInt64 () extends ClassObject {
  /**
  	 * 
  	 * @brief Int64 构造函数
  	 * @param num 数字字符串
  	 * @param base 数字字符串的编码方式，可以接受 2-16, 32, 64，默认为 10，为 10 时自动识别 0x 编码
  	 * 
  	 * 
  	 * 
  	 */
  def this(num: String) = this()
  def this(num: Double) = this()
  /**
  	 * 
  	 * @brief Int64 构造函数
  	 * @param num 初始化的值
  	 * 
  	 * 
  	 * 
  	 */
  def this(num: ClassInt64) = this()
  /**
  	 * 
  	 * @brief Int64 构造函数
  	 * @param hi 高32位数
  	 * @param lo 低32位数
  	 * 
  	 * 
  	 * 
  	 */
  def this(hi: Double, lo: Double) = this()
  def this(num: String, base: Double) = this()
  /**
  	 * class prop 
  	 *
  	 * 
  	 * @brief 高 32 位数值
  	 * 
  	 * 
  	 * @type Long
  	 */
  var hi: Double = js.native
  /**
  	 * class prop 
  	 *
  	 * 
  	 * @brief 低 32 位数值
  	 * 
  	 * 
  	 * @type Long
  	 */
  var lo: Double = js.native
  /**
  	 * 
  	 * @brief 将 Int64 内的数值与给定的数值进行加操作，此操作不影响 Int64 原有数值
  	 * @param num 指定运算的数值
  	 * @return 返回包含预算以后数值的对象
  	 * 
  	 * 
  	 * 
  	 */
  def add(num: ClassInt64): ClassInt64 = js.native
  /**
  	 * 
  	 * @brief 将 Int64 内的数值与给定的数值进行按位 and 操作，此操作不影响 Int64 原有数值
  	 * @param num 指定运算的数值
  	 * @return 返回包含预算以后数值的对象
  	 * 
  	 * 
  	 * 
  	 */
  def and(num: ClassInt64): ClassInt64 = js.native
  /**
  	 * 
  	 * @brief 将 Int64 内的数值与给定数值比较大小
  	 * @param num 指定比较的数值
  	 * @return 返回 1 表示 Int64 内的数值比指定数值更大，0 表示相等，-1 表示更小
  	 * 
  	 * 
  	 * 
  	 */
  def compare(num: ClassInt64): Double = js.native
  /**
  	 * 
  	 * @brief 将 Int64 内的数值与给定的数值进行除操作，此操作不影响 Int64 原有数值
  	 * @param num 指定运算的数值
  	 * @return 返回包含预算以后数值的对象
  	 * 
  	 * 
  	 * 
  	 */
  def div(num: ClassInt64): ClassInt64 = js.native
  /**
  	 * 
  	 * @brief 比较当前对象与给定的对象是否相等
  	 * @param expected 制定比较的目标对象
  	 * @return 返回对象比较的结果
  	 * 
  	 * 
  	 * 
  	 */
  def equals(expected: ClassObject): Boolean = js.native
  /**
  	 * 
  	 * @brief 将 Int64 内的数值与给定的数值进行乘操作，此操作不影响 Int64 原有数值
  	 * @param num 指定运算的数值
  	 * @return 返回包含预算以后数值的对象
  	 * 
  	 * 
  	 * 
  	 */
  def multi(num: ClassInt64): ClassInt64 = js.native
  /**
  	 * 
  	 * @brief 将 Int64 内的数值与给定的数值进行按位 or 操作，此操作不影响 Int64 原有数值
  	 * @param num 指定运算的数值
  	 * @return 返回包含预算以后数值的对象
  	 * 
  	 * 
  	 * 
  	 */
  def or(num: ClassInt64): ClassInt64 = js.native
  /**
  	 * 
  	 * @brief 将 Int64 内的数值左移相应的位数，此操作不影响 Int64 原有数值
  	 * @param bits 指定移动的位数
  	 * @return 返回包含移位以后数值的对象
  	 * 
  	 * 
  	 * 
  	 */
  def shiftLeft(bits: Double): ClassInt64 = js.native
  /**
  	 * 
  	 * @brief 将 Int64 内的数值右移相应的位数，此操作不影响 Int64 原有数值
  	 * @param bits 指定移动的位数
  	 * @return 返回包含移位以后数值的对象
  	 * 
  	 * 
  	 * 
  	 */
  def shiftRight(bits: Double): ClassInt64 = js.native
  /**
  	 * 
  	 * @brief 将 Int64 内的数值与给定的数值进行减操作，此操作不影响 Int64 原有数值
  	 * @param num 指定运算的数值
  	 * @return 返回包含预算以后数值的对象
  	 * 
  	 * 
  	 * 
  	 */
  def sub(num: ClassInt64): ClassInt64 = js.native
  /**
  	 * 
  	 * @brief 转换成数字类型
  	 * @return 返回转换后的数字
  	 * 
  	 * 
  	 * 
  	 */
  def toNumber(): Double = js.native
  def toString(base: Double): String = js.native
  /**
  	 * 
  	 * @brief 将 Int64 内的数值与给定的数值进行按位 xor 操作，此操作不影响 Int64 原有数值
  	 * @param num 指定运算的数值
  	 * @return 返回包含预算以后数值的对象
  	 * 
  	 * 
  	 * 
  	 */
  def xor(num: ClassInt64): ClassInt64 = js.native
}

