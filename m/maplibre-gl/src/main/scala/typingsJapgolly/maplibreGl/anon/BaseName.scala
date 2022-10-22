package typingsJapgolly.maplibreGl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseName extends StObject {
  
  var base: Any
  
  var name: String
}
object BaseName {
  
  inline def apply(base: Any, name: String): BaseName = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseName]
  }
  
  extension [Self <: BaseName](x: Self) {
    
    inline def setBase(value: Any): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
