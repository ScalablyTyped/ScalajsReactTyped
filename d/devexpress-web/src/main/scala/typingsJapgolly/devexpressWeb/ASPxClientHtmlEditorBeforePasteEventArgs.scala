package typingsJapgolly.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientHtmlEditor.BeforePaste event.
  */
@JSGlobal("ASPxClientHtmlEditorBeforePasteEventArgs")
@js.native
class ASPxClientHtmlEditorBeforePasteEventArgs protected () extends ASPxClientEventArgs {
  /**
    * Initialize a new instance of the ASPxClientHtmlEditorBeforePasteEventArgs class with the specified settings.
    * @param commandName A string value identifying the command's name.
    * @param html A string value that specifies the HTML content to paste.
    */
  def this(commandName: String, html: String) = this()
  /**
    * Gets the name of the processed command.
    */
  var commandName: String = js.native
  /**
    * Gets or sets the HTML markup that is about to be pasted to the ASPxHtmlEditor's content.
    */
  var html: String = js.native
}

