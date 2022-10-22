package typingsJapgolly.pulumiKubernetes.typesInputMod.core.v1

import typingsJapgolly.pulumiPulumi.outputMod.Input
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
  var mountPath: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * mountPropagation determines how mounts are propagated from the host to container and the other way around. When not set, MountPropagationNone is used. This field is beta in 1.10.
    */
  var mountPropagation: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * This must match the Name of a Volume.
    */
  var name: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Mounted read-only if true, read-write otherwise (false or unspecified). Defaults to false.
    */
  var readOnly: js.UndefOr[Input[Boolean]] = js.undefined
  
  /**
    * Path within the volume from which the container's volume should be mounted. Defaults to "" (volume's root).
    */
  var subPath: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Expanded path within the volume from which the container's volume should be mounted. Behaves similarly to SubPath but environment variable references $(VAR_NAME) are expanded using the container's environment. Defaults to "" (volume's root). SubPathExpr and SubPath are mutually exclusive.
    */
  var subPathExpr: js.UndefOr[Input[String]] = js.undefined
}
object VolumeMountPatch {
  
  inline def apply(): VolumeMountPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VolumeMountPatch]
  }
  
  extension [Self <: VolumeMountPatch](x: Self) {
    
    inline def setMountPath(value: Input[String]): Self = StObject.set(x, "mountPath", value.asInstanceOf[js.Any])
    
    inline def setMountPathUndefined: Self = StObject.set(x, "mountPath", js.undefined)
    
    inline def setMountPropagation(value: Input[String]): Self = StObject.set(x, "mountPropagation", value.asInstanceOf[js.Any])
    
    inline def setMountPropagationUndefined: Self = StObject.set(x, "mountPropagation", js.undefined)
    
    inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setReadOnly(value: Input[Boolean]): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    inline def setSubPath(value: Input[String]): Self = StObject.set(x, "subPath", value.asInstanceOf[js.Any])
    
    inline def setSubPathExpr(value: Input[String]): Self = StObject.set(x, "subPathExpr", value.asInstanceOf[js.Any])
    
    inline def setSubPathExprUndefined: Self = StObject.set(x, "subPathExpr", js.undefined)
    
    inline def setSubPathUndefined: Self = StObject.set(x, "subPath", js.undefined)
  }
}
