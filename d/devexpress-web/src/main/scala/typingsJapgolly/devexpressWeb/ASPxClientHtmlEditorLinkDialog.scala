package typingsJapgolly.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides client functionality for the Link dialog within the ASPxHtmlEditor.
  */
@JSGlobal("ASPxClientHtmlEditorLinkDialog")
@js.native
class ASPxClientHtmlEditorLinkDialog () extends ASPxClientHtmlEditorDialogBase {
  /**
    * Provides access to the client object of the "E-mail to" text box in the Html Editor's Link dialog.
    */
  def GetEmailTextBox(): ASPxClientTextBox = js.native
  /**
    * Provides access to the client object of the file manager used in the Link dialog's "Select Document" popup window.
    */
  def GetFileManager(): ASPxClientFileManager = js.native
  /**
    * Provides access to the client radio button list object used to specify the link type in the Html Editor's Link dialog.
    */
  def GetLinkTypeRadioButtonList(): ASPxClientRadioButtonList = js.native
  /**
    * Provides access to the client object of the "Open in new window" check box in the Html Editor's Link dialog.
    */
  def GetOpenInNewWindowCheckBox(): ASPxClientCheckBox = js.native
  /**
    * Provides access to the client object of the "Cancel" button in the Link dialog's "Select Document" popup window.
    */
  def GetSelectDocumentPopupCancelButton(): ASPxClientButton = js.native
  /**
    * Provides access to the client popup control object that is the "Select Document" popup window in the Html Editor's Link dialog.
    */
  def GetSelectDocumentPopupControl(): ASPxClientPopupControl = js.native
  /**
    * Provides access to the client object of the "Select" button in the Link dialog's "Select Document" popup window.
    */
  def GetSelectDocumentPopupSelectButton(): ASPxClientButton = js.native
  /**
    * Provides access to the client object of the "Subject" text box in the Html Editor's Link dialog.
    */
  def GetSubjectTextBox(): ASPxClientTextBox = js.native
  /**
    * Provides access to the client object of the "Text" text box in the Html Editor's Link dialog.
    */
  def GetTextTextBox(): ASPxClientTextBox = js.native
  /**
    * Provides access to the client object of the "ToolTip" text box in the Html Editor's Link dialog.
    */
  def GetTooltipTextBox(): ASPxClientTextBox = js.native
  /**
    * Provides access to the client object of the "URL" text box in the Html Editor's Link dialog.
    */
  def GetUrlTextBox(): ASPxClientTextBox = js.native
}

