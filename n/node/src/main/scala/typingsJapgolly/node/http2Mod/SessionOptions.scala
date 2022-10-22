package typingsJapgolly.node.http2Mod

import typingsJapgolly.node.nodeColonstreamMod.Duplex
import typingsJapgolly.node.nodeColonurlMod.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SessionOptions extends StObject {
  
  var createConnection: js.UndefOr[js.Function2[/* authority */ URL, /* option */ this.type, Duplex]] = js.undefined
  
  var maxDeflateDynamicTableSize: js.UndefOr[Double] = js.undefined
  
  var maxHeaderListPairs: js.UndefOr[Double] = js.undefined
  
  var maxOutstandingPings: js.UndefOr[Double] = js.undefined
  
  var maxSendHeaderBlockLength: js.UndefOr[Double] = js.undefined
  
  var maxSessionMemory: js.UndefOr[Double] = js.undefined
  
  var paddingStrategy: js.UndefOr[Double] = js.undefined
  
  var peerMaxConcurrentStreams: js.UndefOr[Double] = js.undefined
  
  var selectPadding: js.UndefOr[js.Function2[/* frameLen */ Double, /* maxFrameLen */ Double, Double]] = js.undefined
  
  var settings: js.UndefOr[Settings] = js.undefined
  
  /**
    * Specifies a timeout in milliseconds that
    * a server should wait when an [`'unknownProtocol'`][] is emitted. If the
    * socket has not been destroyed by that time the server will destroy it.
    * @default 100000
    */
  var unknownProtocolTimeout: js.UndefOr[Double] = js.undefined
}
object SessionOptions {
  
  inline def apply(): SessionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SessionOptions]
  }
  
  extension [Self <: SessionOptions](x: Self) {
    
    inline def setCreateConnection(value: (/* authority */ URL, SessionOptions) => Duplex): Self = StObject.set(x, "createConnection", js.Any.fromFunction2(value))
    
    inline def setCreateConnectionUndefined: Self = StObject.set(x, "createConnection", js.undefined)
    
    inline def setMaxDeflateDynamicTableSize(value: Double): Self = StObject.set(x, "maxDeflateDynamicTableSize", value.asInstanceOf[js.Any])
    
    inline def setMaxDeflateDynamicTableSizeUndefined: Self = StObject.set(x, "maxDeflateDynamicTableSize", js.undefined)
    
    inline def setMaxHeaderListPairs(value: Double): Self = StObject.set(x, "maxHeaderListPairs", value.asInstanceOf[js.Any])
    
    inline def setMaxHeaderListPairsUndefined: Self = StObject.set(x, "maxHeaderListPairs", js.undefined)
    
    inline def setMaxOutstandingPings(value: Double): Self = StObject.set(x, "maxOutstandingPings", value.asInstanceOf[js.Any])
    
    inline def setMaxOutstandingPingsUndefined: Self = StObject.set(x, "maxOutstandingPings", js.undefined)
    
    inline def setMaxSendHeaderBlockLength(value: Double): Self = StObject.set(x, "maxSendHeaderBlockLength", value.asInstanceOf[js.Any])
    
    inline def setMaxSendHeaderBlockLengthUndefined: Self = StObject.set(x, "maxSendHeaderBlockLength", js.undefined)
    
    inline def setMaxSessionMemory(value: Double): Self = StObject.set(x, "maxSessionMemory", value.asInstanceOf[js.Any])
    
    inline def setMaxSessionMemoryUndefined: Self = StObject.set(x, "maxSessionMemory", js.undefined)
    
    inline def setPaddingStrategy(value: Double): Self = StObject.set(x, "paddingStrategy", value.asInstanceOf[js.Any])
    
    inline def setPaddingStrategyUndefined: Self = StObject.set(x, "paddingStrategy", js.undefined)
    
    inline def setPeerMaxConcurrentStreams(value: Double): Self = StObject.set(x, "peerMaxConcurrentStreams", value.asInstanceOf[js.Any])
    
    inline def setPeerMaxConcurrentStreamsUndefined: Self = StObject.set(x, "peerMaxConcurrentStreams", js.undefined)
    
    inline def setSelectPadding(value: (/* frameLen */ Double, /* maxFrameLen */ Double) => Double): Self = StObject.set(x, "selectPadding", js.Any.fromFunction2(value))
    
    inline def setSelectPaddingUndefined: Self = StObject.set(x, "selectPadding", js.undefined)
    
    inline def setSettings(value: Settings): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    inline def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
    
    inline def setUnknownProtocolTimeout(value: Double): Self = StObject.set(x, "unknownProtocolTimeout", value.asInstanceOf[js.Any])
    
    inline def setUnknownProtocolTimeoutUndefined: Self = StObject.set(x, "unknownProtocolTimeout", js.undefined)
  }
}
