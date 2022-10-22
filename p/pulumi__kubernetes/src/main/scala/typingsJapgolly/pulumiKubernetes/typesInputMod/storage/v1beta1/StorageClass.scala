package typingsJapgolly.pulumiKubernetes.typesInputMod.storage.v1beta1

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.storageDotk8sDotioSlashv1beta1
import typingsJapgolly.pulumiKubernetes.typesInputMod.core.v1.TopologySelectorTerm
import typingsJapgolly.pulumiKubernetes.typesInputMod.meta.v1.ObjectMeta
import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * StorageClass describes the parameters for a class of storage for which PersistentVolumes can be dynamically provisioned.
  *
  * StorageClasses are non-namespaced; the name of the storage class according to etcd is in ObjectMeta.Name.
  */
trait StorageClass extends StObject {
  
  /**
    * AllowVolumeExpansion shows whether the storage class allow volume expand
    */
  var allowVolumeExpansion: js.UndefOr[Input[Boolean]] = js.undefined
  
  /**
    * Restrict the node topologies where volumes can be dynamically provisioned. Each volume plugin defines its own supported topology specifications. An empty TopologySelectorTerm list means there is no topology restriction. This field is only honored by servers that enable the VolumeScheduling feature.
    */
  var allowedTopologies: js.UndefOr[Input[js.Array[Input[TopologySelectorTerm]]]] = js.undefined
  
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  var apiVersion: js.UndefOr[Input[storageDotk8sDotioSlashv1beta1]] = js.undefined
  
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: js.UndefOr[Input[typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.StorageClass]] = js.undefined
  
  /**
    * Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
  
  /**
    * Dynamically provisioned PersistentVolumes of this storage class are created with these mountOptions, e.g. ["ro", "soft"]. Not validated - mount of the PVs will simply fail if one is invalid.
    */
  var mountOptions: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  
  /**
    * Parameters holds the parameters for the provisioner that should create volumes of this storage class.
    */
  var parameters: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  
  /**
    * Provisioner indicates the type of the provisioner.
    */
  var provisioner: Input[String]
  
  /**
    * Dynamically provisioned PersistentVolumes of this storage class are created with this reclaimPolicy. Defaults to Delete.
    */
  var reclaimPolicy: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * VolumeBindingMode indicates how PersistentVolumeClaims should be provisioned and bound.  When unset, VolumeBindingImmediate is used. This field is only honored by servers that enable the VolumeScheduling feature.
    */
  var volumeBindingMode: js.UndefOr[Input[String]] = js.undefined
}
object StorageClass {
  
  inline def apply(provisioner: Input[String]): StorageClass = {
    val __obj = js.Dynamic.literal(provisioner = provisioner.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorageClass]
  }
  
  extension [Self <: StorageClass](x: Self) {
    
    inline def setAllowVolumeExpansion(value: Input[Boolean]): Self = StObject.set(x, "allowVolumeExpansion", value.asInstanceOf[js.Any])
    
    inline def setAllowVolumeExpansionUndefined: Self = StObject.set(x, "allowVolumeExpansion", js.undefined)
    
    inline def setAllowedTopologies(value: Input[js.Array[Input[TopologySelectorTerm]]]): Self = StObject.set(x, "allowedTopologies", value.asInstanceOf[js.Any])
    
    inline def setAllowedTopologiesUndefined: Self = StObject.set(x, "allowedTopologies", js.undefined)
    
    inline def setAllowedTopologiesVarargs(value: Input[TopologySelectorTerm]*): Self = StObject.set(x, "allowedTopologies", js.Array(value*))
    
    inline def setApiVersion(value: Input[storageDotk8sDotioSlashv1beta1]): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
    
    inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
    
    inline def setKind(value: Input[typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.StorageClass]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setMetadata(value: Input[ObjectMeta]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setMountOptions(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "mountOptions", value.asInstanceOf[js.Any])
    
    inline def setMountOptionsUndefined: Self = StObject.set(x, "mountOptions", js.undefined)
    
    inline def setMountOptionsVarargs(value: Input[String]*): Self = StObject.set(x, "mountOptions", js.Array(value*))
    
    inline def setParameters(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setProvisioner(value: Input[String]): Self = StObject.set(x, "provisioner", value.asInstanceOf[js.Any])
    
    inline def setReclaimPolicy(value: Input[String]): Self = StObject.set(x, "reclaimPolicy", value.asInstanceOf[js.Any])
    
    inline def setReclaimPolicyUndefined: Self = StObject.set(x, "reclaimPolicy", js.undefined)
    
    inline def setVolumeBindingMode(value: Input[String]): Self = StObject.set(x, "volumeBindingMode", value.asInstanceOf[js.Any])
    
    inline def setVolumeBindingModeUndefined: Self = StObject.set(x, "volumeBindingMode", js.undefined)
  }
}
