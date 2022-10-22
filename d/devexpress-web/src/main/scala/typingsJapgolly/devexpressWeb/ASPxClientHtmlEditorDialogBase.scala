package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides client functionality for dialogs within the  ASPxHtmlEditor.
  */
trait ASPxClientHtmlEditorDialogBase extends StObject {
  
  /**
    * Provides access to the client object of the "Cancel" button in the Html Editor's dialogs.
    */
  def GetCancelButton(): ASPxClientButton
  
  /**
    * Provides access to the client ASPxFormLayout object that arranges all editors in the Html Editor's dialogs.
    */
  def GetFormLayout(): ASPxClientFormLayout
  
  /**
    * Provides access to the client object of the "OK" button in the Html Editor's dialogs.
    */
  def GetOkButton(): ASPxClientButton
}
object ASPxClientHtmlEditorDialogBase {
  
  inline def apply(
    GetCancelButton: CallbackTo[ASPxClientButton],
    GetFormLayout: CallbackTo[ASPxClientFormLayout],
    GetOkButton: CallbackTo[ASPxClientButton]
  ): ASPxClientHtmlEditorDialogBase = {
    val __obj = js.Dynamic.literal(GetCancelButton = GetCancelButton.toJsFn, GetFormLayout = GetFormLayout.toJsFn, GetOkButton = GetOkButton.toJsFn)
    __obj.asInstanceOf[ASPxClientHtmlEditorDialogBase]
  }
  
  extension [Self <: ASPxClientHtmlEditorDialogBase](x: Self) {
    
    inline def setGetCancelButton(value: CallbackTo[ASPxClientButton]): Self = StObject.set(x, "GetCancelButton", value.toJsFn)
    
    inline def setGetFormLayout(value: CallbackTo[ASPxClientFormLayout]): Self = StObject.set(x, "GetFormLayout", value.toJsFn)
    
    inline def setGetOkButton(value: CallbackTo[ASPxClientButton]): Self = StObject.set(x, "GetOkButton", value.toJsFn)
  }
}
