package typingsJapgolly.antdMobile.modalModalMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.antdMobile.PartialHTMLPropsHTMLDivEl
import typingsJapgolly.antdMobile.modalPropsTypeMod.Action
import typingsJapgolly.antdMobile.modalPropsTypeMod.ModalPropsType
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalProps extends ModalPropsType[CSSProperties] {
  var bodyStyle: js.UndefOr[CSSProperties] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var maskTransitionName: js.UndefOr[String] = js.undefined
  var platform: js.UndefOr[String] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var transitionName: js.UndefOr[String] = js.undefined
  var wrapClassName: js.UndefOr[String] = js.undefined
  var wrapProps: js.UndefOr[PartialHTMLPropsHTMLDivEl] = js.undefined
}

object ModalProps {
  @scala.inline
  def apply(
    visible: Boolean,
    animateAppear: js.UndefOr[Boolean] = js.undefined,
    animated: js.UndefOr[Boolean] = js.undefined,
    animationType: js.Any = null,
    bodyStyle: CSSProperties = null,
    className: String = null,
    closable: js.UndefOr[Boolean] = js.undefined,
    footer: js.Array[Action[CSSProperties]] = null,
    maskClosable: js.UndefOr[Boolean] = js.undefined,
    maskTransitionName: String = null,
    onAnimationEnd: /* visible */ Boolean => Callback = null,
    onClose: js.UndefOr[Callback] = js.undefined,
    operation: js.UndefOr[Boolean] = js.undefined,
    platform: String = null,
    popup: js.UndefOr[Boolean] = js.undefined,
    prefixCls: String = null,
    style: CSSProperties = null,
    title: VdomNode = null,
    transitionName: String = null,
    transparent: js.UndefOr[Boolean] = js.undefined,
    wrapClassName: String = null,
    wrapProps: PartialHTMLPropsHTMLDivEl = null
  ): ModalProps = {
    val __obj = js.Dynamic.literal(visible = visible.asInstanceOf[js.Any])
    if (!js.isUndefined(animateAppear)) __obj.updateDynamic("animateAppear")(animateAppear.asInstanceOf[js.Any])
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated.asInstanceOf[js.Any])
    if (animationType != null) __obj.updateDynamic("animationType")(animationType.asInstanceOf[js.Any])
    if (bodyStyle != null) __obj.updateDynamic("bodyStyle")(bodyStyle.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(closable)) __obj.updateDynamic("closable")(closable.asInstanceOf[js.Any])
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (!js.isUndefined(maskClosable)) __obj.updateDynamic("maskClosable")(maskClosable.asInstanceOf[js.Any])
    if (maskTransitionName != null) __obj.updateDynamic("maskTransitionName")(maskTransitionName.asInstanceOf[js.Any])
    if (onAnimationEnd != null) __obj.updateDynamic("onAnimationEnd")(js.Any.fromFunction1((t0: /* visible */ scala.Boolean) => onAnimationEnd(t0).runNow()))
    onClose.foreach(p => __obj.updateDynamic("onClose")(p.toJsFn))
    if (!js.isUndefined(operation)) __obj.updateDynamic("operation")(operation.asInstanceOf[js.Any])
    if (platform != null) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    if (!js.isUndefined(popup)) __obj.updateDynamic("popup")(popup.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.rawNode.asInstanceOf[js.Any])
    if (transitionName != null) __obj.updateDynamic("transitionName")(transitionName.asInstanceOf[js.Any])
    if (!js.isUndefined(transparent)) __obj.updateDynamic("transparent")(transparent.asInstanceOf[js.Any])
    if (wrapClassName != null) __obj.updateDynamic("wrapClassName")(wrapClassName.asInstanceOf[js.Any])
    if (wrapProps != null) __obj.updateDynamic("wrapProps")(wrapProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModalProps]
  }
}

