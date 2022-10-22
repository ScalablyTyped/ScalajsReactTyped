package typingsJapgolly.emscripten

import typingsJapgolly.emscripten.anon.Kind
import typingsJapgolly.emscripten.anon.Module
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Emscripten {
  
  trait CCallOpts extends StObject {
    
    var async: js.UndefOr[Boolean] = js.undefined
  }
  object CCallOpts {
    
    inline def apply(): CCallOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CCallOpts]
    }
    
    extension [Self <: CCallOpts](x: Self) {
      
      inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.emscripten.emscriptenStrings.float
    - typingsJapgolly.emscripten.emscriptenStrings.double
  */
  trait CFloatType extends StObject
  object CFloatType {
    
    inline def double: typingsJapgolly.emscripten.emscriptenStrings.double = "double".asInstanceOf[typingsJapgolly.emscripten.emscriptenStrings.double]
    
    inline def float: typingsJapgolly.emscripten.emscriptenStrings.float = "float".asInstanceOf[typingsJapgolly.emscripten.emscriptenStrings.float]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.emscripten.emscriptenStrings.i8
    - typingsJapgolly.emscripten.emscriptenStrings.i16
    - typingsJapgolly.emscripten.emscriptenStrings.i32
    - typingsJapgolly.emscripten.emscriptenStrings.i64
  */
  trait CIntType extends StObject
  object CIntType {
    
    inline def i16: typingsJapgolly.emscripten.emscriptenStrings.i16 = "i16".asInstanceOf[typingsJapgolly.emscripten.emscriptenStrings.i16]
    
    inline def i32: typingsJapgolly.emscripten.emscriptenStrings.i32 = "i32".asInstanceOf[typingsJapgolly.emscripten.emscriptenStrings.i32]
    
    inline def i64: typingsJapgolly.emscripten.emscriptenStrings.i64 = "i64".asInstanceOf[typingsJapgolly.emscripten.emscriptenStrings.i64]
    
    inline def i8: typingsJapgolly.emscripten.emscriptenStrings.i8 = "i8".asInstanceOf[typingsJapgolly.emscripten.emscriptenStrings.i8]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.emscripten.emscriptenStrings.i8Asterisk
    - typingsJapgolly.emscripten.emscriptenStrings.i16Asterisk
    - typingsJapgolly.emscripten.emscriptenStrings.i32Asterisk
    - typingsJapgolly.emscripten.emscriptenStrings.i64Asterisk
    - typingsJapgolly.emscripten.emscriptenStrings.floatAsterisk
    - typingsJapgolly.emscripten.emscriptenStrings.doubleAsterisk
    - typingsJapgolly.emscripten.emscriptenStrings.Asterisk
  */
  trait CPointerType extends StObject
  object CPointerType {
    
    inline def Asterisk: typingsJapgolly.emscripten.emscriptenStrings.Asterisk = "*".asInstanceOf[typingsJapgolly.emscripten.emscriptenStrings.Asterisk]
    
    inline def doubleAsterisk: typingsJapgolly.emscripten.emscriptenStrings.doubleAsterisk = "double*".asInstanceOf[typingsJapgolly.emscripten.emscriptenStrings.doubleAsterisk]
    
    inline def floatAsterisk: typingsJapgolly.emscripten.emscriptenStrings.floatAsterisk = "float*".asInstanceOf[typingsJapgolly.emscripten.emscriptenStrings.floatAsterisk]
    
    inline def i16Asterisk: typingsJapgolly.emscripten.emscriptenStrings.i16Asterisk = "i16*".asInstanceOf[typingsJapgolly.emscripten.emscriptenStrings.i16Asterisk]
    
    inline def i32Asterisk: typingsJapgolly.emscripten.emscriptenStrings.i32Asterisk = "i32*".asInstanceOf[typingsJapgolly.emscripten.emscriptenStrings.i32Asterisk]
    
    inline def i64Asterisk: typingsJapgolly.emscripten.emscriptenStrings.i64Asterisk = "i64*".asInstanceOf[typingsJapgolly.emscripten.emscriptenStrings.i64Asterisk]
    
    inline def i8Asterisk: typingsJapgolly.emscripten.emscriptenStrings.i8Asterisk = "i8*".asInstanceOf[typingsJapgolly.emscripten.emscriptenStrings.i8Asterisk]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.emscripten.emscriptenStrings.i8
    - typingsJapgolly.emscripten.emscriptenStrings.i16
    - typingsJapgolly.emscripten.emscriptenStrings.i32
    - typingsJapgolly.emscripten.emscriptenStrings.i64
    - typingsJapgolly.emscripten.emscriptenStrings.float
    - typingsJapgolly.emscripten.emscriptenStrings.double
    - typingsJapgolly.emscripten.emscriptenStrings.i8Asterisk
    - typingsJapgolly.emscripten.emscriptenStrings.i16Asterisk
    - typingsJapgolly.emscripten.emscriptenStrings.i32Asterisk
    - typingsJapgolly.emscripten.emscriptenStrings.i64Asterisk
    - typingsJapgolly.emscripten.emscriptenStrings.floatAsterisk
    - typingsJapgolly.emscripten.emscriptenStrings.doubleAsterisk
    - typingsJapgolly.emscripten.emscriptenStrings.Asterisk
  */
  trait CType extends StObject
  object CType {
    
    inline def Asterisk: typingsJapgolly.emscripten.emscriptenStrings.Asterisk = "*".asInstanceOf[typingsJapgolly.emscripten.emscriptenStrings.Asterisk]
    
    inline def double: typingsJapgolly.emscripten.emscriptenStrings.double = "double".asInstanceOf[typingsJapgolly.emscripten.emscriptenStrings.double]
    
    inline def doubleAsterisk: typingsJapgolly.emscripten.emscriptenStrings.doubleAsterisk = "double*".asInstanceOf[typingsJapgolly.emscripten.emscriptenStrings.doubleAsterisk]
    
    inline def float: typingsJapgolly.emscripten.emscriptenStrings.float = "float".asInstanceOf[typingsJapgolly.emscripten.emscriptenStrings.float]
    
    inline def floatAsterisk: typingsJapgolly.emscripten.emscriptenStrings.floatAsterisk = "float*".asInstanceOf[typingsJapgolly.emscripten.emscriptenStrings.floatAsterisk]
    
    inline def i16: typingsJapgolly.emscripten.emscriptenStrings.i16 = "i16".asInstanceOf[typingsJapgolly.emscripten.emscriptenStrings.i16]
    
    inline def i16Asterisk: typingsJapgolly.emscripten.emscriptenStrings.i16Asterisk = "i16*".asInstanceOf[typingsJapgolly.emscripten.emscriptenStrings.i16Asterisk]
    
    inline def i32: typingsJapgolly.emscripten.emscriptenStrings.i32 = "i32".asInstanceOf[typingsJapgolly.emscripten.emscriptenStrings.i32]
    
    inline def i32Asterisk: typingsJapgolly.emscripten.emscriptenStrings.i32Asterisk = "i32*".asInstanceOf[typingsJapgolly.emscripten.emscriptenStrings.i32Asterisk]
    
    inline def i64: typingsJapgolly.emscripten.emscriptenStrings.i64 = "i64".asInstanceOf[typingsJapgolly.emscripten.emscriptenStrings.i64]
    
    inline def i64Asterisk: typingsJapgolly.emscripten.emscriptenStrings.i64Asterisk = "i64*".asInstanceOf[typingsJapgolly.emscripten.emscriptenStrings.i64Asterisk]
    
    inline def i8: typingsJapgolly.emscripten.emscriptenStrings.i8 = "i8".asInstanceOf[typingsJapgolly.emscripten.emscriptenStrings.i8]
    
    inline def i8Asterisk: typingsJapgolly.emscripten.emscriptenStrings.i8Asterisk = "i8*".asInstanceOf[typingsJapgolly.emscripten.emscriptenStrings.i8Asterisk]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.emscripten.emscriptenStrings.WEB
    - typingsJapgolly.emscripten.emscriptenStrings.NODE
    - typingsJapgolly.emscripten.emscriptenStrings.SHELL
    - typingsJapgolly.emscripten.emscriptenStrings.WORKER
  */
  trait EnvironmentType extends StObject
  object EnvironmentType {
    
    inline def NODE: typingsJapgolly.emscripten.emscriptenStrings.NODE = "NODE".asInstanceOf[typingsJapgolly.emscripten.emscriptenStrings.NODE]
    
    inline def SHELL: typingsJapgolly.emscripten.emscriptenStrings.SHELL = "SHELL".asInstanceOf[typingsJapgolly.emscripten.emscriptenStrings.SHELL]
    
    inline def WEB: typingsJapgolly.emscripten.emscriptenStrings.WEB = "WEB".asInstanceOf[typingsJapgolly.emscripten.emscriptenStrings.WEB]
    
    inline def WORKER: typingsJapgolly.emscripten.emscriptenStrings.WORKER = "WORKER".asInstanceOf[typingsJapgolly.emscripten.emscriptenStrings.WORKER]
  }
  
  trait FileSystemType extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.emscripten.emscriptenStrings.number
    - typingsJapgolly.emscripten.emscriptenStrings.string
    - typingsJapgolly.emscripten.emscriptenStrings.array
    - typingsJapgolly.emscripten.emscriptenStrings.boolean
  */
  trait JSType extends StObject
  object JSType {
    
    inline def array: typingsJapgolly.emscripten.emscriptenStrings.array = "array".asInstanceOf[typingsJapgolly.emscripten.emscriptenStrings.array]
    
    inline def boolean: typingsJapgolly.emscripten.emscriptenStrings.boolean = "boolean".asInstanceOf[typingsJapgolly.emscripten.emscriptenStrings.boolean]
    
    inline def number: typingsJapgolly.emscripten.emscriptenStrings.number = "number".asInstanceOf[typingsJapgolly.emscripten.emscriptenStrings.number]
    
    inline def string: typingsJapgolly.emscripten.emscriptenStrings.string = "string".asInstanceOf[typingsJapgolly.emscripten.emscriptenStrings.string]
  }
  
  type TypeCompatibleWithC = Double | String | js.Array[Any] | Boolean
  
  type WebAssemblyExports = js.Array[Module]
  
  type WebAssemblyImports = js.Array[Kind]
}
