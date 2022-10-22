package typingsJapgolly.ionicCore

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.EventListenerOptions
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonRouterElement
import typingsJapgolly.ionicCore.distTypesComponentsRouteRouteInterfaceMod.NavigationHookCallback
import typingsJapgolly.ionicCore.distTypesComponentsRouteRouteInterfaceMod.NavigationHookResult
import typingsJapgolly.ionicCore.distTypesUtilsAnimationAnimationInterfaceMod.AnimationBuilder
import typingsJapgolly.ionicCore.mod.ComponentProps
import typingsJapgolly.std.AddEventListenerOptions
import typingsJapgolly.std.CustomEvent
import typingsJapgolly.std.DocumentAndElementEventHandlers
import typingsJapgolly.std.Element
import typingsJapgolly.std.ElementCSSInlineStyle
import typingsJapgolly.std.ElementContentEditable
import typingsJapgolly.std.ElementInternals
import typingsJapgolly.std.EventListenerOrEventListenerObject
import typingsJapgolly.std.GlobalEventHandlers
import typingsJapgolly.std.HTMLElement
import typingsJapgolly.std.HTMLOrSVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsRouterUtilsInterfaceMod {
  
  @js.native
  trait HTMLStencilElement
    extends StObject
       with HTMLElement {
    
    /* standard dom */
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
    
    def componentOnReady(): js.Promise[this.type] = js.native
    
    /* standard dom */
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  }
  
  @js.native
  trait NavOutlet extends StObject {
    
    def getRouteId(): js.Promise[js.UndefOr[RouteID]] = js.native
    
    def setRouteId(id: String, params: Unit, direction: RouterDirection): js.Promise[RouteWrite] = js.native
    def setRouteId(id: String, params: Unit, direction: RouterDirection, animation: AnimationBuilder): js.Promise[RouteWrite] = js.native
    def setRouteId(id: String, params: ComponentProps[Null], direction: RouterDirection): js.Promise[RouteWrite] = js.native
    def setRouteId(id: String, params: ComponentProps[Null], direction: RouterDirection, animation: AnimationBuilder): js.Promise[RouteWrite] = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - scala.Any because Inheritance from two classes. Inlined getClass, hashCode, eq, equals, toString, ne, notify, notifyAll, wait, wait, wait, clone, finalize
  - scala.AnyRef because Inheritance from two classes. Inlined 
  - js.Any because Inheritance from two classes. Inlined 
  - js.Object because Inheritance from two classes. Inlined hasOwnProperty, propertyIsEnumerable, valueOf, toLocaleString, isPrototypeOf
  - typingsJapgolly.std.HTMLElement because Inheritance from two classes. Inlined accessKeyLabel, offsetWidth, accessKey, spellcheck, offsetTop, innerText, offsetLeft, offsetParent, lang, translate, autocapitalize, dir, outerText, draggable, hidden, inert, title, offsetHeight, attachInternals, click, addEventListener, addEventListener, removeEventListener, removeEventListener, removeEventListener, addEventListener
  - typingsJapgolly.ionicCore.distTypesComponentsRouterUtilsInterfaceMod.HTMLStencilElement because Inheritance from two classes. Inlined componentOnReady */ @js.native
  trait NavOutletElement
    extends StObject
       with NavOutlet
       with Element
       with DocumentAndElementEventHandlers
       with ElementCSSInlineStyle
       with ElementContentEditable
       with GlobalEventHandlers
       with HTMLOrSVGElement {
    
    /* standard dom */
    var accessKey: String = js.native
    
    /* standard dom */
    val accessKeyLabel: String = js.native
    
    /* standard dom */
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
    
    /* standard dom */
    def attachInternals(): ElementInternals = js.native
    
    /* standard dom */
    var autocapitalize: String = js.native
    
    /* standard dom */
    def click(): Unit = js.native
    
    def componentOnReady(): js.Promise[this.type] = js.native
    
    /* standard dom */
    var dir: String = js.native
    
    /* standard dom */
    var draggable: Boolean = js.native
    
    /* standard dom */
    var hidden: Boolean = js.native
    
    /* standard dom */
    var inert: Boolean = js.native
    
    /* standard dom */
    var innerText: String = js.native
    
    /* standard dom */
    var lang: String = js.native
    
    /* standard dom */
    val offsetHeight: Double = js.native
    
    /* standard dom */
    val offsetLeft: Double = js.native
    
    /* standard dom */
    val offsetParent: org.scalajs.dom.Element | Null = js.native
    
    /* standard dom */
    val offsetTop: Double = js.native
    
    /* standard dom */
    val offsetWidth: Double = js.native
    
    /* standard dom */
    var outerText: String = js.native
    
    /* standard dom */
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    
    /* standard dom */
    var spellcheck: Boolean = js.native
    
    /* standard dom */
    var title: String = js.native
    
    /* standard dom */
    var translate: Boolean = js.native
  }
  
  trait ParsedRoute extends StObject {
    
    /** Unparsed query string. */
    var queryString: js.UndefOr[String] = js.undefined
    
    /** Parts of the route (non empty "/" separated parts of an URL). */
    var segments: js.Array[String]
  }
  object ParsedRoute {
    
    inline def apply(segments: js.Array[String]): ParsedRoute = {
      val __obj = js.Dynamic.literal(segments = segments.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsedRoute]
    }
    
    extension [Self <: ParsedRoute](x: Self) {
      
      inline def setQueryString(value: String): Self = StObject.set(x, "queryString", value.asInstanceOf[js.Any])
      
      inline def setQueryStringUndefined: Self = StObject.set(x, "queryString", js.undefined)
      
      inline def setSegments(value: js.Array[String]): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
      
      inline def setSegmentsVarargs(value: String*): Self = StObject.set(x, "segments", js.Array(value*))
    }
  }
  
  type RouteChain = js.Array[RouteEntry]
  
  trait RouteEntry extends StObject {
    
    var beforeEnter: js.UndefOr[NavigationHookCallback] = js.undefined
    
    var beforeLeave: js.UndefOr[NavigationHookCallback] = js.undefined
    
    /** Component tag name or tab name. */
    var id: String
    
    var params: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    var segments: js.Array[String]
  }
  object RouteEntry {
    
    inline def apply(id: String, segments: js.Array[String]): RouteEntry = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], segments = segments.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouteEntry]
    }
    
    extension [Self <: RouteEntry](x: Self) {
      
      inline def setBeforeEnter(value: CallbackTo[NavigationHookResult | js.Promise[NavigationHookResult]]): Self = StObject.set(x, "beforeEnter", value.toJsFn)
      
      inline def setBeforeEnterUndefined: Self = StObject.set(x, "beforeEnter", js.undefined)
      
      inline def setBeforeLeave(value: CallbackTo[NavigationHookResult | js.Promise[NavigationHookResult]]): Self = StObject.set(x, "beforeLeave", value.toJsFn)
      
      inline def setBeforeLeaveUndefined: Self = StObject.set(x, "beforeLeave", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setParams(value: StringDictionary[Any]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setSegments(value: js.Array[String]): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
      
      inline def setSegmentsVarargs(value: String*): Self = StObject.set(x, "segments", js.Array(value*))
    }
  }
  
  trait RouteID extends StObject {
    
    var element: js.UndefOr[org.scalajs.dom.HTMLElement] = js.undefined
    
    var id: String
    
    var params: js.UndefOr[StringDictionary[Any]] = js.undefined
  }
  object RouteID {
    
    inline def apply(id: String): RouteID = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouteID]
    }
    
    extension [Self <: RouteID](x: Self) {
      
      inline def setElement(value: org.scalajs.dom.HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setParams(value: StringDictionary[Any]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    }
  }
  
  trait RouteNode
    extends StObject
       with RouteEntry {
    
    var children: RouteTree
  }
  object RouteNode {
    
    inline def apply(children: RouteTree, id: String, segments: js.Array[String]): RouteNode = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], segments = segments.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouteNode]
    }
    
    extension [Self <: RouteNode](x: Self) {
      
      inline def setChildren(value: RouteTree): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: RouteNode*): Self = StObject.set(x, "children", js.Array(value*))
    }
  }
  
  trait RouteRedirect extends StObject {
    
    var from: js.Array[String]
    
    var to: js.UndefOr[ParsedRoute] = js.undefined
  }
  object RouteRedirect {
    
    inline def apply(from: js.Array[String]): RouteRedirect = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouteRedirect]
    }
    
    extension [Self <: RouteRedirect](x: Self) {
      
      inline def setFrom(value: js.Array[String]): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromVarargs(value: String*): Self = StObject.set(x, "from", js.Array(value*))
      
      inline def setTo(value: ParsedRoute): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    }
  }
  
  type RouteTree = js.Array[RouteNode]
  
  trait RouteWrite extends StObject {
    
    var changed: Boolean
    
    var element: js.UndefOr[org.scalajs.dom.HTMLElement] = js.undefined
    
    var markVisible: js.UndefOr[js.Function0[Unit | js.Promise[Unit]]] = js.undefined
  }
  object RouteWrite {
    
    inline def apply(changed: Boolean): RouteWrite = {
      val __obj = js.Dynamic.literal(changed = changed.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouteWrite]
    }
    
    extension [Self <: RouteWrite](x: Self) {
      
      inline def setChanged(value: Boolean): Self = StObject.set(x, "changed", value.asInstanceOf[js.Any])
      
      inline def setElement(value: org.scalajs.dom.HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      inline def setMarkVisible(value: CallbackTo[Unit | js.Promise[Unit]]): Self = StObject.set(x, "markVisible", value.toJsFn)
      
      inline def setMarkVisibleUndefined: Self = StObject.set(x, "markVisible", js.undefined)
    }
  }
  
  @js.native
  trait RouterCustomEvent
    extends StObject
       with CustomEvent[Any] {
    
    @JSName("detail")
    var detail_RouterCustomEvent: RouterEventDetail = js.native
    
    @JSName("target")
    var target_RouterCustomEvent: HTMLIonRouterElement = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.ionicCore.ionicCoreStrings.forward
    - typingsJapgolly.ionicCore.ionicCoreStrings.back
    - typingsJapgolly.ionicCore.ionicCoreStrings.root
  */
  trait RouterDirection extends StObject
  object RouterDirection {
    
    inline def back: typingsJapgolly.ionicCore.ionicCoreStrings.back = "back".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.back]
    
    inline def forward: typingsJapgolly.ionicCore.ionicCoreStrings.forward = "forward".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.forward]
    
    inline def root: typingsJapgolly.ionicCore.ionicCoreStrings.root = "root".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.root]
  }
  
  trait RouterEventDetail extends StObject {
    
    var from: String | Null
    
    var redirectedFrom: String | Null
    
    var to: String
  }
  object RouterEventDetail {
    
    inline def apply(to: String): RouterEventDetail = {
      val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any], from = null, redirectedFrom = null)
      __obj.asInstanceOf[RouterEventDetail]
    }
    
    extension [Self <: RouterEventDetail](x: Self) {
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromNull: Self = StObject.set(x, "from", null)
      
      inline def setRedirectedFrom(value: String): Self = StObject.set(x, "redirectedFrom", value.asInstanceOf[js.Any])
      
      inline def setRedirectedFromNull: Self = StObject.set(x, "redirectedFrom", null)
      
      inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
}
