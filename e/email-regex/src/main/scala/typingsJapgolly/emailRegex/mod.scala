package typingsJapgolly.emailRegex

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("email-regex", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): js.RegExp = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.RegExp]
  inline def default(options: Options): js.RegExp = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[js.RegExp]
  
  trait Options extends StObject {
    
    /**
    	Only match an exact string.
    	Useful with `RegExp#test` to check if a string is an email address.
    	@default false
    	*/
    val exact: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setExact(value: Boolean): Self = StObject.set(x, "exact", value.asInstanceOf[js.Any])
      
      inline def setExactUndefined: Self = StObject.set(x, "exact", js.undefined)
    }
  }
}
