package typingsJapgolly.angularMaterial.mod.angularAugmentingMod.material

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAriaProvider extends js.Object {
  def disableWarnings(): Unit
}

object IAriaProvider {
  @scala.inline
  def apply(disableWarnings: Callback): IAriaProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("disableWarnings")(disableWarnings.toJsFn)
    __obj.asInstanceOf[IAriaProvider]
  }
}

