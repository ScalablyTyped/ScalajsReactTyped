package typingsJapgolly.knuddelsUserappsApi

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.knuddelsUserappsApi.mod._Global_.KnuddelPot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOnPotSealed extends js.Object {
  var onPotSealed: js.UndefOr[js.Function1[/* pot */ KnuddelPot, Unit]] = js.undefined
  var payoutTimeoutMinutes: js.UndefOr[Double] = js.undefined
  var shouldSealPot: js.UndefOr[js.Function1[/* pot */ KnuddelPot, Boolean]] = js.undefined
}

object AnonOnPotSealed {
  @scala.inline
  def apply(
    onPotSealed: /* pot */ KnuddelPot => Callback = null,
    payoutTimeoutMinutes: Int | Double = null,
    shouldSealPot: /* pot */ KnuddelPot => CallbackTo[Boolean] = null
  ): AnonOnPotSealed = {
    val __obj = js.Dynamic.literal()
    if (onPotSealed != null) __obj.updateDynamic("onPotSealed")(js.Any.fromFunction1((t0: /* pot */ typingsJapgolly.knuddelsUserappsApi.mod._Global_.KnuddelPot) => onPotSealed(t0).runNow()))
    if (payoutTimeoutMinutes != null) __obj.updateDynamic("payoutTimeoutMinutes")(payoutTimeoutMinutes.asInstanceOf[js.Any])
    if (shouldSealPot != null) __obj.updateDynamic("shouldSealPot")(js.Any.fromFunction1((t0: /* pot */ typingsJapgolly.knuddelsUserappsApi.mod._Global_.KnuddelPot) => shouldSealPot(t0).runNow()))
    __obj.asInstanceOf[AnonOnPotSealed]
  }
}

