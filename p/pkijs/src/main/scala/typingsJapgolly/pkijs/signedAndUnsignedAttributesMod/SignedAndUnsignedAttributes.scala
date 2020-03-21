package typingsJapgolly.pkijs.signedAndUnsignedAttributesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignedAndUnsignedAttributes extends js.Object {
  var attributes: js.Array[typingsJapgolly.pkijs.attributeMod.default]
  var encodedValue: scala.scalajs.js.typedarray.ArrayBuffer
  var `type`: String
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object SignedAndUnsignedAttributes {
  @scala.inline
  def apply(
    attributes: js.Array[typingsJapgolly.pkijs.attributeMod.default],
    encodedValue: scala.scalajs.js.typedarray.ArrayBuffer,
    fromSchema: js.Any => Callback,
    toJSON: CallbackTo[js.Any],
    toSchema: CallbackTo[js.Any],
    `type`: String
  ): SignedAndUnsignedAttributes = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], encodedValue = encodedValue.asInstanceOf[js.Any])
    __obj.updateDynamic("fromSchema")(js.Any.fromFunction1((t0: js.Any) => fromSchema(t0).runNow()))
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.updateDynamic("toSchema")(toSchema.toJsFn)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignedAndUnsignedAttributes]
  }
}

