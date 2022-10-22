package typingsJapgolly.oidcProvider.anon

import typingsJapgolly.oidcProvider.oidcProviderStrings.authorization
import typingsJapgolly.oidcProvider.oidcProviderStrings.idtoken
import typingsJapgolly.oidcProvider.oidcProviderStrings.introspection
import typingsJapgolly.oidcProvider.oidcProviderStrings.logout
import typingsJapgolly.oidcProvider.oidcProviderStrings.userinfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExpiresAt extends StObject {
  
  var expiresAt: js.UndefOr[Double] = js.undefined
  
  var use: idtoken | logout | userinfo | introspection | authorization
}
object ExpiresAt {
  
  inline def apply(use: idtoken | logout | userinfo | introspection | authorization): ExpiresAt = {
    val __obj = js.Dynamic.literal(use = use.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpiresAt]
  }
  
  extension [Self <: ExpiresAt](x: Self) {
    
    inline def setExpiresAt(value: Double): Self = StObject.set(x, "expiresAt", value.asInstanceOf[js.Any])
    
    inline def setExpiresAtUndefined: Self = StObject.set(x, "expiresAt", js.undefined)
    
    inline def setUse(value: idtoken | logout | userinfo | introspection | authorization): Self = StObject.set(x, "use", value.asInstanceOf[js.Any])
  }
}
