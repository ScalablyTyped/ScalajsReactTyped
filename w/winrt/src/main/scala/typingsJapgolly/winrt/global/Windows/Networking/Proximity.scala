package typingsJapgolly.winrt.global.Windows.Networking

import typingsJapgolly.winrt.Windows.Foundation.Collections.IMap
import typingsJapgolly.winrt.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import typingsJapgolly.winrt.Windows.Networking.Proximity.PeerDiscoveryTypes
import typingsJapgolly.winrt.Windows.Networking.Proximity.TriggeredConnectState
import typingsJapgolly.winrt.Windows.Networking.Sockets.StreamSocket
import typingsJapgolly.winrt.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Proximity {
  
  @JSGlobal("Windows.Networking.Proximity.ConnectionRequestedEventArgs")
  @js.native
  open class ConnectionRequestedEventArgs ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Networking.Proximity.ConnectionRequestedEventArgs {
    
    /* CompleteClass */
    var peerInformation: typingsJapgolly.winrt.Windows.Networking.Proximity.PeerInformation = js.native
  }
  
  @JSGlobal("Windows.Networking.Proximity.PeerDiscoveryTypes")
  @js.native
  object PeerDiscoveryTypes extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.Networking.Proximity.PeerDiscoveryTypes & Double] = js.native
    
    /* 1 */ val browse: typingsJapgolly.winrt.Windows.Networking.Proximity.PeerDiscoveryTypes.browse & Double = js.native
    
    /* 0 */ val none: typingsJapgolly.winrt.Windows.Networking.Proximity.PeerDiscoveryTypes.none & Double = js.native
    
    /* 2 */ val triggered: typingsJapgolly.winrt.Windows.Networking.Proximity.PeerDiscoveryTypes.triggered & Double = js.native
  }
  
  @JSGlobal("Windows.Networking.Proximity.PeerFinder")
  @js.native
  open class PeerFinder ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Networking.Proximity.PeerFinder
  /* static members */
  object PeerFinder {
    
    @JSGlobal("Windows.Networking.Proximity.PeerFinder")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Windows.Networking.Proximity.PeerFinder.allowBluetooth")
    @js.native
    def allowBluetooth: Boolean = js.native
    inline def allowBluetooth_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("allowBluetooth")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Networking.Proximity.PeerFinder.allowInfrastructure")
    @js.native
    def allowInfrastructure: Boolean = js.native
    inline def allowInfrastructure_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("allowInfrastructure")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Networking.Proximity.PeerFinder.allowWiFiDirect")
    @js.native
    def allowWiFiDirect: Boolean = js.native
    inline def allowWiFiDirect_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("allowWiFiDirect")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Networking.Proximity.PeerFinder.alternateIdentities")
    @js.native
    def alternateIdentities: IMap[String, String] = js.native
    inline def alternateIdentities_=(x: IMap[String, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("alternateIdentities")(x.asInstanceOf[js.Any])
    
    inline def connectAsync(peerInformation: typingsJapgolly.winrt.Windows.Networking.Proximity.PeerInformation): IAsyncOperation[StreamSocket] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectAsync")(peerInformation.asInstanceOf[js.Any]).asInstanceOf[IAsyncOperation[StreamSocket]]
    
    @JSGlobal("Windows.Networking.Proximity.PeerFinder.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    inline def findAllPeersAsync(): IAsyncOperation[IVectorView[typingsJapgolly.winrt.Windows.Networking.Proximity.PeerInformation]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findAllPeersAsync")().asInstanceOf[IAsyncOperation[IVectorView[typingsJapgolly.winrt.Windows.Networking.Proximity.PeerInformation]]]
    
    @JSGlobal("Windows.Networking.Proximity.PeerFinder.onconnectionrequested")
    @js.native
    def onconnectionrequested: Any = js.native
    inline def onconnectionrequested_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onconnectionrequested")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Networking.Proximity.PeerFinder.ontriggeredconnectionstatechanged")
    @js.native
    def ontriggeredconnectionstatechanged: Any = js.native
    inline def ontriggeredconnectionstatechanged_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ontriggeredconnectionstatechanged")(x.asInstanceOf[js.Any])
    
    inline def start(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("start")().asInstanceOf[Unit]
    inline def start(peerMessage: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("start")(peerMessage.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def stop(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stop")().asInstanceOf[Unit]
    
    @JSGlobal("Windows.Networking.Proximity.PeerFinder.supportedDiscoveryTypes")
    @js.native
    def supportedDiscoveryTypes: PeerDiscoveryTypes = js.native
    inline def supportedDiscoveryTypes_=(x: PeerDiscoveryTypes): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("supportedDiscoveryTypes")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("Windows.Networking.Proximity.PeerInformation")
  @js.native
  open class PeerInformation ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Networking.Proximity.PeerInformation {
    
    /* CompleteClass */
    var displayName: String = js.native
  }
  
  @JSGlobal("Windows.Networking.Proximity.ProximityDevice")
  @js.native
  open class ProximityDevice ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Networking.Proximity.ProximityDevice
  /* static members */
  object ProximityDevice {
    
    @JSGlobal("Windows.Networking.Proximity.ProximityDevice")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromId(deviceInterfaceId: String): typingsJapgolly.winrt.Windows.Networking.Proximity.ProximityDevice = ^.asInstanceOf[js.Dynamic].applyDynamic("fromId")(deviceInterfaceId.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.winrt.Windows.Networking.Proximity.ProximityDevice]
    
    inline def getDefault(): typingsJapgolly.winrt.Windows.Networking.Proximity.ProximityDevice = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefault")().asInstanceOf[typingsJapgolly.winrt.Windows.Networking.Proximity.ProximityDevice]
    
    inline def getDeviceSelector(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDeviceSelector")().asInstanceOf[String]
  }
  
  @JSGlobal("Windows.Networking.Proximity.ProximityMessage")
  @js.native
  open class ProximityMessage ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Networking.Proximity.ProximityMessage {
    
    /* CompleteClass */
    var data: IBuffer = js.native
    
    /* CompleteClass */
    var dataAsString: String = js.native
    
    /* CompleteClass */
    var messageType: String = js.native
    
    /* CompleteClass */
    var subscriptionId: Double = js.native
  }
  
  @JSGlobal("Windows.Networking.Proximity.TriggeredConnectState")
  @js.native
  object TriggeredConnectState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.winrt.Windows.Networking.Proximity.TriggeredConnectState & Double
      ] = js.native
    
    /* 4 */ val canceled: typingsJapgolly.winrt.Windows.Networking.Proximity.TriggeredConnectState.canceled & Double = js.native
    
    /* 3 */ val completed: typingsJapgolly.winrt.Windows.Networking.Proximity.TriggeredConnectState.completed & Double = js.native
    
    /* 2 */ val connecting: typingsJapgolly.winrt.Windows.Networking.Proximity.TriggeredConnectState.connecting & Double = js.native
    
    /* 5 */ val failed: typingsJapgolly.winrt.Windows.Networking.Proximity.TriggeredConnectState.failed & Double = js.native
    
    /* 1 */ val listening: typingsJapgolly.winrt.Windows.Networking.Proximity.TriggeredConnectState.listening & Double = js.native
    
    /* 0 */ val peerFound: typingsJapgolly.winrt.Windows.Networking.Proximity.TriggeredConnectState.peerFound & Double = js.native
  }
  
  @JSGlobal("Windows.Networking.Proximity.TriggeredConnectionStateChangedEventArgs")
  @js.native
  open class TriggeredConnectionStateChangedEventArgs ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Networking.Proximity.TriggeredConnectionStateChangedEventArgs {
    
    /* CompleteClass */
    var id: Double = js.native
    
    /* CompleteClass */
    var socket: StreamSocket = js.native
    
    /* CompleteClass */
    var state: TriggeredConnectState = js.native
  }
}
