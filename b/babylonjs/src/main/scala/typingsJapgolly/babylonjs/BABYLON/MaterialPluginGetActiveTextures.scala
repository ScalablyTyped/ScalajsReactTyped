package typingsJapgolly.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaterialPluginGetActiveTextures extends StObject {
  
  var activeTextures: js.Array[BaseTexture]
}
object MaterialPluginGetActiveTextures {
  
  inline def apply(activeTextures: js.Array[BaseTexture]): MaterialPluginGetActiveTextures = {
    val __obj = js.Dynamic.literal(activeTextures = activeTextures.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaterialPluginGetActiveTextures]
  }
  
  extension [Self <: MaterialPluginGetActiveTextures](x: Self) {
    
    inline def setActiveTextures(value: js.Array[BaseTexture]): Self = StObject.set(x, "activeTextures", value.asInstanceOf[js.Any])
    
    inline def setActiveTexturesVarargs(value: BaseTexture*): Self = StObject.set(x, "activeTextures", js.Array(value*))
  }
}
