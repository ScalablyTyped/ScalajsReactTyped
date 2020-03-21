package typingsJapgolly.materialDrawer.focusTrapMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<@material/drawer.@material/drawer/focus-trap.Options, 'onActivate'> */
trait ActivateOptions extends js.Object {
  var onActivate: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object ActivateOptions {
  @scala.inline
  def apply(onActivate: js.UndefOr[Callback] = js.undefined): ActivateOptions = {
    val __obj = js.Dynamic.literal()
    onActivate.foreach(p => __obj.updateDynamic("onActivate")(p.toJsFn))
    __obj.asInstanceOf[ActivateOptions]
  }
}

