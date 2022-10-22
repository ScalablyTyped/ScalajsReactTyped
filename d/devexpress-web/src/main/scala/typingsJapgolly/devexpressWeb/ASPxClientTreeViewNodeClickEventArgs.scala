package typingsJapgolly.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientTreeView.NodeClick event.
  */
trait ASPxClientTreeViewNodeClickEventArgs
  extends StObject
     with ASPxClientTreeViewNodeProcessingModeEventArgs {
  
  /**
    * Gets the HTML object that contains the processed node.
    */
  var htmlElement: Any
  
  /**
    * Gets a DHTML event object that relates to the processed event.
    */
  var htmlEvent: Any
}
object ASPxClientTreeViewNodeClickEventArgs {
  
  inline def apply(htmlElement: Any, htmlEvent: Any, node: ASPxClientTreeViewNode, processOnServer: Boolean): ASPxClientTreeViewNodeClickEventArgs = {
    val __obj = js.Dynamic.literal(htmlElement = htmlElement.asInstanceOf[js.Any], htmlEvent = htmlEvent.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientTreeViewNodeClickEventArgs]
  }
  
  extension [Self <: ASPxClientTreeViewNodeClickEventArgs](x: Self) {
    
    inline def setHtmlElement(value: Any): Self = StObject.set(x, "htmlElement", value.asInstanceOf[js.Any])
    
    inline def setHtmlEvent(value: Any): Self = StObject.set(x, "htmlEvent", value.asInstanceOf[js.Any])
  }
}
