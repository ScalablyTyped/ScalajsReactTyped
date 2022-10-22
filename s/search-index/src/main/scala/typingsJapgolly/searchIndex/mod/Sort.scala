package typingsJapgolly.searchIndex.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sort extends StObject {
  
  var DIRECTION: Direction
  
  var FIELD: String
  
  var TYPE: Type
}
object Sort {
  
  inline def apply(DIRECTION: Direction, FIELD: String, TYPE: Type): Sort = {
    val __obj = js.Dynamic.literal(DIRECTION = DIRECTION.asInstanceOf[js.Any], FIELD = FIELD.asInstanceOf[js.Any], TYPE = TYPE.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sort]
  }
  
  extension [Self <: Sort](x: Self) {
    
    inline def setDIRECTION(value: Direction): Self = StObject.set(x, "DIRECTION", value.asInstanceOf[js.Any])
    
    inline def setFIELD(value: String): Self = StObject.set(x, "FIELD", value.asInstanceOf[js.Any])
    
    inline def setTYPE(value: Type): Self = StObject.set(x, "TYPE", value.asInstanceOf[js.Any])
  }
}
