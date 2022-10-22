package typingsJapgolly.reactFacebookLogin

import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.React.Node
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactFacebookLogin.anon.Data
import typingsJapgolly.reactFacebookLogin.reactFacebookLoginStrings.medium
import typingsJapgolly.reactFacebookLogin.reactFacebookLoginStrings.metro
import typingsJapgolly.reactFacebookLogin.reactFacebookLoginStrings.small
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-facebook-login", JSImport.Default)
  @js.native
  open class default () extends Component[ReactFacebookLoginProps, ReactFacebookLoginState, Any]
  
  trait ReactFacebookFailureResponse extends StObject {
    
    var status: js.UndefOr[String] = js.undefined
  }
  object ReactFacebookFailureResponse {
    
    inline def apply(): ReactFacebookFailureResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReactFacebookFailureResponse]
    }
    
    extension [Self <: ReactFacebookFailureResponse](x: Self) {
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  type ReactFacebookLogin = japgolly.scalajs.react.facade.React.Component[ReactFacebookLoginProps & js.Object, js.Object]
  
  trait ReactFacebookLoginInfo extends StObject {
    
    var accessToken: String
    
    var email: js.UndefOr[String] = js.undefined
    
    var id: String
    
    var name: js.UndefOr[String] = js.undefined
    
    var picture: js.UndefOr[Data] = js.undefined
    
    var userID: String
  }
  object ReactFacebookLoginInfo {
    
    inline def apply(accessToken: String, id: String, userID: String): ReactFacebookLoginInfo = {
      val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], userID = userID.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReactFacebookLoginInfo]
    }
    
    extension [Self <: ReactFacebookLoginInfo](x: Self) {
      
      inline def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPicture(value: Data): Self = StObject.set(x, "picture", value.asInstanceOf[js.Any])
      
      inline def setPictureUndefined: Self = StObject.set(x, "picture", js.undefined)
      
      inline def setUserID(value: String): Self = StObject.set(x, "userID", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ReactFacebookLoginProps extends StObject {
    
    var appId: String = js.native
    
    var authType: js.UndefOr[String] = js.native
    
    var autoLoad: js.UndefOr[Boolean] = js.native
    
    var buttonStyle: js.UndefOr[CSSProperties] = js.native
    
    def callback(userInfo: ReactFacebookFailureResponse): Unit = js.native
    def callback(userInfo: ReactFacebookLoginInfo): Unit = js.native
    
    var containerStyle: js.UndefOr[CSSProperties] = js.native
    
    var cookie: js.UndefOr[Boolean] = js.native
    
    var cssClass: js.UndefOr[String] = js.native
    
    var disableMobileRedirect: js.UndefOr[Boolean] = js.native
    
    var fields: js.UndefOr[String] = js.native
    
    var icon: js.UndefOr[Node] = js.native
    
    var isDisabled: js.UndefOr[Boolean] = js.native
    
    var isMobile: js.UndefOr[Boolean] = js.native
    
    var language: js.UndefOr[String] = js.native
    
    var onClick: js.UndefOr[js.Function1[/* event */ ReactMouseEventFrom[HTMLDivElement], Unit]] = js.native
    
    var onFailure: js.UndefOr[js.Function1[/* response */ ReactFacebookFailureResponse, Unit]] = js.native
    
    var reAuthenticate: js.UndefOr[Boolean] = js.native
    
    var redirectUri: js.UndefOr[String] = js.native
    
    var responseType: js.UndefOr[String] = js.native
    
    var returnScopes: js.UndefOr[Boolean] = js.native
    
    var scope: js.UndefOr[String] = js.native
    
    var size: js.UndefOr[small | medium | metro] = js.native
    
    var state: js.UndefOr[String] = js.native
    
    var tag: js.UndefOr[
        org.scalajs.dom.Node | (japgolly.scalajs.react.facade.React.Component[Any & js.Object, js.Object])
      ] = js.native
    
    var textButton: js.UndefOr[String] = js.native
    
    var typeButton: js.UndefOr[String] = js.native
    
    var version: js.UndefOr[String] = js.native
    
    var xfbml: js.UndefOr[Boolean] = js.native
  }
  
  trait ReactFacebookLoginState extends StObject {
    
    var isProcessing: js.UndefOr[Boolean] = js.undefined
    
    var isSdkLoaded: js.UndefOr[Boolean] = js.undefined
  }
  object ReactFacebookLoginState {
    
    inline def apply(): ReactFacebookLoginState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReactFacebookLoginState]
    }
    
    extension [Self <: ReactFacebookLoginState](x: Self) {
      
      inline def setIsProcessing(value: Boolean): Self = StObject.set(x, "isProcessing", value.asInstanceOf[js.Any])
      
      inline def setIsProcessingUndefined: Self = StObject.set(x, "isProcessing", js.undefined)
      
      inline def setIsSdkLoaded(value: Boolean): Self = StObject.set(x, "isSdkLoaded", value.asInstanceOf[js.Any])
      
      inline def setIsSdkLoadedUndefined: Self = StObject.set(x, "isSdkLoaded", js.undefined)
    }
  }
}
