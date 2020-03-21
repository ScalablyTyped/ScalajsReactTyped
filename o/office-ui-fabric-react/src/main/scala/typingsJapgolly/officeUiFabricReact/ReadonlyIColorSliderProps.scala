package typingsJapgolly.officeUiFabricReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.raw.Element
import typingsJapgolly.officeUiFabricReact.colorSliderTypesMod.IColorSlider
import typingsJapgolly.officeUiFabricReact.colorSliderTypesMod.IColorSliderStyleProps
import typingsJapgolly.officeUiFabricReact.colorSliderTypesMod.IColorSliderStyles
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsJapgolly.uifabricStyling.ithemeMod.ITheme
import typingsJapgolly.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<office-ui-fabric-react.office-ui-fabric-react/lib/components/ColorPicker/ColorSlider/ColorSlider.types.IColorSliderProps> */
trait ReadonlyIColorSliderProps extends js.Object {
  val ariaLabel: js.UndefOr[String] = js.undefined
  val className: js.UndefOr[String] = js.undefined
  val componentRef: js.UndefOr[IRefObject[IColorSlider]] = js.undefined
  val isAlpha: js.UndefOr[Boolean] = js.undefined
  val maxValue: js.UndefOr[Double] = js.undefined
  val minValue: js.UndefOr[Double] = js.undefined
  val onChange: js.UndefOr[
    js.Function2[
      /* event */ ReactMouseEventFrom[Element] | ReactKeyboardEventFrom[Element], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.undefined
  val overlayColor: js.UndefOr[String] = js.undefined
  val overlayStyle: js.UndefOr[CSSProperties] = js.undefined
  val styles: js.UndefOr[IStyleFunctionOrObject[IColorSliderStyleProps, IColorSliderStyles]] = js.undefined
  val theme: js.UndefOr[ITheme] = js.undefined
  val thumbColor: js.UndefOr[String] = js.undefined
  val value: js.UndefOr[Double] = js.undefined
}

object ReadonlyIColorSliderProps {
  @scala.inline
  def apply(
    ariaLabel: String = null,
    className: String = null,
    componentRef: IRefObject[IColorSlider] = null,
    isAlpha: js.UndefOr[Boolean] = js.undefined,
    maxValue: Int | Double = null,
    minValue: Int | Double = null,
    onChange: (/* event */ ReactMouseEventFrom[Element] | ReactKeyboardEventFrom[Element], /* newValue */ js.UndefOr[Double]) => Callback = null,
    overlayColor: String = null,
    overlayStyle: CSSProperties = null,
    styles: IStyleFunctionOrObject[IColorSliderStyleProps, IColorSliderStyles] = null,
    theme: ITheme = null,
    thumbColor: String = null,
    value: Int | Double = null
  ): ReadonlyIColorSliderProps = {
    val __obj = js.Dynamic.literal()
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (!js.isUndefined(isAlpha)) __obj.updateDynamic("isAlpha")(isAlpha.asInstanceOf[js.Any])
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue.asInstanceOf[js.Any])
    if (minValue != null) __obj.updateDynamic("minValue")(minValue.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2((t0: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.Element] | japgolly.scalajs.react.ReactKeyboardEventFrom[org.scalajs.dom.raw.Element], t1: /* newValue */ js.UndefOr[scala.Double]) => onChange(t0, t1).runNow()))
    if (overlayColor != null) __obj.updateDynamic("overlayColor")(overlayColor.asInstanceOf[js.Any])
    if (overlayStyle != null) __obj.updateDynamic("overlayStyle")(overlayStyle.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (thumbColor != null) __obj.updateDynamic("thumbColor")(thumbColor.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyIColorSliderProps]
  }
}

