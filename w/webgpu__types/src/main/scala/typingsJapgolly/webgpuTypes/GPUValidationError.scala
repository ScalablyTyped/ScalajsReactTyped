package typingsJapgolly.webgpuTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUValidationError
  extends StObject
     with GPUError {
  
  /**
    * Nominal type branding.
    * https://github.com/microsoft/TypeScript/pull/33038
    * @internal
    */
  val __brand: typingsJapgolly.webgpuTypes.webgpuTypesStrings.GPUValidationError
}
object GPUValidationError {
  
  inline def apply(message: String): GPUValidationError = {
    val __obj = js.Dynamic.literal(__brand = "GPUValidationError", message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPUValidationError]
  }
  
  extension [Self <: GPUValidationError](x: Self) {
    
    inline def set__brand(value: typingsJapgolly.webgpuTypes.webgpuTypesStrings.GPUValidationError): Self = StObject.set(x, "__brand", value.asInstanceOf[js.Any])
  }
}
