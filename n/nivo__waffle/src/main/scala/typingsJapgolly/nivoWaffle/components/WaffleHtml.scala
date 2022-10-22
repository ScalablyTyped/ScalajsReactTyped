package typingsJapgolly.nivoWaffle.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLCanvasElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.nivoColors.distTypesInheritedColorMod.InheritedColorConfig
import typingsJapgolly.nivoColors.distTypesScalesOrdinalColorScaleMod.OrdinalColorScaleConfig
import typingsJapgolly.nivoCore.mod.Box
import typingsJapgolly.nivoCore.mod.Theme
import typingsJapgolly.nivoWaffle.distTypesCellTooltipMod.TooltipProps
import typingsJapgolly.nivoWaffle.distTypesTypesMod.Cell
import typingsJapgolly.nivoWaffle.distTypesTypesMod.Datum
import typingsJapgolly.nivoWaffle.distTypesTypesMod.DatumFormattedValue
import typingsJapgolly.nivoWaffle.distTypesTypesMod.FillDirection
import typingsJapgolly.nivoWaffle.distTypesTypesMod.HtmlLayer
import typingsJapgolly.nivoWaffle.distTypesTypesMod.HtmlProps
import typingsJapgolly.nivoWaffle.distTypesTypesMod.ValueFormatter
import typingsJapgolly.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WaffleHtml {
  
  inline def apply[RawDatum /* <: Datum */](
    columns: Double,
    data: js.Array[RawDatum],
    height: Double,
    rows: Double,
    total: Double,
    width: Double
  ): Builder[RawDatum] = {
    val __props = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    new Builder[RawDatum](js.Array(this.component, __props.asInstanceOf[HtmlProps[RawDatum]]))
  }
  
  @JSImport("@nivo/waffle/dist/types", "WaffleHtml")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[RawDatum /* <: Datum */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def animate(value: Boolean): this.type = set("animate", value.asInstanceOf[js.Any])
    
    inline def borderColor(value: InheritedColorConfig[Cell[RawDatum]]): this.type = set("borderColor", value.asInstanceOf[js.Any])
    
    inline def borderWidth(value: Double): this.type = set("borderWidth", value.asInstanceOf[js.Any])
    
    inline def colors(value: OrdinalColorScaleConfig[RawDatum]): this.type = set("colors", value.asInstanceOf[js.Any])
    
    inline def colorsFunction1(value: RawDatum => String): this.type = set("colors", js.Any.fromFunction1(value))
    
    inline def colorsVarargs(value: String*): this.type = set("colors", js.Array(value*))
    
    inline def emptyColor(value: String): this.type = set("emptyColor", value.asInstanceOf[js.Any])
    
    inline def emptyOpacity(value: Double): this.type = set("emptyOpacity", value.asInstanceOf[js.Any])
    
    inline def fillDirection(value: FillDirection): this.type = set("fillDirection", value.asInstanceOf[js.Any])
    
    inline def isInteractive(value: Boolean): this.type = set("isInteractive", value.asInstanceOf[js.Any])
    
    inline def layers(value: js.Array[HtmlLayer[RawDatum]]): this.type = set("layers", value.asInstanceOf[js.Any])
    
    inline def layersVarargs(value: HtmlLayer[RawDatum]*): this.type = set("layers", js.Array(value*))
    
    inline def margin(value: Box): this.type = set("margin", value.asInstanceOf[js.Any])
    
    inline def motionConfig(
      value: String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringConfig */ Any)
    ): this.type = set("motionConfig", value.asInstanceOf[js.Any])
    
    inline def onClick(
      value: (/* cell */ Cell[RawDatum], /* event */ ReactMouseEventFrom[HTMLCanvasElement & Element]) => Callback
    ): this.type = set("onClick", js.Any.fromFunction2((t0: /* cell */ Cell[RawDatum], t1: /* event */ ReactMouseEventFrom[HTMLCanvasElement & Element]) => (value(t0, t1)).runNow()))
    
    inline def onMouseEnter(
      value: (/* cell */ Cell[RawDatum], /* event */ ReactMouseEventFrom[HTMLCanvasElement & Element]) => Callback
    ): this.type = set("onMouseEnter", js.Any.fromFunction2((t0: /* cell */ Cell[RawDatum], t1: /* event */ ReactMouseEventFrom[HTMLCanvasElement & Element]) => (value(t0, t1)).runNow()))
    
    inline def onMouseLeave(
      value: (/* cell */ Cell[RawDatum], /* event */ ReactMouseEventFrom[HTMLCanvasElement & Element]) => Callback
    ): this.type = set("onMouseLeave", js.Any.fromFunction2((t0: /* cell */ Cell[RawDatum], t1: /* event */ ReactMouseEventFrom[HTMLCanvasElement & Element]) => (value(t0, t1)).runNow()))
    
    inline def onMouseMove(
      value: (/* cell */ Cell[RawDatum], /* event */ ReactMouseEventFrom[HTMLCanvasElement & Element]) => Callback
    ): this.type = set("onMouseMove", js.Any.fromFunction2((t0: /* cell */ Cell[RawDatum], t1: /* event */ ReactMouseEventFrom[HTMLCanvasElement & Element]) => (value(t0, t1)).runNow()))
    
    inline def padding(value: Double): this.type = set("padding", value.asInstanceOf[js.Any])
    
    inline def role(value: String): this.type = set("role", value.asInstanceOf[js.Any])
    
    inline def theme(value: Theme): this.type = set("theme", value.asInstanceOf[js.Any])
    
    inline def tooltip(value: FC[TooltipProps[RawDatum]]): this.type = set("tooltip", value.asInstanceOf[js.Any])
    
    inline def valueFormat(value: String | ValueFormatter): this.type = set("valueFormat", value.asInstanceOf[js.Any])
    
    inline def valueFormatFunction1(value: /* value */ Double => DatumFormattedValue): this.type = set("valueFormat", js.Any.fromFunction1(value))
  }
  
  def withProps[RawDatum /* <: Datum */](p: HtmlProps[RawDatum]): Builder[RawDatum] = new Builder[RawDatum](js.Array(this.component, p.asInstanceOf[js.Any]))
}
