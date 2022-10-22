package typingsJapgolly.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AgentJobCategory extends StObject {
  
  var id: String
  
  var name: String
}
object AgentJobCategory {
  
  inline def apply(id: String, name: String): AgentJobCategory = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentJobCategory]
  }
  
  extension [Self <: AgentJobCategory](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
