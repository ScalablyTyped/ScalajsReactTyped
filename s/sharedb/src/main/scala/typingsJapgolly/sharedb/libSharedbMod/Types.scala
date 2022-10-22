package typingsJapgolly.sharedb.libSharedbMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Types extends StObject {
  
  var map: StringDictionary[Type]
  
  def register(`type`: Type): Unit
}
object Types {
  
  inline def apply(map: StringDictionary[Type], register: Type => japgolly.scalajs.react.Callback): Types = {
    val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any], register = js.Any.fromFunction1((t0: Type) => register(t0).runNow()))
    __obj.asInstanceOf[Types]
  }
  
  extension [Self <: Types](x: Self) {
    
    inline def setMap(value: StringDictionary[Type]): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setRegister(value: Type => japgolly.scalajs.react.Callback): Self = StObject.set(x, "register", js.Any.fromFunction1((t0: Type) => value(t0).runNow()))
  }
}
