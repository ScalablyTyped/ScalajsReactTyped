package typingsJapgolly.pollyjsCore.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Interceptor extends js.Object {
  def abort(): Unit
  def passthrough(): Unit
}

object Interceptor {
  @scala.inline
  def apply(abort: Callback, passthrough: Callback): Interceptor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("abort")(abort.toJsFn)
    __obj.updateDynamic("passthrough")(passthrough.toJsFn)
    __obj.asInstanceOf[Interceptor]
  }
}

