package typingsJapgolly.sigmajs.SigmaJs

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomShapes extends js.Object {
  def init(sigma: Sigma): Unit
}

object CustomShapes {
  @scala.inline
  def apply(init: Sigma => Callback): CustomShapes = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("init")(js.Any.fromFunction1((t0: typingsJapgolly.sigmajs.SigmaJs.Sigma) => init(t0).runNow()))
    __obj.asInstanceOf[CustomShapes]
  }
}

