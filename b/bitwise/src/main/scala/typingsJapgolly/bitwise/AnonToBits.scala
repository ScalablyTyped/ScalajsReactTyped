package typingsJapgolly.bitwise

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.bitwise.typesMod.Bit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonToBits extends js.Object {
  def toBits(string: String): js.Array[Bit]
}

object AnonToBits {
  @scala.inline
  def apply(toBits: String => CallbackTo[js.Array[Bit]]): AnonToBits = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("toBits")(js.Any.fromFunction1((t0: java.lang.String) => toBits(t0).runNow()))
    __obj.asInstanceOf[AnonToBits]
  }
}

