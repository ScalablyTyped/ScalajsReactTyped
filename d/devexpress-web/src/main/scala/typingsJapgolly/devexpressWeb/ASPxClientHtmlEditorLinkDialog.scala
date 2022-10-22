package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides client functionality for the Link dialog within the ASPxHtmlEditor.
  */
trait ASPxClientHtmlEditorLinkDialog
  extends StObject
     with ASPxClientHtmlEditorDialogBase {
  
  /**
    * Provides access to the client object of the "E-mail to" text box in the Html Editor's Link dialog.
    */
  def GetEmailTextBox(): ASPxClientTextBox
  
  /**
    * Provides access to the client object of the file manager used in the Link dialog's "Select Document" popup window.
    */
  def GetFileManager(): ASPxClientFileManager
  
  /**
    * Provides access to the client radio button list object used to specify the link type in the Html Editor's Link dialog.
    */
  def GetLinkTypeRadioButtonList(): ASPxClientRadioButtonList
  
  /**
    * Provides access to the client object of the "Open in new window" check box in the Html Editor's Link dialog.
    */
  def GetOpenInNewWindowCheckBox(): ASPxClientCheckBox
  
  /**
    * Provides access to the client object of the "Cancel" button in the Link dialog's "Select Document" popup window.
    */
  def GetSelectDocumentPopupCancelButton(): ASPxClientButton
  
  /**
    * Provides access to the client popup control object that is the "Select Document" popup window in the Html Editor's Link dialog.
    */
  def GetSelectDocumentPopupControl(): ASPxClientPopupControl
  
  /**
    * Provides access to the client object of the "Select" button in the Link dialog's "Select Document" popup window.
    */
  def GetSelectDocumentPopupSelectButton(): ASPxClientButton
  
  /**
    * Provides access to the client object of the "Subject" text box in the Html Editor's Link dialog.
    */
  def GetSubjectTextBox(): ASPxClientTextBox
  
  /**
    * Provides access to the client object of the "Text" text box in the Html Editor's Link dialog.
    */
  def GetTextTextBox(): ASPxClientTextBox
  
  /**
    * Provides access to the client object of the "ToolTip" text box in the Html Editor's Link dialog.
    */
  def GetTooltipTextBox(): ASPxClientTextBox
  
  /**
    * Provides access to the client object of the "URL" text box in the Html Editor's Link dialog.
    */
  def GetUrlTextBox(): ASPxClientTextBox
}
object ASPxClientHtmlEditorLinkDialog {
  
  inline def apply(
    GetCancelButton: CallbackTo[ASPxClientButton],
    GetEmailTextBox: CallbackTo[ASPxClientTextBox],
    GetFileManager: CallbackTo[ASPxClientFileManager],
    GetFormLayout: CallbackTo[ASPxClientFormLayout],
    GetLinkTypeRadioButtonList: CallbackTo[ASPxClientRadioButtonList],
    GetOkButton: CallbackTo[ASPxClientButton],
    GetOpenInNewWindowCheckBox: CallbackTo[ASPxClientCheckBox],
    GetSelectDocumentPopupCancelButton: CallbackTo[ASPxClientButton],
    GetSelectDocumentPopupControl: CallbackTo[ASPxClientPopupControl],
    GetSelectDocumentPopupSelectButton: CallbackTo[ASPxClientButton],
    GetSubjectTextBox: CallbackTo[ASPxClientTextBox],
    GetTextTextBox: CallbackTo[ASPxClientTextBox],
    GetTooltipTextBox: CallbackTo[ASPxClientTextBox],
    GetUrlTextBox: CallbackTo[ASPxClientTextBox]
  ): ASPxClientHtmlEditorLinkDialog = {
    val __obj = js.Dynamic.literal(GetCancelButton = GetCancelButton.toJsFn, GetEmailTextBox = GetEmailTextBox.toJsFn, GetFileManager = GetFileManager.toJsFn, GetFormLayout = GetFormLayout.toJsFn, GetLinkTypeRadioButtonList = GetLinkTypeRadioButtonList.toJsFn, GetOkButton = GetOkButton.toJsFn, GetOpenInNewWindowCheckBox = GetOpenInNewWindowCheckBox.toJsFn, GetSelectDocumentPopupCancelButton = GetSelectDocumentPopupCancelButton.toJsFn, GetSelectDocumentPopupControl = GetSelectDocumentPopupControl.toJsFn, GetSelectDocumentPopupSelectButton = GetSelectDocumentPopupSelectButton.toJsFn, GetSubjectTextBox = GetSubjectTextBox.toJsFn, GetTextTextBox = GetTextTextBox.toJsFn, GetTooltipTextBox = GetTooltipTextBox.toJsFn, GetUrlTextBox = GetUrlTextBox.toJsFn)
    __obj.asInstanceOf[ASPxClientHtmlEditorLinkDialog]
  }
  
  extension [Self <: ASPxClientHtmlEditorLinkDialog](x: Self) {
    
    inline def setGetEmailTextBox(value: CallbackTo[ASPxClientTextBox]): Self = StObject.set(x, "GetEmailTextBox", value.toJsFn)
    
    inline def setGetFileManager(value: CallbackTo[ASPxClientFileManager]): Self = StObject.set(x, "GetFileManager", value.toJsFn)
    
    inline def setGetLinkTypeRadioButtonList(value: CallbackTo[ASPxClientRadioButtonList]): Self = StObject.set(x, "GetLinkTypeRadioButtonList", value.toJsFn)
    
    inline def setGetOpenInNewWindowCheckBox(value: CallbackTo[ASPxClientCheckBox]): Self = StObject.set(x, "GetOpenInNewWindowCheckBox", value.toJsFn)
    
    inline def setGetSelectDocumentPopupCancelButton(value: CallbackTo[ASPxClientButton]): Self = StObject.set(x, "GetSelectDocumentPopupCancelButton", value.toJsFn)
    
    inline def setGetSelectDocumentPopupControl(value: CallbackTo[ASPxClientPopupControl]): Self = StObject.set(x, "GetSelectDocumentPopupControl", value.toJsFn)
    
    inline def setGetSelectDocumentPopupSelectButton(value: CallbackTo[ASPxClientButton]): Self = StObject.set(x, "GetSelectDocumentPopupSelectButton", value.toJsFn)
    
    inline def setGetSubjectTextBox(value: CallbackTo[ASPxClientTextBox]): Self = StObject.set(x, "GetSubjectTextBox", value.toJsFn)
    
    inline def setGetTextTextBox(value: CallbackTo[ASPxClientTextBox]): Self = StObject.set(x, "GetTextTextBox", value.toJsFn)
    
    inline def setGetTooltipTextBox(value: CallbackTo[ASPxClientTextBox]): Self = StObject.set(x, "GetTooltipTextBox", value.toJsFn)
    
    inline def setGetUrlTextBox(value: CallbackTo[ASPxClientTextBox]): Self = StObject.set(x, "GetUrlTextBox", value.toJsFn)
  }
}
