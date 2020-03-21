package typingsJapgolly.officeJsPreview.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the criteria of the color scale.
  *
  * [Api set: ExcelApi 1.6]
  */
trait ConditionalColorScaleCriteria extends js.Object {
  /**
    *
    * The maximum point Color Scale Criterion.
    *
    * [Api set: ExcelApi 1.6]
    */
  var maximum: ConditionalColorScaleCriterion
  /**
    *
    * The midpoint Color Scale Criterion if the color scale is a 3-color scale.
    *
    * [Api set: ExcelApi 1.6]
    */
  var midpoint: js.UndefOr[ConditionalColorScaleCriterion] = js.undefined
  /**
    *
    * The minimum point Color Scale Criterion.
    *
    * [Api set: ExcelApi 1.6]
    */
  var minimum: ConditionalColorScaleCriterion
}

object ConditionalColorScaleCriteria {
  @scala.inline
  def apply(
    maximum: ConditionalColorScaleCriterion,
    minimum: ConditionalColorScaleCriterion,
    midpoint: ConditionalColorScaleCriterion = null
  ): ConditionalColorScaleCriteria = {
    val __obj = js.Dynamic.literal(maximum = maximum.asInstanceOf[js.Any], minimum = minimum.asInstanceOf[js.Any])
    if (midpoint != null) __obj.updateDynamic("midpoint")(midpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalColorScaleCriteria]
  }
}

