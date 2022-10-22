package typingsJapgolly.cytoscape.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parent extends StObject {
  
  var parent: String | Null
}
object Parent {
  
  inline def apply(): Parent = {
    val __obj = js.Dynamic.literal(parent = null)
    __obj.asInstanceOf[Parent]
  }
  
  extension [Self <: Parent](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentNull: Self = StObject.set(x, "parent", null)
  }
}
