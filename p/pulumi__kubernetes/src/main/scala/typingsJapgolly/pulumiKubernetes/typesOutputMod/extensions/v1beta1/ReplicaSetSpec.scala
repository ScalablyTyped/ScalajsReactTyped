package typingsJapgolly.pulumiKubernetes.typesOutputMod.extensions.v1beta1

import typingsJapgolly.pulumiKubernetes.typesOutputMod.core.v1.PodTemplateSpec
import typingsJapgolly.pulumiKubernetes.typesOutputMod.meta.v1.LabelSelector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ReplicaSetSpec is the specification of a ReplicaSet.
  */
trait ReplicaSetSpec extends StObject {
  
  /**
    * Minimum number of seconds for which a newly created pod should be ready without any of its container crashing, for it to be considered available. Defaults to 0 (pod will be considered available as soon as it is ready)
    */
  var minReadySeconds: Double
  
  /**
    * Replicas is the number of desired replicas. This is a pointer to distinguish between explicit zero and unspecified. Defaults to 1. More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller/#what-is-a-replicationcontroller
    */
  var replicas: Double
  
  /**
    * Selector is a label query over pods that should match the replica count. If the selector is empty, it is defaulted to the labels present on the pod template. Label keys and values that must match in order to be controlled by this replica set. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
    */
  var selector: LabelSelector
  
  /**
    * Template is the object that describes the pod that will be created if insufficient replicas are detected. More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#pod-template
    */
  var template: PodTemplateSpec
}
object ReplicaSetSpec {
  
  inline def apply(minReadySeconds: Double, replicas: Double, selector: LabelSelector, template: PodTemplateSpec): ReplicaSetSpec = {
    val __obj = js.Dynamic.literal(minReadySeconds = minReadySeconds.asInstanceOf[js.Any], replicas = replicas.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicaSetSpec]
  }
  
  extension [Self <: ReplicaSetSpec](x: Self) {
    
    inline def setMinReadySeconds(value: Double): Self = StObject.set(x, "minReadySeconds", value.asInstanceOf[js.Any])
    
    inline def setReplicas(value: Double): Self = StObject.set(x, "replicas", value.asInstanceOf[js.Any])
    
    inline def setSelector(value: LabelSelector): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setTemplate(value: PodTemplateSpec): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
  }
}
