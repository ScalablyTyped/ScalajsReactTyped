package typingsJapgolly.loginWithAmazonSdkBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CodeRequest
  extends StObject
     with AuthorizeRequestBase[CodeRequest]
     with AuthorizeRequest {
  
  /**
    * An authorization code that can be exchanged for an access token.
    */
  var code: String = js.native
  
  /**
    * The state value provided to authorize using the options object.
    */
  var state: String = js.native
}
