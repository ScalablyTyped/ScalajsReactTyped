package typingsJapgolly.backlogJs.mod.Option.Project

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PatchCustomFieldWithDateParams extends PatchCustomFieldParams {
  var initialDate: js.UndefOr[String] = js.undefined
  var initialShift: js.UndefOr[Double] = js.undefined
  var initialValueType: js.UndefOr[Double] = js.undefined
  var max: js.UndefOr[String] = js.undefined
  var min: js.UndefOr[String] = js.undefined
}

object PatchCustomFieldWithDateParams {
  @scala.inline
  def apply(
    applicableIssueTypes: js.Array[Double] = null,
    description: String = null,
    initialDate: String = null,
    initialShift: Int | Double = null,
    initialValueType: Int | Double = null,
    max: String = null,
    min: String = null,
    name: String = null,
    required: js.UndefOr[Boolean] = js.undefined
  ): PatchCustomFieldWithDateParams = {
    val __obj = js.Dynamic.literal()
    if (applicableIssueTypes != null) __obj.updateDynamic("applicableIssueTypes")(applicableIssueTypes.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (initialDate != null) __obj.updateDynamic("initialDate")(initialDate.asInstanceOf[js.Any])
    if (initialShift != null) __obj.updateDynamic("initialShift")(initialShift.asInstanceOf[js.Any])
    if (initialValueType != null) __obj.updateDynamic("initialValueType")(initialValueType.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatchCustomFieldWithDateParams]
  }
}

