package typingsJapgolly.pulumiKubernetes.typesInputMod.apps.v1

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * StatefulSetPersistentVolumeClaimRetentionPolicy describes the policy used for PVCs created from the StatefulSet VolumeClaimTemplates.
  */
trait StatefulSetPersistentVolumeClaimRetentionPolicyPatch extends StObject {
  
  /**
    * WhenDeleted specifies what happens to PVCs created from StatefulSet VolumeClaimTemplates when the StatefulSet is deleted. The default policy of `Retain` causes PVCs to not be affected by StatefulSet deletion. The `Delete` policy causes those PVCs to be deleted.
    */
  var whenDeleted: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * WhenScaled specifies what happens to PVCs created from StatefulSet VolumeClaimTemplates when the StatefulSet is scaled down. The default policy of `Retain` causes PVCs to not be affected by a scaledown. The `Delete` policy causes the associated PVCs for any excess pods above the replica count to be deleted.
    */
  var whenScaled: js.UndefOr[Input[String]] = js.undefined
}
object StatefulSetPersistentVolumeClaimRetentionPolicyPatch {
  
  inline def apply(): StatefulSetPersistentVolumeClaimRetentionPolicyPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatefulSetPersistentVolumeClaimRetentionPolicyPatch]
  }
  
  extension [Self <: StatefulSetPersistentVolumeClaimRetentionPolicyPatch](x: Self) {
    
    inline def setWhenDeleted(value: Input[String]): Self = StObject.set(x, "whenDeleted", value.asInstanceOf[js.Any])
    
    inline def setWhenDeletedUndefined: Self = StObject.set(x, "whenDeleted", js.undefined)
    
    inline def setWhenScaled(value: Input[String]): Self = StObject.set(x, "whenScaled", value.asInstanceOf[js.Any])
    
    inline def setWhenScaledUndefined: Self = StObject.set(x, "whenScaled", js.undefined)
  }
}
