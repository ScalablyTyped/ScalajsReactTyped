package typingsJapgolly.angularSignalrHub

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.jquery.JQueryDeferred
import typingsJapgolly.jquery.JQueryPromise
import typingsJapgolly.signalr.SignalR.Connection
import typingsJapgolly.signalr.SignalR.Hub.Proxy
import typingsJapgolly.signalr.SignalR.StateChanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngSignalr {
  
  trait Hub extends StObject {
    
    def connect(): JQueryPromise[Any]
    
    var connection: Connection
    
    def disconnect(): Unit
    
    var hubName: String
    
    def invoke(method: String, args: Any*): JQueryDeferred[Any]
    
    def on(event: String, fn: js.Function1[/* repeated */ Any, Unit]): Unit
    
    var proxy: Proxy
  }
  object Hub {
    
    inline def apply(
      connect: CallbackTo[JQueryPromise[Any]],
      connection: Connection,
      disconnect: Callback,
      hubName: String,
      invoke: (String, /* repeated */ Any) => JQueryDeferred[Any],
      on: (String, js.Function1[/* repeated */ Any, Unit]) => Callback,
      proxy: Proxy
    ): Hub = {
      val __obj = js.Dynamic.literal(connect = connect.toJsFn, connection = connection.asInstanceOf[js.Any], disconnect = disconnect.toJsFn, hubName = hubName.asInstanceOf[js.Any], invoke = js.Any.fromFunction2(invoke), on = js.Any.fromFunction2((t0: String, t1: js.Function1[/* repeated */ Any, Unit]) => (on(t0, t1)).runNow()), proxy = proxy.asInstanceOf[js.Any])
      __obj.asInstanceOf[Hub]
    }
    
    extension [Self <: Hub](x: Self) {
      
      inline def setConnect(value: CallbackTo[JQueryPromise[Any]]): Self = StObject.set(x, "connect", value.toJsFn)
      
      inline def setConnection(value: Connection): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
      
      inline def setDisconnect(value: Callback): Self = StObject.set(x, "disconnect", value.toJsFn)
      
      inline def setHubName(value: String): Self = StObject.set(x, "hubName", value.asInstanceOf[js.Any])
      
      inline def setInvoke(value: (String, /* repeated */ Any) => JQueryDeferred[Any]): Self = StObject.set(x, "invoke", js.Any.fromFunction2(value))
      
      inline def setOn(value: (String, js.Function1[/* repeated */ Any, Unit]) => Callback): Self = StObject.set(x, "on", js.Any.fromFunction2((t0: String, t1: js.Function1[/* repeated */ Any, Unit]) => (value(t0, t1)).runNow()))
      
      inline def setProxy(value: Proxy): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait HubFactory
    extends StObject
       with /**
    * Creates a new Hub connection
    */
  Instantiable2[/* hubName */ String, /* options */ HubOptions, Hub]
  
  trait HubOptions extends StObject {
    
    /**
      * Function to handle hub connection errors
      */
    var errorHandler: js.UndefOr[js.Function1[/* error */ String, Unit]] = js.undefined
    
    /**
      * Collection of client side callbacks
      */
    var listeners: js.UndefOr[StringDictionary[js.Function1[/* repeated */ Any, Unit]]] = js.undefined
    
    /**
      * Enable/disable logging
      */
    var logging: js.UndefOr[Boolean] = js.undefined
    
    /**
      * String array of server side methods which the client can call
      */
    var methods: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Object representing additional query params to be sent on connection
      */
    var queryParams: js.UndefOr[StringDictionary[String]] = js.undefined
    
    /**
      * Sets the root path for the SignalR web service
      */
    var rootPath: js.UndefOr[String] = js.undefined
    
    /**
      * Function to handle hub connection state changed event
      */
    var stateChanged: js.UndefOr[js.Function1[/* state */ StateChanged, Unit]] = js.undefined
    
    /**
      * Sets transport method (e.g    'longPolling'    or    ['webSockets', 'longPolling'] )
      */
    var transport: js.UndefOr[Any] = js.undefined
    
    /**
      * Use a shared global connection or create a new one just for this hub, defaults to true
      */
    var useSharedConnection: js.UndefOr[Boolean] = js.undefined
  }
  object HubOptions {
    
    inline def apply(): HubOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HubOptions]
    }
    
    extension [Self <: HubOptions](x: Self) {
      
      inline def setErrorHandler(value: /* error */ String => Callback): Self = StObject.set(x, "errorHandler", js.Any.fromFunction1((t0: /* error */ String) => value(t0).runNow()))
      
      inline def setErrorHandlerUndefined: Self = StObject.set(x, "errorHandler", js.undefined)
      
      inline def setListeners(value: StringDictionary[js.Function1[/* repeated */ Any, Unit]]): Self = StObject.set(x, "listeners", value.asInstanceOf[js.Any])
      
      inline def setListenersUndefined: Self = StObject.set(x, "listeners", js.undefined)
      
      inline def setLogging(value: Boolean): Self = StObject.set(x, "logging", value.asInstanceOf[js.Any])
      
      inline def setLoggingUndefined: Self = StObject.set(x, "logging", js.undefined)
      
      inline def setMethods(value: js.Array[String]): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      inline def setMethodsUndefined: Self = StObject.set(x, "methods", js.undefined)
      
      inline def setMethodsVarargs(value: String*): Self = StObject.set(x, "methods", js.Array(value*))
      
      inline def setQueryParams(value: StringDictionary[String]): Self = StObject.set(x, "queryParams", value.asInstanceOf[js.Any])
      
      inline def setQueryParamsUndefined: Self = StObject.set(x, "queryParams", js.undefined)
      
      inline def setRootPath(value: String): Self = StObject.set(x, "rootPath", value.asInstanceOf[js.Any])
      
      inline def setRootPathUndefined: Self = StObject.set(x, "rootPath", js.undefined)
      
      inline def setStateChanged(value: /* state */ StateChanged => Callback): Self = StObject.set(x, "stateChanged", js.Any.fromFunction1((t0: /* state */ StateChanged) => value(t0).runNow()))
      
      inline def setStateChangedUndefined: Self = StObject.set(x, "stateChanged", js.undefined)
      
      inline def setTransport(value: Any): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
      
      inline def setTransportUndefined: Self = StObject.set(x, "transport", js.undefined)
      
      inline def setUseSharedConnection(value: Boolean): Self = StObject.set(x, "useSharedConnection", value.asInstanceOf[js.Any])
      
      inline def setUseSharedConnectionUndefined: Self = StObject.set(x, "useSharedConnection", js.undefined)
    }
  }
}
