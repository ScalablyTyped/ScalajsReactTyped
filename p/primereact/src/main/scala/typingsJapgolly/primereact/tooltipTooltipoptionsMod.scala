package typingsJapgolly.primereact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import typingsJapgolly.primereact.primereactStrings.self
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tooltipTooltipoptionsMod {
  
  type TooltipAppendToType = js.UndefOr[self | HTMLElement | Null]
  
  trait TooltipEventParams extends StObject {
    
    var originalEvent: ReactEventFrom[Element]
    
    var target: HTMLElement
  }
  object TooltipEventParams {
    
    inline def apply(originalEvent: ReactEventFrom[Element], target: HTMLElement): TooltipEventParams = {
      val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[TooltipEventParams]
    }
    
    extension [Self <: TooltipEventParams](x: Self) {
      
      inline def setOriginalEvent(value: ReactEventFrom[Element]): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: HTMLElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.primereact.primereactStrings.hover
    - typingsJapgolly.primereact.primereactStrings.focus
    - typingsJapgolly.primereact.primereactStrings.both
  */
  trait TooltipEventType extends StObject
  object TooltipEventType {
    
    inline def both: typingsJapgolly.primereact.primereactStrings.both = "both".asInstanceOf[typingsJapgolly.primereact.primereactStrings.both]
    
    inline def focus: typingsJapgolly.primereact.primereactStrings.focus = "focus".asInstanceOf[typingsJapgolly.primereact.primereactStrings.focus]
    
    inline def hover: typingsJapgolly.primereact.primereactStrings.hover = "hover".asInstanceOf[typingsJapgolly.primereact.primereactStrings.hover]
  }
  
  trait TooltipOptions extends StObject {
    
    var appendTo: js.UndefOr[TooltipAppendToType] = js.undefined
    
    var at: js.UndefOr[String] = js.undefined
    
    var autoHide: js.UndefOr[Boolean] = js.undefined
    
    var autoZIndex: js.UndefOr[Boolean] = js.undefined
    
    var baseZIndex: js.UndefOr[Double] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var event: js.UndefOr[TooltipEventType] = js.undefined
    
    var hideDelay: js.UndefOr[Double] = js.undefined
    
    var hideEvent: js.UndefOr[String] = js.undefined
    
    var mouseTrack: js.UndefOr[Boolean] = js.undefined
    
    var mouseTrackLeft: js.UndefOr[Double] = js.undefined
    
    var mouseTrackTop: js.UndefOr[Double] = js.undefined
    
    var my: js.UndefOr[String] = js.undefined
    
    var onBeforeHide: js.UndefOr[js.Function1[/* e */ TooltipEventParams, Unit]] = js.undefined
    
    var onBeforeShow: js.UndefOr[js.Function1[/* e */ TooltipEventParams, Unit]] = js.undefined
    
    var onHide: js.UndefOr[js.Function1[/* e */ TooltipEventParams, Unit]] = js.undefined
    
    var onShow: js.UndefOr[js.Function1[/* e */ TooltipEventParams, Unit]] = js.undefined
    
    var position: js.UndefOr[TooltipPositionType] = js.undefined
    
    var showDelay: js.UndefOr[Double] = js.undefined
    
    var showEvent: js.UndefOr[String] = js.undefined
    
    var showOnDisabled: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[js.Object] = js.undefined
    
    var updateDelay: js.UndefOr[Double] = js.undefined
  }
  object TooltipOptions {
    
    inline def apply(): TooltipOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TooltipOptions]
    }
    
    extension [Self <: TooltipOptions](x: Self) {
      
      inline def setAppendTo(value: TooltipAppendToType): Self = StObject.set(x, "appendTo", value.asInstanceOf[js.Any])
      
      inline def setAppendToNull: Self = StObject.set(x, "appendTo", null)
      
      inline def setAppendToUndefined: Self = StObject.set(x, "appendTo", js.undefined)
      
      inline def setAt(value: String): Self = StObject.set(x, "at", value.asInstanceOf[js.Any])
      
      inline def setAtUndefined: Self = StObject.set(x, "at", js.undefined)
      
      inline def setAutoHide(value: Boolean): Self = StObject.set(x, "autoHide", value.asInstanceOf[js.Any])
      
      inline def setAutoHideUndefined: Self = StObject.set(x, "autoHide", js.undefined)
      
      inline def setAutoZIndex(value: Boolean): Self = StObject.set(x, "autoZIndex", value.asInstanceOf[js.Any])
      
      inline def setAutoZIndexUndefined: Self = StObject.set(x, "autoZIndex", js.undefined)
      
      inline def setBaseZIndex(value: Double): Self = StObject.set(x, "baseZIndex", value.asInstanceOf[js.Any])
      
      inline def setBaseZIndexUndefined: Self = StObject.set(x, "baseZIndex", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setEvent(value: TooltipEventType): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      inline def setHideDelay(value: Double): Self = StObject.set(x, "hideDelay", value.asInstanceOf[js.Any])
      
      inline def setHideDelayUndefined: Self = StObject.set(x, "hideDelay", js.undefined)
      
      inline def setHideEvent(value: String): Self = StObject.set(x, "hideEvent", value.asInstanceOf[js.Any])
      
      inline def setHideEventUndefined: Self = StObject.set(x, "hideEvent", js.undefined)
      
      inline def setMouseTrack(value: Boolean): Self = StObject.set(x, "mouseTrack", value.asInstanceOf[js.Any])
      
      inline def setMouseTrackLeft(value: Double): Self = StObject.set(x, "mouseTrackLeft", value.asInstanceOf[js.Any])
      
      inline def setMouseTrackLeftUndefined: Self = StObject.set(x, "mouseTrackLeft", js.undefined)
      
      inline def setMouseTrackTop(value: Double): Self = StObject.set(x, "mouseTrackTop", value.asInstanceOf[js.Any])
      
      inline def setMouseTrackTopUndefined: Self = StObject.set(x, "mouseTrackTop", js.undefined)
      
      inline def setMouseTrackUndefined: Self = StObject.set(x, "mouseTrack", js.undefined)
      
      inline def setMy(value: String): Self = StObject.set(x, "my", value.asInstanceOf[js.Any])
      
      inline def setMyUndefined: Self = StObject.set(x, "my", js.undefined)
      
      inline def setOnBeforeHide(value: /* e */ TooltipEventParams => Callback): Self = StObject.set(x, "onBeforeHide", js.Any.fromFunction1((t0: /* e */ TooltipEventParams) => value(t0).runNow()))
      
      inline def setOnBeforeHideUndefined: Self = StObject.set(x, "onBeforeHide", js.undefined)
      
      inline def setOnBeforeShow(value: /* e */ TooltipEventParams => Callback): Self = StObject.set(x, "onBeforeShow", js.Any.fromFunction1((t0: /* e */ TooltipEventParams) => value(t0).runNow()))
      
      inline def setOnBeforeShowUndefined: Self = StObject.set(x, "onBeforeShow", js.undefined)
      
      inline def setOnHide(value: /* e */ TooltipEventParams => Callback): Self = StObject.set(x, "onHide", js.Any.fromFunction1((t0: /* e */ TooltipEventParams) => value(t0).runNow()))
      
      inline def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
      
      inline def setOnShow(value: /* e */ TooltipEventParams => Callback): Self = StObject.set(x, "onShow", js.Any.fromFunction1((t0: /* e */ TooltipEventParams) => value(t0).runNow()))
      
      inline def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
      
      inline def setPosition(value: TooltipPositionType): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setShowDelay(value: Double): Self = StObject.set(x, "showDelay", value.asInstanceOf[js.Any])
      
      inline def setShowDelayUndefined: Self = StObject.set(x, "showDelay", js.undefined)
      
      inline def setShowEvent(value: String): Self = StObject.set(x, "showEvent", value.asInstanceOf[js.Any])
      
      inline def setShowEventUndefined: Self = StObject.set(x, "showEvent", js.undefined)
      
      inline def setShowOnDisabled(value: Boolean): Self = StObject.set(x, "showOnDisabled", value.asInstanceOf[js.Any])
      
      inline def setShowOnDisabledUndefined: Self = StObject.set(x, "showOnDisabled", js.undefined)
      
      inline def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setUpdateDelay(value: Double): Self = StObject.set(x, "updateDelay", value.asInstanceOf[js.Any])
      
      inline def setUpdateDelayUndefined: Self = StObject.set(x, "updateDelay", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.primereact.primereactStrings.top
    - typingsJapgolly.primereact.primereactStrings.bottom
    - typingsJapgolly.primereact.primereactStrings.left
    - typingsJapgolly.primereact.primereactStrings.right
  */
  trait TooltipPositionType extends StObject
  object TooltipPositionType {
    
    inline def bottom: typingsJapgolly.primereact.primereactStrings.bottom = "bottom".asInstanceOf[typingsJapgolly.primereact.primereactStrings.bottom]
    
    inline def left: typingsJapgolly.primereact.primereactStrings.left = "left".asInstanceOf[typingsJapgolly.primereact.primereactStrings.left]
    
    inline def right: typingsJapgolly.primereact.primereactStrings.right = "right".asInstanceOf[typingsJapgolly.primereact.primereactStrings.right]
    
    inline def top: typingsJapgolly.primereact.primereactStrings.top = "top".asInstanceOf[typingsJapgolly.primereact.primereactStrings.top]
  }
}
