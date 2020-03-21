package typingsJapgolly.pkijs.encapsulatedContentInfoMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.asn1js.mod.OctetString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncapsulatedContentInfo extends js.Object {
  var eContent: OctetString
  var eContentType: String
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object EncapsulatedContentInfo {
  @scala.inline
  def apply(
    eContent: OctetString,
    eContentType: String,
    fromSchema: js.Any => Callback,
    toJSON: CallbackTo[js.Any],
    toSchema: CallbackTo[js.Any]
  ): EncapsulatedContentInfo = {
    val __obj = js.Dynamic.literal(eContent = eContent.asInstanceOf[js.Any], eContentType = eContentType.asInstanceOf[js.Any])
    __obj.updateDynamic("fromSchema")(js.Any.fromFunction1((t0: js.Any) => fromSchema(t0).runNow()))
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.updateDynamic("toSchema")(toSchema.toJsFn)
    __obj.asInstanceOf[EncapsulatedContentInfo]
  }
}

