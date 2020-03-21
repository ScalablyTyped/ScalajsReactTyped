package typingsJapgolly.officeUiFabricReact.colorSliderTypesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.raw.Element
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsJapgolly.uifabricStyling.ithemeMod.ITheme
import typingsJapgolly.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IColorSliderProps extends js.Object {
  /**
    * Label of the ColorSlider for the benefit of screen reader users.
    */
  var ariaLabel: js.UndefOr[String] = js.undefined
  /**
    * Additional CSS class(es) to apply to the ColorSlider.
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * Gets the component ref.
    */
  var componentRef: js.UndefOr[IRefObject[IColorSlider]] = js.undefined
  /**
    * If true, the slider represents an alpha slider and will display a gray checkered pattern
    * in the background. Otherwise, the slider represents a hue slider.
    * @defaultvalue false
    */
  var isAlpha: js.UndefOr[Boolean] = js.undefined
  /**
    * Maximum value of the slider.
    */
  var maxValue: js.UndefOr[Double] = js.undefined
  /**
    * Minimum value of the slider.
    */
  var minValue: js.UndefOr[Double] = js.undefined
  /**
    * Callback issued when the value changes.
    */
  var onChange: js.UndefOr[
    js.Function2[
      /* event */ ReactMouseEventFrom[Element] | ReactKeyboardEventFrom[Element], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.undefined
  /**
    * Hex color to use when rendering an alpha slider's overlay.
    */
  var overlayColor: js.UndefOr[String] = js.undefined
  /**
    * Custom style for the overlay element.
    * @deprecated Use `overlayColor` instead
    */
  var overlayStyle: js.UndefOr[CSSProperties] = js.undefined
  /**
    * Call to provide customized styling that will layer on top of the variant rules.
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IColorSliderStyleProps, IColorSliderStyles]] = js.undefined
  /**
    * Theme (provided through customization).
    */
  var theme: js.UndefOr[ITheme] = js.undefined
  /**
    * CSS-compatible string for the color of the thumb element.
    * @deprecated Not used. Use `styles.sliderThumb` instead.
    */
  var thumbColor: js.UndefOr[String] = js.undefined
  /**
    * Current value of the slider.
    */
  var value: js.UndefOr[Double] = js.undefined
}

object IColorSliderProps {
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
  ): IColorSliderProps = {
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
    __obj.asInstanceOf[IColorSliderProps]
  }
}

