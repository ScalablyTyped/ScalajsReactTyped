package typingsJapgolly.relayTestUtils

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.relayRuntime.relayDefaultHandlerProviderMod.HandlerProvider
import typingsJapgolly.relayRuntime.relayStoreTypesMod.MissingFieldHandler
import typingsJapgolly.relayRuntime.relayStoreTypesMod.OperationLoader
import typingsJapgolly.relayRuntime.relayStoreTypesMod.OperationTracker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHandlerProvider extends js.Object {
  var handlerProvider: js.UndefOr[HandlerProvider] = js.undefined
  var missingFieldHandlers: js.UndefOr[js.Array[MissingFieldHandler]] = js.undefined
  var operationLoader: js.UndefOr[OperationLoader] = js.undefined
  var operationTracker: js.UndefOr[OperationTracker] = js.undefined
}

object AnonHandlerProvider {
  @scala.inline
  def apply(
    handlerProvider: /* handle */ String => CallbackTo[js.Any] = null,
    missingFieldHandlers: js.Array[MissingFieldHandler] = null,
    operationLoader: OperationLoader = null,
    operationTracker: OperationTracker = null
  ): AnonHandlerProvider = {
    val __obj = js.Dynamic.literal()
    if (handlerProvider != null) __obj.updateDynamic("handlerProvider")(js.Any.fromFunction1((t0: /* handle */ java.lang.String) => handlerProvider(t0).runNow()))
    if (missingFieldHandlers != null) __obj.updateDynamic("missingFieldHandlers")(missingFieldHandlers.asInstanceOf[js.Any])
    if (operationLoader != null) __obj.updateDynamic("operationLoader")(operationLoader.asInstanceOf[js.Any])
    if (operationTracker != null) __obj.updateDynamic("operationTracker")(operationTracker.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHandlerProvider]
  }
}

