package typingsJapgolly.pulumiKubernetes.typesOutputMod.core.v1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * PersistentVolumeClaimStatus is the current status of a persistent volume claim.
  */
trait PersistentVolumeClaimStatus extends StObject {
  
  /**
    * accessModes contains the actual access modes the volume backing the PVC has. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes-1
    */
  var accessModes: js.Array[String]
  
  /**
    * allocatedResources is the storage resource within AllocatedResources tracks the capacity allocated to a PVC. It may be larger than the actual capacity when a volume expansion operation is requested. For storage quota, the larger value from allocatedResources and PVC.spec.resources is used. If allocatedResources is not set, PVC.spec.resources alone is used for quota calculation. If a volume expansion capacity request is lowered, allocatedResources is only lowered if there are no expansion operations in progress and if the actual volume capacity is equal or lower than the requested capacity. This is an alpha field and requires enabling RecoverVolumeExpansionFailure feature.
    */
  var allocatedResources: StringDictionary[String]
  
  /**
    * capacity represents the actual resources of the underlying volume.
    */
  var capacity: StringDictionary[String]
  
  /**
    * conditions is the current Condition of persistent volume claim. If underlying persistent volume is being resized then the Condition will be set to 'ResizeStarted'.
    */
  var conditions: js.Array[PersistentVolumeClaimCondition]
  
  /**
    * phase represents the current phase of PersistentVolumeClaim.
    */
  var phase: String
  
  /**
    * resizeStatus stores status of resize operation. ResizeStatus is not set by default but when expansion is complete resizeStatus is set to empty string by resize controller or kubelet. This is an alpha field and requires enabling RecoverVolumeExpansionFailure feature.
    */
  var resizeStatus: String
}
object PersistentVolumeClaimStatus {
  
  inline def apply(
    accessModes: js.Array[String],
    allocatedResources: StringDictionary[String],
    capacity: StringDictionary[String],
    conditions: js.Array[PersistentVolumeClaimCondition],
    phase: String,
    resizeStatus: String
  ): PersistentVolumeClaimStatus = {
    val __obj = js.Dynamic.literal(accessModes = accessModes.asInstanceOf[js.Any], allocatedResources = allocatedResources.asInstanceOf[js.Any], capacity = capacity.asInstanceOf[js.Any], conditions = conditions.asInstanceOf[js.Any], phase = phase.asInstanceOf[js.Any], resizeStatus = resizeStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[PersistentVolumeClaimStatus]
  }
  
  extension [Self <: PersistentVolumeClaimStatus](x: Self) {
    
    inline def setAccessModes(value: js.Array[String]): Self = StObject.set(x, "accessModes", value.asInstanceOf[js.Any])
    
    inline def setAccessModesVarargs(value: String*): Self = StObject.set(x, "accessModes", js.Array(value*))
    
    inline def setAllocatedResources(value: StringDictionary[String]): Self = StObject.set(x, "allocatedResources", value.asInstanceOf[js.Any])
    
    inline def setCapacity(value: StringDictionary[String]): Self = StObject.set(x, "capacity", value.asInstanceOf[js.Any])
    
    inline def setConditions(value: js.Array[PersistentVolumeClaimCondition]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    inline def setConditionsVarargs(value: PersistentVolumeClaimCondition*): Self = StObject.set(x, "conditions", js.Array(value*))
    
    inline def setPhase(value: String): Self = StObject.set(x, "phase", value.asInstanceOf[js.Any])
    
    inline def setResizeStatus(value: String): Self = StObject.set(x, "resizeStatus", value.asInstanceOf[js.Any])
  }
}
