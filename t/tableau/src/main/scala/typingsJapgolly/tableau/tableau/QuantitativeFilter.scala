package typingsJapgolly.tableau.tableau

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QuantitativeFilter
  extends StObject
     with Filter
     with ConcreteFilter {
  
  /** Gets the maximum value as specified in the domain. */
  def getDomainMax(): DataValue
  
  /** Gets the minimum value as specified in the domain. */
  def getDomainMin(): DataValue
  
  /** Indicates whether null values are included in the filter. */
  def getIncludeNullValues(): Boolean
  
  /** Gets the maximum value, inclusive, applied to the filter. */
  def getMax(): DataValue
  
  /** Gets the minimum value, inclusive, applied to the filter. */
  def getMin(): DataValue
}
object QuantitativeFilter {
  
  inline def apply(
    getDomainMax: CallbackTo[DataValue],
    getDomainMin: CallbackTo[DataValue],
    getFieldAsync: CallbackTo[js.Promise[Field]],
    getFieldName: CallbackTo[String],
    getFilterType: CallbackTo[FilterType],
    getIncludeNullValues: CallbackTo[Boolean],
    getMax: CallbackTo[DataValue],
    getMin: CallbackTo[DataValue],
    getWorksheet: CallbackTo[Worksheet]
  ): QuantitativeFilter = {
    val __obj = js.Dynamic.literal(getDomainMax = getDomainMax.toJsFn, getDomainMin = getDomainMin.toJsFn, getFieldAsync = getFieldAsync.toJsFn, getFieldName = getFieldName.toJsFn, getFilterType = getFilterType.toJsFn, getIncludeNullValues = getIncludeNullValues.toJsFn, getMax = getMax.toJsFn, getMin = getMin.toJsFn, getWorksheet = getWorksheet.toJsFn)
    __obj.asInstanceOf[QuantitativeFilter]
  }
  
  extension [Self <: QuantitativeFilter](x: Self) {
    
    inline def setGetDomainMax(value: CallbackTo[DataValue]): Self = StObject.set(x, "getDomainMax", value.toJsFn)
    
    inline def setGetDomainMin(value: CallbackTo[DataValue]): Self = StObject.set(x, "getDomainMin", value.toJsFn)
    
    inline def setGetIncludeNullValues(value: CallbackTo[Boolean]): Self = StObject.set(x, "getIncludeNullValues", value.toJsFn)
    
    inline def setGetMax(value: CallbackTo[DataValue]): Self = StObject.set(x, "getMax", value.toJsFn)
    
    inline def setGetMin(value: CallbackTo[DataValue]): Self = StObject.set(x, "getMin", value.toJsFn)
  }
}
