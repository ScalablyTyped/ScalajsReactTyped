package typingsJapgolly.tableau.tableau

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RelativeDateFilter
  extends StObject
     with Filter
     with ConcreteFilter {
  
  /** The date period of the filter. See PeriodType Enum for the values in the enum. */
  def getPeriod(): PeriodType
  
  /** The range of the date filter (years, months, etc.). See DateRangeType Enum for the values in the enum. */
  def getRange(): DateRangeType
  
  /** When getRange returns LASTN or NEXTN, this is the N value (how many years, months, etc.). */
  def getRangeN(): Double
}
object RelativeDateFilter {
  
  inline def apply(
    getFieldAsync: CallbackTo[js.Promise[Field]],
    getFieldName: CallbackTo[String],
    getFilterType: CallbackTo[FilterType],
    getPeriod: CallbackTo[PeriodType],
    getRange: CallbackTo[DateRangeType],
    getRangeN: CallbackTo[Double],
    getWorksheet: CallbackTo[Worksheet]
  ): RelativeDateFilter = {
    val __obj = js.Dynamic.literal(getFieldAsync = getFieldAsync.toJsFn, getFieldName = getFieldName.toJsFn, getFilterType = getFilterType.toJsFn, getPeriod = getPeriod.toJsFn, getRange = getRange.toJsFn, getRangeN = getRangeN.toJsFn, getWorksheet = getWorksheet.toJsFn)
    __obj.asInstanceOf[RelativeDateFilter]
  }
  
  extension [Self <: RelativeDateFilter](x: Self) {
    
    inline def setGetPeriod(value: CallbackTo[PeriodType]): Self = StObject.set(x, "getPeriod", value.toJsFn)
    
    inline def setGetRange(value: CallbackTo[DateRangeType]): Self = StObject.set(x, "getRange", value.toJsFn)
    
    inline def setGetRangeN(value: CallbackTo[Double]): Self = StObject.set(x, "getRangeN", value.toJsFn)
  }
}
