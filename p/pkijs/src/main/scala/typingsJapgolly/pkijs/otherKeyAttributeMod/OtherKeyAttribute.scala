package typingsJapgolly.pkijs.otherKeyAttributeMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OtherKeyAttribute extends js.Object {
  var keyAttr: js.Any
  var keyAttrId: String
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object OtherKeyAttribute {
  @scala.inline
  def apply(
    fromSchema: js.Any => Callback,
    keyAttr: js.Any,
    keyAttrId: String,
    toJSON: CallbackTo[js.Any],
    toSchema: CallbackTo[js.Any]
  ): OtherKeyAttribute = {
    val __obj = js.Dynamic.literal(keyAttr = keyAttr.asInstanceOf[js.Any], keyAttrId = keyAttrId.asInstanceOf[js.Any])
    __obj.updateDynamic("fromSchema")(js.Any.fromFunction1((t0: js.Any) => fromSchema(t0).runNow()))
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.updateDynamic("toSchema")(toSchema.toJsFn)
    __obj.asInstanceOf[OtherKeyAttribute]
  }
}

