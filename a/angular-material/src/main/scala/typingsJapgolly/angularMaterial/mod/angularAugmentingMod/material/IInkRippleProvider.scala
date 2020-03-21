package typingsJapgolly.angularMaterial.mod.angularAugmentingMod.material

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInkRippleProvider extends js.Object {
  def disableInkRipple(): Unit
}

object IInkRippleProvider {
  @scala.inline
  def apply(disableInkRipple: Callback): IInkRippleProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("disableInkRipple")(disableInkRipple.toJsFn)
    __obj.asInstanceOf[IInkRippleProvider]
  }
}

