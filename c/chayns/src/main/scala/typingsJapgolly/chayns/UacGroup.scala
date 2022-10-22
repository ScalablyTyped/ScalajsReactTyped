package typingsJapgolly.chayns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// chayns.getUacGroups()
trait UacGroup extends StObject {
  
  var id: Double
  
  var name: String
  
  var showName: String
}
object UacGroup {
  
  inline def apply(id: Double, name: String, showName: String): UacGroup = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], showName = showName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UacGroup]
  }
  
  extension [Self <: UacGroup](x: Self) {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setShowName(value: String): Self = StObject.set(x, "showName", value.asInstanceOf[js.Any])
  }
}
