package typingsJapgolly.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAllowedValues extends js.Object {
  var all: Double
  var allowedValues: Double
  var dependentFields: Double
  var none: Double
}

object AnonAllowedValues {
  @scala.inline
  def apply(all: Double, allowedValues: Double, dependentFields: Double, none: Double): AnonAllowedValues = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], allowedValues = allowedValues.asInstanceOf[js.Any], dependentFields = dependentFields.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAllowedValues]
  }
}

