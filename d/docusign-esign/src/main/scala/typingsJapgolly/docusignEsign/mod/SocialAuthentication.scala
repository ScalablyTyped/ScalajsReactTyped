package typingsJapgolly.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SocialAuthentication extends StObject {
  
  /**
    * Reserved for DocuSign.
    */
  var authentication: js.UndefOr[String] = js.undefined
}
object SocialAuthentication {
  
  inline def apply(): SocialAuthentication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SocialAuthentication]
  }
  
  extension [Self <: SocialAuthentication](x: Self) {
    
    inline def setAuthentication(value: String): Self = StObject.set(x, "authentication", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationUndefined: Self = StObject.set(x, "authentication", js.undefined)
  }
}
