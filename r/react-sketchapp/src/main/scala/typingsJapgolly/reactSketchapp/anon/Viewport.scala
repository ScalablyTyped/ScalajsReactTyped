package typingsJapgolly.reactSketchapp.anon

import typingsJapgolly.propTypes.mod.InferProps
import typingsJapgolly.propTypes.mod.ReactNodeLike
import typingsJapgolly.propTypes.mod.Requireable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Viewport extends StObject {
  
  var children: Requireable[ReactNodeLike]
  
  var viewport: Requireable[InferProps[Width]]
}
object Viewport {
  
  inline def apply(children: Requireable[ReactNodeLike], viewport: Requireable[InferProps[Width]]): Viewport = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], viewport = viewport.asInstanceOf[js.Any])
    __obj.asInstanceOf[Viewport]
  }
  
  extension [Self <: Viewport](x: Self) {
    
    inline def setChildren(value: Requireable[ReactNodeLike]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setViewport(value: Requireable[InferProps[Width]]): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
  }
}
