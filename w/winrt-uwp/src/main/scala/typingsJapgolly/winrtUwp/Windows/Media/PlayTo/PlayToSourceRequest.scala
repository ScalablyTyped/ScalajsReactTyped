package typingsJapgolly.winrtUwp.Windows.Media.PlayTo

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a request to connect a media element with a Play To target. */
trait PlayToSourceRequest extends StObject {
  
  /** Gets the time limit to supply the Play To source element. */
  var deadline: js.Date
  
  /**
    * Displays an error message in the Play To UI.
    * @param errorString The error message to display in the Play To UI.
    */
  def displayErrorString(errorString: String): Unit
  
  /**
    * Defers connecting a media source to a Play To target.
    * @return A deferral object that you can use to identify when the deferral is complete.
    */
  def getDeferral(): PlayToSourceDeferral
  
  /**
    * Sets the source element to connect to the Play To target.
    * @param value The source element to connect to the Play To target.
    */
  def setSource(value: PlayToSource): Unit
}
object PlayToSourceRequest {
  
  inline def apply(
    deadline: js.Date,
    displayErrorString: String => Callback,
    getDeferral: CallbackTo[PlayToSourceDeferral],
    setSource: PlayToSource => Callback
  ): PlayToSourceRequest = {
    val __obj = js.Dynamic.literal(deadline = deadline.asInstanceOf[js.Any], displayErrorString = js.Any.fromFunction1((t0: String) => displayErrorString(t0).runNow()), getDeferral = getDeferral.toJsFn, setSource = js.Any.fromFunction1((t0: PlayToSource) => setSource(t0).runNow()))
    __obj.asInstanceOf[PlayToSourceRequest]
  }
  
  extension [Self <: PlayToSourceRequest](x: Self) {
    
    inline def setDeadline(value: js.Date): Self = StObject.set(x, "deadline", value.asInstanceOf[js.Any])
    
    inline def setDisplayErrorString(value: String => Callback): Self = StObject.set(x, "displayErrorString", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setGetDeferral(value: CallbackTo[PlayToSourceDeferral]): Self = StObject.set(x, "getDeferral", value.toJsFn)
    
    inline def setSetSource(value: PlayToSource => Callback): Self = StObject.set(x, "setSource", js.Any.fromFunction1((t0: PlayToSource) => value(t0).runNow()))
  }
}
