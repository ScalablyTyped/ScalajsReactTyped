package typingsJapgolly.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudVisionV1p3beta1Property extends StObject {
  
  /** Name of the property. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Value of numeric properties. */
  var uint64Value: js.UndefOr[String] = js.undefined
  
  /** Value of the property. */
  var value: js.UndefOr[String] = js.undefined
}
object GoogleCloudVisionV1p3beta1Property {
  
  inline def apply(): GoogleCloudVisionV1p3beta1Property = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVisionV1p3beta1Property]
  }
  
  extension [Self <: GoogleCloudVisionV1p3beta1Property](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setUint64Value(value: String): Self = StObject.set(x, "uint64Value", value.asInstanceOf[js.Any])
    
    inline def setUint64ValueUndefined: Self = StObject.set(x, "uint64Value", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
