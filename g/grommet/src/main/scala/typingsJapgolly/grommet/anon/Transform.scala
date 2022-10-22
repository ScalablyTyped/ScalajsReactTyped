package typingsJapgolly.grommet.anon

import japgolly.scalajs.react.facade.React.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Transform extends StObject {
  
  var property: String
  
  def transform(args: Any*): Node
}
object Transform {
  
  inline def apply(property: String, transform: /* repeated */ Any => Node): Transform = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any], transform = js.Any.fromFunction1(transform))
    __obj.asInstanceOf[Transform]
  }
  
  extension [Self <: Transform](x: Self) {
    
    inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setTransform(value: /* repeated */ Any => Node): Self = StObject.set(x, "transform", js.Any.fromFunction1(value))
  }
}
