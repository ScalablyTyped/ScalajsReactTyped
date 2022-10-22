package typingsJapgolly.plotlyJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<plotly.js.plotly.js.Camera> */
trait PartialCameraCenter extends StObject {
  
  var center: js.UndefOr[PartialPoint] = js.undefined
  
  var eye: js.UndefOr[PartialPoint] = js.undefined
  
  var up: js.UndefOr[PartialPoint] = js.undefined
}
object PartialCameraCenter {
  
  inline def apply(): PartialCameraCenter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCameraCenter]
  }
  
  extension [Self <: PartialCameraCenter](x: Self) {
    
    inline def setCenter(value: PartialPoint): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
    
    inline def setEye(value: PartialPoint): Self = StObject.set(x, "eye", value.asInstanceOf[js.Any])
    
    inline def setEyeUndefined: Self = StObject.set(x, "eye", js.undefined)
    
    inline def setUp(value: PartialPoint): Self = StObject.set(x, "up", value.asInstanceOf[js.Any])
    
    inline def setUpUndefined: Self = StObject.set(x, "up", js.undefined)
  }
}
