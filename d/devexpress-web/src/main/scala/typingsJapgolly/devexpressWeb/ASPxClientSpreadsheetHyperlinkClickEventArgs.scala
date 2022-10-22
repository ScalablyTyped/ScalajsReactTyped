package typingsJapgolly.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientSpreadsheet.HyperlinkClick event.
  */
trait ASPxClientSpreadsheetHyperlinkClickEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Gets or sets a value that specifies whether the event is handled, and the default processing is not required.
    */
  var handled: Boolean
  
  /**
    * Gets a DHTML event object that relates to the processed event.
    */
  var htmlEvent: Any
  
  /**
    * Gets a value identifying the clicked hyperlink type.
    */
  var hyperlinkType: ASPxClientOfficeDocumentLinkType
  
  /**
    * Gets the clicked link's URI.
    */
  var targetUri: String
}
object ASPxClientSpreadsheetHyperlinkClickEventArgs {
  
  inline def apply(
    handled: Boolean,
    htmlEvent: Any,
    hyperlinkType: ASPxClientOfficeDocumentLinkType,
    targetUri: String
  ): ASPxClientSpreadsheetHyperlinkClickEventArgs = {
    val __obj = js.Dynamic.literal(handled = handled.asInstanceOf[js.Any], htmlEvent = htmlEvent.asInstanceOf[js.Any], hyperlinkType = hyperlinkType.asInstanceOf[js.Any], targetUri = targetUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientSpreadsheetHyperlinkClickEventArgs]
  }
  
  extension [Self <: ASPxClientSpreadsheetHyperlinkClickEventArgs](x: Self) {
    
    inline def setHandled(value: Boolean): Self = StObject.set(x, "handled", value.asInstanceOf[js.Any])
    
    inline def setHtmlEvent(value: Any): Self = StObject.set(x, "htmlEvent", value.asInstanceOf[js.Any])
    
    inline def setHyperlinkType(value: ASPxClientOfficeDocumentLinkType): Self = StObject.set(x, "hyperlinkType", value.asInstanceOf[js.Any])
    
    inline def setTargetUri(value: String): Self = StObject.set(x, "targetUri", value.asInstanceOf[js.Any])
  }
}
