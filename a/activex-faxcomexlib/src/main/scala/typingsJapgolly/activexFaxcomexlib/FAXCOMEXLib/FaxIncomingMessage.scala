package typingsJapgolly.activexFaxcomexlib.FAXCOMEXLib

import japgolly.scalajs.react.Callback
import typingsJapgolly.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** FaxIncomingMessage Class */
trait FaxIncomingMessage
  extends StObject
     with IFaxIncomingMessage {
  
  /* private */ @JSName("FAXCOMEXLib.FaxIncomingMessage_typekey")
  var FAXCOMEXLibDotFaxIncomingMessage_typekey: FaxIncomingMessage
  
  /** Has Cover page */
  var HasCoverPage: Boolean
  
  /** Reassigns the message */
  def ReAssign(): Unit
  
  /** Read flag on the message */
  var Read: Boolean
  
  /** Set of recipient names */
  var Recipients: String
  
  /** Refresh the object */
  def Refresh(): Unit
  
  /** Save the object */
  def Save(): Unit
  
  /** Sender's fax number */
  var SenderFaxNumber: String
  
  /** Sender's name */
  var SenderName: String
  
  /** Contents of cover page subject field */
  var Subject: String
  
  /** Is message reassigned? */
  val WasReAssigned: Boolean
}
object FaxIncomingMessage {
  
  inline def apply(
    CSID: String,
    CallerId: String,
    CopyTiff: String => Callback,
    Delete: Callback,
    DeviceName: String,
    FAXCOMEXLibDotFaxIncomingMessage_typekey: FaxIncomingMessage,
    HasCoverPage: Boolean,
    Id: String,
    Pages: Double,
    ReAssign: Callback,
    Read: Boolean,
    Recipients: String,
    Refresh: Callback,
    Retries: Double,
    RoutingInformation: String,
    Save: Callback,
    SenderFaxNumber: String,
    SenderName: String,
    Size: Double,
    Subject: String,
    TSID: String,
    TransmissionEnd: VarDate,
    TransmissionStart: VarDate,
    WasReAssigned: Boolean
  ): FaxIncomingMessage = {
    val __obj = js.Dynamic.literal(CSID = CSID.asInstanceOf[js.Any], CallerId = CallerId.asInstanceOf[js.Any], CopyTiff = js.Any.fromFunction1((t0: String) => CopyTiff(t0).runNow()), Delete = Delete.toJsFn, DeviceName = DeviceName.asInstanceOf[js.Any], HasCoverPage = HasCoverPage.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Pages = Pages.asInstanceOf[js.Any], ReAssign = ReAssign.toJsFn, Read = Read.asInstanceOf[js.Any], Recipients = Recipients.asInstanceOf[js.Any], Refresh = Refresh.toJsFn, Retries = Retries.asInstanceOf[js.Any], RoutingInformation = RoutingInformation.asInstanceOf[js.Any], Save = Save.toJsFn, SenderFaxNumber = SenderFaxNumber.asInstanceOf[js.Any], SenderName = SenderName.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], Subject = Subject.asInstanceOf[js.Any], TSID = TSID.asInstanceOf[js.Any], TransmissionEnd = TransmissionEnd.asInstanceOf[js.Any], TransmissionStart = TransmissionStart.asInstanceOf[js.Any], WasReAssigned = WasReAssigned.asInstanceOf[js.Any])
    __obj.updateDynamic("FAXCOMEXLib.FaxIncomingMessage_typekey")(FAXCOMEXLibDotFaxIncomingMessage_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaxIncomingMessage]
  }
  
  extension [Self <: FaxIncomingMessage](x: Self) {
    
    inline def setFAXCOMEXLibDotFaxIncomingMessage_typekey(value: FaxIncomingMessage): Self = StObject.set(x, "FAXCOMEXLib.FaxIncomingMessage_typekey", value.asInstanceOf[js.Any])
    
    inline def setHasCoverPage(value: Boolean): Self = StObject.set(x, "HasCoverPage", value.asInstanceOf[js.Any])
    
    inline def setReAssign(value: Callback): Self = StObject.set(x, "ReAssign", value.toJsFn)
    
    inline def setRead(value: Boolean): Self = StObject.set(x, "Read", value.asInstanceOf[js.Any])
    
    inline def setRecipients(value: String): Self = StObject.set(x, "Recipients", value.asInstanceOf[js.Any])
    
    inline def setRefresh(value: Callback): Self = StObject.set(x, "Refresh", value.toJsFn)
    
    inline def setSave(value: Callback): Self = StObject.set(x, "Save", value.toJsFn)
    
    inline def setSenderFaxNumber(value: String): Self = StObject.set(x, "SenderFaxNumber", value.asInstanceOf[js.Any])
    
    inline def setSenderName(value: String): Self = StObject.set(x, "SenderName", value.asInstanceOf[js.Any])
    
    inline def setSubject(value: String): Self = StObject.set(x, "Subject", value.asInstanceOf[js.Any])
    
    inline def setWasReAssigned(value: Boolean): Self = StObject.set(x, "WasReAssigned", value.asInstanceOf[js.Any])
  }
}
