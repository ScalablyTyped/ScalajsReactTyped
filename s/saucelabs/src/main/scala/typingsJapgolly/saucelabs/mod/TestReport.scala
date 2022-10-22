package typingsJapgolly.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.saucelabs.saucelabsStrings.ABORTED
import typingsJapgolly.saucelabs.saucelabsStrings.CANCELED
import typingsJapgolly.saucelabs.saucelabsStrings.EDGE
import typingsJapgolly.saucelabs.saucelabsStrings.ERROR
import typingsJapgolly.saucelabs.saucelabsStrings.FAILURE
import typingsJapgolly.saucelabs.saucelabsStrings.FULL
import typingsJapgolly.saucelabs.saucelabsStrings.GPRS
import typingsJapgolly.saucelabs.saucelabsStrings.GSM
import typingsJapgolly.saucelabs.saucelabsStrings.HDCSD
import typingsJapgolly.saucelabs.saucelabsStrings.HSDPA
import typingsJapgolly.saucelabs.saucelabsStrings.OK
import typingsJapgolly.saucelabs.saucelabsStrings.SKIPPED
import typingsJapgolly.saucelabs.saucelabsStrings.SUCCESS
import typingsJapgolly.saucelabs.saucelabsStrings.UMTS
import typingsJapgolly.saucelabs.saucelabsStrings.UNDEFINED
import typingsJapgolly.saucelabs.saucelabsStrings.UNKNOWN
import typingsJapgolly.saucelabs.saucelabsStrings.WARNING
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestReport
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var appVersionId: js.UndefOr[Double] = js.undefined
  
  var appVersionName: js.UndefOr[String] = js.undefined
  
  var automationBackend: js.UndefOr[String] = js.undefined
  
  var batchId: js.UndefOr[Id] = js.undefined
  
  var batchName: js.UndefOr[String] = js.undefined
  
  var dataCenterId: js.UndefOr[Id] = js.undefined
  
  var deviceDescriptor: js.UndefOr[DeviceDescriptor] = js.undefined
  
  var duration: js.UndefOr[Double] = js.undefined
  
  var id: js.UndefOr[Id] = js.undefined
  
  var networkSpeed: js.UndefOr[FULL | GSM | HDCSD | GPRS | EDGE | UMTS | HSDPA] = js.undefined
  
  var phoneNumber: js.UndefOr[PhoneNumber] = js.undefined
  
  var projectPath: js.UndefOr[Path] = js.undefined
  
  var remoteAppFileUrl: js.UndefOr[String] = js.undefined
  
  var running: js.UndefOr[Boolean] = js.undefined
  
  var sharedLinkCode: js.UndefOr[String] = js.undefined
  
  var startTime: js.UndefOr[Double] = js.undefined
  
  var status: js.UndefOr[UNKNOWN | SUCCESS | WARNING | FAILURE | SKIPPED | ABORTED | CANCELED] = js.undefined
  
  var systemError: js.UndefOr[String] = js.undefined
  
  var systemErrorType: js.UndefOr[String] = js.undefined
  
  var testId: js.UndefOr[Id] = js.undefined
  
  var testName: js.UndefOr[String] = js.undefined
  
  var testResultStatus: js.UndefOr[UNDEFINED | WARNING | OK | ERROR | FAILURE | SKIPPED | ABORTED | CANCELED] = js.undefined
  
  var tunnelId: js.UndefOr[String] = js.undefined
  
  var tunnelIdentifier: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
  
  var uuid: js.UndefOr[Uuid] = js.undefined
  
  var videoId: js.UndefOr[Id] = js.undefined
  
  var withSystemError: js.UndefOr[Boolean] = js.undefined
}
object TestReport {
  
