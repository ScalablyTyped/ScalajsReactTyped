package typingsJapgolly.angularWebsocket

import japgolly.scalajs.react.Callback
import org.scalajs.dom.CloseEvent
import org.scalajs.dom.Event
import org.scalajs.dom.MessageEvent
import org.scalajs.dom.WebSocket
import typingsJapgolly.angular.mod.IPromise
import typingsJapgolly.angular.mod.IScope
import typingsJapgolly.angularWebsocket.angularWebsocketStrings.arraybuffer
import typingsJapgolly.angularWebsocket.angularWebsocketStrings.blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  type IWebSocket = typingsJapgolly.angularWebsocket.mod.angularAugmentingMod.websocket.IWebSocket
  
  type IWebSocketConfigOptions = typingsJapgolly.angularWebsocket.mod.angularAugmentingMod.websocket.IWebSocketConfigOptions
  
  type IWebSocketMessageHandler = typingsJapgolly.angularWebsocket.mod.angularAugmentingMod.websocket.IWebSocketMessageHandler
  
  type IWebSocketMessageOptions = typingsJapgolly.angularWebsocket.mod.angularAugmentingMod.websocket.IWebSocketMessageOptions
  
  type IWebSocketProvider = typingsJapgolly.angularWebsocket.mod.angularAugmentingMod.websocket.IWebSocketProvider
  
  type IWebSocketQueueItem = typingsJapgolly.angularWebsocket.mod.angularAugmentingMod.websocket.IWebSocketQueueItem
  
  /* augmented module */
  object angularAugmentingMod {
    
    object websocket {
      
      @js.native
      trait IWebSocket extends StObject {
        
        /**
          * Closes the underlying socket, as long as no data is still being sent from the client.
          *
          * @param force if `true`, force close even if data is still being sent
          * @returns this instance, for method chaining
          */
        def close(): typingsJapgolly.angularWebsocket.mod.angularAugmentingMod.websocket.IWebSocket = js.native
        def close(force: Boolean): typingsJapgolly.angularWebsocket.mod.angularAugmentingMod.websocket.IWebSocket = js.native
        
        /**
          * The initial timeout.
          */
        var initialTimeout: Double = js.native
        
        /**
          * Maximun timeout used to determine reconnection delay.
          */
        var maxTimeout: Double = js.native
        
        /**
          * Adds a callback to be executed each time a socket connection is closed for
          * this instance.
          *
          * @param event event object
          * @returns this instance, for method chaining
          */
        def onClose(callback: js.Function1[/* event */ CloseEvent, Unit]): typingsJapgolly.angularWebsocket.mod.angularAugmentingMod.websocket.IWebSocket = js.native
        
        /**
          * List of callbacks to be executed when the socket is closed.
          */
        var onCloseCallbacks: js.Array[js.Function1[/* evt */ CloseEvent, Unit]] = js.native
        
        /**
          * Adds a callback to be executed each time a socket connection is closed for
          * this instance.
          *
          * @param event event object
          * @returns this instance, for method chaining
          */
        def onError(callback: js.Function1[/* event */ Event, Unit]): typingsJapgolly.angularWebsocket.mod.angularAugmentingMod.websocket.IWebSocket = js.native
        
        /**
          * List of callbacks to be executed when an error is received from the socket.
          */
        var onErrorCallbacks: js.Array[js.Function1[/* evt */ Event, Unit]] = js.native
        
        /**
          * Adds a callback to be executed each time a socket connection has an error for
          * this instance.
          *
          * @param event event object
          * @returns this instance, for method chaining
          */
        def onMessage(callback: js.Function1[/* event */ MessageEvent, Unit]): typingsJapgolly.angularWebsocket.mod.angularAugmentingMod.websocket.IWebSocket = js.native
        def onMessage(
          callback: js.Function1[/* event */ MessageEvent, Unit],
          options: typingsJapgolly.angularWebsocket.mod.angularAugmentingMod.websocket.IWebSocketMessageOptions
        ): typingsJapgolly.angularWebsocket.mod.angularAugmentingMod.websocket.IWebSocket = js.native
        
        /**
          * List of callbacks to be executed when a message is received from the socket.
          */
        var onMessageCallbacks: js.Array[
                typingsJapgolly.angularWebsocket.mod.angularAugmentingMod.websocket.IWebSocketMessageHandler
              ] = js.native
        
        /**
          * Adds a callback to be executed each time a socket connection is opened for
          * this instance.
          *
          * @param event event object
          * @returns this instance, for method chaining
          */
        def onOpen(callback: js.Function1[/* event */ Event, Unit]): typingsJapgolly.angularWebsocket.mod.angularAugmentingMod.websocket.IWebSocket = js.native
        
        /**
          * List of callbacks to be executed when the socket is opened.
          */
        var onOpenCallbacks: js.Array[js.Function1[/* evt */ Event, Unit]] = js.native
        
        /**
          * Returns either the readyState value from the underlying WebSocket instance
          * or a proprietary value representing the internal state
          */
        var readyState: Double = js.native
        
        /**
          * Adds data to a queue, and attempts to send if the socket is ready.
          *
          * @param data data to send, if this is an object, it will be stringified before sending
          */
        def send(data: String): IPromise[Any] = js.native
        def send(data: js.Object): IPromise[Any] = js.native
        
        /**
          * Queue of send calls to be made on socket when socket is able to receive data.
          */
        var sendQueue: js.Array[
                typingsJapgolly.angularWebsocket.mod.angularAugmentingMod.websocket.IWebSocketQueueItem
              ] = js.native
        
        /**
          * WebSocket instance.
          */
        var socket: WebSocket = js.native
      }
      
      /**
        * Options available to be specified for IWebSocketProvider.
        */
      trait IWebSocketConfigOptions extends StObject {
        
        var binaryType: js.UndefOr[blob | arraybuffer] = js.undefined
        
        var initialTimeout: js.UndefOr[Double] = js.undefined
        
        var maxTimeout: js.UndefOr[Double] = js.undefined
        
        var reconnectIfNotNormalClose: js.UndefOr[Boolean] = js.undefined
        
        var rootScopeFailOver: js.UndefOr[Boolean] = js.undefined
        
        var scope: js.UndefOr[IScope] = js.undefined
        
        var useApplyAsync: js.UndefOr[Boolean] = js.undefined
      }
      object IWebSocketConfigOptions {
        
        inline def apply(): typingsJapgolly.angularWebsocket.mod.angularAugmentingMod.websocket.IWebSocketConfigOptions = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[typingsJapgolly.angularWebsocket.mod.angularAugmentingMod.websocket.IWebSocketConfigOptions]
        }
        
        extension [Self <: typingsJapgolly.angularWebsocket.mod.angularAugmentingMod.websocket.IWebSocketConfigOptions](x: Self) {
          
          inline def setBinaryType(value: blob | arraybuffer): Self = StObject.set(x, "binaryType", value.asInstanceOf[js.Any])
          
          inline def setBinaryTypeUndefined: Self = StObject.set(x, "binaryType", js.undefined)
          
          inline def setInitialTimeout(value: Double): Self = StObject.set(x, "initialTimeout", value.asInstanceOf[js.Any])
          
          inline def setInitialTimeoutUndefined: Self = StObject.set(x, "initialTimeout", js.undefined)
          
          inline def setMaxTimeout(value: Double): Self = StObject.set(x, "maxTimeout", value.asInstanceOf[js.Any])
          
          inline def setMaxTimeoutUndefined: Self = StObject.set(x, "maxTimeout", js.undefined)
          
          inline def setReconnectIfNotNormalClose(value: Boolean): Self = StObject.set(x, "reconnectIfNotNormalClose", value.asInstanceOf[js.Any])
          
          inline def setReconnectIfNotNormalCloseUndefined: Self = StObject.set(x, "reconnectIfNotNormalClose", js.undefined)
          
          inline def setRootScopeFailOver(value: Boolean): Self = StObject.set(x, "rootScopeFailOver", value.asInstanceOf[js.Any])
          
          inline def setRootScopeFailOverUndefined: Self = StObject.set(x, "rootScopeFailOver", js.undefined)
          
          inline def setScope(value: IScope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
          
          inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
          
          inline def setUseApplyAsync(value: Boolean): Self = StObject.set(x, "useApplyAsync", value.asInstanceOf[js.Any])
          
          inline def setUseApplyAsyncUndefined: Self = StObject.set(x, "useApplyAsync", js.undefined)
        }
      }
      
      /** Type corresponding to onMessage callbacks stored in $Websocket#onMessageCallbacks instance. */
      trait IWebSocketMessageHandler extends StObject {
        
        var autoApply: Boolean
        
        def fn(evt: MessageEvent): Unit
        
        var pattern: js.UndefOr[String | js.RegExp] = js.undefined
      }
      object IWebSocketMessageHandler {
        
        inline def apply(autoApply: Boolean, fn: MessageEvent => Callback): typingsJapgolly.angularWebsocket.mod.angularAugmentingMod.websocket.IWebSocketMessageHandler = {
          val __obj = js.Dynamic.literal(autoApply = autoApply.asInstanceOf[js.Any], fn = js.Any.fromFunction1((t0: MessageEvent) => fn(t0).runNow()))
          __obj.asInstanceOf[typingsJapgolly.angularWebsocket.mod.angularAugmentingMod.websocket.IWebSocketMessageHandler]
        }
        
        extension [Self <: typingsJapgolly.angularWebsocket.mod.angularAugmentingMod.websocket.IWebSocketMessageHandler](x: Self) {
          
          inline def setAutoApply(value: Boolean): Self = StObject.set(x, "autoApply", value.asInstanceOf[js.Any])
          
          inline def setFn(value: MessageEvent => Callback): Self = StObject.set(x, "fn", js.Any.fromFunction1((t0: MessageEvent) => value(t0).runNow()))
          
          inline def setPattern(value: String | js.RegExp): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
          
          inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
        }
      }
      
      /** Options available to be specified for IWebSocket.onMessage */
      trait IWebSocketMessageOptions extends StObject {
        
        /** If true, each message handled will safely call `$rootScope.$digest()`. */
        var autoApply: js.UndefOr[Boolean] = js.undefined
        
        /**
          * If specified, only messages that match the filter will cause the message event
          * to be fired.
          */
        var filter: js.UndefOr[String | js.RegExp] = js.undefined
      }
      object IWebSocketMessageOptions {
        
        inline def apply(): typingsJapgolly.angularWebsocket.mod.angularAugmentingMod.websocket.IWebSocketMessageOptions = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[typingsJapgolly.angularWebsocket.mod.angularAugmentingMod.websocket.IWebSocketMessageOptions]
        }
        
        extension [Self <: typingsJapgolly.angularWebsocket.mod.angularAugmentingMod.websocket.IWebSocketMessageOptions](x: Self) {
          
          inline def setAutoApply(value: Boolean): Self = StObject.set(x, "autoApply", value.asInstanceOf[js.Any])
          
          inline def setAutoApplyUndefined: Self = StObject.set(x, "autoApply", js.undefined)
          
          inline def setFilter(value: String | js.RegExp): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
          
          inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
        }
      }
      
      /**
        * Creates and opens an IWebSocket instance.
        *
        * @param url url to connect to
        * @return websocket instance
        */
      type IWebSocketProvider = js.Function3[
            /* url */ String, 
            /* protocols */ js.UndefOr[
              String | js.Array[String] | typingsJapgolly.angularWebsocket.mod.angularAugmentingMod.websocket.IWebSocketConfigOptions
            ], 
            /* options */ js.UndefOr[
              typingsJapgolly.angularWebsocket.mod.angularAugmentingMod.websocket.IWebSocketConfigOptions
            ], 
            typingsJapgolly.angularWebsocket.mod.angularAugmentingMod.websocket.IWebSocket
          ]
      
      /** Type corresponding to items stored in $WebSocket#sendQueue instance. */
      trait IWebSocketQueueItem extends StObject {
        
        var defered: IPromise[Unit]
        
        var message: Any
      }
      object IWebSocketQueueItem {
        
        inline def apply(defered: IPromise[Unit], message: Any): typingsJapgolly.angularWebsocket.mod.angularAugmentingMod.websocket.IWebSocketQueueItem = {
          val __obj = js.Dynamic.literal(defered = defered.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
          __obj.asInstanceOf[typingsJapgolly.angularWebsocket.mod.angularAugmentingMod.websocket.IWebSocketQueueItem]
        }
        
        extension [Self <: typingsJapgolly.angularWebsocket.mod.angularAugmentingMod.websocket.IWebSocketQueueItem](x: Self) {
          
          inline def setDefered(value: IPromise[Unit]): Self = StObject.set(x, "defered", value.asInstanceOf[js.Any])
          
          inline def setMessage(value: Any): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
        }
      }
    }
  }
}
