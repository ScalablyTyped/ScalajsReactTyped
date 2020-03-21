package typingsJapgolly.angularMaterial.mod.angularAugmentingMod.material

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.angularMaterial.AnonMethods
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDialogProvider extends js.Object {
  def addPreset(presetName: String, presetOptions: AnonMethods): IDialogProvider
}

object IDialogProvider {
  @scala.inline
  def apply(addPreset: (String, AnonMethods) => CallbackTo[IDialogProvider]): IDialogProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addPreset")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.angularMaterial.AnonMethods) => addPreset(t0, t1).runNow()))
    __obj.asInstanceOf[IDialogProvider]
  }
}

