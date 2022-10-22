package typingsJapgolly.pulumiKubernetes.typesOutputMod.core.v1

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
  var configMap: ConfigMapProjectionPatch
  
  /**
    * downwardAPI information about the downwardAPI data to project
    */
  var downwardAPI: DownwardAPIProjectionPatch
  
  /**
    * secret information about the secret data to project
    */
  var secret: SecretProjectionPatch
  
  /**
    * serviceAccountToken is information about the serviceAccountToken data to project
    */
  var serviceAccountToken: ServiceAccountTokenProjectionPatch
}
object VolumeProjectionPatch {
  
  inline def apply(
    configMap: ConfigMapProjectionPatch,
    downwardAPI: DownwardAPIProjectionPatch,
    secret: SecretProjectionPatch,
    serviceAccountToken: ServiceAccountTokenProjectionPatch
  ): VolumeProjectionPatch = {
    val __obj = js.Dynamic.literal(configMap = configMap.asInstanceOf[js.Any], downwardAPI = downwardAPI.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any], serviceAccountToken = serviceAccountToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[VolumeProjectionPatch]
  }
  
  extension [Self <: VolumeProjectionPatch](x: Self) {
    
    inline def setConfigMap(value: ConfigMapProjectionPatch): Self = StObject.set(x, "configMap", value.asInstanceOf[js.Any])
    
    inline def setDownwardAPI(value: DownwardAPIProjectionPatch): Self = StObject.set(x, "downwardAPI", value.asInstanceOf[js.Any])
    
    inline def setSecret(value: SecretProjectionPatch): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
    
    inline def setServiceAccountToken(value: ServiceAccountTokenProjectionPatch): Self = StObject.set(x, "serviceAccountToken", value.asInstanceOf[js.Any])
  }
}
