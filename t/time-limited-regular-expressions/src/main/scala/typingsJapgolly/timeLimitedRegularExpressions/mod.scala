package typingsJapgolly.timeLimitedRegularExpressions

import typingsJapgolly.std.RegExpMatchArray
import typingsJapgolly.timeLimitedRegularExpressions.anon.Limit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): TLRE = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[TLRE]
  inline def apply(options: Limit): TLRE = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[TLRE]
  
  @JSImport("time-limited-regular-expressions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait TLRE extends StObject {
    
    def `match`(regex: js.RegExp, string: String): js.Promise[RegExpMatchArray | Null]
  }
  object TLRE {
    
    inline def apply(`match`: (js.RegExp, String) => js.Promise[RegExpMatchArray | Null]): TLRE = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("match")(js.Any.fromFunction2(`match`))
      __obj.asInstanceOf[TLRE]
    }
    
    extension [Self <: TLRE](x: Self) {
      
      inline def setMatch(value: (js.RegExp, String) => js.Promise[RegExpMatchArray | Null]): Self = StObject.set(x, "match", js.Any.fromFunction2(value))
    }
  }
}
