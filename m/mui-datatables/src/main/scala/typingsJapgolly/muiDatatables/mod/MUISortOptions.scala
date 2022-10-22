package typingsJapgolly.muiDatatables.mod

import typingsJapgolly.muiDatatables.muiDatatablesStrings.asc
import typingsJapgolly.muiDatatables.muiDatatablesStrings.desc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MUISortOptions extends StObject {
  
  var direction: asc | desc
  
  var name: String
}
object MUISortOptions {
  
  inline def apply(direction: asc | desc, name: String): MUISortOptions = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[MUISortOptions]
  }
  
  extension [Self <: MUISortOptions](x: Self) {
    
    inline def setDirection(value: asc | desc): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
