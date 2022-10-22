package typingsJapgolly.activexFaxcomexlib.global.FAXCOMEXLib

import typingsJapgolly.activexFaxcomexlib.FAXCOMEXLib.FaxIncomingJobs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** FaxIncomingQueue Class */
@JSGlobal("FAXCOMEXLib.FaxIncomingQueue")
@js.native
/* private */ open class FaxIncomingQueue ()
  extends StObject
     with typingsJapgolly.activexFaxcomexlib.FAXCOMEXLib.FaxIncomingQueue {
  
  /** Is queue blocked */
  /* CompleteClass */
  var Blocked: Boolean = js.native
  
  /* private */ /* CompleteClass */
  @JSName("FAXCOMEXLib.FaxIncomingQueue_typekey")
  var FAXCOMEXLibDotFaxIncomingQueue_typekey: typingsJapgolly.activexFaxcomexlib.FAXCOMEXLib.FaxIncomingQueue = js.native
  
  /** Get incoming job by ID */
  /* CompleteClass */
  override def GetJob(bstrJobId: String): typingsJapgolly.activexFaxcomexlib.FAXCOMEXLib.FaxIncomingJob = js.native
  
  /** Collection of incoming jobs */
  /* CompleteClass */
  override def GetJobs(): FaxIncomingJobs = js.native
  
  /** Refresh the object */
  /* CompleteClass */
  override def Refresh(): Unit = js.native
  
  /** Save the object */
  /* CompleteClass */
  override def Save(): Unit = js.native
}
