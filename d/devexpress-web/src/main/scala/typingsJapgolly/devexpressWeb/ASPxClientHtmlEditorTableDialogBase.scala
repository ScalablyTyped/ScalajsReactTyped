package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides base client functionality for the Table dialog within the ASPxHtmlEditor.
  */
trait ASPxClientHtmlEditorTableDialogBase
  extends StObject
     with ASPxClientHtmlEditorDialogBase {
  
  /**
    * Provides access to the client object of the "Background color" color editor in the Html Editor's Table dialogs.
    */
  def GetBackgroundColorColorEdit(): ASPxClientColorEdit
}
object ASPxClientHtmlEditorTableDialogBase {
  
  inline def apply(
    GetBackgroundColorColorEdit: CallbackTo[ASPxClientColorEdit],
    GetCancelButton: CallbackTo[ASPxClientButton],
    GetFormLayout: CallbackTo[ASPxClientFormLayout],
    GetOkButton: CallbackTo[ASPxClientButton]
  ): ASPxClientHtmlEditorTableDialogBase = {
    val __obj = js.Dynamic.literal(GetBackgroundColorColorEdit = GetBackgroundColorColorEdit.toJsFn, GetCancelButton = GetCancelButton.toJsFn, GetFormLayout = GetFormLayout.toJsFn, GetOkButton = GetOkButton.toJsFn)
    __obj.asInstanceOf[ASPxClientHtmlEditorTableDialogBase]
  }
  
  extension [Self <: ASPxClientHtmlEditorTableDialogBase](x: Self) {
    
    inline def setGetBackgroundColorColorEdit(value: CallbackTo[ASPxClientColorEdit]): Self = StObject.set(x, "GetBackgroundColorColorEdit", value.toJsFn)
  }
}
