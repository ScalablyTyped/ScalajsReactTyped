package typingsJapgolly.pulumiKubernetes.typesOutputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * VolumeMount describes a mounting of a Volume within a container.
  */
trait VolumeMountPatch extends StObject {
  
  /**
    * Path within the container at which the volume should be mounted.  Must not contain ':'.
    */
  var mountPath: String
  
  /**
    * mountPropagation determines how mounts are propagated from the host to container and the other way around. When not set, MountPropagationNone is used. This field is beta in 1.10.
    */
  var mountPropagation: String
  
  /**
    * This must match the Name of a Volume.
    */
  var name: String
  
  /**
    * Mounted read-only if true, read-write otherwise (false or unspecified). Defaults to false.
    */
  var readOnly: Boolean
  
  /**
    * Path within the volume from which the container's volume should be mounted. Defaults to "" (volume's root).
    */
  var subPath: String
  
  /**
    * Expanded path within the volume from which the container's volume should be mounted. Behaves similarly to SubPath but environment variable references $(VAR_NAME) are expanded using the container's environment. Defaults to "" (volume's root). SubPathExpr and SubPath are mutually exclusive.
    */
  var subPathExpr: String
}
object VolumeMountPatch {
  
  inline def apply(
    mountPath: String,
    mountPropagation: String,
    name: String,
    readOnly: Boolean,
    subPath: String,
    subPathExpr: String
  ): VolumeMountPatch = {
    val __obj = js.Dynamic.literal(mountPath = mountPath.asInstanceOf[js.Any], mountPropagation = mountPropagation.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any], subPath = subPath.asInstanceOf[js.Any], subPathExpr = subPathExpr.asInstanceOf[js.Any])
    __obj.asInstanceOf[VolumeMountPatch]
  }
  
  extension [Self <: VolumeMountPatch](x: Self) {
    
    inline def setMountPath(value: String): Self = StObject.set(x, "mountPath", value.asInstanceOf[js.Any])
    
    inline def setMountPropagation(value: String): Self = StObject.set(x, "mountPropagation", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    inline def setSubPath(value: String): Self = StObject.set(x, "subPath", value.asInstanceOf[js.Any])
    
    inline def setSubPathExpr(value: String): Self = StObject.set(x, "subPathExpr", value.asInstanceOf[js.Any])
  }
}
