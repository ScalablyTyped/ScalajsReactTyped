package typingsJapgolly.webgpuTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUTextureUsage extends StObject {
  
  val COPY_DST: GPUFlagsConstant
  
  val COPY_SRC: GPUFlagsConstant
  
  val RENDER_ATTACHMENT: GPUFlagsConstant
  
  val STORAGE_BINDING: GPUFlagsConstant
  
  val TEXTURE_BINDING: GPUFlagsConstant
  
  /**
    * Nominal type branding.
    * https://github.com/microsoft/TypeScript/pull/33038
    * @internal
    */
  val __brand: typingsJapgolly.webgpuTypes.webgpuTypesStrings.GPUTextureUsage
}
object GPUTextureUsage {
  
  inline def apply(
    COPY_DST: GPUFlagsConstant,
    COPY_SRC: GPUFlagsConstant,
    RENDER_ATTACHMENT: GPUFlagsConstant,
    STORAGE_BINDING: GPUFlagsConstant,
    TEXTURE_BINDING: GPUFlagsConstant
  ): GPUTextureUsage = {
    val __obj = js.Dynamic.literal(COPY_DST = COPY_DST.asInstanceOf[js.Any], COPY_SRC = COPY_SRC.asInstanceOf[js.Any], RENDER_ATTACHMENT = RENDER_ATTACHMENT.asInstanceOf[js.Any], STORAGE_BINDING = STORAGE_BINDING.asInstanceOf[js.Any], TEXTURE_BINDING = TEXTURE_BINDING.asInstanceOf[js.Any], __brand = "GPUTextureUsage")
    __obj.asInstanceOf[GPUTextureUsage]
  }
  
  extension [Self <: GPUTextureUsage](x: Self) {
    
    inline def setCOPY_DST(value: GPUFlagsConstant): Self = StObject.set(x, "COPY_DST", value.asInstanceOf[js.Any])
    
    inline def setCOPY_SRC(value: GPUFlagsConstant): Self = StObject.set(x, "COPY_SRC", value.asInstanceOf[js.Any])
    
    inline def setRENDER_ATTACHMENT(value: GPUFlagsConstant): Self = StObject.set(x, "RENDER_ATTACHMENT", value.asInstanceOf[js.Any])
    
    inline def setSTORAGE_BINDING(value: GPUFlagsConstant): Self = StObject.set(x, "STORAGE_BINDING", value.asInstanceOf[js.Any])
    
    inline def setTEXTURE_BINDING(value: GPUFlagsConstant): Self = StObject.set(x, "TEXTURE_BINDING", value.asInstanceOf[js.Any])
    
    inline def set__brand(value: typingsJapgolly.webgpuTypes.webgpuTypesStrings.GPUTextureUsage): Self = StObject.set(x, "__brand", value.asInstanceOf[js.Any])
  }
}
