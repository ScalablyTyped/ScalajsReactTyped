package typingsJapgolly.sawtoothSdk.protobufMod

import typingsJapgolly.sawtoothSdk.protobufMod.ConsensusBroadcastResponse.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IConsensusBroadcastResponse extends StObject {
  
  /** ConsensusBroadcastResponse status */
  var status: js.UndefOr[Status | Null] = js.undefined
}
object IConsensusBroadcastResponse {
  
  inline def apply(): IConsensusBroadcastResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConsensusBroadcastResponse]
  }
  
  extension [Self <: IConsensusBroadcastResponse](x: Self) {
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
