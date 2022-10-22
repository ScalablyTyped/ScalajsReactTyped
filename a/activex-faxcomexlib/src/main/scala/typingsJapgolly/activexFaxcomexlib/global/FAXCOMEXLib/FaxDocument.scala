package typingsJapgolly.activexFaxcomexlib.global.FAXCOMEXLib

import typingsJapgolly.activexFaxcomexlib.FAXCOMEXLib.FAX_COVERPAGE_TYPE_ENUM
import typingsJapgolly.activexFaxcomexlib.FAXCOMEXLib.FAX_PRIORITY_TYPE_ENUM
import typingsJapgolly.activexFaxcomexlib.FAXCOMEXLib.FAX_RECEIPT_TYPE_ENUM
import typingsJapgolly.activexFaxcomexlib.FAXCOMEXLib.FAX_SCHEDULE_TYPE_ENUM
import typingsJapgolly.activexFaxcomexlib.FAXCOMEXLib.FaxRecipients
import typingsJapgolly.std.SafeArray
import typingsJapgolly.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** FaxDocument Class */
@JSGlobal("FAXCOMEXLib.FaxDocument")
@js.native
/* private */ open class FaxDocument ()
  extends StObject
     with typingsJapgolly.activexFaxcomexlib.FAXCOMEXLib.FaxDocument {
  
  /** Whether to attach a fax to the receipt */
  /* CompleteClass */
  var AttachFaxToReceipt: Boolean = js.native
  
  /** Full paths to the fax document body files */
  /* CompleteClass */
  var Bodies: Any = js.native
  
  /** Full path to the fax document body file */
  /* CompleteClass */
  var Body: String = js.native
  
  /** Call handle */
  /* CompleteClass */
  var CallHandle: Double = js.native
  
  /** Submit the fax document on the already connected server */
  /* CompleteClass */
  override def ConnectedSubmit(pFaxServer: typingsJapgolly.activexFaxcomexlib.FAXCOMEXLib.IFaxServer): SafeArray[String] = js.native
  
  /** Submit the fax document on the already connected server */
  /* CompleteClass */
  override def ConnectedSubmit2(
    pFaxServer: typingsJapgolly.activexFaxcomexlib.FAXCOMEXLib.IFaxServer,
    pvFaxOutgoingJobIDs: SafeArray[String]
  ): Double = js.native
  
  /** Cover page file path */
  /* CompleteClass */
  var CoverPage: String = js.native
  
  /** Is server, local, or no cover page used */
  /* CompleteClass */
  var CoverPageType: FAX_COVERPAGE_TYPE_ENUM = js.native
  
  /** The document name */
  /* CompleteClass */
  var DocumentName: String = js.native
  
  /* private */ /* CompleteClass */
  @JSName("FAXCOMEXLib.FaxDocument_typekey")
  var FAXCOMEXLibDotFaxDocument_typekey: typingsJapgolly.activexFaxcomexlib.FAXCOMEXLib.FaxDocument = js.native
  
  /** Whether to group the broadcast receipts */
  /* CompleteClass */
  var GroupBroadcastReceipts: Boolean = js.native
  
  /** Contents of cover page note field */
  /* CompleteClass */
  var Note: String = js.native
  
  /** Priority of the fax */
  /* CompleteClass */
  var Priority: FAX_PRIORITY_TYPE_ENUM = js.native
  
  /** Address of the receipt */
  /* CompleteClass */
  var ReceiptAddress: String = js.native
  
  /** Type of the receipt */
  /* CompleteClass */
  var ReceiptType: FAX_RECEIPT_TYPE_ENUM = js.native
  
  /** Collection of recipients */
  /* CompleteClass */
  override def Recipients(lIndex: Double): typingsJapgolly.activexFaxcomexlib.FAXCOMEXLib.FaxRecipient = js.native
  /** Collection of recipients */
  /* CompleteClass */
  @JSName("Recipients")
  override val Recipients_Original: FaxRecipients = js.native
  
  /** Time to send the fax */
  /* CompleteClass */
  var ScheduleTime: VarDate = js.native
  
  /** When to send the fax */
  /* CompleteClass */
  var ScheduleType: FAX_SCHEDULE_TYPE_ENUM = js.native
  
  /** Sender information object */
  /* CompleteClass */
  override val Sender: typingsJapgolly.activexFaxcomexlib.FAXCOMEXLib.FaxSender = js.native
  
  /** Contents of cover page subject field */
  /* CompleteClass */
  var Subject: String = js.native
  
  /** Submission Id for the Fax document */
  /* CompleteClass */
  override val SubmissionId: String = js.native
  
  /** Connect to server, submit the fax document, disconnect */
  /* CompleteClass */
  override def Submit(bstrFaxServerName: String): SafeArray[Double] = js.native
  
  /** Connect to server, submit the fax document, disconnect */
  /* CompleteClass */
  override def Submit2(bstrFaxServerName: String, pvFaxOutgoingJobIDs: Any): Double = js.native
  
  /** Tapi connection */
  /* CompleteClass */
  var TapiConnection: Any = js.native
}
