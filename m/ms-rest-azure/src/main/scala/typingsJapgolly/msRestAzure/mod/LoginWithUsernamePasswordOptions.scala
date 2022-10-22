package typingsJapgolly.msRestAzure.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoginWithUsernamePasswordOptions
  extends StObject
     with AzureTokenCredentialsOptions {
  
  /** 
    * The active directory application client id. 
    * See {@link https://azure.microsoft.com/en-us/documentation/articles/active-directory-devquickstarts-dotnet/ Active Directory Quickstart for .Net} 
    * for an example.
    */
  var clientId: js.UndefOr[String] = js.undefined
  
  /**
    * The domain or tenant id containing this application. Default value is 'common'.
    */
  var domain: js.UndefOr[String] = js.undefined
}
object LoginWithUsernamePasswordOptions {
  
  inline def apply(): LoginWithUsernamePasswordOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoginWithUsernamePasswordOptions]
  }
  
  extension [Self <: LoginWithUsernamePasswordOptions](x: Self) {
    
    inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    inline def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
    
    inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
  }
}
