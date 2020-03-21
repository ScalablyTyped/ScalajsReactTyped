package typingsJapgolly.xhrMock

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.std.AddEventListenerOptions
import typingsJapgolly.std.BodyInit
import typingsJapgolly.std.Document_
import typingsJapgolly.std.EventListenerOptions
import typingsJapgolly.std.Event_
import typingsJapgolly.std.XMLHttpRequestResponseType
import typingsJapgolly.std.XMLHttpRequestUpload
import typingsJapgolly.std.stdStrings.readystatechange
import typingsJapgolly.xhrMock.mockXMLHttpRequestEventTargetMod.MockXMLHttpRequestEventTarget
import typingsJapgolly.xhrMock.typesMod.ErrorCallbackEvent
import typingsJapgolly.xhrMock.typesMod.MockFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xhr-mock/lib/MockXMLHttpRequest", JSImport.Namespace)
@js.native
object mockXMLHttpRequestMod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typingsJapgolly.std.EventTarget because Already inherited
  - typingsJapgolly.std.XMLHttpRequestEventTarget because Already inherited
  - typingsJapgolly.std.XMLHttpRequest because var conflicts: onabort, onerror, onload, onloadend, onloadstart, onprogress, ontimeout. Inlined DONE, HEADERS_RECEIVED, LOADING, OPENED, UNSENT, onreadystatechange, readyState, response, responseText, responseType, responseURL, responseXML, status, statusText, timeout, upload, withCredentials, abort, addEventListener_readystatechange, addEventListener_readystatechange, addEventListener_readystatechange, getAllResponseHeaders, getResponseHeader, open, open, open, open, open, overrideMimeType, removeEventListener_readystatechange, removeEventListener_readystatechange, removeEventListener_readystatechange, send, send, send, setRequestHeader */ @js.native
  trait MockXMLHttpRequest extends MockXMLHttpRequestEventTarget {
    val DONE: Double | ReadyState = js.native
    val HEADERS_RECEIVED: Double | ReadyState = js.native
    val LOADING: Double | ReadyState = js.native
    val OPENED: Double | ReadyState = js.native
    val UNSENT: Double | ReadyState = js.native
    var _timeout: js.Any = js.native
    var _timeoutTimer: js.Any = js.native
    var isAborted: js.Any = js.native
    var isSending: js.Any = js.native
    var isSynchronous: js.Any = js.native
    var isTimedOut: js.Any = js.native
    var isUploadComplete: js.Any = js.native
    var onreadystatechange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]) | Null = js.native
    var readyState: Double | ReadyState = js.native
    var req: js.Any = js.native
    var res: js.Any = js.native
    val response: js.Any = js.native
    val responseText: String = js.native
    var responseType: XMLHttpRequestResponseType = js.native
    var responseURL: String = js.native
    val responseXML: Document_ | Null = js.native
    val status: Double = js.native
    val statusText: String = js.native
    var timeout: Double = js.native
    var upload: XMLHttpRequestUpload = js.native
    var withCredentials: Boolean = js.native
    /**
      * Cancels any network activity.
      */
    def abort(): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_readystatechange(`type`: readystatechange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_readystatechange(
      `type`: readystatechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_readystatechange(
      `type`: readystatechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    /* private */ def applyNetworkError(): js.Any = js.native
    def getAllResponseHeaders(): String = js.native
    def getResponseHeader(name: String): Null | String = js.native
    /* private */ def handleError(): js.Any = js.native
    /* private */ def handleError(error: js.Any): js.Any = js.native
    /* private */ def handleResponseBody(res: js.Any): js.Any = js.native
    def msCachingEnabled(): Boolean = js.native
    def onreadystatechange(ev: Event_): js.Any = js.native
    /**
      * Sets the request method, request URL, and synchronous flag.
      * 
      * Throws a "SyntaxError" DOMException if either method is not a valid HTTP method or url cannot be parsed.
      * 
      * Throws a "SecurityError" DOMException if method is a case-insensitive match for `CONNECT`, `TRACE`, or `TRACK`.
      * 
      * Throws an "InvalidAccessError" DOMException if async is false, current global object is a Window object, and the timeout attribute is not zero or the responseType attribute is not the empty string.
      */
    def open(method: String, url: String): Unit = js.native
    def open(method: String, url: String, async: Boolean): Unit = js.native
    def open(method: String, url: String, async: Boolean, username: String): Unit = js.native
    def open(method: String, url: String, async: Boolean, username: String, password: String): Unit = js.native
    def open(method: String, url: String, async: Boolean, username: Null, password: String): Unit = js.native
    /**
      * Acts as if the `Content-Type` header value for response is mime. (It does not actually change the header though.)
      * 
      * Throws an "InvalidStateError" DOMException if state is loading or done.
      */
    def overrideMimeType(mime: String): Unit = js.native
    /* private */ def receiveResponse(res: js.Any): js.Any = js.native
    @JSName("removeEventListener")
    def removeEventListener_readystatechange(`type`: readystatechange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_readystatechange(
      `type`: readystatechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_readystatechange(
      `type`: readystatechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
      options: EventListenerOptions
    ): Unit = js.native
    /* private */ def reportError(event: js.Any): js.Any = js.native
    /**
      * Initiates the request. The body argument provides the request body, if any, and is ignored if the request method is GET or HEAD.
      * 
      * Throws an "InvalidStateError" DOMException if either state is not opened or the send() flag is set.
      */
    def send(): Unit = js.native
    def send(body: js.Any): Unit = js.native
    def send(body: BodyInit): Unit = js.native
    def send(body: Document_): Unit = js.native
    /* private */ def sendAsync(): js.Any = js.native
    /* private */ def sendRequest(req: js.Any): js.Any = js.native
    /* private */ def sendSync(): js.Any = js.native
    /**
      * Combines a header in author request headers.
      * 
      * Throws an "InvalidStateError" DOMException if either state is not opened or the send() flag is set.
      * 
      * Throws a "SyntaxError" DOMException if name is not a header name or if value is not a header value.
      */
    def setRequestHeader(name: String, value: String): Unit = js.native
  }
  
  @js.native
  sealed trait ReadyState extends js.Object
  
  @js.native
  class default () extends MockXMLHttpRequest
  
  @js.native
  object ReadyState extends js.Object {
    @js.native
    sealed trait DONE extends ReadyState
    
    @js.native
    sealed trait HEADERS_RECEIVED extends ReadyState
    
    @js.native
    sealed trait LOADING extends ReadyState
    
    @js.native
    sealed trait OPENED extends ReadyState
    
    @js.native
    sealed trait UNSENT extends ReadyState
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ReadyState with Double] = js.native
    /* 4 */ @js.native
    object DONE extends TopLevel[DONE with Double]
    
    /* 2 */ @js.native
    object HEADERS_RECEIVED extends TopLevel[HEADERS_RECEIVED with Double]
    
    /* 3 */ @js.native
    object LOADING extends TopLevel[LOADING with Double]
    
    /* 1 */ @js.native
    object OPENED extends TopLevel[OPENED with Double]
    
    /* 0 */ @js.native
    object UNSENT extends TopLevel[UNSENT with Double]
    
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    val DONE: ReadyState = js.native
    val HEADERS_RECEIVED: ReadyState = js.native
    val LOADING: ReadyState = js.native
    val OPENED: ReadyState = js.native
    val UNSENT: ReadyState = js.native
    var handlers: js.Array[MockFunction] = js.native
    /**
      * Add a mock handler
      */
    def addHandler(fn: MockFunction): Unit = js.native
    def errorCallback(event: ErrorCallbackEvent): Unit = js.native
    /**
      * Remove all request handlers
      */
    def removeAllHandlers(): Unit = js.native
    /**
      * Remove a mock handler
      */
    def removeHandler(fn: MockFunction): Unit = js.native
  }
  
}

