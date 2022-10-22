package typingsJapgolly.tableau.tableau

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterEvent
  extends StObject
     with TableauEvent {
  
  /** Gets the name of the field. */
  def getFieldName(): String
  
  /** Gets the Filter object associated with the event. */
  def getFilterAsync(): js.Promise[ConcreteFilter]
  
  /** Gets the Worksheet object associated with the event. */
  def getWorksheet(): Worksheet
}
object FilterEvent {
  
  inline def apply(
    getEventName: CallbackTo[TableauEventName],
    getFieldName: CallbackTo[String],
    getFilterAsync: CallbackTo[js.Promise[ConcreteFilter]],
    getViz: CallbackTo[Viz],
    getWorksheet: CallbackTo[Worksheet]
  ): FilterEvent = {
    val __obj = js.Dynamic.literal(getEventName = getEventName.toJsFn, getFieldName = getFieldName.toJsFn, getFilterAsync = getFilterAsync.toJsFn, getViz = getViz.toJsFn, getWorksheet = getWorksheet.toJsFn)
    __obj.asInstanceOf[FilterEvent]
  }
  
  extension [Self <: FilterEvent](x: Self) {
    
    inline def setGetFieldName(value: CallbackTo[String]): Self = StObject.set(x, "getFieldName", value.toJsFn)
    
    inline def setGetFilterAsync(value: CallbackTo[js.Promise[ConcreteFilter]]): Self = StObject.set(x, "getFilterAsync", value.toJsFn)
    
    inline def setGetWorksheet(value: CallbackTo[Worksheet]): Self = StObject.set(x, "getWorksheet", value.toJsFn)
  }
}
