package typingsJapgolly.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetColumnStatisticsForPartitionResponse extends StObject {
  
  /**
    * List of ColumnStatistics that failed to be retrieved.
    */
  var ColumnStatisticsList: js.UndefOr[typingsJapgolly.awsSdk.clientsGlueMod.ColumnStatisticsList] = js.undefined
  
  /**
    * Error occurred during retrieving column statistics data.
    */
  var Errors: js.UndefOr[ColumnErrors] = js.undefined
}
object GetColumnStatisticsForPartitionResponse {
  
  inline def apply(): GetColumnStatisticsForPartitionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetColumnStatisticsForPartitionResponse]
  }
  
  extension [Self <: GetColumnStatisticsForPartitionResponse](x: Self) {
    
    inline def setColumnStatisticsList(value: ColumnStatisticsList): Self = StObject.set(x, "ColumnStatisticsList", value.asInstanceOf[js.Any])
    
    inline def setColumnStatisticsListUndefined: Self = StObject.set(x, "ColumnStatisticsList", js.undefined)
    
    inline def setColumnStatisticsListVarargs(value: ColumnStatistics*): Self = StObject.set(x, "ColumnStatisticsList", js.Array(value*))
    
    inline def setErrors(value: ColumnErrors): Self = StObject.set(x, "Errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "Errors", js.undefined)
    
    inline def setErrorsVarargs(value: ColumnError*): Self = StObject.set(x, "Errors", js.Array(value*))
  }
}
