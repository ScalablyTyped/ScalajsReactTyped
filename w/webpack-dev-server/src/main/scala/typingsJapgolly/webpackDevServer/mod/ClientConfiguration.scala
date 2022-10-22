package typingsJapgolly.webpackDevServer.mod

import typingsJapgolly.webpackDevServer.anon.Errors
import typingsJapgolly.webpackDevServer.webpackDevServerStrings.error
import typingsJapgolly.webpackDevServer.webpackDevServerStrings.info
import typingsJapgolly.webpackDevServer.webpackDevServerStrings.log
import typingsJapgolly.webpackDevServer.webpackDevServerStrings.none
import typingsJapgolly.webpackDevServer.webpackDevServerStrings.verbose
import typingsJapgolly.webpackDevServer.webpackDevServerStrings.warn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientConfiguration extends StObject {
  
  var logging: js.UndefOr[none | error | warn | info | log | verbose] = js.undefined
  
  var overlay: js.UndefOr[Boolean | Errors] = js.undefined
  
  var progress: js.UndefOr[Boolean] = js.undefined
  
  var reconnect: js.UndefOr[Double | Boolean] = js.undefined
  
  var webSocketTransport: js.UndefOr[String] = js.undefined
  
  var webSocketURL: js.UndefOr[String | WebSocketURL] = js.undefined
}
object ClientConfiguration {
  
  inline def apply(): ClientConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientConfiguration]
  }
  
  extension [Self <: ClientConfiguration](x: Self) {
    
    inline def setLogging(value: none | error | warn | info | log | verbose): Self = StObject.set(x, "logging", value.asInstanceOf[js.Any])
    
    inline def setLoggingUndefined: Self = StObject.set(x, "logging", js.undefined)
    
    inline def setOverlay(value: Boolean | Errors): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
    
    inline def setOverlayUndefined: Self = StObject.set(x, "overlay", js.undefined)
    
    inline def setProgress(value: Boolean): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
    
    inline def setReconnect(value: Double | Boolean): Self = StObject.set(x, "reconnect", value.asInstanceOf[js.Any])
    
    inline def setReconnectUndefined: Self = StObject.set(x, "reconnect", js.undefined)
    
    inline def setWebSocketTransport(value: String): Self = StObject.set(x, "webSocketTransport", value.asInstanceOf[js.Any])
    
    inline def setWebSocketTransportUndefined: Self = StObject.set(x, "webSocketTransport", js.undefined)
    
    inline def setWebSocketURL(value: String | WebSocketURL): Self = StObject.set(x, "webSocketURL", value.asInstanceOf[js.Any])
    
    inline def setWebSocketURLUndefined: Self = StObject.set(x, "webSocketURL", js.undefined)
  }
}
