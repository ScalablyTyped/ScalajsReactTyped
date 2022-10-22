package typingsJapgolly.reactSketchapp.anon

import typingsJapgolly.propTypes.mod.InferProps
import typingsJapgolly.propTypes.mod.ReactNodeLike
import typingsJapgolly.propTypes.mod.Requireable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Style extends StObject {
  
  var children: Requireable[ReactNodeLike]
  
  var name: Requireable[String]
  
  var style: Requireable[js.UndefOr[Double | InferProps[js.Object] | Null]]
}
object Style {
  
  inline def apply(
    children: Requireable[ReactNodeLike],
    name: Requireable[String],
    style: Requireable[js.UndefOr[Double | InferProps[js.Object] | Null]]
  ): Style = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Style]
  }
  
  extension [Self <: Style](x: Self) {
    
    inline def setChildren(value: Requireable[ReactNodeLike]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setName(value: Requireable[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: Requireable[js.UndefOr[Double | InferProps[js.Object] | Null]]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
