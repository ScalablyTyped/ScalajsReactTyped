package typingsJapgolly.amazonConnectStreams.connect

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLElement
import typingsJapgolly.std.Number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Core extends StObject {
  
  /**
    * Returns a promise that is resolved with the list of media devices from iframe.
    *
    * @param timeout A timeout for the request in milliseconds.
    */
  def getFrameMediaDevices(timeout: Number): js.Promise[js.Array[Any]]
  
  /**
    * Gets the `WebSocket` manager.
    * This method is only used when integrating with `amazon-connect-chatjs`.
    */
  def getWebSocketManager(): Any
  
  /**
    * Integrates with Amazon Connect by loading the pre-built CCP located at `ccpUrl` into an iframe and placing it into the `container` provided.
    * API requests are funneled through this CCP and agent and contact updates are published through it and made available to your JS client code.
    *
    * @param container The DOM element to place the CCP.
    * @param options The CCP init options.
    */
  def initCCP(container: HTMLElement, options: InitCCPOptions): Unit
  
  /**
    * Subscribes a callback that starts whenever authorization fails (i.e. access denied).
    *
    * @param callback A callback that will start whenever access is denied.
    */
  def onAccessDenied(callback: SuccessFailCallback[js.Array[Any]]): Unit
  
  /**
    * Subscribes a callback that starts whenever authentication fails (e.g. SAML authentication).
    *
    * @param callback A callback that will start whenever authentication fails.
    */
  def onAuthFail(callback: SuccessFailCallback[js.Array[Any]]): Unit
  
  /**
    * Subscribes a callback function to be called when multiple agent authorization api failures have happened.
    * After this event occurs, streams will not try to redirect the user to login when more agent authorization api failures happen. 
    * Therefore, it may be prudent to indicate to the agent that there is a problem related to authorization.
    * 
    * @param f The callback function.
    */
  def onAuthorizeRetriesExhausted(f: js.Function): Unit
  
  /**
    * Subscribes a callback function to be called when the agent authorization api succeeds.
    */
  def onAuthorizeSuccess(f: js.Function): Unit
  
  /**
    * Subscribes a callback function to be called when multiple authorization-type CTI API failures have happened.
    * After this event occurs, streams will not try to re-authenticate the user when more CTI API authorization-type (401) failures happen.
    * Note that CTI APIs are the agent, contact, and connection apis (specifically, those listed under the `connect.ClientMethods` enum). 
    * Therefore, it may be prudent to indicate to the agent that there is a problem related to authorization.
    * 
    * @param f The callback function.
    */
  def onCTIAuthorizeRetriesExhausted(f: js.Function): Unit
  
  /**
    * Subscribes a callback function to be called when the connect.EventType.IFRAME_RETRIES_EXHAUSTED event is triggered.
    * 
    * @param f The callback function.
    */
  def onIframeRetriesExhausted(f: js.Function): Unit
  
  /**
    * Subscribes a callback that executes when the CCP initialization is completed.
    *
    * @param callback A callback that will execute when the CCP initialization is completed.
    */
  def onInitialized(callback: js.Function): Unit
  
  /**
    * Subscribes a callback that starts whenever the currently selected contact on the CCP changes.
    * The callback is called when the contact changes in the UI (i.e. via `click` events) or via `connect.core.viewContact()`.
    *
    * @param callback A callback that will receive a `ViewContactEvent` object.
    */
  def onViewContact(callback: ViewContactCallback): Unit
  
  /**
    * Terminates Amazon Connect Streams. Removing any subscription methods that have been called.
    * The CCP iframe will not be removed though, so you'll have to manually remove it.
    */
  def terminate(): Unit
  
  /**
    * Global upstream conduit for external use.
    * 
    */
  var upstream: js.UndefOr[js.Object | Null] = js.undefined
  
  /**
    * Changes the currently selected contact in the CCP user interface.
    * Useful when an agent handles more than one concurrent chat.
    *
    * @param contactId The contact ID.
    */
  def viewContact(contactId: String): Unit
}
object Core {
  
