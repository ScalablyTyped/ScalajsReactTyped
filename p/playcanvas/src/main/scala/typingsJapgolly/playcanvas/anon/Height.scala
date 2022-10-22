package typingsJapgolly.playcanvas.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Height extends StObject {
  
  var calculateTangents: js.UndefOr[Boolean] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var heightSegments: js.UndefOr[Double] = js.undefined
  
  var radius: js.UndefOr[Double] = js.undefined
  
  var sides: js.UndefOr[Double] = js.undefined
}
object Height {
  
  inline def apply(): Height = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Height]
  }
  
  extension [Self <: Height](x: Self) {
    
    inline def setCalculateTangents(value: Boolean): Self = StObject.set(x, "calculateTangents", value.asInstanceOf[js.Any])
    
    inline def setCalculateTangentsUndefined: Self = StObject.set(x, "calculateTangents", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightSegments(value: Double): Self = StObject.set(x, "heightSegments", value.asInstanceOf[js.Any])
    
    inline def setHeightSegmentsUndefined: Self = StObject.set(x, "heightSegments", js.undefined)
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    inline def setSides(value: Double): Self = StObject.set(x, "sides", value.asInstanceOf[js.Any])
    
    inline def setSidesUndefined: Self = StObject.set(x, "sides", js.undefined)
  }
}
