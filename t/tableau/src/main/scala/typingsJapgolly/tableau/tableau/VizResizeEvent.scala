package typingsJapgolly.tableau.tableau

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VizResizeEvent
  extends StObject
     with TableauEvent {
  
  /** Gets the sheetSize record for the current sheet. For more information, see SheetSizeOptions Record. */
  def getVizSize(): Size
}
object VizResizeEvent {
  
  inline def apply(getEventName: CallbackTo[TableauEventName], getViz: CallbackTo[Viz], getVizSize: CallbackTo[Size]): VizResizeEvent = {
    val __obj = js.Dynamic.literal(getEventName = getEventName.toJsFn, getViz = getViz.toJsFn, getVizSize = getVizSize.toJsFn)
    __obj.asInstanceOf[VizResizeEvent]
  }
  
  extension [Self <: VizResizeEvent](x: Self) {
    
    inline def setGetVizSize(value: CallbackTo[Size]): Self = StObject.set(x, "getVizSize", value.toJsFn)
  }
}
