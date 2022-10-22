package typingsJapgolly.graphqurl

import japgolly.scalajs.react.Callback
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Endpoint extends StObject {
    
    /**
      * WebSocket endpoint to run GraphQL subscriptions.
      */
    var endpoint: js.UndefOr[String] = js.undefined
    
    /**
      * Callback function called if the GraphQL connection over websocket is
      * unsuccessful
      */
    var onConnectionError: js.UndefOr[js.Function1[/* error */ Any, Unit]] = js.undefined
    
    /**
      * Callback function called when the GraphQL server sends
      * GRAPHQL_CONNECTION_KEEP_ALIVE messages to keep the connection alive.
      */
    var onConnectionKeepAlive: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Callback function called when the GraphQL connection is successful.
      * Please not that this is different from the websocket connection being
      * open.
      */
    var onConnectionSuccess: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Payload to send the connection init message with
      */
    var parameters: js.UndefOr[Record[String, Any]] = js.undefined
    
    /**
      * Boolean value whether to retry closed websocket connection. Defaults to
      * false.
      */
    var shouldRetry: js.UndefOr[Boolean] = js.undefined
  }
  object Endpoint {
    
    inline def apply(): Endpoint = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Endpoint]
    }
    
    extension [Self <: Endpoint](x: Self) {
      
      inline def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      inline def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
      
      inline def setOnConnectionError(value: /* error */ Any => Callback): Self = StObject.set(x, "onConnectionError", js.Any.fromFunction1((t0: /* error */ Any) => value(t0).runNow()))
      
      inline def setOnConnectionErrorUndefined: Self = StObject.set(x, "onConnectionError", js.undefined)
      
      inline def setOnConnectionKeepAlive(value: Callback): Self = StObject.set(x, "onConnectionKeepAlive", value.toJsFn)
      
      inline def setOnConnectionKeepAliveUndefined: Self = StObject.set(x, "onConnectionKeepAlive", js.undefined)
      
      inline def setOnConnectionSuccess(value: Callback): Self = StObject.set(x, "onConnectionSuccess", value.toJsFn)
      
      inline def setOnConnectionSuccessUndefined: Self = StObject.set(x, "onConnectionSuccess", js.undefined)
      
      inline def setParameters(value: Record[String, Any]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
      
      inline def setShouldRetry(value: Boolean): Self = StObject.set(x, "shouldRetry", value.asInstanceOf[js.Any])
      
      inline def setShouldRetryUndefined: Self = StObject.set(x, "shouldRetry", js.undefined)
    }
  }
}
