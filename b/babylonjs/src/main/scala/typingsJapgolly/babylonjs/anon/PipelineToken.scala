package typingsJapgolly.babylonjs.anon

import typingsJapgolly.babylonjs.BABYLON.Nullable
import typingsJapgolly.babylonjs.GPURenderPipeline
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PipelineToken extends StObject {
  
  var pipeline: Nullable[GPURenderPipeline]
  
  var token: Any
}
object PipelineToken {
  
  inline def apply(token: Any): PipelineToken = {
    val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any], pipeline = null)
    __obj.asInstanceOf[PipelineToken]
  }
  
  extension [Self <: PipelineToken](x: Self) {
    
    inline def setPipeline(value: Nullable[GPURenderPipeline]): Self = StObject.set(x, "pipeline", value.asInstanceOf[js.Any])
    
    inline def setPipelineNull: Self = StObject.set(x, "pipeline", null)
    
    inline def setToken(value: Any): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
  }
}
