package typingsJapgolly.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueAny extends StObject {
  
  var key: String
  
  var value: scala.Any
}
object ValueAny {
  
  inline def apply(key: String, value: scala.Any): ValueAny = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueAny]
  }
  
  extension [Self <: ValueAny](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setValue(value: scala.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
