package typingsJapgolly.baconjs.updatebarrierMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Observable extends js.Object {
  var id: Double
  def internalDeps(): js.Array[Observable]
}

object Observable {
  @scala.inline
  def apply(id: Double, internalDeps: CallbackTo[js.Array[Observable]]): Observable = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("internalDeps")(internalDeps.toJsFn)
    __obj.asInstanceOf[Observable]
  }
}

