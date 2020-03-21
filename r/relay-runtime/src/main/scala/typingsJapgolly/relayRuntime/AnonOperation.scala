package typingsJapgolly.relayRuntime

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.relayRuntime.relayNetworkTypesMod.UploadableMap
import typingsJapgolly.relayRuntime.relayStoreTypesMod.OperationDescriptor
import typingsJapgolly.relayRuntime.relayStoreTypesMod.RecordSourceSelectorProxy
import typingsJapgolly.relayRuntime.relayStoreTypesMod.SelectorStoreUpdater
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOperation extends js.Object {
  var operation: OperationDescriptor
  var optimisticResponse: js.UndefOr[StringDictionary[js.Any] | Null] = js.undefined
  var optimisticUpdater: js.UndefOr[SelectorStoreUpdater[js.Object] | Null] = js.undefined
  var updater: js.UndefOr[SelectorStoreUpdater[js.Object] | Null] = js.undefined
  var uploadables: js.UndefOr[UploadableMap | Null] = js.undefined
}

object AnonOperation {
  @scala.inline
  def apply(
    operation: OperationDescriptor,
    optimisticResponse: StringDictionary[js.Any] = null,
    optimisticUpdater: (/* store */ RecordSourceSelectorProxy[js.Object], js.Object) => Callback = null,
    updater: (/* store */ RecordSourceSelectorProxy[js.Object], js.Object) => Callback = null,
    uploadables: UploadableMap = null
  ): AnonOperation = {
    val __obj = js.Dynamic.literal(operation = operation.asInstanceOf[js.Any])
    if (optimisticResponse != null) __obj.updateDynamic("optimisticResponse")(optimisticResponse.asInstanceOf[js.Any])
    if (optimisticUpdater != null) __obj.updateDynamic("optimisticUpdater")(js.Any.fromFunction2((t0: /* store */ typingsJapgolly.relayRuntime.relayStoreTypesMod.RecordSourceSelectorProxy[js.Object], t1: js.Object) => optimisticUpdater(t0, t1).runNow()))
    if (updater != null) __obj.updateDynamic("updater")(js.Any.fromFunction2((t0: /* store */ typingsJapgolly.relayRuntime.relayStoreTypesMod.RecordSourceSelectorProxy[js.Object], t1: js.Object) => updater(t0, t1).runNow()))
    if (uploadables != null) __obj.updateDynamic("uploadables")(uploadables.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOperation]
  }
}

