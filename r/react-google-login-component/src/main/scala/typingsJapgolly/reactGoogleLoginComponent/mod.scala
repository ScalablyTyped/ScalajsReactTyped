package typingsJapgolly.reactGoogleLoginComponent

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLButtonElement
import typingsJapgolly.react.mod.ButtonHTMLAttributes
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactGoogleLoginComponent.anon.Accesstoken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-google-login-component", "GoogleLogin")
  @js.native
  open class GoogleLogin protected ()
    extends Component[GoogleLoginProps, js.Object, Any] {
    def this(props: GoogleLoginProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: GoogleLoginProps, context: Any) = this()
  }
  
  trait GoogleLoginInfo extends StObject {
    
    def getAuthResponse(): Accesstoken
  }
  object GoogleLoginInfo {
    
    inline def apply(getAuthResponse: CallbackTo[Accesstoken]): GoogleLoginInfo = {
      val __obj = js.Dynamic.literal(getAuthResponse = getAuthResponse.toJsFn)
      __obj.asInstanceOf[GoogleLoginInfo]
    }
    
    extension [Self <: GoogleLoginInfo](x: Self) {
      
      inline def setGetAuthResponse(value: CallbackTo[Accesstoken]): Self = StObject.set(x, "getAuthResponse", value.toJsFn)
    }
  }
  
  trait GoogleLoginProps
    extends StObject
       with ButtonHTMLAttributes[HTMLButtonElement] {
    
    var buttonText: js.UndefOr[String] = js.undefined
    
    var fetchBasicProfile: js.UndefOr[Boolean] = js.undefined
    
    var prompt: js.UndefOr[String] = js.undefined
    
    def responseHandler(response: GoogleLoginInfo): Unit
    
    var scope: js.UndefOr[String] = js.undefined
    
    var socialId: String
  }
  object GoogleLoginProps {
    
    inline def apply(responseHandler: GoogleLoginInfo => Callback, socialId: String): GoogleLoginProps = {
      val __obj = js.Dynamic.literal(responseHandler = js.Any.fromFunction1((t0: GoogleLoginInfo) => responseHandler(t0).runNow()), socialId = socialId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GoogleLoginProps]
    }
    
    extension [Self <: GoogleLoginProps](x: Self) {
      
      inline def setButtonText(value: String): Self = StObject.set(x, "buttonText", value.asInstanceOf[js.Any])
      
      inline def setButtonTextUndefined: Self = StObject.set(x, "buttonText", js.undefined)
      
      inline def setFetchBasicProfile(value: Boolean): Self = StObject.set(x, "fetchBasicProfile", value.asInstanceOf[js.Any])
      
      inline def setFetchBasicProfileUndefined: Self = StObject.set(x, "fetchBasicProfile", js.undefined)
      
      inline def setPrompt(value: String): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
      
      inline def setPromptUndefined: Self = StObject.set(x, "prompt", js.undefined)
      
      inline def setResponseHandler(value: GoogleLoginInfo => Callback): Self = StObject.set(x, "responseHandler", js.Any.fromFunction1((t0: GoogleLoginInfo) => value(t0).runNow()))
      
      inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      inline def setSocialId(value: String): Self = StObject.set(x, "socialId", value.asInstanceOf[js.Any])
    }
  }
}
