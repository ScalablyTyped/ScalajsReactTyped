package typingsJapgolly.antDesignProLayout.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultMessage extends StObject {
  
  var defaultMessage: js.UndefOr[String] = js.undefined
  
  var id: Any
}
object DefaultMessage {
  
  inline def apply(id: Any): DefaultMessage = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultMessage]
  }
  
  extension [Self <: DefaultMessage](x: Self) {
    
    inline def setDefaultMessage(value: String): Self = StObject.set(x, "defaultMessage", value.asInstanceOf[js.Any])
    
    inline def setDefaultMessageUndefined: Self = StObject.set(x, "defaultMessage", js.undefined)
    
    inline def setId(value: Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
