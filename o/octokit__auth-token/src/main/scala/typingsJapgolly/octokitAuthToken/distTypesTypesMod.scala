package typingsJapgolly.octokitAuthToken

import typingsJapgolly.octokitAuthToken.octokitAuthTokenStrings.`user-to-server`
import typingsJapgolly.octokitAuthToken.octokitAuthTokenStrings.app
import typingsJapgolly.octokitAuthToken.octokitAuthTokenStrings.installation
import typingsJapgolly.octokitAuthToken.octokitAuthTokenStrings.oauth
import typingsJapgolly.octokitAuthToken.octokitAuthTokenStrings.token
import typingsJapgolly.octokitTypes.distTypesOctokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTypesMod {
  
  type AnyResponse = OctokitResponse[Any, Double]
  
  trait AppAuthentication
    extends StObject
       with Authentication {
    
    var token: Token
    
    var tokenType: app
    
    var `type`: token
  }
  object AppAuthentication {
    
    inline def apply(token: Token): AppAuthentication = {
      val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any], tokenType = "app")
      __obj.updateDynamic("type")("token")
      __obj.asInstanceOf[AppAuthentication]
    }
    
    extension [Self <: AppAuthentication](x: Self) {
      
      inline def setToken(value: Token): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setTokenType(value: app): Self = StObject.set(x, "tokenType", value.asInstanceOf[js.Any])
      
      inline def setType(value: token): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.octokitAuthToken.distTypesTypesMod.OAuthTokenAuthentication
    - typingsJapgolly.octokitAuthToken.distTypesTypesMod.InstallationTokenAuthentication
    - typingsJapgolly.octokitAuthToken.distTypesTypesMod.AppAuthentication
    - typingsJapgolly.octokitAuthToken.distTypesTypesMod.UserToServerAuthentication
  */
  trait Authentication extends StObject
  object Authentication {
    
    inline def AppAuthentication(token: Token): typingsJapgolly.octokitAuthToken.distTypesTypesMod.AppAuthentication = {
      val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any], tokenType = "app")
      __obj.updateDynamic("type")("token")
      __obj.asInstanceOf[typingsJapgolly.octokitAuthToken.distTypesTypesMod.AppAuthentication]
    }
    
    inline def InstallationTokenAuthentication(token: Token): typingsJapgolly.octokitAuthToken.distTypesTypesMod.InstallationTokenAuthentication = {
      val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any], tokenType = "installation")
      __obj.updateDynamic("type")("token")
      __obj.asInstanceOf[typingsJapgolly.octokitAuthToken.distTypesTypesMod.InstallationTokenAuthentication]
    }
    
    inline def OAuthTokenAuthentication(token: Token): typingsJapgolly.octokitAuthToken.distTypesTypesMod.OAuthTokenAuthentication = {
      val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any], tokenType = "oauth")
      __obj.updateDynamic("type")("token")
      __obj.asInstanceOf[typingsJapgolly.octokitAuthToken.distTypesTypesMod.OAuthTokenAuthentication]
    }
    
    inline def UserToServerAuthentication(token: Token): typingsJapgolly.octokitAuthToken.distTypesTypesMod.UserToServerAuthentication = {
      val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any], tokenType = "user-to-server")
      __obj.updateDynamic("type")("token")
      __obj.asInstanceOf[typingsJapgolly.octokitAuthToken.distTypesTypesMod.UserToServerAuthentication]
    }
  }
  
  type EndpointDefaults = typingsJapgolly.octokitTypes.distTypesEndpointDefaultsMod.EndpointDefaults
  
  type EndpointOptions = typingsJapgolly.octokitTypes.distTypesEndpointOptionsMod.EndpointOptions
  
  trait InstallationTokenAuthentication
    extends StObject
       with Authentication {
    
    var token: Token
    
    var tokenType: installation
    
    var `type`: token
  }
  object InstallationTokenAuthentication {
    
    inline def apply(token: Token): InstallationTokenAuthentication = {
      val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any], tokenType = "installation")
      __obj.updateDynamic("type")("token")
      __obj.asInstanceOf[InstallationTokenAuthentication]
    }
    
    extension [Self <: InstallationTokenAuthentication](x: Self) {
      
      inline def setToken(value: Token): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setTokenType(value: installation): Self = StObject.set(x, "tokenType", value.asInstanceOf[js.Any])
      
      inline def setType(value: token): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait OAuthTokenAuthentication
    extends StObject
       with Authentication {
    
    var token: Token
    
    var tokenType: oauth
    
    var `type`: token
  }
  object OAuthTokenAuthentication {
    
    inline def apply(token: Token): OAuthTokenAuthentication = {
      val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any], tokenType = "oauth")
      __obj.updateDynamic("type")("token")
      __obj.asInstanceOf[OAuthTokenAuthentication]
    }
    
    extension [Self <: OAuthTokenAuthentication](x: Self) {
      
      inline def setToken(value: Token): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setTokenType(value: oauth): Self = StObject.set(x, "tokenType", value.asInstanceOf[js.Any])
      
      inline def setType(value: token): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type RequestInterface = typingsJapgolly.octokitTypes.distTypesRequestInterfaceMod.RequestInterface[js.Object]
  
  type RequestParameters = typingsJapgolly.octokitTypes.distTypesRequestParametersMod.RequestParameters
  
  type Route = typingsJapgolly.octokitTypes.distTypesRouteMod.Route
  
  type StrategyInterface = typingsJapgolly.octokitTypes.distTypesStrategyInterfaceMod.StrategyInterface[js.Array[Token], js.Array[Any], Authentication]
  
  type Token = String
  
  trait UserToServerAuthentication
    extends StObject
       with Authentication {
    
    var token: Token
    
    var tokenType: `user-to-server`
    
    var `type`: token
  }
  object UserToServerAuthentication {
    
    inline def apply(token: Token): UserToServerAuthentication = {
      val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any], tokenType = "user-to-server")
      __obj.updateDynamic("type")("token")
      __obj.asInstanceOf[UserToServerAuthentication]
    }
    
    extension [Self <: UserToServerAuthentication](x: Self) {
      
      inline def setToken(value: Token): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setTokenType(value: `user-to-server`): Self = StObject.set(x, "tokenType", value.asInstanceOf[js.Any])
      
      inline def setType(value: token): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
