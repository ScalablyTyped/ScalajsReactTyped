package typingsJapgolly.antdMobile

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMode extends js.Object {
  var mode: String
  var prefixCls: String
  def onLeftClick(): Unit
}

object AnonMode {
  @scala.inline
  def apply(mode: String, onLeftClick: Callback, prefixCls: String): AnonMode = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
    __obj.updateDynamic("onLeftClick")(onLeftClick.toJsFn)
    __obj.asInstanceOf[AnonMode]
  }
}

