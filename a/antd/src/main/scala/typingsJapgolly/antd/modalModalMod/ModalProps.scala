package typingsJapgolly.antd.modalModalMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.antd.antdBooleans.`false`
import typingsJapgolly.antd.buttonButtonMod.ButtonType
import typingsJapgolly.antd.buttonButtonMod.NativeButtonProps
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalProps extends js.Object {
  var afterClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  var bodyStyle: js.UndefOr[CSSProperties] = js.undefined
  var cancelButtonProps: js.UndefOr[NativeButtonProps] = js.undefined
  /** 取消按钮文字 */
  var cancelText: js.UndefOr[Node] = js.undefined
  /** 垂直居中 */
  var centered: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  /** 是否显示右上角的关闭按钮 */
  var closable: js.UndefOr[Boolean] = js.undefined
  var closeIcon: js.UndefOr[Node] = js.undefined
  /** 确定按钮 loading */
  var confirmLoading: js.UndefOr[Boolean] = js.undefined
  var destroyOnClose: js.UndefOr[Boolean] = js.undefined
  /** 底部内容 */
  var footer: js.UndefOr[Node] = js.undefined
  /** 强制渲染 Modal */
  var forceRender: js.UndefOr[Boolean] = js.undefined
  var getContainer: js.UndefOr[String | HTMLElement | getContainerFunc | `false` | Null] = js.undefined
  var keyboard: js.UndefOr[Boolean] = js.undefined
  var mask: js.UndefOr[Boolean] = js.undefined
  /** 点击蒙层是否允许关闭 */
  var maskClosable: js.UndefOr[Boolean] = js.undefined
  var maskStyle: js.UndefOr[CSSProperties] = js.undefined
  var maskTransitionName: js.UndefOr[String] = js.undefined
  var okButtonProps: js.UndefOr[NativeButtonProps] = js.undefined
  /** 确认按钮文字 */
  var okText: js.UndefOr[Node] = js.undefined
  /** 确认按钮类型 */
  var okType: js.UndefOr[ButtonType] = js.undefined
  /** 点击模态框右上角叉、取消按钮、Props.maskClosable 值为 true 时的遮罩层或键盘按下 Esc 时的回调 */
  var onCancel: js.UndefOr[js.Function1[/* e */ ReactMouseEventFrom[HTMLElement], Unit]] = js.undefined
  /** 点击确定回调 */
  var onOk: js.UndefOr[js.Function1[/* e */ ReactMouseEventFrom[HTMLElement], Unit]] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  /** 标题 */
  var title: js.UndefOr[Node | String] = js.undefined
  var transitionName: js.UndefOr[String] = js.undefined
  /** 对话框是否可见 */
  var visible: js.UndefOr[Boolean] = js.undefined
  /** 宽度 */
  var width: js.UndefOr[String | Double] = js.undefined
  var wrapClassName: js.UndefOr[String] = js.undefined
  var wrapProps: js.UndefOr[js.Any] = js.undefined
  var zIndex: js.UndefOr[Double] = js.undefined
}

object ModalProps {
  @scala.inline
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
    zIndex: Int | Double = null
  ): ModalProps = {
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
    __obj.asInstanceOf[ModalProps]
  }
}

