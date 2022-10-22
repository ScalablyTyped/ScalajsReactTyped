package typingsJapgolly.pulumiKubernetes.typesOutputMod.policy

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.policySlashv1
import typingsJapgolly.pulumiKubernetes.typesOutputMod.meta.v1.Condition
import typingsJapgolly.pulumiKubernetes.typesOutputMod.meta.v1.ConditionPatch
import typingsJapgolly.pulumiKubernetes.typesOutputMod.meta.v1.LabelSelector
import typingsJapgolly.pulumiKubernetes.typesOutputMod.meta.v1.LabelSelectorPatch
import typingsJapgolly.pulumiKubernetes.typesOutputMod.meta.v1.ObjectMeta
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object v1 {
  
  /**
    * PodDisruptionBudget is an object to define the max disruption that can be caused to a collection of pods
    */
  trait PodDisruptionBudget extends StObject {
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    var apiVersion: policySlashv1
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    var kind: typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.PodDisruptionBudget
    
    /**
      * Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
      */
    var metadata: ObjectMeta
    
    /**
      * Specification of the desired behavior of the PodDisruptionBudget.
      */
    var spec: PodDisruptionBudgetSpec
    
    /**
      * Most recently observed status of the PodDisruptionBudget.
      */
    var status: PodDisruptionBudgetStatus
  }
  object PodDisruptionBudget {
    
    inline def apply(metadata: ObjectMeta, spec: PodDisruptionBudgetSpec, status: PodDisruptionBudgetStatus): PodDisruptionBudget = {
      val __obj = js.Dynamic.literal(apiVersion = "policy/v1", kind = "PodDisruptionBudget", metadata = metadata.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[PodDisruptionBudget]
    }
    
    extension [Self <: PodDisruptionBudget](x: Self) {
      
      inline def setApiVersion(value: policySlashv1): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      inline def setKind(value: typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.PodDisruptionBudget): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setMetadata(value: ObjectMeta): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setSpec(value: PodDisruptionBudgetSpec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: PodDisruptionBudgetStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * PodDisruptionBudgetSpec is a description of a PodDisruptionBudget.
    */
  trait PodDisruptionBudgetSpec extends StObject {
    
    /**
      * An eviction is allowed if at most "maxUnavailable" pods selected by "selector" are unavailable after the eviction, i.e. even in absence of the evicted pod. For example, one can prevent all voluntary evictions by specifying 0. This is a mutually exclusive setting with "minAvailable".
      */
    var maxUnavailable: Double | String
    
    /**
      * An eviction is allowed if at least "minAvailable" pods selected by "selector" will still be available after the eviction, i.e. even in the absence of the evicted pod.  So for example you can prevent all voluntary evictions by specifying "100%".
      */
    var minAvailable: Double | String
    
    /**
      * Label query over pods whose evictions are managed by the disruption budget. A null selector will match no pods, while an empty ({}) selector will select all pods within the namespace.
      */
    var selector: LabelSelector
  }
  object PodDisruptionBudgetSpec {
    
    inline def apply(maxUnavailable: Double | String, minAvailable: Double | String, selector: LabelSelector): PodDisruptionBudgetSpec = {
      val __obj = js.Dynamic.literal(maxUnavailable = maxUnavailable.asInstanceOf[js.Any], minAvailable = minAvailable.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any])
      __obj.asInstanceOf[PodDisruptionBudgetSpec]
    }
    
    extension [Self <: PodDisruptionBudgetSpec](x: Self) {
      
      inline def setMaxUnavailable(value: Double | String): Self = StObject.set(x, "maxUnavailable", value.asInstanceOf[js.Any])
      
      inline def setMinAvailable(value: Double | String): Self = StObject.set(x, "minAvailable", value.asInstanceOf[js.Any])
      
      inline def setSelector(value: LabelSelector): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * PodDisruptionBudgetSpec is a description of a PodDisruptionBudget.
    */
  trait PodDisruptionBudgetSpecPatch extends StObject {
    
    /**
      * An eviction is allowed if at most "maxUnavailable" pods selected by "selector" are unavailable after the eviction, i.e. even in absence of the evicted pod. For example, one can prevent all voluntary evictions by specifying 0. This is a mutually exclusive setting with "minAvailable".
      */
    var maxUnavailable: Double | String
    
    /**
      * An eviction is allowed if at least "minAvailable" pods selected by "selector" will still be available after the eviction, i.e. even in the absence of the evicted pod.  So for example you can prevent all voluntary evictions by specifying "100%".
      */
    var minAvailable: Double | String
    
    /**
      * Label query over pods whose evictions are managed by the disruption budget. A null selector will match no pods, while an empty ({}) selector will select all pods within the namespace.
      */
    var selector: LabelSelectorPatch
  }
  object PodDisruptionBudgetSpecPatch {
    
    inline def apply(maxUnavailable: Double | String, minAvailable: Double | String, selector: LabelSelectorPatch): PodDisruptionBudgetSpecPatch = {
      val __obj = js.Dynamic.literal(maxUnavailable = maxUnavailable.asInstanceOf[js.Any], minAvailable = minAvailable.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any])
      __obj.asInstanceOf[PodDisruptionBudgetSpecPatch]
    }
    
    extension [Self <: PodDisruptionBudgetSpecPatch](x: Self) {
      
      inline def setMaxUnavailable(value: Double | String): Self = StObject.set(x, "maxUnavailable", value.asInstanceOf[js.Any])
      
      inline def setMinAvailable(value: Double | String): Self = StObject.set(x, "minAvailable", value.asInstanceOf[js.Any])
      
      inline def setSelector(value: LabelSelectorPatch): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * PodDisruptionBudgetStatus represents information about the status of a PodDisruptionBudget. Status may trail the actual state of a system.
    */
  trait PodDisruptionBudgetStatus extends StObject {
    
    /**
      * Conditions contain conditions for PDB. The disruption controller sets the DisruptionAllowed condition. The following are known values for the reason field (additional reasons could be added in the future): - SyncFailed: The controller encountered an error and wasn't able to compute
      *               the number of allowed disruptions. Therefore no disruptions are
      *               allowed and the status of the condition will be False.
      * - InsufficientPods: The number of pods are either at or below the number
      *                     required by the PodDisruptionBudget. No disruptions are
      *                     allowed and the status of the condition will be False.
      * - SufficientPods: There are more pods than required by the PodDisruptionBudget.
      *                   The condition will be True, and the number of allowed
      *                   disruptions are provided by the disruptionsAllowed property.
      */
    var conditions: js.Array[Condition]
    
    /**
      * current number of healthy pods
      */
    var currentHealthy: Double
    
    /**
      * minimum desired number of healthy pods
      */
    var desiredHealthy: Double
    
    /**
      * DisruptedPods contains information about pods whose eviction was processed by the API server eviction subresource handler but has not yet been observed by the PodDisruptionBudget controller. A pod will be in this map from the time when the API server processed the eviction request to the time when the pod is seen by PDB controller as having been marked for deletion (or after a timeout). The key in the map is the name of the pod and the value is the time when the API server processed the eviction request. If the deletion didn't occur and a pod is still there it will be removed from the list automatically by PodDisruptionBudget controller after some time. If everything goes smooth this map should be empty for the most of the time. Large number of entries in the map may indicate problems with pod deletions.
      */
    var disruptedPods: StringDictionary[String]
    
    /**
      * Number of pod disruptions that are currently allowed.
      */
    var disruptionsAllowed: Double
    
    /**
      * total number of pods counted by this disruption budget
      */
    var expectedPods: Double
    
    /**
      * Most recent generation observed when updating this PDB status. DisruptionsAllowed and other status information is valid only if observedGeneration equals to PDB's object generation.
      */
    var observedGeneration: Double
  }
  object PodDisruptionBudgetStatus {
    
    inline def apply(
      conditions: js.Array[Condition],
      currentHealthy: Double,
      desiredHealthy: Double,
      disruptedPods: StringDictionary[String],
      disruptionsAllowed: Double,
      expectedPods: Double,
      observedGeneration: Double
    ): PodDisruptionBudgetStatus = {
      val __obj = js.Dynamic.literal(conditions = conditions.asInstanceOf[js.Any], currentHealthy = currentHealthy.asInstanceOf[js.Any], desiredHealthy = desiredHealthy.asInstanceOf[js.Any], disruptedPods = disruptedPods.asInstanceOf[js.Any], disruptionsAllowed = disruptionsAllowed.asInstanceOf[js.Any], expectedPods = expectedPods.asInstanceOf[js.Any], observedGeneration = observedGeneration.asInstanceOf[js.Any])
      __obj.asInstanceOf[PodDisruptionBudgetStatus]
    }
    
    extension [Self <: PodDisruptionBudgetStatus](x: Self) {
      
      inline def setConditions(value: js.Array[Condition]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
      
      inline def setConditionsVarargs(value: Condition*): Self = StObject.set(x, "conditions", js.Array(value*))
      
      inline def setCurrentHealthy(value: Double): Self = StObject.set(x, "currentHealthy", value.asInstanceOf[js.Any])
      
      inline def setDesiredHealthy(value: Double): Self = StObject.set(x, "desiredHealthy", value.asInstanceOf[js.Any])
      
      inline def setDisruptedPods(value: StringDictionary[String]): Self = StObject.set(x, "disruptedPods", value.asInstanceOf[js.Any])
      
      inline def setDisruptionsAllowed(value: Double): Self = StObject.set(x, "disruptionsAllowed", value.asInstanceOf[js.Any])
      
      inline def setExpectedPods(value: Double): Self = StObject.set(x, "expectedPods", value.asInstanceOf[js.Any])
      
      inline def setObservedGeneration(value: Double): Self = StObject.set(x, "observedGeneration", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * PodDisruptionBudgetStatus represents information about the status of a PodDisruptionBudget. Status may trail the actual state of a system.
    */
  trait PodDisruptionBudgetStatusPatch extends StObject {
    
    /**
      * Conditions contain conditions for PDB. The disruption controller sets the DisruptionAllowed condition. The following are known values for the reason field (additional reasons could be added in the future): - SyncFailed: The controller encountered an error and wasn't able to compute
      *               the number of allowed disruptions. Therefore no disruptions are
      *               allowed and the status of the condition will be False.
      * - InsufficientPods: The number of pods are either at or below the number
      *                     required by the PodDisruptionBudget. No disruptions are
      *                     allowed and the status of the condition will be False.
      * - SufficientPods: There are more pods than required by the PodDisruptionBudget.
      *                   The condition will be True, and the number of allowed
      *                   disruptions are provided by the disruptionsAllowed property.
      */
    var conditions: js.Array[ConditionPatch]
    
    /**
      * current number of healthy pods
      */
    var currentHealthy: Double
    
    /**
      * minimum desired number of healthy pods
      */
    var desiredHealthy: Double
    
    /**
      * DisruptedPods contains information about pods whose eviction was processed by the API server eviction subresource handler but has not yet been observed by the PodDisruptionBudget controller. A pod will be in this map from the time when the API server processed the eviction request to the time when the pod is seen by PDB controller as having been marked for deletion (or after a timeout). The key in the map is the name of the pod and the value is the time when the API server processed the eviction request. If the deletion didn't occur and a pod is still there it will be removed from the list automatically by PodDisruptionBudget controller after some time. If everything goes smooth this map should be empty for the most of the time. Large number of entries in the map may indicate problems with pod deletions.
      */
    var disruptedPods: StringDictionary[String]
    
    /**
      * Number of pod disruptions that are currently allowed.
      */
    var disruptionsAllowed: Double
    
    /**
      * total number of pods counted by this disruption budget
      */
    var expectedPods: Double
    
    /**
      * Most recent generation observed when updating this PDB status. DisruptionsAllowed and other status information is valid only if observedGeneration equals to PDB's object generation.
      */
    var observedGeneration: Double
  }
  object PodDisruptionBudgetStatusPatch {
    
    inline def apply(
      conditions: js.Array[ConditionPatch],
      currentHealthy: Double,
      desiredHealthy: Double,
      disruptedPods: StringDictionary[String],
      disruptionsAllowed: Double,
      expectedPods: Double,
      observedGeneration: Double
    ): PodDisruptionBudgetStatusPatch = {
      val __obj = js.Dynamic.literal(conditions = conditions.asInstanceOf[js.Any], currentHealthy = currentHealthy.asInstanceOf[js.Any], desiredHealthy = desiredHealthy.asInstanceOf[js.Any], disruptedPods = disruptedPods.asInstanceOf[js.Any], disruptionsAllowed = disruptionsAllowed.asInstanceOf[js.Any], expectedPods = expectedPods.asInstanceOf[js.Any], observedGeneration = observedGeneration.asInstanceOf[js.Any])
      __obj.asInstanceOf[PodDisruptionBudgetStatusPatch]
    }
    
    extension [Self <: PodDisruptionBudgetStatusPatch](x: Self) {
      
      inline def setConditions(value: js.Array[ConditionPatch]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
      
      inline def setConditionsVarargs(value: ConditionPatch*): Self = StObject.set(x, "conditions", js.Array(value*))
      
      inline def setCurrentHealthy(value: Double): Self = StObject.set(x, "currentHealthy", value.asInstanceOf[js.Any])
      
      inline def setDesiredHealthy(value: Double): Self = StObject.set(x, "desiredHealthy", value.asInstanceOf[js.Any])
      
      inline def setDisruptedPods(value: StringDictionary[String]): Self = StObject.set(x, "disruptedPods", value.asInstanceOf[js.Any])
      
      inline def setDisruptionsAllowed(value: Double): Self = StObject.set(x, "disruptionsAllowed", value.asInstanceOf[js.Any])
      
      inline def setExpectedPods(value: Double): Self = StObject.set(x, "expectedPods", value.asInstanceOf[js.Any])
      
      inline def setObservedGeneration(value: Double): Self = StObject.set(x, "observedGeneration", value.asInstanceOf[js.Any])
    }
  }
}
