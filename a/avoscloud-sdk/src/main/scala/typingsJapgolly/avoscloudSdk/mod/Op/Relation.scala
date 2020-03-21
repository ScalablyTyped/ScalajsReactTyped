package typingsJapgolly.avoscloudSdk.mod.Op

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.avoscloudSdk.mod.IBaseObject
import typingsJapgolly.avoscloudSdk.mod.Object
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Relation extends IBaseObject {
  var removed: js.Array[Object]
  def added(): js.Array[Object]
}

object Relation {
  @scala.inline
  def apply(added: CallbackTo[js.Array[Object]], removed: js.Array[Object], toJSON: CallbackTo[js.Any]): Relation = {
    val __obj = js.Dynamic.literal(removed = removed.asInstanceOf[js.Any])
    __obj.updateDynamic("added")(added.toJsFn)
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.asInstanceOf[Relation]
  }
}

