package typingsJapgolly.pulumiKubernetes.typesOutputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * PersistentVolumeClaimVolumeSource references the user's PVC in the same namespace. This volume finds the bound PV and mounts that volume for the pod. A PersistentVolumeClaimVolumeSource is, essentially, a wrapper around another type of volume that is owned by someone else (the system).
  */
trait PersistentVolumeClaimVolumeSourcePatch extends StObject {
  
  /**
    * claimName is the name of a PersistentVolumeClaim in the same namespace as the pod using this volume. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims
    */
  var claimName: String
  
  /**
    * readOnly Will force the ReadOnly setting in VolumeMounts. Default false.
    */
  var readOnly: Boolean
}
object PersistentVolumeClaimVolumeSourcePatch {
  
  inline def apply(claimName: String, readOnly: Boolean): PersistentVolumeClaimVolumeSourcePatch = {
    val __obj = js.Dynamic.literal(claimName = claimName.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[PersistentVolumeClaimVolumeSourcePatch]
  }
  
  extension [Self <: PersistentVolumeClaimVolumeSourcePatch](x: Self) {
    
    inline def setClaimName(value: String): Self = StObject.set(x, "claimName", value.asInstanceOf[js.Any])
    
    inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
  }
}
