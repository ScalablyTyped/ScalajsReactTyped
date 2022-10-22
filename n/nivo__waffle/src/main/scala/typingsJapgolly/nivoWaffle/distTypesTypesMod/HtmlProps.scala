package typingsJapgolly.nivoWaffle.distTypesTypesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLCanvasElement
import typingsJapgolly.nivoColors.distTypesInheritedColorMod.InheritedColorConfig
import typingsJapgolly.nivoColors.distTypesScalesOrdinalColorScaleMod.OrdinalColorScaleConfig
import typingsJapgolly.nivoCore.mod.Box
import typingsJapgolly.nivoCore.mod.Theme
import typingsJapgolly.nivoWaffle.distTypesCellTooltipMod.TooltipProps
import typingsJapgolly.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @nivo/waffle.@nivo/waffle/dist/types/types.DataProps<RawDatum> & @nivo/core.@nivo/core.Dimensions & std.Partial<@nivo/waffle.@nivo/waffle/dist/types/types.CommonProps<RawDatum>> & {  layers :std.Array<@nivo/waffle.@nivo/waffle/dist/types/types.HtmlLayer<RawDatum>> | undefined} & @nivo/core.@nivo/core.ModernMotionProps & @nivo/waffle.@nivo/waffle/dist/types/types.MouseHandlers<RawDatum, std.HTMLCanvasElement> */
trait HtmlProps[RawDatum /* <: Datum */] extends StObject {
  
  var animate: js.UndefOr[Boolean] = js.undefined
  
  var borderColor: js.UndefOr[InheritedColorConfig[Cell[RawDatum]]] = js.undefined
  
  var borderWidth: js.UndefOr[Double] = js.undefined
  
  var colors: js.UndefOr[OrdinalColorScaleConfig[RawDatum]] = js.undefined
  
  var columns: Double
  
  var data: js.Array[RawDatum]
  
  var emptyColor: js.UndefOr[String] = js.undefined
  
  var emptyOpacity: js.UndefOr[Double] = js.undefined
  
  var fillDirection: js.UndefOr[FillDirection] = js.undefined
  
  var height: Double
  
  var isInteractive: js.UndefOr[Boolean] = js.undefined
  
  var layers: js.UndefOr[js.Array[HtmlLayer[RawDatum]]] = js.undefined
  
  var margin: js.UndefOr[Box] = js.undefined
  
  var motionConfig: js.UndefOr[
    String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringConfig */ Any)
  ] = js.undefined
  
  var onClick: js.UndefOr[MouseHandler[RawDatum, HTMLCanvasElement]] = js.undefined
  
  var onMouseEnter: js.UndefOr[MouseHandler[RawDatum, HTMLCanvasElement]] = js.undefined
  
  var onMouseLeave: js.UndefOr[MouseHandler[RawDatum, HTMLCanvasElement]] = js.undefined
  
  var onMouseMove: js.UndefOr[MouseHandler[RawDatum, HTMLCanvasElement]] = js.undefined
  
  var padding: js.UndefOr[Double] = js.undefined
  
  var role: js.UndefOr[String] = js.undefined
  
  var rows: Double
  
  var theme: js.UndefOr[Theme] = js.undefined
  
  var tooltip: js.UndefOr[FC[TooltipProps[RawDatum]]] = js.undefined
  
  var total: Double
  
  var valueFormat: js.UndefOr[String | ValueFormatter] = js.undefined
  
  var width: Double
}
object HtmlProps {
  
