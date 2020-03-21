package typingsJapgolly.awsSdk.datapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Selector extends js.Object {
  /**
    * The name of the field that the operator will be applied to. The field name is the "key" portion of the field definition in the pipeline definition syntax that is used by the AWS Data Pipeline API. If the field is not set on the object, the condition fails.
    */
  var fieldName: js.UndefOr[String] = js.native
  var operator: js.UndefOr[Operator] = js.native
}

object Selector {
  @scala.inline
  def apply(fieldName: String = null, operator: Operator = null): Selector = {
    val __obj = js.Dynamic.literal()
    if (fieldName != null) __obj.updateDynamic("fieldName")(fieldName.asInstanceOf[js.Any])
    if (operator != null) __obj.updateDynamic("operator")(operator.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selector]
  }
}

