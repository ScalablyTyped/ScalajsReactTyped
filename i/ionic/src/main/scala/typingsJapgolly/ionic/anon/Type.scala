package typingsJapgolly.ionic.anon

import typingsJapgolly.ionic.definitionsMod.ProjectType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Type extends StObject {
  
  var id: String
  
  var name: String
  
  var `type`: ProjectType
}
object Type {
  
  inline def apply(id: String, name: String, `type`: ProjectType): Type = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
  
  extension [Self <: Type](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: ProjectType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
