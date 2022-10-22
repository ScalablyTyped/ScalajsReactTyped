package typingsJapgolly.flight

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.Document
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import typingsJapgolly.flight.anon.LogAll
import typingsJapgolly.jquery.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Flight {
  
  @js.native
  trait Advice
    extends StObject
       with Base {
    
    /**
      * Run the customFunc function after the existingFunc function.
      *
      * @param existingFuncName The name of the existing function (existingFunc)
      *        you want to augment.
      *
      * customFunc The function to be invoked after existingFunc.
      */
    def after(method: String, fn: js.Function): Unit = js.native
    
    /**
      * Run the existingFunc function in the middle of the customFunc function.
      * It's similar to underscore's _wrap function).
      *
      * @param existingFuncName The name of the existing function (existingFunc)
      *        you want to augment.
      *
      * customFunc The function to wrap around existingFunc. The existingFunc
      * function will be passed to customFunc as an argument.
      *
      * The existing function is passed to the custom function as an argument so
      * that it can be referenced. If the custom function does not call the
      * existing function then it will replace that function instead of
      * surrounding it.
      */
    def around(method: String, fn: js.Function): Unit = js.native
    
    /**
      * Run the customFunc function before the existingFunc function.
      *
      * @param existingFuncName The name of the existing function (existingFunc)
      *        you want to augment.
      *
      * @param customFunc The function to be invoked before existingFunc.
      */
    def before(method: String, fn: js.Function): Unit = js.native
  }
  
  trait AdviceStatic extends StObject {
    
    def withAdvice(): js.Function
  }
  object AdviceStatic {
    
    inline def apply(withAdvice: CallbackTo[js.Function]): AdviceStatic = {
      val __obj = js.Dynamic.literal(withAdvice = withAdvice.toJsFn)
      __obj.asInstanceOf[AdviceStatic]
    }
    
    extension [Self <: AdviceStatic](x: Self) {
      
      inline def setWithAdvice(value: CallbackTo[js.Function]): Self = StObject.set(x, "withAdvice", value.toJsFn)
    }
  }
  
  @js.native
  trait Base extends StObject {
    
    /**
      * Most Components and Mixins need to define attributes. In Flight,
      * default values are assigned by passing an object to the attributes
      * function.
      *
      * NOTE: this.attributes replaces the now deprecated this.defaultAttrs.
      * However, for backwards compatibility, if you are using this.defaultAttrs
      * then all the old attribute behavior remains in place.
      */
    def attributes(obj: js.Object): Unit = js.native
    
    /**
      * Most Components and Mixins need to define attributes. In Flight,
      * default values are assigned by passing an object to the defaultAttrs
      * function.
      *
      * NOTE: this.attributes replaces the now deprecated this.defaultAttrs.
      * However, for backwards compatibility, if you are using this.defaultAttrs
      * then all the old attribute behavior remains in place.
      */
    def defaultAttrs(obj: js.Object): Unit = js.native
    
    /**
      * This method is attached to the prototype of every Component; it accepts
      * the component's node and an options object as arguments. The core
      * implementation, which is called every time an instance is created, will
      * assign the node to the instance and override the default attrs with the
      * options object.
      *
      * Components and Mixins will typically augment the core implementation by
      * supplying a function as an argument to the after method (see the advice
      * API for more information). This is a good place to set up event
      * listeners that bind to callbacks.
      */
    def initialize(node: Any, options: js.Object): Unit = js.native
    
    /**
      * If we no longer want a component instance to listen to an event we can
      * use the off method to unsubscribe.
      *
      * @param selector Optional. The DOM node(s) listening for the event.
      *        Defaults to the component instance's node value.
      *
      * @param eventType The event type being listened to.
      *
      * @param handler Optional. The function (callback) to detach from the
      *        component instance. Defaults to the detaching all callbacks for the event.
      */
    def off(eventType: String): Unit = js.native
    def off(eventType: String, handler: js.Function): Unit = js.native
    def off(selector: String, eventType: String): Unit = js.native
    def off(selector: String, eventType: String, handler: js.Function): Unit = js.native
    def off(selector: String, eventType: String, handler: js.Object): Unit = js.native
    def off(selector: String, eventType: js.Object): Unit = js.native
    def off(selector: String, eventType: js.Object, handler: js.Function): Unit = js.native
    def off(selector: String, eventType: js.Object, handler: js.Object): Unit = js.native
    def off(selector: js.Array[Element], eventType: String): Unit = js.native
    def off(selector: js.Array[Element], eventType: String, handler: js.Function): Unit = js.native
    def off(selector: js.Array[Element], eventType: String, handler: js.Object): Unit = js.native
    def off(selector: js.Array[Element], eventType: js.Object): Unit = js.native
    def off(selector: js.Array[Element], eventType: js.Object, handler: js.Function): Unit = js.native
    def off(selector: js.Array[Element], eventType: js.Object, handler: js.Object): Unit = js.native
    def off(selector: Document, eventType: String): Unit = js.native
    def off(selector: Document, eventType: String, handler: js.Function): Unit = js.native
    def off(selector: Document, eventType: String, handler: js.Object): Unit = js.native
    def off(selector: Document, eventType: js.Object): Unit = js.native
    def off(selector: Document, eventType: js.Object, handler: js.Function): Unit = js.native
    def off(selector: Document, eventType: js.Object, handler: js.Object): Unit = js.native
    def off(selector: Element, eventType: String): Unit = js.native
    def off(selector: Element, eventType: String, handler: js.Function): Unit = js.native
    def off(selector: Element, eventType: String, handler: js.Object): Unit = js.native
    def off(selector: Element, eventType: js.Object): Unit = js.native
    def off(selector: Element, eventType: js.Object, handler: js.Function): Unit = js.native
    def off(selector: Element, eventType: js.Object, handler: js.Object): Unit = js.native
    
    /**
      * This allows a component instance to listen to an event and register a
      * callback to be invoked. Flight will automatically bind the context
      * (this) of the callback to the component instance.
      *
      * @param selector Optional. Specify the DOM node(s) that should listen
      *        for the event. Defaults to the component instance's node value.
      *
      * @param eventType The event type to listen for.
      *
      * @param handler Either a function (callback) to be invoked, or a map of
      *        targets and callbacks.
      */
    def on(eventType: String, handler: js.Function): Unit = js.native
    def on(eventType: String, handler: js.Object): Unit = js.native
    def on(selector: String, eventType: String, handler: js.Function): Unit = js.native
    def on(selector: String, eventType: String, handler: js.Object): Unit = js.native
    def on(selector: js.Array[Element], eventType: String, handler: js.Function): Unit = js.native
    def on(selector: js.Array[Element], eventType: String, handler: js.Object): Unit = js.native
    def on(selector: Document, eventType: String, handler: js.Function): Unit = js.native
    def on(selector: Document, eventType: String, handler: js.Object): Unit = js.native
    def on(selector: Element, eventType: String, handler: js.Function): Unit = js.native
    def on(selector: Element, eventType: String, handler: js.Object): Unit = js.native
    
    /**
      * The select method takes an attr key as its argument. The value of the
      * attr must be a CSS Selector. The method will return all matching
      * elements within the component's node.
      *
      * This is a handy alternative to jQuery's this.$node.find() and prevents
      * accidental access to elements outside of the component's node.
      *
      * @param attr
      */
    def select(attr: String): JQuery[HTMLElement] = js.native
    
    /**
      * Remove a component instance and its event bindings.
      *
      * It's a good idea to teardown components after each unit test - and
      * teardown is also good for unbinding event listeners when, for example,
      * the user navigates away from a page.
      *
      */
    def teardown(): Unit = js.native
    
    /**
      * Trigger an event.
      *
      * @param selector Optional. The DOM node(s) that the event will be
      *        dispatched to. Defaults to the component instance's node value.
      *
      * @param eventType String. The event type to be triggered.
      *
      * You can also specify a default function that will be called by the
      * component, providing that nothing in the event's bubble chain invokes
      * preventDefault. Default functions in custom events are analagous to the
      * default actions of native events.
      *
      * To define a default function, make the eventType argument an object
      * that specifies the event's type and a defaultBehavior property. A
      * common use case is defining default behavior for keyboard events.
      *
      * @param eventPayload This is the payload of data that accompanies the event.
      */
    def trigger(eventType: String): Unit = js.native
    def trigger(eventType: js.Object): Unit = js.native
    def trigger(selector: String, eventType: String): Unit = js.native
    def trigger(selector: String, eventType: String, eventPayload: js.Object): Unit = js.native
    def trigger(selector: String, eventType: js.Object): Unit = js.native
    def trigger(selector: String, eventType: js.Object, eventPayload: js.Object): Unit = js.native
    def trigger(selector: js.Array[Element], eventType: String): Unit = js.native
    def trigger(selector: js.Array[Element], eventType: String, eventPayload: js.Object): Unit = js.native
    def trigger(selector: js.Array[Element], eventType: js.Object): Unit = js.native
    def trigger(selector: js.Array[Element], eventType: js.Object, eventPayload: js.Object): Unit = js.native
    def trigger(selector: Document, eventType: String): Unit = js.native
    def trigger(selector: Document, eventType: String, eventPayload: js.Object): Unit = js.native
    def trigger(selector: Document, eventType: js.Object): Unit = js.native
    def trigger(selector: Document, eventType: js.Object, eventPayload: js.Object): Unit = js.native
    def trigger(selector: Element, eventType: String): Unit = js.native
    def trigger(selector: Element, eventType: String, eventPayload: js.Object): Unit = js.native
    def trigger(selector: Element, eventType: js.Object): Unit = js.native
    def trigger(selector: Element, eventType: js.Object, eventPayload: js.Object): Unit = js.native
  }
  
  @js.native
  trait Component
    extends StObject
       with Advice {
    
    @JSName("$node")
    var $node: JQuery[HTMLElement] = js.native
    
    var node: Element = js.native
  }
  
  @js.native
  trait ComponentStatic extends StObject {
    
    def apply(fns: js.Function*): ComponentStatic = js.native
    
    def attachTo(selector: String): Unit = js.native
    def attachTo(selector: String, options: js.Object): Unit = js.native
    def attachTo(selector: Element): Unit = js.native
    def attachTo(selector: Element, options: js.Object): Unit = js.native
    def attachTo(selector: JQuery[HTMLElement]): Unit = js.native
    def attachTo(selector: JQuery[HTMLElement], options: js.Object): Unit = js.native
    
    def teardownAll(): Unit = js.native
  }
  
  trait ComposeStatic extends StObject {
    
    def mixin(base: js.Object, mixins: js.Array[js.Function]): Unit
  }
  object ComposeStatic {
    
    inline def apply(mixin: (js.Object, js.Array[js.Function]) => Callback): ComposeStatic = {
      val __obj = js.Dynamic.literal(mixin = js.Any.fromFunction2((t0: js.Object, t1: js.Array[js.Function]) => (mixin(t0, t1)).runNow()))
      __obj.asInstanceOf[ComposeStatic]
    }
    
    extension [Self <: ComposeStatic](x: Self) {
      
      inline def setMixin(value: (js.Object, js.Array[js.Function]) => Callback): Self = StObject.set(x, "mixin", js.Any.fromFunction2((t0: js.Object, t1: js.Array[js.Function]) => (value(t0, t1)).runNow()))
    }
  }
  
  trait DebugStatic extends StObject {
    
    var events: LogAll
  }
  object DebugStatic {
    
    inline def apply(events: LogAll): DebugStatic = {
      val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any])
      __obj.asInstanceOf[DebugStatic]
    }
    
    extension [Self <: DebugStatic](x: Self) {
      
      inline def setEvents(value: LogAll): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    }
  }
  
  trait EventData extends StObject {
    
    var el: HTMLElement
  }
  object EventData {
    
    inline def apply(el: HTMLElement): EventData = {
      val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventData]
    }
    
    extension [Self <: EventData](x: Self) {
      
      inline def setEl(value: HTMLElement): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
    }
  }
  
  trait FlightStatic extends StObject {
    
    var advice: AdviceStatic
    
    def component(fns: js.Function*): ComponentStatic
    @JSName("component")
    var component_Original: ComponentStatic
    
    var compose: ComposeStatic
    
    var utils: UtilsStatic
  }
  object FlightStatic {
    
    inline def apply(advice: AdviceStatic, component: ComponentStatic, compose: ComposeStatic, utils: UtilsStatic): FlightStatic = {
      val __obj = js.Dynamic.literal(advice = advice.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], compose = compose.asInstanceOf[js.Any], utils = utils.asInstanceOf[js.Any])
      __obj.asInstanceOf[FlightStatic]
    }
    
    extension [Self <: FlightStatic](x: Self) {
      
      inline def setAdvice(value: AdviceStatic): Self = StObject.set(x, "advice", value.asInstanceOf[js.Any])
      
      inline def setComponent(value: ComponentStatic): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setCompose(value: ComposeStatic): Self = StObject.set(x, "compose", value.asInstanceOf[js.Any])
      
      inline def setUtils(value: UtilsStatic): Self = StObject.set(x, "utils", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UtilsStatic extends StObject {
    
    def compose(fn1: js.Function, fn2: js.Function, fns: js.Function*): js.Function = js.native
    
    def countThen(num: Double, base: js.Function): js.Function = js.native
    
    def debounce(func: js.Function, wait: Double, immediate: Boolean): js.Function = js.native
    
    def delegate(rules: js.Object): Unit = js.native
    
    def isDomObj(obj: js.Object): Boolean = js.native
    
    def isEnumerable(obj: js.Object, property: String): Boolean = js.native
    
    def merge(obj1: js.Object, obj2: js.Object): js.Object = js.native
    def merge(obj1: js.Object, obj2: js.Object, args: Any*): js.Object = js.native
    def merge(obj1: js.Object, obj2: js.Object, deepClone: Boolean): js.Object = js.native
    
    def push(base: js.Object, extra: js.Object): Unit = js.native
    def push(base: js.Object, extra: js.Object, protect: Boolean): Unit = js.native
    
    def throttle(func: js.Function, wait: Double): js.Function = js.native
    
    def toArray(obj: js.Object): js.Array[Any] = js.native
    def toArray(obj: js.Object, from: Double): js.Array[Any] = js.native
    
    def uniqueArray(array: js.Array[Any]): js.Array[Any] = js.native
  }
}
