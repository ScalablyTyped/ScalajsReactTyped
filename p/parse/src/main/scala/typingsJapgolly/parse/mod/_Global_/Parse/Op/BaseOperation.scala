package typingsJapgolly.parse.mod._Global_.Parse.Op

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseOperation extends js.Object {
  def objects(): js.Array[_]
}

object BaseOperation {
  @scala.inline
  def apply(objects: CallbackTo[js.Array[js.Any]]): BaseOperation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("objects")(objects.toJsFn)
    __obj.asInstanceOf[BaseOperation]
  }
}

