package typingsJapgolly.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BootstrapAccordionEventMap
  extends StObject
     with ControlEventMap {
  
  var beginCallback: BeginCallbackEventArgs
  
  var callbackError: CallbackErrorEventArgs
  
  var endCallback: EndCallbackEventArgs
  
  var expandedChanged: AccordionGroupEventArgs
  
  var expandedChanging: AccordionGroupCancelEventArgs
  
  var headerClick: AccordionGroupClickEventArgs
  
  var itemClick: AccordionItemEventArgs
}
object BootstrapAccordionEventMap {
  
  inline def apply(
    beginCallback: BeginCallbackEventArgs,
    callbackError: CallbackErrorEventArgs,
    endCallback: EndCallbackEventArgs,
    expandedChanged: AccordionGroupEventArgs,
    expandedChanging: AccordionGroupCancelEventArgs,
    headerClick: AccordionGroupClickEventArgs,
    init: EventArgs,
    itemClick: AccordionItemEventArgs
  ): BootstrapAccordionEventMap = {
    val __obj = js.Dynamic.literal(beginCallback = beginCallback.asInstanceOf[js.Any], callbackError = callbackError.asInstanceOf[js.Any], endCallback = endCallback.asInstanceOf[js.Any], expandedChanged = expandedChanged.asInstanceOf[js.Any], expandedChanging = expandedChanging.asInstanceOf[js.Any], headerClick = headerClick.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any], itemClick = itemClick.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapAccordionEventMap]
  }
  
  extension [Self <: BootstrapAccordionEventMap](x: Self) {
    
    inline def setBeginCallback(value: BeginCallbackEventArgs): Self = StObject.set(x, "beginCallback", value.asInstanceOf[js.Any])
    
    inline def setCallbackError(value: CallbackErrorEventArgs): Self = StObject.set(x, "callbackError", value.asInstanceOf[js.Any])
    
    inline def setEndCallback(value: EndCallbackEventArgs): Self = StObject.set(x, "endCallback", value.asInstanceOf[js.Any])
    
    inline def setExpandedChanged(value: AccordionGroupEventArgs): Self = StObject.set(x, "expandedChanged", value.asInstanceOf[js.Any])
    
    inline def setExpandedChanging(value: AccordionGroupCancelEventArgs): Self = StObject.set(x, "expandedChanging", value.asInstanceOf[js.Any])
    
    inline def setHeaderClick(value: AccordionGroupClickEventArgs): Self = StObject.set(x, "headerClick", value.asInstanceOf[js.Any])
    
    inline def setItemClick(value: AccordionItemEventArgs): Self = StObject.set(x, "itemClick", value.asInstanceOf[js.Any])
  }
}
