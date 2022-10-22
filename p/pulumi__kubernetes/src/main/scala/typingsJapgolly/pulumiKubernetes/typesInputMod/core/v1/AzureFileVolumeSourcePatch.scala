package typingsJapgolly.pulumiKubernetes.typesInputMod.core.v1

import typingsJapgolly.pulumiPulumi.outputMod.Input
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
  var readOnly: js.UndefOr[Input[Boolean]] = js.undefined
  
  /**
    * secretName is the  name of secret that contains Azure Storage Account Name and Key
    */
  var secretName: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * shareName is the azure share Name
    */
  var shareName: js.UndefOr[Input[String]] = js.undefined
}
object AzureFileVolumeSourcePatch {
  
  inline def apply(): AzureFileVolumeSourcePatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AzureFileVolumeSourcePatch]
  }
  
  extension [Self <: AzureFileVolumeSourcePatch](x: Self) {
    
    inline def setReadOnly(value: Input[Boolean]): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    inline def setSecretName(value: Input[String]): Self = StObject.set(x, "secretName", value.asInstanceOf[js.Any])
    
    inline def setSecretNameUndefined: Self = StObject.set(x, "secretName", js.undefined)
    
    inline def setShareName(value: Input[String]): Self = StObject.set(x, "shareName", value.asInstanceOf[js.Any])
    
    inline def setShareNameUndefined: Self = StObject.set(x, "shareName", js.undefined)
  }
}
