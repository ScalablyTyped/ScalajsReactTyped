package typingsJapgolly.fibjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Class_Semaphore")
@js.native
/**
	 * 
	 * @brief 信号量构造函数
	 * @param value 计数器初始数值
	 * 
	 * 
	 * 
	 */
class ClassSemaphore () extends ClassLock {
  def this(value: Double) = this()
  /**
  	 * 
  	 * @brief 释放一个信号量，等同于 release()
  	 * 
  	 * 
  	 */
  def post(): Unit = js.native
  /**
  	 * 
  	 * @brief 尝试获取一个信号，如不能获取，则立即返回并返回 false，等同于 acquire(false)
  	 * @return 获取成功则返回 true
  	 * 
  	 * 
  	 * 
  	 */
  def trywait(): Boolean = js.native
}

