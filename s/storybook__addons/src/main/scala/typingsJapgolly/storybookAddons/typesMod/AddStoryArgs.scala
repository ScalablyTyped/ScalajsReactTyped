package typingsJapgolly.storybookAddons.typesMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddStoryArgs[StoryFnReturnType] extends js.Object {
  var id: String
  var kind: String
  var name: String
  var parameters: Parameters
  var storyFn: StoryFn[StoryFnReturnType]
}

object AddStoryArgs {
  @scala.inline
  def apply[StoryFnReturnType](
    id: String,
    kind: String,
    name: String,
    parameters: Parameters,
    storyFn: /* p */ js.UndefOr[StoryContext] => CallbackTo[StoryFnReturnType]
  ): AddStoryArgs[StoryFnReturnType] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("storyFn")(js.Any.fromFunction1((t0: /* p */ js.UndefOr[typingsJapgolly.storybookAddons.typesMod.StoryContext]) => storyFn(t0).runNow()))
    __obj.asInstanceOf[AddStoryArgs[StoryFnReturnType]]
  }
}

