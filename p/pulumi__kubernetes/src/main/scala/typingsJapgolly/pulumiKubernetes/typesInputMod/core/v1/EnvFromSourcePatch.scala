package typingsJapgolly.pulumiKubernetes.typesInputMod.core.v1

import typingsJapgolly.pulumiPulumi.outputMod.Input
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
  var configMapRef: js.UndefOr[Input[ConfigMapEnvSourcePatch]] = js.undefined
  
  /**
    * An optional identifier to prepend to each key in the ConfigMap. Must be a C_IDENTIFIER.
    */
  var prefix: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The Secret to select from
    */
  var secretRef: js.UndefOr[Input[SecretEnvSourcePatch]] = js.undefined
}
object EnvFromSourcePatch {
  
  inline def apply(): EnvFromSourcePatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvFromSourcePatch]
  }
  
  extension [Self <: EnvFromSourcePatch](x: Self) {
    
    inline def setConfigMapRef(value: Input[ConfigMapEnvSourcePatch]): Self = StObject.set(x, "configMapRef", value.asInstanceOf[js.Any])
    
    inline def setConfigMapRefUndefined: Self = StObject.set(x, "configMapRef", js.undefined)
    
    inline def setPrefix(value: Input[String]): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    inline def setSecretRef(value: Input[SecretEnvSourcePatch]): Self = StObject.set(x, "secretRef", value.asInstanceOf[js.Any])
    
    inline def setSecretRefUndefined: Self = StObject.set(x, "secretRef", js.undefined)
  }
}
