package typingsJapgolly.fibjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Class_Worker")
@js.native
class ClassWorker protected () extends ClassEventEmitter {
  /**
  	 * 
  	 * @brief Worker 对象构造函数
  	 * @param path 指定 Worker 入口脚本，只接受绝对路径
  	 * @param opts 构造选项，暂未支持
  	 * 
  	 * 
  	 * 
  	 */
  def this(path: String) = this()
  def this(path: String, opts: js.Object) = this()
  /**
  	 * class prop 
  	 *
  	 * 
  	 * @brief 查询和绑定接受 postMessage 消息事件，相当于 on("message", func);
  	 * 
  	 * 
  	 * @type Function
  	 */
  var onmessage: js.Function = js.native
  /**
  	 * 
  	 * @brief 向 Master 或 Worker 发送消息，
  	 * @param data 指定发送的消息内容
  	 * 
  	 * 
  	 * 
  	 */
  def postMessage(data: js.Any): Unit = js.native
}

