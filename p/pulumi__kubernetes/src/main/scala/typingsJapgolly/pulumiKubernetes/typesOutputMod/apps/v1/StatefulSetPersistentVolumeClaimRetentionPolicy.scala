package typingsJapgolly.pulumiKubernetes.typesOutputMod.apps.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * StatefulSetPersistentVolumeClaimRetentionPolicy describes the policy used for PVCs created from the StatefulSet VolumeClaimTemplates.
  */
trait StatefulSetPersistentVolumeClaimRetentionPolicy extends StObject {
  
  /**
    * WhenDeleted specifies what happens to PVCs created from StatefulSet VolumeClaimTemplates when the StatefulSet is deleted. The default policy of `Retain` causes PVCs to not be affected by StatefulSet deletion. The `Delete` policy causes those PVCs to be deleted.
    */
  var whenDeleted: String
  
  /**
    * WhenScaled specifies what happens to PVCs created from StatefulSet VolumeClaimTemplates when the StatefulSet is scaled down. The default policy of `Retain` causes PVCs to not be affected by a scaledown. The `Delete` policy causes the associated PVCs for any excess pods above the replica count to be deleted.
    */
  var whenScaled: String
}
object StatefulSetPersistentVolumeClaimRetentionPolicy {
  
  inline def apply(whenDeleted: String, whenScaled: String): StatefulSetPersistentVolumeClaimRetentionPolicy = {
    val __obj = js.Dynamic.literal(whenDeleted = whenDeleted.asInstanceOf[js.Any], whenScaled = whenScaled.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatefulSetPersistentVolumeClaimRetentionPolicy]
  }
  
  extension [Self <: StatefulSetPersistentVolumeClaimRetentionPolicy](x: Self) {
    
    inline def setWhenDeleted(value: String): Self = StObject.set(x, "whenDeleted", value.asInstanceOf[js.Any])
    
    inline def setWhenScaled(value: String): Self = StObject.set(x, "whenScaled", value.asInstanceOf[js.Any])
  }
}
