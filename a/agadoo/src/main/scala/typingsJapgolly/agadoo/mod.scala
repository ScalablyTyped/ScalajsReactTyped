package typingsJapgolly.agadoo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("agadoo", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def check(input: String): js.Promise[Result] = ^.asInstanceOf[js.Dynamic].applyDynamic("check")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Result]]
  
  trait Result extends StObject {
    
    var shaken: Boolean
  }
  object Result {
    
    inline def apply(shaken: Boolean): Result = {
      val __obj = js.Dynamic.literal(shaken = shaken.asInstanceOf[js.Any])
      __obj.asInstanceOf[Result]
    }
    
    extension [Self <: Result](x: Self) {
      
      inline def setShaken(value: Boolean): Self = StObject.set(x, "shaken", value.asInstanceOf[js.Any])
    }
  }
}
