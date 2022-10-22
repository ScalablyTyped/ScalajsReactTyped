package typingsJapgolly.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MonitoringBaselineConfig extends StObject {
  
  /**
    * The name of the job that performs baselining for the monitoring job.
    */
  var BaseliningJobName: js.UndefOr[ProcessingJobName] = js.undefined
  
  /**
    * The baseline constraint file in Amazon S3 that the current monitoring job should validated against.
    */
  var ConstraintsResource: js.UndefOr[MonitoringConstraintsResource] = js.undefined
  
  /**
    * The baseline statistics file in Amazon S3 that the current monitoring job should be validated against.
    */
  var StatisticsResource: js.UndefOr[MonitoringStatisticsResource] = js.undefined
}
object MonitoringBaselineConfig {
  
  inline def apply(): MonitoringBaselineConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MonitoringBaselineConfig]
  }
  
  extension [Self <: MonitoringBaselineConfig](x: Self) {
    
    inline def setBaseliningJobName(value: ProcessingJobName): Self = StObject.set(x, "BaseliningJobName", value.asInstanceOf[js.Any])
    
    inline def setBaseliningJobNameUndefined: Self = StObject.set(x, "BaseliningJobName", js.undefined)
    
    inline def setConstraintsResource(value: MonitoringConstraintsResource): Self = StObject.set(x, "ConstraintsResource", value.asInstanceOf[js.Any])
    
    inline def setConstraintsResourceUndefined: Self = StObject.set(x, "ConstraintsResource", js.undefined)
    
    inline def setStatisticsResource(value: MonitoringStatisticsResource): Self = StObject.set(x, "StatisticsResource", value.asInstanceOf[js.Any])
    
    inline def setStatisticsResourceUndefined: Self = StObject.set(x, "StatisticsResource", js.undefined)
  }
}
