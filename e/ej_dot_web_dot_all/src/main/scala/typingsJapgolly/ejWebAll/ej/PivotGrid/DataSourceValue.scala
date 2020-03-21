package typingsJapgolly.ejWebAll.ej.PivotGrid

import typingsJapgolly.ejWebAll.ej.PivotAnalysis.SummaryType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceValue extends js.Object {
  /** Allows you to set the axis name to place measures items.
    * @Default {rows}
    */
  var axis: js.UndefOr[String] = js.undefined
  /** Allows to set the custom theme for values.
    */
  var cssClass: js.UndefOr[String] = js.undefined
  /** Allows you to set the display caption for the item in the relational datasource.
    */
  var fieldCaption: js.UndefOr[String] = js.undefined
  /** Allows you to bind the item by using its unique name as field name for the relational datasource.
    */
  var fieldName: js.UndefOr[String] = js.undefined
  /** Allows to set the format for values.
    */
  var format: js.UndefOr[String] = js.undefined
  /** This property is set to display the formatted values with format types in the PivotGrid.
    */
  var formatString: js.UndefOr[String] = js.undefined
  /** Allows to set the formula for calculation of values for calculated members in the relational datasource.
    */
  var formula: js.UndefOr[String] = js.undefined
  /** Indicates whether the field is a calculated field with the relational datasource or not.
    * @Default {false}
    */
  var isCalculatedField: js.UndefOr[Boolean] = js.undefined
  /** This holds the list of unique names of measures to bind them from the OLAP cube.
    * @Default {[]}
    */
  var measures: js.UndefOr[js.Array[DataSourceValuesMeasure]] = js.undefined
  /** Allows to set the type of PivotGrid summary calculation in the value field with the relational datasource.
    * @Default {ej.PivotAnalysis.SummaryType.Sum}
    */
  var summaryType: js.UndefOr[SummaryType | String] = js.undefined
}

object DataSourceValue {
  @scala.inline
  def apply(
    axis: String = null,
    cssClass: String = null,
    fieldCaption: String = null,
    fieldName: String = null,
    format: String = null,
    formatString: String = null,
    formula: String = null,
    isCalculatedField: js.UndefOr[Boolean] = js.undefined,
    measures: js.Array[DataSourceValuesMeasure] = null,
    summaryType: SummaryType | String = null
  ): DataSourceValue = {
    val __obj = js.Dynamic.literal()
    if (axis != null) __obj.updateDynamic("axis")(axis.asInstanceOf[js.Any])
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (fieldCaption != null) __obj.updateDynamic("fieldCaption")(fieldCaption.asInstanceOf[js.Any])
    if (fieldName != null) __obj.updateDynamic("fieldName")(fieldName.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (formatString != null) __obj.updateDynamic("formatString")(formatString.asInstanceOf[js.Any])
    if (formula != null) __obj.updateDynamic("formula")(formula.asInstanceOf[js.Any])
    if (!js.isUndefined(isCalculatedField)) __obj.updateDynamic("isCalculatedField")(isCalculatedField.asInstanceOf[js.Any])
    if (measures != null) __obj.updateDynamic("measures")(measures.asInstanceOf[js.Any])
    if (summaryType != null) __obj.updateDynamic("summaryType")(summaryType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSourceValue]
  }
}

