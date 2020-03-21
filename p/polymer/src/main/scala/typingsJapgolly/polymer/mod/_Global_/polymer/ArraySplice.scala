package typingsJapgolly.polymer.mod._Global_.polymer

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArraySplice extends js.Object {
  def calculateSplices[T](current: js.Array[T], previous: js.Array[T]): js.Array[PolymerSplice]
}

object ArraySplice {
  @scala.inline
  def apply(calculateSplices: (js.Array[js.Any], js.Array[js.Any]) => CallbackTo[js.Array[PolymerSplice]]): ArraySplice = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("calculateSplices")(js.Any.fromFunction2((t0: js.Array[js.Any], t1: js.Array[js.Any]) => calculateSplices(t0, t1).runNow()))
    __obj.asInstanceOf[ArraySplice]
  }
}

