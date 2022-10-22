package typingsJapgolly.tableau.tableau

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CategoricalFilter
  extends StObject
     with Filter
     with ConcreteFilter {
  
  /**
    * Gets the collection of values that are currently set on the filter.
    * This is a native JavaScript array and not a keyed collection.
    * Note that only the first 200 values are returned.
    */
  def getAppliedValues(): js.Array[DataValue]
  
  /** Gets a value indicating whether the filter is exclude or include (default). */
  def getIsExcludeMode(): Boolean
}
object CategoricalFilter {
  
  inline def apply(
    getAppliedValues: CallbackTo[js.Array[DataValue]],
    getFieldAsync: CallbackTo[js.Promise[Field]],
    getFieldName: CallbackTo[String],
    getFilterType: CallbackTo[FilterType],
    getIsExcludeMode: CallbackTo[Boolean],
    getWorksheet: CallbackTo[Worksheet]
  ): CategoricalFilter = {
    val __obj = js.Dynamic.literal(getAppliedValues = getAppliedValues.toJsFn, getFieldAsync = getFieldAsync.toJsFn, getFieldName = getFieldName.toJsFn, getFilterType = getFilterType.toJsFn, getIsExcludeMode = getIsExcludeMode.toJsFn, getWorksheet = getWorksheet.toJsFn)
    __obj.asInstanceOf[CategoricalFilter]
  }
  
  extension [Self <: CategoricalFilter](x: Self) {
    
    inline def setGetAppliedValues(value: CallbackTo[js.Array[DataValue]]): Self = StObject.set(x, "getAppliedValues", value.toJsFn)
    
    inline def setGetIsExcludeMode(value: CallbackTo[Boolean]): Self = StObject.set(x, "getIsExcludeMode", value.toJsFn)
  }
}
