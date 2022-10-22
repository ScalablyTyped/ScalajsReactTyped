package typingsJapgolly.officeUiFabricReact.anon

import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.HTMLButtonElement
import typingsJapgolly.fluentuiTheme.libTypesIthemeMod.ITheme
import typingsJapgolly.officeUiFabricReact.libComponentsSwatchColorPickerColorPickerGridCellDottypesMod.IColorCellProps
import typingsJapgolly.officeUiFabricReact.libComponentsSwatchColorPickerColorPickerGridCellDottypesMod.IColorPickerGridCellStyleProps
import typingsJapgolly.officeUiFabricReact.libComponentsSwatchColorPickerColorPickerGridCellDottypesMod.IColorPickerGridCellStyles
import typingsJapgolly.uifabricMergeStyles.libDeepPartialMod.DeepPartial
import typingsJapgolly.uifabricMergeStyles.libIstylefunctionMod.IStyleFunctionOrObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<office-ui-fabric-react.office-ui-fabric-react/lib/components/SwatchColorPicker/ColorPickerGridCell.types.IColorPickerGridCellProps> */
trait PartialIColorPickerGridCe extends StObject {
  
  var borderWidth: js.UndefOr[Double] = js.undefined
  
  var circle: js.UndefOr[Boolean] = js.undefined
  
  var color: js.UndefOr[String] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var idPrefix: js.UndefOr[String] = js.undefined
  
  var index: js.UndefOr[Double] = js.undefined
  
  var item: js.UndefOr[IColorCellProps] = js.undefined
  
  var label: js.UndefOr[String] = js.undefined
  
  var onClick: js.UndefOr[js.Function1[/* item */ IColorCellProps, scala.Unit]] = js.undefined
  
  var onFocus: js.UndefOr[js.Function1[/* item */ IColorCellProps, scala.Unit]] = js.undefined
  
  var onHover: js.UndefOr[js.Function1[/* item */ js.UndefOr[IColorCellProps], scala.Unit]] = js.undefined
  
  var onKeyDown: js.UndefOr[js.Function1[/* ev */ ReactKeyboardEventFrom[HTMLButtonElement], scala.Unit]] = js.undefined
  
  var onMouseEnter: js.UndefOr[js.Function1[/* ev */ ReactMouseEventFrom[HTMLButtonElement], Boolean]] = js.undefined
  
  var onMouseLeave: js.UndefOr[js.Function1[/* ev */ ReactMouseEventFrom[HTMLButtonElement], scala.Unit]] = js.undefined
  
  var onMouseMove: js.UndefOr[js.Function1[/* ev */ ReactMouseEventFrom[HTMLButtonElement], Boolean]] = js.undefined
  
  var onWheel: js.UndefOr[js.Function1[/* ev */ ReactMouseEventFrom[HTMLButtonElement], scala.Unit]] = js.undefined
  
  var selected: js.UndefOr[Boolean] = js.undefined
  
  var styles: js.UndefOr[
    IStyleFunctionOrObject[IColorPickerGridCellStyleProps, IColorPickerGridCellStyles]
  ] = js.undefined
  
  var theme: js.UndefOr[ITheme] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object PartialIColorPickerGridCe {
  
  inline def apply(): PartialIColorPickerGridCe = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIColorPickerGridCe]
  }
  
  extension [Self <: PartialIColorPickerGridCe](x: Self) {
    
    inline def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    inline def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
    
    inline def setCircle(value: Boolean): Self = StObject.set(x, "circle", value.asInstanceOf[js.Any])
    
    inline def setCircleUndefined: Self = StObject.set(x, "circle", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdPrefix(value: String): Self = StObject.set(x, "idPrefix", value.asInstanceOf[js.Any])
    
    inline def setIdPrefixUndefined: Self = StObject.set(x, "idPrefix", js.undefined)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setItem(value: IColorCellProps): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setOnClick(value: /* item */ IColorCellProps => japgolly.scalajs.react.Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: /* item */ IColorCellProps) => value(t0).runNow()))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setOnFocus(value: /* item */ IColorCellProps => japgolly.scalajs.react.Callback): Self = StObject.set(x, "onFocus", js.Any.fromFunction1((t0: /* item */ IColorCellProps) => value(t0).runNow()))
    
    inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    
    inline def setOnHover(value: /* item */ js.UndefOr[IColorCellProps] => japgolly.scalajs.react.Callback): Self = StObject.set(x, "onHover", js.Any.fromFunction1((t0: /* item */ js.UndefOr[IColorCellProps]) => value(t0).runNow()))
    
    inline def setOnHoverUndefined: Self = StObject.set(x, "onHover", js.undefined)
    
    inline def setOnKeyDown(value: /* ev */ ReactKeyboardEventFrom[HTMLButtonElement] => japgolly.scalajs.react.Callback): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1((t0: /* ev */ ReactKeyboardEventFrom[HTMLButtonElement]) => value(t0).runNow()))
    
    inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
    
    inline def setOnMouseEnter(value: /* ev */ ReactMouseEventFrom[HTMLButtonElement] => Boolean): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
    
    inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
    
    inline def setOnMouseLeave(value: /* ev */ ReactMouseEventFrom[HTMLButtonElement] => japgolly.scalajs.react.Callback): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1((t0: /* ev */ ReactMouseEventFrom[HTMLButtonElement]) => value(t0).runNow()))
    
    inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
    
    inline def setOnMouseMove(value: /* ev */ ReactMouseEventFrom[HTMLButtonElement] => Boolean): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1(value))
    
    inline def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
    
    inline def setOnWheel(value: /* ev */ ReactMouseEventFrom[HTMLButtonElement] => japgolly.scalajs.react.Callback): Self = StObject.set(x, "onWheel", js.Any.fromFunction1((t0: /* ev */ ReactMouseEventFrom[HTMLButtonElement]) => value(t0).runNow()))
    
    inline def setOnWheelUndefined: Self = StObject.set(x, "onWheel", js.undefined)
    
    inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    inline def setStyles(value: IStyleFunctionOrObject[IColorPickerGridCellStyleProps, IColorPickerGridCellStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesFunction1(value: IColorPickerGridCellStyleProps => DeepPartial[IColorPickerGridCellStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
    
    inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    
    inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
