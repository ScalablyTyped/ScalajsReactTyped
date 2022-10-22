package typingsJapgolly.activexFaxcomexlib.FAXCOMEXLib

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** FaxActivity Class */
trait FaxActivity extends StObject {
  
  /* private */ @JSName("FAXCOMEXLib.FaxActivity_typekey")
  var FAXCOMEXLibDotFaxActivity_typekey: FaxActivity
  
  /** Number of incoming messages */
  val IncomingMessages: Double
  
  /** Number of outgoing messages */
  val OutgoingMessages: Double
  
  /** Number of queued messages */
  val QueuedMessages: Double
  
  /** Refresh the object */
  def Refresh(): Unit
  
  /** Number of routed incoming messages */
  val RoutingMessages: Double
}
object FaxActivity {
  
  inline def apply(
    FAXCOMEXLibDotFaxActivity_typekey: FaxActivity,
    IncomingMessages: Double,
    OutgoingMessages: Double,
    QueuedMessages: Double,
    Refresh: Callback,
    RoutingMessages: Double
  ): FaxActivity = {
    val __obj = js.Dynamic.literal(IncomingMessages = IncomingMessages.asInstanceOf[js.Any], OutgoingMessages = OutgoingMessages.asInstanceOf[js.Any], QueuedMessages = QueuedMessages.asInstanceOf[js.Any], Refresh = Refresh.toJsFn, RoutingMessages = RoutingMessages.asInstanceOf[js.Any])
    __obj.updateDynamic("FAXCOMEXLib.FaxActivity_typekey")(FAXCOMEXLibDotFaxActivity_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaxActivity]
  }
  
  extension [Self <: FaxActivity](x: Self) {
    
    inline def setFAXCOMEXLibDotFaxActivity_typekey(value: FaxActivity): Self = StObject.set(x, "FAXCOMEXLib.FaxActivity_typekey", value.asInstanceOf[js.Any])
    
    inline def setIncomingMessages(value: Double): Self = StObject.set(x, "IncomingMessages", value.asInstanceOf[js.Any])
    
    inline def setOutgoingMessages(value: Double): Self = StObject.set(x, "OutgoingMessages", value.asInstanceOf[js.Any])
    
    inline def setQueuedMessages(value: Double): Self = StObject.set(x, "QueuedMessages", value.asInstanceOf[js.Any])
    
    inline def setRefresh(value: Callback): Self = StObject.set(x, "Refresh", value.toJsFn)
    
    inline def setRoutingMessages(value: Double): Self = StObject.set(x, "RoutingMessages", value.asInstanceOf[js.Any])
  }
}
