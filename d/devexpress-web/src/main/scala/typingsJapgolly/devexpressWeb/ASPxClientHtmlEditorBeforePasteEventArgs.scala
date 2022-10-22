package typingsJapgolly.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientHtmlEditor.BeforePaste event.
  */
trait ASPxClientHtmlEditorBeforePasteEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Gets the name of the processed command.
    */
  var commandName: String
  
  /**
    * Gets or sets the HTML markup that is about to be pasted to the ASPxHtmlEditor's content.
    */
  var html: String
}
object ASPxClientHtmlEditorBeforePasteEventArgs {
  
  inline def apply(commandName: String, html: String): ASPxClientHtmlEditorBeforePasteEventArgs = {
    val __obj = js.Dynamic.literal(commandName = commandName.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientHtmlEditorBeforePasteEventArgs]
  }
  
  extension [Self <: ASPxClientHtmlEditorBeforePasteEventArgs](x: Self) {
    
    inline def setCommandName(value: String): Self = StObject.set(x, "commandName", value.asInstanceOf[js.Any])
    
    inline def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
  }
}
