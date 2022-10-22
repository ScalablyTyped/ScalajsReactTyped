package typingsJapgolly.pulumiKubernetes.typesOutputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ConfigMapEnvSource selects a ConfigMap to populate the environment variables with.
  *
  * The contents of the target ConfigMap's Data field will represent the key-value pairs as environment variables.
  */
trait ConfigMapEnvSourcePatch extends StObject {
  
  /**
    * Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
    */
  var name: String
  
  /**
    * Specify whether the ConfigMap must be defined
    */
  var optional: Boolean
}
object ConfigMapEnvSourcePatch {
  
  inline def apply(name: String, optional: Boolean): ConfigMapEnvSourcePatch = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigMapEnvSourcePatch]
  }
  
  extension [Self <: ConfigMapEnvSourcePatch](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
  }
}
