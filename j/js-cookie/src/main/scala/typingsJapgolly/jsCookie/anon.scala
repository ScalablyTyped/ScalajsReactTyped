package typingsJapgolly.jsCookie

import typingsJapgolly.jsCookie.mod.CookieReadConverter
import typingsJapgolly.jsCookie.mod.CookieWriteConverter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Required<js-cookie.js-cookie.Converter<string>> */
  trait RequiredConverterstring extends StObject {
    
    def read(value: String, name: String): String
    @JSName("read")
    var read_Original: CookieReadConverter[String]
    
    def write(value: String, name: String): String
    @JSName("write")
    var write_Original: CookieWriteConverter[String]
  }
  object RequiredConverterstring {
    
    inline def apply(
      read: (/* value */ String, /* name */ String) => String | String,
      write: (/* value */ String | String, /* name */ String) => String
    ): RequiredConverterstring = {
      val __obj = js.Dynamic.literal(read = js.Any.fromFunction2(read), write = js.Any.fromFunction2(write))
      __obj.asInstanceOf[RequiredConverterstring]
    }
    
    extension [Self <: RequiredConverterstring](x: Self) {
      
      inline def setRead(value: (/* value */ String, /* name */ String) => String | String): Self = StObject.set(x, "read", js.Any.fromFunction2(value))
      
      inline def setWrite(value: (/* value */ String | String, /* name */ String) => String): Self = StObject.set(x, "write", js.Any.fromFunction2(value))
    }
  }
}
