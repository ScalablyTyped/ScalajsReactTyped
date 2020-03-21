package typingsJapgolly.pkijs.policyInformationMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyInformation extends js.Object {
  var policyIdentifier: String
  /**
    * Value of the TIME class 
    */
  var policyQualifiers: js.Array[typingsJapgolly.pkijs.policyQualifierInfoMod.default]
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object PolicyInformation {
  @scala.inline
  def apply(
    fromSchema: js.Any => Callback,
    policyIdentifier: String,
    policyQualifiers: js.Array[typingsJapgolly.pkijs.policyQualifierInfoMod.default],
    toJSON: CallbackTo[js.Any],
    toSchema: CallbackTo[js.Any]
  ): PolicyInformation = {
    val __obj = js.Dynamic.literal(policyIdentifier = policyIdentifier.asInstanceOf[js.Any], policyQualifiers = policyQualifiers.asInstanceOf[js.Any])
    __obj.updateDynamic("fromSchema")(js.Any.fromFunction1((t0: js.Any) => fromSchema(t0).runNow()))
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.updateDynamic("toSchema")(toSchema.toJsFn)
    __obj.asInstanceOf[PolicyInformation]
  }
}