  inline def apply(): TestReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestReport]
  }
  
  extension [Self <: TestReport](x: Self) {
    
    inline def setAppVersionId(value: Double): Self = StObject.set(x, "appVersionId", value.asInstanceOf[js.Any])
    
    inline def setAppVersionIdUndefined: Self = StObject.set(x, "appVersionId", js.undefined)
    
    inline def setAppVersionName(value: String): Self = StObject.set(x, "appVersionName", value.asInstanceOf[js.Any])
    
    inline def setAppVersionNameUndefined: Self = StObject.set(x, "appVersionName", js.undefined)
    
    inline def setAutomationBackend(value: String): Self = StObject.set(x, "automationBackend", value.asInstanceOf[js.Any])
    
    inline def setAutomationBackendUndefined: Self = StObject.set(x, "automationBackend", js.undefined)
    
    inline def setBatchId(value: Id): Self = StObject.set(x, "batchId", value.asInstanceOf[js.Any])
    
    inline def setBatchIdUndefined: Self = StObject.set(x, "batchId", js.undefined)
    
    inline def setBatchName(value: String): Self = StObject.set(x, "batchName", value.asInstanceOf[js.Any])
    
    inline def setBatchNameUndefined: Self = StObject.set(x, "batchName", js.undefined)
    
    inline def setDataCenterId(value: Id): Self = StObject.set(x, "dataCenterId", value.asInstanceOf[js.Any])
    
    inline def setDataCenterIdUndefined: Self = StObject.set(x, "dataCenterId", js.undefined)
    
    inline def setDeviceDescriptor(value: DeviceDescriptor): Self = StObject.set(x, "deviceDescriptor", value.asInstanceOf[js.Any])
    
    inline def setDeviceDescriptorUndefined: Self = StObject.set(x, "deviceDescriptor", js.undefined)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setId(value: Id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setNetworkSpeed(value: FULL | GSM | HDCSD | GPRS | EDGE | UMTS | HSDPA): Self = StObject.set(x, "networkSpeed", value.asInstanceOf[js.Any])
    
    inline def setNetworkSpeedUndefined: Self = StObject.set(x, "networkSpeed", js.undefined)
    
    inline def setPhoneNumber(value: PhoneNumber): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
    
    inline def setProjectPath(value: Path): Self = StObject.set(x, "projectPath", value.asInstanceOf[js.Any])
    
    inline def setProjectPathUndefined: Self = StObject.set(x, "projectPath", js.undefined)
    
    inline def setRemoteAppFileUrl(value: String): Self = StObject.set(x, "remoteAppFileUrl", value.asInstanceOf[js.Any])
    
    inline def setRemoteAppFileUrlUndefined: Self = StObject.set(x, "remoteAppFileUrl", js.undefined)
    
    inline def setRunning(value: Boolean): Self = StObject.set(x, "running", value.asInstanceOf[js.Any])
    
    inline def setRunningUndefined: Self = StObject.set(x, "running", js.undefined)
    
    inline def setSharedLinkCode(value: String): Self = StObject.set(x, "sharedLinkCode", value.asInstanceOf[js.Any])
    
    inline def setSharedLinkCodeUndefined: Self = StObject.set(x, "sharedLinkCode", js.undefined)
    
    inline def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setStatus(value: UNKNOWN | SUCCESS | WARNING | FAILURE | SKIPPED | ABORTED | CANCELED): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setSystemError(value: String): Self = StObject.set(x, "systemError", value.asInstanceOf[js.Any])
    
    inline def setSystemErrorType(value: String): Self = StObject.set(x, "systemErrorType", value.asInstanceOf[js.Any])
    
    inline def setSystemErrorTypeUndefined: Self = StObject.set(x, "systemErrorType", js.undefined)
    
    inline def setSystemErrorUndefined: Self = StObject.set(x, "systemError", js.undefined)
    
    inline def setTestId(value: Id): Self = StObject.set(x, "testId", value.asInstanceOf[js.Any])
    
    inline def setTestIdUndefined: Self = StObject.set(x, "testId", js.undefined)
    
    inline def setTestName(value: String): Self = StObject.set(x, "testName", value.asInstanceOf[js.Any])
    
    inline def setTestNameUndefined: Self = StObject.set(x, "testName", js.undefined)
    
    inline def setTestResultStatus(value: UNDEFINED | WARNING | OK | ERROR | FAILURE | SKIPPED | ABORTED | CANCELED): Self = StObject.set(x, "testResultStatus", value.asInstanceOf[js.Any])
    
    inline def setTestResultStatusUndefined: Self = StObject.set(x, "testResultStatus", js.undefined)
    
    inline def setTunnelId(value: String): Self = StObject.set(x, "tunnelId", value.asInstanceOf[js.Any])
    
    inline def setTunnelIdUndefined: Self = StObject.set(x, "tunnelId", js.undefined)
    
    inline def setTunnelIdentifier(value: String): Self = StObject.set(x, "tunnelIdentifier", value.asInstanceOf[js.Any])
    
    inline def setTunnelIdentifierUndefined: Self = StObject.set(x, "tunnelIdentifier", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUuid(value: Uuid): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    
    inline def setUuidUndefined: Self = StObject.set(x, "uuid", js.undefined)
    
    inline def setVideoId(value: Id): Self = StObject.set(x, "videoId", value.asInstanceOf[js.Any])
    
    inline def setVideoIdUndefined: Self = StObject.set(x, "videoId", js.undefined)
    
    inline def setWithSystemError(value: Boolean): Self = StObject.set(x, "withSystemError", value.asInstanceOf[js.Any])
    
    inline def setWithSystemErrorUndefined: Self = StObject.set(x, "withSystemError", js.undefined)
  }
}
