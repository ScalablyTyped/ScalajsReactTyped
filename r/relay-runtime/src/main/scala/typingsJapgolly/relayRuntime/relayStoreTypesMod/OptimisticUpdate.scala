package typingsJapgolly.relayRuntime.relayStoreTypesMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.relayRuntime.relayStoreTypesMod.OptimisticUpdateFunction
  - typingsJapgolly.relayRuntime.relayStoreTypesMod.OptimisticUpdateRelayPayload
*/
trait OptimisticUpdate extends js.Object

object OptimisticUpdate {
  @scala.inline
  def OptimisticUpdateFunction(storeUpdater: RecordSourceProxy => Callback): OptimisticUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("storeUpdater")(js.Any.fromFunction1((t0: typingsJapgolly.relayRuntime.relayStoreTypesMod.RecordSourceProxy) => storeUpdater(t0).runNow()))
    __obj.asInstanceOf[OptimisticUpdate]
  }
  @scala.inline
  def OptimisticUpdateRelayPayload(
    operation: OperationDescriptor,
    payload: RelayResponsePayload,
    updater: (/* store */ RecordSourceSelectorProxy[js.Object], js.Object) => Callback = null
  ): OptimisticUpdate = {
    val __obj = js.Dynamic.literal(operation = operation.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    if (updater != null) __obj.updateDynamic("updater")(js.Any.fromFunction2((t0: /* store */ typingsJapgolly.relayRuntime.relayStoreTypesMod.RecordSourceSelectorProxy[js.Object], t1: js.Object) => updater(t0, t1).runNow()))
    __obj.asInstanceOf[OptimisticUpdate]
  }
}

