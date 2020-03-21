package typingsJapgolly.relayRuntime.relayStoreTypesMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptimisticUpdateRelayPayload extends OptimisticUpdate {
  val operation: OperationDescriptor
  val payload: RelayResponsePayload
  val updater: js.UndefOr[SelectorStoreUpdater[js.Object] | Null] = js.undefined
}

object OptimisticUpdateRelayPayload {
  @scala.inline
  def apply(
    operation: OperationDescriptor,
    payload: RelayResponsePayload,
    updater: (/* store */ RecordSourceSelectorProxy[js.Object], js.Object) => Callback = null
  ): OptimisticUpdateRelayPayload = {
    val __obj = js.Dynamic.literal(operation = operation.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    if (updater != null) __obj.updateDynamic("updater")(js.Any.fromFunction2((t0: /* store */ typingsJapgolly.relayRuntime.relayStoreTypesMod.RecordSourceSelectorProxy[js.Object], t1: js.Object) => updater(t0, t1).runNow()))
    __obj.asInstanceOf[OptimisticUpdateRelayPayload]
  }
}

