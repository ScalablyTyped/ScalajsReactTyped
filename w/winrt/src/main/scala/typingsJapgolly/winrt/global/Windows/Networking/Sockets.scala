package typingsJapgolly.winrt.global.Windows.Networking

import typingsJapgolly.winrt.Windows.ApplicationModel.Background.IBackgroundTaskInstance
import typingsJapgolly.winrt.Windows.ApplicationModel.Background.IBackgroundTrigger
import typingsJapgolly.winrt.Windows.Foundation.Collections.IVector
import typingsJapgolly.winrt.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrt.Windows.Foundation.IAsyncAction
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import typingsJapgolly.winrt.Windows.Networking.Sockets.BandwidthStatistics
import typingsJapgolly.winrt.Windows.Networking.Sockets.ControlChannelTriggerResourceType
import typingsJapgolly.winrt.Windows.Networking.Sockets.ControlChannelTriggerStatus
import typingsJapgolly.winrt.Windows.Networking.Sockets.RoundTripTimeStatistics
import typingsJapgolly.winrt.Windows.Networking.Sockets.SocketErrorStatus
import typingsJapgolly.winrt.Windows.Networking.Sockets.SocketMessageType
import typingsJapgolly.winrt.Windows.Networking.Sockets.SocketProtectionLevel
import typingsJapgolly.winrt.Windows.Networking.Sockets.SocketQualityOfService
import typingsJapgolly.winrt.Windows.Security.Credentials.PasswordCredential
import typingsJapgolly.winrt.Windows.Storage.Streams.DataReader
import typingsJapgolly.winrt.Windows.Storage.Streams.IBuffer
import typingsJapgolly.winrt.Windows.Storage.Streams.IInputStream
import typingsJapgolly.winrt.Windows.Web.WebErrorStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Sockets {
  
  @JSGlobal("Windows.Networking.Sockets.ControlChannelTrigger")
  @js.native
  open class ControlChannelTrigger protected ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Networking.Sockets.ControlChannelTrigger {
    def this(channelId: String, serverKeepAliveIntervalInMinutes: Double) = this()
    def this(
      channelId: String,
      serverKeepAliveIntervalInMinutes: Double,
      resourceRequestType: ControlChannelTriggerResourceType
    ) = this()
    
    /* CompleteClass */
    override def close(): Unit = js.native
    
    /* CompleteClass */
    var controlChannelTriggerId: String = js.native
    
    /* CompleteClass */
    var currentKeepAliveIntervalInMinutes: Double = js.native
    
    /* CompleteClass */
    override def decreaseNetworkKeepAliveInterval(): Unit = js.native
    
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /* CompleteClass */
    override def flushTransport(): Unit = js.native
    
    /* CompleteClass */
    var keepAliveTrigger: IBackgroundTrigger = js.native
    
    /* CompleteClass */
    var pushNotificationTrigger: IBackgroundTrigger = js.native
    
    /* CompleteClass */
    var serverKeepAliveIntervalInMinutes: Double = js.native
    
    /* CompleteClass */
    var transportObject: Any = js.native
    
    /* CompleteClass */
    override def usingTransport(transport: Any): Unit = js.native
    
    /* CompleteClass */
    override def waitForPushEnabled(): ControlChannelTriggerStatus = js.native
  }
  
  @JSGlobal("Windows.Networking.Sockets.ControlChannelTriggerResetReason")
  @js.native
  object ControlChannelTriggerResetReason extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.winrt.Windows.Networking.Sockets.ControlChannelTriggerResetReason & Double
      ] = js.native
    
    /* 0 */ val fastUserSwitched: typingsJapgolly.winrt.Windows.Networking.Sockets.ControlChannelTriggerResetReason.fastUserSwitched & Double = js.native
    
    /* 1 */ val lowPowerExit: typingsJapgolly.winrt.Windows.Networking.Sockets.ControlChannelTriggerResetReason.lowPowerExit & Double = js.native
  }
  
  @JSGlobal("Windows.Networking.Sockets.ControlChannelTriggerResourceType")
  @js.native
  object ControlChannelTriggerResourceType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.winrt.Windows.Networking.Sockets.ControlChannelTriggerResourceType & Double
      ] = js.native
    
    /* 1 */ val requestHardwareSlot: typingsJapgolly.winrt.Windows.Networking.Sockets.ControlChannelTriggerResourceType.requestHardwareSlot & Double = js.native
    
    /* 0 */ val requestSoftwareSlot: typingsJapgolly.winrt.Windows.Networking.Sockets.ControlChannelTriggerResourceType.requestSoftwareSlot & Double = js.native
  }
  
  @JSGlobal("Windows.Networking.Sockets.ControlChannelTriggerStatus")
  @js.native
  object ControlChannelTriggerStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.winrt.Windows.Networking.Sockets.ControlChannelTriggerStatus & Double
      ] = js.native
    
    /* 2 */ val hardwareSlotAllocated: typingsJapgolly.winrt.Windows.Networking.Sockets.ControlChannelTriggerStatus.hardwareSlotAllocated & Double = js.native
    
    /* 0 */ val hardwareSlotRequested: typingsJapgolly.winrt.Windows.Networking.Sockets.ControlChannelTriggerStatus.hardwareSlotRequested & Double = js.native
    
    /* 3 */ val policyError: typingsJapgolly.winrt.Windows.Networking.Sockets.ControlChannelTriggerStatus.policyError & Double = js.native
    
    /* 6 */ val serviceUnavailable: typingsJapgolly.winrt.Windows.Networking.Sockets.ControlChannelTriggerStatus.serviceUnavailable & Double = js.native
    
    /* 1 */ val softwareSlotAllocated: typingsJapgolly.winrt.Windows.Networking.Sockets.ControlChannelTriggerStatus.softwareSlotAllocated & Double = js.native
    
    /* 4 */ val systemError: typingsJapgolly.winrt.Windows.Networking.Sockets.ControlChannelTriggerStatus.systemError & Double = js.native
    
    /* 5 */ val transportDisconnected: typingsJapgolly.winrt.Windows.Networking.Sockets.ControlChannelTriggerStatus.transportDisconnected & Double = js.native
  }
  
  @JSGlobal("Windows.Networking.Sockets.DatagramSocket")
  @js.native
  open class DatagramSocket ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Networking.Sockets.DatagramSocket {
    
    /* CompleteClass */
    override def close(): Unit = js.native
  }
  /* static members */
  object DatagramSocket {
    
    @JSGlobal("Windows.Networking.Sockets.DatagramSocket")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getEndpointPairsAsync(remoteHostName: typingsJapgolly.winrt.Windows.Networking.HostName, remoteServiceName: String): IAsyncOperation[IVectorView[typingsJapgolly.winrt.Windows.Networking.EndpointPair]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointPairsAsync")(remoteHostName.asInstanceOf[js.Any], remoteServiceName.asInstanceOf[js.Any])).asInstanceOf[IAsyncOperation[IVectorView[typingsJapgolly.winrt.Windows.Networking.EndpointPair]]]
    inline def getEndpointPairsAsync(
      remoteHostName: typingsJapgolly.winrt.Windows.Networking.HostName,
      remoteServiceName: String,
      sortOptions: typingsJapgolly.winrt.Windows.Networking.HostNameSortOptions
    ): IAsyncOperation[IVectorView[typingsJapgolly.winrt.Windows.Networking.EndpointPair]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointPairsAsync")(remoteHostName.asInstanceOf[js.Any], remoteServiceName.asInstanceOf[js.Any], sortOptions.asInstanceOf[js.Any])).asInstanceOf[IAsyncOperation[IVectorView[typingsJapgolly.winrt.Windows.Networking.EndpointPair]]]
  }
  
  @JSGlobal("Windows.Networking.Sockets.DatagramSocketControl")
  @js.native
  open class DatagramSocketControl ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Networking.Sockets.DatagramSocketControl {
    
    /* CompleteClass */
    var outboundUnicastHopLimit: Double = js.native
    
    /* CompleteClass */
    var qualityOfService: SocketQualityOfService = js.native
  }
  
  @JSGlobal("Windows.Networking.Sockets.DatagramSocketInformation")
  @js.native
  open class DatagramSocketInformation ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Networking.Sockets.DatagramSocketInformation {
    
    /* CompleteClass */
    var localAddress: typingsJapgolly.winrt.Windows.Networking.HostName = js.native
    
    /* CompleteClass */
    var localPort: String = js.native
    
    /* CompleteClass */
    var remoteAddress: typingsJapgolly.winrt.Windows.Networking.HostName = js.native
    
    /* CompleteClass */
    var remotePort: String = js.native
  }
  
  @JSGlobal("Windows.Networking.Sockets.DatagramSocketMessageReceivedEventArgs")
  @js.native
  open class DatagramSocketMessageReceivedEventArgs ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Networking.Sockets.DatagramSocketMessageReceivedEventArgs {
    
    /* CompleteClass */
    override def getDataReader(): DataReader = js.native
    
    /* CompleteClass */
    override def getDataStream(): IInputStream = js.native
    
    /* CompleteClass */
    var localAddress: typingsJapgolly.winrt.Windows.Networking.HostName = js.native
    
    /* CompleteClass */
    var remoteAddress: typingsJapgolly.winrt.Windows.Networking.HostName = js.native
    
    /* CompleteClass */
    var remotePort: String = js.native
  }
  
  @JSGlobal("Windows.Networking.Sockets.MessageWebSocket")
  @js.native
  open class MessageWebSocket ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Networking.Sockets.MessageWebSocket {
    
    /* CompleteClass */
    override def close(): Unit = js.native
  }
  
  @JSGlobal("Windows.Networking.Sockets.MessageWebSocketControl")
  @js.native
  open class MessageWebSocketControl ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Networking.Sockets.MessageWebSocketControl {
    
    /* CompleteClass */
    var maxMessageSize: Double = js.native
    
    /* CompleteClass */
    var messageType: SocketMessageType = js.native
    
    /* CompleteClass */
    var outboundBufferSizeInBytes: Double = js.native
    
    /* CompleteClass */
    var proxyCredential: PasswordCredential = js.native
    
    /* CompleteClass */
    var serverCredential: PasswordCredential = js.native
    
    /* CompleteClass */
    var supportedProtocols: IVector[String] = js.native
  }
  
  @JSGlobal("Windows.Networking.Sockets.MessageWebSocketInformation")
  @js.native
  open class MessageWebSocketInformation ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Networking.Sockets.MessageWebSocketInformation {
    
    /* CompleteClass */
    var bandwidthStatistics: BandwidthStatistics = js.native
    
    /* CompleteClass */
    var localAddress: typingsJapgolly.winrt.Windows.Networking.HostName = js.native
    
    /* CompleteClass */
    var protocol: String = js.native
  }
  
  @JSGlobal("Windows.Networking.Sockets.MessageWebSocketMessageReceivedEventArgs")
  @js.native
  open class MessageWebSocketMessageReceivedEventArgs ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Networking.Sockets.MessageWebSocketMessageReceivedEventArgs {
    
    /* CompleteClass */
    override def getDataReader(): DataReader = js.native
    
    /* CompleteClass */
    override def getDataStream(): IInputStream = js.native
    
    /* CompleteClass */
    var messageType: SocketMessageType = js.native
  }
  
  @JSGlobal("Windows.Networking.Sockets.SocketError")
  @js.native
  open class SocketError ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Networking.Sockets.SocketError
  /* static members */
  object SocketError {
    
    @JSGlobal("Windows.Networking.Sockets.SocketError")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getStatus(hresult: Double): SocketErrorStatus = ^.asInstanceOf[js.Dynamic].applyDynamic("getStatus")(hresult.asInstanceOf[js.Any]).asInstanceOf[SocketErrorStatus]
  }
  
  @JSGlobal("Windows.Networking.Sockets.SocketErrorStatus")
  @js.native
  object SocketErrorStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.Networking.Sockets.SocketErrorStatus & Double] = js.native
    
    /* 10 */ val addressAlreadyInUse: typingsJapgolly.winrt.Windows.Networking.Sockets.SocketErrorStatus.addressAlreadyInUse & Double = js.native
    
    /* 4 */ val addressFamilyNotSupported: typingsJapgolly.winrt.Windows.Networking.Sockets.SocketErrorStatus.addressFamilyNotSupported & Double = js.native
    
    /* 11 */ val cannotAssignRequestedAddress: typingsJapgolly.winrt.Windows.Networking.Sockets.SocketErrorStatus.cannotAssignRequestedAddress & Double = js.native
    
    /* 25 */ val certificateCommonNameIsIncorrect: typingsJapgolly.winrt.Windows.Networking.Sockets.SocketErrorStatus.certificateCommonNameIsIncorrect & Double = js.native
    
    /* 23 */ val certificateExpired: typingsJapgolly.winrt.Windows.Networking.Sockets.SocketErrorStatus.certificateExpired & Double = js.native
    
    /* 30 */ val certificateIsInvalid: typingsJapgolly.winrt.Windows.Networking.Sockets.SocketErrorStatus.certificateIsInvalid & Double = js.native
    
    /* 28 */ val certificateNoRevocationCheck: typingsJapgolly.winrt.Windows.Networking.Sockets.SocketErrorStatus.certificateNoRevocationCheck & Double = js.native
    
    /* 29 */ val certificateRevocationServerOffline: typingsJapgolly.winrt.Windows.Networking.Sockets.SocketErrorStatus.certificateRevocationServerOffline & Double = js.native
    
    /* 27 */ val certificateRevoked: typingsJapgolly.winrt.Windows.Networking.Sockets.SocketErrorStatus.certificateRevoked & Double = js.native
    
    /* 24 */ val certificateUntrustedRoot: typingsJapgolly.winrt.Windows.Networking.Sockets.SocketErrorStatus.certificateUntrustedRoot & Double = js.native
    
    /* 26 */ val certificateWrongUsage: typingsJapgolly.winrt.Windows.Networking.Sockets.SocketErrorStatus.certificateWrongUsage & Double = js.native
    
    /* 9 */ val classTypeNotFound: typingsJapgolly.winrt.Windows.Networking.Sockets.SocketErrorStatus.classTypeNotFound & Double = js.native
    
    /* 12 */ val connectionRefused: typingsJapgolly.winrt.Windows.Networking.Sockets.SocketErrorStatus.connectionRefused & Double = js.native
    
    /* 18 */ val connectionResetByPeer: typingsJapgolly.winrt.Windows.Networking.Sockets.SocketErrorStatus.connectionResetByPeer & Double = js.native
    
    /* 3 */ val connectionTimedOut: typingsJapgolly.winrt.Windows.Networking.Sockets.SocketErrorStatus.connectionTimedOut & Double = js.native
    
    /* 19 */ val hostIsDown: typingsJapgolly.winrt.Windows.Networking.Sockets.SocketErrorStatus.hostIsDown & Double = js.native
    
    /* 6 */ val hostNotFound: typingsJapgolly.winrt.Windows.Networking.Sockets.SocketErrorStatus.hostNotFound & Double = js.native
    
    /* 2 */ val httpInvalidServerResponse: typingsJapgolly.winrt.Windows.Networking.Sockets.SocketErrorStatus.httpInvalidServerResponse & Double = js.native
    
    /* 22 */ val messageTooLong: typingsJapgolly.winrt.Windows.Networking.Sockets.SocketErrorStatus.messageTooLong & Double = js.native
    
    /* 16 */ val networkDroppedConnectionOnReset: typingsJapgolly.winrt.Windows.Networking.Sockets.SocketErrorStatus.networkDroppedConnectionOnReset & Double = js.native
    
    /* 15 */ val networkIsDown: typingsJapgolly.winrt.Windows.Networking.Sockets.SocketErrorStatus.networkIsDown & Double = js.native
    
    /* 13 */ val networkIsUnreachable: typingsJapgolly.winrt.Windows.Networking.Sockets.SocketErrorStatus.networkIsUnreachable & Double = js.native
    
    /* 20 */ val noAddressesFound: typingsJapgolly.winrt.Windows.Networking.Sockets.SocketErrorStatus.noAddressesFound & Double = js.native
    
    /* 7 */ val noDataRecordOfRequestedType: typingsJapgolly.winrt.Windows.Networking.Sockets.SocketErrorStatus.noDataRecordOfRequestedType & Double = js.native
    
    /* 8 */ val nonAuthoritativeHostNotFound: typingsJapgolly.winrt.Windows.Networking.Sockets.SocketErrorStatus.nonAuthoritativeHostNotFound & Double = js.native
    
    /* 1 */ val operationAborted: typingsJapgolly.winrt.Windows.Networking.Sockets.SocketErrorStatus.operationAborted & Double = js.native
    
    /* 5 */ val socketTypeNotSupported: typingsJapgolly.winrt.Windows.Networking.Sockets.SocketErrorStatus.socketTypeNotSupported & Double = js.native
    
    /* 17 */ val softwareCausedConnectionAbort: typingsJapgolly.winrt.Windows.Networking.Sockets.SocketErrorStatus.softwareCausedConnectionAbort & Double = js.native
    
    /* 21 */ val tooManyOpenFiles: typingsJapgolly.winrt.Windows.Networking.Sockets.SocketErrorStatus.tooManyOpenFiles & Double = js.native
    
    /* 0 */ val unknown: typingsJapgolly.winrt.Windows.Networking.Sockets.SocketErrorStatus.unknown & Double = js.native
    
    /* 14 */ val unreachableHost: typingsJapgolly.winrt.Windows.Networking.Sockets.SocketErrorStatus.unreachableHost & Double = js.native
  }
  
  @JSGlobal("Windows.Networking.Sockets.SocketMessageType")
  @js.native
  object SocketMessageType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.Networking.Sockets.SocketMessageType & Double] = js.native
    
    /* 0 */ val binary: typingsJapgolly.winrt.Windows.Networking.Sockets.SocketMessageType.binary & Double = js.native
    
    /* 1 */ val utf8: typingsJapgolly.winrt.Windows.Networking.Sockets.SocketMessageType.utf8 & Double = js.native
  }
  
  @JSGlobal("Windows.Networking.Sockets.SocketProtectionLevel")
  @js.native
  object SocketProtectionLevel extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.Networking.Sockets.SocketProtectionLevel & Double] = js.native
    
    /* 0 */ val plainSocket: typingsJapgolly.winrt.Windows.Networking.Sockets.SocketProtectionLevel.plainSocket & Double = js.native
    
    /* 1 */ val ssl: typingsJapgolly.winrt.Windows.Networking.Sockets.SocketProtectionLevel.ssl & Double = js.native
    
    /* 2 */ val sslAllowNullEncryption: typingsJapgolly.winrt.Windows.Networking.Sockets.SocketProtectionLevel.sslAllowNullEncryption & Double = js.native
  }
  
  @JSGlobal("Windows.Networking.Sockets.SocketQualityOfService")
  @js.native
  object SocketQualityOfService extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.Networking.Sockets.SocketQualityOfService & Double] = js.native
    
    /* 1 */ val lowLatency: typingsJapgolly.winrt.Windows.Networking.Sockets.SocketQualityOfService.lowLatency & Double = js.native
    
    /* 0 */ val normal: typingsJapgolly.winrt.Windows.Networking.Sockets.SocketQualityOfService.normal & Double = js.native
  }
  
  @JSGlobal("Windows.Networking.Sockets.StreamSocket")
  @js.native
  open class StreamSocket ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Networking.Sockets.StreamSocket {
    
    /* CompleteClass */
    override def close(): Unit = js.native
  }
  
  @JSGlobal("Windows.Networking.Sockets.StreamSocketControl")
  @js.native
  open class StreamSocketControl ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Networking.Sockets.StreamSocketControl {
    
    /* CompleteClass */
    var keepAlive: Boolean = js.native
    
    /* CompleteClass */
    var noDelay: Boolean = js.native
    
    /* CompleteClass */
    var outboundBufferSizeInBytes: Double = js.native
    
    /* CompleteClass */
    var outboundUnicastHopLimit: Double = js.native
    
    /* CompleteClass */
    var qualityOfService: SocketQualityOfService = js.native
  }
  
  @JSGlobal("Windows.Networking.Sockets.StreamSocketInformation")
  @js.native
  open class StreamSocketInformation ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Networking.Sockets.StreamSocketInformation {
    
    /* CompleteClass */
    var bandwidthStatistics: BandwidthStatistics = js.native
    
    /* CompleteClass */
    var localAddress: typingsJapgolly.winrt.Windows.Networking.HostName = js.native
    
    /* CompleteClass */
    var localPort: String = js.native
    
    /* CompleteClass */
    var protectionLevel: SocketProtectionLevel = js.native
    
    /* CompleteClass */
    var remoteAddress: typingsJapgolly.winrt.Windows.Networking.HostName = js.native
    
    /* CompleteClass */
    var remoteHostName: typingsJapgolly.winrt.Windows.Networking.HostName = js.native
    
    /* CompleteClass */
    var remotePort: String = js.native
    
    /* CompleteClass */
    var remoteServiceName: String = js.native
    
    /* CompleteClass */
    var roundTripTimeStatistics: RoundTripTimeStatistics = js.native
    
    /* CompleteClass */
    var sessionKey: IBuffer = js.native
  }
  
  @JSGlobal("Windows.Networking.Sockets.StreamSocketListener")
  @js.native
  open class StreamSocketListener ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Networking.Sockets.StreamSocketListener {
    
    /* CompleteClass */
    override def bindEndpointAsync(localHostName: typingsJapgolly.winrt.Windows.Networking.HostName, localServiceName: String): IAsyncAction = js.native
    
    /* CompleteClass */
    override def bindServiceNameAsync(localServiceName: String): IAsyncAction = js.native
    
    /* CompleteClass */
    override def close(): Unit = js.native
    
    /* CompleteClass */
    var control: typingsJapgolly.winrt.Windows.Networking.Sockets.StreamSocketListenerControl = js.native
    
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /* CompleteClass */
    var information: typingsJapgolly.winrt.Windows.Networking.Sockets.StreamSocketListenerInformation = js.native
    
    /* CompleteClass */
    var onconnectionreceived: Any = js.native
  }
  
  @JSGlobal("Windows.Networking.Sockets.StreamSocketListenerConnectionReceivedEventArgs")
  @js.native
  open class StreamSocketListenerConnectionReceivedEventArgs ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Networking.Sockets.StreamSocketListenerConnectionReceivedEventArgs {
    
    /* CompleteClass */
    var socket: typingsJapgolly.winrt.Windows.Networking.Sockets.StreamSocket = js.native
  }
  
  @JSGlobal("Windows.Networking.Sockets.StreamSocketListenerControl")
  @js.native
  open class StreamSocketListenerControl ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Networking.Sockets.StreamSocketListenerControl {
    
    /* CompleteClass */
    var qualityOfService: SocketQualityOfService = js.native
  }
  
  @JSGlobal("Windows.Networking.Sockets.StreamSocketListenerInformation")
  @js.native
  open class StreamSocketListenerInformation ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Networking.Sockets.StreamSocketListenerInformation {
    
    /* CompleteClass */
    var localPort: String = js.native
  }
  
  @JSGlobal("Windows.Networking.Sockets.StreamWebSocket")
  @js.native
  open class StreamWebSocket ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Networking.Sockets.StreamWebSocket {
    
    /* CompleteClass */
    override def close(): Unit = js.native
  }
  
  @JSGlobal("Windows.Networking.Sockets.StreamWebSocketControl")
  @js.native
  open class StreamWebSocketControl ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Networking.Sockets.StreamWebSocketControl {
    
    /* CompleteClass */
    var noDelay: Boolean = js.native
    
    /* CompleteClass */
    var outboundBufferSizeInBytes: Double = js.native
    
    /* CompleteClass */
    var proxyCredential: PasswordCredential = js.native
    
    /* CompleteClass */
    var serverCredential: PasswordCredential = js.native
    
    /* CompleteClass */
    var supportedProtocols: IVector[String] = js.native
  }
  
  @JSGlobal("Windows.Networking.Sockets.StreamWebSocketInformation")
  @js.native
  open class StreamWebSocketInformation ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Networking.Sockets.StreamWebSocketInformation {
    
    /* CompleteClass */
    var bandwidthStatistics: BandwidthStatistics = js.native
    
    /* CompleteClass */
    var localAddress: typingsJapgolly.winrt.Windows.Networking.HostName = js.native
    
    /* CompleteClass */
    var protocol: String = js.native
  }
  
  @JSGlobal("Windows.Networking.Sockets.WebSocketClosedEventArgs")
  @js.native
  open class WebSocketClosedEventArgs ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Networking.Sockets.WebSocketClosedEventArgs {
    
    /* CompleteClass */
    var code: Double = js.native
    
    /* CompleteClass */
    var reason: String = js.native
  }
  
  @JSGlobal("Windows.Networking.Sockets.WebSocketError")
  @js.native
  open class WebSocketError ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Networking.Sockets.WebSocketError
  /* static members */
  object WebSocketError {
    
    @JSGlobal("Windows.Networking.Sockets.WebSocketError")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getStatus(hresult: Double): WebErrorStatus = ^.asInstanceOf[js.Dynamic].applyDynamic("getStatus")(hresult.asInstanceOf[js.Any]).asInstanceOf[WebErrorStatus]
  }
  
  @JSGlobal("Windows.Networking.Sockets.WebSocketKeepAlive")
  @js.native
  open class WebSocketKeepAlive ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Networking.Sockets.WebSocketKeepAlive {
    
    /* CompleteClass */
    override def run(taskInstance: IBackgroundTaskInstance): Unit = js.native
  }
}
