package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides client functionality for the Placeholder dialog within the ASPxHtmlEditor.
  */
trait ASPxClientHtmlEditorPlaceholderDialog
  extends StObject
     with ASPxClientHtmlEditorDialogBase {
  
  /**
    * Provides access to the ASPxListBox client object that lists placeholder names in the Html Editor's Placeholder dialog.
    */
  def GetPlaceholderNameListBox(): ASPxClientListBox
}
object ASPxClientHtmlEditorPlaceholderDialog {
  
  inline def apply(
    GetCancelButton: CallbackTo[ASPxClientButton],
    GetFormLayout: CallbackTo[ASPxClientFormLayout],
    GetOkButton: CallbackTo[ASPxClientButton],
    GetPlaceholderNameListBox: CallbackTo[ASPxClientListBox]
  ): ASPxClientHtmlEditorPlaceholderDialog = {
    val __obj = js.Dynamic.literal(GetCancelButton = GetCancelButton.toJsFn, GetFormLayout = GetFormLayout.toJsFn, GetOkButton = GetOkButton.toJsFn, GetPlaceholderNameListBox = GetPlaceholderNameListBox.toJsFn)
    __obj.asInstanceOf[ASPxClientHtmlEditorPlaceholderDialog]
  }
  
  extension [Self <: ASPxClientHtmlEditorPlaceholderDialog](x: Self) {
    
    inline def setGetPlaceholderNameListBox(value: CallbackTo[ASPxClientListBox]): Self = StObject.set(x, "GetPlaceholderNameListBox", value.toJsFn)
  }
}
