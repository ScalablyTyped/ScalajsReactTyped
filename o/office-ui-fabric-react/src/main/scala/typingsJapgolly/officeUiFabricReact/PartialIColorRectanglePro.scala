package typingsJapgolly.officeUiFabricReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.raw.Element
import typingsJapgolly.officeUiFabricReact.colorRectangleTypesMod.IColorRectangle
import typingsJapgolly.officeUiFabricReact.colorRectangleTypesMod.IColorRectangleStyleProps
import typingsJapgolly.officeUiFabricReact.colorRectangleTypesMod.IColorRectangleStyles
import typingsJapgolly.officeUiFabricReact.interfacesMod.IColor
import typingsJapgolly.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsJapgolly.uifabricStyling.ithemeMod.ITheme
import typingsJapgolly.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<office-ui-fabric-react.office-ui-fabric-react/lib/components/ColorPicker/ColorRectangle/ColorRectangle.types.IColorRectangleProps> */
trait PartialIColorRectanglePro extends js.Object {
  var ariaDescription: js.UndefOr[String] = js.undefined
  var ariaLabel: js.UndefOr[String] = js.undefined
  var ariaValueFormat: js.UndefOr[String] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var color: js.UndefOr[IColor] = js.undefined
  var componentRef: js.UndefOr[IRefObject[IColorRectangle]] = js.undefined
  var minSize: js.UndefOr[Double] = js.undefined
  var onChange: js.UndefOr[
    js.Function2[
      /* ev */ ReactMouseEventFrom[Element] | ReactKeyboardEventFrom[Element], 
      /* color */ IColor, 
      Unit
    ]
  ] = js.undefined
  var styles: js.UndefOr[IStyleFunctionOrObject[IColorRectangleStyleProps, IColorRectangleStyles]] = js.undefined
  var theme: js.UndefOr[ITheme] = js.undefined
}

object PartialIColorRectanglePro {
  @scala.inline
  def apply(
    ariaDescription: String = null,
    ariaLabel: String = null,
    ariaValueFormat: String = null,
    className: String = null,
    color: IColor = null,
    componentRef: IRefObject[IColorRectangle] = null,
    minSize: Int | Double = null,
    onChange: (/* ev */ ReactMouseEventFrom[Element] | ReactKeyboardEventFrom[Element], /* color */ IColor) => Callback = null,
    styles: IStyleFunctionOrObject[IColorRectangleStyleProps, IColorRectangleStyles] = null,
    theme: ITheme = null
  ): PartialIColorRectanglePro = {
    val __obj = js.Dynamic.literal()
    if (ariaDescription != null) __obj.updateDynamic("ariaDescription")(ariaDescription.asInstanceOf[js.Any])
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel.asInstanceOf[js.Any])
    if (ariaValueFormat != null) __obj.updateDynamic("ariaValueFormat")(ariaValueFormat.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (minSize != null) __obj.updateDynamic("minSize")(minSize.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2((t0: /* ev */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.Element] | japgolly.scalajs.react.ReactKeyboardEventFrom[org.scalajs.dom.raw.Element], t1: /* color */ typingsJapgolly.officeUiFabricReact.interfacesMod.IColor) => onChange(t0, t1).runNow()))
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialIColorRectanglePro]
  }
}

