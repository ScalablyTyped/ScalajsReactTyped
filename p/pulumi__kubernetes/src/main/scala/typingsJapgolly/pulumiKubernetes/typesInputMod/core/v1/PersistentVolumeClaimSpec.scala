package typingsJapgolly.pulumiKubernetes.typesInputMod.core.v1

import typingsJapgolly.pulumiKubernetes.typesInputMod.meta.v1.LabelSelector
import typingsJapgolly.pulumiPulumi.outputMod.Input
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
  var accessModes: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  
  /**
    * dataSource field can be used to specify either: * An existing VolumeSnapshot object (snapshot.storage.k8s.io/VolumeSnapshot) * An existing PVC (PersistentVolumeClaim) If the provisioner or an external controller can support the specified data source, it will create a new volume based on the contents of the specified data source. If the AnyVolumeDataSource feature gate is enabled, this field will always have the same contents as the DataSourceRef field.
    */
  var dataSource: js.UndefOr[Input[TypedLocalObjectReference]] = js.undefined
  
  /**
    * dataSourceRef specifies the object from which to populate the volume with data, if a non-empty volume is desired. This may be any local object from a non-empty API group (non core object) or a PersistentVolumeClaim object. When this field is specified, volume binding will only succeed if the type of the specified object matches some installed volume populator or dynamic provisioner. This field will replace the functionality of the DataSource field and as such if both fields are non-empty, they must have the same value. For backwards compatibility, both fields (DataSource and DataSourceRef) will be set to the same value automatically if one of them is empty and the other is non-empty. There are two important differences between DataSource and DataSourceRef: * While DataSource only allows two specific types of objects, DataSourceRef
    *   allows any non-core object, as well as PersistentVolumeClaim objects.
    * * While DataSource ignores disallowed values (dropping them), DataSourceRef
    *   preserves all values, and generates an error if a disallowed value is
    *   specified.
    * (Beta) Using this field requires the AnyVolumeDataSource feature gate to be enabled.
    */
  var dataSourceRef: js.UndefOr[Input[TypedLocalObjectReference]] = js.undefined
  
  /**
    * resources represents the minimum resources the volume should have. If RecoverVolumeExpansionFailure feature is enabled users are allowed to specify resource requirements that are lower than previous value but must still be higher than capacity recorded in the status field of the claim. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#resources
    */
  var resources: js.UndefOr[Input[ResourceRequirements]] = js.undefined
  
  /**
    * selector is a label query over volumes to consider for binding.
    */
  var selector: js.UndefOr[Input[LabelSelector]] = js.undefined
  
  /**
    * storageClassName is the name of the StorageClass required by the claim. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#class-1
    */
  var storageClassName: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * volumeMode defines what type of volume is required by the claim. Value of Filesystem is implied when not included in claim spec.
    */
  var volumeMode: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * volumeName is the binding reference to the PersistentVolume backing this claim.
    */
  var volumeName: js.UndefOr[Input[String]] = js.undefined
}
object PersistentVolumeClaimSpec {
  
  inline def apply(): PersistentVolumeClaimSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PersistentVolumeClaimSpec]
  }
  
  extension [Self <: PersistentVolumeClaimSpec](x: Self) {
    
    inline def setAccessModes(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "accessModes", value.asInstanceOf[js.Any])
    
    inline def setAccessModesUndefined: Self = StObject.set(x, "accessModes", js.undefined)
    
    inline def setAccessModesVarargs(value: Input[String]*): Self = StObject.set(x, "accessModes", js.Array(value*))
    
    inline def setDataSource(value: Input[TypedLocalObjectReference]): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceRef(value: Input[TypedLocalObjectReference]): Self = StObject.set(x, "dataSourceRef", value.asInstanceOf[js.Any])
    
    inline def setDataSourceRefUndefined: Self = StObject.set(x, "dataSourceRef", js.undefined)
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    inline def setResources(value: Input[ResourceRequirements]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    inline def setSelector(value: Input[LabelSelector]): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
    
    inline def setStorageClassName(value: Input[String]): Self = StObject.set(x, "storageClassName", value.asInstanceOf[js.Any])
    
    inline def setStorageClassNameUndefined: Self = StObject.set(x, "storageClassName", js.undefined)
    
    inline def setVolumeMode(value: Input[String]): Self = StObject.set(x, "volumeMode", value.asInstanceOf[js.Any])
    
    inline def setVolumeModeUndefined: Self = StObject.set(x, "volumeMode", js.undefined)
    
    inline def setVolumeName(value: Input[String]): Self = StObject.set(x, "volumeName", value.asInstanceOf[js.Any])
    
    inline def setVolumeNameUndefined: Self = StObject.set(x, "volumeName", js.undefined)
  }
}
