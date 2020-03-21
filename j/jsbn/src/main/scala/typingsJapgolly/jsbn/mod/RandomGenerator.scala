package typingsJapgolly.jsbn.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RandomGenerator extends js.Object {
  def nextBytes(bytes: js.Array[Double]): Unit
}

object RandomGenerator {
  @scala.inline
  def apply(nextBytes: js.Array[Double] => Callback): RandomGenerator = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("nextBytes")(js.Any.fromFunction1((t0: js.Array[scala.Double]) => nextBytes(t0).runNow()))
    __obj.asInstanceOf[RandomGenerator]
  }
}

