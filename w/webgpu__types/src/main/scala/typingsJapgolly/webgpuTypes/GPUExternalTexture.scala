package typingsJapgolly.webgpuTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUExternalTexture
  extends StObject
     with GPUObjectBase
     with GPUBindingResource {
  
  /**
    * Nominal type branding.
    * https://github.com/microsoft/TypeScript/pull/33038
    * @internal
    */
  val __brand: typingsJapgolly.webgpuTypes.webgpuTypesStrings.GPUExternalTexture
  
  /**
    * Returns the value of {@link GPUExternalTexture#[[destroyed]]}, which indicates
    * whether the texture has [$expire stale external textures|expired$] or not.
    */
  val expired: Boolean
}
object GPUExternalTexture {
  
  inline def apply(expired: Boolean, label: String): GPUExternalTexture = {
    val __obj = js.Dynamic.literal(__brand = "GPUExternalTexture", expired = expired.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPUExternalTexture]
  }
  
  extension [Self <: GPUExternalTexture](x: Self) {
    
    inline def setExpired(value: Boolean): Self = StObject.set(x, "expired", value.asInstanceOf[js.Any])
    
    inline def set__brand(value: typingsJapgolly.webgpuTypes.webgpuTypesStrings.GPUExternalTexture): Self = StObject.set(x, "__brand", value.asInstanceOf[js.Any])
  }
}
