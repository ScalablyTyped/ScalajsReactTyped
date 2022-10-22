package typingsJapgolly.pulumiKubernetes.typesOutputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Lifecycle describes actions that the management system should take in response to container lifecycle events. For the PostStart and PreStop lifecycle handlers, management of the container blocks until the action is complete, unless the container process fails, in which case the handler is aborted.
  */
trait LifecyclePatch extends StObject {
  
  /**
    * PostStart is called immediately after a container is created. If the handler fails, the container is terminated and restarted according to its restart policy. Other management of the container blocks until the hook completes. More info: https://kubernetes.io/docs/concepts/containers/container-lifecycle-hooks/#container-hooks
    */
  var postStart: LifecycleHandlerPatch
  
  /**
    * PreStop is called immediately before a container is terminated due to an API request or management event such as liveness/startup probe failure, preemption, resource contention, etc. The handler is not called if the container crashes or exits. The Pod's termination grace period countdown begins before the PreStop hook is executed. Regardless of the outcome of the handler, the container will eventually terminate within the Pod's termination grace period (unless delayed by finalizers). Other management of the container blocks until the hook completes or until the termination grace period is reached. More info: https://kubernetes.io/docs/concepts/containers/container-lifecycle-hooks/#container-hooks
    */
  var preStop: LifecycleHandlerPatch
}
object LifecyclePatch {
  
  inline def apply(postStart: LifecycleHandlerPatch, preStop: LifecycleHandlerPatch): LifecyclePatch = {
    val __obj = js.Dynamic.literal(postStart = postStart.asInstanceOf[js.Any], preStop = preStop.asInstanceOf[js.Any])
    __obj.asInstanceOf[LifecyclePatch]
  }
  
  extension [Self <: LifecyclePatch](x: Self) {
    
    inline def setPostStart(value: LifecycleHandlerPatch): Self = StObject.set(x, "postStart", value.asInstanceOf[js.Any])
    
    inline def setPreStop(value: LifecycleHandlerPatch): Self = StObject.set(x, "preStop", value.asInstanceOf[js.Any])
  }
}
