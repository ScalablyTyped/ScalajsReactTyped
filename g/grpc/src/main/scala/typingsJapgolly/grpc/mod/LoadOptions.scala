package typingsJapgolly.grpc.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoadOptions extends StObject {
  
  /**
    * Deserialize bytes values as base64 strings instead of Buffers.
    * Defaults to `false`.
    */
  var binaryAsBase64: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Load this file with field names in camel case instead of their original case.
    * Defaults to `false`.
    */
  var convertFieldsToCamelCase: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Use the beta method argument order for client methods, with optional
    * arguments after the callback. This option is only a temporary stopgap
    * measure to smooth an API breakage. It is deprecated, and new code
    * should not use it.
    * Defaults to `false`
    */
  var deprecatedArgumentOrder: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Deserialize long values as strings instead of objects.
    * Defaults to `true`.
    */
  var longsAsStrings: js.UndefOr[Boolean] = js.undefined
}
object LoadOptions {
  
  inline def apply(): LoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadOptions]
  }
  
  extension [Self <: LoadOptions](x: Self) {
    
    inline def setBinaryAsBase64(value: Boolean): Self = StObject.set(x, "binaryAsBase64", value.asInstanceOf[js.Any])
    
    inline def setBinaryAsBase64Undefined: Self = StObject.set(x, "binaryAsBase64", js.undefined)
    
    inline def setConvertFieldsToCamelCase(value: Boolean): Self = StObject.set(x, "convertFieldsToCamelCase", value.asInstanceOf[js.Any])
    
    inline def setConvertFieldsToCamelCaseUndefined: Self = StObject.set(x, "convertFieldsToCamelCase", js.undefined)
    
    inline def setDeprecatedArgumentOrder(value: Boolean): Self = StObject.set(x, "deprecatedArgumentOrder", value.asInstanceOf[js.Any])
    
    inline def setDeprecatedArgumentOrderUndefined: Self = StObject.set(x, "deprecatedArgumentOrder", js.undefined)
    
    inline def setLongsAsStrings(value: Boolean): Self = StObject.set(x, "longsAsStrings", value.asInstanceOf[js.Any])
    
    inline def setLongsAsStringsUndefined: Self = StObject.set(x, "longsAsStrings", js.undefined)
  }
}
