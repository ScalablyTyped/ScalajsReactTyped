package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.HTMLButtonElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.fluentuiTheme.libTypesIthemeMod.ITheme
import typingsJapgolly.officeUiFabricReact.libComponentsSwatchColorPickerColorPickerGridCellDottypesMod.IColorCellProps
import typingsJapgolly.officeUiFabricReact.libComponentsSwatchColorPickerColorPickerGridCellDottypesMod.IColorPickerGridCellProps
import typingsJapgolly.officeUiFabricReact.libComponentsSwatchColorPickerColorPickerGridCellDottypesMod.IColorPickerGridCellStyleProps
import typingsJapgolly.officeUiFabricReact.libComponentsSwatchColorPickerColorPickerGridCellDottypesMod.IColorPickerGridCellStyles
import typingsJapgolly.uifabricMergeStyles.libDeepPartialMod.DeepPartial
import typingsJapgolly.uifabricMergeStyles.libIstylefunctionMod.IStyleFunctionOrObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ColorPickerGridCell {
  
  inline def apply(item: IColorCellProps, selected: Boolean): Builder = {
    val __props = js.Dynamic.literal(item = item.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IColorPickerGridCellProps]))
  }
  
  @JSImport("office-ui-fabric-react", "ColorPickerGridCell")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def borderWidth(value: Double): this.type = set("borderWidth", value.asInstanceOf[js.Any])
    
    inline def circle(value: Boolean): this.type = set("circle", value.asInstanceOf[js.Any])
    
    inline def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def idPrefix(value: String): this.type = set("idPrefix", value.asInstanceOf[js.Any])
    
    inline def index(value: Double): this.type = set("index", value.asInstanceOf[js.Any])
    
    inline def label(value: String): this.type = set("label", value.asInstanceOf[js.Any])
    
    inline def onClick(value: /* item */ IColorCellProps => Callback): this.type = set("onClick", js.Any.fromFunction1((t0: /* item */ IColorCellProps) => value(t0).runNow()))
    
    inline def onFocus(value: /* item */ IColorCellProps => Callback): this.type = set("onFocus", js.Any.fromFunction1((t0: /* item */ IColorCellProps) => value(t0).runNow()))
    
    inline def onHover(value: /* item */ js.UndefOr[IColorCellProps] => Callback): this.type = set("onHover", js.Any.fromFunction1((t0: /* item */ js.UndefOr[IColorCellProps]) => value(t0).runNow()))
    
    inline def onKeyDown(value: /* ev */ ReactKeyboardEventFrom[HTMLButtonElement] => Callback): this.type = set("onKeyDown", js.Any.fromFunction1((t0: /* ev */ ReactKeyboardEventFrom[HTMLButtonElement]) => value(t0).runNow()))
    
    inline def onMouseEnter(value: /* ev */ ReactMouseEventFrom[HTMLButtonElement] => Boolean): this.type = set("onMouseEnter", js.Any.fromFunction1(value))
    
    inline def onMouseLeave(value: /* ev */ ReactMouseEventFrom[HTMLButtonElement] => Callback): this.type = set("onMouseLeave", js.Any.fromFunction1((t0: /* ev */ ReactMouseEventFrom[HTMLButtonElement]) => value(t0).runNow()))
    
    inline def onMouseMove(value: /* ev */ ReactMouseEventFrom[HTMLButtonElement] => Boolean): this.type = set("onMouseMove", js.Any.fromFunction1(value))
    
    inline def onWheel(value: /* ev */ ReactMouseEventFrom[HTMLButtonElement] => Callback): this.type = set("onWheel", js.Any.fromFunction1((t0: /* ev */ ReactMouseEventFrom[HTMLButtonElement]) => value(t0).runNow()))
    
    inline def styles(value: IStyleFunctionOrObject[IColorPickerGridCellStyleProps, IColorPickerGridCellStyles]): this.type = set("styles", value.asInstanceOf[js.Any])
    
    inline def stylesFunction1(value: IColorPickerGridCellStyleProps => DeepPartial[IColorPickerGridCellStyles]): this.type = set("styles", js.Any.fromFunction1(value))
    
    inline def theme(value: ITheme): this.type = set("theme", value.asInstanceOf[js.Any])
    
    inline def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IColorPickerGridCellProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