  inline def apply(
    getFrameMediaDevices: Number => js.Promise[js.Array[Any]],
    getWebSocketManager: CallbackTo[Any],
    initCCP: (HTMLElement, InitCCPOptions) => Callback,
    onAccessDenied: SuccessFailCallback[js.Array[Any]] => Callback,
    onAuthFail: SuccessFailCallback[js.Array[Any]] => Callback,
    onAuthorizeRetriesExhausted: js.Function => Callback,
    onAuthorizeSuccess: js.Function => Callback,
    onCTIAuthorizeRetriesExhausted: js.Function => Callback,
    onIframeRetriesExhausted: js.Function => Callback,
    onInitialized: js.Function => Callback,
    onViewContact: ViewContactCallback => Callback,
    terminate: Callback,
    viewContact: String => Callback
  ): Core = {
    val __obj = js.Dynamic.literal(getFrameMediaDevices = js.Any.fromFunction1(getFrameMediaDevices), getWebSocketManager = getWebSocketManager.toJsFn, initCCP = js.Any.fromFunction2((t0: HTMLElement, t1: InitCCPOptions) => (initCCP(t0, t1)).runNow()), onAccessDenied = js.Any.fromFunction1((t0: SuccessFailCallback[js.Array[Any]]) => onAccessDenied(t0).runNow()), onAuthFail = js.Any.fromFunction1((t0: SuccessFailCallback[js.Array[Any]]) => onAuthFail(t0).runNow()), onAuthorizeRetriesExhausted = js.Any.fromFunction1((t0: js.Function) => onAuthorizeRetriesExhausted(t0).runNow()), onAuthorizeSuccess = js.Any.fromFunction1((t0: js.Function) => onAuthorizeSuccess(t0).runNow()), onCTIAuthorizeRetriesExhausted = js.Any.fromFunction1((t0: js.Function) => onCTIAuthorizeRetriesExhausted(t0).runNow()), onIframeRetriesExhausted = js.Any.fromFunction1((t0: js.Function) => onIframeRetriesExhausted(t0).runNow()), onInitialized = js.Any.fromFunction1((t0: js.Function) => onInitialized(t0).runNow()), onViewContact = js.Any.fromFunction1((t0: ViewContactCallback) => onViewContact(t0).runNow()), terminate = terminate.toJsFn, viewContact = js.Any.fromFunction1((t0: String) => viewContact(t0).runNow()))
    __obj.asInstanceOf[Core]
  }
  
  extension [Self <: Core](x: Self) {
    
    inline def setGetFrameMediaDevices(value: Number => js.Promise[js.Array[Any]]): Self = StObject.set(x, "getFrameMediaDevices", js.Any.fromFunction1(value))
    
    inline def setGetWebSocketManager(value: CallbackTo[Any]): Self = StObject.set(x, "getWebSocketManager", value.toJsFn)
    
    inline def setInitCCP(value: (HTMLElement, InitCCPOptions) => Callback): Self = StObject.set(x, "initCCP", js.Any.fromFunction2((t0: HTMLElement, t1: InitCCPOptions) => (value(t0, t1)).runNow()))
    
    inline def setOnAccessDenied(value: SuccessFailCallback[js.Array[Any]] => Callback): Self = StObject.set(x, "onAccessDenied", js.Any.fromFunction1((t0: SuccessFailCallback[js.Array[Any]]) => value(t0).runNow()))
    
    inline def setOnAuthFail(value: SuccessFailCallback[js.Array[Any]] => Callback): Self = StObject.set(x, "onAuthFail", js.Any.fromFunction1((t0: SuccessFailCallback[js.Array[Any]]) => value(t0).runNow()))
    
    inline def setOnAuthorizeRetriesExhausted(value: js.Function => Callback): Self = StObject.set(x, "onAuthorizeRetriesExhausted", js.Any.fromFunction1((t0: js.Function) => value(t0).runNow()))
    
    inline def setOnAuthorizeSuccess(value: js.Function => Callback): Self = StObject.set(x, "onAuthorizeSuccess", js.Any.fromFunction1((t0: js.Function) => value(t0).runNow()))
    
    inline def setOnCTIAuthorizeRetriesExhausted(value: js.Function => Callback): Self = StObject.set(x, "onCTIAuthorizeRetriesExhausted", js.Any.fromFunction1((t0: js.Function) => value(t0).runNow()))
    
    inline def setOnIframeRetriesExhausted(value: js.Function => Callback): Self = StObject.set(x, "onIframeRetriesExhausted", js.Any.fromFunction1((t0: js.Function) => value(t0).runNow()))
    
    inline def setOnInitialized(value: js.Function => Callback): Self = StObject.set(x, "onInitialized", js.Any.fromFunction1((t0: js.Function) => value(t0).runNow()))
    
    inline def setOnViewContact(value: ViewContactCallback => Callback): Self = StObject.set(x, "onViewContact", js.Any.fromFunction1((t0: ViewContactCallback) => value(t0).runNow()))
    
    inline def setTerminate(value: Callback): Self = StObject.set(x, "terminate", value.toJsFn)
    
    inline def setUpstream(value: js.Object): Self = StObject.set(x, "upstream", value.asInstanceOf[js.Any])
    
    inline def setUpstreamNull: Self = StObject.set(x, "upstream", null)
    
    inline def setUpstreamUndefined: Self = StObject.set(x, "upstream", js.undefined)
    
    inline def setViewContact(value: String => Callback): Self = StObject.set(x, "viewContact", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
