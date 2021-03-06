package typingsJapgolly.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for client events that relate to closing a custom dialog.
  */
@JSGlobal("ASPxClientHtmlEditorCustomDialogCloseEventArgsBase")
@js.native
class ASPxClientHtmlEditorCustomDialogCloseEventArgsBase protected () extends ASPxClientHtmlEditorCustomDialogEventArgs {
  /**
    * Initializes a new instance of the ASPxClientHtmlEditorCustomDialogCloseEventArgsBase class with the specified settings.
    * @param name A string value that specifies the custom dialog's name. This value is assigned to the ASPxClientHtmlEditorCustomDialogEventArgs.name property.
    * @param status An object that specifies a status that is returned to the parent control when the custom dialog is closed. This value is assigned to the ASPxClientHtmlEditorCustomDialogCloseEventArgsBase.status property.
    */
  def this(name: String, status: js.Any) = this()
  /**
    * Gets the status of the closed custom dialog.
    */
  var status: js.Any = js.native
}

