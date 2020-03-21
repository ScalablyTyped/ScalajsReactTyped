package typingsJapgolly.rcMenu

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFocusable extends js.Object {
  var className: String
  var focusable: Boolean
  var inlineIndent: Double
  var level: Double
  var manualRef: js.Function0[Unit]
  var mode: String
  var prefixCls: String
  var visible: Boolean
}

object AnonFocusable {
  @scala.inline
  def apply(
    className: String,
    focusable: Boolean,
    inlineIndent: Double,
    level: Double,
    manualRef: Callback,
    mode: String,
    prefixCls: String,
    visible: Boolean
  ): AnonFocusable = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], focusable = focusable.asInstanceOf[js.Any], inlineIndent = inlineIndent.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.updateDynamic("manualRef")(manualRef.toJsFn)
    __obj.asInstanceOf[AnonFocusable]
  }
}

