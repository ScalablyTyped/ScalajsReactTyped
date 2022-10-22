package typingsJapgolly.azureMsalCommon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distResponseServerAuthorizationCodeResponseMod {
  
  trait ServerAuthorizationCodeResponse extends StObject {
    
    var accountId: js.UndefOr[String] = js.undefined
    
    var client_info: js.UndefOr[String] = js.undefined
    
    var cloud_graph_host_name: js.UndefOr[String] = js.undefined
    
    var cloud_instance_host_name: js.UndefOr[String] = js.undefined
    
    var cloud_instance_name: js.UndefOr[String] = js.undefined
    
    var code: js.UndefOr[String] = js.undefined
    
    var error: js.UndefOr[String] = js.undefined
    
    var error_description: js.UndefOr[String] = js.undefined
    
    var msgraph_host: js.UndefOr[String] = js.undefined
    
    var state: js.UndefOr[String] = js.undefined
    
    var suberror: js.UndefOr[String] = js.undefined
  }
  object ServerAuthorizationCodeResponse {
    
    inline def apply(): ServerAuthorizationCodeResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServerAuthorizationCodeResponse]
    }
    
    extension [Self <: ServerAuthorizationCodeResponse](x: Self) {
      
      inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
      
      inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
      
      inline def setClient_info(value: String): Self = StObject.set(x, "client_info", value.asInstanceOf[js.Any])
      
      inline def setClient_infoUndefined: Self = StObject.set(x, "client_info", js.undefined)
      
      inline def setCloud_graph_host_name(value: String): Self = StObject.set(x, "cloud_graph_host_name", value.asInstanceOf[js.Any])
      
      inline def setCloud_graph_host_nameUndefined: Self = StObject.set(x, "cloud_graph_host_name", js.undefined)
      
      inline def setCloud_instance_host_name(value: String): Self = StObject.set(x, "cloud_instance_host_name", value.asInstanceOf[js.Any])
      
      inline def setCloud_instance_host_nameUndefined: Self = StObject.set(x, "cloud_instance_host_name", js.undefined)
      
      inline def setCloud_instance_name(value: String): Self = StObject.set(x, "cloud_instance_name", value.asInstanceOf[js.Any])
      
      inline def setCloud_instance_nameUndefined: Self = StObject.set(x, "cloud_instance_name", js.undefined)
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setError_description(value: String): Self = StObject.set(x, "error_description", value.asInstanceOf[js.Any])
      
      inline def setError_descriptionUndefined: Self = StObject.set(x, "error_description", js.undefined)
      
      inline def setMsgraph_host(value: String): Self = StObject.set(x, "msgraph_host", value.asInstanceOf[js.Any])
      
      inline def setMsgraph_hostUndefined: Self = StObject.set(x, "msgraph_host", js.undefined)
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      inline def setSuberror(value: String): Self = StObject.set(x, "suberror", value.asInstanceOf[js.Any])
      
      inline def setSuberrorUndefined: Self = StObject.set(x, "suberror", js.undefined)
    }
  }
}
