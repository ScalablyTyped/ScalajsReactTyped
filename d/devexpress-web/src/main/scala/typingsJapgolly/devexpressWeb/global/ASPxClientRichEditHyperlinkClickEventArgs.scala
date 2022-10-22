package typingsJapgolly.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientRichEdit.HyperlinkClick event.
  */
@JSGlobal("ASPxClientRichEditHyperlinkClickEventArgs")
@js.native
open class ASPxClientRichEditHyperlinkClickEventArgs protected ()
  extends StObject
     with typingsJapgolly.devexpressWeb.ASPxClientRichEditHyperlinkClickEventArgs {
  /**
    * Initializes a new instance of the ASPxClientRichEditHyperlinkClickEventArgs object. For internal use only.
    * @param htmlEvent A DHTML event object that relates to the processed event.
    * @param handled true if the event is handled and no default processing is required; otherwise false.
    * @param targetUri The target URI.
    * @param hyperlinkType The document link type.
    */
  def this(
    htmlEvent: Any,
    handled: Boolean,
    targetUri: String,
    hyperlinkType: typingsJapgolly.devexpressWeb.ASPxClientOfficeDocumentLinkType
  ) = this()
  
  /**
    * Gets or sets whether the event is handled manually, so no default processing is required.
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
