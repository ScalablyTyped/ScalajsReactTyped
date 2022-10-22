package typingsJapgolly.pulumiKubernetes.typesOutputMod.core.v1

import typingsJapgolly.pulumiKubernetes.typesOutputMod.meta.v1.LabelSelector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * PersistentVolumeClaimSpec describes the common attributes of storage devices and allows a Source for provider-specific attributes
  */
trait PersistentVolumeClaimSpec extends StObject {
  
  /**
    * accessModes contains the desired access modes the volume should have. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes-1
    */
  var accessModes: js.Array[String]
  
  /**
    * dataSource field can be used to specify either: * An existing VolumeSnapshot object (snapshot.storage.k8s.io/VolumeSnapshot) * An existing PVC (PersistentVolumeClaim) If the provisioner or an external controller can support the specified data source, it will create a new volume based on the contents of the specified data source. If the AnyVolumeDataSource feature gate is enabled, this field will always have the same contents as the DataSourceRef field.
    */
  var dataSource: TypedLocalObjectReference
  
  /**
    * dataSourceRef specifies the object from which to populate the volume with data, if a non-empty volume is desired. This may be any local object from a non-empty API group (non core object) or a PersistentVolumeClaim object. When this field is specified, volume binding will only succeed if the type of the specified object matches some installed volume populator or dynamic provisioner. This field will replace the functionality of the DataSource field and as such if both fields are non-empty, they must have the same value. For backwards compatibility, both fields (DataSource and DataSourceRef) will be set to the same value automatically if one of them is empty and the other is non-empty. There are two important differences between DataSource and DataSourceRef: * While DataSource only allows two specific types of objects, DataSourceRef
    *   allows any non-core object, as well as PersistentVolumeClaim objects.
    * * While DataSource ignores disallowed values (dropping them), DataSourceRef
    *   preserves all values, and generates an error if a disallowed value is
    *   specified.
    * (Beta) Using this field requires the AnyVolumeDataSource feature gate to be enabled.
    */
  var dataSourceRef: TypedLocalObjectReference
  
  /**
    * resources represents the minimum resources the volume should have. If RecoverVolumeExpansionFailure feature is enabled users are allowed to specify resource requirements that are lower than previous value but must still be higher than capacity recorded in the status field of the claim. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#resources
    */
  var resources: ResourceRequirements
  
  /**
    * selector is a label query over volumes to consider for binding.
    */
  var selector: LabelSelector
  
  /**
    * storageClassName is the name of the StorageClass required by the claim. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#class-1
    */
  var storageClassName: String
  
  /**
    * volumeMode defines what type of volume is required by the claim. Value of Filesystem is implied when not included in claim spec.
    */
  var volumeMode: String
  
  /**
    * volumeName is the binding reference to the PersistentVolume backing this claim.
    */
  var volumeName: String
}
object PersistentVolumeClaimSpec {
  
  inline def apply(
    accessModes: js.Array[String],
    dataSource: TypedLocalObjectReference,
    dataSourceRef: TypedLocalObjectReference,
    resources: ResourceRequirements,
    selector: LabelSelector,
    storageClassName: String,
    volumeMode: String,
    volumeName: String
  ): PersistentVolumeClaimSpec = {
    val __obj = js.Dynamic.literal(accessModes = accessModes.asInstanceOf[js.Any], dataSource = dataSource.asInstanceOf[js.Any], dataSourceRef = dataSourceRef.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], storageClassName = storageClassName.asInstanceOf[js.Any], volumeMode = volumeMode.asInstanceOf[js.Any], volumeName = volumeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PersistentVolumeClaimSpec]
  }
  
  extension [Self <: PersistentVolumeClaimSpec](x: Self) {
    
    inline def setAccessModes(value: js.Array[String]): Self = StObject.set(x, "accessModes", value.asInstanceOf[js.Any])
    
    inline def setAccessModesVarargs(value: String*): Self = StObject.set(x, "accessModes", js.Array(value*))
    
    inline def setDataSource(value: TypedLocalObjectReference): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceRef(value: TypedLocalObjectReference): Self = StObject.set(x, "dataSourceRef", value.asInstanceOf[js.Any])
    
    inline def setResources(value: ResourceRequirements): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setSelector(value: LabelSelector): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setStorageClassName(value: String): Self = StObject.set(x, "storageClassName", value.asInstanceOf[js.Any])
    
    inline def setVolumeMode(value: String): Self = StObject.set(x, "volumeMode", value.asInstanceOf[js.Any])
    
    inline def setVolumeName(value: String): Self = StObject.set(x, "volumeName", value.asInstanceOf[js.Any])
  }
}
