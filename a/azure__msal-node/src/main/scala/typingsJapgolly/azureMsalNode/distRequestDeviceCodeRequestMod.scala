package typingsJapgolly.azureMsalNode

import japgolly.scalajs.react.Callback
import typingsJapgolly.azureMsalCommon.distConfigClientConfigurationMod.AzureCloudOptions
import typingsJapgolly.azureMsalCommon.distResponseDeviceCodeResponseMod.DeviceCodeResponse
import typingsJapgolly.azureMsalCommon.distUtilsConstantsMod.AuthenticationScheme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distRequestDeviceCodeRequestMod {
  
  /* Inlined std.Partial<std.Omit<@azure/msal-common.@azure/msal-common.CommonDeviceCodeRequest, 'scopes' | 'deviceCodeCallback' | 'resourceRequestMethod' | 'resourceRequestUri' | 'requestedClaimsHash'>> & {  scopes :std.Array<string>, deviceCodeCallback (response : @azure/msal-common.@azure/msal-common.DeviceCodeResponse): void} */
  trait DeviceCodeRequest extends StObject {
    
    var authenticationScheme: js.UndefOr[AuthenticationScheme] = js.undefined
    
    var authority: js.UndefOr[String] = js.undefined
    
    var azureCloudOptions: js.UndefOr[AzureCloudOptions] = js.undefined
    
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    var claims: js.UndefOr[String] = js.undefined
    
    var correlationId: js.UndefOr[String] = js.undefined
    
    def deviceCodeCallback(response: DeviceCodeResponse): Unit
    
    var scopes: js.Array[String]
    
    var shrClaims: js.UndefOr[String] = js.undefined
    
    var shrNonce: js.UndefOr[String] = js.undefined
    
    var sshJwk: js.UndefOr[String] = js.undefined
    
    var sshKid: js.UndefOr[String] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object DeviceCodeRequest {
    
    inline def apply(deviceCodeCallback: DeviceCodeResponse => Callback, scopes: js.Array[String]): DeviceCodeRequest = {
      val __obj = js.Dynamic.literal(deviceCodeCallback = js.Any.fromFunction1((t0: DeviceCodeResponse) => deviceCodeCallback(t0).runNow()), scopes = scopes.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeviceCodeRequest]
    }
    
    extension [Self <: DeviceCodeRequest](x: Self) {
      
      inline def setAuthenticationScheme(value: AuthenticationScheme): Self = StObject.set(x, "authenticationScheme", value.asInstanceOf[js.Any])
      
      inline def setAuthenticationSchemeUndefined: Self = StObject.set(x, "authenticationScheme", js.undefined)
      
      inline def setAuthority(value: String): Self = StObject.set(x, "authority", value.asInstanceOf[js.Any])
      
      inline def setAuthorityUndefined: Self = StObject.set(x, "authority", js.undefined)
      
      inline def setAzureCloudOptions(value: AzureCloudOptions): Self = StObject.set(x, "azureCloudOptions", value.asInstanceOf[js.Any])
      
      inline def setAzureCloudOptionsUndefined: Self = StObject.set(x, "azureCloudOptions", js.undefined)
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setClaims(value: String): Self = StObject.set(x, "claims", value.asInstanceOf[js.Any])
      
      inline def setClaimsUndefined: Self = StObject.set(x, "claims", js.undefined)
      
      inline def setCorrelationId(value: String): Self = StObject.set(x, "correlationId", value.asInstanceOf[js.Any])
      
      inline def setCorrelationIdUndefined: Self = StObject.set(x, "correlationId", js.undefined)
      
      inline def setDeviceCodeCallback(value: DeviceCodeResponse => Callback): Self = StObject.set(x, "deviceCodeCallback", js.Any.fromFunction1((t0: DeviceCodeResponse) => value(t0).runNow()))
      
      inline def setScopes(value: js.Array[String]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
      
      inline def setScopesVarargs(value: String*): Self = StObject.set(x, "scopes", js.Array(value*))
      
      inline def setShrClaims(value: String): Self = StObject.set(x, "shrClaims", value.asInstanceOf[js.Any])
      
      inline def setShrClaimsUndefined: Self = StObject.set(x, "shrClaims", js.undefined)
      
      inline def setShrNonce(value: String): Self = StObject.set(x, "shrNonce", value.asInstanceOf[js.Any])
      
      inline def setShrNonceUndefined: Self = StObject.set(x, "shrNonce", js.undefined)
      
      inline def setSshJwk(value: String): Self = StObject.set(x, "sshJwk", value.asInstanceOf[js.Any])
      
      inline def setSshJwkUndefined: Self = StObject.set(x, "sshJwk", js.undefined)
      
      inline def setSshKid(value: String): Self = StObject.set(x, "sshKid", value.asInstanceOf[js.Any])
      
      inline def setSshKidUndefined: Self = StObject.set(x, "sshKid", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}
