package typingsJapgolly.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AboveNormal extends StObject {
  
  var aboveNormal: scala.Double
  
  var belowNormal: scala.Double
  
  var high: scala.Double
  
  var low: scala.Double
  
  var normal: scala.Double
}
object AboveNormal {
  
  inline def apply(
    aboveNormal: scala.Double,
    belowNormal: scala.Double,
    high: scala.Double,
    low: scala.Double,
    normal: scala.Double
  ): AboveNormal = {
    val __obj = js.Dynamic.literal(aboveNormal = aboveNormal.asInstanceOf[js.Any], belowNormal = belowNormal.asInstanceOf[js.Any], high = high.asInstanceOf[js.Any], low = low.asInstanceOf[js.Any], normal = normal.asInstanceOf[js.Any])
    __obj.asInstanceOf[AboveNormal]
  }
  
  extension [Self <: AboveNormal](x: Self) {
    
    inline def setAboveNormal(value: scala.Double): Self = StObject.set(x, "aboveNormal", value.asInstanceOf[js.Any])
    
    inline def setBelowNormal(value: scala.Double): Self = StObject.set(x, "belowNormal", value.asInstanceOf[js.Any])
    
    inline def setHigh(value: scala.Double): Self = StObject.set(x, "high", value.asInstanceOf[js.Any])
    
    inline def setLow(value: scala.Double): Self = StObject.set(x, "low", value.asInstanceOf[js.Any])
    
    inline def setNormal(value: scala.Double): Self = StObject.set(x, "normal", value.asInstanceOf[js.Any])
  }
}
