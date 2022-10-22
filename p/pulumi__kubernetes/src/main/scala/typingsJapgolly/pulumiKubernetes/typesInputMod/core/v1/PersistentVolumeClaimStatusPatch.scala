package typingsJapgolly.pulumiKubernetes.typesInputMod.core.v1

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * PersistentVolumeClaimStatus is the current status of a persistent volume claim.
  */
trait PersistentVolumeClaimStatusPatch extends StObject {
  
  /**
    * accessModes contains the actual access modes the volume backing the PVC has. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes-1
    */
  var accessModes: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  
  /**
    * allocatedResources is the storage resource within AllocatedResources tracks the capacity allocated to a PVC. It may be larger than the actual capacity when a volume expansion operation is requested. For storage quota, the larger value from allocatedResources and PVC.spec.resources is used. If allocatedResources is not set, PVC.spec.resources alone is used for quota calculation. If a volume expansion capacity request is lowered, allocatedResources is only lowered if there are no expansion operations in progress and if the actual volume capacity is equal or lower than the requested capacity. This is an alpha field and requires enabling RecoverVolumeExpansionFailure feature.
    */
  var allocatedResources: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  
  /**
    * capacity represents the actual resources of the underlying volume.
    */
  var capacity: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  
  /**
    * conditions is the current Condition of persistent volume claim. If underlying persistent volume is being resized then the Condition will be set to 'ResizeStarted'.
    */
  var conditions: js.UndefOr[Input[js.Array[Input[PersistentVolumeClaimConditionPatch]]]] = js.undefined
  
  /**
    * phase represents the current phase of PersistentVolumeClaim.
    */
  var phase: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * resizeStatus stores status of resize operation. ResizeStatus is not set by default but when expansion is complete resizeStatus is set to empty string by resize controller or kubelet. This is an alpha field and requires enabling RecoverVolumeExpansionFailure feature.
    */
  var resizeStatus: js.UndefOr[Input[String]] = js.undefined
}
object PersistentVolumeClaimStatusPatch {
  
  inline def apply(): PersistentVolumeClaimStatusPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PersistentVolumeClaimStatusPatch]
  }
  
  extension [Self <: PersistentVolumeClaimStatusPatch](x: Self) {
    
    inline def setAccessModes(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "accessModes", value.asInstanceOf[js.Any])
    
    inline def setAccessModesUndefined: Self = StObject.set(x, "accessModes", js.undefined)
    
    inline def setAccessModesVarargs(value: Input[String]*): Self = StObject.set(x, "accessModes", js.Array(value*))
    
    inline def setAllocatedResources(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "allocatedResources", value.asInstanceOf[js.Any])
    
    inline def setAllocatedResourcesUndefined: Self = StObject.set(x, "allocatedResources", js.undefined)
    
    inline def setCapacity(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "capacity", value.asInstanceOf[js.Any])
    
    inline def setCapacityUndefined: Self = StObject.set(x, "capacity", js.undefined)
    
    inline def setConditions(value: Input[js.Array[Input[PersistentVolumeClaimConditionPatch]]]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    inline def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
    
    inline def setConditionsVarargs(value: Input[PersistentVolumeClaimConditionPatch]*): Self = StObject.set(x, "conditions", js.Array(value*))
    
    inline def setPhase(value: Input[String]): Self = StObject.set(x, "phase", value.asInstanceOf[js.Any])
    
    inline def setPhaseUndefined: Self = StObject.set(x, "phase", js.undefined)
    
    inline def setResizeStatus(value: Input[String]): Self = StObject.set(x, "resizeStatus", value.asInstanceOf[js.Any])
    
    inline def setResizeStatusUndefined: Self = StObject.set(x, "resizeStatus", js.undefined)
  }
}
