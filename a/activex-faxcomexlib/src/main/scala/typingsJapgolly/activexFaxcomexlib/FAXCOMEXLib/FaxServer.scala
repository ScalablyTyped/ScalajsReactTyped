package typingsJapgolly.activexFaxcomexlib.FAXCOMEXLib

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** FaxServer Class */
trait FaxServer
  extends StObject
     with IFaxServer {
  
  /** Fax server configuration */
  val Configuration: FaxConfiguration
  
  /** FaxAccount for the current connection */
  val CurrentAccount: FaxAccount
  
  /* private */ @JSName("FAXCOMEXLib.FaxServer_typekey")
  var FAXCOMEXLibDotFaxServer_typekey: FaxServer
  
  /** The FaxAccountSet configuration object */
  val FaxAccountSet: typingsJapgolly.activexFaxcomexlib.FAXCOMEXLib.FaxAccountSet
  
  /** The security configuration object */
  val Security2: FaxSecurity2
}
object FaxServer {
  
  inline def apply(
    APIVersion: FAX_SERVER_APIVERSION_ENUM,
    Activity: FaxActivity,
    Configuration: FaxConfiguration,
    Connect: String => Callback,
    CurrentAccount: FaxAccount,
    Debug: Boolean,
    Disconnect: Callback,
    FAXCOMEXLibDotFaxServer_typekey: FaxServer,
    FaxAccountSet: FaxAccountSet,
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
    Security2: FaxSecurity2,
    ServerName: String,
    SetExtensionProperty: (String, SafeArray[Any]) => Callback,
    UnregisterDeviceProvider: String => Callback,
    UnregisterInboundRoutingExtension: String => Callback
  ): FaxServer = {
    val __obj = js.Dynamic.literal(APIVersion = APIVersion.asInstanceOf[js.Any], Activity = Activity.asInstanceOf[js.Any], Configuration = Configuration.asInstanceOf[js.Any], Connect = js.Any.fromFunction1((t0: String) => Connect(t0).runNow()), CurrentAccount = CurrentAccount.asInstanceOf[js.Any], Debug = Debug.asInstanceOf[js.Any], Disconnect = Disconnect.toJsFn, FaxAccountSet = FaxAccountSet.asInstanceOf[js.Any], Folders = Folders.asInstanceOf[js.Any], GetDeviceProviders = GetDeviceProviders.toJsFn, GetDevices = GetDevices.toJsFn, GetExtensionProperty = js.Any.fromFunction1(GetExtensionProperty), InboundRouting = InboundRouting.asInstanceOf[js.Any], ListenToServerEvents = js.Any.fromFunction1((t0: FAX_SERVER_EVENTS_TYPE_ENUM) => ListenToServerEvents(t0).runNow()), LoggingOptions = LoggingOptions.asInstanceOf[js.Any], MajorBuild = MajorBuild.asInstanceOf[js.Any], MajorVersion = MajorVersion.asInstanceOf[js.Any], MinorBuild = MinorBuild.asInstanceOf[js.Any], MinorVersion = MinorVersion.asInstanceOf[js.Any], OutboundRouting = OutboundRouting.asInstanceOf[js.Any], ReceiptOptions = ReceiptOptions.asInstanceOf[js.Any], RegisterDeviceProvider = js.Any.fromFunction5((t0: String, t1: String, t2: String, t3: String, t4: Double) => (RegisterDeviceProvider(t0, t1, t2, t3, t4)).runNow()), RegisterInboundRoutingExtension = js.Any.fromFunction4((t0: String, t1: String, t2: String, t3: Any) => (RegisterInboundRoutingExtension(t0, t1, t2, t3)).runNow()), RegisteredEvents = RegisteredEvents.asInstanceOf[js.Any], Security = Security.asInstanceOf[js.Any], Security2 = Security2.asInstanceOf[js.Any], ServerName = ServerName.asInstanceOf[js.Any], SetExtensionProperty = js.Any.fromFunction2((t0: String, t1: SafeArray[Any]) => (SetExtensionProperty(t0, t1)).runNow()), UnregisterDeviceProvider = js.Any.fromFunction1((t0: String) => UnregisterDeviceProvider(t0).runNow()), UnregisterInboundRoutingExtension = js.Any.fromFunction1((t0: String) => UnregisterInboundRoutingExtension(t0).runNow()))
    __obj.updateDynamic("FAXCOMEXLib.FaxServer_typekey")(FAXCOMEXLibDotFaxServer_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaxServer]
  }
  
  extension [Self <: FaxServer](x: Self) {
    
    inline def setConfiguration(value: FaxConfiguration): Self = StObject.set(x, "Configuration", value.asInstanceOf[js.Any])
    
    inline def setCurrentAccount(value: FaxAccount): Self = StObject.set(x, "CurrentAccount", value.asInstanceOf[js.Any])
    
    inline def setFAXCOMEXLibDotFaxServer_typekey(value: FaxServer): Self = StObject.set(x, "FAXCOMEXLib.FaxServer_typekey", value.asInstanceOf[js.Any])
    
    inline def setFaxAccountSet(value: FaxAccountSet): Self = StObject.set(x, "FaxAccountSet", value.asInstanceOf[js.Any])
    
    inline def setSecurity2(value: FaxSecurity2): Self = StObject.set(x, "Security2", value.asInstanceOf[js.Any])
  }
}
