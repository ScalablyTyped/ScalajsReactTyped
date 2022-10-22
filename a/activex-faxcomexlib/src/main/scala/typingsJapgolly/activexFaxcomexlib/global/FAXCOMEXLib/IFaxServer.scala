package typingsJapgolly.activexFaxcomexlib.global.FAXCOMEXLib

import typingsJapgolly.activexFaxcomexlib.FAXCOMEXLib.FAX_SERVER_APIVERSION_ENUM
import typingsJapgolly.activexFaxcomexlib.FAXCOMEXLib.FAX_SERVER_EVENTS_TYPE_ENUM
import typingsJapgolly.activexFaxcomexlib.FAXCOMEXLib.FaxDeviceProviders
import typingsJapgolly.activexFaxcomexlib.FAXCOMEXLib.FaxDevices
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** IFaxServer interface */
@JSGlobal("FAXCOMEXLib.IFaxServer")
@js.native
open class IFaxServer ()
  extends StObject
     with typingsJapgolly.activexFaxcomexlib.FAXCOMEXLib.IFaxServer {
  
  /** Version of the fax server API */
  /* CompleteClass */
  override val APIVersion: FAX_SERVER_APIVERSION_ENUM = js.native
  
  /** The fax server activity status object */
  /* CompleteClass */
  override val Activity: typingsJapgolly.activexFaxcomexlib.FAXCOMEXLib.FaxActivity = js.native
  
  /** Connect to the fax server */
  /* CompleteClass */
  override def Connect(bstrServerName: String): Unit = js.native
  
  /** Is fax server built in debug environment */
  /* CompleteClass */
  override val Debug: Boolean = js.native
  
  /** Disconnect from the fax server */
  /* CompleteClass */
  override def Disconnect(): Unit = js.native
  
  /** The fax folders object */
  /* CompleteClass */
  override val Folders: typingsJapgolly.activexFaxcomexlib.FAXCOMEXLib.FaxFolders = js.native
  
  /** The collection of device providers */
  /* CompleteClass */
  override def GetDeviceProviders(): FaxDeviceProviders = js.native
  
  /** The collection of all available devices */
  /* CompleteClass */
  override def GetDevices(): FaxDevices = js.native
  
  /** Return server level extention property */
  /* CompleteClass */
  override def GetExtensionProperty(bstrGUID: String): Any = js.native
  
  /** The inbound routing configuration object */
  /* CompleteClass */
  override val InboundRouting: typingsJapgolly.activexFaxcomexlib.FAXCOMEXLib.FaxInboundRouting = js.native
  
  /** Set bit-wise combination of events the fax server listens to */
  /* CompleteClass */
  override def ListenToServerEvents(EventTypes: FAX_SERVER_EVENTS_TYPE_ENUM): Unit = js.native
  
  /** The logging options configuration object */
  /* CompleteClass */
  override val LoggingOptions: typingsJapgolly.activexFaxcomexlib.FAXCOMEXLib.FaxLoggingOptions = js.native
  
  /** The major part of the fax server's build number */
  /* CompleteClass */
  override val MajorBuild: Double = js.native
  
  /** The major part of the fax server's version number */
  /* CompleteClass */
  override val MajorVersion: Double = js.native
  
  /** The minor part of the fax server's build number */
  /* CompleteClass */
  override val MinorBuild: Double = js.native
  
  /** The minor part of the fax server's version number */
  /* CompleteClass */
  override val MinorVersion: Double = js.native
  
  /** The outbound routing configuration object */
  /* CompleteClass */
  override val OutboundRouting: typingsJapgolly.activexFaxcomexlib.FAXCOMEXLib.FaxOutboundRouting = js.native
  
  /** The receipt options configuration object */
  /* CompleteClass */
  override val ReceiptOptions: typingsJapgolly.activexFaxcomexlib.FAXCOMEXLib.FaxReceiptOptions = js.native
  
  /** Register device provider */
  /* CompleteClass */
  override def RegisterDeviceProvider(
    bstrGUID: String,
    bstrFriendlyName: String,
    bstrImageName: String,
    TspName: String,
    lFSPIVersion: Double
  ): Unit = js.native
  
  /** Register inbound routing extension */
  /* CompleteClass */
  override def RegisterInboundRoutingExtension(bstrExtensionName: String, bstrFriendlyName: String, bstrImageName: String, vMethods: Any): Unit = js.native
  
  /** Events the fax Server is listening to */
  /* CompleteClass */
  override val RegisteredEvents: FAX_SERVER_EVENTS_TYPE_ENUM = js.native
  
  /** The security configuration object */
  /* CompleteClass */
  override val Security: typingsJapgolly.activexFaxcomexlib.FAXCOMEXLib.FaxSecurity = js.native
  
  /** The name of the fax server */
  /* CompleteClass */
  override val ServerName: String = js.native
  
  /** Set server level extention property */
  /* CompleteClass */
  override def SetExtensionProperty(bstrGUID: String, vProperty: SafeArray[Any]): Unit = js.native
  
  /** Unregister device provider */
  /* CompleteClass */
  override def UnregisterDeviceProvider(bstrUniqueName: String): Unit = js.native
  
  /** Unregister inbound routing extension */
  /* CompleteClass */
  override def UnregisterInboundRoutingExtension(bstrExtensionUniqueName: String): Unit = js.native
}
