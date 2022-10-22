package typingsJapgolly.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SocialAccountInformation extends StObject {
  
  var email: js.UndefOr[String] = js.undefined
  
  /**
    * This object describes errors that occur. It is only valid for responses and ignored in requests.
    */
  var errorDetails: js.UndefOr[
    /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
  ] = js.undefined
  
  /**
    * The social account provider (Facebook, Yahoo, etc.)
    */
  var provider: js.UndefOr[String] = js.undefined
  
  /**
    * The ID provided by the Socal Account.
    */
  var socialId: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the user.
    */
  var userName: js.UndefOr[String] = js.undefined
}
object SocialAccountInformation {
  
  inline def apply(): SocialAccountInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SocialAccountInformation]
  }
  
  extension [Self <: SocialAccountInformation](x: Self) {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setErrorDetails(
      value: /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
    ): Self = StObject.set(x, "errorDetails", value.asInstanceOf[js.Any])
    
    inline def setErrorDetailsUndefined: Self = StObject.set(x, "errorDetails", js.undefined)
    
    inline def setProvider(value: String): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    inline def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
    
    inline def setSocialId(value: String): Self = StObject.set(x, "socialId", value.asInstanceOf[js.Any])
    
    inline def setSocialIdUndefined: Self = StObject.set(x, "socialId", js.undefined)
    
    inline def setUserName(value: String): Self = StObject.set(x, "userName", value.asInstanceOf[js.Any])
    
    inline def setUserNameUndefined: Self = StObject.set(x, "userName", js.undefined)
  }
}
