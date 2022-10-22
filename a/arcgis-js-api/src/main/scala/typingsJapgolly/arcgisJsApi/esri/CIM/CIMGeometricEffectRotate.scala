package typingsJapgolly.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CIMGeometricEffectRotate
  extends StObject
     with CIMGeometricEffectBase
     with CIMGeometricEffectType {
  
  /**
    * The amount of rotation for the symbol.
    */
  var angle: js.UndefOr[Double] = js.undefined
  
  @JSName("type")
  var type_CIMGeometricEffectRotate: typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectRotate
}
object CIMGeometricEffectRotate {
  
  inline def apply(): CIMGeometricEffectRotate = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("CIMGeometricEffectRotate")
    __obj.asInstanceOf[CIMGeometricEffectRotate]
  }
  
  extension [Self <: CIMGeometricEffectRotate](x: Self) {
    
    inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    inline def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
    
    inline def setType(value: typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectRotate): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
