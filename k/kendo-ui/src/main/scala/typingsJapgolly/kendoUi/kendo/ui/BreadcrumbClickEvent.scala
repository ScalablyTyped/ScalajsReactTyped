package typingsJapgolly.kendoUi.kendo.ui

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BreadcrumbClickEvent
  extends StObject
     with BreadcrumbEvent {
  
  var isRoot: js.UndefOr[Boolean] = js.undefined
  
  var item: js.UndefOr[BreadcrumbItem] = js.undefined
  
  var originalEvent: js.UndefOr[Any] = js.undefined
}
object BreadcrumbClickEvent {
  
  inline def apply(isDefaultPrevented: CallbackTo[Boolean], preventDefault: js.Function, sender: Breadcrumb): BreadcrumbClickEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented.toJsFn, preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[BreadcrumbClickEvent]
  }
  
  extension [Self <: BreadcrumbClickEvent](x: Self) {
    
    inline def setIsRoot(value: Boolean): Self = StObject.set(x, "isRoot", value.asInstanceOf[js.Any])
    
    inline def setIsRootUndefined: Self = StObject.set(x, "isRoot", js.undefined)
    
    inline def setItem(value: BreadcrumbItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    inline def setOriginalEvent(value: Any): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
    
    inline def setOriginalEventUndefined: Self = StObject.set(x, "originalEvent", js.undefined)
  }
}
