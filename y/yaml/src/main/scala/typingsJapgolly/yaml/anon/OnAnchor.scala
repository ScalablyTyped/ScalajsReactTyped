package typingsJapgolly.yaml.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnAnchor extends StObject {
  
  def onAnchor(source: Any): String
  
  /**
    * With circular references, the source node is only resolved after all
    * of its child nodes are. This is why anchors are set only after all of
    * the nodes have been created.
    */
  def setAnchors(): Unit
  
  var sourceObjects: Map[Any, Node]
}
object OnAnchor {
  
  inline def apply(onAnchor: Any => String, setAnchors: Callback, sourceObjects: Map[Any, Node]): OnAnchor = {
    val __obj = js.Dynamic.literal(onAnchor = js.Any.fromFunction1(onAnchor), setAnchors = setAnchors.toJsFn, sourceObjects = sourceObjects.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnAnchor]
  }
  
  extension [Self <: OnAnchor](x: Self) {
    
    inline def setOnAnchor(value: Any => String): Self = StObject.set(x, "onAnchor", js.Any.fromFunction1(value))
    
    inline def setSetAnchors(value: Callback): Self = StObject.set(x, "setAnchors", value.toJsFn)
    
    inline def setSourceObjects(value: Map[Any, Node]): Self = StObject.set(x, "sourceObjects", value.asInstanceOf[js.Any])
  }
}
