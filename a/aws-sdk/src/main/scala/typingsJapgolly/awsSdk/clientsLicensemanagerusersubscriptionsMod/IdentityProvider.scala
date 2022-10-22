package typingsJapgolly.awsSdk.clientsLicensemanagerusersubscriptionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdentityProvider extends StObject {
  
  /**
    * An object that details an Active Directory identity provider.
    */
  var ActiveDirectoryIdentityProvider: js.UndefOr[
    typingsJapgolly.awsSdk.clientsLicensemanagerusersubscriptionsMod.ActiveDirectoryIdentityProvider
  ] = js.undefined
}
object IdentityProvider {
  
  inline def apply(): IdentityProvider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentityProvider]
  }
  
  extension [Self <: IdentityProvider](x: Self) {
    
    inline def setActiveDirectoryIdentityProvider(value: ActiveDirectoryIdentityProvider): Self = StObject.set(x, "ActiveDirectoryIdentityProvider", value.asInstanceOf[js.Any])
    
    inline def setActiveDirectoryIdentityProviderUndefined: Self = StObject.set(x, "ActiveDirectoryIdentityProvider", js.undefined)
  }
}
