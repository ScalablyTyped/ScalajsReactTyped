package typingsJapgolly.storybookAddonStoryshots

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.storybookAddonStoryshots.frameworksLoaderMod.RenderTree
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOptions extends js.Object {
  var context: js.Any
  var options: js.Any
  var renderShallowTree: RenderTree
  var story: js.Any
}

object AnonOptions {
  @scala.inline
  def apply(
    context: js.Any,
    options: js.Any,
    renderShallowTree: (/* story */ js.Any, /* context */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => CallbackTo[js.Any],
    story: js.Any
  ): AnonOptions = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], story = story.asInstanceOf[js.Any])
    __obj.updateDynamic("renderShallowTree")(js.Any.fromFunction3((t0: /* story */ js.Any, t1: /* context */ js.UndefOr[js.Any], t2: /* options */ js.UndefOr[js.Any]) => renderShallowTree(t0, t1, t2).runNow()))
    __obj.asInstanceOf[AnonOptions]
  }
}

