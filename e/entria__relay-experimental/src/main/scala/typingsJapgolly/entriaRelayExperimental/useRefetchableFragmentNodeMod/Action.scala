package typingsJapgolly.entriaRelayExperimental.useRefetchableFragmentNodeMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.entriaRelayExperimental.queryResourceMod.FetchPolicy
import typingsJapgolly.entriaRelayExperimental.queryResourceMod.RenderPolicy
import typingsJapgolly.relayRuntime.relayRuntimeTypesMod.Variables
import typingsJapgolly.relayRuntime.relayStoreTypesMod.Environment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.entriaRelayExperimental.AnonEnvironment
  - typingsJapgolly.entriaRelayExperimental.AnonFetchPolicy
*/
trait Action extends js.Object

object Action {
  @scala.inline
  def AnonEnvironment(environment: Environment, fragmentIdentifier: String, `type`: String): Action = {
    val __obj = js.Dynamic.literal(environment = environment.asInstanceOf[js.Any], fragmentIdentifier = fragmentIdentifier.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  @scala.inline
  def AnonFetchPolicy(
    environment: Environment,
    refetchVariables: Variables,
    `type`: String,
    fetchPolicy: FetchPolicy = null,
    onComplete: /* args */ js.Error | Null => Callback = null,
    renderPolicy: RenderPolicy = null
  ): Action = {
    val __obj = js.Dynamic.literal(environment = environment.asInstanceOf[js.Any], refetchVariables = refetchVariables.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (fetchPolicy != null) __obj.updateDynamic("fetchPolicy")(fetchPolicy.asInstanceOf[js.Any])
    if (onComplete != null) __obj.updateDynamic("onComplete")(js.Any.fromFunction1((t0: /* args */ js.Error | scala.Null) => onComplete(t0).runNow()))
    if (renderPolicy != null) __obj.updateDynamic("renderPolicy")(renderPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
}

