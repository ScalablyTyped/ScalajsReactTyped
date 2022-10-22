package typingsJapgolly.voximplantWebsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CallEvents extends StObject
/**
  *    VoxImplant.Call events
  */
@JSImport("voximplant-websdk", "CallEvents")
@js.native
object CallEvents extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CallEvents & Double] = js.native
  
  @js.native
  sealed trait Connected
    extends StObject
       with CallEvents
  /* 0 */ val Connected: typingsJapgolly.voximplantWebsdk.mod.CallEvents.Connected & Double = js.native
  
  @js.native
  sealed trait Disconnected
    extends StObject
       with CallEvents
  /* 1 */ val Disconnected: typingsJapgolly.voximplantWebsdk.mod.CallEvents.Disconnected & Double = js.native
  
  @js.native
  sealed trait Failed
    extends StObject
       with CallEvents
  /* 2 */ val Failed: typingsJapgolly.voximplantWebsdk.mod.CallEvents.Failed & Double = js.native
  
  @js.native
  sealed trait ICETimeout
    extends StObject
       with CallEvents
  /* 3 */ val ICETimeout: typingsJapgolly.voximplantWebsdk.mod.CallEvents.ICETimeout & Double = js.native
  
  @js.native
  sealed trait InfoReceived
    extends StObject
       with CallEvents
  /* 4 */ val InfoReceived: typingsJapgolly.voximplantWebsdk.mod.CallEvents.InfoReceived & Double = js.native
  
  @js.native
  sealed trait MessageReceived
    extends StObject
       with CallEvents
  /* 5 */ val MessageReceived: typingsJapgolly.voximplantWebsdk.mod.CallEvents.MessageReceived & Double = js.native
  
  @js.native
  sealed trait ProgressToneStart
    extends StObject
       with CallEvents
  /* 6 */ val ProgressToneStart: typingsJapgolly.voximplantWebsdk.mod.CallEvents.ProgressToneStart & Double = js.native
  
  @js.native
  sealed trait ProgressToneStop
    extends StObject
       with CallEvents
  /* 7 */ val ProgressToneStop: typingsJapgolly.voximplantWebsdk.mod.CallEvents.ProgressToneStop & Double = js.native
  
  @js.native
  sealed trait TransferComplete
    extends StObject
       with CallEvents
  /* 8 */ val TransferComplete: typingsJapgolly.voximplantWebsdk.mod.CallEvents.TransferComplete & Double = js.native
  
  @js.native
  sealed trait TransferFailed
    extends StObject
       with CallEvents
  /* 9 */ val TransferFailed: typingsJapgolly.voximplantWebsdk.mod.CallEvents.TransferFailed & Double = js.native
}
