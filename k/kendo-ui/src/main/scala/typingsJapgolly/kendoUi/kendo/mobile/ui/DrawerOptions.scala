package typingsJapgolly.kendoUi.kendo.mobile.ui

import japgolly.scalajs.react.Callback
import typingsJapgolly.kendoUi.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DrawerOptions extends StObject {
  
  var afterHide: js.UndefOr[js.Function1[/* e */ DrawerAfterHideEvent, Unit]] = js.undefined
  
  var beforeShow: js.UndefOr[js.Function1[/* e */ DrawerEvent, Unit]] = js.undefined
  
  var container: js.UndefOr[JQuery] = js.undefined
  
  var hide: js.UndefOr[js.Function1[/* e */ DrawerHideEvent, Unit]] = js.undefined
  
  var init: js.UndefOr[js.Function1[/* e */ DrawerInitEvent, Unit]] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var position: js.UndefOr[String] = js.undefined
  
  var show: js.UndefOr[js.Function1[/* e */ DrawerShowEvent, Unit]] = js.undefined
  
  var swipeToOpen: js.UndefOr[Boolean] = js.undefined
  
  var swipeToOpenViews: js.UndefOr[Any] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var views: js.UndefOr[Any] = js.undefined
}
object DrawerOptions {
  
  inline def apply(): DrawerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DrawerOptions]
  }
  
  extension [Self <: DrawerOptions](x: Self) {
    
    inline def setAfterHide(value: /* e */ DrawerAfterHideEvent => Callback): Self = StObject.set(x, "afterHide", js.Any.fromFunction1((t0: /* e */ DrawerAfterHideEvent) => value(t0).runNow()))
    
    inline def setAfterHideUndefined: Self = StObject.set(x, "afterHide", js.undefined)
    
    inline def setBeforeShow(value: /* e */ DrawerEvent => Callback): Self = StObject.set(x, "beforeShow", js.Any.fromFunction1((t0: /* e */ DrawerEvent) => value(t0).runNow()))
    
    inline def setBeforeShowUndefined: Self = StObject.set(x, "beforeShow", js.undefined)
    
    inline def setContainer(value: JQuery): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setHide(value: /* e */ DrawerHideEvent => Callback): Self = StObject.set(x, "hide", js.Any.fromFunction1((t0: /* e */ DrawerHideEvent) => value(t0).runNow()))
    
    inline def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
    
    inline def setInit(value: /* e */ DrawerInitEvent => Callback): Self = StObject.set(x, "init", js.Any.fromFunction1((t0: /* e */ DrawerInitEvent) => value(t0).runNow()))
    
    inline def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setShow(value: /* e */ DrawerShowEvent => Callback): Self = StObject.set(x, "show", js.Any.fromFunction1((t0: /* e */ DrawerShowEvent) => value(t0).runNow()))
    
    inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    inline def setSwipeToOpen(value: Boolean): Self = StObject.set(x, "swipeToOpen", value.asInstanceOf[js.Any])
    
    inline def setSwipeToOpenUndefined: Self = StObject.set(x, "swipeToOpen", js.undefined)
    
    inline def setSwipeToOpenViews(value: Any): Self = StObject.set(x, "swipeToOpenViews", value.asInstanceOf[js.Any])
    
    inline def setSwipeToOpenViewsUndefined: Self = StObject.set(x, "swipeToOpenViews", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setViews(value: Any): Self = StObject.set(x, "views", value.asInstanceOf[js.Any])
    
    inline def setViewsUndefined: Self = StObject.set(x, "views", js.undefined)
  }
}
