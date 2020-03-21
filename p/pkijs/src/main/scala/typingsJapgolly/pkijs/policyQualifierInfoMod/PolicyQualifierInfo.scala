package typingsJapgolly.pkijs.policyQualifierInfoMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyQualifierInfo extends js.Object {
  var policyQualifierId: String
  var qualifier: js.Any
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object PolicyQualifierInfo {
  @scala.inline
  def apply(
    fromSchema: js.Any => Callback,
    policyQualifierId: String,
    qualifier: js.Any,
    toJSON: CallbackTo[js.Any],
    toSchema: CallbackTo[js.Any]
  ): PolicyQualifierInfo = {
    val __obj = js.Dynamic.literal(policyQualifierId = policyQualifierId.asInstanceOf[js.Any], qualifier = qualifier.asInstanceOf[js.Any])
    __obj.updateDynamic("fromSchema")(js.Any.fromFunction1((t0: js.Any) => fromSchema(t0).runNow()))
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.updateDynamic("toSchema")(toSchema.toJsFn)
    __obj.asInstanceOf[PolicyQualifierInfo]
  }
}

