package typingsJapgolly.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypedAttributeValueRange extends js.Object {
  /**
    * The inclusive or exclusive range end.
    */
  var EndMode: RangeMode = js.native
  /**
    * The attribute value to terminate the range at.
    */
  var EndValue: js.UndefOr[TypedAttributeValue] = js.native
  /**
    * The inclusive or exclusive range start.
    */
  var StartMode: RangeMode = js.native
  /**
    * The value to start the range at.
    */
  var StartValue: js.UndefOr[TypedAttributeValue] = js.native
}

object TypedAttributeValueRange {
  @scala.inline
  def apply(
    EndMode: RangeMode,
    StartMode: RangeMode,
    EndValue: TypedAttributeValue = null,
    StartValue: TypedAttributeValue = null
  ): TypedAttributeValueRange = {
    val __obj = js.Dynamic.literal(EndMode = EndMode.asInstanceOf[js.Any], StartMode = StartMode.asInstanceOf[js.Any])
    if (EndValue != null) __obj.updateDynamic("EndValue")(EndValue.asInstanceOf[js.Any])
    if (StartValue != null) __obj.updateDynamic("StartValue")(StartValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypedAttributeValueRange]
  }
}

