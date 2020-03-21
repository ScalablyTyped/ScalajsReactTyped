package typingsJapgolly.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssessmentTemplateFilter extends js.Object {
  /**
    * For a record to match a filter, the value specified for this data type property must inclusively match any value between the specified minimum and maximum values of the durationInSeconds property of the AssessmentTemplate data type.
    */
  var durationRange: js.UndefOr[DurationRange] = js.native
  /**
    * For a record to match a filter, an explicit value or a string that contains a wildcard that is specified for this data type property must match the value of the assessmentTemplateName property of the AssessmentTemplate data type.
    */
  var namePattern: js.UndefOr[NamePattern] = js.native
  /**
    * For a record to match a filter, the values that are specified for this data type property must be contained in the list of values of the rulesPackageArns property of the AssessmentTemplate data type.
    */
  var rulesPackageArns: js.UndefOr[FilterRulesPackageArnList] = js.native
}

object AssessmentTemplateFilter {
  @scala.inline
  def apply(
    durationRange: DurationRange = null,
    namePattern: NamePattern = null,
    rulesPackageArns: FilterRulesPackageArnList = null
  ): AssessmentTemplateFilter = {
    val __obj = js.Dynamic.literal()
    if (durationRange != null) __obj.updateDynamic("durationRange")(durationRange.asInstanceOf[js.Any])
    if (namePattern != null) __obj.updateDynamic("namePattern")(namePattern.asInstanceOf[js.Any])
    if (rulesPackageArns != null) __obj.updateDynamic("rulesPackageArns")(rulesPackageArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssessmentTemplateFilter]
  }
}

