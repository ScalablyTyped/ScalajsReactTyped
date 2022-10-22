package typingsJapgolly.webgpuTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUComputePipeline
  extends StObject
     with GPUObjectBase
     with GPUPipelineBase {
  
  /**
    * Nominal type branding.
    * https://github.com/microsoft/TypeScript/pull/33038
    * @internal
    */
  val __brand: typingsJapgolly.webgpuTypes.webgpuTypesStrings.GPUComputePipeline
}
object GPUComputePipeline {
  
  inline def apply(getBindGroupLayout: Double => GPUBindGroupLayout, label: String): GPUComputePipeline = {
    val __obj = js.Dynamic.literal(__brand = "GPUComputePipeline", getBindGroupLayout = js.Any.fromFunction1(getBindGroupLayout), label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPUComputePipeline]
  }
  
  extension [Self <: GPUComputePipeline](x: Self) {
    
    inline def set__brand(value: typingsJapgolly.webgpuTypes.webgpuTypesStrings.GPUComputePipeline): Self = StObject.set(x, "__brand", value.asInstanceOf[js.Any])
  }
}
