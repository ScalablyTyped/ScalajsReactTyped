package typingsJapgolly.babylonjs.anon

import typingsJapgolly.babylonjs.GPURenderPipeline
import typingsJapgolly.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pipeline extends StObject {
  
  var pipeline: Nullable[GPURenderPipeline]
  
  var token: Any
}
object Pipeline {
  
  inline def apply(token: Any): Pipeline = {
    val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any], pipeline = null)
    __obj.asInstanceOf[Pipeline]
  }
  
  extension [Self <: Pipeline](x: Self) {
    
    inline def setPipeline(value: Nullable[GPURenderPipeline]): Self = StObject.set(x, "pipeline", value.asInstanceOf[js.Any])
    
    inline def setPipelineNull: Self = StObject.set(x, "pipeline", null)
    
    inline def setToken(value: Any): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
  }
}
