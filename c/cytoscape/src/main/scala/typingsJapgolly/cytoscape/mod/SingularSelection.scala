package typingsJapgolly.cytoscape.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * http://js.cytoscape.org/#collection/selection
  */
trait SingularSelection extends StObject {
  
  /**
    * Get whether the element's selection state is mutable.
    * http://js.cytoscape.org/#ele.selectable
    */
  def selectable(): Boolean
  
  /**
    * Get whether the element is selected.
    * http://js.cytoscape.org/#ele.selected
    */
  def selected(): Boolean
}
object SingularSelection {
  
  inline def apply(selectable: CallbackTo[Boolean], selected: CallbackTo[Boolean]): SingularSelection = {
    val __obj = js.Dynamic.literal(selectable = selectable.toJsFn, selected = selected.toJsFn)
    __obj.asInstanceOf[SingularSelection]
  }
  
  extension [Self <: SingularSelection](x: Self) {
    
    inline def setSelectable(value: CallbackTo[Boolean]): Self = StObject.set(x, "selectable", value.toJsFn)
    
    inline def setSelected(value: CallbackTo[Boolean]): Self = StObject.set(x, "selected", value.toJsFn)
  }
}
