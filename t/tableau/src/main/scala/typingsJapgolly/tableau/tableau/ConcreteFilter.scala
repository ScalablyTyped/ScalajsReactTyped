package typingsJapgolly.tableau.tableau

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.tableau.tableau.CategoricalFilter
  - typingsJapgolly.tableau.tableau.QuantitativeFilter
  - typingsJapgolly.tableau.tableau.RelativeDateFilter
*/
trait ConcreteFilter extends StObject
object ConcreteFilter {
  
  inline def CategoricalFilter(
    getAppliedValues: CallbackTo[js.Array[DataValue]],
    getFieldAsync: CallbackTo[js.Promise[Field]],
    getFieldName: CallbackTo[String],
    getFilterType: CallbackTo[FilterType],
    getIsExcludeMode: CallbackTo[Boolean],
    getWorksheet: CallbackTo[Worksheet]
  ): typingsJapgolly.tableau.tableau.CategoricalFilter = {
    val __obj = js.Dynamic.literal(getAppliedValues = getAppliedValues.toJsFn, getFieldAsync = getFieldAsync.toJsFn, getFieldName = getFieldName.toJsFn, getFilterType = getFilterType.toJsFn, getIsExcludeMode = getIsExcludeMode.toJsFn, getWorksheet = getWorksheet.toJsFn)
    __obj.asInstanceOf[typingsJapgolly.tableau.tableau.CategoricalFilter]
  }
  
  inline def QuantitativeFilter(
    getDomainMax: CallbackTo[DataValue],
    getDomainMin: CallbackTo[DataValue],
    getFieldAsync: CallbackTo[js.Promise[Field]],
    getFieldName: CallbackTo[String],
    getFilterType: CallbackTo[FilterType],
    getIncludeNullValues: CallbackTo[Boolean],
    getMax: CallbackTo[DataValue],
    getMin: CallbackTo[DataValue],
    getWorksheet: CallbackTo[Worksheet]
  ): typingsJapgolly.tableau.tableau.QuantitativeFilter = {
    val __obj = js.Dynamic.literal(getDomainMax = getDomainMax.toJsFn, getDomainMin = getDomainMin.toJsFn, getFieldAsync = getFieldAsync.toJsFn, getFieldName = getFieldName.toJsFn, getFilterType = getFilterType.toJsFn, getIncludeNullValues = getIncludeNullValues.toJsFn, getMax = getMax.toJsFn, getMin = getMin.toJsFn, getWorksheet = getWorksheet.toJsFn)
    __obj.asInstanceOf[typingsJapgolly.tableau.tableau.QuantitativeFilter]
  }
  
  inline def RelativeDateFilter(
    getFieldAsync: CallbackTo[js.Promise[Field]],
    getFieldName: CallbackTo[String],
    getFilterType: CallbackTo[FilterType],
    getPeriod: CallbackTo[PeriodType],
    getRange: CallbackTo[DateRangeType],
    getRangeN: CallbackTo[Double],
    getWorksheet: CallbackTo[Worksheet]
  ): typingsJapgolly.tableau.tableau.RelativeDateFilter = {
    val __obj = js.Dynamic.literal(getFieldAsync = getFieldAsync.toJsFn, getFieldName = getFieldName.toJsFn, getFilterType = getFilterType.toJsFn, getPeriod = getPeriod.toJsFn, getRange = getRange.toJsFn, getRangeN = getRangeN.toJsFn, getWorksheet = getWorksheet.toJsFn)
    __obj.asInstanceOf[typingsJapgolly.tableau.tableau.RelativeDateFilter]
  }
}
