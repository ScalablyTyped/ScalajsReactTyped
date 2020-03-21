package typingsJapgolly.bitwise

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.bitwise.bitwiseTypesMod.Bit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon1 extends js.Object {
  def toBits(string: String): js.Array[Bit]
}

object Anon1 {
  @scala.inline
  def apply(toBits: String => CallbackTo[js.Array[Bit]]): Anon1 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("toBits")(js.Any.fromFunction1((t0: java.lang.String) => toBits(t0).runNow()))
    __obj.asInstanceOf[Anon1]
  }
}

