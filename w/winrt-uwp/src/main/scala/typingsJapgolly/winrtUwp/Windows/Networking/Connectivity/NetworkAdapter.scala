package typingsJapgolly.winrtUwp.Windows.Networking.Connectivity

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a network adapter. */
trait NetworkAdapter extends StObject {
  
  /**
    * Gets the connection profile currently associated with the network adapter.
    * @return The connection profile associated with this network adapter.
    */
  def getConnectedProfileAsync(): IPromiseWithIAsyncOperation[ConnectionProfile]
  
  /** Gets a value indicating the network interface type as defined by the Internet Assigned Names Authority (IANA) for the NetworkAdapter . */
  var ianaInterfaceType: Double
  
  /** Gets a value indicating the maximum inbound data transfer rate in bits per second. */
  var inboundMaxBitsPerSecond: Double
  
  /** Gets the network adapter ID. */
  var networkAdapterId: String
  
  /** Gets the NetworkItem object that represents the connected network. */
  var networkItem: NetworkItem
  
  /** Gets a value indicating the maximum outbound speed in bits per second. */
  var outboundMaxBitsPerSecond: Double
}
object NetworkAdapter {
  
  inline def apply(
    getConnectedProfileAsync: CallbackTo[IPromiseWithIAsyncOperation[ConnectionProfile]],
    ianaInterfaceType: Double,
    inboundMaxBitsPerSecond: Double,
    networkAdapterId: String,
    networkItem: NetworkItem,
    outboundMaxBitsPerSecond: Double
  ): NetworkAdapter = {
    val __obj = js.Dynamic.literal(getConnectedProfileAsync = getConnectedProfileAsync.toJsFn, ianaInterfaceType = ianaInterfaceType.asInstanceOf[js.Any], inboundMaxBitsPerSecond = inboundMaxBitsPerSecond.asInstanceOf[js.Any], networkAdapterId = networkAdapterId.asInstanceOf[js.Any], networkItem = networkItem.asInstanceOf[js.Any], outboundMaxBitsPerSecond = outboundMaxBitsPerSecond.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkAdapter]
  }
  
  extension [Self <: NetworkAdapter](x: Self) {
    
    inline def setGetConnectedProfileAsync(value: CallbackTo[IPromiseWithIAsyncOperation[ConnectionProfile]]): Self = StObject.set(x, "getConnectedProfileAsync", value.toJsFn)
    
    inline def setIanaInterfaceType(value: Double): Self = StObject.set(x, "ianaInterfaceType", value.asInstanceOf[js.Any])
    
    inline def setInboundMaxBitsPerSecond(value: Double): Self = StObject.set(x, "inboundMaxBitsPerSecond", value.asInstanceOf[js.Any])
    
    inline def setNetworkAdapterId(value: String): Self = StObject.set(x, "networkAdapterId", value.asInstanceOf[js.Any])
    
    inline def setNetworkItem(value: NetworkItem): Self = StObject.set(x, "networkItem", value.asInstanceOf[js.Any])
    
    inline def setOutboundMaxBitsPerSecond(value: Double): Self = StObject.set(x, "outboundMaxBitsPerSecond", value.asInstanceOf[js.Any])
  }
}
