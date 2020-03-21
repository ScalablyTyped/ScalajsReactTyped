package typingsJapgolly.rmcPicker

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<{  children ? :react.react.ReactNode}> & std.Readonly<rmc-picker.rmc-picker/lib/PopupPickerTypes.IPopupPickerProps> */
trait ReadonlychildrenReactNodeActionTextActiveOpacity extends js.Object {
  val WrapComponent: js.UndefOr[js.Any] = js.undefined
  val actionTextActiveOpacity: js.UndefOr[Double] = js.undefined
  val actionTextUnderlayColor: js.UndefOr[String] = js.undefined
  val children: js.UndefOr[Node] = js.undefined
  val className: js.UndefOr[String] = js.undefined
  val content: js.UndefOr[Element | String] = js.undefined
  val disabled: js.UndefOr[Boolean] = js.undefined
  val dismissText: js.UndefOr[String | Element] = js.undefined
  val maskTransitionName: js.UndefOr[String] = js.undefined
  val okText: js.UndefOr[String | Element] = js.undefined
  val onDismiss: js.UndefOr[js.Function0[Unit]] = js.undefined
  val onOk: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], Unit]] = js.undefined
  val onVisibleChange: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.undefined
  val picker: js.UndefOr[js.Any] = js.undefined
  val pickerValueChangeProp: js.UndefOr[String] = js.undefined
  val pickerValueProp: js.UndefOr[String] = js.undefined
  val popupTransitionName: js.UndefOr[String] = js.undefined
  val prefixCls: js.UndefOr[String] = js.undefined
  val style: js.UndefOr[js.Any] = js.undefined
  val styles: js.UndefOr[js.Any] = js.undefined
  val title: js.UndefOr[String | Element] = js.undefined
  val transitionName: js.UndefOr[String] = js.undefined
  val triggerType: js.UndefOr[String] = js.undefined
  val value: js.UndefOr[js.Any] = js.undefined
  val visible: js.UndefOr[Boolean] = js.undefined
  val wrapStyle: js.UndefOr[CSSProperties] = js.undefined
}

object ReadonlychildrenReactNodeActionTextActiveOpacity {
  @scala.inline
  def apply(
    WrapComponent: js.Any = null,
    actionTextActiveOpacity: Int | Double = null,
    actionTextUnderlayColor: String = null,
    children: VdomNode = null,
    className: String = null,
    content: Element | String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    dismissText: String | Element = null,
    maskTransitionName: String = null,
    okText: String | Element = null,
    onDismiss: js.UndefOr[Callback] = js.undefined,
    onOk: /* value */ js.UndefOr[js.Any] => Callback = null,
    onVisibleChange: /* visible */ Boolean => Callback = null,
    picker: js.Any = null,
    pickerValueChangeProp: String = null,
    pickerValueProp: String = null,
    popupTransitionName: String = null,
    prefixCls: String = null,
    style: js.Any = null,
    styles: js.Any = null,
    title: String | Element = null,
    transitionName: String = null,
    triggerType: String = null,
    value: js.Any = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    wrapStyle: CSSProperties = null
  ): ReadonlychildrenReactNodeActionTextActiveOpacity = {
    val __obj = js.Dynamic.literal()
    if (WrapComponent != null) __obj.updateDynamic("WrapComponent")(WrapComponent.asInstanceOf[js.Any])
    if (actionTextActiveOpacity != null) __obj.updateDynamic("actionTextActiveOpacity")(actionTextActiveOpacity.asInstanceOf[js.Any])
    if (actionTextUnderlayColor != null) __obj.updateDynamic("actionTextUnderlayColor")(actionTextUnderlayColor.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (dismissText != null) __obj.updateDynamic("dismissText")(dismissText.asInstanceOf[js.Any])
    if (maskTransitionName != null) __obj.updateDynamic("maskTransitionName")(maskTransitionName.asInstanceOf[js.Any])
    if (okText != null) __obj.updateDynamic("okText")(okText.asInstanceOf[js.Any])
    onDismiss.foreach(p => __obj.updateDynamic("onDismiss")(p.toJsFn))
    if (onOk != null) __obj.updateDynamic("onOk")(js.Any.fromFunction1((t0: /* value */ js.UndefOr[js.Any]) => onOk(t0).runNow()))
    if (onVisibleChange != null) __obj.updateDynamic("onVisibleChange")(js.Any.fromFunction1((t0: /* visible */ scala.Boolean) => onVisibleChange(t0).runNow()))
    if (picker != null) __obj.updateDynamic("picker")(picker.asInstanceOf[js.Any])
    if (pickerValueChangeProp != null) __obj.updateDynamic("pickerValueChangeProp")(pickerValueChangeProp.asInstanceOf[js.Any])
    if (pickerValueProp != null) __obj.updateDynamic("pickerValueProp")(pickerValueProp.asInstanceOf[js.Any])
    if (popupTransitionName != null) __obj.updateDynamic("popupTransitionName")(popupTransitionName.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (transitionName != null) __obj.updateDynamic("transitionName")(transitionName.asInstanceOf[js.Any])
    if (triggerType != null) __obj.updateDynamic("triggerType")(triggerType.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (wrapStyle != null) __obj.updateDynamic("wrapStyle")(wrapStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlychildrenReactNodeActionTextActiveOpacity]
  }
}

