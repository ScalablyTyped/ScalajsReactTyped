package typingsJapgolly.polymer

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.CustomEvent
import org.scalajs.dom.DocumentFragment
import org.scalajs.dom.Element
import org.scalajs.dom.Event
import org.scalajs.dom.EventListenerOptions
import org.scalajs.dom.EventTarget
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLLinkElement
import org.scalajs.dom.Node
import typingsJapgolly.polymer.anon.Instantiable
import typingsJapgolly.polymer.mod.global.polymer.PolymerStatic
import typingsJapgolly.std.AddEventListenerOptions
import typingsJapgolly.std.ArrayConstructor
import typingsJapgolly.std.BooleanConstructor
import typingsJapgolly.std.CustomElementConstructor
import typingsJapgolly.std.DateConstructor
import typingsJapgolly.std.EventListenerOrEventListenerObject
import typingsJapgolly.std.HTMLTemplateElement
import typingsJapgolly.std.NumberConstructor
import typingsJapgolly.std.ObjectConstructor
import typingsJapgolly.std.StringConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object global {
    
    @JSGlobal("Polymer")
    @js.native
    def Polymer_ : PolymerStatic = js.native
    
    inline def Polymer__=(x: PolymerStatic): Unit = js.Dynamic.global.updateDynamic("Polymer")(x.asInstanceOf[js.Any])
    
    object polymer {
      
      trait ArraySplice extends StObject {
        
        def calculateSplices[T](current: js.Array[T], previous: js.Array[T]): js.Array[PolymerSplice]
      }
      object ArraySplice {
        
        inline def apply(calculateSplices: (js.Array[Any], js.Array[Any]) => js.Array[PolymerSplice]): ArraySplice = {
          val __obj = js.Dynamic.literal(calculateSplices = js.Any.fromFunction2(calculateSplices))
          __obj.asInstanceOf[ArraySplice]
        }
        
        extension [Self <: ArraySplice](x: Self) {
          
          inline def setCalculateSplices(value: (js.Array[Any], js.Array[Any]) => js.Array[PolymerSplice]): Self = StObject.set(x, "calculateSplices", js.Any.fromFunction2(value))
        }
      }
      
      trait Base
        extends StObject
           with CommonBase
           with /** Need to allow all properties for callback methods. */
      /* prop */ StringDictionary[Any] {
        
        // Has to live on Base because it is incompatible with
        // HTMLElement#toggleAttribute
        var toggleAttribute: js.UndefOr[
                js.Function3[
                  /* name */ String, 
                  /* bool */ js.UndefOr[Boolean], 
                  /* node */ js.UndefOr[HTMLElement], 
                  Unit
                ]
              ] = js.undefined
      }
      object Base {
        
        inline def apply(
          deserialize: (js.UndefOr[js.Function2[/* value */ String, /* type */ NumberConstructor, Double]]) & (js.UndefOr[js.Function2[/* value */ String, /* type */ BooleanConstructor, Boolean]]) & (js.UndefOr[js.Function2[/* value */ String, /* type */ ObjectConstructor, js.Object]]) & (js.UndefOr[js.Function2[/* value */ String, /* type */ ArrayConstructor, js.Array[Any]]]) & (js.UndefOr[js.Function2[/* value */ String, /* type */ DateConstructor, js.Date]]) & (js.UndefOr[js.Function2[/* value */ String, /* type */ StringConstructor, String]]),
          is: String
        ): Base = {
          val __obj = js.Dynamic.literal(deserialize = deserialize.asInstanceOf[js.Any], is = is.asInstanceOf[js.Any])
          __obj.asInstanceOf[Base]
        }
        
        extension [Self <: Base](x: Self) {
          
          inline def setToggleAttribute(
            value: (/* name */ String, /* bool */ js.UndefOr[Boolean], /* node */ js.UndefOr[HTMLElement]) => Callback
          ): Self = StObject.set(x, "toggleAttribute", js.Any.fromFunction3((t0: /* name */ String, t1: /* bool */ js.UndefOr[Boolean], t2: /* node */ js.UndefOr[HTMLElement]) => (value(t0, t1, t2)).runNow()))
          
          inline def setToggleAttributeUndefined: Self = StObject.set(x, "toggleAttribute", js.undefined)
        }
      }
      
      trait CommonBase extends StObject {
        
        /* polymer-standard */
        // Annotations
        @JSName("$")
        var $: js.UndefOr[Any] = js.undefined
        
        // Utils
        @JSName("$$")
        var DollarDollar: js.UndefOr[js.Function1[/* selector */ String, Element]] = js.undefined
        
        var arrayDelete: js.UndefOr[js.Function2[/* path */ String | js.Array[Any], /* item */ Any, js.Array[Any]]] = js.undefined
        
        var async: js.UndefOr[
                js.Function2[/* callback */ js.Function0[Unit], /* waitTime */ js.UndefOr[Double], Double]
              ] = js.undefined
        
        var attached: js.UndefOr[js.Function0[Unit]] = js.undefined
        
        var attachedCallback: js.UndefOr[js.Function0[Unit]] = js.undefined
        
        var attributeChanged: js.UndefOr[js.Function3[/* name */ String, /* oldValue */ Any, /* newValue */ Any, Unit]] = js.undefined
        
        var attributeChangedCallback: js.UndefOr[
                js.Function4[
                  /* attributeName */ String, 
                  /* oldValue */ String | Null, 
                  /* newValue */ String | Null, 
                  /* namespace */ String | Null, 
                  Unit
                ]
              ] = js.undefined
        
        var attributeFollows: js.UndefOr[
                js.Function3[/* name */ String, /* toElement */ HTMLElement, /* fromElement */ HTMLElement, Unit]
              ] = js.undefined
        
        var beforeRegister: js.UndefOr[js.Function0[Unit]] = js.undefined
        
        // Behaviors
        var behaviors: js.UndefOr[js.Array[js.Object]] = js.undefined
        
        var cancelAsync: js.UndefOr[js.Function1[/* handle */ Double, Unit]] = js.undefined
        
        var cancelDebouncer: js.UndefOr[js.Function1[/* jobName */ String, Unit]] = js.undefined
        
        var classFollows: js.UndefOr[
                js.Function3[/* name */ String, /* toElement */ HTMLElement, /* fromElement */ HTMLElement, Unit]
              ] = js.undefined
        
        var copyOwnProperty: js.UndefOr[
                js.Function3[/* name */ String, /* source */ js.Object, /* target */ js.Object, Unit]
              ] = js.undefined
        
        var create: js.UndefOr[js.Function2[/* tag */ String, /* props */ js.Object, Element]] = js.undefined
        
        var created: js.UndefOr[js.Function0[Unit]] = js.undefined
        
        var createdCallback: js.UndefOr[js.Function0[Unit]] = js.undefined
        
        // Debouncer
        var debounce: js.UndefOr[
                js.Function3[/* jobName */ String, /* callback */ js.Function, /* wait */ js.UndefOr[Double], Unit]
              ] = js.undefined
        
        var deserialize: (js.UndefOr[js.Function2[/* value */ String, /* type */ NumberConstructor, Double]]) & (js.UndefOr[js.Function2[/* value */ String, /* type */ BooleanConstructor, Boolean]]) & (js.UndefOr[js.Function2[/* value */ String, /* type */ ObjectConstructor, js.Object]]) & (js.UndefOr[js.Function2[/* value */ String, /* type */ ArrayConstructor, js.Array[Any]]]) & (js.UndefOr[js.Function2[/* value */ String, /* type */ DateConstructor, js.Date]]) & (js.UndefOr[js.Function2[/* value */ String, /* type */ StringConstructor, String]])
        
        var detached: js.UndefOr[js.Function0[Unit]] = js.undefined
        
        var detachedCallback: js.UndefOr[js.Function0[Unit]] = js.undefined
        
        var distributeContent: js.UndefOr[js.Function0[Unit]] = js.undefined
        
        // Shady
        var domHost: js.UndefOr[js.Function0[Element]] = js.undefined
        
        var elementMatches: js.UndefOr[js.Function2[/* selector */ String, /* node */ js.UndefOr[Element], Boolean]] = js.undefined
        
        var extend: js.UndefOr[js.Function2[/* prototype */ js.Object, /* api */ js.Object, js.Object]] = js.undefined
        
        // Extends
        var `extends`: js.UndefOr[String] = js.undefined
        
        // Constructors
        var factoryImpl: js.UndefOr[js.Function1[/* repeated */ Any, Unit]] = js.undefined
        
        var fire: js.UndefOr[
                js.Function3[
                  /* type */ String, 
                  /* detail */ js.UndefOr[Any], 
                  /* options */ js.UndefOr[js.Object], 
                  CustomEvent
                ]
              ] = js.undefined
        
        var flushDebouncer: js.UndefOr[js.Function1[/* jobName */ String, Unit]] = js.undefined
        
        var get: js.UndefOr[
                js.Function2[
                  /* path */ String | (js.Array[String | Double]), 
                  /* root */ js.UndefOr[js.Object], 
                  Any
                ]
              ] = js.undefined
        
        var getContentChildNodes: js.UndefOr[js.Function1[/* selector */ String, js.Array[Node]]] = js.undefined
        
        var getContentChildren: js.UndefOr[js.Function1[/* selector */ String, js.Array[HTMLElement]]] = js.undefined
        
        var getEffectiveChildNodes: js.UndefOr[js.Function0[js.Array[Node]]] = js.undefined
        
        var getEffectiveChildren: js.UndefOr[js.Function0[js.Array[Node]]] = js.undefined
        
        var getNativePrototype: js.UndefOr[js.Function1[/* tag */ String, js.Object]] = js.undefined
        
        var getPropertyInfo: js.UndefOr[js.Function1[/* property */ String, js.Object]] = js.undefined
        
        /* polymer-micro */
        // Attributes
        var hostAttributes: js.UndefOr[StringDictionary[Any]] = js.undefined
        
        var importHref: js.UndefOr[
                js.Function3[
                  /* href */ String, 
                  /* onload */ js.UndefOr[js.Function], 
                  /* onerror */ js.UndefOr[js.Function], 
                  HTMLLinkElement
                ]
              ] = js.undefined
        
        // Template {
        var instanceTemplate: js.UndefOr[js.Function1[/* template */ HTMLElement, DocumentFragment]] = js.undefined
        
        // Tag
        var is: String
        
        var isDebouncerActive: js.UndefOr[js.Function1[/* jobName */ String, Boolean]] = js.undefined
        
        var isLightDescendant: js.UndefOr[js.Function1[/* node */ HTMLElement, Boolean]] = js.undefined
        
        var isLocalDescendant: js.UndefOr[js.Function1[/* node */ HTMLElement, Boolean]] = js.undefined
        
        var linkPaths: js.UndefOr[js.Function2[/* to */ String, /* from */ js.UndefOr[String], Unit]] = js.undefined
        
        var listen: js.UndefOr[
                js.Function3[/* node */ Element, /* eventName */ String, /* methodName */ String, Unit]
              ] = js.undefined
        
        // Events
        var listeners: js.UndefOr[StringDictionary[String]] = js.undefined
        
        var mixin: js.UndefOr[js.Function2[/* target */ js.Object, /* source */ js.Object, js.Object]] = js.undefined
        
        // NotifyPath
        var notifyPath: js.UndefOr[js.Function3[/* path */ String, /* value */ Any, /* fromAbove */ Any, Unit]] = js.undefined
        
        var notifySplices: js.UndefOr[js.Function2[/* path */ String, /* splices */ js.Array[PolymerSplice], Unit]] = js.undefined
        
        var observers: js.UndefOr[js.Array[String]] = js.undefined
        
        var pop: js.UndefOr[js.Function1[/* path */ String, Any]] = js.undefined
        
        // Properties
        var properties: js.UndefOr[StringDictionary[PropConstructorType | PropObjectType]] = js.undefined
        
        var push: js.UndefOr[js.Function2[/* path */ String, /* repeated */ Any, Double]] = js.undefined
        
        /* polymer-mini */
        // Ready
        var ready: js.UndefOr[js.Function0[Unit]] = js.undefined
        
        var reflectPropertiesToAttribute: js.UndefOr[js.Function1[/* name */ String, Unit]] = js.undefined
        
        /* common api */
        var registerCallback: js.UndefOr[js.Function0[Unit]] = js.undefined
        
        var registered: js.UndefOr[js.Function0[Unit]] = js.undefined
        
        // ResolveUrl
        var resolveUrl: js.UndefOr[js.Function1[/* url */ String, String]] = js.undefined
        
        // Styling
        var scopeSubtree: js.UndefOr[js.Function2[/* container */ Element, /* shouldObserve */ Boolean, Unit]] = js.undefined
        
        var serialize: js.UndefOr[js.Function1[/* value */ Any, String]] = js.undefined
        
        var serializeValueToAttribute: js.UndefOr[
                js.Function3[/* value */ Any, /* attribute */ String, /* node */ js.UndefOr[Element], Unit]
              ] = js.undefined
        
        var set: js.UndefOr[
                js.Function3[
                  /* path */ String | (js.Array[String | Double]), 
                  /* value */ Any, 
                  /* root */ js.UndefOr[js.Object], 
                  Unit
                ]
              ] = js.undefined
        
        // Gestures
        var setScrollDirection: js.UndefOr[js.Function2[/* direction */ String, /* node */ js.UndefOr[HTMLElement], Unit]] = js.undefined
        
        var shift: js.UndefOr[js.Function1[/* path */ String, Any]] = js.undefined
        
        var splice: js.UndefOr[
                js.Function4[
                  /* path */ String, 
                  /* index */ Double, 
                  /* removeCount */ Double, 
                  /* repeated */ Any, 
                  Double
                ]
              ] = js.undefined
        
        var toggleClass: js.UndefOr[
                js.Function3[
                  /* name */ String, 
                  /* bool */ js.UndefOr[Boolean], 
                  /* node */ js.UndefOr[HTMLElement], 
                  Unit
                ]
              ] = js.undefined
        
        var transform: js.UndefOr[js.Function2[/* transform */ String, /* node */ js.UndefOr[HTMLElement], Unit]] = js.undefined
        
        var translate3d: js.UndefOr[
                js.Function4[/* x */ Double, /* y */ Double, /* z */ Double, /* node */ js.UndefOr[HTMLElement], Unit]
              ] = js.undefined
        
        var unlinkPaths: js.UndefOr[js.Function1[/* path */ String, Unit]] = js.undefined
        
        var unlisten: js.UndefOr[
                js.Function3[/* node */ Element, /* eventName */ String, /* methodName */ String, Unit]
              ] = js.undefined
        
        var unshift: js.UndefOr[js.Function2[/* path */ String, /* repeated */ Any, Double]] = js.undefined
        
        // XStyling
        var updateStyles: js.UndefOr[js.Function1[/* styles */ js.UndefOr[StringDictionary[String]], Unit]] = js.undefined
      }
      object CommonBase {
        
        inline def apply(
          deserialize: (js.UndefOr[js.Function2[/* value */ String, /* type */ NumberConstructor, Double]]) & (js.UndefOr[js.Function2[/* value */ String, /* type */ BooleanConstructor, Boolean]]) & (js.UndefOr[js.Function2[/* value */ String, /* type */ ObjectConstructor, js.Object]]) & (js.UndefOr[js.Function2[/* value */ String, /* type */ ArrayConstructor, js.Array[Any]]]) & (js.UndefOr[js.Function2[/* value */ String, /* type */ DateConstructor, js.Date]]) & (js.UndefOr[js.Function2[/* value */ String, /* type */ StringConstructor, String]]),
          is: String
        ): CommonBase = {
          val __obj = js.Dynamic.literal(deserialize = deserialize.asInstanceOf[js.Any], is = is.asInstanceOf[js.Any])
          __obj.asInstanceOf[CommonBase]
        }
        
        extension [Self <: CommonBase](x: Self) {
          
          inline def set$(value: Any): Self = StObject.set(x, "$", value.asInstanceOf[js.Any])
          
          inline def set$Undefined: Self = StObject.set(x, "$", js.undefined)
          
          inline def setArrayDelete(value: (/* path */ String | js.Array[Any], /* item */ Any) => js.Array[Any]): Self = StObject.set(x, "arrayDelete", js.Any.fromFunction2(value))
          
          inline def setArrayDeleteUndefined: Self = StObject.set(x, "arrayDelete", js.undefined)
          
          inline def setAsync(value: (/* callback */ js.Function0[Unit], /* waitTime */ js.UndefOr[Double]) => Double): Self = StObject.set(x, "async", js.Any.fromFunction2(value))
          
          inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
          
          inline def setAttached(value: Callback): Self = StObject.set(x, "attached", value.toJsFn)
          
          inline def setAttachedCallback(value: Callback): Self = StObject.set(x, "attachedCallback", value.toJsFn)
          
          inline def setAttachedCallbackUndefined: Self = StObject.set(x, "attachedCallback", js.undefined)
          
          inline def setAttachedUndefined: Self = StObject.set(x, "attached", js.undefined)
          
          inline def setAttributeChanged(value: (/* name */ String, /* oldValue */ Any, /* newValue */ Any) => Callback): Self = StObject.set(x, "attributeChanged", js.Any.fromFunction3((t0: /* name */ String, t1: /* oldValue */ Any, t2: /* newValue */ Any) => (value(t0, t1, t2)).runNow()))
          
          inline def setAttributeChangedCallback(
            value: (/* attributeName */ String, /* oldValue */ String | Null, /* newValue */ String | Null, /* namespace */ String | Null) => Callback
          ): Self = StObject.set(x, "attributeChangedCallback", js.Any.fromFunction4((t0: /* attributeName */ String, t1: /* oldValue */ String | Null, t2: /* newValue */ String | Null, t3: /* namespace */ String | Null) => (value(t0, t1, t2, t3)).runNow()))
          
          inline def setAttributeChangedCallbackUndefined: Self = StObject.set(x, "attributeChangedCallback", js.undefined)
          
          inline def setAttributeChangedUndefined: Self = StObject.set(x, "attributeChanged", js.undefined)
          
          inline def setAttributeFollows(value: (/* name */ String, /* toElement */ HTMLElement, /* fromElement */ HTMLElement) => Callback): Self = StObject.set(x, "attributeFollows", js.Any.fromFunction3((t0: /* name */ String, t1: /* toElement */ HTMLElement, t2: /* fromElement */ HTMLElement) => (value(t0, t1, t2)).runNow()))
          
          inline def setAttributeFollowsUndefined: Self = StObject.set(x, "attributeFollows", js.undefined)
          
          inline def setBeforeRegister(value: Callback): Self = StObject.set(x, "beforeRegister", value.toJsFn)
          
          inline def setBeforeRegisterUndefined: Self = StObject.set(x, "beforeRegister", js.undefined)
          
          inline def setBehaviors(value: js.Array[js.Object]): Self = StObject.set(x, "behaviors", value.asInstanceOf[js.Any])
          
          inline def setBehaviorsUndefined: Self = StObject.set(x, "behaviors", js.undefined)
          
          inline def setBehaviorsVarargs(value: js.Object*): Self = StObject.set(x, "behaviors", js.Array(value*))
          
          inline def setCancelAsync(value: /* handle */ Double => Callback): Self = StObject.set(x, "cancelAsync", js.Any.fromFunction1((t0: /* handle */ Double) => value(t0).runNow()))
          
          inline def setCancelAsyncUndefined: Self = StObject.set(x, "cancelAsync", js.undefined)
          
          inline def setCancelDebouncer(value: /* jobName */ String => Callback): Self = StObject.set(x, "cancelDebouncer", js.Any.fromFunction1((t0: /* jobName */ String) => value(t0).runNow()))
          
          inline def setCancelDebouncerUndefined: Self = StObject.set(x, "cancelDebouncer", js.undefined)
          
          inline def setClassFollows(value: (/* name */ String, /* toElement */ HTMLElement, /* fromElement */ HTMLElement) => Callback): Self = StObject.set(x, "classFollows", js.Any.fromFunction3((t0: /* name */ String, t1: /* toElement */ HTMLElement, t2: /* fromElement */ HTMLElement) => (value(t0, t1, t2)).runNow()))
          
          inline def setClassFollowsUndefined: Self = StObject.set(x, "classFollows", js.undefined)
          
          inline def setCopyOwnProperty(value: (/* name */ String, /* source */ js.Object, /* target */ js.Object) => Callback): Self = StObject.set(x, "copyOwnProperty", js.Any.fromFunction3((t0: /* name */ String, t1: /* source */ js.Object, t2: /* target */ js.Object) => (value(t0, t1, t2)).runNow()))
          
          inline def setCopyOwnPropertyUndefined: Self = StObject.set(x, "copyOwnProperty", js.undefined)
          
          inline def setCreate(value: (/* tag */ String, /* props */ js.Object) => Element): Self = StObject.set(x, "create", js.Any.fromFunction2(value))
          
          inline def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
          
          inline def setCreated(value: Callback): Self = StObject.set(x, "created", value.toJsFn)
          
          inline def setCreatedCallback(value: Callback): Self = StObject.set(x, "createdCallback", value.toJsFn)
          
          inline def setCreatedCallbackUndefined: Self = StObject.set(x, "createdCallback", js.undefined)
          
          inline def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
          
          inline def setDebounce(
            value: (/* jobName */ String, /* callback */ js.Function, /* wait */ js.UndefOr[Double]) => Callback
          ): Self = StObject.set(x, "debounce", js.Any.fromFunction3((t0: /* jobName */ String, t1: /* callback */ js.Function, t2: /* wait */ js.UndefOr[Double]) => (value(t0, t1, t2)).runNow()))
          
          inline def setDebounceUndefined: Self = StObject.set(x, "debounce", js.undefined)
          
          inline def setDeserialize(
            value: (js.UndefOr[js.Function2[/* value */ String, /* type */ NumberConstructor, Double]]) & (js.UndefOr[js.Function2[/* value */ String, /* type */ BooleanConstructor, Boolean]]) & (js.UndefOr[js.Function2[/* value */ String, /* type */ ObjectConstructor, js.Object]]) & (js.UndefOr[js.Function2[/* value */ String, /* type */ ArrayConstructor, js.Array[Any]]]) & (js.UndefOr[js.Function2[/* value */ String, /* type */ DateConstructor, js.Date]]) & (js.UndefOr[js.Function2[/* value */ String, /* type */ StringConstructor, String]])
          ): Self = StObject.set(x, "deserialize", value.asInstanceOf[js.Any])
          
          inline def setDetached(value: Callback): Self = StObject.set(x, "detached", value.toJsFn)
          
          inline def setDetachedCallback(value: Callback): Self = StObject.set(x, "detachedCallback", value.toJsFn)
          
          inline def setDetachedCallbackUndefined: Self = StObject.set(x, "detachedCallback", js.undefined)
          
          inline def setDetachedUndefined: Self = StObject.set(x, "detached", js.undefined)
          
          inline def setDistributeContent(value: Callback): Self = StObject.set(x, "distributeContent", value.toJsFn)
          
          inline def setDistributeContentUndefined: Self = StObject.set(x, "distributeContent", js.undefined)
          
          inline def setDollarDollar(value: /* selector */ String => Element): Self = StObject.set(x, "$$", js.Any.fromFunction1(value))
          
          inline def setDollarDollarUndefined: Self = StObject.set(x, "$$", js.undefined)
          
          inline def setDomHost(value: CallbackTo[Element]): Self = StObject.set(x, "domHost", value.toJsFn)
          
          inline def setDomHostUndefined: Self = StObject.set(x, "domHost", js.undefined)
          
          inline def setElementMatches(value: (/* selector */ String, /* node */ js.UndefOr[Element]) => Boolean): Self = StObject.set(x, "elementMatches", js.Any.fromFunction2(value))
          
          inline def setElementMatchesUndefined: Self = StObject.set(x, "elementMatches", js.undefined)
          
          inline def setExtend(value: (/* prototype */ js.Object, /* api */ js.Object) => js.Object): Self = StObject.set(x, "extend", js.Any.fromFunction2(value))
          
          inline def setExtendUndefined: Self = StObject.set(x, "extend", js.undefined)
          
          inline def setExtends(value: String): Self = StObject.set(x, "extends", value.asInstanceOf[js.Any])
          
          inline def setExtendsUndefined: Self = StObject.set(x, "extends", js.undefined)
          
          inline def setFactoryImpl(value: /* repeated */ Any => Callback): Self = StObject.set(x, "factoryImpl", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
          
          inline def setFactoryImplUndefined: Self = StObject.set(x, "factoryImpl", js.undefined)
          
          inline def setFire(
            value: (/* type */ String, /* detail */ js.UndefOr[Any], /* options */ js.UndefOr[js.Object]) => CustomEvent
          ): Self = StObject.set(x, "fire", js.Any.fromFunction3(value))
          
          inline def setFireUndefined: Self = StObject.set(x, "fire", js.undefined)
          
          inline def setFlushDebouncer(value: /* jobName */ String => Callback): Self = StObject.set(x, "flushDebouncer", js.Any.fromFunction1((t0: /* jobName */ String) => value(t0).runNow()))
          
          inline def setFlushDebouncerUndefined: Self = StObject.set(x, "flushDebouncer", js.undefined)
          
          inline def setGet(value: (/* path */ String | (js.Array[String | Double]), /* root */ js.UndefOr[js.Object]) => Any): Self = StObject.set(x, "get", js.Any.fromFunction2(value))
          
          inline def setGetContentChildNodes(value: /* selector */ String => js.Array[Node]): Self = StObject.set(x, "getContentChildNodes", js.Any.fromFunction1(value))
          
          inline def setGetContentChildNodesUndefined: Self = StObject.set(x, "getContentChildNodes", js.undefined)
          
          inline def setGetContentChildren(value: /* selector */ String => js.Array[HTMLElement]): Self = StObject.set(x, "getContentChildren", js.Any.fromFunction1(value))
          
          inline def setGetContentChildrenUndefined: Self = StObject.set(x, "getContentChildren", js.undefined)
          
          inline def setGetEffectiveChildNodes(value: CallbackTo[js.Array[Node]]): Self = StObject.set(x, "getEffectiveChildNodes", value.toJsFn)
          
          inline def setGetEffectiveChildNodesUndefined: Self = StObject.set(x, "getEffectiveChildNodes", js.undefined)
          
          inline def setGetEffectiveChildren(value: CallbackTo[js.Array[Node]]): Self = StObject.set(x, "getEffectiveChildren", value.toJsFn)
          
          inline def setGetEffectiveChildrenUndefined: Self = StObject.set(x, "getEffectiveChildren", js.undefined)
          
          inline def setGetNativePrototype(value: /* tag */ String => js.Object): Self = StObject.set(x, "getNativePrototype", js.Any.fromFunction1(value))
          
          inline def setGetNativePrototypeUndefined: Self = StObject.set(x, "getNativePrototype", js.undefined)
          
          inline def setGetPropertyInfo(value: /* property */ String => js.Object): Self = StObject.set(x, "getPropertyInfo", js.Any.fromFunction1(value))
          
          inline def setGetPropertyInfoUndefined: Self = StObject.set(x, "getPropertyInfo", js.undefined)
          
          inline def setGetUndefined: Self = StObject.set(x, "get", js.undefined)
          
          inline def setHostAttributes(value: StringDictionary[Any]): Self = StObject.set(x, "hostAttributes", value.asInstanceOf[js.Any])
          
          inline def setHostAttributesUndefined: Self = StObject.set(x, "hostAttributes", js.undefined)
          
          inline def setImportHref(
            value: (/* href */ String, /* onload */ js.UndefOr[js.Function], /* onerror */ js.UndefOr[js.Function]) => HTMLLinkElement
          ): Self = StObject.set(x, "importHref", js.Any.fromFunction3(value))
          
          inline def setImportHrefUndefined: Self = StObject.set(x, "importHref", js.undefined)
          
          inline def setInstanceTemplate(value: /* template */ HTMLElement => DocumentFragment): Self = StObject.set(x, "instanceTemplate", js.Any.fromFunction1(value))
          
          inline def setInstanceTemplateUndefined: Self = StObject.set(x, "instanceTemplate", js.undefined)
          
          inline def setIs(value: String): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
          
          inline def setIsDebouncerActive(value: /* jobName */ String => Boolean): Self = StObject.set(x, "isDebouncerActive", js.Any.fromFunction1(value))
          
          inline def setIsDebouncerActiveUndefined: Self = StObject.set(x, "isDebouncerActive", js.undefined)
          
          inline def setIsLightDescendant(value: /* node */ HTMLElement => Boolean): Self = StObject.set(x, "isLightDescendant", js.Any.fromFunction1(value))
          
          inline def setIsLightDescendantUndefined: Self = StObject.set(x, "isLightDescendant", js.undefined)
          
          inline def setIsLocalDescendant(value: /* node */ HTMLElement => Boolean): Self = StObject.set(x, "isLocalDescendant", js.Any.fromFunction1(value))
          
          inline def setIsLocalDescendantUndefined: Self = StObject.set(x, "isLocalDescendant", js.undefined)
          
          inline def setLinkPaths(value: (/* to */ String, /* from */ js.UndefOr[String]) => Callback): Self = StObject.set(x, "linkPaths", js.Any.fromFunction2((t0: /* to */ String, t1: /* from */ js.UndefOr[String]) => (value(t0, t1)).runNow()))
          
          inline def setLinkPathsUndefined: Self = StObject.set(x, "linkPaths", js.undefined)
          
          inline def setListen(value: (/* node */ Element, /* eventName */ String, /* methodName */ String) => Callback): Self = StObject.set(x, "listen", js.Any.fromFunction3((t0: /* node */ Element, t1: /* eventName */ String, t2: /* methodName */ String) => (value(t0, t1, t2)).runNow()))
          
          inline def setListenUndefined: Self = StObject.set(x, "listen", js.undefined)
          
          inline def setListeners(value: StringDictionary[String]): Self = StObject.set(x, "listeners", value.asInstanceOf[js.Any])
          
          inline def setListenersUndefined: Self = StObject.set(x, "listeners", js.undefined)
          
          inline def setMixin(value: (/* target */ js.Object, /* source */ js.Object) => js.Object): Self = StObject.set(x, "mixin", js.Any.fromFunction2(value))
          
          inline def setMixinUndefined: Self = StObject.set(x, "mixin", js.undefined)
          
          inline def setNotifyPath(value: (/* path */ String, /* value */ Any, /* fromAbove */ Any) => Callback): Self = StObject.set(x, "notifyPath", js.Any.fromFunction3((t0: /* path */ String, t1: /* value */ Any, t2: /* fromAbove */ Any) => (value(t0, t1, t2)).runNow()))
          
          inline def setNotifyPathUndefined: Self = StObject.set(x, "notifyPath", js.undefined)
          
          inline def setNotifySplices(value: (/* path */ String, /* splices */ js.Array[PolymerSplice]) => Callback): Self = StObject.set(x, "notifySplices", js.Any.fromFunction2((t0: /* path */ String, t1: /* splices */ js.Array[PolymerSplice]) => (value(t0, t1)).runNow()))
          
          inline def setNotifySplicesUndefined: Self = StObject.set(x, "notifySplices", js.undefined)
          
          inline def setObservers(value: js.Array[String]): Self = StObject.set(x, "observers", value.asInstanceOf[js.Any])
          
          inline def setObserversUndefined: Self = StObject.set(x, "observers", js.undefined)
          
          inline def setObserversVarargs(value: String*): Self = StObject.set(x, "observers", js.Array(value*))
          
          inline def setPop(value: /* path */ String => Any): Self = StObject.set(x, "pop", js.Any.fromFunction1(value))
          
          inline def setPopUndefined: Self = StObject.set(x, "pop", js.undefined)
          
          inline def setProperties(value: StringDictionary[PropConstructorType | PropObjectType]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
          
          inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
          
          inline def setPush(value: (/* path */ String, /* repeated */ Any) => Double): Self = StObject.set(x, "push", js.Any.fromFunction2(value))
          
          inline def setPushUndefined: Self = StObject.set(x, "push", js.undefined)
          
          inline def setReady(value: Callback): Self = StObject.set(x, "ready", value.toJsFn)
          
          inline def setReadyUndefined: Self = StObject.set(x, "ready", js.undefined)
          
          inline def setReflectPropertiesToAttribute(value: /* name */ String => Callback): Self = StObject.set(x, "reflectPropertiesToAttribute", js.Any.fromFunction1((t0: /* name */ String) => value(t0).runNow()))
          
          inline def setReflectPropertiesToAttributeUndefined: Self = StObject.set(x, "reflectPropertiesToAttribute", js.undefined)
          
          inline def setRegisterCallback(value: Callback): Self = StObject.set(x, "registerCallback", value.toJsFn)
          
          inline def setRegisterCallbackUndefined: Self = StObject.set(x, "registerCallback", js.undefined)
          
          inline def setRegistered(value: Callback): Self = StObject.set(x, "registered", value.toJsFn)
          
          inline def setRegisteredUndefined: Self = StObject.set(x, "registered", js.undefined)
          
          inline def setResolveUrl(value: /* url */ String => String): Self = StObject.set(x, "resolveUrl", js.Any.fromFunction1(value))
          
          inline def setResolveUrlUndefined: Self = StObject.set(x, "resolveUrl", js.undefined)
          
          inline def setScopeSubtree(value: (/* container */ Element, /* shouldObserve */ Boolean) => Callback): Self = StObject.set(x, "scopeSubtree", js.Any.fromFunction2((t0: /* container */ Element, t1: /* shouldObserve */ Boolean) => (value(t0, t1)).runNow()))
          
          inline def setScopeSubtreeUndefined: Self = StObject.set(x, "scopeSubtree", js.undefined)
          
          inline def setSerialize(value: /* value */ Any => String): Self = StObject.set(x, "serialize", js.Any.fromFunction1(value))
          
          inline def setSerializeUndefined: Self = StObject.set(x, "serialize", js.undefined)
          
          inline def setSerializeValueToAttribute(value: (/* value */ Any, /* attribute */ String, /* node */ js.UndefOr[Element]) => Callback): Self = StObject.set(x, "serializeValueToAttribute", js.Any.fromFunction3((t0: /* value */ Any, t1: /* attribute */ String, t2: /* node */ js.UndefOr[Element]) => (value(t0, t1, t2)).runNow()))
          
          inline def setSerializeValueToAttributeUndefined: Self = StObject.set(x, "serializeValueToAttribute", js.undefined)
          
          inline def setSet(
            value: (/* path */ String | (js.Array[String | Double]), /* value */ Any, /* root */ js.UndefOr[js.Object]) => Callback
          ): Self = StObject.set(x, "set", js.Any.fromFunction3((t0: /* path */ String | (js.Array[String | Double]), t1: /* value */ Any, t2: /* root */ js.UndefOr[js.Object]) => (value(t0, t1, t2)).runNow()))
          
          inline def setSetScrollDirection(value: (/* direction */ String, /* node */ js.UndefOr[HTMLElement]) => Callback): Self = StObject.set(x, "setScrollDirection", js.Any.fromFunction2((t0: /* direction */ String, t1: /* node */ js.UndefOr[HTMLElement]) => (value(t0, t1)).runNow()))
          
          inline def setSetScrollDirectionUndefined: Self = StObject.set(x, "setScrollDirection", js.undefined)
          
          inline def setSetUndefined: Self = StObject.set(x, "set", js.undefined)
          
          inline def setShift(value: /* path */ String => Any): Self = StObject.set(x, "shift", js.Any.fromFunction1(value))
          
          inline def setShiftUndefined: Self = StObject.set(x, "shift", js.undefined)
          
          inline def setSplice(
            value: (/* path */ String, /* index */ Double, /* removeCount */ Double, /* repeated */ Any) => Double
          ): Self = StObject.set(x, "splice", js.Any.fromFunction4(value))
          
          inline def setSpliceUndefined: Self = StObject.set(x, "splice", js.undefined)
          
          inline def setToggleClass(
            value: (/* name */ String, /* bool */ js.UndefOr[Boolean], /* node */ js.UndefOr[HTMLElement]) => Callback
          ): Self = StObject.set(x, "toggleClass", js.Any.fromFunction3((t0: /* name */ String, t1: /* bool */ js.UndefOr[Boolean], t2: /* node */ js.UndefOr[HTMLElement]) => (value(t0, t1, t2)).runNow()))
          
          inline def setToggleClassUndefined: Self = StObject.set(x, "toggleClass", js.undefined)
          
          inline def setTransform(value: (/* transform */ String, /* node */ js.UndefOr[HTMLElement]) => Callback): Self = StObject.set(x, "transform", js.Any.fromFunction2((t0: /* transform */ String, t1: /* node */ js.UndefOr[HTMLElement]) => (value(t0, t1)).runNow()))
          
          inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
          
          inline def setTranslate3d(
            value: (/* x */ Double, /* y */ Double, /* z */ Double, /* node */ js.UndefOr[HTMLElement]) => Callback
          ): Self = StObject.set(x, "translate3d", js.Any.fromFunction4((t0: /* x */ Double, t1: /* y */ Double, t2: /* z */ Double, t3: /* node */ js.UndefOr[HTMLElement]) => (value(t0, t1, t2, t3)).runNow()))
          
          inline def setTranslate3dUndefined: Self = StObject.set(x, "translate3d", js.undefined)
          
          inline def setUnlinkPaths(value: /* path */ String => Callback): Self = StObject.set(x, "unlinkPaths", js.Any.fromFunction1((t0: /* path */ String) => value(t0).runNow()))
          
          inline def setUnlinkPathsUndefined: Self = StObject.set(x, "unlinkPaths", js.undefined)
          
          inline def setUnlisten(value: (/* node */ Element, /* eventName */ String, /* methodName */ String) => Callback): Self = StObject.set(x, "unlisten", js.Any.fromFunction3((t0: /* node */ Element, t1: /* eventName */ String, t2: /* methodName */ String) => (value(t0, t1, t2)).runNow()))
          
          inline def setUnlistenUndefined: Self = StObject.set(x, "unlisten", js.undefined)
          
          inline def setUnshift(value: (/* path */ String, /* repeated */ Any) => Double): Self = StObject.set(x, "unshift", js.Any.fromFunction2(value))
          
          inline def setUnshiftUndefined: Self = StObject.set(x, "unshift", js.undefined)
          
          inline def setUpdateStyles(value: /* styles */ js.UndefOr[StringDictionary[String]] => Callback): Self = StObject.set(x, "updateStyles", js.Any.fromFunction1((t0: /* styles */ js.UndefOr[StringDictionary[String]]) => value(t0).runNow()))
          
          inline def setUpdateStylesUndefined: Self = StObject.set(x, "updateStyles", js.undefined)
        }
      }
      
      @js.native
      trait DomApi extends StObject {
        
        def appendChild(node: Node): Node = js.native
        
        var childNodes: js.Array[Node] = js.native
        
        var children: js.Array[Element] = js.native
        
        var firstChild: Node = js.native
        
        var firstElementChild: Element = js.native
        
        def getDestinationInsertionPoints(): js.Array[Node] = js.native
        
        def getDistributedNodes(): js.Array[Node] = js.native
        
        def getEffectiveChildNodes(): js.Array[Node] = js.native
        
        def getOwnerRoot(): Node = js.native
        
        var innerHTML: String = js.native
        
        def insertBefore(node: Node): Node = js.native
        def insertBefore(node: Node, refNode: Node): Node = js.native
        
        var lastChild: Node = js.native
        
        var lastElementChild: Element = js.native
        
        var nextElementSibling: Element = js.native
        
        var nextSibling: Node = js.native
        
        def observeNodes(callback: js.Function1[/* info */ ObservedNodeInfo, Unit]): js.Object = js.native
        
        var parentNode: Node = js.native
        
        var previousElementSibling: Element = js.native
        
        var previousSibling: Node = js.native
        
        def queryDistributedElements(selector: String): js.Array[Node] = js.native
        
        def querySelector(selector: String): Node = js.native
        
        def querySelectorAll(selector: String): js.Array[Node] = js.native
        
        def removeAttribute(name: String): Unit = js.native
        
        def removeChild(node: Node): Node = js.native
        
        def replaceChild(node: Node, refNode: Node): Node = js.native
        
        def setAttribute(name: String, value: Any): Unit = js.native
        
        var textContent: String = js.native
        
        def unobserveNodes(observer: js.Object): Unit = js.native
      }
      
      @js.native
      trait DomApiStatic extends StObject {
        
        def apply(obj: Event): EventApi = js.native
        def apply(obj: Node): DomApi = js.native
        def apply(obj: Base): DomApi = js.native
        
        def flush(): Unit = js.native
      }
      
      trait EventApi extends StObject {
        
        var localTarget: EventTarget
        
        var path: js.Array[Node]
        
        var rootTarget: EventTarget
      }
      object EventApi {
        
        inline def apply(localTarget: EventTarget, path: js.Array[Node], rootTarget: EventTarget): EventApi = {
          val __obj = js.Dynamic.literal(localTarget = localTarget.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], rootTarget = rootTarget.asInstanceOf[js.Any])
          __obj.asInstanceOf[EventApi]
        }
        
        extension [Self <: EventApi](x: Self) {
          
          inline def setLocalTarget(value: EventTarget): Self = StObject.set(x, "localTarget", value.asInstanceOf[js.Any])
          
          inline def setPath(value: js.Array[Node]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
          
          inline def setPathVarargs(value: Node*): Self = StObject.set(x, "path", js.Array(value*))
          
          inline def setRootTarget(value: EventTarget): Self = StObject.set(x, "rootTarget", value.asInstanceOf[js.Any])
        }
      }
      
      @js.native
      trait ImportStatus
        extends StObject
           with RenderStatus {
        
        def whenLoaded(cb: js.Function): Unit = js.native
      }
      
      trait ObservedNodeInfo extends StObject {
        
        var addedNodes: js.Array[Node]
        
        var removedNode: js.Array[Node]
        
        var target: Node
      }
      object ObservedNodeInfo {
        
        inline def apply(addedNodes: js.Array[Node], removedNode: js.Array[Node], target: Node): ObservedNodeInfo = {
          val __obj = js.Dynamic.literal(addedNodes = addedNodes.asInstanceOf[js.Any], removedNode = removedNode.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
          __obj.asInstanceOf[ObservedNodeInfo]
        }
        
        extension [Self <: ObservedNodeInfo](x: Self) {
          
          inline def setAddedNodes(value: js.Array[Node]): Self = StObject.set(x, "addedNodes", value.asInstanceOf[js.Any])
          
          inline def setAddedNodesVarargs(value: Node*): Self = StObject.set(x, "addedNodes", js.Array(value*))
          
          inline def setRemovedNode(value: js.Array[Node]): Self = StObject.set(x, "removedNode", value.asInstanceOf[js.Any])
          
          inline def setRemovedNodeVarargs(value: Node*): Self = StObject.set(x, "removedNode", js.Array(value*))
          
          inline def setTarget(value: Node): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
        }
      }
      
      // This is the type of a Polymer element after it has gone through the
      // Polymer() function.
      @js.native
      trait PolymerElement
        extends StObject
           with CommonBase
           with typingsJapgolly.std.HTMLElement {
        
        /* standard dom */
        /* InferMemberOverrides */
        override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
        /* InferMemberOverrides */
        override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
        /* InferMemberOverrides */
        override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
        
        /* standard dom */
        /* InferMemberOverrides */
        override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
        /* InferMemberOverrides */
        override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
        /* InferMemberOverrides */
        override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
      }
      
      trait PolymerSplice extends StObject {
        
        var addedCount: Double
        
        var index: Double
        
        var `object`: js.Array[js.Object]
        
        var removed: js.Array[js.Object]
        
        var `type`: String
      }
      object PolymerSplice {
        
        inline def apply(
          addedCount: Double,
          index: Double,
          `object`: js.Array[js.Object],
          removed: js.Array[js.Object],
          `type`: String
        ): PolymerSplice = {
          val __obj = js.Dynamic.literal(addedCount = addedCount.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], removed = removed.asInstanceOf[js.Any])
          __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
          __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
          __obj.asInstanceOf[PolymerSplice]
        }
        
        extension [Self <: PolymerSplice](x: Self) {
          
          inline def setAddedCount(value: Double): Self = StObject.set(x, "addedCount", value.asInstanceOf[js.Any])
          
          inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
          
          inline def setObject(value: js.Array[js.Object]): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
          
          inline def setObjectVarargs(value: js.Object*): Self = StObject.set(x, "object", js.Array(value*))
          
          inline def setRemoved(value: js.Array[js.Object]): Self = StObject.set(x, "removed", value.asInstanceOf[js.Any])
          
          inline def setRemovedVarargs(value: js.Object*): Self = StObject.set(x, "removed", js.Array(value*))
          
          inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        }
      }
      
      @js.native
      trait PolymerStatic extends StObject {
        
        def apply(prototype: Instantiable): CustomElementConstructor = js.native
        def apply(prototype: Base): CustomElementConstructor = js.native
        
        var ArraySplice: typingsJapgolly.polymer.mod.global.polymer.ArraySplice = js.native
        
        var Base: typingsJapgolly.polymer.mod.global.polymer.Base = js.native
        
        def Class(prototype: Instantiable): CustomElementConstructor = js.native
        def Class(prototype: Base): CustomElementConstructor = js.native
        
        /** @deprecated */
        var ImportStatus: typingsJapgolly.polymer.mod.global.polymer.ImportStatus = js.native
        
        var RenderStatus: typingsJapgolly.polymer.mod.global.polymer.RenderStatus = js.native
        
        var Settings: typingsJapgolly.polymer.mod.global.polymer.Settings = js.native
        
        var Templatizer: typingsJapgolly.polymer.mod.global.polymer.Templatizer = js.native
        
        def dom(obj: Event): EventApi = js.native
        def dom(obj: Node): DomApi = js.native
        def dom(obj: Base): DomApi = js.native
        @JSName("dom")
        var dom_Original: DomApiStatic = js.native
        
        def isInstance(element: String): Boolean = js.native
      }
      
      type PropConstructorType = StringConstructor | ObjectConstructor | BooleanConstructor | NumberConstructor | DateConstructor | ArrayConstructor
      
      trait PropObjectType extends StObject {
        
        var computed: js.UndefOr[String] = js.undefined
        
        @JSName("notify")
        var notify_FPropObjectType: js.UndefOr[Boolean] = js.undefined
        
        var observer: js.UndefOr[String] = js.undefined
        
        var readOnly: js.UndefOr[Boolean] = js.undefined
        
        var reflectToAttribute: js.UndefOr[Boolean] = js.undefined
        
        var `type`: PropConstructorType
        
        var value: js.UndefOr[Boolean | Double | String | js.Function | js.Object] = js.undefined
      }
      object PropObjectType {
        
        inline def apply(`type`: PropConstructorType): PropObjectType = {
          val __obj = js.Dynamic.literal()
          __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
          __obj.asInstanceOf[PropObjectType]
        }
        
        extension [Self <: PropObjectType](x: Self) {
          
          inline def setComputed(value: String): Self = StObject.set(x, "computed", value.asInstanceOf[js.Any])
          
          inline def setComputedUndefined: Self = StObject.set(x, "computed", js.undefined)
          
          inline def setNotify_(value: Boolean): Self = StObject.set(x, "notify", value.asInstanceOf[js.Any])
          
          inline def setNotify_Undefined: Self = StObject.set(x, "notify", js.undefined)
          
          inline def setObserver(value: String): Self = StObject.set(x, "observer", value.asInstanceOf[js.Any])
          
          inline def setObserverUndefined: Self = StObject.set(x, "observer", js.undefined)
          
          inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
          
          inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
          
          inline def setReflectToAttribute(value: Boolean): Self = StObject.set(x, "reflectToAttribute", value.asInstanceOf[js.Any])
          
          inline def setReflectToAttributeUndefined: Self = StObject.set(x, "reflectToAttribute", js.undefined)
          
          inline def setType(value: PropConstructorType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
          
          inline def setValue(value: Boolean | Double | String | js.Function | js.Object): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
          
          inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
        }
      }
      
      @js.native
      trait RenderStatus extends StObject {
        
        def afterNextRender(element: Element, fn: js.Function): Unit = js.native
        def afterNextRender(element: Element, fn: js.Function, args: Any): Unit = js.native
        
        def hasRendered(): Boolean = js.native
        
        def whenReady(cb: js.Function): Unit = js.native
      }
      
      trait Settings extends StObject {
        
        var hasNativeCSSProperties: Boolean
        
        var hasNativeImports: Boolean
        
        var hasShadow: Boolean
        
        var nativeShadow: Boolean
        
        var useNativeCSSProperties: Boolean
        
        var useNativeCustomElements: Boolean
        
        var useNativeImports: Boolean
        
        var useNativeShadow: Boolean
        
        var usePolyfillProto: Boolean
        
        var useShadow: Boolean
        
        var wantShadow: Boolean
      }
      object Settings {
        
        inline def apply(
          hasNativeCSSProperties: Boolean,
          hasNativeImports: Boolean,
          hasShadow: Boolean,
          nativeShadow: Boolean,
          useNativeCSSProperties: Boolean,
          useNativeCustomElements: Boolean,
          useNativeImports: Boolean,
          useNativeShadow: Boolean,
          usePolyfillProto: Boolean,
          useShadow: Boolean,
          wantShadow: Boolean
        ): Settings = {
          val __obj = js.Dynamic.literal(hasNativeCSSProperties = hasNativeCSSProperties.asInstanceOf[js.Any], hasNativeImports = hasNativeImports.asInstanceOf[js.Any], hasShadow = hasShadow.asInstanceOf[js.Any], nativeShadow = nativeShadow.asInstanceOf[js.Any], useNativeCSSProperties = useNativeCSSProperties.asInstanceOf[js.Any], useNativeCustomElements = useNativeCustomElements.asInstanceOf[js.Any], useNativeImports = useNativeImports.asInstanceOf[js.Any], useNativeShadow = useNativeShadow.asInstanceOf[js.Any], usePolyfillProto = usePolyfillProto.asInstanceOf[js.Any], useShadow = useShadow.asInstanceOf[js.Any], wantShadow = wantShadow.asInstanceOf[js.Any])
          __obj.asInstanceOf[Settings]
        }
        
        extension [Self <: Settings](x: Self) {
          
          inline def setHasNativeCSSProperties(value: Boolean): Self = StObject.set(x, "hasNativeCSSProperties", value.asInstanceOf[js.Any])
          
          inline def setHasNativeImports(value: Boolean): Self = StObject.set(x, "hasNativeImports", value.asInstanceOf[js.Any])
          
          inline def setHasShadow(value: Boolean): Self = StObject.set(x, "hasShadow", value.asInstanceOf[js.Any])
          
          inline def setNativeShadow(value: Boolean): Self = StObject.set(x, "nativeShadow", value.asInstanceOf[js.Any])
          
          inline def setUseNativeCSSProperties(value: Boolean): Self = StObject.set(x, "useNativeCSSProperties", value.asInstanceOf[js.Any])
          
          inline def setUseNativeCustomElements(value: Boolean): Self = StObject.set(x, "useNativeCustomElements", value.asInstanceOf[js.Any])
          
          inline def setUseNativeImports(value: Boolean): Self = StObject.set(x, "useNativeImports", value.asInstanceOf[js.Any])
          
          inline def setUseNativeShadow(value: Boolean): Self = StObject.set(x, "useNativeShadow", value.asInstanceOf[js.Any])
          
          inline def setUsePolyfillProto(value: Boolean): Self = StObject.set(x, "usePolyfillProto", value.asInstanceOf[js.Any])
          
          inline def setUseShadow(value: Boolean): Self = StObject.set(x, "useShadow", value.asInstanceOf[js.Any])
          
          inline def setWantShadow(value: Boolean): Self = StObject.set(x, "wantShadow", value.asInstanceOf[js.Any])
        }
      }
      
      @js.native
      trait Templatizer extends StObject {
        
        def modelForElement(elem: HTMLElement): Base = js.native
        
        def stamp(model: js.Object): Base = js.native
        
        def templatize(template: HTMLTemplateElement): Unit = js.native
        def templatize(template: HTMLTemplateElement, mutableData: Boolean): Unit = js.native
      }
    }
  }
}
