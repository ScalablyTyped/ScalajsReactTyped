package typingsJapgolly.relayRuntime

import japgolly.scalajs.react.Callback
import typingsJapgolly.relayRuntime.relayRuntimeTypesMod.CacheConfig
import typingsJapgolly.relayRuntime.relayStoreTypesMod.OperationDescriptor
import typingsJapgolly.relayRuntime.relayStoreTypesMod.RecordSourceSelectorProxy
import typingsJapgolly.relayRuntime.relayStoreTypesMod.SelectorStoreUpdater
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCacheConfig extends js.Object {
  var cacheConfig: js.UndefOr[CacheConfig | Null] = js.undefined
  var operation: OperationDescriptor
  var updater: js.UndefOr[SelectorStoreUpdater[js.Object] | Null] = js.undefined
}

object AnonCacheConfig {
  @scala.inline
  def apply(
    operation: OperationDescriptor,
    cacheConfig: CacheConfig = null,
    updater: (/* store */ RecordSourceSelectorProxy[js.Object], js.Object) => Callback = null
  ): AnonCacheConfig = {
    val __obj = js.Dynamic.literal(operation = operation.asInstanceOf[js.Any])
    if (cacheConfig != null) __obj.updateDynamic("cacheConfig")(cacheConfig.asInstanceOf[js.Any])
    if (updater != null) __obj.updateDynamic("updater")(js.Any.fromFunction2((t0: /* store */ typingsJapgolly.relayRuntime.relayStoreTypesMod.RecordSourceSelectorProxy[js.Object], t1: js.Object) => updater(t0, t1).runNow()))
    __obj.asInstanceOf[AnonCacheConfig]
  }
}

