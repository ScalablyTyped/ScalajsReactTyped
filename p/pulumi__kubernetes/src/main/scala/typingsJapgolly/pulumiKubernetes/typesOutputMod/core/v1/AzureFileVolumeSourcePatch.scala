package typingsJapgolly.pulumiKubernetes.typesOutputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * AzureFile represents an Azure File Service mount on the host and bind mount to the pod.
  */
trait AzureFileVolumeSourcePatch extends StObject {
  
  /**
    * readOnly defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
    */
  var readOnly: Boolean
  
  /**
    * secretName is the  name of secret that contains Azure Storage Account Name and Key
    */
  var secretName: String
  
  /**
    * shareName is the azure share Name
    */
  var shareName: String
}
object AzureFileVolumeSourcePatch {
  
  inline def apply(readOnly: Boolean, secretName: String, shareName: String): AzureFileVolumeSourcePatch = {
    val __obj = js.Dynamic.literal(readOnly = readOnly.asInstanceOf[js.Any], secretName = secretName.asInstanceOf[js.Any], shareName = shareName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AzureFileVolumeSourcePatch]
  }
  
  extension [Self <: AzureFileVolumeSourcePatch](x: Self) {
    
    inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    inline def setSecretName(value: String): Self = StObject.set(x, "secretName", value.asInstanceOf[js.Any])
    
    inline def setShareName(value: String): Self = StObject.set(x, "shareName", value.asInstanceOf[js.Any])
  }
}
