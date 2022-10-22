package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides client functionality for the Paste From Word dialog within the ASPxHtmlEditor.
  */
trait ASPxClientHtmlEditorPasteFromWordDialog
  extends StObject
     with ASPxClientHtmlEditorDialogBase {
  
  /**
    * Provides access to the client object of the "Remove font family" check box in the Html Editor's Flash dialog.
    */
  def GetRemoveFontFamilyCheckBox(): ASPxClientCheckBox
}
object ASPxClientHtmlEditorPasteFromWordDialog {
  
  inline def apply(
    GetCancelButton: CallbackTo[ASPxClientButton],
    GetFormLayout: CallbackTo[ASPxClientFormLayout],
    GetOkButton: CallbackTo[ASPxClientButton],
    GetRemoveFontFamilyCheckBox: CallbackTo[ASPxClientCheckBox]
  ): ASPxClientHtmlEditorPasteFromWordDialog = {
    val __obj = js.Dynamic.literal(GetCancelButton = GetCancelButton.toJsFn, GetFormLayout = GetFormLayout.toJsFn, GetOkButton = GetOkButton.toJsFn, GetRemoveFontFamilyCheckBox = GetRemoveFontFamilyCheckBox.toJsFn)
    __obj.asInstanceOf[ASPxClientHtmlEditorPasteFromWordDialog]
  }
  
  extension [Self <: ASPxClientHtmlEditorPasteFromWordDialog](x: Self) {
    
    inline def setGetRemoveFontFamilyCheckBox(value: CallbackTo[ASPxClientCheckBox]): Self = StObject.set(x, "GetRemoveFontFamilyCheckBox", value.toJsFn)
  }
}
