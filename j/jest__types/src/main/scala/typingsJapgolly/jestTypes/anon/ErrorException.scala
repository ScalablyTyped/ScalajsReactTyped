package typingsJapgolly.jestTypes.anon

import typingsJapgolly.jestTypes.jestTypesStrings.error
import typingsJapgolly.jestTypes.mod.Exception
import typingsJapgolly.jestTypes.mod.SyncEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorException
  extends StObject
     with SyncEvent {
  
  var error: Exception
  
  var name: error
}
object ErrorException {
  
  inline def apply(error: Exception): ErrorException = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], name = "error")
    __obj.asInstanceOf[ErrorException]
  }
  
  extension [Self <: ErrorException](x: Self) {
    
    inline def setError(value: Exception): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setName(value: error): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
