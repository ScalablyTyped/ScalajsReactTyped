package typingsJapgolly.winrt.Windows.Networking.Sockets

import typingsJapgolly.winrt.Windows.Networking.HostName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IWebSocketInformation extends StObject {
  
  var bandwidthStatistics: BandwidthStatistics
  
  var localAddress: HostName
  
  var protocol: String
}
object IWebSocketInformation {
  
  inline def apply(bandwidthStatistics: BandwidthStatistics, localAddress: HostName, protocol: String): IWebSocketInformation = {
    val __obj = js.Dynamic.literal(bandwidthStatistics = bandwidthStatistics.asInstanceOf[js.Any], localAddress = localAddress.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWebSocketInformation]
  }
  
  extension [Self <: IWebSocketInformation](x: Self) {
    
    inline def setBandwidthStatistics(value: BandwidthStatistics): Self = StObject.set(x, "bandwidthStatistics", value.asInstanceOf[js.Any])
    
    inline def setLocalAddress(value: HostName): Self = StObject.set(x, "localAddress", value.asInstanceOf[js.Any])
    
    inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
  }
}
