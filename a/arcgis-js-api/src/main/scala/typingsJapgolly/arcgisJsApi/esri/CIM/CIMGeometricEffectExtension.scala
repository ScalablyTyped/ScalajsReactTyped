package typingsJapgolly.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CIMGeometricEffectExtension
  extends StObject
     with CIMGeometricEffectBase
     with CIMGeometricEffectType {
  
  /**
    * The deflection angle used for the extension. A value of 0 indicates no deflection.
    */
  var deflection: js.UndefOr[Double] = js.undefined
  
  /**
    * The length of the extension that is dynamically created.
    */
  var length: js.UndefOr[Double] = js.undefined
  
  /**
    * The origin of the extension to add to the line. The beginning and end of the line is defined by the direction the line was digitized.
    */
  var origin: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GeometricEffectExtensionOrigin * / any */ String
  ] = js.undefined
  
  @JSName("type")
  var type_CIMGeometricEffectExtension: typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectExtension
}
object CIMGeometricEffectExtension {
  
  inline def apply(): CIMGeometricEffectExtension = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("CIMGeometricEffectExtension")
    __obj.asInstanceOf[CIMGeometricEffectExtension]
  }
  
  extension [Self <: CIMGeometricEffectExtension](x: Self) {
    
    inline def setDeflection(value: Double): Self = StObject.set(x, "deflection", value.asInstanceOf[js.Any])
    
    inline def setDeflectionUndefined: Self = StObject.set(x, "deflection", js.undefined)
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def setOrigin(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GeometricEffectExtensionOrigin * / any */ String
    ): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    inline def setType(value: typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectExtension): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