  inline def apply[RawDatum /* <: Datum */](
    columns: Double,
    data: js.Array[RawDatum],
    height: Double,
    rows: Double,
    total: Double,
    width: Double
  ): HtmlProps[RawDatum] = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[HtmlProps[RawDatum]]
  }
  
  extension [Self <: HtmlProps[?], RawDatum /* <: Datum */](x: Self & HtmlProps[RawDatum]) {
    
    inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
    
    inline def setBorderColor(value: InheritedColorConfig[Cell[RawDatum]]): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    inline def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    inline def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
    
    inline def setColors(value: OrdinalColorScaleConfig[RawDatum]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsFunction1(value: RawDatum => String): Self = StObject.set(x, "colors", js.Any.fromFunction1(value))
    
    inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    inline def setColorsVarargs(value: String*): Self = StObject.set(x, "colors", js.Array(value*))
    
    inline def setColumns(value: Double): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setData(value: js.Array[RawDatum]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: RawDatum*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setEmptyColor(value: String): Self = StObject.set(x, "emptyColor", value.asInstanceOf[js.Any])
    
    inline def setEmptyColorUndefined: Self = StObject.set(x, "emptyColor", js.undefined)
    
    inline def setEmptyOpacity(value: Double): Self = StObject.set(x, "emptyOpacity", value.asInstanceOf[js.Any])
    
    inline def setEmptyOpacityUndefined: Self = StObject.set(x, "emptyOpacity", js.undefined)
    
    inline def setFillDirection(value: FillDirection): Self = StObject.set(x, "fillDirection", value.asInstanceOf[js.Any])
    
    inline def setFillDirectionUndefined: Self = StObject.set(x, "fillDirection", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setIsInteractive(value: Boolean): Self = StObject.set(x, "isInteractive", value.asInstanceOf[js.Any])
    
    inline def setIsInteractiveUndefined: Self = StObject.set(x, "isInteractive", js.undefined)
    
    inline def setLayers(value: js.Array[HtmlLayer[RawDatum]]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
    
    inline def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
    
    inline def setLayersVarargs(value: HtmlLayer[RawDatum]*): Self = StObject.set(x, "layers", js.Array(value*))
    
    inline def setMargin(value: Box): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    inline def setMotionConfig(
      value: String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringConfig */ Any)
    ): Self = StObject.set(x, "motionConfig", value.asInstanceOf[js.Any])
    
    inline def setMotionConfigUndefined: Self = StObject.set(x, "motionConfig", js.undefined)
    
    inline def setOnClick(
      value: (/* cell */ Cell[RawDatum], /* event */ ReactMouseEventFrom[HTMLCanvasElement & Element]) => Callback
    ): Self = StObject.set(x, "onClick", js.Any.fromFunction2((t0: /* cell */ Cell[RawDatum], t1: /* event */ ReactMouseEventFrom[HTMLCanvasElement & Element]) => (value(t0, t1)).runNow()))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setOnMouseEnter(
      value: (/* cell */ Cell[RawDatum], /* event */ ReactMouseEventFrom[HTMLCanvasElement & Element]) => Callback
    ): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction2((t0: /* cell */ Cell[RawDatum], t1: /* event */ ReactMouseEventFrom[HTMLCanvasElement & Element]) => (value(t0, t1)).runNow()))
    
    inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
    
    inline def setOnMouseLeave(
      value: (/* cell */ Cell[RawDatum], /* event */ ReactMouseEventFrom[HTMLCanvasElement & Element]) => Callback
    ): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction2((t0: /* cell */ Cell[RawDatum], t1: /* event */ ReactMouseEventFrom[HTMLCanvasElement & Element]) => (value(t0, t1)).runNow()))
    
    inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
    
    inline def setOnMouseMove(
      value: (/* cell */ Cell[RawDatum], /* event */ ReactMouseEventFrom[HTMLCanvasElement & Element]) => Callback
    ): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction2((t0: /* cell */ Cell[RawDatum], t1: /* event */ ReactMouseEventFrom[HTMLCanvasElement & Element]) => (value(t0, t1)).runNow()))
    
    inline def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
    
    inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setTooltip(value: FC[TooltipProps[RawDatum]]): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    inline def setValueFormat(value: String | ValueFormatter): Self = StObject.set(x, "valueFormat", value.asInstanceOf[js.Any])
    
    inline def setValueFormatFunction1(value: /* value */ Double => DatumFormattedValue): Self = StObject.set(x, "valueFormat", js.Any.fromFunction1(value))
    
    inline def setValueFormatUndefined: Self = StObject.set(x, "valueFormat", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
