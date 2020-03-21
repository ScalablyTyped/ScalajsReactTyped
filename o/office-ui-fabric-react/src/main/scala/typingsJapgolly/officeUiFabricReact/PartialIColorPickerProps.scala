package typingsJapgolly.officeUiFabricReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.officeUiFabricReact.colorPickerTypesMod.IColorPicker
import typingsJapgolly.officeUiFabricReact.colorPickerTypesMod.IColorPickerStrings
import typingsJapgolly.officeUiFabricReact.colorPickerTypesMod.IColorPickerStyleProps
import typingsJapgolly.officeUiFabricReact.colorPickerTypesMod.IColorPickerStyles
import typingsJapgolly.officeUiFabricReact.interfacesMod.IColor
import typingsJapgolly.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsJapgolly.uifabricStyling.ithemeMod.ITheme
import typingsJapgolly.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<office-ui-fabric-react.office-ui-fabric-react/lib/components/ColorPicker/ColorPicker.types.IColorPickerProps> */
trait PartialIColorPickerProps extends js.Object {
  var alphaLabel: js.UndefOr[String] = js.undefined
  var alphaSliderHidden: js.UndefOr[Boolean] = js.undefined
  var blueLabel: js.UndefOr[String] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var color: js.UndefOr[IColor | String] = js.undefined
  var componentRef: js.UndefOr[IRefObject[IColorPicker]] = js.undefined
  var greenLabel: js.UndefOr[String] = js.undefined
  var hexLabel: js.UndefOr[String] = js.undefined
  var onChange: js.UndefOr[js.Function2[/* ev */ ReactEventFrom[HTMLElement], /* color */ IColor, Unit]] = js.undefined
  var redLabel: js.UndefOr[String] = js.undefined
  var showPreview: js.UndefOr[Boolean] = js.undefined
  var strings: js.UndefOr[IColorPickerStrings] = js.undefined
  var styles: js.UndefOr[IStyleFunctionOrObject[IColorPickerStyleProps, IColorPickerStyles]] = js.undefined
  var theme: js.UndefOr[ITheme] = js.undefined
}

object PartialIColorPickerProps {
  @scala.inline
  def apply(
    alphaLabel: String = null,
    alphaSliderHidden: js.UndefOr[Boolean] = js.undefined,
    blueLabel: String = null,
    className: String = null,
    color: IColor | String = null,
    componentRef: IRefObject[IColorPicker] = null,
    greenLabel: String = null,
    hexLabel: String = null,
    onChange: (/* ev */ ReactEventFrom[HTMLElement], /* color */ IColor) => Callback = null,
    redLabel: String = null,
    showPreview: js.UndefOr[Boolean] = js.undefined,
    strings: IColorPickerStrings = null,
    styles: IStyleFunctionOrObject[IColorPickerStyleProps, IColorPickerStyles] = null,
    theme: ITheme = null
  ): PartialIColorPickerProps = {
    val __obj = js.Dynamic.literal()
    if (alphaLabel != null) __obj.updateDynamic("alphaLabel")(alphaLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(alphaSliderHidden)) __obj.updateDynamic("alphaSliderHidden")(alphaSliderHidden.asInstanceOf[js.Any])
    if (blueLabel != null) __obj.updateDynamic("blueLabel")(blueLabel.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (greenLabel != null) __obj.updateDynamic("greenLabel")(greenLabel.asInstanceOf[js.Any])
    if (hexLabel != null) __obj.updateDynamic("hexLabel")(hexLabel.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2((t0: /* ev */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLElement], t1: /* color */ typingsJapgolly.officeUiFabricReact.interfacesMod.IColor) => onChange(t0, t1).runNow()))
    if (redLabel != null) __obj.updateDynamic("redLabel")(redLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(showPreview)) __obj.updateDynamic("showPreview")(showPreview.asInstanceOf[js.Any])
    if (strings != null) __obj.updateDynamic("strings")(strings.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialIColorPickerProps]
  }
}

