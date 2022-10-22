package typingsJapgolly.webgpuTypes

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUShaderModule
  extends StObject
     with GPUObjectBase {
  
  /**
    * Nominal type branding.
    * https://github.com/microsoft/TypeScript/pull/33038
    * @internal
    */
  val __brand: typingsJapgolly.webgpuTypes.webgpuTypesStrings.GPUShaderModule
  
  /**
    * Returns any messages generated during the {@link GPUShaderModule}'s compilation.
    * The locations, order, and contents of messages are implementation-defined.
    * In particular, messages may not be ordered by {@link GPUCompilationMessage#lineNum}.
    */
  def compilationInfo(): js.Promise[GPUCompilationInfo]
}
object GPUShaderModule {
  
  inline def apply(compilationInfo: CallbackTo[js.Promise[GPUCompilationInfo]], label: String): GPUShaderModule = {
    val __obj = js.Dynamic.literal(__brand = "GPUShaderModule", compilationInfo = compilationInfo.toJsFn, label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPUShaderModule]
  }
  
  extension [Self <: GPUShaderModule](x: Self) {
    
    inline def setCompilationInfo(value: CallbackTo[js.Promise[GPUCompilationInfo]]): Self = StObject.set(x, "compilationInfo", value.toJsFn)
    
    inline def set__brand(value: typingsJapgolly.webgpuTypes.webgpuTypesStrings.GPUShaderModule): Self = StObject.set(x, "__brand", value.asInstanceOf[js.Any])
  }
}
