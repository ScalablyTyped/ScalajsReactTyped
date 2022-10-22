package typingsJapgolly.pulumiKubernetes.typesInputMod.batch.v1

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * UncountedTerminatedPods holds UIDs of Pods that have terminated but haven't been accounted in Job status counters.
  */
trait UncountedTerminatedPods extends StObject {
  
  /**
    * Failed holds UIDs of failed Pods.
    */
  var failed: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  
  /**
    * Succeeded holds UIDs of succeeded Pods.
    */
  var succeeded: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
}
object UncountedTerminatedPods {
  
  inline def apply(): UncountedTerminatedPods = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UncountedTerminatedPods]
  }
  
  extension [Self <: UncountedTerminatedPods](x: Self) {
    
    inline def setFailed(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "failed", value.asInstanceOf[js.Any])
    
    inline def setFailedUndefined: Self = StObject.set(x, "failed", js.undefined)
    
    inline def setFailedVarargs(value: Input[String]*): Self = StObject.set(x, "failed", js.Array(value*))
    
    inline def setSucceeded(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "succeeded", value.asInstanceOf[js.Any])
    
    inline def setSucceededUndefined: Self = StObject.set(x, "succeeded", js.undefined)
    
    inline def setSucceededVarargs(value: Input[String]*): Self = StObject.set(x, "succeeded", js.Array(value*))
  }
}
