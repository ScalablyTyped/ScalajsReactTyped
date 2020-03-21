package typingsJapgolly.storybookClientApi.typesMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.storybookClientApi.storyStoreMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientApiParams extends js.Object {
  var decorateStory: js.UndefOr[js.Function2[/* storyFn */ js.Any, /* decorators */ js.Any, _]] = js.undefined
  var storyStore: default
}

object ClientApiParams {
  @scala.inline
  def apply(
    storyStore: default,
    decorateStory: (/* storyFn */ js.Any, /* decorators */ js.Any) => CallbackTo[js.Any] = null
  ): ClientApiParams = {
    val __obj = js.Dynamic.literal(storyStore = storyStore.asInstanceOf[js.Any])
    if (decorateStory != null) __obj.updateDynamic("decorateStory")(js.Any.fromFunction2((t0: /* storyFn */ js.Any, t1: /* decorators */ js.Any) => decorateStory(t0, t1).runNow()))
    __obj.asInstanceOf[ClientApiParams]
  }
}

