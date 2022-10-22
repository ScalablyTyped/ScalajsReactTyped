package typingsJapgolly.pulumiKubernetes.typesInputMod.core.v1

import typingsJapgolly.pulumiPulumi.outputMod.Input
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
  var configMap: js.UndefOr[Input[ConfigMapNodeConfigSourcePatch]] = js.undefined
}
object NodeConfigSourcePatch {
  
  inline def apply(): NodeConfigSourcePatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeConfigSourcePatch]
  }
  
  extension [Self <: NodeConfigSourcePatch](x: Self) {
    
    inline def setConfigMap(value: Input[ConfigMapNodeConfigSourcePatch]): Self = StObject.set(x, "configMap", value.asInstanceOf[js.Any])
    
    inline def setConfigMapUndefined: Self = StObject.set(x, "configMap", js.undefined)
  }
}
