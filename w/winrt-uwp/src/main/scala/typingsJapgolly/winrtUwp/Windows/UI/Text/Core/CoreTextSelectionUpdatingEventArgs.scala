package typingsJapgolly.winrtUwp.Windows.UI.Text.Core

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrtUwp.Windows.Foundation.Deferral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the SelectionUpdating event. */
trait CoreTextSelectionUpdatingEventArgs extends StObject {
  
  /**
    * Requests that the selection update operation be delayed. Call this method if your text input control is hosted on a worker thread rather than on the UI thread.
    * @return A Deferral object.
    */
  def getDeferral(): Deferral
  
  /** Gets a value that indicates whether the selection update operation is canceled. */
  var isCanceled: Boolean
  
  /** Gets or sets a value that indicates the result of handling the SelectionUpdating event. The default value is Succeeded but if you can't action the operation as the text input server expects then before returning from the event handler set the property to the appropriate value to indicate what has happened. */
  var result: CoreTextSelectionUpdatingResult
  
  /** Gets a value that indicates the range of text that the text input server indicates should be selected. The server populates this property before raising the event. */
  var selection: CoreTextRange
}
object CoreTextSelectionUpdatingEventArgs {
  
  inline def apply(
    getDeferral: CallbackTo[Deferral],
    isCanceled: Boolean,
    result: CoreTextSelectionUpdatingResult,
    selection: CoreTextRange
  ): CoreTextSelectionUpdatingEventArgs = {
    val __obj = js.Dynamic.literal(getDeferral = getDeferral.toJsFn, isCanceled = isCanceled.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoreTextSelectionUpdatingEventArgs]
  }
  
  extension [Self <: CoreTextSelectionUpdatingEventArgs](x: Self) {
    
    inline def setGetDeferral(value: CallbackTo[Deferral]): Self = StObject.set(x, "getDeferral", value.toJsFn)
    
    inline def setIsCanceled(value: Boolean): Self = StObject.set(x, "isCanceled", value.asInstanceOf[js.Any])
    
    inline def setResult(value: CoreTextSelectionUpdatingResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setSelection(value: CoreTextRange): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
  }
}
