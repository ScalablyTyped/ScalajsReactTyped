package typingsJapgolly.nextReduxSaga

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Async extends StObject {
    
    var async: Boolean
  }
  object Async {
    
    inline def apply(async: Boolean): Async = {
      val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any])
      __obj.asInstanceOf[Async]
    }
    
    extension [Self <: Async](x: Self) {
      
      inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    }
  }
}
