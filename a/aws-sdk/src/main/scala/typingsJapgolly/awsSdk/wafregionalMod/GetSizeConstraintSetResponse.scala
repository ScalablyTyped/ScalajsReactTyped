package typingsJapgolly.awsSdk.wafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSizeConstraintSetResponse extends js.Object {
  /**
    * Information about the SizeConstraintSet that you specified in the GetSizeConstraintSet request. For more information, see the following topics:    SizeConstraintSet: Contains SizeConstraintSetId, SizeConstraints, and Name     SizeConstraints: Contains an array of SizeConstraint objects. Each SizeConstraint object contains FieldToMatch, TextTransformation, ComparisonOperator, and Size     FieldToMatch: Contains Data and Type   
    */
  var SizeConstraintSet: js.UndefOr[typingsJapgolly.awsSdk.wafregionalMod.SizeConstraintSet] = js.native
}

object GetSizeConstraintSetResponse {
  @scala.inline
  def apply(SizeConstraintSet: SizeConstraintSet = null): GetSizeConstraintSetResponse = {
    val __obj = js.Dynamic.literal()
    if (SizeConstraintSet != null) __obj.updateDynamic("SizeConstraintSet")(SizeConstraintSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSizeConstraintSetResponse]
  }
}

