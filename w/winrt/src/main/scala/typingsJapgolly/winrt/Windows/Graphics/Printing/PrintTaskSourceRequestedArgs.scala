package typingsJapgolly.winrt.Windows.Graphics.Printing

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrintTaskSourceRequestedArgs
  extends StObject
     with IPrintTaskSourceRequestedArgs
object PrintTaskSourceRequestedArgs {
  
  inline def apply(
    deadline: js.Date,
    getDeferral: CallbackTo[PrintTaskSourceRequestedDeferral],
    setSource: IPrintDocumentSource => Callback
  ): PrintTaskSourceRequestedArgs = {
    val __obj = js.Dynamic.literal(deadline = deadline.asInstanceOf[js.Any], getDeferral = getDeferral.toJsFn, setSource = js.Any.fromFunction1((t0: IPrintDocumentSource) => setSource(t0).runNow()))
    __obj.asInstanceOf[PrintTaskSourceRequestedArgs]
  }
}
