package typingsJapgolly.pulumiKubernetes.typesInputMod.core.v1

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Adapts a ConfigMap into a volume.
  *
  * The contents of the target ConfigMap's Data field will be presented in a volume as files using the keys in the Data field as the file names, unless the items element is populated with specific mappings of keys to paths. ConfigMap volumes support ownership management and SELinux relabeling.
  */
trait ConfigMapVolumeSourcePatch extends StObject {
  
  /**
    * defaultMode is optional: mode bits used to set permissions on created files by default. Must be an octal value between 0000 and 0777 or a decimal value between 0 and 511. YAML accepts both octal and decimal values, JSON requires decimal values for mode bits. Defaults to 0644. Directories within the path are not affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
    */
  var defaultMode: js.UndefOr[Input[Double]] = js.undefined
  
  /**
    * items if unspecified, each key-value pair in the Data field of the referenced ConfigMap will be projected into the volume as a file whose name is the key and content is the value. If specified, the listed keys will be projected into the specified paths, and unlisted keys will not be present. If a key is specified which is not present in the ConfigMap, the volume setup will error unless it is marked optional. Paths must be relative and may not contain the '..' path or start with '..'.
    */
  var items: js.UndefOr[Input[js.Array[Input[KeyToPathPatch]]]] = js.undefined
  
  /**
    * Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
    */
  var name: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * optional specify whether the ConfigMap or its keys must be defined
    */
  var optional: js.UndefOr[Input[Boolean]] = js.undefined
}
object ConfigMapVolumeSourcePatch {
  
  inline def apply(): ConfigMapVolumeSourcePatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigMapVolumeSourcePatch]
  }
  
  extension [Self <: ConfigMapVolumeSourcePatch](x: Self) {
    
    inline def setDefaultMode(value: Input[Double]): Self = StObject.set(x, "defaultMode", value.asInstanceOf[js.Any])
    
    inline def setDefaultModeUndefined: Self = StObject.set(x, "defaultMode", js.undefined)
    
    inline def setItems(value: Input[js.Array[Input[KeyToPathPatch]]]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: Input[KeyToPathPatch]*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOptional(value: Input[Boolean]): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    inline def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
  }
}
