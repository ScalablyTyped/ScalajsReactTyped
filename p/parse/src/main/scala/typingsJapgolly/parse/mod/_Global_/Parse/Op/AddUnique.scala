package typingsJapgolly.parse.mod._Global_.Parse.Op

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddUnique extends BaseOperation {
  def toJSON(): js.Any
}

object AddUnique {
  @scala.inline
  def apply(objects: CallbackTo[js.Array[js.Any]], toJSON: CallbackTo[js.Any]): AddUnique = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("objects")(objects.toJsFn)
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.asInstanceOf[AddUnique]
  }
}

