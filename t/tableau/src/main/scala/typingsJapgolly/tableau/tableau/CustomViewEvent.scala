package typingsJapgolly.tableau.tableau

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomViewEvent
  extends StObject
     with TableauEvent {
  
  /** Gets the CustomView object associated with the event. */
  def getCustomViewAsync(): js.Promise[CustomView]
}
object CustomViewEvent {
  
  inline def apply(
    getCustomViewAsync: CallbackTo[js.Promise[CustomView]],
    getEventName: CallbackTo[TableauEventName],
    getViz: CallbackTo[Viz]
  ): CustomViewEvent = {
    val __obj = js.Dynamic.literal(getCustomViewAsync = getCustomViewAsync.toJsFn, getEventName = getEventName.toJsFn, getViz = getViz.toJsFn)
    __obj.asInstanceOf[CustomViewEvent]
  }
  
  extension [Self <: CustomViewEvent](x: Self) {
    
    inline def setGetCustomViewAsync(value: CallbackTo[js.Promise[CustomView]]): Self = StObject.set(x, "getCustomViewAsync", value.toJsFn)
  }
}
