package typingsJapgolly.node.inspectorMod.Runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetPropertiesReturnType extends js.Object {
  /**
    * Exception details.
    */
  var exceptionDetails: js.UndefOr[ExceptionDetails] = js.undefined
  /**
    * Internal object properties (only of the element itself).
    */
  var internalProperties: js.UndefOr[js.Array[InternalPropertyDescriptor]] = js.undefined
  /**
    * Object properties.
    */
  var result: js.Array[PropertyDescriptor]
}

object GetPropertiesReturnType {
  @scala.inline
  def apply(
    result: js.Array[PropertyDescriptor],
    exceptionDetails: ExceptionDetails = null,
    internalProperties: js.Array[InternalPropertyDescriptor] = null
  ): GetPropertiesReturnType = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    if (exceptionDetails != null) __obj.updateDynamic("exceptionDetails")(exceptionDetails.asInstanceOf[js.Any])
    if (internalProperties != null) __obj.updateDynamic("internalProperties")(internalProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPropertiesReturnType]
  }
}

