package typingsJapgolly.webgpuTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUBindGroupLayout
  extends StObject
     with GPUObjectBase {
  
  /**
    * Nominal type branding.
    * https://github.com/microsoft/TypeScript/pull/33038
    * @internal
    */
  val __brand: typingsJapgolly.webgpuTypes.webgpuTypesStrings.GPUBindGroupLayout
}
object GPUBindGroupLayout {
  
  inline def apply(label: String): GPUBindGroupLayout = {
    val __obj = js.Dynamic.literal(__brand = "GPUBindGroupLayout", label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPUBindGroupLayout]
  }
  
  extension [Self <: GPUBindGroupLayout](x: Self) {
    
    inline def set__brand(value: typingsJapgolly.webgpuTypes.webgpuTypesStrings.GPUBindGroupLayout): Self = StObject.set(x, "__brand", value.asInstanceOf[js.Any])
  }
}
