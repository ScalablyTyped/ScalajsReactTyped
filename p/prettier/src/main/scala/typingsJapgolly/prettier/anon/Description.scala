package typingsJapgolly.prettier.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Description[Value] extends StObject {
  
  var description: String
  
  var since: js.UndefOr[String] = js.undefined
  
  var value: Value
}
object Description {
  
  inline def apply[Value](description: String, value: Value): Description[Value] = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Description[Value]]
  }
  
  extension [Self <: Description[?], Value](x: Self & Description[Value]) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setSince(value: String): Self = StObject.set(x, "since", value.asInstanceOf[js.Any])
    
    inline def setSinceUndefined: Self = StObject.set(x, "since", js.undefined)
    
    inline def setValue(value: Value): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
