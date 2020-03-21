package typingsJapgolly.relayRuntime.relayModernEnvironmentMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.relayRuntime.relayDefaultHandlerProviderMod.HandlerProvider
import typingsJapgolly.relayRuntime.relayModernQueryExecutorMod.TaskScheduler
import typingsJapgolly.relayRuntime.relayNetworkTypesMod.Network
import typingsJapgolly.relayRuntime.relayStoreTypesMod.LogEvent
import typingsJapgolly.relayRuntime.relayStoreTypesMod.LogFunction
import typingsJapgolly.relayRuntime.relayStoreTypesMod.MissingFieldHandler
import typingsJapgolly.relayRuntime.relayStoreTypesMod.OperationLoader
import typingsJapgolly.relayRuntime.relayStoreTypesMod.OperationTracker
import typingsJapgolly.relayRuntime.relayStoreTypesMod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnvironmentConfig extends js.Object {
  val configName: js.UndefOr[String] = js.undefined
  val handlerProvider: js.UndefOr[HandlerProvider | Null] = js.undefined
  val log: js.UndefOr[LogFunction | Null] = js.undefined
  val missingFieldHandlers: js.UndefOr[js.Array[MissingFieldHandler] | Null] = js.undefined
  val network: Network
  val operationLoader: js.UndefOr[OperationLoader | Null] = js.undefined
  val operationTracker: js.UndefOr[OperationTracker | Null] = js.undefined
  val scheduler: js.UndefOr[TaskScheduler | Null] = js.undefined
  val store: Store
}

object EnvironmentConfig {
  @scala.inline
  def apply(
    network: Network,
    store: Store,
    configName: String = null,
    handlerProvider: /* handle */ String => CallbackTo[js.Any] = null,
    log: /* logEvent */ LogEvent => Callback = null,
    missingFieldHandlers: js.Array[MissingFieldHandler] = null,
    operationLoader: OperationLoader = null,
    operationTracker: OperationTracker = null,
    scheduler: TaskScheduler = null
  ): EnvironmentConfig = {
    val __obj = js.Dynamic.literal(network = network.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any])
    if (configName != null) __obj.updateDynamic("configName")(configName.asInstanceOf[js.Any])
    if (handlerProvider != null) __obj.updateDynamic("handlerProvider")(js.Any.fromFunction1((t0: /* handle */ java.lang.String) => handlerProvider(t0).runNow()))
    if (log != null) __obj.updateDynamic("log")(js.Any.fromFunction1((t0: /* logEvent */ typingsJapgolly.relayRuntime.relayStoreTypesMod.LogEvent) => log(t0).runNow()))
    if (missingFieldHandlers != null) __obj.updateDynamic("missingFieldHandlers")(missingFieldHandlers.asInstanceOf[js.Any])
    if (operationLoader != null) __obj.updateDynamic("operationLoader")(operationLoader.asInstanceOf[js.Any])
    if (operationTracker != null) __obj.updateDynamic("operationTracker")(operationTracker.asInstanceOf[js.Any])
    if (scheduler != null) __obj.updateDynamic("scheduler")(scheduler.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvironmentConfig]
  }
}

