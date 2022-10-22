package typingsJapgolly.cytoscape.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeCollectionLayout extends StObject {
  
  /**
    * Position the nodes for a discrete/synchronous layout.
    * http://js.cytoscape.org/#nodes.layoutPositions
    * @param layout The layout.
    * @param options The layout options object.
    */
  def layoutPositions(layout: String, options: LayoutPositionOptions, handler: ElementPositionFunction): Unit
}
object NodeCollectionLayout {
  
  inline def apply(layoutPositions: (String, LayoutPositionOptions, ElementPositionFunction) => Callback): NodeCollectionLayout = {
    val __obj = js.Dynamic.literal(layoutPositions = js.Any.fromFunction3((t0: String, t1: LayoutPositionOptions, t2: ElementPositionFunction) => (layoutPositions(t0, t1, t2)).runNow()))
    __obj.asInstanceOf[NodeCollectionLayout]
  }
  
  extension [Self <: NodeCollectionLayout](x: Self) {
    
    inline def setLayoutPositions(value: (String, LayoutPositionOptions, ElementPositionFunction) => Callback): Self = StObject.set(x, "layoutPositions", js.Any.fromFunction3((t0: String, t1: LayoutPositionOptions, t2: ElementPositionFunction) => (value(t0, t1, t2)).runNow()))
  }
}
