package typingsJapgolly.uniApp

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestTask extends js.Object {
  /**
    * 中断请求任务
    */
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

