package typingsJapgolly.pulumiKubernetes.typesOutputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Projection that may be projected along with other supported volume types
  */
trait VolumeProjection extends StObject {
  
  /**
    * configMap information about the configMap data to project
    */
  var configMap: ConfigMapProjection
  
  /**
    * downwardAPI information about the downwardAPI data to project
    */
  var downwardAPI: DownwardAPIProjection
  
  /**
    * secret information about the secret data to project
    */
  var secret: SecretProjection
  
  /**
    * serviceAccountToken is information about the serviceAccountToken data to project
    */
  var serviceAccountToken: ServiceAccountTokenProjection
}
object VolumeProjection {
  
  inline def apply(
    configMap: ConfigMapProjection,
    downwardAPI: DownwardAPIProjection,
    secret: SecretProjection,
    serviceAccountToken: ServiceAccountTokenProjection
  ): VolumeProjection = {
    val __obj = js.Dynamic.literal(configMap = configMap.asInstanceOf[js.Any], downwardAPI = downwardAPI.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any], serviceAccountToken = serviceAccountToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[VolumeProjection]
  }
  
  extension [Self <: VolumeProjection](x: Self) {
    
    inline def setConfigMap(value: ConfigMapProjection): Self = StObject.set(x, "configMap", value.asInstanceOf[js.Any])
    
    inline def setDownwardAPI(value: DownwardAPIProjection): Self = StObject.set(x, "downwardAPI", value.asInstanceOf[js.Any])
    
    inline def setSecret(value: SecretProjection): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
    
    inline def setServiceAccountToken(value: ServiceAccountTokenProjection): Self = StObject.set(x, "serviceAccountToken", value.asInstanceOf[js.Any])
  }
}
