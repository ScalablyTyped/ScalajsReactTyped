package typingsJapgolly.sequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait cast extends StObject {
  
  var `type`: String
  
  var `val`: Any
}
object cast {
  
  inline def apply(`type`: String, `val`: Any): cast = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[cast]
  }
  
  extension [Self <: cast](x: Self) {
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVal(value: Any): Self = StObject.set(x, "val", value.asInstanceOf[js.Any])
  }
}
