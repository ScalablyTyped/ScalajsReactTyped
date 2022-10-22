package typingsJapgolly.azureMsalCommon

import japgolly.scalajs.react.Callback
import typingsJapgolly.azureMsalCommon.distRequestBaseAuthRequestMod.BaseAuthRequest
import typingsJapgolly.azureMsalCommon.distResponseDeviceCodeResponseMod.DeviceCodeResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distRequestCommonDeviceCodeRequestMod {
  
  trait CommonDeviceCodeRequest
    extends StObject
       with BaseAuthRequest {
    
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    def deviceCodeCallback(response: DeviceCodeResponse): Unit
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object CommonDeviceCodeRequest {
    
    inline def apply(
      authority: String,
      correlationId: String,
      deviceCodeCallback: DeviceCodeResponse => Callback,
      scopes: js.Array[String]
    ): CommonDeviceCodeRequest = {
      val __obj = js.Dynamic.literal(authority = authority.asInstanceOf[js.Any], correlationId = correlationId.asInstanceOf[js.Any], deviceCodeCallback = js.Any.fromFunction1((t0: DeviceCodeResponse) => deviceCodeCallback(t0).runNow()), scopes = scopes.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommonDeviceCodeRequest]
    }
    
    extension [Self <: CommonDeviceCodeRequest](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setDeviceCodeCallback(value: DeviceCodeResponse => Callback): Self = StObject.set(x, "deviceCodeCallback", js.Any.fromFunction1((t0: DeviceCodeResponse) => value(t0).runNow()))
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}
