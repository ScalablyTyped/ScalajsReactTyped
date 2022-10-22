package typingsJapgolly.activexFaxcomexlib.global.FAXCOMEXLib

import typingsJapgolly.activexFaxcomexlib.FAXCOMEXLib.FaxIncomingJobs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** FaxAccountIncomingQueue Class */
@JSGlobal("FAXCOMEXLib.FaxAccountIncomingQueue")
@js.native
/* private */ open class FaxAccountIncomingQueue ()
  extends StObject
     with typingsJapgolly.activexFaxcomexlib.FAXCOMEXLib.FaxAccountIncomingQueue {
  
  /* private */ /* CompleteClass */
  @JSName("FAXCOMEXLib.FaxAccountIncomingQueue_typekey")
  var FAXCOMEXLibDotFaxAccountIncomingQueue_typekey: typingsJapgolly.activexFaxcomexlib.FAXCOMEXLib.FaxAccountIncomingQueue = js.native
  
  /** Get incoming job by ID */
  /* CompleteClass */
  override def GetJob(bstrJobId: String): typingsJapgolly.activexFaxcomexlib.FAXCOMEXLib.FaxIncomingJob = js.native
  
  /** Collection of incoming jobs */
  /* CompleteClass */
  override def GetJobs(): FaxIncomingJobs = js.native
}
