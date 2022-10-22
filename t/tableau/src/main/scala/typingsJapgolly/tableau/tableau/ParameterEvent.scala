package typingsJapgolly.tableau.tableau

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParameterEvent
  extends StObject
     with TableauEvent {
  
  /** Gets the Parameter object that triggered the event. */
  def getParameterAsync(): js.Promise[Parameter]
  
  /** Gets the name of the parameter that changed. */
  def getParameterName(): String
}
object ParameterEvent {
  
  inline def apply(
    getEventName: CallbackTo[TableauEventName],
    getParameterAsync: CallbackTo[js.Promise[Parameter]],
    getParameterName: CallbackTo[String],
    getViz: CallbackTo[Viz]
  ): ParameterEvent = {
    val __obj = js.Dynamic.literal(getEventName = getEventName.toJsFn, getParameterAsync = getParameterAsync.toJsFn, getParameterName = getParameterName.toJsFn, getViz = getViz.toJsFn)
    __obj.asInstanceOf[ParameterEvent]
  }
  
  extension [Self <: ParameterEvent](x: Self) {
    
    inline def setGetParameterAsync(value: CallbackTo[js.Promise[Parameter]]): Self = StObject.set(x, "getParameterAsync", value.toJsFn)
    
    inline def setGetParameterName(value: CallbackTo[String]): Self = StObject.set(x, "getParameterName", value.toJsFn)
  }
}
