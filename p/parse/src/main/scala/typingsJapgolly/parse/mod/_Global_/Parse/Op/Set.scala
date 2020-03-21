package typingsJapgolly.parse.mod._Global_.Parse.Op

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Set extends js.Object {
  def toJSON(): js.Any
  def value(): js.Any
}

object Set {
  @scala.inline
  def apply(toJSON: CallbackTo[js.Any], value: CallbackTo[js.Any]): Set = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.updateDynamic("value")(value.toJsFn)
    __obj.asInstanceOf[Set]
  }
}

