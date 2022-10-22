package typingsJapgolly.pulumiKubernetes.typesOutputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Selects a key from a ConfigMap.
  */
trait ConfigMapKeySelectorPatch extends StObject {
  
  /**
    * The key to select.
    */
  var key: String
  
  /**
    * Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
    */
  var name: String
  
  /**
    * Specify whether the ConfigMap or its key must be defined
    */
  var optional: Boolean
}
object ConfigMapKeySelectorPatch {
  
  inline def apply(key: String, name: String, optional: Boolean): ConfigMapKeySelectorPatch = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigMapKeySelectorPatch]
  }
  
  extension [Self <: ConfigMapKeySelectorPatch](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
  }
}
