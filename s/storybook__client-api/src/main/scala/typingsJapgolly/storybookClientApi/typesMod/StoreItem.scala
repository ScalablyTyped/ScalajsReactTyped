package typingsJapgolly.storybookClientApi.typesMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.storybookAddons.typesMod.Parameters
import typingsJapgolly.storybookAddons.typesMod.StoryContext
import typingsJapgolly.storybookAddons.typesMod.StoryFn
import typingsJapgolly.storybookClientApi.hooksMod.HooksContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoreItem extends StoryContext {
  @JSName("hooks")
  var hooks_StoreItem: HooksContext
  var story: String
  var storyFn: StoryFn[_]
  def getDecorated(): StoryFn[_]
  def getOriginal(): StoryFn[_]
}

object StoreItem {
  @scala.inline
  def apply(
    getDecorated: CallbackTo[StoryFn[js.Any]],
    getOriginal: CallbackTo[StoryFn[js.Any]],
    hooks: HooksContext,
    id: String,
    kind: String,
    name: String,
    parameters: Parameters,
    story: String,
    storyFn: /* p */ js.UndefOr[StoryContext] => CallbackTo[js.Any]
  ): StoreItem = {
    val __obj = js.Dynamic.literal(hooks = hooks.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], story = story.asInstanceOf[js.Any])
    __obj.updateDynamic("getDecorated")(getDecorated.toJsFn)
    __obj.updateDynamic("getOriginal")(getOriginal.toJsFn)
    __obj.updateDynamic("storyFn")(js.Any.fromFunction1((t0: /* p */ js.UndefOr[typingsJapgolly.storybookAddons.typesMod.StoryContext]) => storyFn(t0).runNow()))
    __obj.asInstanceOf[StoreItem]
  }
}

