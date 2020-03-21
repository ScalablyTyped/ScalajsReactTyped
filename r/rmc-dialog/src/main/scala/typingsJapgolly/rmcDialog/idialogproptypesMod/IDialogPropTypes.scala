package typingsJapgolly.rmcDialog.idialogproptypesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDialogPropTypes extends js.Object {
  var afterClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  var animation: js.UndefOr[js.Any] = js.undefined
  var bodyStyle: js.UndefOr[js.Object] = js.undefined
  var children: js.UndefOr[js.Any] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var closable: js.UndefOr[Boolean] = js.undefined
  var footer: js.UndefOr[Node] = js.undefined
  var mask: js.UndefOr[Boolean] = js.undefined
  var maskAnimation: js.UndefOr[js.Any] = js.undefined
  var maskClosable: js.UndefOr[Boolean] = js.undefined
  var maskProps: js.UndefOr[js.Any] = js.undefined
  var maskStyle: js.UndefOr[js.Object] = js.undefined
  var maskTransitionName: js.UndefOr[String] = js.undefined
  var onAnimateLeave: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onClose: js.UndefOr[js.Function1[/* e */ js.Any, Unit]] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var title: js.UndefOr[Node] = js.undefined
  var transitionName: js.UndefOr[String] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
  var wrapClassName: js.UndefOr[String] = js.undefined
  var wrapProps: js.UndefOr[js.Any] = js.undefined
  var wrapStyle: js.UndefOr[js.Object] = js.undefined
  var zIndex: js.UndefOr[Double] = js.undefined
}

object IDialogPropTypes {
  @scala.inline
  def apply(
    afterClose: js.UndefOr[Callback] = js.undefined,
    animation: js.Any = null,
    bodyStyle: js.Object = null,
    children: js.Any = null,
    className: String = null,
    closable: js.UndefOr[Boolean] = js.undefined,
    footer: VdomNode = null,
    mask: js.UndefOr[Boolean] = js.undefined,
    maskAnimation: js.Any = null,
    maskClosable: js.UndefOr[Boolean] = js.undefined,
    maskProps: js.Any = null,
    maskStyle: js.Object = null,
    maskTransitionName: String = null,
    onAnimateLeave: js.UndefOr[Callback] = js.undefined,
    onClose: /* e */ js.Any => Callback = null,
    prefixCls: String = null,
    style: js.Object = null,
    title: VdomNode = null,
    transitionName: String = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    wrapClassName: String = null,
    wrapProps: js.Any = null,
    wrapStyle: js.Object = null,
    zIndex: Int | Double = null
  ): IDialogPropTypes = {
    val __obj = js.Dynamic.literal()
    afterClose.foreach(p => __obj.updateDynamic("afterClose")(p.toJsFn))
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (bodyStyle != null) __obj.updateDynamic("bodyStyle")(bodyStyle.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(closable)) __obj.updateDynamic("closable")(closable.asInstanceOf[js.Any])
    if (footer != null) __obj.updateDynamic("footer")(footer.rawNode.asInstanceOf[js.Any])
    if (!js.isUndefined(mask)) __obj.updateDynamic("mask")(mask.asInstanceOf[js.Any])
    if (maskAnimation != null) __obj.updateDynamic("maskAnimation")(maskAnimation.asInstanceOf[js.Any])
    if (!js.isUndefined(maskClosable)) __obj.updateDynamic("maskClosable")(maskClosable.asInstanceOf[js.Any])
    if (maskProps != null) __obj.updateDynamic("maskProps")(maskProps.asInstanceOf[js.Any])
    if (maskStyle != null) __obj.updateDynamic("maskStyle")(maskStyle.asInstanceOf[js.Any])
    if (maskTransitionName != null) __obj.updateDynamic("maskTransitionName")(maskTransitionName.asInstanceOf[js.Any])
    onAnimateLeave.foreach(p => __obj.updateDynamic("onAnimateLeave")(p.toJsFn))
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1((t0: /* e */ js.Any) => onClose(t0).runNow()))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.rawNode.asInstanceOf[js.Any])
    if (transitionName != null) __obj.updateDynamic("transitionName")(transitionName.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (wrapClassName != null) __obj.updateDynamic("wrapClassName")(wrapClassName.asInstanceOf[js.Any])
    if (wrapProps != null) __obj.updateDynamic("wrapProps")(wrapProps.asInstanceOf[js.Any])
    if (wrapStyle != null) __obj.updateDynamic("wrapStyle")(wrapStyle.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDialogPropTypes]
  }
}

