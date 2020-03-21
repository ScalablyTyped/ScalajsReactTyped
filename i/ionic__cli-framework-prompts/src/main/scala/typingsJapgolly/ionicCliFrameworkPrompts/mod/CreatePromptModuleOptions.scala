package typingsJapgolly.ionicCliFrameworkPrompts.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreatePromptModuleOptions extends js.Object {
  val interactive: js.UndefOr[Boolean] = js.undefined
  val onFallback: js.UndefOr[js.Function1[/* question */ PromptQuestion, PromptValue | Unit]] = js.undefined
}

object CreatePromptModuleOptions {
  @scala.inline
  def apply(
    interactive: js.UndefOr[Boolean] = js.undefined,
    onFallback: /* question */ PromptQuestion => CallbackTo[PromptValue | Unit] = null
  ): CreatePromptModuleOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(interactive)) __obj.updateDynamic("interactive")(interactive.asInstanceOf[js.Any])
    if (onFallback != null) __obj.updateDynamic("onFallback")(js.Any.fromFunction1((t0: /* question */ typingsJapgolly.ionicCliFrameworkPrompts.mod.PromptQuestion) => onFallback(t0).runNow()))
    __obj.asInstanceOf[CreatePromptModuleOptions]
  }
}

