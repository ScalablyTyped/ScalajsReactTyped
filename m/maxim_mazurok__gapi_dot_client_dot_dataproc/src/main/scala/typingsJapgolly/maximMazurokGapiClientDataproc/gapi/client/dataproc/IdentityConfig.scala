package typingsJapgolly.maximMazurokGapiClientDataproc.gapi.client.dataproc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdentityConfig extends StObject {
  
  /** Required. Map of user to service account. */
  var userServiceAccountMapping: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
  ] = js.undefined
}
object IdentityConfig {
  
  inline def apply(): IdentityConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentityConfig]
  }
  
  extension [Self <: IdentityConfig](x: Self) {
    
    inline def setUserServiceAccountMapping(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
    ): Self = StObject.set(x, "userServiceAccountMapping", value.asInstanceOf[js.Any])
    
    inline def setUserServiceAccountMappingUndefined: Self = StObject.set(x, "userServiceAccountMapping", js.undefined)
  }
}
