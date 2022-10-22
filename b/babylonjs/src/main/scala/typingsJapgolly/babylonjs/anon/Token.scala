package typingsJapgolly.babylonjs.anon

import typingsJapgolly.babylonjs.GPURenderPipeline
import typingsJapgolly.babylonjs.enginesWebGPUWebgpuCacheRenderPipelineTreeMod.NodeState
import typingsJapgolly.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Token extends StObject {
  
  var pipeline: Nullable[GPURenderPipeline]
  
  var token: NodeState
}
object Token {
  
  inline def apply(token: NodeState): Token = {
    val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any], pipeline = null)
    __obj.asInstanceOf[Token]
  }
  
  extension [Self <: Token](x: Self) {
    
    inline def setPipeline(value: Nullable[GPURenderPipeline]): Self = StObject.set(x, "pipeline", value.asInstanceOf[js.Any])
    
    inline def setPipelineNull: Self = StObject.set(x, "pipeline", null)
    
    inline def setToken(value: NodeState): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
  }
}
