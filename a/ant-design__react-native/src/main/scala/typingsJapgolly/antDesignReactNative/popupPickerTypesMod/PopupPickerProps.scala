package typingsJapgolly.antDesignReactNative.popupPickerTypesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopupPickerProps extends js.Object {
  var WrapComponent: js.UndefOr[js.Any] = js.undefined
  var actionTextActiveOpacity: js.UndefOr[Double] = js.undefined
  var actionTextUnderlayColor: js.UndefOr[String] = js.undefined
  var content: js.UndefOr[Element | String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var dismissText: js.UndefOr[String | Element] = js.undefined
  var maskTransitionName: js.UndefOr[String] = js.undefined
  var okText: js.UndefOr[String | Element] = js.undefined
  var onDismiss: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onOk: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], Unit]] = js.undefined
  var onVisibleChange: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.undefined
  var picker: js.UndefOr[js.Any] = js.undefined
  var pickerValueChangeProp: js.UndefOr[String] = js.undefined
  var pickerValueProp: js.UndefOr[String] = js.undefined
  var popupTransitionName: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[js.Any] = js.undefined
  var styles: js.UndefOr[js.Any] = js.undefined
  var title: js.UndefOr[String | Element] = js.undefined
  var transitionName: js.UndefOr[String] = js.undefined
  var triggerType: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
  var wrapStyle: js.UndefOr[CSSProperties] = js.undefined
}

object PopupPickerProps {
  @scala.inline
  def apply(
    WrapComponent: js.Any = null,
    actionTextActiveOpacity: Int | Double = null,
    actionTextUnderlayColor: String = null,
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
    style: js.Any = null,
    styles: js.Any = null,
    title: String | Element = null,
    transitionName: String = null,
    triggerType: String = null,
    value: js.Any = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    wrapStyle: CSSProperties = null
  ): PopupPickerProps = {
    val __obj = js.Dynamic.literal()
    if (WrapComponent != null) __obj.updateDynamic("WrapComponent")(WrapComponent.asInstanceOf[js.Any])
    if (actionTextActiveOpacity != null) __obj.updateDynamic("actionTextActiveOpacity")(actionTextActiveOpacity.asInstanceOf[js.Any])
    if (actionTextUnderlayColor != null) __obj.updateDynamic("actionTextUnderlayColor")(actionTextUnderlayColor.asInstanceOf[js.Any])
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
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (transitionName != null) __obj.updateDynamic("transitionName")(transitionName.asInstanceOf[js.Any])
    if (triggerType != null) __obj.updateDynamic("triggerType")(triggerType.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (wrapStyle != null) __obj.updateDynamic("wrapStyle")(wrapStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopupPickerProps]
  }
}

