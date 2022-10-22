package typingsJapgolly.activexFaxcomexlib.FAXCOMEXLib

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** IFaxServer interface */
trait IFaxServer extends StObject {
  
  /** Version of the fax server API */
  val APIVersion: FAX_SERVER_APIVERSION_ENUM
  
  /** The fax server activity status object */
  val Activity: FaxActivity
  
  /** Connect to the fax server */
  def Connect(bstrServerName: String): Unit
  
  /** Is fax server built in debug environment */
  val Debug: Boolean
  
  /** Disconnect from the fax server */
  def Disconnect(): Unit
  
  /** The fax folders object */
  val Folders: FaxFolders
  
  /** The collection of device providers */
  def GetDeviceProviders(): FaxDeviceProviders
  
  /** The collection of all available devices */
  def GetDevices(): FaxDevices
  
  /** Return server level extention property */
  def GetExtensionProperty(bstrGUID: String): Any
  
  /** The inbound routing configuration object */
  val InboundRouting: FaxInboundRouting
  
  /** Set bit-wise combination of events the fax server listens to */
  def ListenToServerEvents(EventTypes: FAX_SERVER_EVENTS_TYPE_ENUM): Unit
  
  /** The logging options configuration object */
  val LoggingOptions: FaxLoggingOptions
  
  /** The major part of the fax server's build number */
  val MajorBuild: Double
  
  /** The major part of the fax server's version number */
  val MajorVersion: Double
  
  /** The minor part of the fax server's build number */
  val MinorBuild: Double
  
  /** The minor part of the fax server's version number */
  val MinorVersion: Double
  
  /** The outbound routing configuration object */
  val OutboundRouting: FaxOutboundRouting
  
  /** The receipt options configuration object */
  val ReceiptOptions: FaxReceiptOptions
  
  /** Register device provider */
  def RegisterDeviceProvider(
    bstrGUID: String,
    bstrFriendlyName: String,
    bstrImageName: String,
    TspName: String,
    lFSPIVersion: Double
  ): Unit
  
  /** Register inbound routing extension */
  def RegisterInboundRoutingExtension(bstrExtensionName: String, bstrFriendlyName: String, bstrImageName: String, vMethods: Any): Unit
  
  /** Events the fax Server is listening to */
  val RegisteredEvents: FAX_SERVER_EVENTS_TYPE_ENUM
  
  /** The security configuration object */
  val Security: FaxSecurity
  
  /** The name of the fax server */
  val ServerName: String
  
  /** Set server level extention property */
  def SetExtensionProperty(bstrGUID: String, vProperty: SafeArray[Any]): Unit
  
  /** Unregister device provider */
  def UnregisterDeviceProvider(bstrUniqueName: String): Unit
  
  /** Unregister inbound routing extension */
  def UnregisterInboundRoutingExtension(bstrExtensionUniqueName: String): Unit
}
object IFaxServer {
  
  inline def apply(
    APIVersion: FAX_SERVER_APIVERSION_ENUM,
    Activity: FaxActivity,
    Connect: String => Callback,
    Debug: Boolean,
    Disconnect: Callback,
    Folders: FaxFolders,
    GetDeviceProviders: CallbackTo[FaxDeviceProviders],
    GetDevices: CallbackTo[FaxDevices],
    GetExtensionProperty: String => Any,
    InboundRouting: FaxInboundRouting,
    ListenToServerEvents: FAX_SERVER_EVENTS_TYPE_ENUM => Callback,
    LoggingOptions: FaxLoggingOptions,
    MajorBuild: Double,
    MajorVersion: Double,
    MinorBuild: Double,
    MinorVersion: Double,
    OutboundRouting: FaxOutboundRouting,
    ReceiptOptions: FaxReceiptOptions,
    RegisterDeviceProvider: (String, String, String, String, Double) => Callback,
    RegisterInboundRoutingExtension: (String, String, String, Any) => Callback,
    RegisteredEvents: FAX_SERVER_EVENTS_TYPE_ENUM,
    Security: FaxSecurity,
    ServerName: String,
    SetExtensionProperty: (String, SafeArray[Any]) => Callback,
    UnregisterDeviceProvider: String => Callback,
    UnregisterInboundRoutingExtension: String => Callback
  ): IFaxServer = {
    val __obj = js.Dynamic.literal(APIVersion = APIVersion.asInstanceOf[js.Any], Activity = Activity.asInstanceOf[js.Any], Connect = js.Any.fromFunction1((t0: String) => Connect(t0).runNow()), Debug = Debug.asInstanceOf[js.Any], Disconnect = Disconnect.toJsFn, Folders = Folders.asInstanceOf[js.Any], GetDeviceProviders = GetDeviceProviders.toJsFn, GetDevices = GetDevices.toJsFn, GetExtensionProperty = js.Any.fromFunction1(GetExtensionProperty), InboundRouting = InboundRouting.asInstanceOf[js.Any], ListenToServerEvents = js.Any.fromFunction1((t0: FAX_SERVER_EVENTS_TYPE_ENUM) => ListenToServerEvents(t0).runNow()), LoggingOptions = LoggingOptions.asInstanceOf[js.Any], MajorBuild = MajorBuild.asInstanceOf[js.Any], MajorVersion = MajorVersion.asInstanceOf[js.Any], MinorBuild = MinorBuild.asInstanceOf[js.Any], MinorVersion = MinorVersion.asInstanceOf[js.Any], OutboundRouting = OutboundRouting.asInstanceOf[js.Any], ReceiptOptions = ReceiptOptions.asInstanceOf[js.Any], RegisterDeviceProvider = js.Any.fromFunction5((t0: String, t1: String, t2: String, t3: String, t4: Double) => (RegisterDeviceProvider(t0, t1, t2, t3, t4)).runNow()), RegisterInboundRoutingExtension = js.Any.fromFunction4((t0: String, t1: String, t2: String, t3: Any) => (RegisterInboundRoutingExtension(t0, t1, t2, t3)).runNow()), RegisteredEvents = RegisteredEvents.asInstanceOf[js.Any], Security = Security.asInstanceOf[js.Any], ServerName = ServerName.asInstanceOf[js.Any], SetExtensionProperty = js.Any.fromFunction2((t0: String, t1: SafeArray[Any]) => (SetExtensionProperty(t0, t1)).runNow()), UnregisterDeviceProvider = js.Any.fromFunction1((t0: String) => UnregisterDeviceProvider(t0).runNow()), UnregisterInboundRoutingExtension = js.Any.fromFunction1((t0: String) => UnregisterInboundRoutingExtension(t0).runNow()))
    __obj.asInstanceOf[IFaxServer]
  }
  
