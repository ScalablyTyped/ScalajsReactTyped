package typingsJapgolly.awsSdk.clientsSmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopAppReplicationRequest extends StObject {
  
  /**
    * The ID of the application.
    */
  var appId: js.UndefOr[AppId] = js.undefined
}
object StopAppReplicationRequest {
  
  inline def apply(): StopAppReplicationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopAppReplicationRequest]
  }
  
  extension [Self <: StopAppReplicationRequest](x: Self) {
    
    inline def setAppId(value: AppId): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    inline def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
  }
}
