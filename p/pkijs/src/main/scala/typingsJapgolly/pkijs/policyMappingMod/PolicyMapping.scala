package typingsJapgolly.pkijs.policyMappingMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyMapping extends js.Object {
  var issuerDomainPolicy: String
  var subjectDomainPolicy: String
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object PolicyMapping {
  @scala.inline
  def apply(
    fromSchema: js.Any => Callback,
    issuerDomainPolicy: String,
    subjectDomainPolicy: String,
    toJSON: CallbackTo[js.Any],
    toSchema: CallbackTo[js.Any]
  ): PolicyMapping = {
    val __obj = js.Dynamic.literal(issuerDomainPolicy = issuerDomainPolicy.asInstanceOf[js.Any], subjectDomainPolicy = subjectDomainPolicy.asInstanceOf[js.Any])
    __obj.updateDynamic("fromSchema")(js.Any.fromFunction1((t0: js.Any) => fromSchema(t0).runNow()))
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.updateDynamic("toSchema")(toSchema.toJsFn)
    __obj.asInstanceOf[PolicyMapping]
  }
}

