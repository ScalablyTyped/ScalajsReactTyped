package typingsJapgolly.winrt.Windows.Media.PlayTo

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPlayToSourceRequest extends StObject {
  
  var deadline: js.Date
  
  def displayErrorString(errorString: String): Unit
  
  def getDeferral(): PlayToSourceDeferral
  
  def setSource(value: PlayToSource): Unit
}
object IPlayToSourceRequest {
  
  inline def apply(
    deadline: js.Date,
    displayErrorString: String => Callback,
    getDeferral: CallbackTo[PlayToSourceDeferral],
    setSource: PlayToSource => Callback
  ): IPlayToSourceRequest = {
    val __obj = js.Dynamic.literal(deadline = deadline.asInstanceOf[js.Any], displayErrorString = js.Any.fromFunction1((t0: String) => displayErrorString(t0).runNow()), getDeferral = getDeferral.toJsFn, setSource = js.Any.fromFunction1((t0: PlayToSource) => setSource(t0).runNow()))
    __obj.asInstanceOf[IPlayToSourceRequest]
  }
  
  extension [Self <: IPlayToSourceRequest](x: Self) {
    
    inline def setDeadline(value: js.Date): Self = StObject.set(x, "deadline", value.asInstanceOf[js.Any])
    
    inline def setDisplayErrorString(value: String => Callback): Self = StObject.set(x, "displayErrorString", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setGetDeferral(value: CallbackTo[PlayToSourceDeferral]): Self = StObject.set(x, "getDeferral", value.toJsFn)
    
    inline def setSetSource(value: PlayToSource => Callback): Self = StObject.set(x, "setSource", js.Any.fromFunction1((t0: PlayToSource) => value(t0).runNow()))
  }
}
