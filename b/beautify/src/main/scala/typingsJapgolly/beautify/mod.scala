package typingsJapgolly.beautify

import typingsJapgolly.beautify.beautifyStrings.css
import typingsJapgolly.beautify.beautifyStrings.html
import typingsJapgolly.beautify.beautifyStrings.js_
import typingsJapgolly.beautify.beautifyStrings.json
import typingsJapgolly.beautify.beautifyStrings.xml
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(content: String, options: Options): String = (^.asInstanceOf[js.Dynamic].apply(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("beautify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    var format: css | json | js_ | html | xml
  }
  object Options {
    
    inline def apply(format: css | json | js_ | html | xml): Options = {
      val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setFormat(value: css | json | js_ | html | xml): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    }
  }
}
