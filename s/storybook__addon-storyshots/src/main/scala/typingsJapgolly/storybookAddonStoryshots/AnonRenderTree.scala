package typingsJapgolly.storybookAddonStoryshots

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.storybookAddonStoryshots.frameworksLoaderMod.RenderTree
import typingsJapgolly.storybookAddonStoryshots.stories2SnapsConverterMod.Stories2SnapsConverter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRenderTree extends js.Object {
  var context: js.Any
  var renderTree: RenderTree
  var stories2snapsConverter: Stories2SnapsConverter
  var story: js.Any
}

object AnonRenderTree {
  @scala.inline
  def apply(
    context: js.Any,
    renderTree: (/* story */ js.Any, /* context */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => CallbackTo[js.Any],
    stories2snapsConverter: Stories2SnapsConverter,
    story: js.Any
  ): AnonRenderTree = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], stories2snapsConverter = stories2snapsConverter.asInstanceOf[js.Any], story = story.asInstanceOf[js.Any])
    __obj.updateDynamic("renderTree")(js.Any.fromFunction3((t0: /* story */ js.Any, t1: /* context */ js.UndefOr[js.Any], t2: /* options */ js.UndefOr[js.Any]) => renderTree(t0, t1, t2).runNow()))
    __obj.asInstanceOf[AnonRenderTree]
  }
}

