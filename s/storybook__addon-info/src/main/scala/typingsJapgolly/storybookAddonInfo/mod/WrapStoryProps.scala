package typingsJapgolly.storybookAddonInfo.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.storybookAddons.typesMod.StoryContext
import typingsJapgolly.storybookAddons.typesMod.StoryFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WrapStoryProps extends js.Object {
  var context: js.UndefOr[js.Object] = js.undefined
  var options: js.UndefOr[js.Object] = js.undefined
  var storyFn: js.UndefOr[StoryFn[_]] = js.undefined
}

object WrapStoryProps {
  @scala.inline
  def apply(
    context: js.Object = null,
    options: js.Object = null,
    storyFn: /* p */ js.UndefOr[StoryContext] => CallbackTo[js.Any] = null
  ): WrapStoryProps = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (storyFn != null) __obj.updateDynamic("storyFn")(js.Any.fromFunction1((t0: /* p */ js.UndefOr[typingsJapgolly.storybookAddons.typesMod.StoryContext]) => storyFn(t0).runNow()))
    __obj.asInstanceOf[WrapStoryProps]
  }
}

