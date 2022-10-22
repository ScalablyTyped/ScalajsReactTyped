package typingsJapgolly.cytoscape.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * https://js.cytoscape.org/#collection/selection
  */
trait CollectionSelection extends StObject {
  
  def deselect(): this.type
  
  /**
    * Make the elements selected (NB other elements outside the collection are not affected).
    * http://js.cytoscape.org/#eles.select
    */
  def select(): this.type
  
  /**
    * Make the selection states of the elements mutable.
    * http://js.cytoscape.org/#eles.selectify
    */
  def selectify(): this.type
  
  /**
    * Make the elements not selected (NB other elements outside the collection are not affected).
    * http://js.cytoscape.org/#eles.unselect
    */
  def unselect(): this.type
  
  /**
    * Make the selection states of the elements immutable.
    * http://js.cytoscape.org/#eles.unselectify
    */
  def unselectify(): this.type
}
object CollectionSelection {
  
  inline def apply(
    deselect: CallbackTo[CollectionSelection],
    select: CallbackTo[CollectionSelection],
    selectify: CallbackTo[CollectionSelection],
    unselect: CallbackTo[CollectionSelection],
    unselectify: CallbackTo[CollectionSelection]
  ): CollectionSelection = {
    val __obj = js.Dynamic.literal(deselect = deselect.toJsFn, select = select.toJsFn, selectify = selectify.toJsFn, unselect = unselect.toJsFn, unselectify = unselectify.toJsFn)
    __obj.asInstanceOf[CollectionSelection]
  }
  
  extension [Self <: CollectionSelection](x: Self) {
    
    inline def setDeselect(value: CallbackTo[CollectionSelection]): Self = StObject.set(x, "deselect", value.toJsFn)
    
    inline def setSelect(value: CallbackTo[CollectionSelection]): Self = StObject.set(x, "select", value.toJsFn)
    
    inline def setSelectify(value: CallbackTo[CollectionSelection]): Self = StObject.set(x, "selectify", value.toJsFn)
    
    inline def setUnselect(value: CallbackTo[CollectionSelection]): Self = StObject.set(x, "unselect", value.toJsFn)
    
    inline def setUnselectify(value: CallbackTo[CollectionSelection]): Self = StObject.set(x, "unselectify", value.toJsFn)
  }
}
