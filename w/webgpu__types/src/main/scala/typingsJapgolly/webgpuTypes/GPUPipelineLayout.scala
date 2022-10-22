package typingsJapgolly.webgpuTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUPipelineLayout
  extends StObject
     with GPUObjectBase {
  
  /**
    * Nominal type branding.
    * https://github.com/microsoft/TypeScript/pull/33038
    * @internal
    */
  val __brand: typingsJapgolly.webgpuTypes.webgpuTypesStrings.GPUPipelineLayout
}
object GPUPipelineLayout {
  
  inline def apply(label: String): GPUPipelineLayout = {
    val __obj = js.Dynamic.literal(__brand = "GPUPipelineLayout", label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPUPipelineLayout]
  }
  
  extension [Self <: GPUPipelineLayout](x: Self) {
    
    inline def set__brand(value: typingsJapgolly.webgpuTypes.webgpuTypesStrings.GPUPipelineLayout): Self = StObject.set(x, "__brand", value.asInstanceOf[js.Any])
  }
}
