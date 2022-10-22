package typingsJapgolly.persona

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Navigator extends StObject {
  
  var id: typingsJapgolly.persona.Persona.Persona
}
object Navigator {
  
  inline def apply(id: typingsJapgolly.persona.Persona.Persona): Navigator = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Navigator]
  }
  
  extension [Self <: Navigator](x: Self) {
    
    inline def setId(value: typingsJapgolly.persona.Persona.Persona): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
