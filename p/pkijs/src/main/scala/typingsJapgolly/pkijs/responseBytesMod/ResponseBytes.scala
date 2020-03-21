package typingsJapgolly.pkijs.responseBytesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.asn1js.mod.OctetString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseBytes extends js.Object {
  var response: OctetString
  var responseType: String
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object ResponseBytes {
  @scala.inline
  def apply(
    fromSchema: js.Any => Callback,
    response: OctetString,
    responseType: String,
    toJSON: CallbackTo[js.Any],
    toSchema: CallbackTo[js.Any]
  ): ResponseBytes = {
    val __obj = js.Dynamic.literal(response = response.asInstanceOf[js.Any], responseType = responseType.asInstanceOf[js.Any])
    __obj.updateDynamic("fromSchema")(js.Any.fromFunction1((t0: js.Any) => fromSchema(t0).runNow()))
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.updateDynamic("toSchema")(toSchema.toJsFn)
    __obj.asInstanceOf[ResponseBytes]
  }
}

