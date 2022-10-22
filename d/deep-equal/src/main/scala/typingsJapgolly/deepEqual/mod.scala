package typingsJapgolly.deepEqual

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(actual: Any, expected: Any): Boolean = (^.asInstanceOf[js.Dynamic].apply(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(actual: Any, expected: Any, opts: DeepEqualOptions): Boolean = (^.asInstanceOf[js.Dynamic].apply(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("deep-equal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait DeepEqualOptions extends StObject {
    
    var strict: Boolean
  }
  object DeepEqualOptions {
    
    inline def apply(strict: Boolean): DeepEqualOptions = {
      val __obj = js.Dynamic.literal(strict = strict.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeepEqualOptions]
    }
    
    extension [Self <: DeepEqualOptions](x: Self) {
      
      inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    }
  }
}
