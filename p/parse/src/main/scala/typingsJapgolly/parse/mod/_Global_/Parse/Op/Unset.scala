package typingsJapgolly.parse.mod._Global_.Parse.Op

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Unset extends js.Object {
  def toJSON(): js.Any
}

object Unset {
  @scala.inline
  def apply(toJSON: CallbackTo[js.Any]): Unset = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.asInstanceOf[Unset]
  }
}

