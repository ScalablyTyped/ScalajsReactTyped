package typingsJapgolly.kendoUi.kendo.mobile.ui

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewOptions extends StObject {
  
  var afterShow: js.UndefOr[js.Function1[/* e */ ViewAfterShowEvent, Unit]] = js.undefined
  
  var beforeHide: js.UndefOr[js.Function1[/* e */ ViewBeforeHideEvent, Unit]] = js.undefined
  
  var beforeShow: js.UndefOr[js.Function1[/* e */ ViewBeforeShowEvent, Unit]] = js.undefined
  
  var hide: js.UndefOr[js.Function1[/* e */ ViewHideEvent, Unit]] = js.undefined
  
  var init: js.UndefOr[js.Function1[/* e */ ViewInitEvent, Unit]] = js.undefined
  
  var model: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var reload: js.UndefOr[Boolean] = js.undefined
  
  var scroller: js.UndefOr[Any] = js.undefined
  
  var show: js.UndefOr[js.Function1[/* e */ ViewShowEvent, Unit]] = js.undefined
  
  var stretch: js.UndefOr[Boolean] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var transitionEnd: js.UndefOr[js.Function1[/* e */ ViewTransitionEndEvent, Unit]] = js.undefined
  
  var transitionStart: js.UndefOr[js.Function1[/* e */ ViewTransitionStartEvent, Unit]] = js.undefined
  
  var useNativeScrolling: js.UndefOr[Boolean] = js.undefined
  
  var zoom: js.UndefOr[Boolean] = js.undefined
}
object ViewOptions {
  
  inline def apply(): ViewOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewOptions]
  }
  
  extension [Self <: ViewOptions](x: Self) {
    
    inline def setAfterShow(value: /* e */ ViewAfterShowEvent => Callback): Self = StObject.set(x, "afterShow", js.Any.fromFunction1((t0: /* e */ ViewAfterShowEvent) => value(t0).runNow()))
    
    inline def setAfterShowUndefined: Self = StObject.set(x, "afterShow", js.undefined)
    
    inline def setBeforeHide(value: /* e */ ViewBeforeHideEvent => Callback): Self = StObject.set(x, "beforeHide", js.Any.fromFunction1((t0: /* e */ ViewBeforeHideEvent) => value(t0).runNow()))
    
    inline def setBeforeHideUndefined: Self = StObject.set(x, "beforeHide", js.undefined)
    
    inline def setBeforeShow(value: /* e */ ViewBeforeShowEvent => Callback): Self = StObject.set(x, "beforeShow", js.Any.fromFunction1((t0: /* e */ ViewBeforeShowEvent) => value(t0).runNow()))
    
    inline def setBeforeShowUndefined: Self = StObject.set(x, "beforeShow", js.undefined)
    
    inline def setHide(value: /* e */ ViewHideEvent => Callback): Self = StObject.set(x, "hide", js.Any.fromFunction1((t0: /* e */ ViewHideEvent) => value(t0).runNow()))
    
    inline def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
    
    inline def setInit(value: /* e */ ViewInitEvent => Callback): Self = StObject.set(x, "init", js.Any.fromFunction1((t0: /* e */ ViewInitEvent) => value(t0).runNow()))
    
    inline def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
    
    inline def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setReload(value: Boolean): Self = StObject.set(x, "reload", value.asInstanceOf[js.Any])
    
    inline def setReloadUndefined: Self = StObject.set(x, "reload", js.undefined)
    
    inline def setScroller(value: Any): Self = StObject.set(x, "scroller", value.asInstanceOf[js.Any])
    
    inline def setScrollerUndefined: Self = StObject.set(x, "scroller", js.undefined)
    
    inline def setShow(value: /* e */ ViewShowEvent => Callback): Self = StObject.set(x, "show", js.Any.fromFunction1((t0: /* e */ ViewShowEvent) => value(t0).runNow()))
    
    inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    inline def setStretch(value: Boolean): Self = StObject.set(x, "stretch", value.asInstanceOf[js.Any])
    
    inline def setStretchUndefined: Self = StObject.set(x, "stretch", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTransitionEnd(value: /* e */ ViewTransitionEndEvent => Callback): Self = StObject.set(x, "transitionEnd", js.Any.fromFunction1((t0: /* e */ ViewTransitionEndEvent) => value(t0).runNow()))
    
    inline def setTransitionEndUndefined: Self = StObject.set(x, "transitionEnd", js.undefined)
    
    inline def setTransitionStart(value: /* e */ ViewTransitionStartEvent => Callback): Self = StObject.set(x, "transitionStart", js.Any.fromFunction1((t0: /* e */ ViewTransitionStartEvent) => value(t0).runNow()))
    
    inline def setTransitionStartUndefined: Self = StObject.set(x, "transitionStart", js.undefined)
    
    inline def setUseNativeScrolling(value: Boolean): Self = StObject.set(x, "useNativeScrolling", value.asInstanceOf[js.Any])
    
    inline def setUseNativeScrollingUndefined: Self = StObject.set(x, "useNativeScrolling", js.undefined)
    
    inline def setZoom(value: Boolean): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    
    inline def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
  }
}
