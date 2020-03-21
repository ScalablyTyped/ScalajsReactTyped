package typingsJapgolly.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientSpreadsheet.HyperlinkClick event.
  */
@JSGlobal("ASPxClientSpreadsheetHyperlinkClickEventArgs")
@js.native
class ASPxClientSpreadsheetHyperlinkClickEventArgs protected () extends ASPxClientEventArgs {
  /**
    * Initializes a new instance of the ASPxClientSpreadsheetHyperlinkClickEventArgs object. For internal use only.
    * @param htmlEvent A DHTML event object that relates to the processed event.
    * @param handled true if the event is handled and no default processing is required; otherwise false.
    * @param hyperlinkType One of the ASPxClientOfficeDocumentLinkType values.
    * @param targetUri A sting value specifying the link's URI.
    */
  def this(
    htmlEvent: js.Any,
    handled: Boolean,
    hyperlinkType: ASPxClientOfficeDocumentLinkType,
    targetUri: String
  ) = this()
  /**
    * Gets or sets a value that specifies whether the event is handled, and the default processing is not required.
    */
  var handled: Boolean = js.native
  /**
    * Gets a DHTML event object that relates to the processed event.
    */
  var htmlEvent: js.Any = js.native
  /**
    * Gets a value identifying the clicked hyperlink type.
    */
  var hyperlinkType: ASPxClientOfficeDocumentLinkType = js.native
  /**
    * Gets the clicked link's URI.
    */
  var targetUri: String = js.native
}

