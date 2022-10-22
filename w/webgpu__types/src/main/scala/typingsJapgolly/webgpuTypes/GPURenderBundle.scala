package typingsJapgolly.webgpuTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPURenderBundle
  extends StObject
     with GPUObjectBase {
  
  /**
    * Nominal type branding.
    * https://github.com/microsoft/TypeScript/pull/33038
    * @internal
    */
  val __brand: typingsJapgolly.webgpuTypes.webgpuTypesStrings.GPURenderBundle
}
object GPURenderBundle {
  
  inline def apply(label: String): GPURenderBundle = {
    val __obj = js.Dynamic.literal(__brand = "GPURenderBundle", label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPURenderBundle]
  }
  
  extension [Self <: GPURenderBundle](x: Self) {
    
    inline def set__brand(value: typingsJapgolly.webgpuTypes.webgpuTypesStrings.GPURenderBundle): Self = StObject.set(x, "__brand", value.asInstanceOf[js.Any])
  }
}
