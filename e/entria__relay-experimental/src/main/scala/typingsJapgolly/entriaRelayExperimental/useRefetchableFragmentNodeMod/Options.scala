package typingsJapgolly.entriaRelayExperimental.useRefetchableFragmentNodeMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.entriaRelayExperimental.queryResourceMod.FetchPolicy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var fetchPolicy: js.UndefOr[FetchPolicy] = js.undefined
  var onComplete: js.UndefOr[js.Function1[/* arg */ js.Error | Null, Unit]] = js.undefined
}

object Options {
  @scala.inline
  def apply(fetchPolicy: FetchPolicy = null, onComplete: /* arg */ js.Error | Null => Callback = null): Options = {
    val __obj = js.Dynamic.literal()
    if (fetchPolicy != null) __obj.updateDynamic("fetchPolicy")(fetchPolicy.asInstanceOf[js.Any])
    if (onComplete != null) __obj.updateDynamic("onComplete")(js.Any.fromFunction1((t0: /* arg */ js.Error | scala.Null) => onComplete(t0).runNow()))
    __obj.asInstanceOf[Options]
  }
}

