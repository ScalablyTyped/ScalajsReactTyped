package typingsJapgolly.winrt.global.Windows.Networking

import typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlDocument
import typingsJapgolly.winrt.Windows.Devices.Sms.CellularClass
import typingsJapgolly.winrt.Windows.Devices.Sms.ISmsMessage
import typingsJapgolly.winrt.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import typingsJapgolly.winrt.Windows.Foundation.Uri
import typingsJapgolly.winrt.Windows.Networking.Connectivity.NetworkAdapter
import typingsJapgolly.winrt.Windows.Networking.Connectivity.NetworkCostType
import typingsJapgolly.winrt.Windows.Networking.NetworkOperators.DataClasses
import typingsJapgolly.winrt.Windows.Networking.NetworkOperators.MobileBroadbandAccountWatcherStatus
import typingsJapgolly.winrt.Windows.Networking.NetworkOperators.MobileBroadbandDeviceType
import typingsJapgolly.winrt.Windows.Networking.NetworkOperators.MobileBroadbandRadioState
import typingsJapgolly.winrt.Windows.Networking.NetworkOperators.NetworkDeviceStatus
import typingsJapgolly.winrt.Windows.Networking.NetworkOperators.NetworkOperatorEventMessageType
import typingsJapgolly.winrt.Windows.Networking.NetworkOperators.NetworkRegistrationState
import typingsJapgolly.winrt.Windows.Networking.NetworkOperators.ProfileMediaType
import typingsJapgolly.winrt.Windows.Networking.NetworkOperators.ProfileUsage
import typingsJapgolly.winrt.Windows.Networking.NetworkOperators.UssdResultCode
import typingsJapgolly.winrt.anon.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NetworkOperators {
  
  @JSGlobal("Windows.Networking.NetworkOperators.DataClasses")
  @js.native
  object DataClasses extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.Networking.NetworkOperators.DataClasses & Double] = js.native
    
    /* 8 */ val cdma1xEvdo: typingsJapgolly.winrt.Windows.Networking.NetworkOperators.DataClasses.cdma1xEvdo & Double = js.native
    
    /* 9 */ val cdma1xEvdoRevA: typingsJapgolly.winrt.Windows.Networking.NetworkOperators.DataClasses.cdma1xEvdoRevA & Double = js.native
    
    /* 12 */ val cdma1xEvdoRevB: typingsJapgolly.winrt.Windows.Networking.NetworkOperators.DataClasses.cdma1xEvdoRevB & Double = js.native
    
    /* 10 */ val cdma1xEvdv: typingsJapgolly.winrt.Windows.Networking.NetworkOperators.DataClasses.cdma1xEvdv & Double = js.native
    
    /* 7 */ val cdma1xRtt: typingsJapgolly.winrt.Windows.Networking.NetworkOperators.DataClasses.cdma1xRtt & Double = js.native
    
    /* 11 */ val cdma3xRtt: typingsJapgolly.winrt.Windows.Networking.NetworkOperators.DataClasses.cdma3xRtt & Double = js.native
    
    /* 13 */ val cdmaUmb: typingsJapgolly.winrt.Windows.Networking.NetworkOperators.DataClasses.cdmaUmb & Double = js.native
    
    /* 14 */ val custom: typingsJapgolly.winrt.Windows.Networking.NetworkOperators.DataClasses.custom & Double = js.native
    
    /* 2 */ val edge: typingsJapgolly.winrt.Windows.Networking.NetworkOperators.DataClasses.edge & Double = js.native
    
    /* 1 */ val gprs: typingsJapgolly.winrt.Windows.Networking.NetworkOperators.DataClasses.gprs & Double = js.native
    
    /* 4 */ val hsdpa: typingsJapgolly.winrt.Windows.Networking.NetworkOperators.DataClasses.hsdpa & Double = js.native
    
    /* 5 */ val hsupa: typingsJapgolly.winrt.Windows.Networking.NetworkOperators.DataClasses.hsupa & Double = js.native
    
    /* 6 */ val lteAdvanced: typingsJapgolly.winrt.Windows.Networking.NetworkOperators.DataClasses.lteAdvanced & Double = js.native
    
    /* 0 */ val none: typingsJapgolly.winrt.Windows.Networking.NetworkOperators.DataClasses.none & Double = js.native
    
    /* 3 */ val umts: typingsJapgolly.winrt.Windows.Networking.NetworkOperators.DataClasses.umts & Double = js.native
  }
  
  @JSGlobal("Windows.Networking.NetworkOperators.HotspotAuthenticationContext")
  @js.native
  open class HotspotAuthenticationContext ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Networking.NetworkOperators.HotspotAuthenticationContext {
    
    /* CompleteClass */
    override def abortAuthentication(markAsManual: Boolean): Unit = js.native
    
    /* CompleteClass */
    var authenticationUrl: Uri = js.native
    
    /* CompleteClass */
    override def issueCredentials(userName: String, password: String, extraParameters: String, markAsManualConnectOnFailure: Boolean): Unit = js.native
    
    /* CompleteClass */
    var networkAdapter: NetworkAdapter = js.native
    
    /* CompleteClass */
    var redirectMessageUrl: Uri = js.native
    
    /* CompleteClass */
    var redirectMessageXml: XmlDocument = js.native
    
    /* CompleteClass */
    override def skipAuthentication(): Unit = js.native
    
    /* CompleteClass */
    override def triggerAttentionRequired(packageRelativeApplicationId: String, applicationParameters: String): Unit = js.native
    
    /* CompleteClass */
    var wirelessNetworkId: js.typedarray.Uint8Array = js.native
  }
  /* static members */
  object HotspotAuthenticationContext {
    
    @JSGlobal("Windows.Networking.NetworkOperators.HotspotAuthenticationContext")
    @js.native
    val ^ : js.Any = js.native
    
    inline def tryGetAuthenticationContext(evenToken: String): Context = ^.asInstanceOf[js.Dynamic].applyDynamic("tryGetAuthenticationContext")(evenToken.asInstanceOf[js.Any]).asInstanceOf[Context]
  }
  
  @JSGlobal("Windows.Networking.NetworkOperators.HotspotAuthenticationEventDetails")
  @js.native
  open class HotspotAuthenticationEventDetails ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Networking.NetworkOperators.HotspotAuthenticationEventDetails {
    
    /* CompleteClass */
    var eventToken: String = js.native
  }
  
  @JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandAccount")
  @js.native
  open class MobileBroadbandAccount ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Networking.NetworkOperators.MobileBroadbandAccount {
    
    /* CompleteClass */
    var currentDeviceInformation: typingsJapgolly.winrt.Windows.Networking.NetworkOperators.MobileBroadbandDeviceInformation = js.native
    
    /* CompleteClass */
    var currentNetwork: typingsJapgolly.winrt.Windows.Networking.NetworkOperators.MobileBroadbandNetwork = js.native
    
    /* CompleteClass */
    var networkAccountId: String = js.native
    
    /* CompleteClass */
    var serviceProviderGuid: String = js.native
    
    /* CompleteClass */
    var serviceProviderName: String = js.native
  }
  /* static members */
  object MobileBroadbandAccount {
    
    @JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandAccount")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandAccount.availableNetworkAccountIds")
    @js.native
    def availableNetworkAccountIds: IVectorView[String] = js.native
    inline def availableNetworkAccountIds_=(x: IVectorView[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("availableNetworkAccountIds")(x.asInstanceOf[js.Any])
    
    inline def createFromNetworkAccountId(networkAccountId: String): typingsJapgolly.winrt.Windows.Networking.NetworkOperators.MobileBroadbandAccount = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromNetworkAccountId")(networkAccountId.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.winrt.Windows.Networking.NetworkOperators.MobileBroadbandAccount]
  }
  
  @JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandAccountEventArgs")
  @js.native
  open class MobileBroadbandAccountEventArgs ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Networking.NetworkOperators.MobileBroadbandAccountEventArgs {
    
    /* CompleteClass */
    var networkAccountId: String = js.native
  }
  
  @JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandAccountUpdatedEventArgs")
  @js.native
  open class MobileBroadbandAccountUpdatedEventArgs ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Networking.NetworkOperators.MobileBroadbandAccountUpdatedEventArgs {
    
    /* CompleteClass */
    var hasDeviceInformationChanged: Boolean = js.native
    
    /* CompleteClass */
    var hasNetworkChanged: Boolean = js.native
    
    /* CompleteClass */
    var networkAccountId: String = js.native
  }
  
  @JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandAccountWatcher")
  @js.native
  open class MobileBroadbandAccountWatcher ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Networking.NetworkOperators.MobileBroadbandAccountWatcher {
    
    /* CompleteClass */
    var onaccountadded: Any = js.native
    
    /* CompleteClass */
    var onaccountremoved: Any = js.native
    
    /* CompleteClass */
    var onaccountupdated: Any = js.native
    
    /* CompleteClass */
    var onenumerationcompleted: Any = js.native
    
    /* CompleteClass */
    var onstopped: Any = js.native
    
    /* CompleteClass */
    override def start(): Unit = js.native
    
    /* CompleteClass */
    var status: MobileBroadbandAccountWatcherStatus = js.native
    
    /* CompleteClass */
    override def stop(): Unit = js.native
  }
  
  @JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandAccountWatcherStatus")
  @js.native
  object MobileBroadbandAccountWatcherStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.winrt.Windows.Networking.NetworkOperators.MobileBroadbandAccountWatcherStatus & Double
      ] = js.native
    
    /* 4 */ val aborted: typingsJapgolly.winrt.Windows.Networking.NetworkOperators.MobileBroadbandAccountWatcherStatus.aborted & Double = js.native
    
    /* 0 */ val created: typingsJapgolly.winrt.Windows.Networking.NetworkOperators.MobileBroadbandAccountWatcherStatus.created & Double = js.native
    
    /* 2 */ val enumerationCompleted: typingsJapgolly.winrt.Windows.Networking.NetworkOperators.MobileBroadbandAccountWatcherStatus.enumerationCompleted & Double = js.native
    
    /* 1 */ val started: typingsJapgolly.winrt.Windows.Networking.NetworkOperators.MobileBroadbandAccountWatcherStatus.started & Double = js.native
    
    /* 3 */ val stopped: typingsJapgolly.winrt.Windows.Networking.NetworkOperators.MobileBroadbandAccountWatcherStatus.stopped & Double = js.native
  }
  
  @JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandDeviceInformation")
  @js.native
  open class MobileBroadbandDeviceInformation ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Networking.NetworkOperators.MobileBroadbandDeviceInformation {
    
    /* CompleteClass */
    var cellularClass: CellularClass = js.native
    
    /* CompleteClass */
    var currentRadioState: MobileBroadbandRadioState = js.native
    
    /* CompleteClass */
    var customDataClass: String = js.native
    
    /* CompleteClass */
    var dataClasses: DataClasses = js.native
    
    /* CompleteClass */
    var deviceId: String = js.native
    
    /* CompleteClass */
    var deviceType: MobileBroadbandDeviceType = js.native
    
    /* CompleteClass */
    var firmwareInformation: String = js.native
    
    /* CompleteClass */
    var manufacturer: String = js.native
    
    /* CompleteClass */
    var mobileEquipmentId: String = js.native
    
    /* CompleteClass */
    var model: String = js.native
    
    /* CompleteClass */
    var networkDeviceStatus: NetworkDeviceStatus = js.native
    
    /* CompleteClass */
    var simIccId: String = js.native
    
    /* CompleteClass */
    var subscriberId: String = js.native
    
    /* CompleteClass */
    var telephoneNumbers: IVectorView[String] = js.native
  }
  
  @JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandDeviceType")
  @js.native
  object MobileBroadbandDeviceType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.winrt.Windows.Networking.NetworkOperators.MobileBroadbandDeviceType & Double
      ] = js.native
    
    /* 1 */ val embedded: typingsJapgolly.winrt.Windows.Networking.NetworkOperators.MobileBroadbandDeviceType.embedded & Double = js.native
    
    /* 3 */ val remote: typingsJapgolly.winrt.Windows.Networking.NetworkOperators.MobileBroadbandDeviceType.remote & Double = js.native
    
    /* 2 */ val removable: typingsJapgolly.winrt.Windows.Networking.NetworkOperators.MobileBroadbandDeviceType.removable & Double = js.native
    
    /* 0 */ val unknown: typingsJapgolly.winrt.Windows.Networking.NetworkOperators.MobileBroadbandDeviceType.unknown & Double = js.native
  }
  
  @JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandNetwork")
  @js.native
  open class MobileBroadbandNetwork ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Networking.NetworkOperators.MobileBroadbandNetwork {
    
    /* CompleteClass */
    var accessPointName: String = js.native
    
    /* CompleteClass */
    var activationNetworkError: Double = js.native
    
    /* CompleteClass */
    var networkAdapter: NetworkAdapter = js.native
    
    /* CompleteClass */
    var networkRegistrationState: NetworkRegistrationState = js.native
    
    /* CompleteClass */
    var packetAttachNetworkError: Double = js.native
    
    /* CompleteClass */
    var registeredDataClass: DataClasses = js.native
    
    /* CompleteClass */
    var registeredProviderId: String = js.native
    
    /* CompleteClass */
    var registeredProviderName: String = js.native
    
    /* CompleteClass */
    var registrationNetworkError: Double = js.native
    
    /* CompleteClass */
    override def showConnectionUI(): Unit = js.native
  }
  
  @JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandRadioState")
  @js.native
  object MobileBroadbandRadioState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.winrt.Windows.Networking.NetworkOperators.MobileBroadbandRadioState & Double
      ] = js.native
    
    /* 0 */ val off: typingsJapgolly.winrt.Windows.Networking.NetworkOperators.MobileBroadbandRadioState.off & Double = js.native
    
    /* 1 */ val on: typingsJapgolly.winrt.Windows.Networking.NetworkOperators.MobileBroadbandRadioState.on & Double = js.native
  }
  
  @JSGlobal("Windows.Networking.NetworkOperators.NetworkDeviceStatus")
  @js.native
  object NetworkDeviceStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.winrt.Windows.Networking.NetworkOperators.NetworkDeviceStatus & Double
      ] = js.native
    
    /* 5 */ val accountNotActivated: typingsJapgolly.winrt.Windows.Networking.NetworkOperators.NetworkDeviceStatus.accountNotActivated & Double = js.native
    
    /* 3 */ val badSim: typingsJapgolly.winrt.Windows.Networking.NetworkOperators.NetworkDeviceStatus.badSim & Double = js.native
    
    /* 7 */ val deviceBlocked: typingsJapgolly.winrt.Windows.Networking.NetworkOperators.NetworkDeviceStatus.deviceBlocked & Double = js.native
    
    /* 4 */ val deviceHardwareFailure: typingsJapgolly.winrt.Windows.Networking.NetworkOperators.NetworkDeviceStatus.deviceHardwareFailure & Double = js.native
    
    /* 6 */ val deviceLocked: typingsJapgolly.winrt.Windows.Networking.NetworkOperators.NetworkDeviceStatus.deviceLocked & Double = js.native
    
    /* 0 */ val deviceNotReady: typingsJapgolly.winrt.Windows.Networking.NetworkOperators.NetworkDeviceStatus.deviceNotReady & Double = js.native
    
    /* 1 */ val deviceReady: typingsJapgolly.winrt.Windows.Networking.NetworkOperators.NetworkDeviceStatus.deviceReady & Double = js.native
    
    /* 2 */ val simNotInserted: typingsJapgolly.winrt.Windows.Networking.NetworkOperators.NetworkDeviceStatus.simNotInserted & Double = js.native
  }
  
  @JSGlobal("Windows.Networking.NetworkOperators.NetworkOperatorEventMessageType")
  @js.native
  object NetworkOperatorEventMessageType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.winrt.Windows.Networking.NetworkOperators.NetworkOperatorEventMessageType & Double
      ] = js.native
    
    /* 1 */ val cdma: typingsJapgolly.winrt.Windows.Networking.NetworkOperators.NetworkOperatorEventMessageType.cdma & Double = js.native
    
    /* 5 */ val dataPlanDeleted: typingsJapgolly.winrt.Windows.Networking.NetworkOperators.NetworkOperatorEventMessageType.dataPlanDeleted & Double = js.native
    
    /* 4 */ val dataPlanReset: typingsJapgolly.winrt.Windows.Networking.NetworkOperators.NetworkOperatorEventMessageType.dataPlanReset & Double = js.native
    
    /* 3 */ val dataPlanThresholdReached: typingsJapgolly.winrt.Windows.Networking.NetworkOperators.NetworkOperatorEventMessageType.dataPlanThresholdReached & Double = js.native
    
    /* 0 */ val gsm: typingsJapgolly.winrt.Windows.Networking.NetworkOperators.NetworkOperatorEventMessageType.gsm & Double = js.native
    
    /* 6 */ val profileConnected: typingsJapgolly.winrt.Windows.Networking.NetworkOperators.NetworkOperatorEventMessageType.profileConnected & Double = js.native
    
    /* 7 */ val profileDisconnected: typingsJapgolly.winrt.Windows.Networking.NetworkOperators.NetworkOperatorEventMessageType.profileDisconnected & Double = js.native
    
    /* 9 */ val registeredHome: typingsJapgolly.winrt.Windows.Networking.NetworkOperators.NetworkOperatorEventMessageType.registeredHome & Double = js.native
    
    /* 8 */ val registeredRoaming: typingsJapgolly.winrt.Windows.Networking.NetworkOperators.NetworkOperatorEventMessageType.registeredRoaming & Double = js.native
    
    /* 2 */ val ussd: typingsJapgolly.winrt.Windows.Networking.NetworkOperators.NetworkOperatorEventMessageType.ussd & Double = js.native
  }
  
  @JSGlobal("Windows.Networking.NetworkOperators.NetworkOperatorNotificationEventDetails")
  @js.native
  open class NetworkOperatorNotificationEventDetails ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Networking.NetworkOperators.NetworkOperatorNotificationEventDetails {
    
    /* CompleteClass */
    var encodingType: Double = js.native
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var networkAccountId: String = js.native
    
    /* CompleteClass */
    var notificationType: NetworkOperatorEventMessageType = js.native
    
    /* CompleteClass */
    var ruleId: String = js.native
    
    /* CompleteClass */
    var smsMessage: ISmsMessage = js.native
  }
  
  @JSGlobal("Windows.Networking.NetworkOperators.NetworkRegistrationState")
  @js.native
  object NetworkRegistrationState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.winrt.Windows.Networking.NetworkOperators.NetworkRegistrationState & Double
      ] = js.native
    
    /* 6 */ val denied: typingsJapgolly.winrt.Windows.Networking.NetworkOperators.NetworkRegistrationState.denied & Double = js.native
    
    /* 1 */ val deregistered: typingsJapgolly.winrt.Windows.Networking.NetworkOperators.NetworkRegistrationState.deregistered & Double = js.native
    
    /* 3 */ val home: typingsJapgolly.winrt.Windows.Networking.NetworkOperators.NetworkRegistrationState.home & Double = js.native
    
    /* 0 */ val none: typingsJapgolly.winrt.Windows.Networking.NetworkOperators.NetworkRegistrationState.none & Double = js.native
    
    /* 5 */ val partner: typingsJapgolly.winrt.Windows.Networking.NetworkOperators.NetworkRegistrationState.partner & Double = js.native
    
    /* 4 */ val roaming: typingsJapgolly.winrt.Windows.Networking.NetworkOperators.NetworkRegistrationState.roaming & Double = js.native
    
    /* 2 */ val searching: typingsJapgolly.winrt.Windows.Networking.NetworkOperators.NetworkRegistrationState.searching & Double = js.native
  }
  
  @JSGlobal("Windows.Networking.NetworkOperators.ProfileMediaType")
  @js.native
  object ProfileMediaType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.winrt.Windows.Networking.NetworkOperators.ProfileMediaType & Double
      ] = js.native
    
    /* 0 */ val wlan: typingsJapgolly.winrt.Windows.Networking.NetworkOperators.ProfileMediaType.wlan & Double = js.native
    
    /* 1 */ val wwan: typingsJapgolly.winrt.Windows.Networking.NetworkOperators.ProfileMediaType.wwan & Double = js.native
  }
  
  @JSGlobal("Windows.Networking.NetworkOperators.ProvisionFromXmlDocumentResults")
  @js.native
  open class ProvisionFromXmlDocumentResults ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Networking.NetworkOperators.ProvisionFromXmlDocumentResults {
    
    /* CompleteClass */
    var allElementsProvisioned: Boolean = js.native
    
    /* CompleteClass */
    var provisionResultsXml: String = js.native
  }
  
  @JSGlobal("Windows.Networking.NetworkOperators.ProvisionedProfile")
  @js.native
  open class ProvisionedProfile ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Networking.NetworkOperators.ProvisionedProfile {
    
    /* CompleteClass */
    override def updateCost(value: NetworkCostType): Unit = js.native
    
    /* CompleteClass */
    override def updateUsage(value: ProfileUsage): Unit = js.native
  }
  
  @JSGlobal("Windows.Networking.NetworkOperators.ProvisioningAgent")
  @js.native
  open class ProvisioningAgent ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Networking.NetworkOperators.ProvisioningAgent {
    
    /* CompleteClass */
    override def getProvisionedProfile(mediaType: ProfileMediaType, profileName: String): typingsJapgolly.winrt.Windows.Networking.NetworkOperators.ProvisionedProfile = js.native
    
    /* CompleteClass */
    override def provisionFromXmlDocumentAsync(provisioningXmlDocument: String): IAsyncOperation[
        typingsJapgolly.winrt.Windows.Networking.NetworkOperators.ProvisionFromXmlDocumentResults
      ] = js.native
  }
  /* static members */
  object ProvisioningAgent {
    
    @JSGlobal("Windows.Networking.NetworkOperators.ProvisioningAgent")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createFromNetworkAccountId(networkAccountId: String): typingsJapgolly.winrt.Windows.Networking.NetworkOperators.ProvisioningAgent = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromNetworkAccountId")(networkAccountId.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.winrt.Windows.Networking.NetworkOperators.ProvisioningAgent]
  }
  
  @JSGlobal("Windows.Networking.NetworkOperators.UssdMessage")
  @js.native
  open class UssdMessage protected ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Networking.NetworkOperators.UssdMessage {
    def this(messageText: String) = this()
    
    /* CompleteClass */
    var dataCodingScheme: Double = js.native
    
    /* CompleteClass */
    override def getPayload(): js.typedarray.Uint8Array = js.native
    
    /* CompleteClass */
    var payloadAsText: String = js.native
    
    /* CompleteClass */
    override def setPayload(value: js.typedarray.Uint8Array): Unit = js.native
  }
  
  @JSGlobal("Windows.Networking.NetworkOperators.UssdReply")
  @js.native
  open class UssdReply ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Networking.NetworkOperators.UssdReply {
    
    /* CompleteClass */
    var message: typingsJapgolly.winrt.Windows.Networking.NetworkOperators.UssdMessage = js.native
    
    /* CompleteClass */
    var resultCode: UssdResultCode = js.native
  }
  
  @JSGlobal("Windows.Networking.NetworkOperators.UssdResultCode")
  @js.native
  object UssdResultCode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.winrt.Windows.Networking.NetworkOperators.UssdResultCode & Double
      ] = js.native
    
    /* 1 */ val actionRequired: typingsJapgolly.winrt.Windows.Networking.NetworkOperators.UssdResultCode.actionRequired & Double = js.native
    
    /* 5 */ val networkTimeout: typingsJapgolly.winrt.Windows.Networking.NetworkOperators.UssdResultCode.networkTimeout & Double = js.native
    
    /* 0 */ val noActionRequired: typingsJapgolly.winrt.Windows.Networking.NetworkOperators.UssdResultCode.noActionRequired & Double = js.native
    
    /* 4 */ val operationNotSupported: typingsJapgolly.winrt.Windows.Networking.NetworkOperators.UssdResultCode.operationNotSupported & Double = js.native
    
    /* 3 */ val otherLocalClient: typingsJapgolly.winrt.Windows.Networking.NetworkOperators.UssdResultCode.otherLocalClient & Double = js.native
    
    /* 2 */ val terminated: typingsJapgolly.winrt.Windows.Networking.NetworkOperators.UssdResultCode.terminated & Double = js.native
  }
  
  @JSGlobal("Windows.Networking.NetworkOperators.UssdSession")
  @js.native
  open class UssdSession ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Networking.NetworkOperators.UssdSession {
    
    /* CompleteClass */
    override def close(): Unit = js.native
    
    /* CompleteClass */
    override def sendMessageAndGetReplyAsync(message: typingsJapgolly.winrt.Windows.Networking.NetworkOperators.UssdMessage): IAsyncOperation[typingsJapgolly.winrt.Windows.Networking.NetworkOperators.UssdReply] = js.native
  }
  /* static members */
  object UssdSession {
    
    @JSGlobal("Windows.Networking.NetworkOperators.UssdSession")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createFromNetworkAccountId(networkAccountId: String): typingsJapgolly.winrt.Windows.Networking.NetworkOperators.UssdSession = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromNetworkAccountId")(networkAccountId.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.winrt.Windows.Networking.NetworkOperators.UssdSession]
    
    inline def createFromNetworkInterfaceId(networkInterfaceId: String): typingsJapgolly.winrt.Windows.Networking.NetworkOperators.UssdSession = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromNetworkInterfaceId")(networkInterfaceId.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.winrt.Windows.Networking.NetworkOperators.UssdSession]
  }
}
