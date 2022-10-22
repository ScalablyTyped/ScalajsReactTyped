package typingsJapgolly.winrtUwp.Windows.UI.Text.Core

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrtUwp.Windows.Foundation.Deferral
import typingsJapgolly.winrtUwp.Windows.UI.Text.UnderlineType
import typingsJapgolly.winrtUwp.Windows.UI.ViewManagement.UIElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the FormatUpdating event. */
trait CoreTextFormatUpdatingEventArgs extends StObject {
  
  /** Gets a value that represents the background color to be applied to the text range. The text input server populates this property before raising the event. */
  var backgroundColor: UIElementType
  
  /**
    * Requests that the format update operation be delayed. Call this method if your text input control is hosted on a worker thread rather than on the UI thread.
    * @return A Deferral object.
    */
  def getDeferral(): Deferral
  
  /** Gets a value that indicates whether the format update operation is canceled. */
  var isCanceled: Boolean
  
  /** Gets a value that indicates the range of text that the text input server needs to format. The server populates this property before raising the event. */
  var range: CoreTextRange
  
  /** Gets a value that indicates the reason that the text input server needs to apply formatting to this range of text. The server populates this property before raising the event. */
  var reason: CoreTextFormatUpdatingReason
  
  /** Gets or sets a value that indicates the result of handling the FormatUpdating event. The default value is Succeeded but if you can't action the operation as the text input server expects then before returning from the event handler set the property to the appropriate value to indicate what has happened. */
  var result: CoreTextFormatUpdatingResult
  
  /** Gets a value that represents the text color to be applied to the text range. The text input server populates this property before raising the event. */
  var textColor: UIElementType
  
  /** Gets a value that represents the underline color to be applied to the text range. The text input server populates this property before raising the event. */
  var underlineColor: UIElementType
  
  /** Gets a value that represents the underline type to be applied to the text range. The text input server populates this property before raising the event. */
  var underlineType: UnderlineType
}
object CoreTextFormatUpdatingEventArgs {
  
  inline def apply(
    backgroundColor: UIElementType,
    getDeferral: CallbackTo[Deferral],
    isCanceled: Boolean,
    range: CoreTextRange,
    reason: CoreTextFormatUpdatingReason,
    result: CoreTextFormatUpdatingResult,
    textColor: UIElementType,
    underlineColor: UIElementType,
    underlineType: UnderlineType
  ): CoreTextFormatUpdatingEventArgs = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], getDeferral = getDeferral.toJsFn, isCanceled = isCanceled.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], textColor = textColor.asInstanceOf[js.Any], underlineColor = underlineColor.asInstanceOf[js.Any], underlineType = underlineType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoreTextFormatUpdatingEventArgs]
  }
  
  extension [Self <: CoreTextFormatUpdatingEventArgs](x: Self) {
    
    inline def setBackgroundColor(value: UIElementType): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setGetDeferral(value: CallbackTo[Deferral]): Self = StObject.set(x, "getDeferral", value.toJsFn)
    
    inline def setIsCanceled(value: Boolean): Self = StObject.set(x, "isCanceled", value.asInstanceOf[js.Any])
    
    inline def setRange(value: CoreTextRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setReason(value: CoreTextFormatUpdatingReason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setResult(value: CoreTextFormatUpdatingResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setTextColor(value: UIElementType): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
    
    inline def setUnderlineColor(value: UIElementType): Self = StObject.set(x, "underlineColor", value.asInstanceOf[js.Any])
    
    inline def setUnderlineType(value: UnderlineType): Self = StObject.set(x, "underlineType", value.asInstanceOf[js.Any])
  }
}
