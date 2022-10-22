package typingsJapgolly.activexFaxcomexlib.FAXCOMEXLib

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** FaxOutgoingQueue Class */
trait FaxOutgoingQueue extends StObject {
  
  /** How long the failed fax message is kept on the server */
  var AgeLimit: Double
  
  /** Are personal cover pages allowed */
  var AllowPersonalCoverPages: Boolean
  
  /** Is the queue blocked */
  var Blocked: Boolean
  
  /** Does the server generate a brand */
  var Branding: Boolean
  
  /** End of the discount rate period */
  var DiscountRateEnd: VarDate
  
  /** Start of the discount rate period */
  var DiscountRateStart: VarDate
  
  /* private */ @JSName("FAXCOMEXLib.FaxOutgoingQueue_typekey")
  var FAXCOMEXLibDotFaxOutgoingQueue_typekey: FaxOutgoingQueue
  
  /** Outgoing job by ID */
  def GetJob(bstrJobId: String): IFaxOutgoingJob
  
  /** Collection of outgoing jobs */
  def GetJobs(): FaxOutgoingJobs
  
  /** Is the queue paused */
  var Paused: Boolean
  
  /** Refresh the object */
  def Refresh(): Unit
  
  /** Number of retries */
  var Retries: Double
  
  /** Retry delay */
  var RetryDelay: Double
  
  /** Save the object */
  def Save(): Unit
  
  /** Is device Transmitting Station ID used */
  var UseDeviceTSID: Boolean
}
object FaxOutgoingQueue {
  
  inline def apply(
    AgeLimit: Double,
    AllowPersonalCoverPages: Boolean,
    Blocked: Boolean,
    Branding: Boolean,
    DiscountRateEnd: VarDate,
    DiscountRateStart: VarDate,
    FAXCOMEXLibDotFaxOutgoingQueue_typekey: FaxOutgoingQueue,
    GetJob: String => IFaxOutgoingJob,
    GetJobs: CallbackTo[FaxOutgoingJobs],
    Paused: Boolean,
    Refresh: Callback,
    Retries: Double,
    RetryDelay: Double,
    Save: Callback,
    UseDeviceTSID: Boolean
  ): FaxOutgoingQueue = {
    val __obj = js.Dynamic.literal(AgeLimit = AgeLimit.asInstanceOf[js.Any], AllowPersonalCoverPages = AllowPersonalCoverPages.asInstanceOf[js.Any], Blocked = Blocked.asInstanceOf[js.Any], Branding = Branding.asInstanceOf[js.Any], DiscountRateEnd = DiscountRateEnd.asInstanceOf[js.Any], DiscountRateStart = DiscountRateStart.asInstanceOf[js.Any], GetJob = js.Any.fromFunction1(GetJob), GetJobs = GetJobs.toJsFn, Paused = Paused.asInstanceOf[js.Any], Refresh = Refresh.toJsFn, Retries = Retries.asInstanceOf[js.Any], RetryDelay = RetryDelay.asInstanceOf[js.Any], Save = Save.toJsFn, UseDeviceTSID = UseDeviceTSID.asInstanceOf[js.Any])
    __obj.updateDynamic("FAXCOMEXLib.FaxOutgoingQueue_typekey")(FAXCOMEXLibDotFaxOutgoingQueue_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaxOutgoingQueue]
  }
  
  extension [Self <: FaxOutgoingQueue](x: Self) {
    
    inline def setAgeLimit(value: Double): Self = StObject.set(x, "AgeLimit", value.asInstanceOf[js.Any])
    
    inline def setAllowPersonalCoverPages(value: Boolean): Self = StObject.set(x, "AllowPersonalCoverPages", value.asInstanceOf[js.Any])
    
    inline def setBlocked(value: Boolean): Self = StObject.set(x, "Blocked", value.asInstanceOf[js.Any])
    
    inline def setBranding(value: Boolean): Self = StObject.set(x, "Branding", value.asInstanceOf[js.Any])
    
    inline def setDiscountRateEnd(value: VarDate): Self = StObject.set(x, "DiscountRateEnd", value.asInstanceOf[js.Any])
    
    inline def setDiscountRateStart(value: VarDate): Self = StObject.set(x, "DiscountRateStart", value.asInstanceOf[js.Any])
    
    inline def setFAXCOMEXLibDotFaxOutgoingQueue_typekey(value: FaxOutgoingQueue): Self = StObject.set(x, "FAXCOMEXLib.FaxOutgoingQueue_typekey", value.asInstanceOf[js.Any])
    
    inline def setGetJob(value: String => IFaxOutgoingJob): Self = StObject.set(x, "GetJob", js.Any.fromFunction1(value))
    
    inline def setGetJobs(value: CallbackTo[FaxOutgoingJobs]): Self = StObject.set(x, "GetJobs", value.toJsFn)
    
    inline def setPaused(value: Boolean): Self = StObject.set(x, "Paused", value.asInstanceOf[js.Any])
    
    inline def setRefresh(value: Callback): Self = StObject.set(x, "Refresh", value.toJsFn)
    
    inline def setRetries(value: Double): Self = StObject.set(x, "Retries", value.asInstanceOf[js.Any])
    
    inline def setRetryDelay(value: Double): Self = StObject.set(x, "RetryDelay", value.asInstanceOf[js.Any])
    
    inline def setSave(value: Callback): Self = StObject.set(x, "Save", value.toJsFn)
    
    inline def setUseDeviceTSID(value: Boolean): Self = StObject.set(x, "UseDeviceTSID", value.asInstanceOf[js.Any])
  }
}
