package typingsJapgolly.parse.mod._Global_.Parse.Op

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Increment extends js.Object {
  var amount: Double
  def toJSON(): js.Any
}

object Increment {
  @scala.inline
  def apply(amount: Double, toJSON: CallbackTo[js.Any]): Increment = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any])
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.asInstanceOf[Increment]
  }
}

