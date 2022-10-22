package typingsJapgolly.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientSpreadsheet.HyperlinkClick event.
  */
@JSGlobal("ASPxClientSpreadsheetHyperlinkClickEventArgs")
@js.native
open class ASPxClientSpreadsheetHyperlinkClickEventArgs protected ()
  extends StObject
     with typingsJapgolly.devexpressWeb.ASPxClientSpreadsheetHyperlinkClickEventArgs {
  /**
    * Initializes a new instance of the ASPxClientSpreadsheetHyperlinkClickEventArgs object. For internal use only.
    * @param htmlEvent A DHTML event object that relates to the processed event.
    * @param handled true if the event is handled and no default processing is required; otherwise false.
    * @param hyperlinkType One of the ASPxClientOfficeDocumentLinkType values.
    * @param targetUri A sting value specifying the link's URI.
    */
  def this(
    htmlEvent: Any,
    handled: Boolean,
    hyperlinkType: typingsJapgolly.devexpressWeb.ASPxClientOfficeDocumentLinkType,
    targetUri: String
  ) = this()
  
  /**
    * Gets or sets a value that specifies whether the event is handled, and the default processing is not required.
    */
  /* CompleteClass */
  var handled: Boolean = js.native
  
  /**
    * Gets a DHTML event object that relates to the processed event.
    */
  /* CompleteClass */
  var htmlEvent: Any = js.native
  
  /**
    * Gets a value identifying the clicked hyperlink type.
    */
  /* CompleteClass */
  var hyperlinkType: typingsJapgolly.devexpressWeb.ASPxClientOfficeDocumentLinkType = js.native
  
  /**
    * Gets the clicked link's URI.
    */
  /* CompleteClass */
  var targetUri: String = js.native
}
