package typingsJapgolly.firebaseAdmin.libAuthAuthConfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseCreateMultiFactorInfoRequest extends StObject {
  
  /**
    * The optional display name for an enrolled second factor.
    */
  var displayName: js.UndefOr[String] = js.undefined
  
  /**
    * The type identifier of the second factor. For SMS second factors, this is `phone`.
    */
  var factorId: String
}
object BaseCreateMultiFactorInfoRequest {
  
  inline def apply(factorId: String): BaseCreateMultiFactorInfoRequest = {
    val __obj = js.Dynamic.literal(factorId = factorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseCreateMultiFactorInfoRequest]
  }
  
  extension [Self <: BaseCreateMultiFactorInfoRequest](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setFactorId(value: String): Self = StObject.set(x, "factorId", value.asInstanceOf[js.Any])
  }
}
