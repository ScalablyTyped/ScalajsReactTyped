package typingsJapgolly.pulumiKubernetes.typesInputMod

import typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.schedulingDotk8sDotioSlashv1
import typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.schedulingDotk8sDotioSlashv1alpha1
import typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.schedulingDotk8sDotioSlashv1beta1
import typingsJapgolly.pulumiKubernetes.typesInputMod.meta.v1.ObjectMeta
import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scheduling {
  
  object v1 {
    
    /**
      * PriorityClass defines mapping from a priority class name to the priority integer value. The value can be any valid integer.
      */
    trait PriorityClass extends StObject {
      
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[Input[schedulingDotk8sDotioSlashv1]] = js.undefined
      
      /**
        * description is an arbitrary string that usually provides guidelines on when this priority class should be used.
        */
      var description: js.UndefOr[Input[String]] = js.undefined
      
      /**
        * globalDefault specifies whether this PriorityClass should be considered as the default priority for pods that do not have any priority class. Only one PriorityClass can be marked as `globalDefault`. However, if more than one PriorityClasses exists with their `globalDefault` field set to true, the smallest value of such global default PriorityClasses will be used as the default priority.
        */
      var globalDefault: js.UndefOr[Input[Boolean]] = js.undefined
      
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[Input[typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.PriorityClass]] = js.undefined
      
      /**
        * Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
        */
      var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
      
      /**
        * PreemptionPolicy is the Policy for preempting pods with lower priority. One of Never, PreemptLowerPriority. Defaults to PreemptLowerPriority if unset.
        */
      var preemptionPolicy: js.UndefOr[Input[String]] = js.undefined
      
      /**
        * The value of this priority class. This is the actual priority that pods receive when they have the name of this class in their pod spec.
        */
      var value: Input[Double]
    }
    object PriorityClass {
      
      inline def apply(value: Input[Double]): PriorityClass = {
        val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
        __obj.asInstanceOf[PriorityClass]
      }
      
      extension [Self <: PriorityClass](x: Self) {
        
        inline def setApiVersion(value: Input[schedulingDotk8sDotioSlashv1]): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
        
        inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
        
        inline def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
        
        inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
        
        inline def setGlobalDefault(value: Input[Boolean]): Self = StObject.set(x, "globalDefault", value.asInstanceOf[js.Any])
        
        inline def setGlobalDefaultUndefined: Self = StObject.set(x, "globalDefault", js.undefined)
        
        inline def setKind(value: Input[typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.PriorityClass]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setMetadata(value: Input[ObjectMeta]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
        
        inline def setPreemptionPolicy(value: Input[String]): Self = StObject.set(x, "preemptionPolicy", value.asInstanceOf[js.Any])
        
        inline def setPreemptionPolicyUndefined: Self = StObject.set(x, "preemptionPolicy", js.undefined)
        
        inline def setValue(value: Input[Double]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      }
    }
  }
  
  object v1alpha1 {
    
    /**
      * DEPRECATED - This group version of PriorityClass is deprecated by scheduling.k8s.io/v1/PriorityClass. PriorityClass defines mapping from a priority class name to the priority integer value. The value can be any valid integer.
      */
    trait PriorityClass extends StObject {
      
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[Input[schedulingDotk8sDotioSlashv1alpha1]] = js.undefined
      
      /**
        * description is an arbitrary string that usually provides guidelines on when this priority class should be used.
        */
      var description: js.UndefOr[Input[String]] = js.undefined
      
      /**
        * globalDefault specifies whether this PriorityClass should be considered as the default priority for pods that do not have any priority class. Only one PriorityClass can be marked as `globalDefault`. However, if more than one PriorityClasses exists with their `globalDefault` field set to true, the smallest value of such global default PriorityClasses will be used as the default priority.
        */
      var globalDefault: js.UndefOr[Input[Boolean]] = js.undefined
      
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[Input[typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.PriorityClass]] = js.undefined
      
      /**
        * Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
        */
      var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
      
      /**
        * PreemptionPolicy is the Policy for preempting pods with lower priority. One of Never, PreemptLowerPriority. Defaults to PreemptLowerPriority if unset. This field is alpha-level and is only honored by servers that enable the NonPreemptingPriority feature.
        */
      var preemptionPolicy: js.UndefOr[Input[String]] = js.undefined
      
      /**
        * The value of this priority class. This is the actual priority that pods receive when they have the name of this class in their pod spec.
        */
      var value: Input[Double]
    }
    object PriorityClass {
      
      inline def apply(value: Input[Double]): PriorityClass = {
        val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
        __obj.asInstanceOf[PriorityClass]
      }
      
      extension [Self <: PriorityClass](x: Self) {
        
        inline def setApiVersion(value: Input[schedulingDotk8sDotioSlashv1alpha1]): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
        
        inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
        
        inline def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
        
        inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
        
        inline def setGlobalDefault(value: Input[Boolean]): Self = StObject.set(x, "globalDefault", value.asInstanceOf[js.Any])
        
        inline def setGlobalDefaultUndefined: Self = StObject.set(x, "globalDefault", js.undefined)
        
        inline def setKind(value: Input[typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.PriorityClass]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setMetadata(value: Input[ObjectMeta]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
        
        inline def setPreemptionPolicy(value: Input[String]): Self = StObject.set(x, "preemptionPolicy", value.asInstanceOf[js.Any])
        
        inline def setPreemptionPolicyUndefined: Self = StObject.set(x, "preemptionPolicy", js.undefined)
        
        inline def setValue(value: Input[Double]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      }
    }
  }
  
  object v1beta1 {
    
    /**
      * DEPRECATED - This group version of PriorityClass is deprecated by scheduling.k8s.io/v1/PriorityClass. PriorityClass defines mapping from a priority class name to the priority integer value. The value can be any valid integer.
      */
    trait PriorityClass extends StObject {
      
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[Input[schedulingDotk8sDotioSlashv1beta1]] = js.undefined
      
      /**
        * description is an arbitrary string that usually provides guidelines on when this priority class should be used.
        */
      var description: js.UndefOr[Input[String]] = js.undefined
      
      /**
        * globalDefault specifies whether this PriorityClass should be considered as the default priority for pods that do not have any priority class. Only one PriorityClass can be marked as `globalDefault`. However, if more than one PriorityClasses exists with their `globalDefault` field set to true, the smallest value of such global default PriorityClasses will be used as the default priority.
        */
      var globalDefault: js.UndefOr[Input[Boolean]] = js.undefined
      
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[Input[typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.PriorityClass]] = js.undefined
      
      /**
        * Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
        */
      var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
      
      /**
        * PreemptionPolicy is the Policy for preempting pods with lower priority. One of Never, PreemptLowerPriority. Defaults to PreemptLowerPriority if unset. This field is alpha-level and is only honored by servers that enable the NonPreemptingPriority feature.
        */
      var preemptionPolicy: js.UndefOr[Input[String]] = js.undefined
      
      /**
        * The value of this priority class. This is the actual priority that pods receive when they have the name of this class in their pod spec.
        */
      var value: Input[Double]
    }
    object PriorityClass {
      
      inline def apply(value: Input[Double]): PriorityClass = {
        val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
        __obj.asInstanceOf[PriorityClass]
      }
      
      extension [Self <: PriorityClass](x: Self) {
        
        inline def setApiVersion(value: Input[schedulingDotk8sDotioSlashv1beta1]): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
        
        inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
        
        inline def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
        
        inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
        
        inline def setGlobalDefault(value: Input[Boolean]): Self = StObject.set(x, "globalDefault", value.asInstanceOf[js.Any])
        
        inline def setGlobalDefaultUndefined: Self = StObject.set(x, "globalDefault", js.undefined)
        
        inline def setKind(value: Input[typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.PriorityClass]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setMetadata(value: Input[ObjectMeta]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
        
        inline def setPreemptionPolicy(value: Input[String]): Self = StObject.set(x, "preemptionPolicy", value.asInstanceOf[js.Any])
        
        inline def setPreemptionPolicyUndefined: Self = StObject.set(x, "preemptionPolicy", js.undefined)
        
        inline def setValue(value: Input[Double]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      }
    }
  }
}
