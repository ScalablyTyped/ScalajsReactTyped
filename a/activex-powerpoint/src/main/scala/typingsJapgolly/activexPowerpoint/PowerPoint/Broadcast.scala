package typingsJapgolly.activexPowerpoint.PowerPoint

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Broadcast extends StObject {
  
  val Application: typingsJapgolly.activexPowerpoint.PowerPoint.Application
  
  val AttendeeUrl: String
  
  def End(): Unit
  
  val IsBroadcasting: Boolean
  
  val Parent: Any
  
  /* private */ @JSName("PowerPoint.Broadcast_typekey")
  var PowerPointDotBroadcast_typekey: Broadcast
  
  def Start(serverUrl: String): Unit
}
object Broadcast {
  
  inline def apply(
    Application: Application,
    AttendeeUrl: String,
    End: Callback,
    IsBroadcasting: Boolean,
    Parent: Any,
    PowerPointDotBroadcast_typekey: Broadcast,
    Start: String => Callback
  ): Broadcast = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], AttendeeUrl = AttendeeUrl.asInstanceOf[js.Any], End = End.toJsFn, IsBroadcasting = IsBroadcasting.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Start = js.Any.fromFunction1((t0: String) => Start(t0).runNow()))
    __obj.updateDynamic("PowerPoint.Broadcast_typekey")(PowerPointDotBroadcast_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Broadcast]
  }
  
  extension [Self <: Broadcast](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setAttendeeUrl(value: String): Self = StObject.set(x, "AttendeeUrl", value.asInstanceOf[js.Any])
    
    inline def setEnd(value: Callback): Self = StObject.set(x, "End", value.toJsFn)
    
    inline def setIsBroadcasting(value: Boolean): Self = StObject.set(x, "IsBroadcasting", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPowerPointDotBroadcast_typekey(value: Broadcast): Self = StObject.set(x, "PowerPoint.Broadcast_typekey", value.asInstanceOf[js.Any])
    
    inline def setStart(value: String => Callback): Self = StObject.set(x, "Start", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
