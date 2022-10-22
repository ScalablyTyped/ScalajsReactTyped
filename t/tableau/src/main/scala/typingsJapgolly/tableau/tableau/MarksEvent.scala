package typingsJapgolly.tableau.tableau

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MarksEvent
  extends StObject
     with TableauEvent {
  
  /** Gets the selected marks on the Worksheet that triggered the event. */
  def getMarksAsync(): js.Promise[js.Array[Mark]]
  
  /** Gets the Worksheet object associated with the event. */
  def getWorksheet(): Worksheet
}
object MarksEvent {
  
  inline def apply(
    getEventName: CallbackTo[TableauEventName],
    getMarksAsync: CallbackTo[js.Promise[js.Array[Mark]]],
    getViz: CallbackTo[Viz],
    getWorksheet: CallbackTo[Worksheet]
  ): MarksEvent = {
    val __obj = js.Dynamic.literal(getEventName = getEventName.toJsFn, getMarksAsync = getMarksAsync.toJsFn, getViz = getViz.toJsFn, getWorksheet = getWorksheet.toJsFn)
    __obj.asInstanceOf[MarksEvent]
  }
  
  extension [Self <: MarksEvent](x: Self) {
    
    inline def setGetMarksAsync(value: CallbackTo[js.Promise[js.Array[Mark]]]): Self = StObject.set(x, "getMarksAsync", value.toJsFn)
    
    inline def setGetWorksheet(value: CallbackTo[Worksheet]): Self = StObject.set(x, "getWorksheet", value.toJsFn)
  }
}
