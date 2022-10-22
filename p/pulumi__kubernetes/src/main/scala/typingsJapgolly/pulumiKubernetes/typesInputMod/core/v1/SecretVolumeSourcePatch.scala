package typingsJapgolly.pulumiKubernetes.typesInputMod.core.v1

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Adapts a Secret into a volume.
  *
  * The contents of the target Secret's Data field will be presented in a volume as files using the keys in the Data field as the file names. Secret volumes support ownership management and SELinux relabeling.
  */
trait SecretVolumeSourcePatch extends StObject {
  
  /**
    * defaultMode is Optional: mode bits used to set permissions on created files by default. Must be an octal value between 0000 and 0777 or a decimal value between 0 and 511. YAML accepts both octal and decimal values, JSON requires decimal values for mode bits. Defaults to 0644. Directories within the path are not affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
    */
  var defaultMode: js.UndefOr[Input[Double]] = js.undefined
  
  /**
    * items If unspecified, each key-value pair in the Data field of the referenced Secret will be projected into the volume as a file whose name is the key and content is the value. If specified, the listed keys will be projected into the specified paths, and unlisted keys will not be present. If a key is specified which is not present in the Secret, the volume setup will error unless it is marked optional. Paths must be relative and may not contain the '..' path or start with '..'.
    */
  var items: js.UndefOr[Input[js.Array[Input[KeyToPathPatch]]]] = js.undefined
  
  /**
    * optional field specify whether the Secret or its keys must be defined
    */
  var optional: js.UndefOr[Input[Boolean]] = js.undefined
  
  /**
    * secretName is the name of the secret in the pod's namespace to use. More info: https://kubernetes.io/docs/concepts/storage/volumes#secret
    */
  var secretName: js.UndefOr[Input[String]] = js.undefined
}
object SecretVolumeSourcePatch {
  
  inline def apply(): SecretVolumeSourcePatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecretVolumeSourcePatch]
  }
  
  extension [Self <: SecretVolumeSourcePatch](x: Self) {
    
    inline def setDefaultMode(value: Input[Double]): Self = StObject.set(x, "defaultMode", value.asInstanceOf[js.Any])
    
    inline def setDefaultModeUndefined: Self = StObject.set(x, "defaultMode", js.undefined)
    
    inline def setItems(value: Input[js.Array[Input[KeyToPathPatch]]]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: Input[KeyToPathPatch]*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setOptional(value: Input[Boolean]): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    inline def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
    
    inline def setSecretName(value: Input[String]): Self = StObject.set(x, "secretName", value.asInstanceOf[js.Any])
    
    inline def setSecretNameUndefined: Self = StObject.set(x, "secretName", js.undefined)
  }
}
