package typingsJapgolly.rcDrawer

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAfterVisibleChange extends js.Object {
  var className: String
  var defaultOpen: Boolean
  var duration: String
  var ease: String
  var forceRender: Boolean
  var getContainer: String
  var handler: Element
  var keyboard: Boolean
  var level: String
  var maskClosable: Boolean
  var placement: String
  var prefixCls: String
  var showMask: Boolean
  var wrapperClassName: String
  def afterVisibleChange(): Unit
  def onChange(): Unit
}

object AnonAfterVisibleChange {
  @scala.inline
  def apply(
    afterVisibleChange: Callback,
    className: String,
    defaultOpen: Boolean,
    duration: String,
    ease: String,
    forceRender: Boolean,
    getContainer: String,
    handler: VdomElement,
    keyboard: Boolean,
    level: String,
    maskClosable: Boolean,
    onChange: Callback,
    placement: String,
    prefixCls: String,
    showMask: Boolean,
    wrapperClassName: String
  ): AnonAfterVisibleChange = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], defaultOpen = defaultOpen.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], ease = ease.asInstanceOf[js.Any], forceRender = forceRender.asInstanceOf[js.Any], getContainer = getContainer.asInstanceOf[js.Any], keyboard = keyboard.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], maskClosable = maskClosable.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], showMask = showMask.asInstanceOf[js.Any], wrapperClassName = wrapperClassName.asInstanceOf[js.Any])
    __obj.updateDynamic("afterVisibleChange")(afterVisibleChange.toJsFn)
    if (handler != null) __obj.updateDynamic("handler")(handler.rawElement.asInstanceOf[js.Any])
    __obj.updateDynamic("onChange")(onChange.toJsFn)
    __obj.asInstanceOf[AnonAfterVisibleChange]
  }
}

