package typingsJapgolly.storybookClientApi.typesMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.storybookAddons.typesMod.Parameters
import typingsJapgolly.storybookAddons.typesMod.StoryContext
import typingsJapgolly.storybookAddons.typesMod.StoryFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddStoryArgs extends js.Object {
  var id: String
  var kind: String
  var name: String
  var parameters: Parameters
  var storyFn: StoryFn[_]
}

object AddStoryArgs {
  @scala.inline
  def apply(
    id: String,
    kind: String,
    name: String,
    parameters: Parameters,
    storyFn: /* p */ js.UndefOr[StoryContext] => CallbackTo[js.Any]
  ): AddStoryArgs = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("storyFn")(js.Any.fromFunction1((t0: /* p */ js.UndefOr[typingsJapgolly.storybookAddons.typesMod.StoryContext]) => storyFn(t0).runNow()))
    __obj.asInstanceOf[AddStoryArgs]
  }
}

