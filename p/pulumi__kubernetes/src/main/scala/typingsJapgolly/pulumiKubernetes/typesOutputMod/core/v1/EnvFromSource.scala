package typingsJapgolly.pulumiKubernetes.typesOutputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * EnvFromSource represents the source of a set of ConfigMaps
  */
trait EnvFromSource extends StObject {
  
  /**
    * The ConfigMap to select from
    */
  var configMapRef: ConfigMapEnvSource
  
  /**
    * An optional identifier to prepend to each key in the ConfigMap. Must be a C_IDENTIFIER.
    */
  var prefix: String
  
  /**
    * The Secret to select from
    */
  var secretRef: SecretEnvSource
}
object EnvFromSource {
  
  inline def apply(configMapRef: ConfigMapEnvSource, prefix: String, secretRef: SecretEnvSource): EnvFromSource = {
    val __obj = js.Dynamic.literal(configMapRef = configMapRef.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], secretRef = secretRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvFromSource]
  }
  
  extension [Self <: EnvFromSource](x: Self) {
    
    inline def setConfigMapRef(value: ConfigMapEnvSource): Self = StObject.set(x, "configMapRef", value.asInstanceOf[js.Any])
    
    inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setSecretRef(value: SecretEnvSource): Self = StObject.set(x, "secretRef", value.asInstanceOf[js.Any])
  }
}
