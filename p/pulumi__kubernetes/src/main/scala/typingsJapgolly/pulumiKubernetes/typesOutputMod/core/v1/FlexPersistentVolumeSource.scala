package typingsJapgolly.pulumiKubernetes.typesOutputMod.core.v1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * FlexPersistentVolumeSource represents a generic persistent volume resource that is provisioned/attached using an exec based plugin.
  */
trait FlexPersistentVolumeSource extends StObject {
  
  /**
    * driver is the name of the driver to use for this volume.
    */
  var driver: String
  
  /**
    * fsType is the Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". The default filesystem depends on FlexVolume script.
    */
  var fsType: String
  
  /**
    * options is Optional: this field holds extra command options if any.
    */
  var options: StringDictionary[String]
  
  /**
    * readOnly is Optional: defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
    */
  var readOnly: Boolean
  
  /**
    * secretRef is Optional: SecretRef is reference to the secret object containing sensitive information to pass to the plugin scripts. This may be empty if no secret object is specified. If the secret object contains more than one secret, all secrets are passed to the plugin scripts.
    */
  var secretRef: SecretReference
}
object FlexPersistentVolumeSource {
  
  inline def apply(
    driver: String,
    fsType: String,
    options: StringDictionary[String],
    readOnly: Boolean,
    secretRef: SecretReference
  ): FlexPersistentVolumeSource = {
    val __obj = js.Dynamic.literal(driver = driver.asInstanceOf[js.Any], fsType = fsType.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any], secretRef = secretRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlexPersistentVolumeSource]
  }
  
  extension [Self <: FlexPersistentVolumeSource](x: Self) {
    
    inline def setDriver(value: String): Self = StObject.set(x, "driver", value.asInstanceOf[js.Any])
    
    inline def setFsType(value: String): Self = StObject.set(x, "fsType", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: StringDictionary[String]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    inline def setSecretRef(value: SecretReference): Self = StObject.set(x, "secretRef", value.asInstanceOf[js.Any])
  }
}
