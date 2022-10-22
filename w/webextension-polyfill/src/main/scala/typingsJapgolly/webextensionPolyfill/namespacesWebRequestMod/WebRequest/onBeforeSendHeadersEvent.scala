package typingsJapgolly.webextensionPolyfill.namespacesWebRequestMod.WebRequest

import typingsJapgolly.webextensionPolyfill.namespacesEventsMod.Events.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired before sending an HTTP request, once the request headers are available. This may occur after a TCP connection is
  * made to the server, but before any HTTP data is sent.
  */
@js.native
trait onBeforeSendHeadersEvent
  extends StObject
     with Event[
      js.Function1[/* details */ OnBeforeSendHeadersDetailsType, BlockingResponseOrPromise | Unit]
    ] {
  
  /**
    * Registers an event listener <em>callback</em> to an event.
    *
    * @param callback Called when an event occurs. The parameters of this function depend on the type of event.
    * @param filter A set of filters that restricts the events that will be sent to this listener.
    * @param extraInfoSpec Optional. Array of extra information that should be passed to the listener function.
    */
  def addListener(
    callback: js.Function1[/* details */ OnBeforeSendHeadersDetailsType, BlockingResponseOrPromise | Unit],
    filter: RequestFilter
  ): Unit = js.native
  def addListener(
    callback: js.Function1[/* details */ OnBeforeSendHeadersDetailsType, BlockingResponseOrPromise | Unit],
    filter: RequestFilter,
    extraInfoSpec: js.Array[OnBeforeSendHeadersOptions]
  ): Unit = js.native
}