  extension [Self <: IFaxServer](x: Self) {
    
    inline def setAPIVersion(value: FAX_SERVER_APIVERSION_ENUM): Self = StObject.set(x, "APIVersion", value.asInstanceOf[js.Any])
    
    inline def setActivity(value: FaxActivity): Self = StObject.set(x, "Activity", value.asInstanceOf[js.Any])
    
    inline def setConnect(value: String => Callback): Self = StObject.set(x, "Connect", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setDebug(value: Boolean): Self = StObject.set(x, "Debug", value.asInstanceOf[js.Any])
    
    inline def setDisconnect(value: Callback): Self = StObject.set(x, "Disconnect", value.toJsFn)
    
    inline def setFolders(value: FaxFolders): Self = StObject.set(x, "Folders", value.asInstanceOf[js.Any])
    
    inline def setGetDeviceProviders(value: CallbackTo[FaxDeviceProviders]): Self = StObject.set(x, "GetDeviceProviders", value.toJsFn)
    
    inline def setGetDevices(value: CallbackTo[FaxDevices]): Self = StObject.set(x, "GetDevices", value.toJsFn)
    
    inline def setGetExtensionProperty(value: String => Any): Self = StObject.set(x, "GetExtensionProperty", js.Any.fromFunction1(value))
    
    inline def setInboundRouting(value: FaxInboundRouting): Self = StObject.set(x, "InboundRouting", value.asInstanceOf[js.Any])
    
    inline def setListenToServerEvents(value: FAX_SERVER_EVENTS_TYPE_ENUM => Callback): Self = StObject.set(x, "ListenToServerEvents", js.Any.fromFunction1((t0: FAX_SERVER_EVENTS_TYPE_ENUM) => value(t0).runNow()))
    
    inline def setLoggingOptions(value: FaxLoggingOptions): Self = StObject.set(x, "LoggingOptions", value.asInstanceOf[js.Any])
    
    inline def setMajorBuild(value: Double): Self = StObject.set(x, "MajorBuild", value.asInstanceOf[js.Any])
    
    inline def setMajorVersion(value: Double): Self = StObject.set(x, "MajorVersion", value.asInstanceOf[js.Any])
    
    inline def setMinorBuild(value: Double): Self = StObject.set(x, "MinorBuild", value.asInstanceOf[js.Any])
    
    inline def setMinorVersion(value: Double): Self = StObject.set(x, "MinorVersion", value.asInstanceOf[js.Any])
    
    inline def setOutboundRouting(value: FaxOutboundRouting): Self = StObject.set(x, "OutboundRouting", value.asInstanceOf[js.Any])
    
    inline def setReceiptOptions(value: FaxReceiptOptions): Self = StObject.set(x, "ReceiptOptions", value.asInstanceOf[js.Any])
    
    inline def setRegisterDeviceProvider(value: (String, String, String, String, Double) => Callback): Self = StObject.set(x, "RegisterDeviceProvider", js.Any.fromFunction5((t0: String, t1: String, t2: String, t3: String, t4: Double) => (value(t0, t1, t2, t3, t4)).runNow()))
    
    inline def setRegisterInboundRoutingExtension(value: (String, String, String, Any) => Callback): Self = StObject.set(x, "RegisterInboundRoutingExtension", js.Any.fromFunction4((t0: String, t1: String, t2: String, t3: Any) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setRegisteredEvents(value: FAX_SERVER_EVENTS_TYPE_ENUM): Self = StObject.set(x, "RegisteredEvents", value.asInstanceOf[js.Any])
    
    inline def setSecurity(value: FaxSecurity): Self = StObject.set(x, "Security", value.asInstanceOf[js.Any])
    
    inline def setServerName(value: String): Self = StObject.set(x, "ServerName", value.asInstanceOf[js.Any])
    
    inline def setSetExtensionProperty(value: (String, SafeArray[Any]) => Callback): Self = StObject.set(x, "SetExtensionProperty", js.Any.fromFunction2((t0: String, t1: SafeArray[Any]) => (value(t0, t1)).runNow()))
    
    inline def setUnregisterDeviceProvider(value: String => Callback): Self = StObject.set(x, "UnregisterDeviceProvider", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setUnregisterInboundRoutingExtension(value: String => Callback): Self = StObject.set(x, "UnregisterInboundRoutingExtension", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
