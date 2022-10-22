package typingsJapgolly.polymerTs

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.EventListenerOptions
import org.scalajs.dom.HTMLElement
import typingsJapgolly.polymerTs.anon.AddedCount
import typingsJapgolly.std.AddEventListenerOptions
import typingsJapgolly.std.EventListenerOrEventListenerObject
import typingsJapgolly.std.FunctionConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object polymer {
  
  @js.native
  trait Base
    extends StObject
       with PolymerBase
       with Element {
    
    /* standard dom */
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
    
    var is: String = js.native
    
    /* standard dom */
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  }
  
  trait Element extends StObject {
    
    var attached: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var attributeChanged: js.UndefOr[js.Function3[/* attrName */ String, /* oldVal */ Any, /* newVal */ Any, Unit]] = js.undefined
    
    var behaviors: js.UndefOr[js.Array[js.Object]] = js.undefined
    
    var created: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var detached: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var factoryImpl: js.UndefOr[js.Function1[/* repeated */ Any, Unit]] = js.undefined
    
    var listeners: js.UndefOr[js.Object] = js.undefined
    
    var observers: js.UndefOr[js.Array[String]] = js.undefined
    
    var properties: js.UndefOr[js.Object] = js.undefined
    
    var ready: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object Element {
    
    inline def apply(): Element = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Element]
    }
    
    extension [Self <: Element](x: Self) {
      
      inline def setAttached(value: Callback): Self = StObject.set(x, "attached", value.toJsFn)
      
      inline def setAttachedUndefined: Self = StObject.set(x, "attached", js.undefined)
      
      inline def setAttributeChanged(value: (/* attrName */ String, /* oldVal */ Any, /* newVal */ Any) => Callback): Self = StObject.set(x, "attributeChanged", js.Any.fromFunction3((t0: /* attrName */ String, t1: /* oldVal */ Any, t2: /* newVal */ Any) => (value(t0, t1, t2)).runNow()))
      
      inline def setAttributeChangedUndefined: Self = StObject.set(x, "attributeChanged", js.undefined)
      
      inline def setBehaviors(value: js.Array[js.Object]): Self = StObject.set(x, "behaviors", value.asInstanceOf[js.Any])
      
      inline def setBehaviorsUndefined: Self = StObject.set(x, "behaviors", js.undefined)
      
      inline def setBehaviorsVarargs(value: js.Object*): Self = StObject.set(x, "behaviors", js.Array(value*))
      
      inline def setCreated(value: Callback): Self = StObject.set(x, "created", value.toJsFn)
      
      inline def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
      
      inline def setDetached(value: Callback): Self = StObject.set(x, "detached", value.toJsFn)
      
      inline def setDetachedUndefined: Self = StObject.set(x, "detached", js.undefined)
      
      inline def setFactoryImpl(value: /* repeated */ Any => Callback): Self = StObject.set(x, "factoryImpl", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
      
      inline def setFactoryImplUndefined: Self = StObject.set(x, "factoryImpl", js.undefined)
      
      inline def setListeners(value: js.Object): Self = StObject.set(x, "listeners", value.asInstanceOf[js.Any])
      
      inline def setListenersUndefined: Self = StObject.set(x, "listeners", js.undefined)
      
      inline def setObservers(value: js.Array[String]): Self = StObject.set(x, "observers", value.asInstanceOf[js.Any])
      
      inline def setObserversUndefined: Self = StObject.set(x, "observers", js.undefined)
      
      inline def setObserversVarargs(value: String*): Self = StObject.set(x, "observers", js.Array(value*))
      
      inline def setProperties(value: js.Object): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      inline def setReady(value: Callback): Self = StObject.set(x, "ready", value.toJsFn)
      
      inline def setReadyUndefined: Self = StObject.set(x, "ready", js.undefined)
    }
  }
  
  trait FireOptions extends StObject {
    
    var bubbles: js.UndefOr[Boolean] = js.undefined
    
    var cancelable: js.UndefOr[Boolean] = js.undefined
    
    var node: js.UndefOr[HTMLElement | Base] = js.undefined
  }
  object FireOptions {
    
    inline def apply(): FireOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FireOptions]
    }
    
    extension [Self <: FireOptions](x: Self) {
      
      inline def setBubbles(value: Boolean): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
      
      inline def setBubblesUndefined: Self = StObject.set(x, "bubbles", js.undefined)
      
      inline def setCancelable(value: Boolean): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
      
      inline def setCancelableUndefined: Self = StObject.set(x, "cancelable", js.undefined)
      
      inline def setNode(value: HTMLElement | Base): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
    }
  }
  
  @js.native
  trait PolymerBase
    extends StObject
       with typingsJapgolly.std.HTMLElement {
    
    @JSName("$")
    var $: Any = js.native
    
    @JSName("$$")
    var DollarDollar: Any = js.native
    
    /* standard dom */
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
    
    def arrayDelete(path: String, item: String): Any = js.native
    def arrayDelete(path: String, item: Any): Any = js.native
    
    def async(callback: js.Function): Any = js.native
    def async(callback: js.Function, waitTime: Double): Any = js.native
    
    def attachedCallback(): Unit = js.native
    
    def attributeFollows(name: String, toElement: HTMLElement, fromElement: HTMLElement): Unit = js.native
    
    def cancelAsync(handle: Double): Unit = js.native
    
    def cancelDebouncer(jobName: String): Unit = js.native
    
    def classFollows(name: String, toElement: HTMLElement, fromElement: HTMLElement): Unit = js.native
    
    def create(tag: String): HTMLElement = js.native
    def create(tag: String, props: js.Object): HTMLElement = js.native
    
    var customStyle: StringDictionary[String] = js.native
    
    def debounce(jobName: String, callback: js.Function): Unit = js.native
    def debounce(jobName: String, callback: js.Function, wait: Double): Unit = js.native
    
    def deserialize(value: String, `type`: Any): Any = js.native
    
    def distributeContent(): Unit = js.native
    
    def domHost(): Unit = js.native
    
    def elementMatches(selector: String, node: Element): Any = js.native
    
    def fire(`type`: String): Any = js.native
    def fire(`type`: String, detail: js.Object): Any = js.native
    def fire(`type`: String, detail: js.Object, options: FireOptions): Any = js.native
    def fire(`type`: String, detail: Unit, options: FireOptions): Any = js.native
    
    def flushDebouncer(jobName: String): Unit = js.native
    
    def get(path: String): Any = js.native
    def get(path: js.Array[String | Double]): Any = js.native
    
    def getContentChildNodes(slctr: String): Any = js.native
    
    def getContentChildren(slctr: String): Any = js.native
    
    def getNativePrototype(tag: String): Any = js.native
    
    def getPropertyInfo(property: String): Any = js.native
    
    def importHref(href: String): Any = js.native
    def importHref(href: String, onload: js.Function): Any = js.native
    def importHref(href: String, onload: js.Function, onerror: js.Function): Any = js.native
    def importHref(href: String, onload: js.Function, onerror: js.Function, optAsync: Boolean): Any = js.native
    def importHref(href: String, onload: js.Function, onerror: Unit, optAsync: Boolean): Any = js.native
    def importHref(href: String, onload: Unit, onerror: js.Function): Any = js.native
    def importHref(href: String, onload: Unit, onerror: js.Function, optAsync: Boolean): Any = js.native
    def importHref(href: String, onload: Unit, onerror: Unit, optAsync: Boolean): Any = js.native
    
    def instanceTemplate(template: Any): Any = js.native
    
    def isDebouncerActive(jobName: String): Any = js.native
    
    def linkPaths(to: String, from: String): Unit = js.native
    
    def listen(node: Element, eventName: String, methodName: String): Unit = js.native
    
    def mixin(target: js.Object, source: js.Object): Unit = js.native
    
    def notifyPath(path: String, value: Any): Unit = js.native
    def notifyPath(path: String, value: Any, fromAbove: Any): Unit = js.native
    
    def notifySplices(path: String, splices: AddedCount): Unit = js.native
    
    def pop(path: String): Any = js.native
    
    def push(path: String, value: Any): Any = js.native
    
    def reflectPropertyToAttribute(name: String): Unit = js.native
    
    /* standard dom */
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    
    def resolveUrl(url: String): Any = js.native
    
    var root: HTMLElement = js.native
    
    def scopeSubtree(container: Element, shouldObserve: Boolean): Unit = js.native
    
    def serialize(value: String): Any = js.native
    
    def serializeValueToAttribute(value: Any, attribute: String, node: Element): Unit = js.native
    
    def set(path: String, value: Any): Any = js.native
    def set(path: String, value: Any, root: js.Object): Any = js.native
    def set(path: js.Array[String | Double], value: Any): Any = js.native
    def set(path: js.Array[String | Double], value: Any, root: js.Object): Any = js.native
    
    def setScrollDirection(direction: String, node: HTMLElement): Unit = js.native
    
    var shadyRoot: HTMLElement = js.native
    
    def shift(path: String, value: Any): Any = js.native
    
    def splice(path: String, start: Double, deleteCount: Double, items: Any*): Any = js.native
    
    def toggleAttribute(name: String, force: Boolean, node: HTMLElement): Boolean = js.native
    def toggleAttribute(name: String, force: Unit, node: HTMLElement): Boolean = js.native
    
    def toggleClass(name: String, bool: Boolean): Unit = js.native
    def toggleClass(name: String, bool: Boolean, node: HTMLElement): Unit = js.native
    
    def transform(transform: String): Unit = js.native
    def transform(transform: String, node: HTMLElement): Unit = js.native
    
    def translate3d(x: Any, y: Any, z: Any): Unit = js.native
    def translate3d(x: Any, y: Any, z: Any, node: HTMLElement): Unit = js.native
    
    def unlinkPaths(path: String): Unit = js.native
    
    def unshift(path: String, value: Any): Any = js.native
    
    def updateStyles(): Unit = js.native
  }
  
  trait PolymerTSElement extends StObject {
    
    @JSName("$custom_cons")
    var $custom_cons: js.UndefOr[FunctionConstructor] = js.undefined
    
    @JSName("$custom_cons_args")
    var $custom_cons_args: js.UndefOr[js.Array[Any]] = js.undefined
    
    var style: js.UndefOr[String] = js.undefined
    
    var template: js.UndefOr[String] = js.undefined
  }
  object PolymerTSElement {
    
    inline def apply(): PolymerTSElement = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PolymerTSElement]
    }
    
    extension [Self <: PolymerTSElement](x: Self) {
      
      inline def set$custom_cons(value: FunctionConstructor): Self = StObject.set(x, "$custom_cons", value.asInstanceOf[js.Any])
      
      inline def set$custom_consUndefined: Self = StObject.set(x, "$custom_cons", js.undefined)
      
      inline def set$custom_cons_args(value: js.Array[Any]): Self = StObject.set(x, "$custom_cons_args", value.asInstanceOf[js.Any])
      
      inline def set$custom_cons_argsUndefined: Self = StObject.set(x, "$custom_cons_args", js.undefined)
      
      inline def set$custom_cons_argsVarargs(value: Any*): Self = StObject.set(x, "$custom_cons_args", js.Array(value*))
      
      inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    }
  }
  
  trait Property extends StObject {
    
    var computed: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    @JSName("notify")
    var notify_FProperty: js.UndefOr[Boolean] = js.undefined
    
    var observer: js.UndefOr[String] = js.undefined
    
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    var reflectToAttribute: js.UndefOr[Boolean] = js.undefined
    
    var `type`: js.UndefOr[Any] = js.undefined
    
    var value: js.UndefOr[Any] = js.undefined
  }
  object Property {
    
    inline def apply(): Property = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Property]
    }
    
    extension [Self <: Property](x: Self) {
      
      inline def setComputed(value: String): Self = StObject.set(x, "computed", value.asInstanceOf[js.Any])
      
      inline def setComputedUndefined: Self = StObject.set(x, "computed", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNotify_(value: Boolean): Self = StObject.set(x, "notify", value.asInstanceOf[js.Any])
      
      inline def setNotify_Undefined: Self = StObject.set(x, "notify", js.undefined)
      
      inline def setObserver(value: String): Self = StObject.set(x, "observer", value.asInstanceOf[js.Any])
      
      inline def setObserverUndefined: Self = StObject.set(x, "observer", js.undefined)
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setReflectToAttribute(value: Boolean): Self = StObject.set(x, "reflectToAttribute", value.asInstanceOf[js.Any])
      
      inline def setReflectToAttributeUndefined: Self = StObject.set(x, "reflectToAttribute", js.undefined)
      
      inline def setType(value: Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait dom extends StObject {
    
    def apply(node: HTMLElement): HTMLElement = js.native
    def apply(node: Base): HTMLElement = js.native
    
    def flush(): Any = js.native
  }
}
