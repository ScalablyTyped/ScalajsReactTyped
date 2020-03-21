package typingsJapgolly.officeJs.Excel

import typingsJapgolly.officeJs.officeJsStrings.Formula
import typingsJapgolly.officeJs.officeJsStrings.HighestValue
import typingsJapgolly.officeJs.officeJsStrings.Invalid
import typingsJapgolly.officeJs.officeJsStrings.LowestValue
import typingsJapgolly.officeJs.officeJsStrings.Number
import typingsJapgolly.officeJs.officeJsStrings.Percent
import typingsJapgolly.officeJs.officeJsStrings.Percentile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a Color Scale Criterion which contains a type, value, and a color.
  *
  * [Api set: ExcelApi 1.6]
  */
trait ConditionalColorScaleCriterion extends js.Object {
  /**
    *
    * HTML color code representation of the color scale color. E.g. #FF0000 represents Red.
    *
    * [Api set: ExcelApi 1.6]
    */
  var color: js.UndefOr[String] = js.undefined
  /**
    *
    * A number, a formula, or null (if Type is LowestValue).
    *
    * [Api set: ExcelApi 1.6]
    */
  var formula: js.UndefOr[String] = js.undefined
  /**
    *
    * What the criterion conditional formula should be based on.
    *
    * [Api set: ExcelApi 1.6]
    */
  var `type`: ConditionalFormatColorCriterionType | Invalid | LowestValue | HighestValue | Number | Percent | Formula | Percentile
}

object ConditionalColorScaleCriterion {
  @scala.inline
  def apply(
    `type`: ConditionalFormatColorCriterionType | Invalid | LowestValue | HighestValue | Number | Percent | Formula | Percentile,
    color: String = null,
    formula: String = null
  ): ConditionalColorScaleCriterion = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (formula != null) __obj.updateDynamic("formula")(formula.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalColorScaleCriterion]
  }
}

