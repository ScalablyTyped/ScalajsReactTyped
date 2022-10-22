package typingsJapgolly.prettier.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Since[Value] extends StObject {
  
  var since: String
  
  var value: Value
}
object Since {
  
  inline def apply[Value](since: String, value: Value): Since[Value] = {
    val __obj = js.Dynamic.literal(since = since.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Since[Value]]
  }
  
  extension [Self <: Since[?], Value](x: Self & Since[Value]) {
    
    inline def setSince(value: String): Self = StObject.set(x, "since", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Value): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
