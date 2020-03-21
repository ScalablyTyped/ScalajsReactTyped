package typingsJapgolly.rmcPicker

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOnValueChange extends js.Object {
  var prefixCls: String
  def onValueChange(): Unit
}

object AnonOnValueChange {
  @scala.inline
  def apply(onValueChange: Callback, prefixCls: String): AnonOnValueChange = {
    val __obj = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any])
    __obj.updateDynamic("onValueChange")(onValueChange.toJsFn)
    __obj.asInstanceOf[AnonOnValueChange]
  }
}

