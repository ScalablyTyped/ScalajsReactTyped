package typingsJapgolly.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxDimension
  *
  * Note: Either qDef or qLibraryId must be set, but not both.
  * Note: If the dimension is set in the hypercube and not in the library, this dimension cannot be shared with other objects.
  * Note: A dimension that is set in the library can be used by many objects.
  */
trait INxDimension extends js.Object {
  /**
    * List of attribute dimensions.
    */
  var qAttributeDimensions: js.UndefOr[js.Array[INxAttrDimDef]] = js.undefined
  /**
    * List of attribute expressions.
    */
  var qAttributeExpressions: js.UndefOr[js.Array[INxAttrExprDef]] = js.undefined
  /**
    * Specifies a calculation condition, which must be fulfilled for the dimension to be calculated.
    * If the calculation condition is not met, the dimension is excluded from the calculation.
    * This property is optional. By default, there is no calculation condition.
    */
  var qCalcCond: js.UndefOr[IValueExpr] = js.undefined
  /**
    * Refers to a dimension stored in the hypercube.
    */
  var qDef: INxInlineDimensionDef
  /**
    * no / empty docu
    */
  var qIncludeElemValue: js.UndefOr[Boolean] = js.undefined
  /**
    * Refers to a dimension stored in the library.
    */
  var qLibraryId: js.UndefOr[String] = js.undefined
  /**
    * If set to true, no null values are returned.
    */
  var qNullSuppression: js.UndefOr[Boolean] = js.undefined
  /**
    * This property is used when some dimension limits are set.
    * Label of the Others group. The default label is Others.
    * Example:
    * "qOtherLabel":"=<label>"
    *               or
    * "qOtherLabel":{"qExpr":"=<label>"}
    *               Where
    * <label> is the label of the Others group.
    */
  var qOtherLabel: js.UndefOr[IStringExpressionContainer] = js.undefined
  /**
    * Sets the dimension limits. Each dimension of a hypercube is configured separately.
    * Defines if some values (grouped as Others) should be grouped together in the visualization.
    * For example in a pie chart all values lower than 200 could be grouped together.
    */
  var qOtherTotalSpec: js.UndefOr[IOtherTotalSpecProp] = js.undefined
  /**
    * If set to true, all dimension values are shown.
    */
  var qShowAll: js.UndefOr[Boolean] = js.undefined
   // ?Nicht in Doku
  /**
    * no / empty docu
    */
  var qShowTotal: js.UndefOr[Boolean] = js.undefined
  /**
    * If this property is set, the total of the calculated values is returned.
    * The default label is Total.
    * Example:
    * "qTotalLabel":"=<label>"
    *               or
    * "qTotalLabel":{"qExpr":"=<label>"}
    *               Where
    * <label> is the label of the Totalgroup.
    */
  var qTotalLabel: js.UndefOr[IStringExpressionContainer] = js.undefined
}

object INxDimension {
  @scala.inline
  def apply(
    qDef: INxInlineDimensionDef,
    qAttributeDimensions: js.Array[INxAttrDimDef] = null,
    qAttributeExpressions: js.Array[INxAttrExprDef] = null,
    qCalcCond: IValueExpr = null,
    qIncludeElemValue: js.UndefOr[Boolean] = js.undefined,
    qLibraryId: String = null,
    qNullSuppression: js.UndefOr[Boolean] = js.undefined,
    qOtherLabel: IStringExpressionContainer = null,
    qOtherTotalSpec: IOtherTotalSpecProp = null,
    qShowAll: js.UndefOr[Boolean] = js.undefined,
    qShowTotal: js.UndefOr[Boolean] = js.undefined,
    qTotalLabel: IStringExpressionContainer = null
  ): INxDimension = {
    val __obj = js.Dynamic.literal(qDef = qDef.asInstanceOf[js.Any])
    if (qAttributeDimensions != null) __obj.updateDynamic("qAttributeDimensions")(qAttributeDimensions.asInstanceOf[js.Any])
    if (qAttributeExpressions != null) __obj.updateDynamic("qAttributeExpressions")(qAttributeExpressions.asInstanceOf[js.Any])
    if (qCalcCond != null) __obj.updateDynamic("qCalcCond")(qCalcCond.asInstanceOf[js.Any])
    if (!js.isUndefined(qIncludeElemValue)) __obj.updateDynamic("qIncludeElemValue")(qIncludeElemValue.asInstanceOf[js.Any])
    if (qLibraryId != null) __obj.updateDynamic("qLibraryId")(qLibraryId.asInstanceOf[js.Any])
    if (!js.isUndefined(qNullSuppression)) __obj.updateDynamic("qNullSuppression")(qNullSuppression.asInstanceOf[js.Any])
    if (qOtherLabel != null) __obj.updateDynamic("qOtherLabel")(qOtherLabel.asInstanceOf[js.Any])
    if (qOtherTotalSpec != null) __obj.updateDynamic("qOtherTotalSpec")(qOtherTotalSpec.asInstanceOf[js.Any])
    if (!js.isUndefined(qShowAll)) __obj.updateDynamic("qShowAll")(qShowAll.asInstanceOf[js.Any])
    if (!js.isUndefined(qShowTotal)) __obj.updateDynamic("qShowTotal")(qShowTotal.asInstanceOf[js.Any])
    if (qTotalLabel != null) __obj.updateDynamic("qTotalLabel")(qTotalLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxDimension]
  }
}

