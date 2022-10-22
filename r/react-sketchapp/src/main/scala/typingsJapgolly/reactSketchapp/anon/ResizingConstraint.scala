package typingsJapgolly.reactSketchapp.anon

import typingsJapgolly.propTypes.mod.InferProps
import typingsJapgolly.propTypes.mod.ReactNodeLike
import typingsJapgolly.propTypes.mod.Requireable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResizingConstraint extends StObject {
  
  var children: Requireable[ReactNodeLike]
  
  var flow: Requireable[InferProps[AnimationType]]
  
  var name: Requireable[String]
  
  var resizingConstraint: Requireable[InferProps[Bottom]]
  
  var shadows: Requireable[js.Array[js.UndefOr[InferProps[ShadowColor] | Null]]]
  
  var style: Requireable[js.UndefOr[Double | InferProps[AlignSelf] | Null]]
}
object ResizingConstraint {
  
  inline def apply(
    children: Requireable[ReactNodeLike],
    flow: Requireable[InferProps[AnimationType]],
    name: Requireable[String],
    resizingConstraint: Requireable[InferProps[Bottom]],
    shadows: Requireable[js.Array[js.UndefOr[InferProps[ShadowColor] | Null]]],
    style: Requireable[js.UndefOr[Double | InferProps[AlignSelf] | Null]]
  ): ResizingConstraint = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], flow = flow.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], resizingConstraint = resizingConstraint.asInstanceOf[js.Any], shadows = shadows.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResizingConstraint]
  }
  
  extension [Self <: ResizingConstraint](x: Self) {
    
    inline def setChildren(value: Requireable[ReactNodeLike]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setFlow(value: Requireable[InferProps[AnimationType]]): Self = StObject.set(x, "flow", value.asInstanceOf[js.Any])
    
    inline def setName(value: Requireable[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setResizingConstraint(value: Requireable[InferProps[Bottom]]): Self = StObject.set(x, "resizingConstraint", value.asInstanceOf[js.Any])
    
    inline def setShadows(value: Requireable[js.Array[js.UndefOr[InferProps[ShadowColor] | Null]]]): Self = StObject.set(x, "shadows", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: Requireable[js.UndefOr[Double | InferProps[AlignSelf] | Null]]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
