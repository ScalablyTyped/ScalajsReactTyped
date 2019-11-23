package typingsJapgolly.atStorybookAddons.distHooksMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Effect extends js.Object {
  var destroy: js.UndefOr[js.Function0[Unit] | Unit] = js.undefined
  def create(): js.Function0[Unit] | Unit
}

object Effect {
  @scala.inline
  def apply(create: CallbackTo[js.Function0[Unit] | Unit], destroy: js.Function0[Unit] | Unit = null): Effect = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(create.toJsFn)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Effect]
  }
}

