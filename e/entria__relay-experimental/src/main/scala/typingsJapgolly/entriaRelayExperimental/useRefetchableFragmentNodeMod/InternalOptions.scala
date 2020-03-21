package typingsJapgolly.entriaRelayExperimental.useRefetchableFragmentNodeMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.entriaRelayExperimental.queryResourceMod.FetchPolicy
import typingsJapgolly.entriaRelayExperimental.queryResourceMod.RenderPolicy
import typingsJapgolly.relayRuntime.relayStoreTypesMod.Environment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InternalOptions extends Options {
  var __environment: js.UndefOr[Environment] = js.undefined
  var renderPolicy: js.UndefOr[RenderPolicy] = js.undefined
}

object InternalOptions {
  @scala.inline
  def apply(
    __environment: Environment = null,
    fetchPolicy: FetchPolicy = null,
    onComplete: /* arg */ js.Error | Null => Callback = null,
    renderPolicy: RenderPolicy = null
  ): InternalOptions = {
    val __obj = js.Dynamic.literal()
    if (__environment != null) __obj.updateDynamic("__environment")(__environment.asInstanceOf[js.Any])
    if (fetchPolicy != null) __obj.updateDynamic("fetchPolicy")(fetchPolicy.asInstanceOf[js.Any])
    if (onComplete != null) __obj.updateDynamic("onComplete")(js.Any.fromFunction1((t0: /* arg */ js.Error | scala.Null) => onComplete(t0).runNow()))
    if (renderPolicy != null) __obj.updateDynamic("renderPolicy")(renderPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[InternalOptions]
  }
}

