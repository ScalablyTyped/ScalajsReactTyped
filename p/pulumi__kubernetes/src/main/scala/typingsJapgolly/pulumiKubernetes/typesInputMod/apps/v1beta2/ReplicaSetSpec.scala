package typingsJapgolly.pulumiKubernetes.typesInputMod.apps.v1beta2

import typingsJapgolly.pulumiKubernetes.typesInputMod.core.v1.PodTemplateSpec
import typingsJapgolly.pulumiKubernetes.typesInputMod.meta.v1.LabelSelector
import typingsJapgolly.pulumiPulumi.outputMod.Input
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
  var minReadySeconds: js.UndefOr[Input[Double]] = js.undefined
  
  /**
    * Replicas is the number of desired replicas. This is a pointer to distinguish between explicit zero and unspecified. Defaults to 1. More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller/#what-is-a-replicationcontroller
    */
  var replicas: js.UndefOr[Input[Double]] = js.undefined
  
  /**
    * Selector is a label query over pods that should match the replica count. Label keys and values that must match in order to be controlled by this replica set. It must match the pod template's labels. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
    */
  var selector: Input[LabelSelector]
  
  /**
    * Template is the object that describes the pod that will be created if insufficient replicas are detected. More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#pod-template
    */
  var template: js.UndefOr[Input[PodTemplateSpec]] = js.undefined
}
object ReplicaSetSpec {
  
  inline def apply(selector: Input[LabelSelector]): ReplicaSetSpec = {
    val __obj = js.Dynamic.literal(selector = selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicaSetSpec]
  }
  
  extension [Self <: ReplicaSetSpec](x: Self) {
    
    inline def setMinReadySeconds(value: Input[Double]): Self = StObject.set(x, "minReadySeconds", value.asInstanceOf[js.Any])
    
    inline def setMinReadySecondsUndefined: Self = StObject.set(x, "minReadySeconds", js.undefined)
    
    inline def setReplicas(value: Input[Double]): Self = StObject.set(x, "replicas", value.asInstanceOf[js.Any])
    
    inline def setReplicasUndefined: Self = StObject.set(x, "replicas", js.undefined)
    
    inline def setSelector(value: Input[LabelSelector]): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setTemplate(value: Input[PodTemplateSpec]): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
  }
}
