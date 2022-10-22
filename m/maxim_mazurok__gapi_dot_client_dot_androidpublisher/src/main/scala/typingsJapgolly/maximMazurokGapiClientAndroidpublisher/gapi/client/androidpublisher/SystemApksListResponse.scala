package typingsJapgolly.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SystemApksListResponse extends StObject {
  
  /** All system APK variants created. */
  var variants: js.UndefOr[js.Array[Variant]] = js.undefined
}
object SystemApksListResponse {
  
  inline def apply(): SystemApksListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SystemApksListResponse]
  }
  
  extension [Self <: SystemApksListResponse](x: Self) {
    
    inline def setVariants(value: js.Array[Variant]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: Variant*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
