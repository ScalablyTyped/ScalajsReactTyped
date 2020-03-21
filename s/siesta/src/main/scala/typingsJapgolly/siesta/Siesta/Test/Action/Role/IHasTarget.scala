package typingsJapgolly.siesta.Siesta.Test.Action.Role

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @mixin
  */
trait IHasTarget extends js.Object {
  var el: js.UndefOr[js.Any] = js.undefined
  var passTargetToNext: js.UndefOr[Boolean] = js.undefined
  var target: js.UndefOr[js.Any] = js.undefined
}

object IHasTarget {
  @scala.inline
  def apply(el: js.Any = null, passTargetToNext: js.UndefOr[Boolean] = js.undefined, target: js.Any = null): IHasTarget = {
    val __obj = js.Dynamic.literal()
    if (el != null) __obj.updateDynamic("el")(el.asInstanceOf[js.Any])
    if (!js.isUndefined(passTargetToNext)) __obj.updateDynamic("passTargetToNext")(passTargetToNext.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHasTarget]
  }
}

