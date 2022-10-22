package typingsJapgolly.nivoPie

import japgolly.scalajs.react.Callback
import typingsJapgolly.nivoLegends.distTypesTypesMod.LegendProps
import typingsJapgolly.nivoPie.distTypesTypesMod.ComputedDatum
import typingsJapgolly.nivoPie.distTypesTypesMod.DatumId
import typingsJapgolly.nivoPie.nivoPieStrings.arc
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPieLegendsMod {
  
  @JSImport("@nivo/pie/dist/types/PieLegends", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[RawDatum](hasWidthHeightLegendsDataToggleSerie: PieLegendsProps[RawDatum]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasWidthHeightLegendsDataToggleSerie.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait PieLegendsProps[RawDatum] extends StObject {
    
    var data: js.Array[Omit[ComputedDatum[RawDatum], arc]]
    
    var height: Double
    
    var legends: js.Array[LegendProps]
    
    def toggleSerie(id: DatumId): Unit
    
    var width: Double
  }
  object PieLegendsProps {
    
    inline def apply[RawDatum](
      data: js.Array[Omit[ComputedDatum[RawDatum], arc]],
      height: Double,
      legends: js.Array[LegendProps],
      toggleSerie: DatumId => Callback,
      width: Double
    ): PieLegendsProps[RawDatum] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], legends = legends.asInstanceOf[js.Any], toggleSerie = js.Any.fromFunction1((t0: DatumId) => toggleSerie(t0).runNow()), width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[PieLegendsProps[RawDatum]]
    }
    
    extension [Self <: PieLegendsProps[?], RawDatum](x: Self & PieLegendsProps[RawDatum]) {
      
      inline def setData(value: js.Array[Omit[ComputedDatum[RawDatum], arc]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: (Omit[ComputedDatum[RawDatum], arc])*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setLegends(value: js.Array[LegendProps]): Self = StObject.set(x, "legends", value.asInstanceOf[js.Any])
      
      inline def setLegendsVarargs(value: LegendProps*): Self = StObject.set(x, "legends", js.Array(value*))
      
      inline def setToggleSerie(value: DatumId => Callback): Self = StObject.set(x, "toggleSerie", js.Any.fromFunction1((t0: DatumId) => value(t0).runNow()))
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
