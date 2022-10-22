package typingsJapgolly.pulumiKubernetes.typesOutputMod.batch.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * UncountedTerminatedPods holds UIDs of Pods that have terminated but haven't been accounted in Job status counters.
  */
trait UncountedTerminatedPodsPatch extends StObject {
  
  /**
    * Failed holds UIDs of failed Pods.
    */
  var failed: js.Array[String]
  
  /**
    * Succeeded holds UIDs of succeeded Pods.
    */
  var succeeded: js.Array[String]
}
object UncountedTerminatedPodsPatch {
  
  inline def apply(failed: js.Array[String], succeeded: js.Array[String]): UncountedTerminatedPodsPatch = {
    val __obj = js.Dynamic.literal(failed = failed.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any])
    __obj.asInstanceOf[UncountedTerminatedPodsPatch]
  }
  
  extension [Self <: UncountedTerminatedPodsPatch](x: Self) {
    
    inline def setFailed(value: js.Array[String]): Self = StObject.set(x, "failed", value.asInstanceOf[js.Any])
    
    inline def setFailedVarargs(value: String*): Self = StObject.set(x, "failed", js.Array(value*))
    
    inline def setSucceeded(value: js.Array[String]): Self = StObject.set(x, "succeeded", value.asInstanceOf[js.Any])
    
    inline def setSucceededVarargs(value: String*): Self = StObject.set(x, "succeeded", js.Array(value*))
  }
}
