package typingsJapgolly.antd.confirmDialogMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.antd.antdBooleans.`false`
import typingsJapgolly.antd.antdStrings.cancel
import typingsJapgolly.antd.antdStrings.ok
import typingsJapgolly.antd.buttonButtonMod.ButtonType
import typingsJapgolly.antd.buttonButtonMod.NativeButtonProps
import typingsJapgolly.antd.modalModalMod.ModalFuncProps
import typingsJapgolly.antd.modalModalMod.getContainerFunc
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfirmDialogProps extends ModalFuncProps {
  var afterClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  def close(args: js.Any*): Unit
}

object ConfirmDialogProps {
  @scala.inline
  def apply(
    close: /* repeated */ js.Any => Callback,
    afterClose: js.UndefOr[Callback] = js.undefined,
    autoFocusButton: ok | cancel = null,
    cancelButtonProps: NativeButtonProps = null,
    cancelText: VdomNode = null,
    centered: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    content: VdomNode = null,
    getContainer: String | HTMLElement | getContainerFunc | `false` = null,
    icon: VdomNode = null,
    keyboard: js.UndefOr[Boolean] = js.undefined,
    mask: js.UndefOr[Boolean] = js.undefined,
    maskClosable: js.UndefOr[Boolean] = js.undefined,
    maskStyle: CSSProperties = null,
    maskTransitionName: String = null,
    okButtonProps: NativeButtonProps = null,
    okCancel: js.UndefOr[Boolean] = js.undefined,
    okText: VdomNode = null,
    okType: ButtonType = null,
    onCancel: /* repeated */ js.Any => CallbackTo[js.Any] = null,
    onOk: /* repeated */ js.Any => CallbackTo[js.Any] = null,
    prefixCls: String = null,
    style: CSSProperties = null,
    title: VdomNode = null,
    transitionName: String = null,
    `type`: String = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: String | Double = null,
    zIndex: Int | Double = null
  ): ConfirmDialogProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("close")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => close(t0).runNow()))
    afterClose.foreach(p => __obj.updateDynamic("afterClose")(p.toJsFn))
    if (autoFocusButton != null) __obj.updateDynamic("autoFocusButton")(autoFocusButton.asInstanceOf[js.Any])
    if (cancelButtonProps != null) __obj.updateDynamic("cancelButtonProps")(cancelButtonProps.asInstanceOf[js.Any])
    if (cancelText != null) __obj.updateDynamic("cancelText")(cancelText.rawNode.asInstanceOf[js.Any])
    if (!js.isUndefined(centered)) __obj.updateDynamic("centered")(centered.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.rawNode.asInstanceOf[js.Any])
    if (getContainer != null) __obj.updateDynamic("getContainer")(getContainer.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.rawNode.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboard)) __obj.updateDynamic("keyboard")(keyboard.asInstanceOf[js.Any])
    if (!js.isUndefined(mask)) __obj.updateDynamic("mask")(mask.asInstanceOf[js.Any])
    if (!js.isUndefined(maskClosable)) __obj.updateDynamic("maskClosable")(maskClosable.asInstanceOf[js.Any])
    if (maskStyle != null) __obj.updateDynamic("maskStyle")(maskStyle.asInstanceOf[js.Any])
    if (maskTransitionName != null) __obj.updateDynamic("maskTransitionName")(maskTransitionName.asInstanceOf[js.Any])
    if (okButtonProps != null) __obj.updateDynamic("okButtonProps")(okButtonProps.asInstanceOf[js.Any])
    if (!js.isUndefined(okCancel)) __obj.updateDynamic("okCancel")(okCancel.asInstanceOf[js.Any])
    if (okText != null) __obj.updateDynamic("okText")(okText.rawNode.asInstanceOf[js.Any])
    if (okType != null) __obj.updateDynamic("okType")(okType.asInstanceOf[js.Any])
    if (onCancel != null) __obj.updateDynamic("onCancel")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onCancel(t0).runNow()))
    if (onOk != null) __obj.updateDynamic("onOk")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onOk(t0).runNow()))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.rawNode.asInstanceOf[js.Any])
    if (transitionName != null) __obj.updateDynamic("transitionName")(transitionName.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfirmDialogProps]
  }
}

