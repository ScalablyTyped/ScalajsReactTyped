package typingsJapgolly.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CIMGeometricEffectAddControlPoints
  extends StObject
     with CIMGeometricEffectBase
     with CIMGeometricEffectType {
  
  /**
    * The value below which a control point will be placed. The maximum amount of deflection from one segment to another at a vertex. Angle values between 180 and 360 are interpreted the same as values between 0 and 180. Angle values of 180 and 360 are the same as 0.
    */
  var angleTolerance: js.UndefOr[Double] = js.undefined
  
  @JSName("type")
  var type_CIMGeometricEffectAddControlPoints: typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectAddControlPoints
}
object CIMGeometricEffectAddControlPoints {
  
  inline def apply(): CIMGeometricEffectAddControlPoints = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("CIMGeometricEffectAddControlPoints")
    __obj.asInstanceOf[CIMGeometricEffectAddControlPoints]
  }
  
  extension [Self <: CIMGeometricEffectAddControlPoints](x: Self) {
    
    inline def setAngleTolerance(value: Double): Self = StObject.set(x, "angleTolerance", value.asInstanceOf[js.Any])
    
    inline def setAngleToleranceUndefined: Self = StObject.set(x, "angleTolerance", js.undefined)
    
    inline def setType(value: typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectAddControlPoints): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
