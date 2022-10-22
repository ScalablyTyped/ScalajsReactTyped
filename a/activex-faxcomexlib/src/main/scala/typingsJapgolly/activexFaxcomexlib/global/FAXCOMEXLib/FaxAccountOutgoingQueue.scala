package typingsJapgolly.activexFaxcomexlib.global.FAXCOMEXLib

import typingsJapgolly.activexFaxcomexlib.FAXCOMEXLib.FaxOutgoingJobs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** FaxAccountOutgoingQueue Class */
@JSGlobal("FAXCOMEXLib.FaxAccountOutgoingQueue")
@js.native
/* private */ open class FaxAccountOutgoingQueue ()
  extends StObject
     with typingsJapgolly.activexFaxcomexlib.FAXCOMEXLib.FaxAccountOutgoingQueue {
  
  /* private */ /* CompleteClass */
  @JSName("FAXCOMEXLib.FaxAccountOutgoingQueue_typekey")
  var FAXCOMEXLibDotFaxAccountOutgoingQueue_typekey: typingsJapgolly.activexFaxcomexlib.FAXCOMEXLib.FaxAccountOutgoingQueue = js.native
  
  /** Get outgoing job by ID */
  /* CompleteClass */
  override def GetJob(bstrJobId: String): typingsJapgolly.activexFaxcomexlib.FAXCOMEXLib.IFaxOutgoingJob = js.native
  
  /** Collection of outgoing jobs */
  /* CompleteClass */
  override def GetJobs(): FaxOutgoingJobs = js.native
}
