package typingsJapgolly.maximMazurokGapiClientAdmob.gapi.client.admob

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediationReportSpecSortCondition extends StObject {
  
  /** Sort by the specified dimension. */
  var dimension: js.UndefOr[String] = js.undefined
  
  /** Sort by the specified metric. */
  var metric: js.UndefOr[String] = js.undefined
  
  /** Sorting order of the dimension or metric. */
  var order: js.UndefOr[String] = js.undefined
}
object MediationReportSpecSortCondition {
  
  inline def apply(): MediationReportSpecSortCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediationReportSpecSortCondition]
  }
  
  extension [Self <: MediationReportSpecSortCondition](x: Self) {
    
    inline def setDimension(value: String): Self = StObject.set(x, "dimension", value.asInstanceOf[js.Any])
    
    inline def setDimensionUndefined: Self = StObject.set(x, "dimension", js.undefined)
    
    inline def setMetric(value: String): Self = StObject.set(x, "metric", value.asInstanceOf[js.Any])
    
    inline def setMetricUndefined: Self = StObject.set(x, "metric", js.undefined)
    
    inline def setOrder(value: String): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
  }
}
