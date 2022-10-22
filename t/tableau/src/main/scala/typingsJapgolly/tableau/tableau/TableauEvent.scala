package typingsJapgolly.tableau.tableau

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableauEvent extends StObject {
  
  /** Gets the name of the event, which is a string, but is also one of the items in the TableauEventName enum. */
  def getEventName(): TableauEventName
  
  /** Gets the Viz object associated with the event. */
  def getViz(): Viz
}
object TableauEvent {
  
  inline def apply(getEventName: CallbackTo[TableauEventName], getViz: CallbackTo[Viz]): TableauEvent = {
    val __obj = js.Dynamic.literal(getEventName = getEventName.toJsFn, getViz = getViz.toJsFn)
    __obj.asInstanceOf[TableauEvent]
  }
  
  extension [Self <: TableauEvent](x: Self) {
    
    inline def setGetEventName(value: CallbackTo[TableauEventName]): Self = StObject.set(x, "getEventName", value.toJsFn)
    
    inline def setGetViz(value: CallbackTo[Viz]): Self = StObject.set(x, "getViz", value.toJsFn)
  }
}
