package typingsJapgolly.jstimezonedetect

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Name extends StObject {
    
    def name(): String
  }
  object Name {
    
    inline def apply(name: CallbackTo[String]): Name = {
      val __obj = js.Dynamic.literal(name = name.toJsFn)
      __obj.asInstanceOf[Name]
    }
    
    extension [Self <: Name](x: Self) {
      
      inline def setName(value: CallbackTo[String]): Self = StObject.set(x, "name", value.toJsFn)
    }
  }
}
