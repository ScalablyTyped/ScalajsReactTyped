package typingsJapgolly.pulumiKubernetes.typesInputMod.batch.v1

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JobStatus represents the current state of a Job.
  */
trait JobStatus extends StObject {
  
  /**
    * The number of pending and running pods.
    */
  var active: js.UndefOr[Input[Double]] = js.undefined
  
  /**
    * CompletedIndexes holds the completed indexes when .spec.completionMode = "Indexed" in a text format. The indexes are represented as decimal integers separated by commas. The numbers are listed in increasing order. Three or more consecutive numbers are compressed and represented by the first and last element of the series, separated by a hyphen. For example, if the completed indexes are 1, 3, 4, 5 and 7, they are represented as "1,3-5,7".
    */
  var completedIndexes: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Represents time when the job was completed. It is not guaranteed to be set in happens-before order across separate operations. It is represented in RFC3339 form and is in UTC. The completion time is only set when the job finishes successfully.
    */
  var completionTime: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The latest available observations of an object's current state. When a Job fails, one of the conditions will have type "Failed" and status true. When a Job is suspended, one of the conditions will have type "Suspended" and status true; when the Job is resumed, the status of this condition will become false. When a Job is completed, one of the conditions will have type "Complete" and status true. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
    */
  var conditions: js.UndefOr[Input[js.Array[Input[JobCondition]]]] = js.undefined
  
  /**
    * The number of pods which reached phase Failed.
    */
  var failed: js.UndefOr[Input[Double]] = js.undefined
  
  /**
    * The number of pods which have a Ready condition.
    *
    * This field is beta-level. The job controller populates the field when the feature gate JobReadyPods is enabled (enabled by default).
    */
  var ready: js.UndefOr[Input[Double]] = js.undefined
  
  /**
    * Represents time when the job controller started processing a job. When a Job is created in the suspended state, this field is not set until the first time it is resumed. This field is reset every time a Job is resumed from suspension. It is represented in RFC3339 form and is in UTC.
    */
  var startTime: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The number of pods which reached phase Succeeded.
    */
  var succeeded: js.UndefOr[Input[Double]] = js.undefined
  
  /**
    * UncountedTerminatedPods holds the UIDs of Pods that have terminated but the job controller hasn't yet accounted for in the status counters.
    *
    * The job controller creates pods with a finalizer. When a pod terminates (succeeded or failed), the controller does three steps to account for it in the job status: (1) Add the pod UID to the arrays in this field. (2) Remove the pod finalizer. (3) Remove the pod UID from the arrays while increasing the corresponding
    *     counter.
    *
    * This field is beta-level. The job controller only makes use of this field when the feature gate JobTrackingWithFinalizers is enabled (enabled by default). Old jobs might not be tracked using this field, in which case the field remains null.
    */
  var uncountedTerminatedPods: js.UndefOr[Input[UncountedTerminatedPods]] = js.undefined
}
object JobStatus {
  
  inline def apply(): JobStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobStatus]
  }
  
  extension [Self <: JobStatus](x: Self) {
    
    inline def setActive(value: Input[Double]): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setCompletedIndexes(value: Input[String]): Self = StObject.set(x, "completedIndexes", value.asInstanceOf[js.Any])
    
    inline def setCompletedIndexesUndefined: Self = StObject.set(x, "completedIndexes", js.undefined)
    
    inline def setCompletionTime(value: Input[String]): Self = StObject.set(x, "completionTime", value.asInstanceOf[js.Any])
    
    inline def setCompletionTimeUndefined: Self = StObject.set(x, "completionTime", js.undefined)
    
    inline def setConditions(value: Input[js.Array[Input[JobCondition]]]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    inline def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
    
    inline def setConditionsVarargs(value: Input[JobCondition]*): Self = StObject.set(x, "conditions", js.Array(value*))
    
    inline def setFailed(value: Input[Double]): Self = StObject.set(x, "failed", value.asInstanceOf[js.Any])
    
    inline def setFailedUndefined: Self = StObject.set(x, "failed", js.undefined)
    
    inline def setReady(value: Input[Double]): Self = StObject.set(x, "ready", value.asInstanceOf[js.Any])
    
    inline def setReadyUndefined: Self = StObject.set(x, "ready", js.undefined)
    
    inline def setStartTime(value: Input[String]): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setSucceeded(value: Input[Double]): Self = StObject.set(x, "succeeded", value.asInstanceOf[js.Any])
    
    inline def setSucceededUndefined: Self = StObject.set(x, "succeeded", js.undefined)
    
    inline def setUncountedTerminatedPods(value: Input[UncountedTerminatedPods]): Self = StObject.set(x, "uncountedTerminatedPods", value.asInstanceOf[js.Any])
    
    inline def setUncountedTerminatedPodsUndefined: Self = StObject.set(x, "uncountedTerminatedPods", js.undefined)
  }
}
