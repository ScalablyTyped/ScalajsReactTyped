package typingsJapgolly.pulumiKubernetes.typesOutputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a cinder volume resource in Openstack. A Cinder volume must exist before mounting to a container. The volume must also be in the same region as the kubelet. Cinder volumes support ownership management and SELinux relabeling.
  */
trait CinderPersistentVolumeSource extends StObject {
  
  /**
    * fsType Filesystem type to mount. Must be a filesystem type supported by the host operating system. Examples: "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified. More info: https://examples.k8s.io/mysql-cinder-pd/README.md
    */
  var fsType: String
  
  /**
    * readOnly is Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts. More info: https://examples.k8s.io/mysql-cinder-pd/README.md
    */
  var readOnly: Boolean
  
  /**
    * secretRef is Optional: points to a secret object containing parameters used to connect to OpenStack.
    */
  var secretRef: SecretReference
  
  /**
    * volumeID used to identify the volume in cinder. More info: https://examples.k8s.io/mysql-cinder-pd/README.md
    */
  var volumeID: String
}
object CinderPersistentVolumeSource {
  
  inline def apply(fsType: String, readOnly: Boolean, secretRef: SecretReference, volumeID: String): CinderPersistentVolumeSource = {
    val __obj = js.Dynamic.literal(fsType = fsType.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any], secretRef = secretRef.asInstanceOf[js.Any], volumeID = volumeID.asInstanceOf[js.Any])
    __obj.asInstanceOf[CinderPersistentVolumeSource]
  }
  
  extension [Self <: CinderPersistentVolumeSource](x: Self) {
    
    inline def setFsType(value: String): Self = StObject.set(x, "fsType", value.asInstanceOf[js.Any])
    
    inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    inline def setSecretRef(value: SecretReference): Self = StObject.set(x, "secretRef", value.asInstanceOf[js.Any])
    
    inline def setVolumeID(value: String): Self = StObject.set(x, "volumeID", value.asInstanceOf[js.Any])
  }
}
