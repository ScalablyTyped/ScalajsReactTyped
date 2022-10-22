package typingsJapgolly.winrtUwp.Windows.Graphics.Printing

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Arguments associated with the PrintTaskSourceRequestedHandler delegate. Provides a method for handing the content to be printed to the Print Task. */
trait PrintTaskSourceRequestedArgs extends StObject {
  
  /** Gets the DateTime object that indicates the deadline for a print task source request. */
  var deadline: js.Date
  
  /**
    * Gets a PrintTaskSourceRequestedDeferral object that provides access to a Complete method. This method indicates then the deferral is over.
    * @return Provides access to a Complete method.
    */
  def getDeferral(): PrintTaskSourceRequestedDeferral
  
  /**
    * Informs the print task of the content to be printed.
    * @param source A pointer to the IPrintDocumentSource interface.
    */
  def setSource(source: IPrintDocumentSource): Unit
}
object PrintTaskSourceRequestedArgs {
  
  inline def apply(
    deadline: js.Date,
    getDeferral: CallbackTo[PrintTaskSourceRequestedDeferral],
    setSource: IPrintDocumentSource => Callback
  ): PrintTaskSourceRequestedArgs = {
    val __obj = js.Dynamic.literal(deadline = deadline.asInstanceOf[js.Any], getDeferral = getDeferral.toJsFn, setSource = js.Any.fromFunction1((t0: IPrintDocumentSource) => setSource(t0).runNow()))
    __obj.asInstanceOf[PrintTaskSourceRequestedArgs]
  }
  
  extension [Self <: PrintTaskSourceRequestedArgs](x: Self) {
    
    inline def setDeadline(value: js.Date): Self = StObject.set(x, "deadline", value.asInstanceOf[js.Any])
    
    inline def setGetDeferral(value: CallbackTo[PrintTaskSourceRequestedDeferral]): Self = StObject.set(x, "getDeferral", value.toJsFn)
    
    inline def setSetSource(value: IPrintDocumentSource => Callback): Self = StObject.set(x, "setSource", js.Any.fromFunction1((t0: IPrintDocumentSource) => value(t0).runNow()))
  }
}
