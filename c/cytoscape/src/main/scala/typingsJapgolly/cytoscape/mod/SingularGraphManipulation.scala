package typingsJapgolly.cytoscape.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * http://js.cytoscape.org/#collection/graph-manipulation
  */
trait SingularGraphManipulation extends StObject {
  
  /**
    * Get the core instance that owns the element.
    */
  def cy(): Core
  
  /**
    * Get whether the element is inside the graph (i.e. not removed).
    * http://js.cytoscape.org/#ele.inside
    */
  def inside(): Boolean
  
  /**
    * Get whether the element has been removed from the graph.
    * http://js.cytoscape.org/#ele.removed
    */
  def removed(): Boolean
}
object SingularGraphManipulation {
  
  inline def apply(cy: CallbackTo[Core], inside: CallbackTo[Boolean], removed: CallbackTo[Boolean]): SingularGraphManipulation = {
    val __obj = js.Dynamic.literal(cy = cy.toJsFn, inside = inside.toJsFn, removed = removed.toJsFn)
    __obj.asInstanceOf[SingularGraphManipulation]
  }
  
  extension [Self <: SingularGraphManipulation](x: Self) {
    
    inline def setCy(value: CallbackTo[Core]): Self = StObject.set(x, "cy", value.toJsFn)
    
    inline def setInside(value: CallbackTo[Boolean]): Self = StObject.set(x, "inside", value.toJsFn)
    
    inline def setRemoved(value: CallbackTo[Boolean]): Self = StObject.set(x, "removed", value.toJsFn)
  }
}
