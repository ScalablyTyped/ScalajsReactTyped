package typingsJapgolly.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RadialGradientColorObject extends StObject {
  
  /**
    * Center horizontal position relative to the shape. Float ranges 0-1.
    */
  var cx: Double
  
  /**
    * Center vertical position relative to the shape. Float ranges 0-1.
    */
  var cy: Double
  
  /**
    * Radius relative to the shape. Float ranges 0-1.
    */
  var r: Double
}
object RadialGradientColorObject {
  
  inline def apply(cx: Double, cy: Double, r: Double): RadialGradientColorObject = {
    val __obj = js.Dynamic.literal(cx = cx.asInstanceOf[js.Any], cy = cy.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadialGradientColorObject]
  }
  
  extension [Self <: RadialGradientColorObject](x: Self) {
    
    inline def setCx(value: Double): Self = StObject.set(x, "cx", value.asInstanceOf[js.Any])
    
    inline def setCy(value: Double): Self = StObject.set(x, "cy", value.asInstanceOf[js.Any])
    
    inline def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
