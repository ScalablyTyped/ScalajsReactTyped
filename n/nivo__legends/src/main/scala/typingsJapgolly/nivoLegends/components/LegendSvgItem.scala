package typingsJapgolly.nivoLegends.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.SVGRectElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.nivoLegends.distTypesSvgSymbolsTypesMod.SymbolProps
import typingsJapgolly.nivoLegends.distTypesTypesMod.Datum
import typingsJapgolly.nivoLegends.distTypesTypesMod.EffectProps
import typingsJapgolly.nivoLegends.distTypesTypesMod.LegendItemDirection
import typingsJapgolly.nivoLegends.distTypesTypesMod.LegendSvgItemProps
import typingsJapgolly.nivoLegends.distTypesTypesMod.SymbolShape
import typingsJapgolly.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LegendSvgItem {
  
  inline def apply(data: Datum, height: Double, width: Double, x: Double, y: Double): Builder = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[LegendSvgItemProps]))
  }
  
  @JSImport("@nivo/legends", "LegendSvgItem")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def background(value: String): this.type = set("background", value.asInstanceOf[js.Any])
    
    inline def direction(value: LegendItemDirection): this.type = set("direction", value.asInstanceOf[js.Any])
    
    inline def effects(value: js.Array[EffectProps]): this.type = set("effects", value.asInstanceOf[js.Any])
    
    inline def effectsVarargs(value: EffectProps*): this.type = set("effects", js.Array(value*))
    
    inline def justify(value: Boolean): this.type = set("justify", value.asInstanceOf[js.Any])
    
    inline def onClick(value: (/* datum */ Datum, /* event */ ReactMouseEventFrom[SVGRectElement]) => Callback): this.type = set("onClick", js.Any.fromFunction2((t0: /* datum */ Datum, t1: /* event */ ReactMouseEventFrom[SVGRectElement]) => (value(t0, t1)).runNow()))
    
    inline def onMouseEnter(value: (/* datum */ Datum, /* event */ ReactMouseEventFrom[SVGRectElement]) => Callback): this.type = set("onMouseEnter", js.Any.fromFunction2((t0: /* datum */ Datum, t1: /* event */ ReactMouseEventFrom[SVGRectElement]) => (value(t0, t1)).runNow()))
    
    inline def onMouseLeave(value: (/* datum */ Datum, /* event */ ReactMouseEventFrom[SVGRectElement]) => Callback): this.type = set("onMouseLeave", js.Any.fromFunction2((t0: /* datum */ Datum, t1: /* event */ ReactMouseEventFrom[SVGRectElement]) => (value(t0, t1)).runNow()))
    
    inline def opacity(value: Double): this.type = set("opacity", value.asInstanceOf[js.Any])
    
    inline def symbolBorderColor(value: String): this.type = set("symbolBorderColor", value.asInstanceOf[js.Any])
    
    inline def symbolBorderWidth(value: Double): this.type = set("symbolBorderWidth", value.asInstanceOf[js.Any])
    
    inline def symbolShape(value: SymbolShape | FC[SymbolProps]): this.type = set("symbolShape", value.asInstanceOf[js.Any])
    
    inline def symbolSize(value: Double): this.type = set("symbolSize", value.asInstanceOf[js.Any])
    
    inline def symbolSpacing(value: Double): this.type = set("symbolSpacing", value.asInstanceOf[js.Any])
    
    inline def textColor(value: String): this.type = set("textColor", value.asInstanceOf[js.Any])
    
    inline def toggleSerie(value: /* id */ String | Double => Callback): this.type = set("toggleSerie", js.Any.fromFunction1((t0: /* id */ String | Double) => value(t0).runNow()))
  }
  
  def withProps(p: LegendSvgItemProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
