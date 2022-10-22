package typingsJapgolly.nivoHeatmap.distTypesTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TooltipProps[Datum /* <: HeatMapDatum */] extends StObject {
  
  var cell: ComputedCell[Datum]
}
object TooltipProps {
  
  inline def apply[Datum /* <: HeatMapDatum */](cell: ComputedCell[Datum]): TooltipProps[Datum] = {
    val __obj = js.Dynamic.literal(cell = cell.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipProps[Datum]]
  }
  
  extension [Self <: TooltipProps[?], Datum /* <: HeatMapDatum */](x: Self & TooltipProps[Datum]) {
    
    inline def setCell(value: ComputedCell[Datum]): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
  }
}
