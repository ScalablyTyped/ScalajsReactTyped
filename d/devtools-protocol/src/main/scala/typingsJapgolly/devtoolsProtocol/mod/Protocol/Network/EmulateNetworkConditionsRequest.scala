package typingsJapgolly.devtoolsProtocol.mod.Protocol.Network

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmulateNetworkConditionsRequest extends StObject {
  
  /**
    * Connection type if known.
    */
  var connectionType: js.UndefOr[ConnectionType] = js.undefined
  
  /**
    * Maximal aggregated download throughput (bytes/sec). -1 disables download throttling.
    */
  var downloadThroughput: Double
  
  /**
    * Minimum latency from request sent to response headers received (ms).
    */
  var latency: Double
  
  /**
    * True to emulate internet disconnection.
    */
  var offline: Boolean
  
  /**
    * Maximal aggregated upload throughput (bytes/sec).  -1 disables upload throttling.
    */
  var uploadThroughput: Double
}
object EmulateNetworkConditionsRequest {
  
  inline def apply(downloadThroughput: Double, latency: Double, offline: Boolean, uploadThroughput: Double): EmulateNetworkConditionsRequest = {
    val __obj = js.Dynamic.literal(downloadThroughput = downloadThroughput.asInstanceOf[js.Any], latency = latency.asInstanceOf[js.Any], offline = offline.asInstanceOf[js.Any], uploadThroughput = uploadThroughput.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmulateNetworkConditionsRequest]
  }
  
  extension [Self <: EmulateNetworkConditionsRequest](x: Self) {
    
    inline def setConnectionType(value: ConnectionType): Self = StObject.set(x, "connectionType", value.asInstanceOf[js.Any])
    
    inline def setConnectionTypeUndefined: Self = StObject.set(x, "connectionType", js.undefined)
    
    inline def setDownloadThroughput(value: Double): Self = StObject.set(x, "downloadThroughput", value.asInstanceOf[js.Any])
    
    inline def setLatency(value: Double): Self = StObject.set(x, "latency", value.asInstanceOf[js.Any])
    
    inline def setOffline(value: Boolean): Self = StObject.set(x, "offline", value.asInstanceOf[js.Any])
    
    inline def setUploadThroughput(value: Double): Self = StObject.set(x, "uploadThroughput", value.asInstanceOf[js.Any])
  }
}
