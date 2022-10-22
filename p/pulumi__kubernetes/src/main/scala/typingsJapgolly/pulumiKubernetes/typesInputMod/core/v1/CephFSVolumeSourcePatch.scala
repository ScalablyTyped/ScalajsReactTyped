package typingsJapgolly.pulumiKubernetes.typesInputMod.core.v1

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a Ceph Filesystem mount that lasts the lifetime of a pod Cephfs volumes do not support ownership management or SELinux relabeling.
  */
trait CephFSVolumeSourcePatch extends StObject {
  
  /**
    * monitors is Required: Monitors is a collection of Ceph monitors More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
    */
  var monitors: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  
  /**
    * path is Optional: Used as the mounted root, rather than the full Ceph tree, default is /
    */
  var path: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * readOnly is Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts. More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
    */
  var readOnly: js.UndefOr[Input[Boolean]] = js.undefined
  
  /**
    * secretFile is Optional: SecretFile is the path to key ring for User, default is /etc/ceph/user.secret More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
    */
  var secretFile: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * secretRef is Optional: SecretRef is reference to the authentication secret for User, default is empty. More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
    */
  var secretRef: js.UndefOr[Input[LocalObjectReferencePatch]] = js.undefined
  
  /**
    * user is optional: User is the rados user name, default is admin More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
    */
  var user: js.UndefOr[Input[String]] = js.undefined
}
object CephFSVolumeSourcePatch {
  
  inline def apply(): CephFSVolumeSourcePatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CephFSVolumeSourcePatch]
  }
  
  extension [Self <: CephFSVolumeSourcePatch](x: Self) {
    
    inline def setMonitors(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "monitors", value.asInstanceOf[js.Any])
    
    inline def setMonitorsUndefined: Self = StObject.set(x, "monitors", js.undefined)
    
    inline def setMonitorsVarargs(value: Input[String]*): Self = StObject.set(x, "monitors", js.Array(value*))
    
    inline def setPath(value: Input[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setReadOnly(value: Input[Boolean]): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    inline def setSecretFile(value: Input[String]): Self = StObject.set(x, "secretFile", value.asInstanceOf[js.Any])
    
    inline def setSecretFileUndefined: Self = StObject.set(x, "secretFile", js.undefined)
    
    inline def setSecretRef(value: Input[LocalObjectReferencePatch]): Self = StObject.set(x, "secretRef", value.asInstanceOf[js.Any])
    
    inline def setSecretRefUndefined: Self = StObject.set(x, "secretRef", js.undefined)
    
    inline def setUser(value: Input[String]): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
