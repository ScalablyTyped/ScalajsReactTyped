package typingsJapgolly.angularMaterial

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.angularMaterial.mod.angularAugmentingMod.material.IDialogOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMethods extends js.Object {
  var methods: js.UndefOr[js.Array[String]] = js.undefined
  def options(): IDialogOptions
}

object AnonMethods {
  @scala.inline
  def apply(options: CallbackTo[IDialogOptions], methods: js.Array[String] = null): AnonMethods = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("options")(options.toJsFn)
    if (methods != null) __obj.updateDynamic("methods")(methods.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMethods]
  }
}

