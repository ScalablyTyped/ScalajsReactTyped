package typingsJapgolly.winrtUwp.Windows.UI.Text.Core

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrtUwp.Windows.Foundation.Deferral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the CompositionStarted event. */
trait CoreTextCompositionStartedEventArgs extends StObject {
  
  /**
    * Requests that the operation be delayed. Call this method if your text input control is hosted on a worker thread rather than on the UI thread.
    * @return A Deferral object.
    */
  def getDeferral(): Deferral
  
  /** Gets a value that indicates whether the operation is canceled. */
  var isCanceled: Boolean
}
object CoreTextCompositionStartedEventArgs {
  
  inline def apply(getDeferral: CallbackTo[Deferral], isCanceled: Boolean): CoreTextCompositionStartedEventArgs = {
    val __obj = js.Dynamic.literal(getDeferral = getDeferral.toJsFn, isCanceled = isCanceled.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoreTextCompositionStartedEventArgs]
  }
  
  extension [Self <: CoreTextCompositionStartedEventArgs](x: Self) {
    
    inline def setGetDeferral(value: CallbackTo[Deferral]): Self = StObject.set(x, "getDeferral", value.toJsFn)
    
    inline def setIsCanceled(value: Boolean): Self = StObject.set(x, "isCanceled", value.asInstanceOf[js.Any])
  }
}
