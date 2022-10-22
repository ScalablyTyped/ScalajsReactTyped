package typingsJapgolly.randomstring

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Randomstring {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.randomstring.randomstringStrings.lowercase
    - typingsJapgolly.randomstring.randomstringStrings.uppercase
  */
  trait Capitalization extends StObject
  object Capitalization {
    
    inline def lowercase: typingsJapgolly.randomstring.randomstringStrings.lowercase = "lowercase".asInstanceOf[typingsJapgolly.randomstring.randomstringStrings.lowercase]
    
    inline def uppercase: typingsJapgolly.randomstring.randomstringStrings.uppercase = "uppercase".asInstanceOf[typingsJapgolly.randomstring.randomstringStrings.uppercase]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.randomstring.randomstringStrings.alphanumeric
    - typingsJapgolly.randomstring.randomstringStrings.alphabetic
    - typingsJapgolly.randomstring.randomstringStrings.numeric
    - typingsJapgolly.randomstring.randomstringStrings.hex
    - typingsJapgolly.randomstring.randomstringStrings.binary
    - typingsJapgolly.randomstring.randomstringStrings.octal
    - java.lang.String
  */
  type Charset = _Charset | String
  
  trait GenerateOptions extends StObject {
    
    var capitalization: js.UndefOr[Capitalization] = js.undefined
    
    var charset: js.UndefOr[Charset] = js.undefined
    
    var length: js.UndefOr[Double] = js.undefined
    
    var readable: js.UndefOr[Boolean] = js.undefined
  }
  object GenerateOptions {
    
    inline def apply(): GenerateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GenerateOptions]
    }
    
    extension [Self <: GenerateOptions](x: Self) {
      
      inline def setCapitalization(value: Capitalization): Self = StObject.set(x, "capitalization", value.asInstanceOf[js.Any])
      
      inline def setCapitalizationUndefined: Self = StObject.set(x, "capitalization", js.undefined)
      
      inline def setCharset(value: Charset): Self = StObject.set(x, "charset", value.asInstanceOf[js.Any])
      
      inline def setCharsetUndefined: Self = StObject.set(x, "charset", js.undefined)
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      inline def setReadable(value: Boolean): Self = StObject.set(x, "readable", value.asInstanceOf[js.Any])
      
      inline def setReadableUndefined: Self = StObject.set(x, "readable", js.undefined)
    }
  }
  
  trait _Charset extends StObject
}
