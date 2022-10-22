package typingsJapgolly.babylonjs.materialsMaterialPluginEventMod

import typingsJapgolly.babylonjs.materialsTexturesRenderTargetTextureMod.RenderTargetTexture
import typingsJapgolly.babylonjs.miscSmartArrayMod.SmartArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaterialPluginFillRenderTargetTextures extends StObject {
  
  var renderTargets: SmartArray[RenderTargetTexture]
}
object MaterialPluginFillRenderTargetTextures {
  
  inline def apply(renderTargets: SmartArray[RenderTargetTexture]): MaterialPluginFillRenderTargetTextures = {
    val __obj = js.Dynamic.literal(renderTargets = renderTargets.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaterialPluginFillRenderTargetTextures]
  }
  
  extension [Self <: MaterialPluginFillRenderTargetTextures](x: Self) {
    
    inline def setRenderTargets(value: SmartArray[RenderTargetTexture]): Self = StObject.set(x, "renderTargets", value.asInstanceOf[js.Any])
  }
}
