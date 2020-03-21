package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLButtonElement
import org.scalajs.dom.raw.KeyboardEvent
import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.TouchEvent
import typingsJapgolly.officeUiFabricReact.sliderTypesMod.ISlider
import typingsJapgolly.officeUiFabricReact.sliderTypesMod.ISliderProps
import typingsJapgolly.officeUiFabricReact.sliderTypesMod.ISliderStyleProps
import typingsJapgolly.officeUiFabricReact.sliderTypesMod.ISliderStyles
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsJapgolly.uifabricStyling.ithemeMod.ITheme
import typingsJapgolly.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SliderBase {
  def apply(
    ariaLabel: String = null,
    ariaValueText: /* value */ Double => CallbackTo[String] = null,
    buttonProps: HTMLAttributes[HTMLButtonElement] = null,
    className: String = null,
    componentRef: IRefObject[ISlider] = null,
    defaultValue: Int | Double = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    label: String = null,
    max: Int | Double = null,
    min: Int | Double = null,
    onChange: /* value */ Double => Callback = null,
    onChanged: (/* event */ MouseEvent | TouchEvent | KeyboardEvent, /* value */ Double) => Callback = null,
    originFromZero: js.UndefOr[Boolean] = js.undefined,
    showValue: js.UndefOr[Boolean] = js.undefined,
    snapToStep: js.UndefOr[Boolean] = js.undefined,
    step: Int | Double = null,
    styles: IStyleFunctionOrObject[ISliderStyleProps, ISliderStyles] = null,
    theme: ITheme = null,
    value: Int | Double = null,
    valueFormat: /* value */ Double => CallbackTo[String] = null,
    vertical: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ISliderProps, typingsJapgolly.officeUiFabricReact.mod.SliderBase, Unit, ISliderProps] = {
    val __obj = js.Dynamic.literal()
  
      if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel.asInstanceOf[js.Any])
    if (ariaValueText != null) __obj.updateDynamic("ariaValueText")(js.Any.fromFunction1((t0: /* value */ scala.Double) => ariaValueText(t0).runNow()))
    if (buttonProps != null) __obj.updateDynamic("buttonProps")(buttonProps.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* value */ scala.Double) => onChange(t0).runNow()))
    if (onChanged != null) __obj.updateDynamic("onChanged")(js.Any.fromFunction2((t0: /* event */ org.scalajs.dom.raw.MouseEvent | org.scalajs.dom.raw.TouchEvent | org.scalajs.dom.raw.KeyboardEvent, t1: /* value */ scala.Double) => onChanged(t0, t1).runNow()))
    if (!js.isUndefined(originFromZero)) __obj.updateDynamic("originFromZero")(originFromZero.asInstanceOf[js.Any])
    if (!js.isUndefined(showValue)) __obj.updateDynamic("showValue")(showValue.asInstanceOf[js.Any])
    if (!js.isUndefined(snapToStep)) __obj.updateDynamic("snapToStep")(snapToStep.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (valueFormat != null) __obj.updateDynamic("valueFormat")(js.Any.fromFunction1((t0: /* value */ scala.Double) => valueFormat(t0).runNow()))
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.officeUiFabricReact.sliderTypesMod.ISliderProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.officeUiFabricReact.mod.SliderBase](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.officeUiFabricReact.sliderTypesMod.ISliderProps])(children: _*)
  }
  @JSImport("office-ui-fabric-react", "SliderBase")
  @js.native
  object componentImport extends js.Object
  
}

