package typingsJapgolly.containsPath

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(filepath: String, substr: String): Boolean = (^.asInstanceOf[js.Dynamic].apply(filepath.asInstanceOf[js.Any], substr.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(filepath: String, substr: String, options: Options): Boolean = (^.asInstanceOf[js.Dynamic].apply(filepath.asInstanceOf[js.Any], substr.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("contains-path", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    var nocase: js.UndefOr[Boolean] = js.undefined
    
    var partialMatch: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setNocase(value: Boolean): Self = StObject.set(x, "nocase", value.asInstanceOf[js.Any])
      
      inline def setNocaseUndefined: Self = StObject.set(x, "nocase", js.undefined)
      
      inline def setPartialMatch(value: Boolean): Self = StObject.set(x, "partialMatch", value.asInstanceOf[js.Any])
      
      inline def setPartialMatchUndefined: Self = StObject.set(x, "partialMatch", js.undefined)
    }
  }
}
