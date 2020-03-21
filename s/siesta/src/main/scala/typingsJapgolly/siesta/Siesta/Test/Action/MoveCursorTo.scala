package typingsJapgolly.siesta.Siesta.Test.Action

import typingsJapgolly.siesta.Siesta.Test.Action.Role.IHasTarget
import typingsJapgolly.siesta.Siesta.Test.IAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  */
trait MoveCursorTo
  extends IAction
     with IHasTarget

object MoveCursorTo {
  @scala.inline
  def apply(
    desc: String = null,
    el: js.Any = null,
    passTargetToNext: js.UndefOr[Boolean] = js.undefined,
    target: js.Any = null
  ): MoveCursorTo = {
    val __obj = js.Dynamic.literal()
    if (desc != null) __obj.updateDynamic("desc")(desc.asInstanceOf[js.Any])
    if (el != null) __obj.updateDynamic("el")(el.asInstanceOf[js.Any])
    if (!js.isUndefined(passTargetToNext)) __obj.updateDynamic("passTargetToNext")(passTargetToNext.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[MoveCursorTo]
  }
}

