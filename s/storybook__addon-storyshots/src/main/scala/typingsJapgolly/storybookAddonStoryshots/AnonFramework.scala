package typingsJapgolly.storybookAddonStoryshots

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.storybookAddonStoryshots.frameworksLoaderMod.ClientApi
import typingsJapgolly.storybookAddonStoryshots.frameworksLoaderMod.RenderTree
import typingsJapgolly.storybookAddonStoryshots.supportedFrameworkMod.SupportedFramework
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFramework extends js.Object {
  var framework: SupportedFramework
  var renderShallowTree: js.Any
  var renderTree: RenderTree
  var storybook: ClientApi
}

object AnonFramework {
  @scala.inline
  def apply(
    framework: SupportedFramework,
    renderShallowTree: js.Any,
    renderTree: (/* story */ js.Any, /* context */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => CallbackTo[js.Any],
    storybook: ClientApi
  ): AnonFramework = {
    val __obj = js.Dynamic.literal(framework = framework.asInstanceOf[js.Any], renderShallowTree = renderShallowTree.asInstanceOf[js.Any], storybook = storybook.asInstanceOf[js.Any])
    __obj.updateDynamic("renderTree")(js.Any.fromFunction3((t0: /* story */ js.Any, t1: /* context */ js.UndefOr[js.Any], t2: /* options */ js.UndefOr[js.Any]) => renderTree(t0, t1, t2).runNow()))
    __obj.asInstanceOf[AnonFramework]
  }
}

