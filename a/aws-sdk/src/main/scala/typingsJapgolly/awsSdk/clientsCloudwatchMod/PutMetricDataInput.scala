package typingsJapgolly.awsSdk.clientsCloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutMetricDataInput extends StObject {
  
  /**
    * The data for the metric. The array can include no more than 1000 metrics per call.
    */
  var MetricData: typingsJapgolly.awsSdk.clientsCloudwatchMod.MetricData
  
  /**
    * The namespace for the metric data. To avoid conflicts with Amazon Web Services service namespaces, you should not specify a namespace that begins with AWS/ 
    */
  var Namespace: typingsJapgolly.awsSdk.clientsCloudwatchMod.Namespace
}
object PutMetricDataInput {
  
  inline def apply(MetricData: MetricData, Namespace: Namespace): PutMetricDataInput = {
    val __obj = js.Dynamic.literal(MetricData = MetricData.asInstanceOf[js.Any], Namespace = Namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutMetricDataInput]
  }
  
  extension [Self <: PutMetricDataInput](x: Self) {
    
    inline def setMetricData(value: MetricData): Self = StObject.set(x, "MetricData", value.asInstanceOf[js.Any])
    
    inline def setMetricDataVarargs(value: MetricDatum*): Self = StObject.set(x, "MetricData", js.Array(value*))
    
    inline def setNamespace(value: Namespace): Self = StObject.set(x, "Namespace", value.asInstanceOf[js.Any])
  }
}
