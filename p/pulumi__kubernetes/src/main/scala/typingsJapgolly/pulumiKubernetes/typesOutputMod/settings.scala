package typingsJapgolly.pulumiKubernetes.typesOutputMod

import typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.settingsDotk8sDotioSlashv1alpha1
import typingsJapgolly.pulumiKubernetes.typesOutputMod.core.v1.EnvFromSource
import typingsJapgolly.pulumiKubernetes.typesOutputMod.core.v1.EnvFromSourcePatch
import typingsJapgolly.pulumiKubernetes.typesOutputMod.core.v1.EnvVar
import typingsJapgolly.pulumiKubernetes.typesOutputMod.core.v1.EnvVarPatch
import typingsJapgolly.pulumiKubernetes.typesOutputMod.core.v1.Volume
import typingsJapgolly.pulumiKubernetes.typesOutputMod.core.v1.VolumeMount
import typingsJapgolly.pulumiKubernetes.typesOutputMod.core.v1.VolumeMountPatch
import typingsJapgolly.pulumiKubernetes.typesOutputMod.core.v1.VolumePatch
import typingsJapgolly.pulumiKubernetes.typesOutputMod.meta.v1.LabelSelector
import typingsJapgolly.pulumiKubernetes.typesOutputMod.meta.v1.LabelSelectorPatch
import typingsJapgolly.pulumiKubernetes.typesOutputMod.meta.v1.ObjectMeta
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object settings {
  
  object v1alpha1 {
    
    /**
      * PodPreset is a policy resource that defines additional runtime requirements for a Pod.
      */
    trait PodPreset extends StObject {
      
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        */
      var apiVersion: settingsDotk8sDotioSlashv1alpha1
      
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.PodPreset
      
      var metadata: ObjectMeta
      
      var spec: PodPresetSpec
    }
    object PodPreset {
      
      inline def apply(metadata: ObjectMeta, spec: PodPresetSpec): PodPreset = {
        val __obj = js.Dynamic.literal(apiVersion = "settings.k8s.io/v1alpha1", kind = "PodPreset", metadata = metadata.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any])
        __obj.asInstanceOf[PodPreset]
      }
      
      extension [Self <: PodPreset](x: Self) {
        
        inline def setApiVersion(value: settingsDotk8sDotioSlashv1alpha1): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
        
        inline def setKind(value: typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.PodPreset): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setMetadata(value: ObjectMeta): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        inline def setSpec(value: PodPresetSpec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * PodPresetSpec is a description of a pod preset.
      */
    trait PodPresetSpec extends StObject {
      
      /**
        * Env defines the collection of EnvVar to inject into containers.
        */
      var env: js.Array[EnvVar]
      
      /**
        * EnvFrom defines the collection of EnvFromSource to inject into containers.
        */
      var envFrom: js.Array[EnvFromSource]
      
      /**
        * Selector is a label query over a set of resources, in this case pods. Required.
        */
      var selector: LabelSelector
      
      /**
        * VolumeMounts defines the collection of VolumeMount to inject into containers.
        */
      var volumeMounts: js.Array[VolumeMount]
      
      /**
        * Volumes defines the collection of Volume to inject into the pod.
        */
      var volumes: js.Array[Volume]
    }
    object PodPresetSpec {
      
      inline def apply(
        env: js.Array[EnvVar],
        envFrom: js.Array[EnvFromSource],
        selector: LabelSelector,
        volumeMounts: js.Array[VolumeMount],
        volumes: js.Array[Volume]
      ): PodPresetSpec = {
        val __obj = js.Dynamic.literal(env = env.asInstanceOf[js.Any], envFrom = envFrom.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], volumeMounts = volumeMounts.asInstanceOf[js.Any], volumes = volumes.asInstanceOf[js.Any])
        __obj.asInstanceOf[PodPresetSpec]
      }
      
      extension [Self <: PodPresetSpec](x: Self) {
        
        inline def setEnv(value: js.Array[EnvVar]): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
        
        inline def setEnvFrom(value: js.Array[EnvFromSource]): Self = StObject.set(x, "envFrom", value.asInstanceOf[js.Any])
        
        inline def setEnvFromVarargs(value: EnvFromSource*): Self = StObject.set(x, "envFrom", js.Array(value*))
        
        inline def setEnvVarargs(value: EnvVar*): Self = StObject.set(x, "env", js.Array(value*))
        
        inline def setSelector(value: LabelSelector): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
        
        inline def setVolumeMounts(value: js.Array[VolumeMount]): Self = StObject.set(x, "volumeMounts", value.asInstanceOf[js.Any])
        
        inline def setVolumeMountsVarargs(value: VolumeMount*): Self = StObject.set(x, "volumeMounts", js.Array(value*))
        
        inline def setVolumes(value: js.Array[Volume]): Self = StObject.set(x, "volumes", value.asInstanceOf[js.Any])
        
        inline def setVolumesVarargs(value: Volume*): Self = StObject.set(x, "volumes", js.Array(value*))
      }
    }
    
    /**
      * PodPresetSpec is a description of a pod preset.
      */
    trait PodPresetSpecPatch extends StObject {
      
      /**
        * Env defines the collection of EnvVar to inject into containers.
        */
      var env: js.Array[EnvVarPatch]
      
      /**
        * EnvFrom defines the collection of EnvFromSource to inject into containers.
        */
      var envFrom: js.Array[EnvFromSourcePatch]
      
      /**
        * Selector is a label query over a set of resources, in this case pods. Required.
        */
      var selector: LabelSelectorPatch
      
      /**
        * VolumeMounts defines the collection of VolumeMount to inject into containers.
        */
      var volumeMounts: js.Array[VolumeMountPatch]
      
      /**
        * Volumes defines the collection of Volume to inject into the pod.
        */
      var volumes: js.Array[VolumePatch]
    }
    object PodPresetSpecPatch {
      
      inline def apply(
        env: js.Array[EnvVarPatch],
        envFrom: js.Array[EnvFromSourcePatch],
        selector: LabelSelectorPatch,
        volumeMounts: js.Array[VolumeMountPatch],
        volumes: js.Array[VolumePatch]
      ): PodPresetSpecPatch = {
        val __obj = js.Dynamic.literal(env = env.asInstanceOf[js.Any], envFrom = envFrom.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], volumeMounts = volumeMounts.asInstanceOf[js.Any], volumes = volumes.asInstanceOf[js.Any])
        __obj.asInstanceOf[PodPresetSpecPatch]
      }
      
      extension [Self <: PodPresetSpecPatch](x: Self) {
        
        inline def setEnv(value: js.Array[EnvVarPatch]): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
        
        inline def setEnvFrom(value: js.Array[EnvFromSourcePatch]): Self = StObject.set(x, "envFrom", value.asInstanceOf[js.Any])
        
        inline def setEnvFromVarargs(value: EnvFromSourcePatch*): Self = StObject.set(x, "envFrom", js.Array(value*))
        
        inline def setEnvVarargs(value: EnvVarPatch*): Self = StObject.set(x, "env", js.Array(value*))
        
        inline def setSelector(value: LabelSelectorPatch): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
        
        inline def setVolumeMounts(value: js.Array[VolumeMountPatch]): Self = StObject.set(x, "volumeMounts", value.asInstanceOf[js.Any])
        
        inline def setVolumeMountsVarargs(value: VolumeMountPatch*): Self = StObject.set(x, "volumeMounts", js.Array(value*))
        
        inline def setVolumes(value: js.Array[VolumePatch]): Self = StObject.set(x, "volumes", value.asInstanceOf[js.Any])
        
        inline def setVolumesVarargs(value: VolumePatch*): Self = StObject.set(x, "volumes", js.Array(value*))
      }
    }
  }
}
