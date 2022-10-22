package typingsJapgolly.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EPersonaState extends StObject
@JSImport("steam-client", "EPersonaState")
@js.native
object EPersonaState extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EPersonaState & Double] = js.native
  
  @js.native
  sealed trait Away
    extends StObject
       with EPersonaState
  /* 3 */ val Away: typingsJapgolly.steamClient.mod.EPersonaState.Away & Double = js.native
  
  @js.native
  sealed trait Busy
    extends StObject
       with EPersonaState
  /* 2 */ val Busy: typingsJapgolly.steamClient.mod.EPersonaState.Busy & Double = js.native
  
  @js.native
  sealed trait LookingToPlay
    extends StObject
       with EPersonaState
  /* 6 */ val LookingToPlay: typingsJapgolly.steamClient.mod.EPersonaState.LookingToPlay & Double = js.native
  
  @js.native
  sealed trait LookingToTrade
    extends StObject
       with EPersonaState
  /* 5 */ val LookingToTrade: typingsJapgolly.steamClient.mod.EPersonaState.LookingToTrade & Double = js.native
  
  @js.native
  sealed trait Max
    extends StObject
       with EPersonaState
  /* 7 */ val Max: typingsJapgolly.steamClient.mod.EPersonaState.Max & Double = js.native
  
  @js.native
  sealed trait Offline
    extends StObject
       with EPersonaState
  /* 0 */ val Offline: typingsJapgolly.steamClient.mod.EPersonaState.Offline & Double = js.native
  
  @js.native
  sealed trait Online
    extends StObject
       with EPersonaState
  /* 1 */ val Online: typingsJapgolly.steamClient.mod.EPersonaState.Online & Double = js.native
  
  @js.native
  sealed trait Snooze
    extends StObject
       with EPersonaState
  /* 4 */ val Snooze: typingsJapgolly.steamClient.mod.EPersonaState.Snooze & Double = js.native
}
