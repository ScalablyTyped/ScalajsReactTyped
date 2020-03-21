package typingsJapgolly.materialDrawer.focusTrapMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Pick<@material/drawer.@material/drawer/focus-trap.Options, 'onDeactivate'> */
trait DeactivateOptions extends js.Object {
  var onDeactivate: js.UndefOr[js.Function0[Unit]] = js.undefined
  var returnFocus: js.UndefOr[Boolean] = js.undefined
}

object DeactivateOptions {
  @scala.inline
  def apply(onDeactivate: js.UndefOr[Callback] = js.undefined, returnFocus: js.UndefOr[Boolean] = js.undefined): DeactivateOptions = {
    val __obj = js.Dynamic.literal()
    onDeactivate.foreach(p => __obj.updateDynamic("onDeactivate")(p.toJsFn))
    if (!js.isUndefined(returnFocus)) __obj.updateDynamic("returnFocus")(returnFocus.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeactivateOptions]
  }
}

