package typingsJapgolly.activexFaxcomexlib.FAXCOMEXLib

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** FaxIncomingQueue Class */
trait FaxIncomingQueue extends StObject {
  
  /** Is queue blocked */
  var Blocked: Boolean
  
  /* private */ @JSName("FAXCOMEXLib.FaxIncomingQueue_typekey")
  var FAXCOMEXLibDotFaxIncomingQueue_typekey: FaxIncomingQueue
  
  /** Get incoming job by ID */
  def GetJob(bstrJobId: String): FaxIncomingJob
  
  /** Collection of incoming jobs */
  def GetJobs(): FaxIncomingJobs
  
  /** Refresh the object */
  def Refresh(): Unit
  
  /** Save the object */
  def Save(): Unit
}
object FaxIncomingQueue {
  
  inline def apply(
    Blocked: Boolean,
    FAXCOMEXLibDotFaxIncomingQueue_typekey: FaxIncomingQueue,
    GetJob: String => FaxIncomingJob,
    GetJobs: CallbackTo[FaxIncomingJobs],
    Refresh: Callback,
    Save: Callback
  ): FaxIncomingQueue = {
    val __obj = js.Dynamic.literal(Blocked = Blocked.asInstanceOf[js.Any], GetJob = js.Any.fromFunction1(GetJob), GetJobs = GetJobs.toJsFn, Refresh = Refresh.toJsFn, Save = Save.toJsFn)
    __obj.updateDynamic("FAXCOMEXLib.FaxIncomingQueue_typekey")(FAXCOMEXLibDotFaxIncomingQueue_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaxIncomingQueue]
  }
  
  extension [Self <: FaxIncomingQueue](x: Self) {
    
    inline def setBlocked(value: Boolean): Self = StObject.set(x, "Blocked", value.asInstanceOf[js.Any])
    
    inline def setFAXCOMEXLibDotFaxIncomingQueue_typekey(value: FaxIncomingQueue): Self = StObject.set(x, "FAXCOMEXLib.FaxIncomingQueue_typekey", value.asInstanceOf[js.Any])
    
    inline def setGetJob(value: String => FaxIncomingJob): Self = StObject.set(x, "GetJob", js.Any.fromFunction1(value))
    
    inline def setGetJobs(value: CallbackTo[FaxIncomingJobs]): Self = StObject.set(x, "GetJobs", value.toJsFn)
    
    inline def setRefresh(value: Callback): Self = StObject.set(x, "Refresh", value.toJsFn)
    
    inline def setSave(value: Callback): Self = StObject.set(x, "Save", value.toJsFn)
  }
}
