package typingsJapgolly.activexFaxcomexlib.FAXCOMEXLib

import japgolly.scalajs.react.Callback
import typingsJapgolly.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** FaxIncomingJob Class */
trait FaxIncomingJob extends StObject {
  
  /** Available operations, a bit-wise combination of FAX_JOB_OPERATIONS values */
  val AvailableOperations: FAX_JOB_OPERATIONS_ENUM
  
  /** Called Station ID */
  val CSID: String
  
  /** Caller ID */
  val CallerId: String
  
  /** Cancel the incoming job */
  def Cancel(): Unit
  
  /** Copy TIFF image to the local file */
  def CopyTiff(bstrTiffPath: String): Unit
  
  /** Page currently in transmision */
  val CurrentPage: Double
  
  /** Device ID that transmits the job */
  val DeviceId: Double
  
  /** Extended status description */
  val ExtendedStatus: String
  
  /** Code of the job's extended status */
  val ExtendedStatusCode: FAX_JOB_EXTENDED_STATUS_ENUM
  
  /* private */ @JSName("FAXCOMEXLib.FaxIncomingJob_typekey")
  var FAXCOMEXLibDotFaxIncomingJob_typekey: FaxIncomingJob
  
  /** Unique message ID */
  val Id: String
  
  /** Job type */
  val JobType: FAX_JOB_TYPE_ENUM
  
  /** Refresh the object */
  def Refresh(): Unit
  
  /** Number of failed transmission retries */
  val Retries: Double
  
  /** Routing information */
  val RoutingInformation: String
  
  /** Size in bytes of the message's TIFF file */
  val Size: Double
  
  /** Current queue status of the job, a bit-wise combination of FAX_JOB_STATUS values */
  val Status: FAX_JOB_STATUS_ENUM
  
  /** Transmitting Station ID */
  val TSID: String
  
  /** Transmission end time */
  val TransmissionEnd: VarDate
  
  /** Transmission start time */
  val TransmissionStart: VarDate
}
object FaxIncomingJob {
  
  inline def apply(
    AvailableOperations: FAX_JOB_OPERATIONS_ENUM,
    CSID: String,
    CallerId: String,
    Cancel: Callback,
    CopyTiff: String => Callback,
    CurrentPage: Double,
    DeviceId: Double,
    ExtendedStatus: String,
    ExtendedStatusCode: FAX_JOB_EXTENDED_STATUS_ENUM,
    FAXCOMEXLibDotFaxIncomingJob_typekey: FaxIncomingJob,
    Id: String,
    JobType: FAX_JOB_TYPE_ENUM,
    Refresh: Callback,
    Retries: Double,
    RoutingInformation: String,
    Size: Double,
    Status: FAX_JOB_STATUS_ENUM,
    TSID: String,
    TransmissionEnd: VarDate,
    TransmissionStart: VarDate
  ): FaxIncomingJob = {
    val __obj = js.Dynamic.literal(AvailableOperations = AvailableOperations.asInstanceOf[js.Any], CSID = CSID.asInstanceOf[js.Any], CallerId = CallerId.asInstanceOf[js.Any], Cancel = Cancel.toJsFn, CopyTiff = js.Any.fromFunction1((t0: String) => CopyTiff(t0).runNow()), CurrentPage = CurrentPage.asInstanceOf[js.Any], DeviceId = DeviceId.asInstanceOf[js.Any], ExtendedStatus = ExtendedStatus.asInstanceOf[js.Any], ExtendedStatusCode = ExtendedStatusCode.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], JobType = JobType.asInstanceOf[js.Any], Refresh = Refresh.toJsFn, Retries = Retries.asInstanceOf[js.Any], RoutingInformation = RoutingInformation.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], TSID = TSID.asInstanceOf[js.Any], TransmissionEnd = TransmissionEnd.asInstanceOf[js.Any], TransmissionStart = TransmissionStart.asInstanceOf[js.Any])
    __obj.updateDynamic("FAXCOMEXLib.FaxIncomingJob_typekey")(FAXCOMEXLibDotFaxIncomingJob_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaxIncomingJob]
  }
  
  extension [Self <: FaxIncomingJob](x: Self) {
    
    inline def setAvailableOperations(value: FAX_JOB_OPERATIONS_ENUM): Self = StObject.set(x, "AvailableOperations", value.asInstanceOf[js.Any])
    
    inline def setCSID(value: String): Self = StObject.set(x, "CSID", value.asInstanceOf[js.Any])
    
    inline def setCallerId(value: String): Self = StObject.set(x, "CallerId", value.asInstanceOf[js.Any])
    
    inline def setCancel(value: Callback): Self = StObject.set(x, "Cancel", value.toJsFn)
    
    inline def setCopyTiff(value: String => Callback): Self = StObject.set(x, "CopyTiff", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setCurrentPage(value: Double): Self = StObject.set(x, "CurrentPage", value.asInstanceOf[js.Any])
    
    inline def setDeviceId(value: Double): Self = StObject.set(x, "DeviceId", value.asInstanceOf[js.Any])
    
    inline def setExtendedStatus(value: String): Self = StObject.set(x, "ExtendedStatus", value.asInstanceOf[js.Any])
    
    inline def setExtendedStatusCode(value: FAX_JOB_EXTENDED_STATUS_ENUM): Self = StObject.set(x, "ExtendedStatusCode", value.asInstanceOf[js.Any])
    
    inline def setFAXCOMEXLibDotFaxIncomingJob_typekey(value: FaxIncomingJob): Self = StObject.set(x, "FAXCOMEXLib.FaxIncomingJob_typekey", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setJobType(value: FAX_JOB_TYPE_ENUM): Self = StObject.set(x, "JobType", value.asInstanceOf[js.Any])
    
    inline def setRefresh(value: Callback): Self = StObject.set(x, "Refresh", value.toJsFn)
    
    inline def setRetries(value: Double): Self = StObject.set(x, "Retries", value.asInstanceOf[js.Any])
    
    inline def setRoutingInformation(value: String): Self = StObject.set(x, "RoutingInformation", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "Size", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: FAX_JOB_STATUS_ENUM): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setTSID(value: String): Self = StObject.set(x, "TSID", value.asInstanceOf[js.Any])
    
    inline def setTransmissionEnd(value: VarDate): Self = StObject.set(x, "TransmissionEnd", value.asInstanceOf[js.Any])
    
    inline def setTransmissionStart(value: VarDate): Self = StObject.set(x, "TransmissionStart", value.asInstanceOf[js.Any])
  }
}
