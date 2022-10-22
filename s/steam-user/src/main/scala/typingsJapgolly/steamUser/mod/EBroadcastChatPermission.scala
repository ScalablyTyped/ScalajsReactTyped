package typingsJapgolly.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EBroadcastChatPermission extends StObject
@JSImport("steam-user", "EBroadcastChatPermission")
@js.native
object EBroadcastChatPermission extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EBroadcastChatPermission & Double] = js.native
  
  @js.native
  sealed trait OwnsApp
    extends StObject
       with EBroadcastChatPermission
  /* 1 */ val OwnsApp: typingsJapgolly.steamUser.mod.EBroadcastChatPermission.OwnsApp & Double = js.native
  
  @js.native
  sealed trait Public
    extends StObject
       with EBroadcastChatPermission
  /* 0 */ val Public: typingsJapgolly.steamUser.mod.EBroadcastChatPermission.Public & Double = js.native
}
