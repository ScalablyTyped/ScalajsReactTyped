package typingsJapgolly.winrt.Windows.Graphics.Printing

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPrintTaskSourceRequestedArgs extends StObject {
  
  var deadline: js.Date
  
  def getDeferral(): PrintTaskSourceRequestedDeferral
  
  def setSource(source: IPrintDocumentSource): Unit
}
object IPrintTaskSourceRequestedArgs {
  
  inline def apply(
    deadline: js.Date,
    getDeferral: CallbackTo[PrintTaskSourceRequestedDeferral],
    setSource: IPrintDocumentSource => Callback
  ): IPrintTaskSourceRequestedArgs = {
    val __obj = js.Dynamic.literal(deadline = deadline.asInstanceOf[js.Any], getDeferral = getDeferral.toJsFn, setSource = js.Any.fromFunction1((t0: IPrintDocumentSource) => setSource(t0).runNow()))
    __obj.asInstanceOf[IPrintTaskSourceRequestedArgs]
  }
  
  extension [Self <: IPrintTaskSourceRequestedArgs](x: Self) {
    
    inline def setDeadline(value: js.Date): Self = StObject.set(x, "deadline", value.asInstanceOf[js.Any])
    
    inline def setGetDeferral(value: CallbackTo[PrintTaskSourceRequestedDeferral]): Self = StObject.set(x, "getDeferral", value.toJsFn)
    
    inline def setSetSource(value: IPrintDocumentSource => Callback): Self = StObject.set(x, "setSource", js.Any.fromFunction1((t0: IPrintDocumentSource) => value(t0).runNow()))
  }
}
