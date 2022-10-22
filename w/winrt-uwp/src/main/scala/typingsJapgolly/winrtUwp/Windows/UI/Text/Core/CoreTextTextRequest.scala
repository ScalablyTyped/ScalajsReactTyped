package typingsJapgolly.winrtUwp.Windows.UI.Text.Core

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrtUwp.Windows.Foundation.Deferral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents information about a TextRequested event. */
trait CoreTextTextRequest extends StObject {
  
  /**
    * Requests that the text request operation be delayed. Call this method if your text input control is hosted on a worker thread rather than on the UI thread.
    * @return A Deferral object.
    */
  def getDeferral(): Deferral
  
  /** Gets a value that indicates whether the text request operation is canceled. */
  var isCanceled: Boolean
  
  /** Gets a value that indicates the range of text being requested by the text input server. The server populates this property before raising the event. */
  var range: CoreTextRange
  
  /** Gets or sets the text that the text input server is requesting. The application should set the text being requested before returning from the event handler. */
  var text: String
}
object CoreTextTextRequest {
  
  inline def apply(getDeferral: CallbackTo[Deferral], isCanceled: Boolean, range: CoreTextRange, text: String): CoreTextTextRequest = {
    val __obj = js.Dynamic.literal(getDeferral = getDeferral.toJsFn, isCanceled = isCanceled.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoreTextTextRequest]
  }
  
  extension [Self <: CoreTextTextRequest](x: Self) {
    
    inline def setGetDeferral(value: CallbackTo[Deferral]): Self = StObject.set(x, "getDeferral", value.toJsFn)
    
    inline def setIsCanceled(value: Boolean): Self = StObject.set(x, "isCanceled", value.asInstanceOf[js.Any])
    
    inline def setRange(value: CoreTextRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
