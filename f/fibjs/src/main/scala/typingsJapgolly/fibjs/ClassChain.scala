package typingsJapgolly.fibjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Class_Chain")
@js.native
class ClassChain protected () extends ClassHandler {
  /**
  	 * 
  	 * @brief 构造一个消息处理器链处理对象
  	 * @param hdlrs 处理器数组
  	 * 
  	 * 
  	 * 
  	 */
  def this(hdlrs: js.Array[_]) = this()
  /**
  	 * 
  	 * @brief 添加处理器数组
  	 * @param hdlrs 处理器数组
  	 * 
  	 * 
  	 * 
  	 */
  def append(hdlrs: js.Array[_]): Unit = js.native
  /**
  	 * 
  	 * @brief 添加处理器
  	 * @param hdlr 内置消息处理器，处理函数，链式处理数组，路由对象，详见 mq.Handler
  	 * 
  	 * 
  	 * 
  	 */
  def append(hdlr: ClassHandler): Unit = js.native
}

