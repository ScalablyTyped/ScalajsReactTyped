package typingsJapgolly.storybookAddonJsx

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.storybookAddonJsx.mod.AddWithJSXFunc
import typingsJapgolly.storybookAddonJsx.mod.AddonParameters
import typingsJapgolly.storybookAddons.typesMod.StoryApi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAddWithJSX[StoryFnReturnType] extends js.Object {
  var addWithJSX: AddWithJSXFunc[StoryFnReturnType]
}

object AnonAddWithJSX {
  @scala.inline
  def apply[StoryFnReturnType](
    addWithJSX: (/* kind */ String, /* fn */ js.Function0[Node], /* options */ js.UndefOr[AddonParameters]) => CallbackTo[StoryApi[StoryFnReturnType]]
  ): AnonAddWithJSX[StoryFnReturnType] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addWithJSX")(js.Any.fromFunction3((t0: /* kind */ java.lang.String, t1: /* fn */ js.Function0[japgolly.scalajs.react.raw.React.Node], t2: /* options */ js.UndefOr[typingsJapgolly.storybookAddonJsx.mod.AddonParameters]) => addWithJSX(t0, t1, t2).runNow()))
    __obj.asInstanceOf[AnonAddWithJSX[StoryFnReturnType]]
  }
}

