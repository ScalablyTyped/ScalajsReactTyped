package typingsJapgolly.reactRelay.useRefetchableFragmentNodeMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactRelay.queryResourceMod.FetchPolicy
import typingsJapgolly.reactRelay.queryResourceMod.RenderPolicy
import typingsJapgolly.relayRuntime.relayRuntimeTypesMod.Variables
import typingsJapgolly.relayRuntime.relayStoreTypesMod.Environment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefetchState extends js.Object {
  var fetchPolicy: js.UndefOr[FetchPolicy] = js.undefined
  var mirroredEnvironment: Environment
  var mirroredFragmentIdentifier: String
  var onComplete: js.UndefOr[js.Function1[/* arg */ js.Error | Null, Unit]] = js.undefined
  var refetchEnvironment: js.UndefOr[Environment | Null] = js.undefined
  var refetchVariables: js.UndefOr[Variables | Null] = js.undefined
  var renderPolicy: js.UndefOr[RenderPolicy] = js.undefined
}

object RefetchState {
  @scala.inline
  def apply(
    mirroredEnvironment: Environment,
    mirroredFragmentIdentifier: String,
    fetchPolicy: FetchPolicy = null,
    onComplete: /* arg */ js.Error | Null => Callback = null,
    refetchEnvironment: Environment = null,
    refetchVariables: Variables = null,
    renderPolicy: RenderPolicy = null
  ): RefetchState = {
    val __obj = js.Dynamic.literal(mirroredEnvironment = mirroredEnvironment.asInstanceOf[js.Any], mirroredFragmentIdentifier = mirroredFragmentIdentifier.asInstanceOf[js.Any])
    if (fetchPolicy != null) __obj.updateDynamic("fetchPolicy")(fetchPolicy.asInstanceOf[js.Any])
    if (onComplete != null) __obj.updateDynamic("onComplete")(js.Any.fromFunction1((t0: /* arg */ js.Error | scala.Null) => onComplete(t0).runNow()))
    if (refetchEnvironment != null) __obj.updateDynamic("refetchEnvironment")(refetchEnvironment.asInstanceOf[js.Any])
    if (refetchVariables != null) __obj.updateDynamic("refetchVariables")(refetchVariables.asInstanceOf[js.Any])
    if (renderPolicy != null) __obj.updateDynamic("renderPolicy")(renderPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefetchState]
  }
}

