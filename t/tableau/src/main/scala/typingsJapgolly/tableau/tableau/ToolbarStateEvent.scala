package typingsJapgolly.tableau.tableau

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToolbarStateEvent
  extends StObject
     with TableauEvent {
  
  /** Returns the new ToolbarState. */
  def getToolbarState(): ToolbarState
}
object ToolbarStateEvent {
  
  inline def apply(
    getEventName: CallbackTo[TableauEventName],
    getToolbarState: CallbackTo[ToolbarState],
    getViz: CallbackTo[Viz]
  ): ToolbarStateEvent = {
    val __obj = js.Dynamic.literal(getEventName = getEventName.toJsFn, getToolbarState = getToolbarState.toJsFn, getViz = getViz.toJsFn)
    __obj.asInstanceOf[ToolbarStateEvent]
  }
  
  extension [Self <: ToolbarStateEvent](x: Self) {
    
    inline def setGetToolbarState(value: CallbackTo[ToolbarState]): Self = StObject.set(x, "getToolbarState", value.toJsFn)
  }
}
