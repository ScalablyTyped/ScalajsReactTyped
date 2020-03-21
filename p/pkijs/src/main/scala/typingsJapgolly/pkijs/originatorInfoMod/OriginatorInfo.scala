package typingsJapgolly.pkijs.originatorInfoMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OriginatorInfo extends js.Object {
  var certs: typingsJapgolly.pkijs.certificateSetMod.default
  var crls: typingsJapgolly.pkijs.revocationInfoChoicesMod.default
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object OriginatorInfo {
  @scala.inline
  def apply(
    certs: typingsJapgolly.pkijs.certificateSetMod.default,
    crls: typingsJapgolly.pkijs.revocationInfoChoicesMod.default,
    fromSchema: js.Any => Callback,
    toJSON: CallbackTo[js.Any],
    toSchema: CallbackTo[js.Any]
  ): OriginatorInfo = {
    val __obj = js.Dynamic.literal(certs = certs.asInstanceOf[js.Any], crls = crls.asInstanceOf[js.Any])
    __obj.updateDynamic("fromSchema")(js.Any.fromFunction1((t0: js.Any) => fromSchema(t0).runNow()))
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.updateDynamic("toSchema")(toSchema.toJsFn)
    __obj.asInstanceOf[OriginatorInfo]
  }
}

