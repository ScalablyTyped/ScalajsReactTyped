package typingsJapgolly.pulumiKubernetes.typesInputMod.core.v1

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Projection that may be projected along with other supported volume types
  */
trait VolumeProjectionPatch extends StObject {
  
  /**
    * configMap information about the configMap data to project
    */
  var configMap: js.UndefOr[Input[ConfigMapProjectionPatch]] = js.undefined
  
  /**
    * downwardAPI information about the downwardAPI data to project
    */
  var downwardAPI: js.UndefOr[Input[DownwardAPIProjectionPatch]] = js.undefined
  
  /**
    * secret information about the secret data to project
    */
  var secret: js.UndefOr[Input[SecretProjectionPatch]] = js.undefined
  
  /**
    * serviceAccountToken is information about the serviceAccountToken data to project
    */
  var serviceAccountToken: js.UndefOr[Input[ServiceAccountTokenProjectionPatch]] = js.undefined
}
object VolumeProjectionPatch {
  
  inline def apply(): VolumeProjectionPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VolumeProjectionPatch]
  }
  
  extension [Self <: VolumeProjectionPatch](x: Self) {
    
    inline def setConfigMap(value: Input[ConfigMapProjectionPatch]): Self = StObject.set(x, "configMap", value.asInstanceOf[js.Any])
    
    inline def setConfigMapUndefined: Self = StObject.set(x, "configMap", js.undefined)
    
    inline def setDownwardAPI(value: Input[DownwardAPIProjectionPatch]): Self = StObject.set(x, "downwardAPI", value.asInstanceOf[js.Any])
    
    inline def setDownwardAPIUndefined: Self = StObject.set(x, "downwardAPI", js.undefined)
    
    inline def setSecret(value: Input[SecretProjectionPatch]): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
    
    inline def setSecretUndefined: Self = StObject.set(x, "secret", js.undefined)
    
    inline def setServiceAccountToken(value: Input[ServiceAccountTokenProjectionPatch]): Self = StObject.set(x, "serviceAccountToken", value.asInstanceOf[js.Any])
    
    inline def setServiceAccountTokenUndefined: Self = StObject.set(x, "serviceAccountToken", js.undefined)
  }
}
