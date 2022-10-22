package typingsJapgolly.activexFaxcomexlib.FAXCOMEXLib

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** FaxAccountOutgoingQueue Class */
trait FaxAccountOutgoingQueue extends StObject {
  
  /* private */ @JSName("FAXCOMEXLib.FaxAccountOutgoingQueue_typekey")
  var FAXCOMEXLibDotFaxAccountOutgoingQueue_typekey: FaxAccountOutgoingQueue
  
  /** Get outgoing job by ID */
  def GetJob(bstrJobId: String): IFaxOutgoingJob
  
  /** Collection of outgoing jobs */
  def GetJobs(): FaxOutgoingJobs
}
object FaxAccountOutgoingQueue {
  
  inline def apply(
    FAXCOMEXLibDotFaxAccountOutgoingQueue_typekey: FaxAccountOutgoingQueue,
    GetJob: String => IFaxOutgoingJob,
    GetJobs: CallbackTo[FaxOutgoingJobs]
  ): FaxAccountOutgoingQueue = {
    val __obj = js.Dynamic.literal(GetJob = js.Any.fromFunction1(GetJob), GetJobs = GetJobs.toJsFn)
    __obj.updateDynamic("FAXCOMEXLib.FaxAccountOutgoingQueue_typekey")(FAXCOMEXLibDotFaxAccountOutgoingQueue_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaxAccountOutgoingQueue]
  }
  
  extension [Self <: FaxAccountOutgoingQueue](x: Self) {
    
    inline def setFAXCOMEXLibDotFaxAccountOutgoingQueue_typekey(value: FaxAccountOutgoingQueue): Self = StObject.set(x, "FAXCOMEXLib.FaxAccountOutgoingQueue_typekey", value.asInstanceOf[js.Any])
    
    inline def setGetJob(value: String => IFaxOutgoingJob): Self = StObject.set(x, "GetJob", js.Any.fromFunction1(value))
    
    inline def setGetJobs(value: CallbackTo[FaxOutgoingJobs]): Self = StObject.set(x, "GetJobs", value.toJsFn)
  }
}
