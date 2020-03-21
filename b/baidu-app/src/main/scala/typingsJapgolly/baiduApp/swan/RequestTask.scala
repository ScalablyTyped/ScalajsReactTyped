package typingsJapgolly.baiduApp.swan

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * 返回一个 requestTask 对象，通过 requestTask，可中断请求任务。
	 */
trait RequestTask extends js.Object {
  def abort(): Unit
}

object RequestTask {
  @scala.inline
  def apply(abort: Callback): RequestTask = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("abort")(abort.toJsFn)
    __obj.asInstanceOf[RequestTask]
  }
}

