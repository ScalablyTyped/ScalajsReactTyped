package typingsJapgolly.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaterialPluginPrepareUniformBuffer extends StObject {
  
  var ubo: UniformBuffer
}
object MaterialPluginPrepareUniformBuffer {
  
  inline def apply(ubo: UniformBuffer): MaterialPluginPrepareUniformBuffer = {
    val __obj = js.Dynamic.literal(ubo = ubo.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaterialPluginPrepareUniformBuffer]
  }
  
  extension [Self <: MaterialPluginPrepareUniformBuffer](x: Self) {
    
    inline def setUbo(value: UniformBuffer): Self = StObject.set(x, "ubo", value.asInstanceOf[js.Any])
  }
}
