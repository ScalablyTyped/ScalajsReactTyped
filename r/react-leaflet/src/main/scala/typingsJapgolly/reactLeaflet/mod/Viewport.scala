package typingsJapgolly.reactLeaflet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Viewport extends StObject {
  
  var center: js.UndefOr[(js.Tuple2[Double, Double]) | Null] = js.undefined
  
  var zoom: js.UndefOr[Double | Null] = js.undefined
}
object Viewport {
  
  inline def apply(): Viewport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Viewport]
  }
  
  extension [Self <: Viewport](x: Self) {
    
    inline def setCenter(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setCenterNull: Self = StObject.set(x, "center", null)
    
    inline def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
    
    inline def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    
    inline def setZoomNull: Self = StObject.set(x, "zoom", null)
    
    inline def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
  }
}
