package typingsJapgolly.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceLimits extends StObject {
  
  /**
    * The maximum number of training jobs that a hyperparameter tuning job can launch.
    */
  var MaxNumberOfTrainingJobs: typingsJapgolly.awsSdk.clientsSagemakerMod.MaxNumberOfTrainingJobs
  
  /**
    * The maximum number of concurrent training jobs that a hyperparameter tuning job can launch.
    */
  var MaxParallelTrainingJobs: typingsJapgolly.awsSdk.clientsSagemakerMod.MaxParallelTrainingJobs
}
object ResourceLimits {
  
  inline def apply(MaxNumberOfTrainingJobs: MaxNumberOfTrainingJobs, MaxParallelTrainingJobs: MaxParallelTrainingJobs): ResourceLimits = {
    val __obj = js.Dynamic.literal(MaxNumberOfTrainingJobs = MaxNumberOfTrainingJobs.asInstanceOf[js.Any], MaxParallelTrainingJobs = MaxParallelTrainingJobs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceLimits]
  }
  
  extension [Self <: ResourceLimits](x: Self) {
    
    inline def setMaxNumberOfTrainingJobs(value: MaxNumberOfTrainingJobs): Self = StObject.set(x, "MaxNumberOfTrainingJobs", value.asInstanceOf[js.Any])
    
    inline def setMaxParallelTrainingJobs(value: MaxParallelTrainingJobs): Self = StObject.set(x, "MaxParallelTrainingJobs", value.asInstanceOf[js.Any])
  }
}
