package typingsJapgolly.antd.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.antd.antdNumbers.`false`
import typingsJapgolly.antd.libButtonButtonMod.ButtonType
import typingsJapgolly.antd.libButtonButtonMod.NativeButtonProps
import typingsJapgolly.antd.libModalMod.default
import typingsJapgolly.antd.libModalModalMod.ModalProps
import typingsJapgolly.antd.libModalModalMod.getContainerFunc
import typingsJapgolly.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Modal {
  def apply(
    afterClose: js.UndefOr[Callback] = js.undefined,
    bodyStyle: CSSProperties = null,
    cancelButtonProps: NativeButtonProps = null,
    cancelText: VdomNode = null,
    centered: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    closable: js.UndefOr[Boolean] = js.undefined,
    closeIcon: VdomNode = null,
    confirmLoading: js.UndefOr[Boolean] = js.undefined,
    destroyOnClose: js.UndefOr[Boolean] = js.undefined,
    footer: VdomNode = null,
    forceRender: js.UndefOr[Boolean] = js.undefined,
    getContainer: String | HTMLElement | getContainerFunc | `false` = null,
    keyboard: js.UndefOr[Boolean] = js.undefined,
    mask: js.UndefOr[Boolean] = js.undefined,
    maskClosable: js.UndefOr[Boolean] = js.undefined,
    maskStyle: CSSProperties = null,
    maskTransitionName: String = null,
    okButtonProps: NativeButtonProps = null,
    okText: VdomNode = null,
    okType: ButtonType = null,
    onCancel: /* e */ ReactMouseEventFrom[HTMLElement] => Callback = null,
    onOk: /* e */ ReactMouseEventFrom[HTMLElement] => Callback = null,
    prefixCls: String = null,
    style: CSSProperties = null,
    title: Node | String = null,
    transitionName: String = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: String | Double = null,
    wrapClassName: String = null,
    wrapProps: js.Any = null,
    zIndex: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ModalProps, default, Unit, ModalProps] = {
    val __obj = js.Dynamic.literal()
  
      afterClose.foreach(p => __obj.updateDynamic("afterClose")(p.toJsFn))
    if (bodyStyle != null) __obj.updateDynamic("bodyStyle")(bodyStyle.asInstanceOf[js.Any])
    if (cancelButtonProps != null) __obj.updateDynamic("cancelButtonProps")(cancelButtonProps.asInstanceOf[js.Any])
    if (cancelText != null) __obj.updateDynamic("cancelText")(cancelText.rawNode.asInstanceOf[js.Any])
    if (!js.isUndefined(centered)) __obj.updateDynamic("centered")(centered.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(closable)) __obj.updateDynamic("closable")(closable.asInstanceOf[js.Any])
    if (closeIcon != null) __obj.updateDynamic("closeIcon")(closeIcon.rawNode.asInstanceOf[js.Any])
    if (!js.isUndefined(confirmLoading)) __obj.updateDynamic("confirmLoading")(confirmLoading.asInstanceOf[js.Any])
    if (!js.isUndefined(destroyOnClose)) __obj.updateDynamic("destroyOnClose")(destroyOnClose.asInstanceOf[js.Any])
    if (footer != null) __obj.updateDynamic("footer")(footer.rawNode.asInstanceOf[js.Any])
    if (!js.isUndefined(forceRender)) __obj.updateDynamic("forceRender")(forceRender.asInstanceOf[js.Any])
    if (getContainer != null) __obj.updateDynamic("getContainer")(getContainer.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboard)) __obj.updateDynamic("keyboard")(keyboard.asInstanceOf[js.Any])
    if (!js.isUndefined(mask)) __obj.updateDynamic("mask")(mask.asInstanceOf[js.Any])
    if (!js.isUndefined(maskClosable)) __obj.updateDynamic("maskClosable")(maskClosable.asInstanceOf[js.Any])
    if (maskStyle != null) __obj.updateDynamic("maskStyle")(maskStyle.asInstanceOf[js.Any])
    if (maskTransitionName != null) __obj.updateDynamic("maskTransitionName")(maskTransitionName.asInstanceOf[js.Any])
    if (okButtonProps != null) __obj.updateDynamic("okButtonProps")(okButtonProps.asInstanceOf[js.Any])
    if (okText != null) __obj.updateDynamic("okText")(okText.rawNode.asInstanceOf[js.Any])
    if (okType != null) __obj.updateDynamic("okType")(okType.asInstanceOf[js.Any])
    if (onCancel != null) __obj.updateDynamic("onCancel")(js.Any.fromFunction1((t0: /* e */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement]) => onCancel(t0).runNow()))
    if (onOk != null) __obj.updateDynamic("onOk")(js.Any.fromFunction1((t0: /* e */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement]) => onOk(t0).runNow()))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (transitionName != null) __obj.updateDynamic("transitionName")(transitionName.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (wrapClassName != null) __obj.updateDynamic("wrapClassName")(wrapClassName.asInstanceOf[js.Any])
    if (wrapProps != null) __obj.updateDynamic("wrapProps")(wrapProps.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antd.libModalModalMod.ModalProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antd.libModalMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antd.libModalModalMod.ModalProps])(children: _*)
  }
  @JSImport("antd/lib/modal", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

