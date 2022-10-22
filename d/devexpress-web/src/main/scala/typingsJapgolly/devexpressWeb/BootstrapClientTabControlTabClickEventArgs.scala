package typingsJapgolly.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for events related to clicking on the control's tabs.
  */
trait BootstrapClientTabControlTabClickEventArgs
  extends StObject
     with BootstrapClientTabControlTabCancelEventArgs {
  
  /**
    * Gets an HTML object that contains the processed tab.
    */
  var htmlElement: Any
  
  /**
    * Gets a DHTML event object that relates to the processed event.
    */
  var htmlEvent: Any
}
object BootstrapClientTabControlTabClickEventArgs {
  
  inline def apply(
    cancel: Boolean,
    htmlElement: Any,
    htmlEvent: Any,
    processOnServer: Boolean,
    reloadContentOnCallback: Boolean,
    tab: BootstrapClientTab
  ): BootstrapClientTabControlTabClickEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], htmlElement = htmlElement.asInstanceOf[js.Any], htmlEvent = htmlEvent.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any], reloadContentOnCallback = reloadContentOnCallback.asInstanceOf[js.Any], tab = tab.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapClientTabControlTabClickEventArgs]
  }
  
  extension [Self <: BootstrapClientTabControlTabClickEventArgs](x: Self) {
    
    inline def setHtmlElement(value: Any): Self = StObject.set(x, "htmlElement", value.asInstanceOf[js.Any])
    
    inline def setHtmlEvent(value: Any): Self = StObject.set(x, "htmlEvent", value.asInstanceOf[js.Any])
  }
}
