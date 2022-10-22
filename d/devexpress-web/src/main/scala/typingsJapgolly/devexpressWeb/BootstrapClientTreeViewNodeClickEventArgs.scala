package typingsJapgolly.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientTreeView.NodeClick event.
  */
trait BootstrapClientTreeViewNodeClickEventArgs
  extends StObject
     with BootstrapClientTreeViewNodeProcessingModeEventArgs {
  
  /**
    * Gets an HTML object that contains the processed Tree View node.
    */
  var htmlElement: Any
  
  /**
    * Gets a DHTML event object that relates to the processed event.
    */
  var htmlEvent: Any
}
object BootstrapClientTreeViewNodeClickEventArgs {
  
  inline def apply(htmlElement: Any, htmlEvent: Any, node: BootstrapClientTreeViewNode, processOnServer: Boolean): BootstrapClientTreeViewNodeClickEventArgs = {
    val __obj = js.Dynamic.literal(htmlElement = htmlElement.asInstanceOf[js.Any], htmlEvent = htmlEvent.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapClientTreeViewNodeClickEventArgs]
  }
  
  extension [Self <: BootstrapClientTreeViewNodeClickEventArgs](x: Self) {
    
    inline def setHtmlElement(value: Any): Self = StObject.set(x, "htmlElement", value.asInstanceOf[js.Any])
    
    inline def setHtmlEvent(value: Any): Self = StObject.set(x, "htmlEvent", value.asInstanceOf[js.Any])
  }
}
