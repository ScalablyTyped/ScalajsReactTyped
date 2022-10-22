package typingsJapgolly.radix64

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("radix64", JSImport.Namespace)
  @js.native
  val ^ : Radix = js.native
  
  trait MethodsEnum extends StObject {
    
    var BASE64: MethodsString
    
    var BASE64ASCII: MethodsString
    
    var BASE64NATURAL: MethodsString
    
    var BASE64URL: MethodsString
    
    var DEFAULT: MethodsString
  }
  object MethodsEnum {
    
    inline def apply(
      BASE64: MethodsString,
      BASE64ASCII: MethodsString,
      BASE64NATURAL: MethodsString,
      BASE64URL: MethodsString,
      DEFAULT: MethodsString
    ): MethodsEnum = {
      val __obj = js.Dynamic.literal(BASE64 = BASE64.asInstanceOf[js.Any], BASE64ASCII = BASE64ASCII.asInstanceOf[js.Any], BASE64NATURAL = BASE64NATURAL.asInstanceOf[js.Any], BASE64URL = BASE64URL.asInstanceOf[js.Any], DEFAULT = DEFAULT.asInstanceOf[js.Any])
      __obj.asInstanceOf[MethodsEnum]
    }
    
    extension [Self <: MethodsEnum](x: Self) {
      
      inline def setBASE64(value: MethodsString): Self = StObject.set(x, "BASE64", value.asInstanceOf[js.Any])
      
      inline def setBASE64ASCII(value: MethodsString): Self = StObject.set(x, "BASE64ASCII", value.asInstanceOf[js.Any])
      
      inline def setBASE64NATURAL(value: MethodsString): Self = StObject.set(x, "BASE64NATURAL", value.asInstanceOf[js.Any])
      
      inline def setBASE64URL(value: MethodsString): Self = StObject.set(x, "BASE64URL", value.asInstanceOf[js.Any])
      
      inline def setDEFAULT(value: MethodsString): Self = StObject.set(x, "DEFAULT", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.radix64.radix64Strings.base64
    - typingsJapgolly.radix64.radix64Strings.base64URL
    - typingsJapgolly.radix64.radix64Strings.base64URLNaturalSort
    - typingsJapgolly.radix64.radix64Strings.base64URLASCIISort
  */
  trait MethodsString extends StObject
  object MethodsString {
    
    inline def base64: typingsJapgolly.radix64.radix64Strings.base64 = "base64".asInstanceOf[typingsJapgolly.radix64.radix64Strings.base64]
    
    inline def base64URL: typingsJapgolly.radix64.radix64Strings.base64URL = "base64URL".asInstanceOf[typingsJapgolly.radix64.radix64Strings.base64URL]
    
    inline def base64URLASCIISort: typingsJapgolly.radix64.radix64Strings.base64URLASCIISort = "base64URLASCIISort".asInstanceOf[typingsJapgolly.radix64.radix64Strings.base64URLASCIISort]
    
    inline def base64URLNaturalSort: typingsJapgolly.radix64.radix64Strings.base64URLNaturalSort = "base64URLNaturalSort".asInstanceOf[typingsJapgolly.radix64.radix64Strings.base64URLNaturalSort]
  }
  
  @js.native
  trait Radix extends StObject {
    
    def ascii64(number: Double): String = js.native
    def ascii64(number: Double, pad: Double): String = js.native
    
    var methods: MethodsEnum = js.native
    
    def radix64(number: Double): String = js.native
    def radix64(number: Double, method: MethodsString): String = js.native
  }
  
  type _To = Radix
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Radix = ^
}
