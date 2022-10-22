package typingsJapgolly.babylonjs

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUShaderModule
  extends StObject
     with GPUObjectBase {
  
  def compilationInfo(): js.Promise[GPUCompilationInfo]
}
object GPUShaderModule {
  
  inline def apply(compilationInfo: CallbackTo[js.Promise[GPUCompilationInfo]]): GPUShaderModule = {
    val __obj = js.Dynamic.literal(compilationInfo = compilationInfo.toJsFn)
    __obj.asInstanceOf[GPUShaderModule]
  }
  
  extension [Self <: GPUShaderModule](x: Self) {
    
    inline def setCompilationInfo(value: CallbackTo[js.Promise[GPUCompilationInfo]]): Self = StObject.set(x, "compilationInfo", value.toJsFn)
  }
}
