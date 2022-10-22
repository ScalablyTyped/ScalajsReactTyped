package typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptimisticUpdateRelayPayload
  extends StObject
     with OptimisticUpdate {
  
  val operation: OperationDescriptor
  
  val payload: RelayResponsePayload
  
  val updater: js.UndefOr[SelectorStoreUpdater[js.Object] | Null] = js.undefined
}
object OptimisticUpdateRelayPayload {
  
  inline def apply(operation: OperationDescriptor, payload: RelayResponsePayload): OptimisticUpdateRelayPayload = {
    val __obj = js.Dynamic.literal(operation = operation.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptimisticUpdateRelayPayload]
  }
  
  extension [Self <: OptimisticUpdateRelayPayload](x: Self) {
    
    inline def setOperation(value: OperationDescriptor): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    inline def setPayload(value: RelayResponsePayload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setUpdater(value: (/* store */ RecordSourceSelectorProxy[js.Object], js.Object) => Callback): Self = StObject.set(x, "updater", js.Any.fromFunction2((t0: /* store */ RecordSourceSelectorProxy[js.Object], t1: js.Object) => (value(t0, t1)).runNow()))
    
    inline def setUpdaterNull: Self = StObject.set(x, "updater", null)
    
    inline def setUpdaterUndefined: Self = StObject.set(x, "updater", js.undefined)
  }
}
