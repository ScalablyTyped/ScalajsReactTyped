package typingsJapgolly.pulumiKubernetes.typesOutputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NodeConfigSource specifies a source of node configuration. Exactly one subfield (excluding metadata) must be non-nil. This API is deprecated since 1.22
  */
trait NodeConfigSourcePatch extends StObject {
  
  /**
    * ConfigMap is a reference to a Node's ConfigMap
    */
  var configMap: ConfigMapNodeConfigSourcePatch
}
object NodeConfigSourcePatch {
  
  inline def apply(configMap: ConfigMapNodeConfigSourcePatch): NodeConfigSourcePatch = {
    val __obj = js.Dynamic.literal(configMap = configMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeConfigSourcePatch]
  }
  
  extension [Self <: NodeConfigSourcePatch](x: Self) {
    
    inline def setConfigMap(value: ConfigMapNodeConfigSourcePatch): Self = StObject.set(x, "configMap", value.asInstanceOf[js.Any])
  }
}
