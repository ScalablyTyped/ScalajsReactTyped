package typingsJapgolly.reactRelay

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactRelay.queryResourceMod.FetchPolicy
import typingsJapgolly.reactRelay.queryResourceMod.RenderPolicy
import typingsJapgolly.reactRelay.useRefetchableFragmentNodeMod.Action
import typingsJapgolly.relayRuntime.relayRuntimeTypesMod.Variables
import typingsJapgolly.relayRuntime.relayStoreTypesMod.Environment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFetchPolicy extends Action {
  var environment: Environment
  var fetchPolicy: js.UndefOr[FetchPolicy] = js.undefined
  var onComplete: js.UndefOr[js.Function1[/* args */ js.Error | Null, Unit]] = js.undefined
  var refetchVariables: Variables
  var renderPolicy: js.UndefOr[RenderPolicy] = js.undefined
  var `type`: String
}

object AnonFetchPolicy {
  @scala.inline
  def apply(
    environment: Environment,
    refetchVariables: Variables,
    `type`: String,
    fetchPolicy: FetchPolicy = null,
    onComplete: /* args */ js.Error | Null => Callback = null,
    renderPolicy: RenderPolicy = null
  ): AnonFetchPolicy = {
    val __obj = js.Dynamic.literal(environment = environment.asInstanceOf[js.Any], refetchVariables = refetchVariables.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (fetchPolicy != null) __obj.updateDynamic("fetchPolicy")(fetchPolicy.asInstanceOf[js.Any])
    if (onComplete != null) __obj.updateDynamic("onComplete")(js.Any.fromFunction1((t0: /* args */ js.Error | scala.Null) => onComplete(t0).runNow()))
    if (renderPolicy != null) __obj.updateDynamic("renderPolicy")(renderPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFetchPolicy]
  }
}

