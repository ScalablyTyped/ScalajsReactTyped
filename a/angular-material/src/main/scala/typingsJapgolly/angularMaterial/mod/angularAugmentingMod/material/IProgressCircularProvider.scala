package typingsJapgolly.angularMaterial.mod.angularAugmentingMod.material

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProgressCircularProvider extends js.Object {
  def configure(options: IProgressCircularConfig): Unit
}

object IProgressCircularProvider {
  @scala.inline
  def apply(configure: IProgressCircularConfig => Callback): IProgressCircularProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("configure")(js.Any.fromFunction1((t0: typingsJapgolly.angularMaterial.mod.angularAugmentingMod.material.IProgressCircularConfig) => configure(t0).runNow()))
    __obj.asInstanceOf[IProgressCircularProvider]
  }
}

