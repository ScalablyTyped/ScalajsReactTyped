package typingsJapgolly.subscribeUiEvent

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Document
import org.scalajs.dom.EventTarget
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.TouchEvent
import org.scalajs.dom.UIEvent
import org.scalajs.dom.Window
import typingsJapgolly.std.AddEventListenerOptions
import typingsJapgolly.std.EventListenerOrEventListenerObject
import typingsJapgolly.subscribeUiEvent.anon.AxisIntention
import typingsJapgolly.subscribeUiEvent.anon.Delta
import typingsJapgolly.subscribeUiEvent.anon.Height
import typingsJapgolly.subscribeUiEvent.anon.Remove
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("subscribe-ui-event", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def listen(target: EventTarget, eventType: String, handler: EventListenerOrEventListenerObject): Remove = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(target.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Remove]
  inline def listen(
    target: EventTarget,
    eventType: String,
    handler: EventListenerOrEventListenerObject,
    options: AddEventListenerOptions
  ): Remove = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(target.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Remove]
  
  inline def subscribe[T /* <: UIEventType */](eventType: T, callback: TouchEventCallback[T] | UIEventCallback[T]): Subscription = (^.asInstanceOf[js.Dynamic].applyDynamic("subscribe")(eventType.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Subscription]
  inline def subscribe[T /* <: UIEventType */](eventType: T, callback: TouchEventCallback[T] | UIEventCallback[T], options: SubscribeOptions): Subscription = (^.asInstanceOf[js.Dynamic].applyDynamic("subscribe")(eventType.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Subscription]
  
  inline def unsubscribe[T /* <: UIEventType */](eventType: T, callback: TouchEventCallback[T] | UIEventCallback[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unsubscribe")(eventType.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait ArgmentedEvent[T /* <: EventType */] extends StObject {
    
    var mainType: String
    
    var resize: Height
    
    var scroll: Delta
    
    var subType: String
    
    var touch: AxisIntention
    
    var `type`: T
  }
  object ArgmentedEvent {
    
    inline def apply[T /* <: EventType */](mainType: String, resize: Height, scroll: Delta, subType: String, touch: AxisIntention, `type`: T): ArgmentedEvent[T] = {
      val __obj = js.Dynamic.literal(mainType = mainType.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], subType = subType.asInstanceOf[js.Any], touch = touch.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArgmentedEvent[T]]
    }
    
    extension [Self <: ArgmentedEvent[?], T /* <: EventType */](x: Self & ArgmentedEvent[T]) {
      
      inline def setMainType(value: String): Self = StObject.set(x, "mainType", value.asInstanceOf[js.Any])
      
      inline def setResize(value: Height): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
      
      inline def setScroll(value: Delta): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
      
      inline def setSubType(value: String): Self = StObject.set(x, "subType", value.asInstanceOf[js.Any])
      
      inline def setTouch(value: AxisIntention): Self = StObject.set(x, "touch", value.asInstanceOf[js.Any])
      
      inline def setType(value: T): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.subscribeUiEvent.subscribeUiEventStrings.resize
    - typingsJapgolly.subscribeUiEvent.subscribeUiEventStrings.resizeEnd
    - typingsJapgolly.subscribeUiEvent.subscribeUiEventStrings.resizeStart
    - typingsJapgolly.subscribeUiEvent.subscribeUiEventStrings.scroll
    - typingsJapgolly.subscribeUiEvent.subscribeUiEventStrings.scrollEnd
    - typingsJapgolly.subscribeUiEvent.subscribeUiEventStrings.scrollStart
    - typingsJapgolly.subscribeUiEvent.subscribeUiEventStrings.visibilitychange
    - typingsJapgolly.subscribeUiEvent.subscribeUiEventStrings.touchend
    - typingsJapgolly.subscribeUiEvent.subscribeUiEventStrings.touchmove
    - typingsJapgolly.subscribeUiEvent.subscribeUiEventStrings.touchmoveEnd
    - typingsJapgolly.subscribeUiEvent.subscribeUiEventStrings.touchmoveStart
    - typingsJapgolly.subscribeUiEvent.subscribeUiEventStrings.touchstart
  */
  trait EventType extends StObject
  object EventType {
    
    inline def resize: typingsJapgolly.subscribeUiEvent.subscribeUiEventStrings.resize = "resize".asInstanceOf[typingsJapgolly.subscribeUiEvent.subscribeUiEventStrings.resize]
    
    inline def resizeEnd: typingsJapgolly.subscribeUiEvent.subscribeUiEventStrings.resizeEnd = "resizeEnd".asInstanceOf[typingsJapgolly.subscribeUiEvent.subscribeUiEventStrings.resizeEnd]
    
    inline def resizeStart: typingsJapgolly.subscribeUiEvent.subscribeUiEventStrings.resizeStart = "resizeStart".asInstanceOf[typingsJapgolly.subscribeUiEvent.subscribeUiEventStrings.resizeStart]
    
    inline def scroll: typingsJapgolly.subscribeUiEvent.subscribeUiEventStrings.scroll = "scroll".asInstanceOf[typingsJapgolly.subscribeUiEvent.subscribeUiEventStrings.scroll]
    
    inline def scrollEnd: typingsJapgolly.subscribeUiEvent.subscribeUiEventStrings.scrollEnd = "scrollEnd".asInstanceOf[typingsJapgolly.subscribeUiEvent.subscribeUiEventStrings.scrollEnd]
    
    inline def scrollStart: typingsJapgolly.subscribeUiEvent.subscribeUiEventStrings.scrollStart = "scrollStart".asInstanceOf[typingsJapgolly.subscribeUiEvent.subscribeUiEventStrings.scrollStart]
    
    inline def touchend: typingsJapgolly.subscribeUiEvent.subscribeUiEventStrings.touchend = "touchend".asInstanceOf[typingsJapgolly.subscribeUiEvent.subscribeUiEventStrings.touchend]
    
    inline def touchmove: typingsJapgolly.subscribeUiEvent.subscribeUiEventStrings.touchmove = "touchmove".asInstanceOf[typingsJapgolly.subscribeUiEvent.subscribeUiEventStrings.touchmove]
    
    inline def touchmoveEnd: typingsJapgolly.subscribeUiEvent.subscribeUiEventStrings.touchmoveEnd = "touchmoveEnd".asInstanceOf[typingsJapgolly.subscribeUiEvent.subscribeUiEventStrings.touchmoveEnd]
    
    inline def touchmoveStart: typingsJapgolly.subscribeUiEvent.subscribeUiEventStrings.touchmoveStart = "touchmoveStart".asInstanceOf[typingsJapgolly.subscribeUiEvent.subscribeUiEventStrings.touchmoveStart]
    
    inline def touchstart: typingsJapgolly.subscribeUiEvent.subscribeUiEventStrings.touchstart = "touchstart".asInstanceOf[typingsJapgolly.subscribeUiEvent.subscribeUiEventStrings.touchstart]
    
    inline def visibilitychange: typingsJapgolly.subscribeUiEvent.subscribeUiEventStrings.visibilitychange = "visibilitychange".asInstanceOf[typingsJapgolly.subscribeUiEvent.subscribeUiEventStrings.visibilitychange]
  }
  
  trait SubscribeOptions extends StObject {
    
    var context: js.UndefOr[Any] = js.undefined
    
    var enableResizeInfo: js.UndefOr[Boolean] = js.undefined
    
    var enableScrollInfo: js.UndefOr[Boolean] = js.undefined
    
    var enableTouchInfo: js.UndefOr[Boolean] = js.undefined
    
    var eventOptions: js.UndefOr[AddEventListenerOptions] = js.undefined
    
    var target: js.UndefOr[HTMLElement | Window | Document | Null] = js.undefined
    
    var throttleRate: js.UndefOr[Double] = js.undefined
    
    var useRAF: js.UndefOr[Boolean] = js.undefined
  }
  object SubscribeOptions {
    
    inline def apply(): SubscribeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SubscribeOptions]
    }
    
    extension [Self <: SubscribeOptions](x: Self) {
      
      inline def setContext(value: Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setEnableResizeInfo(value: Boolean): Self = StObject.set(x, "enableResizeInfo", value.asInstanceOf[js.Any])
      
      inline def setEnableResizeInfoUndefined: Self = StObject.set(x, "enableResizeInfo", js.undefined)
      
      inline def setEnableScrollInfo(value: Boolean): Self = StObject.set(x, "enableScrollInfo", value.asInstanceOf[js.Any])
      
      inline def setEnableScrollInfoUndefined: Self = StObject.set(x, "enableScrollInfo", js.undefined)
      
      inline def setEnableTouchInfo(value: Boolean): Self = StObject.set(x, "enableTouchInfo", value.asInstanceOf[js.Any])
      
      inline def setEnableTouchInfoUndefined: Self = StObject.set(x, "enableTouchInfo", js.undefined)
      
      inline def setEventOptions(value: AddEventListenerOptions): Self = StObject.set(x, "eventOptions", value.asInstanceOf[js.Any])
      
      inline def setEventOptionsUndefined: Self = StObject.set(x, "eventOptions", js.undefined)
      
      inline def setTarget(value: HTMLElement | Window | Document): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetNull: Self = StObject.set(x, "target", null)
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setThrottleRate(value: Double): Self = StObject.set(x, "throttleRate", value.asInstanceOf[js.Any])
      
      inline def setThrottleRateUndefined: Self = StObject.set(x, "throttleRate", js.undefined)
      
      inline def setUseRAF(value: Boolean): Self = StObject.set(x, "useRAF", value.asInstanceOf[js.Any])
      
      inline def setUseRAFUndefined: Self = StObject.set(x, "useRAF", js.undefined)
    }
  }
  
  trait Subscription extends StObject {
    
    def unsubscribe(): Unit
  }
  object Subscription {
    
    inline def apply(unsubscribe: Callback): Subscription = {
      val __obj = js.Dynamic.literal(unsubscribe = unsubscribe.toJsFn)
      __obj.asInstanceOf[Subscription]
    }
    
    extension [Self <: Subscription](x: Self) {
      
      inline def setUnsubscribe(value: Callback): Self = StObject.set(x, "unsubscribe", value.toJsFn)
    }
  }
  
  type TouchEventCallback[T /* <: TouchEventType */] = js.Function2[/* event */ TouchEvent, /* payload */ ArgmentedEvent[T], Any]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.subscribeUiEvent.subscribeUiEventStrings.touchend
    - typingsJapgolly.subscribeUiEvent.subscribeUiEventStrings.touchmove
    - typingsJapgolly.subscribeUiEvent.subscribeUiEventStrings.touchmoveEnd
    - typingsJapgolly.subscribeUiEvent.subscribeUiEventStrings.touchmoveStart
    - typingsJapgolly.subscribeUiEvent.subscribeUiEventStrings.touchstart
  */
  trait TouchEventType extends StObject
  object TouchEventType {
    
    inline def touchend: typingsJapgolly.subscribeUiEvent.subscribeUiEventStrings.touchend = "touchend".asInstanceOf[typingsJapgolly.subscribeUiEvent.subscribeUiEventStrings.touchend]
    
    inline def touchmove: typingsJapgolly.subscribeUiEvent.subscribeUiEventStrings.touchmove = "touchmove".asInstanceOf[typingsJapgolly.subscribeUiEvent.subscribeUiEventStrings.touchmove]
    
    inline def touchmoveEnd: typingsJapgolly.subscribeUiEvent.subscribeUiEventStrings.touchmoveEnd = "touchmoveEnd".asInstanceOf[typingsJapgolly.subscribeUiEvent.subscribeUiEventStrings.touchmoveEnd]
    
    inline def touchmoveStart: typingsJapgolly.subscribeUiEvent.subscribeUiEventStrings.touchmoveStart = "touchmoveStart".asInstanceOf[typingsJapgolly.subscribeUiEvent.subscribeUiEventStrings.touchmoveStart]
    
    inline def touchstart: typingsJapgolly.subscribeUiEvent.subscribeUiEventStrings.touchstart = "touchstart".asInstanceOf[typingsJapgolly.subscribeUiEvent.subscribeUiEventStrings.touchstart]
  }
  
  type UIEventCallback[T /* <: UIEventType */] = js.Function2[/* event */ UIEvent, /* payload */ ArgmentedEvent[T], Any]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.subscribeUiEvent.subscribeUiEventStrings.resize
    - typingsJapgolly.subscribeUiEvent.subscribeUiEventStrings.resizeEnd
    - typingsJapgolly.subscribeUiEvent.subscribeUiEventStrings.resizeStart
    - typingsJapgolly.subscribeUiEvent.subscribeUiEventStrings.scroll
    - typingsJapgolly.subscribeUiEvent.subscribeUiEventStrings.scrollEnd
    - typingsJapgolly.subscribeUiEvent.subscribeUiEventStrings.scrollStart
    - typingsJapgolly.subscribeUiEvent.subscribeUiEventStrings.visibilitychange
  */
  trait UIEventType extends StObject
  object UIEventType {
    
    inline def resize: typingsJapgolly.subscribeUiEvent.subscribeUiEventStrings.resize = "resize".asInstanceOf[typingsJapgolly.subscribeUiEvent.subscribeUiEventStrings.resize]
    
    inline def resizeEnd: typingsJapgolly.subscribeUiEvent.subscribeUiEventStrings.resizeEnd = "resizeEnd".asInstanceOf[typingsJapgolly.subscribeUiEvent.subscribeUiEventStrings.resizeEnd]
    
    inline def resizeStart: typingsJapgolly.subscribeUiEvent.subscribeUiEventStrings.resizeStart = "resizeStart".asInstanceOf[typingsJapgolly.subscribeUiEvent.subscribeUiEventStrings.resizeStart]
    
    inline def scroll: typingsJapgolly.subscribeUiEvent.subscribeUiEventStrings.scroll = "scroll".asInstanceOf[typingsJapgolly.subscribeUiEvent.subscribeUiEventStrings.scroll]
    
    inline def scrollEnd: typingsJapgolly.subscribeUiEvent.subscribeUiEventStrings.scrollEnd = "scrollEnd".asInstanceOf[typingsJapgolly.subscribeUiEvent.subscribeUiEventStrings.scrollEnd]
    
    inline def scrollStart: typingsJapgolly.subscribeUiEvent.subscribeUiEventStrings.scrollStart = "scrollStart".asInstanceOf[typingsJapgolly.subscribeUiEvent.subscribeUiEventStrings.scrollStart]
    
    inline def visibilitychange: typingsJapgolly.subscribeUiEvent.subscribeUiEventStrings.visibilitychange = "visibilitychange".asInstanceOf[typingsJapgolly.subscribeUiEvent.subscribeUiEventStrings.visibilitychange]
  }
}
