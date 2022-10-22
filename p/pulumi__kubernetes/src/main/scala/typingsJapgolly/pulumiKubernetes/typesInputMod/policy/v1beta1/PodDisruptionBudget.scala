package typingsJapgolly.pulumiKubernetes.typesInputMod.policy.v1beta1

import typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.policySlashv1beta1
import typingsJapgolly.pulumiKubernetes.typesInputMod.meta.v1.ObjectMeta
import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * PodDisruptionBudget is an object to define the max disruption that can be caused to a collection of pods
  */
trait PodDisruptionBudget extends StObject {
  
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  var apiVersion: js.UndefOr[Input[policySlashv1beta1]] = js.undefined
  
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: js.UndefOr[
    Input[typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.PodDisruptionBudget]
  ] = js.undefined
  
  var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
  
  /**
    * Specification of the desired behavior of the PodDisruptionBudget.
    */
  var spec: js.UndefOr[Input[PodDisruptionBudgetSpec]] = js.undefined
  
  /**
    * Most recently observed status of the PodDisruptionBudget.
    */
  var status: js.UndefOr[Input[PodDisruptionBudgetStatus]] = js.undefined
}
object PodDisruptionBudget {
  
  inline def apply(): PodDisruptionBudget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PodDisruptionBudget]
  }
  
  extension [Self <: PodDisruptionBudget](x: Self) {
    
    inline def setApiVersion(value: Input[policySlashv1beta1]): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
    
    inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
    
    inline def setKind(value: Input[typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.PodDisruptionBudget]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setMetadata(value: Input[ObjectMeta]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setSpec(value: Input[PodDisruptionBudgetSpec]): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
    
    inline def setSpecUndefined: Self = StObject.set(x, "spec", js.undefined)
    
    inline def setStatus(value: Input[PodDisruptionBudgetStatus]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
