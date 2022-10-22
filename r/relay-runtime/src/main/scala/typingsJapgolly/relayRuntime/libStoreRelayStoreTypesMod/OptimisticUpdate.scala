package typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.OptimisticUpdateFunction
  - typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.OptimisticUpdateRelayPayload
*/
trait OptimisticUpdate extends StObject
object OptimisticUpdate {
  
  inline def OptimisticUpdateFunction(storeUpdater: RecordSourceProxy => Callback): typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.OptimisticUpdateFunction = {
    val __obj = js.Dynamic.literal(storeUpdater = js.Any.fromFunction1((t0: RecordSourceProxy) => storeUpdater(t0).runNow()))
    __obj.asInstanceOf[typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.OptimisticUpdateFunction]
  }
  
  inline def OptimisticUpdateRelayPayload(operation: OperationDescriptor, payload: RelayResponsePayload): typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.OptimisticUpdateRelayPayload = {
    val __obj = js.Dynamic.literal(operation = operation.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.OptimisticUpdateRelayPayload]
  }
}
