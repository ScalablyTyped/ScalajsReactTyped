package typingsJapgolly.reactSketchapp.anon

import typingsJapgolly.propTypes.mod.ReactNodeLike
import typingsJapgolly.propTypes.mod.Requireable
import typingsJapgolly.propTypes.mod.Validator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Id extends StObject {
  
  var children: Requireable[ReactNodeLike]
  
  var id: Validator[String]
}
object Id {
  
  inline def apply(children: Requireable[ReactNodeLike], id: Validator[String]): Id = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id]
  }
  
  extension [Self <: Id](x: Self) {
    
    inline def setChildren(value: Requireable[ReactNodeLike]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setId(value: Validator[String]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
