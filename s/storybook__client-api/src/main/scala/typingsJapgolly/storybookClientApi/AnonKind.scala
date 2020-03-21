package typingsJapgolly.storybookClientApi

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.storybookAddons.typesMod.Parameters
import typingsJapgolly.storybookAddons.typesMod.StoryContext
import typingsJapgolly.storybookAddons.typesMod.StoryFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKind extends js.Object {
  var kind: String
  var name: String
  var parameters: Parameters
  var storyFn: StoryFn[_]
}

object AnonKind {
  @scala.inline
  def apply(
    kind: String,
    name: String,
    parameters: Parameters,
    storyFn: /* p */ js.UndefOr[StoryContext] => CallbackTo[js.Any]
  ): AnonKind = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("storyFn")(js.Any.fromFunction1((t0: /* p */ js.UndefOr[typingsJapgolly.storybookAddons.typesMod.StoryContext]) => storyFn(t0).runNow()))
    __obj.asInstanceOf[AnonKind]
  }
}

