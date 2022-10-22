package typingsJapgolly.cssesc

import typingsJapgolly.cssesc.anon.ReadonlyPartialOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(string: String): String = ^.asInstanceOf[js.Dynamic].apply(string.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(string: String, options: ReadonlyPartialOptions): String = (^.asInstanceOf[js.Dynamic].apply(string.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("cssesc", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("cssesc", "options")
  @js.native
  val options: Options_ = js.native
  
  @JSImport("cssesc", "version")
  @js.native
  val version: String = js.native
  
  trait Options_ extends StObject {
    
    var escapeEverything: Boolean
    
    var isIdentifier: Boolean
    
    var quotes: String
    
    var wrap: Boolean
  }
  object Options_ {
    
    inline def apply(escapeEverything: Boolean, isIdentifier: Boolean, quotes: String, wrap: Boolean): Options_ = {
      val __obj = js.Dynamic.literal(escapeEverything = escapeEverything.asInstanceOf[js.Any], isIdentifier = isIdentifier.asInstanceOf[js.Any], quotes = quotes.asInstanceOf[js.Any], wrap = wrap.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options_]
    }
    
    extension [Self <: Options_](x: Self) {
      
      inline def setEscapeEverything(value: Boolean): Self = StObject.set(x, "escapeEverything", value.asInstanceOf[js.Any])
      
      inline def setIsIdentifier(value: Boolean): Self = StObject.set(x, "isIdentifier", value.asInstanceOf[js.Any])
      
      inline def setQuotes(value: String): Self = StObject.set(x, "quotes", value.asInstanceOf[js.Any])
      
      inline def setWrap(value: Boolean): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
    }
  }
}
