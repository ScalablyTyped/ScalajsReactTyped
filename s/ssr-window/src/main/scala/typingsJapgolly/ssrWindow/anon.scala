package typingsJapgolly.ssrWindow

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ActiveElement extends StObject {
    
    var activeElement: Blur
    
    def addEventListener(): Unit
    
    def createElement(): ChildNodes
    
    def createElementNS(): js.Object
    
    def createEvent(): InitEvent
    
    def getElementById(): Any
    
    def importNode(): Any
    
    var location: Hash
    
    def querySelector(): Any
    
    def querySelectorAll(): js.Array[Any]
    
    def removeEventListener(): Unit
  }
  object ActiveElement {
    
    inline def apply(
      activeElement: Blur,
      addEventListener: Callback,
      createElement: CallbackTo[ChildNodes],
      createElementNS: CallbackTo[js.Object],
      createEvent: CallbackTo[InitEvent],
      getElementById: CallbackTo[Any],
      importNode: CallbackTo[Any],
      location: Hash,
      querySelector: CallbackTo[Any],
      querySelectorAll: CallbackTo[js.Array[Any]],
      removeEventListener: Callback
    ): ActiveElement = {
      val __obj = js.Dynamic.literal(activeElement = activeElement.asInstanceOf[js.Any], addEventListener = addEventListener.toJsFn, createElement = createElement.toJsFn, createElementNS = createElementNS.toJsFn, createEvent = createEvent.toJsFn, getElementById = getElementById.toJsFn, importNode = importNode.toJsFn, location = location.asInstanceOf[js.Any], querySelector = querySelector.toJsFn, querySelectorAll = querySelectorAll.toJsFn, removeEventListener = removeEventListener.toJsFn)
      __obj.asInstanceOf[ActiveElement]
    }
    
    extension [Self <: ActiveElement](x: Self) {
      
      inline def setActiveElement(value: Blur): Self = StObject.set(x, "activeElement", value.asInstanceOf[js.Any])
      
      inline def setAddEventListener(value: Callback): Self = StObject.set(x, "addEventListener", value.toJsFn)
      
      inline def setCreateElement(value: CallbackTo[ChildNodes]): Self = StObject.set(x, "createElement", value.toJsFn)
      
      inline def setCreateElementNS(value: CallbackTo[js.Object]): Self = StObject.set(x, "createElementNS", value.toJsFn)
      
      inline def setCreateEvent(value: CallbackTo[InitEvent]): Self = StObject.set(x, "createEvent", value.toJsFn)
      
      inline def setGetElementById(value: CallbackTo[Any]): Self = StObject.set(x, "getElementById", value.toJsFn)
      
      inline def setImportNode(value: CallbackTo[Any]): Self = StObject.set(x, "importNode", value.toJsFn)
      
      inline def setLocation(value: Hash): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setQuerySelector(value: CallbackTo[Any]): Self = StObject.set(x, "querySelector", value.toJsFn)
      
      inline def setQuerySelectorAll(value: CallbackTo[js.Array[Any]]): Self = StObject.set(x, "querySelectorAll", value.toJsFn)
      
      inline def setRemoveEventListener(value: Callback): Self = StObject.set(x, "removeEventListener", value.toJsFn)
    }
  }
  
  trait Back extends StObject {
    
    def back(): Unit
    
    def go(): Unit
    
    def pushState(): Unit
    
    def replaceState(): Unit
  }
  object Back {
    
    inline def apply(back: Callback, go: Callback, pushState: Callback, replaceState: Callback): Back = {
      val __obj = js.Dynamic.literal(back = back.toJsFn, go = go.toJsFn, pushState = pushState.toJsFn, replaceState = replaceState.toJsFn)
      __obj.asInstanceOf[Back]
    }
    
    extension [Self <: Back](x: Self) {
      
      inline def setBack(value: Callback): Self = StObject.set(x, "back", value.toJsFn)
      
      inline def setGo(value: Callback): Self = StObject.set(x, "go", value.toJsFn)
      
      inline def setPushState(value: Callback): Self = StObject.set(x, "pushState", value.toJsFn)
      
      inline def setReplaceState(value: Callback): Self = StObject.set(x, "replaceState", value.toJsFn)
    }
  }
  
  trait Blur extends StObject {
    
    def blur(): Unit
    
    var nodeName: String
  }
  object Blur {
    
    inline def apply(blur: Callback, nodeName: String): Blur = {
      val __obj = js.Dynamic.literal(blur = blur.toJsFn, nodeName = nodeName.asInstanceOf[js.Any])
      __obj.asInstanceOf[Blur]
    }
    
    extension [Self <: Blur](x: Self) {
      
      inline def setBlur(value: Callback): Self = StObject.set(x, "blur", value.toJsFn)
      
      inline def setNodeName(value: String): Self = StObject.set(x, "nodeName", value.asInstanceOf[js.Any])
    }
  }
  
  trait ChildNodes extends StObject {
    
    var childNodes: js.Array[Any]
    
    var children: js.Array[Any]
    
    def getElementsByTagName(): js.Array[Any]
    
    def setAttribute(): Unit
  }
  object ChildNodes {
    
    inline def apply(
      childNodes: js.Array[Any],
      children: js.Array[Any],
      getElementsByTagName: CallbackTo[js.Array[Any]],
      setAttribute: Callback
    ): ChildNodes = {
      val __obj = js.Dynamic.literal(childNodes = childNodes.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], getElementsByTagName = getElementsByTagName.toJsFn, setAttribute = setAttribute.toJsFn)
      __obj.asInstanceOf[ChildNodes]
    }
    
    extension [Self <: ChildNodes](x: Self) {
      
      inline def setChildNodes(value: js.Array[Any]): Self = StObject.set(x, "childNodes", value.asInstanceOf[js.Any])
      
      inline def setChildNodesVarargs(value: Any*): Self = StObject.set(x, "childNodes", js.Array(value*))
      
      inline def setChildren(value: js.Array[Any]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: Any*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setGetElementsByTagName(value: CallbackTo[js.Array[Any]]): Self = StObject.set(x, "getElementsByTagName", value.toJsFn)
      
      inline def setSetAttribute(value: Callback): Self = StObject.set(x, "setAttribute", value.toJsFn)
    }
  }
  
  trait GetPropertyValue extends StObject {
    
    def getPropertyValue(): String
  }
  object GetPropertyValue {
    
    inline def apply(getPropertyValue: CallbackTo[String]): GetPropertyValue = {
      val __obj = js.Dynamic.literal(getPropertyValue = getPropertyValue.toJsFn)
      __obj.asInstanceOf[GetPropertyValue]
    }
    
    extension [Self <: GetPropertyValue](x: Self) {
      
      inline def setGetPropertyValue(value: CallbackTo[String]): Self = StObject.set(x, "getPropertyValue", value.toJsFn)
    }
  }
  
  trait Hash extends StObject {
    
    var hash: String
    
    var host: String
    
    var hostname: String
    
    var href: String
    
    var origin: String
    
    var pathname: String
    
    var protocol: String
    
    var search: String
  }
  object Hash {
    
    inline def apply(
      hash: String,
      host: String,
      hostname: String,
      href: String,
      origin: String,
      pathname: String,
      protocol: String,
      search: String
    ): Hash = {
      val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], hostname = hostname.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any])
      __obj.asInstanceOf[Hash]
    }
    
    extension [Self <: Hash](x: Self) {
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      inline def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    }
  }
  
  trait InitEvent extends StObject {
    
    def initEvent(): Unit
  }
  object InitEvent {
    
    inline def apply(initEvent: Callback): InitEvent = {
      val __obj = js.Dynamic.literal(initEvent = initEvent.toJsFn)
      __obj.asInstanceOf[InitEvent]
    }
    
    extension [Self <: InitEvent](x: Self) {
      
      inline def setInitEvent(value: Callback): Self = StObject.set(x, "initEvent", value.toJsFn)
    }
  }
  
  trait UserAgent extends StObject {
    
    var userAgent: String
  }
  object UserAgent {
    
    inline def apply(userAgent: String): UserAgent = {
      val __obj = js.Dynamic.literal(userAgent = userAgent.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserAgent]
    }
    
    extension [Self <: UserAgent](x: Self) {
      
      inline def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
    }
  }
}
