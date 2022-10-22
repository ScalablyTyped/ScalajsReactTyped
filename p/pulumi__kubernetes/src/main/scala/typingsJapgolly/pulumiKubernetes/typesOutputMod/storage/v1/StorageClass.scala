package typingsJapgolly.pulumiKubernetes.typesOutputMod.storage.v1

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.storageDotk8sDotioSlashv1
import typingsJapgolly.pulumiKubernetes.typesOutputMod.core.v1.TopologySelectorTerm
import typingsJapgolly.pulumiKubernetes.typesOutputMod.meta.v1.ObjectMeta
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
  var allowVolumeExpansion: Boolean
  
  /**
    * Restrict the node topologies where volumes can be dynamically provisioned. Each volume plugin defines its own supported topology specifications. An empty TopologySelectorTerm list means there is no topology restriction. This field is only honored by servers that enable the VolumeScheduling feature.
    */
  var allowedTopologies: js.Array[TopologySelectorTerm]
  
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  var apiVersion: storageDotk8sDotioSlashv1
  
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.StorageClass
  
  /**
    * Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  var metadata: ObjectMeta
  
  /**
    * Dynamically provisioned PersistentVolumes of this storage class are created with these mountOptions, e.g. ["ro", "soft"]. Not validated - mount of the PVs will simply fail if one is invalid.
    */
  var mountOptions: js.Array[String]
  
  /**
    * Parameters holds the parameters for the provisioner that should create volumes of this storage class.
    */
  var parameters: StringDictionary[String]
  
  /**
    * Provisioner indicates the type of the provisioner.
    */
  var provisioner: String
  
  /**
    * Dynamically provisioned PersistentVolumes of this storage class are created with this reclaimPolicy. Defaults to Delete.
    */
  var reclaimPolicy: String
  
  /**
    * VolumeBindingMode indicates how PersistentVolumeClaims should be provisioned and bound.  When unset, VolumeBindingImmediate is used. This field is only honored by servers that enable the VolumeScheduling feature.
    */
  var volumeBindingMode: String
}
object StorageClass {
  
  inline def apply(
    allowVolumeExpansion: Boolean,
    allowedTopologies: js.Array[TopologySelectorTerm],
    metadata: ObjectMeta,
    mountOptions: js.Array[String],
    parameters: StringDictionary[String],
    provisioner: String,
    reclaimPolicy: String,
    volumeBindingMode: String
  ): StorageClass = {
    val __obj = js.Dynamic.literal(allowVolumeExpansion = allowVolumeExpansion.asInstanceOf[js.Any], allowedTopologies = allowedTopologies.asInstanceOf[js.Any], apiVersion = "storage.k8s.io/v1", kind = "StorageClass", metadata = metadata.asInstanceOf[js.Any], mountOptions = mountOptions.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], provisioner = provisioner.asInstanceOf[js.Any], reclaimPolicy = reclaimPolicy.asInstanceOf[js.Any], volumeBindingMode = volumeBindingMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorageClass]
  }
  
  extension [Self <: StorageClass](x: Self) {
    
    inline def setAllowVolumeExpansion(value: Boolean): Self = StObject.set(x, "allowVolumeExpansion", value.asInstanceOf[js.Any])
    
    inline def setAllowedTopologies(value: js.Array[TopologySelectorTerm]): Self = StObject.set(x, "allowedTopologies", value.asInstanceOf[js.Any])
    
    inline def setAllowedTopologiesVarargs(value: TopologySelectorTerm*): Self = StObject.set(x, "allowedTopologies", js.Array(value*))
    
    inline def setApiVersion(value: storageDotk8sDotioSlashv1): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
    
    inline def setKind(value: typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.StorageClass): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: ObjectMeta): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMountOptions(value: js.Array[String]): Self = StObject.set(x, "mountOptions", value.asInstanceOf[js.Any])
    
    inline def setMountOptionsVarargs(value: String*): Self = StObject.set(x, "mountOptions", js.Array(value*))
    
    inline def setParameters(value: StringDictionary[String]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setProvisioner(value: String): Self = StObject.set(x, "provisioner", value.asInstanceOf[js.Any])
    
    inline def setReclaimPolicy(value: String): Self = StObject.set(x, "reclaimPolicy", value.asInstanceOf[js.Any])
    
    inline def setVolumeBindingMode(value: String): Self = StObject.set(x, "volumeBindingMode", value.asInstanceOf[js.Any])
  }
}
