package typingsJapgolly.traverson.mod.Traverson

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Traversal extends js.Object {
  def continue(): Builder
}

object Traversal {
  @scala.inline
  def apply(continue: CallbackTo[Builder]): Traversal = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("continue")(continue.toJsFn)
    __obj.asInstanceOf[Traversal]
  }
}

