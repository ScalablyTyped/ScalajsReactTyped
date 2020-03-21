package typingsJapgolly.athenajs.mod

import typingsJapgolly.athenajs.AnonInstantiableEffect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FXInstance extends js.Object {
  def addFX(fxName: String, FxClass: AnonInstantiableEffect): Unit
}

object FXInstance {
  @scala.inline
  def apply(addFX: (String, AnonInstantiableEffect) => japgolly.scalajs.react.Callback): FXInstance = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addFX")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.athenajs.AnonInstantiableEffect) => addFX(t0, t1).runNow()))
    __obj.asInstanceOf[FXInstance]
  }
}

