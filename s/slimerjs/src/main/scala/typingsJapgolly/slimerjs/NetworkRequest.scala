package typingsJapgolly.slimerjs

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworkRequest extends js.Object {
  def abort(): Unit
  def changeUrl(url: String): Unit
  def setHeader(name: String, value: String): Unit
}

object NetworkRequest {
  @scala.inline
  def apply(abort: Callback, changeUrl: String => Callback, setHeader: (String, String) => Callback): NetworkRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("abort")(abort.toJsFn)
    __obj.updateDynamic("changeUrl")(js.Any.fromFunction1((t0: java.lang.String) => changeUrl(t0).runNow()))
    __obj.updateDynamic("setHeader")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => setHeader(t0, t1).runNow()))
    __obj.asInstanceOf[NetworkRequest]
  }
}

