package typingsJapgolly.relayRuntime.relayStoreTypesMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.relayRuntime.relayNetworkTypesMod.PayloadData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptimisticResponseConfig extends js.Object {
  val operation: OperationDescriptor
  val response: js.UndefOr[PayloadData | Null] = js.undefined
  val updater: js.UndefOr[SelectorStoreUpdater[js.Object] | Null] = js.undefined
}

object OptimisticResponseConfig {
  @scala.inline
  def apply(
    operation: OperationDescriptor,
    response: PayloadData = null,
    updater: (/* store */ RecordSourceSelectorProxy[js.Object], js.Object) => Callback = null
  ): OptimisticResponseConfig = {
    val __obj = js.Dynamic.literal(operation = operation.asInstanceOf[js.Any])
    if (response != null) __obj.updateDynamic("response")(response.asInstanceOf[js.Any])
    if (updater != null) __obj.updateDynamic("updater")(js.Any.fromFunction2((t0: /* store */ typingsJapgolly.relayRuntime.relayStoreTypesMod.RecordSourceSelectorProxy[js.Object], t1: js.Object) => updater(t0, t1).runNow()))
    __obj.asInstanceOf[OptimisticResponseConfig]
  }
}

