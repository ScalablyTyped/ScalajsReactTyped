package typingsJapgolly.reactSketchapp.anon

import typingsJapgolly.propTypes.mod.ReactNodeLike
import typingsJapgolly.propTypes.mod.Requireable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChildrenRequireable extends StObject {
  
  var children: Requireable[ReactNodeLike]
}
object ChildrenRequireable {
  
  inline def apply(children: Requireable[ReactNodeLike]): ChildrenRequireable = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildrenRequireable]
  }
  
  extension [Self <: ChildrenRequireable](x: Self) {
    
    inline def setChildren(value: Requireable[ReactNodeLike]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
  }
}
