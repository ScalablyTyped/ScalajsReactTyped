package typingsJapgolly.pulumiKubernetes.typesOutputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * EnvFromSource represents the source of a set of ConfigMaps
  */
trait EnvFromSourcePatch extends StObject {
  
  /**
    * The ConfigMap to select from
    */
  var configMapRef: ConfigMapEnvSourcePatch
  
  /**
    * An optional identifier to prepend to each key in the ConfigMap. Must be a C_IDENTIFIER.
    */
  var prefix: String
  
  /**
    * The Secret to select from
    */
  var secretRef: SecretEnvSourcePatch
}
object EnvFromSourcePatch {
  
  inline def apply(configMapRef: ConfigMapEnvSourcePatch, prefix: String, secretRef: SecretEnvSourcePatch): EnvFromSourcePatch = {
    val __obj = js.Dynamic.literal(configMapRef = configMapRef.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], secretRef = secretRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvFromSourcePatch]
  }
  
  extension [Self <: EnvFromSourcePatch](x: Self) {
    
    inline def setConfigMapRef(value: ConfigMapEnvSourcePatch): Self = StObject.set(x, "configMapRef", value.asInstanceOf[js.Any])
    
    inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setSecretRef(value: SecretEnvSourcePatch): Self = StObject.set(x, "secretRef", value.asInstanceOf[js.Any])
  }
}
