package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.fluentuiTheme.libTypesIthemeMod.ITheme
import typingsJapgolly.officeUiFabricReact.libComponentsSwatchColorPickerColorPickerGridCellDottypesMod.IColorCellProps
import typingsJapgolly.officeUiFabricReact.libComponentsSwatchColorPickerColorPickerGridCellDottypesMod.IColorPickerGridCellStyleProps
import typingsJapgolly.officeUiFabricReact.libComponentsSwatchColorPickerColorPickerGridCellDottypesMod.IColorPickerGridCellStyles
import typingsJapgolly.officeUiFabricReact.libComponentsSwatchColorPickerSwatchColorPickerDottypesMod.ISwatchColorPickerProps
import typingsJapgolly.officeUiFabricReact.libComponentsSwatchColorPickerSwatchColorPickerDottypesMod.ISwatchColorPickerStyleProps
import typingsJapgolly.officeUiFabricReact.libComponentsSwatchColorPickerSwatchColorPickerDottypesMod.ISwatchColorPickerStyles
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.circle
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.square
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.uifabricMergeStyles.libDeepPartialMod.DeepPartial
import typingsJapgolly.uifabricMergeStyles.libIstylefunctionMod.IStyleFunctionOrObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SwatchColorPickerBase {
  
  inline def apply(colorCells: js.Array[IColorCellProps], columnCount: Double): Builder = {
    val __props = js.Dynamic.literal(colorCells = colorCells.asInstanceOf[js.Any], columnCount = columnCount.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ISwatchColorPickerProps]))
  }
  
  @JSImport("office-ui-fabric-react", "SwatchColorPickerBase")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.officeUiFabricReact.mod.SwatchColorPickerBase] {
    
    inline def ariaPosInSet(value: Double): this.type = set("ariaPosInSet", value.asInstanceOf[js.Any])
    
    inline def ariaSetSize(value: Double): this.type = set("ariaSetSize", value.asInstanceOf[js.Any])
    
    inline def cellBorderWidth(value: Double): this.type = set("cellBorderWidth", value.asInstanceOf[js.Any])
    
    inline def cellHeight(value: Double): this.type = set("cellHeight", value.asInstanceOf[js.Any])
    
    inline def cellMargin(value: Double): this.type = set("cellMargin", value.asInstanceOf[js.Any])
    
    inline def cellShape(value: circle | square): this.type = set("cellShape", value.asInstanceOf[js.Any])
    
    inline def cellWidth(value: Double): this.type = set("cellWidth", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def doNotContainWithinFocusZone(value: Boolean): this.type = set("doNotContainWithinFocusZone", value.asInstanceOf[js.Any])
    
    inline def focusOnHover(value: Boolean): this.type = set("focusOnHover", value.asInstanceOf[js.Any])
    
    inline def getColorGridCellStyles(value: IStyleFunctionOrObject[IColorPickerGridCellStyleProps, IColorPickerGridCellStyles]): this.type = set("getColorGridCellStyles", value.asInstanceOf[js.Any])
    
    inline def getColorGridCellStylesFunction1(value: IColorPickerGridCellStyleProps => DeepPartial[IColorPickerGridCellStyles]): this.type = set("getColorGridCellStyles", js.Any.fromFunction1(value))
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def isControlled(value: Boolean): this.type = set("isControlled", value.asInstanceOf[js.Any])
    
    inline def mouseLeaveParentSelector(value: String): this.type = set("mouseLeaveParentSelector", value.asInstanceOf[js.Any])
    
    inline def onCellFocused(value: (/* id */ js.UndefOr[String], /* color */ js.UndefOr[String]) => Callback): this.type = set("onCellFocused", js.Any.fromFunction2((t0: /* id */ js.UndefOr[String], t1: /* color */ js.UndefOr[String]) => (value(t0, t1)).runNow()))
    
    inline def onCellHovered(value: (/* id */ js.UndefOr[String], /* color */ js.UndefOr[String]) => Callback): this.type = set("onCellHovered", js.Any.fromFunction2((t0: /* id */ js.UndefOr[String], t1: /* color */ js.UndefOr[String]) => (value(t0, t1)).runNow()))
    
    inline def onColorChanged(value: (/* id */ js.UndefOr[String], /* color */ js.UndefOr[String]) => Callback): this.type = set("onColorChanged", js.Any.fromFunction2((t0: /* id */ js.UndefOr[String], t1: /* color */ js.UndefOr[String]) => (value(t0, t1)).runNow()))
    
    inline def onRenderColorCell(
      value: (/* props */ js.UndefOr[IColorCellProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IColorCellProps], Element | Null]]) => Element | Null
    ): this.type = set("onRenderColorCell", js.Any.fromFunction2(value))
    
    inline def positionInSet(value: Double): this.type = set("positionInSet", value.asInstanceOf[js.Any])
    
    inline def selectedId(value: String): this.type = set("selectedId", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): this.type = set("setSize", value.asInstanceOf[js.Any])
    
    inline def shouldFocusCircularNavigate(value: Boolean): this.type = set("shouldFocusCircularNavigate", value.asInstanceOf[js.Any])
    
    inline def styles(value: IStyleFunctionOrObject[ISwatchColorPickerStyleProps, ISwatchColorPickerStyles]): this.type = set("styles", value.asInstanceOf[js.Any])
    
    inline def stylesFunction1(value: ISwatchColorPickerStyleProps => DeepPartial[ISwatchColorPickerStyles]): this.type = set("styles", js.Any.fromFunction1(value))
    
    inline def theme(value: ITheme): this.type = set("theme", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ISwatchColorPickerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
