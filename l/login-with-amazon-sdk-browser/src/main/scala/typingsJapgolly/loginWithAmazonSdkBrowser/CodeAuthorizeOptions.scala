package typingsJapgolly.loginWithAmazonSdkBrowser

import typingsJapgolly.loginWithAmazonSdkBrowser.loginWithAmazonSdkBrowserStrings.code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Option form to request a code.
  */
trait CodeAuthorizeOptions
  extends StObject
     with AuthorizeOptions {
  
  @JSName("response_type")
  var response_type_CodeAuthorizeOptions: code
}
object CodeAuthorizeOptions {
  
  inline def apply(scope: AuthorizeScope): CodeAuthorizeOptions = {
    val __obj = js.Dynamic.literal(response_type = "code", scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeAuthorizeOptions]
  }
  
  extension [Self <: CodeAuthorizeOptions](x: Self) {
    
    inline def setResponse_type(value: code): Self = StObject.set(x, "response_type", value.asInstanceOf[js.Any])
  }
}
