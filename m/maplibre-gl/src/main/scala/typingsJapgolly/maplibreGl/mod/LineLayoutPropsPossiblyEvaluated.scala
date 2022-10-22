package typingsJapgolly.maplibreGl.mod

import typingsJapgolly.maplibreGl.maplibreGlStrings.bevel
import typingsJapgolly.maplibreGl.maplibreGlStrings.butt
import typingsJapgolly.maplibreGl.maplibreGlStrings.miter
import typingsJapgolly.maplibreGl.maplibreGlStrings.round
import typingsJapgolly.maplibreGl.maplibreGlStrings.square
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineLayoutPropsPossiblyEvaluated extends StObject {
  
  var `line-cap`: butt | round | square
  
  var `line-join`: PossiblyEvaluatedPropertyValue[bevel | round | miter]
  
  var `line-miter-limit`: Double
  
  var `line-round-limit`: Double
  
  var `line-sort-key`: PossiblyEvaluatedPropertyValue[Double]
}
object LineLayoutPropsPossiblyEvaluated {
  
  inline def apply(
    `line-cap`: butt | round | square,
    `line-join`: PossiblyEvaluatedPropertyValue[bevel | round | miter],
    `line-miter-limit`: Double,
    `line-round-limit`: Double,
    `line-sort-key`: PossiblyEvaluatedPropertyValue[Double]
  ): LineLayoutPropsPossiblyEvaluated = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("line-cap")(`line-cap`.asInstanceOf[js.Any])
    __obj.updateDynamic("line-join")(`line-join`.asInstanceOf[js.Any])
    __obj.updateDynamic("line-miter-limit")(`line-miter-limit`.asInstanceOf[js.Any])
    __obj.updateDynamic("line-round-limit")(`line-round-limit`.asInstanceOf[js.Any])
    __obj.updateDynamic("line-sort-key")(`line-sort-key`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineLayoutPropsPossiblyEvaluated]
  }
  
  extension [Self <: LineLayoutPropsPossiblyEvaluated](x: Self) {
    
    inline def `setLine-cap`(value: butt | round | square): Self = StObject.set(x, "line-cap", value.asInstanceOf[js.Any])
    
    inline def `setLine-join`(value: PossiblyEvaluatedPropertyValue[bevel | round | miter]): Self = StObject.set(x, "line-join", value.asInstanceOf[js.Any])
    
    inline def `setLine-miter-limit`(value: Double): Self = StObject.set(x, "line-miter-limit", value.asInstanceOf[js.Any])
    
    inline def `setLine-round-limit`(value: Double): Self = StObject.set(x, "line-round-limit", value.asInstanceOf[js.Any])
    
    inline def `setLine-sort-key`(value: PossiblyEvaluatedPropertyValue[Double]): Self = StObject.set(x, "line-sort-key", value.asInstanceOf[js.Any])
  }
}
