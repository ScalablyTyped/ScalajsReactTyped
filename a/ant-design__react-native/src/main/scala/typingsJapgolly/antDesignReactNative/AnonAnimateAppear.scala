package typingsJapgolly.antDesignReactNative

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAnimateAppear extends js.Object {
  var animateAppear: Boolean
  var animationType: String
  var closable: Boolean
  var footer: js.Array[scala.Nothing]
  var maskClosable: Boolean
  var operation: Boolean
  var popup: Boolean
  var transparent: Boolean
  var visible: Boolean
  def onClose(): Unit
}

object AnonAnimateAppear {
  @scala.inline
  def apply(
    animateAppear: Boolean,
    animationType: String,
    closable: Boolean,
    footer: js.Array[scala.Nothing],
    maskClosable: Boolean,
    onClose: Callback,
    operation: Boolean,
    popup: Boolean,
    transparent: Boolean,
    visible: Boolean
  ): AnonAnimateAppear = {
    val __obj = js.Dynamic.literal(animateAppear = animateAppear.asInstanceOf[js.Any], animationType = animationType.asInstanceOf[js.Any], closable = closable.asInstanceOf[js.Any], footer = footer.asInstanceOf[js.Any], maskClosable = maskClosable.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], popup = popup.asInstanceOf[js.Any], transparent = transparent.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.updateDynamic("onClose")(onClose.toJsFn)
    __obj.asInstanceOf[AnonAnimateAppear]
  }
}

