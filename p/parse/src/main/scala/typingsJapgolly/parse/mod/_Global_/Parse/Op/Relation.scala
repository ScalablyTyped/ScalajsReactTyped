package typingsJapgolly.parse.mod._Global_.Parse.Op

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.parse.mod._Global_.Parse.Attributes
import typingsJapgolly.parse.mod._Global_.Parse.Object
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Relation extends js.Object {
  var removed: js.Array[Object[Attributes]]
  def added(): js.Array[Object[Attributes]]
  def toJSON(): js.Any
}

object Relation {
  @scala.inline
  def apply(
    added: CallbackTo[js.Array[Object[Attributes]]],
    removed: js.Array[Object[Attributes]],
    toJSON: CallbackTo[js.Any]
  ): Relation = {
    val __obj = js.Dynamic.literal(removed = removed.asInstanceOf[js.Any])
    __obj.updateDynamic("added")(added.toJsFn)
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.asInstanceOf[Relation]
  }
}

