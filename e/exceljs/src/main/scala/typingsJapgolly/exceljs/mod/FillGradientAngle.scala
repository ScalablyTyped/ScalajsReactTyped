package typingsJapgolly.exceljs.mod

import typingsJapgolly.exceljs.exceljsStrings.angle
import typingsJapgolly.exceljs.exceljsStrings.gradient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FillGradientAngle
  extends StObject
     with Fill {
  
  /**
  	 * For 'angle' gradient, specifies the direction of the gradient. 0 is from the left to the right.
  	 * Values from 1 - 359 rotates the direction clockwise
  	 */
  var degree: Double
  
  var gradient: angle
  
  /**
  	 * Specifies the gradient colour sequence. Is an array of objects containing position and
  	 * color starting with position 0 and ending with position 1.
  	 * Intermediary positions may be used to specify other colours on the path.
  	 */
  var stops: js.Array[GradientStop]
  
  var `type`: gradient
}
object FillGradientAngle {
  
  inline def apply(degree: Double, stops: js.Array[GradientStop]): FillGradientAngle = {
    val __obj = js.Dynamic.literal(degree = degree.asInstanceOf[js.Any], gradient = "angle", stops = stops.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("gradient")
    __obj.asInstanceOf[FillGradientAngle]
  }
  
  extension [Self <: FillGradientAngle](x: Self) {
    
    inline def setDegree(value: Double): Self = StObject.set(x, "degree", value.asInstanceOf[js.Any])
    
    inline def setGradient(value: angle): Self = StObject.set(x, "gradient", value.asInstanceOf[js.Any])
    
    inline def setStops(value: js.Array[GradientStop]): Self = StObject.set(x, "stops", value.asInstanceOf[js.Any])
    
    inline def setStopsVarargs(value: GradientStop*): Self = StObject.set(x, "stops", js.Array(value*))
    
    inline def setType(value: gradient): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
