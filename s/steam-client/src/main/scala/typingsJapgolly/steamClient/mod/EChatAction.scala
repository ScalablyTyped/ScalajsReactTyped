package typingsJapgolly.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EChatAction extends StObject
@JSImport("steam-client", "EChatAction")
@js.native
object EChatAction extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EChatAction & Double] = js.native
  
  @js.native
  sealed trait Ban
    extends StObject
       with EChatAction
  /* 3 */ val Ban: typingsJapgolly.steamClient.mod.EChatAction.Ban & Double = js.native
  
  @js.native
  sealed trait CloseChat
    extends StObject
       with EChatAction
  /* 9 */ val CloseChat: typingsJapgolly.steamClient.mod.EChatAction.CloseChat & Double = js.native
  
  @js.native
  sealed trait EndVoiceSpeak
    extends StObject
       with EChatAction
  /* 6 */ val EndVoiceSpeak: typingsJapgolly.steamClient.mod.EChatAction.EndVoiceSpeak & Double = js.native
  
  @js.native
  sealed trait InviteChat
    extends StObject
       with EChatAction
  /* 1 */ val InviteChat: typingsJapgolly.steamClient.mod.EChatAction.InviteChat & Double = js.native
  
  @js.native
  sealed trait Kick
    extends StObject
       with EChatAction
  /* 2 */ val Kick: typingsJapgolly.steamClient.mod.EChatAction.Kick & Double = js.native
  
  @js.native
  sealed trait LockChat
    extends StObject
       with EChatAction
  /* 7 */ val LockChat: typingsJapgolly.steamClient.mod.EChatAction.LockChat & Double = js.native
  
  @js.native
  sealed trait SetInvisibleToFriends
    extends StObject
       with EChatAction
  /* 13 */ val SetInvisibleToFriends: typingsJapgolly.steamClient.mod.EChatAction.SetInvisibleToFriends & Double = js.native
  
  @js.native
  sealed trait SetJoinable
    extends StObject
       with EChatAction
  /* 10 */ val SetJoinable: typingsJapgolly.steamClient.mod.EChatAction.SetJoinable & Double = js.native
  
  @js.native
  sealed trait SetModerated
    extends StObject
       with EChatAction
  /* 15 */ val SetModerated: typingsJapgolly.steamClient.mod.EChatAction.SetModerated & Double = js.native
  
  @js.native
  sealed trait SetOwner
    extends StObject
       with EChatAction
  /* 12 */ val SetOwner: typingsJapgolly.steamClient.mod.EChatAction.SetOwner & Double = js.native
  
  @js.native
  sealed trait SetUnjoinable
    extends StObject
       with EChatAction
  /* 11 */ val SetUnjoinable: typingsJapgolly.steamClient.mod.EChatAction.SetUnjoinable & Double = js.native
  
  @js.native
  sealed trait SetUnmoderated
    extends StObject
       with EChatAction
  /* 16 */ val SetUnmoderated: typingsJapgolly.steamClient.mod.EChatAction.SetUnmoderated & Double = js.native
  
  @js.native
  sealed trait SetVisibleToFriends
    extends StObject
       with EChatAction
  /* 14 */ val SetVisibleToFriends: typingsJapgolly.steamClient.mod.EChatAction.SetVisibleToFriends & Double = js.native
  
  @js.native
  sealed trait StartVoiceSpeak
    extends StObject
       with EChatAction
  /* 5 */ val StartVoiceSpeak: typingsJapgolly.steamClient.mod.EChatAction.StartVoiceSpeak & Double = js.native
  
  @js.native
  sealed trait UnBan
    extends StObject
       with EChatAction
  /* 4 */ val UnBan: typingsJapgolly.steamClient.mod.EChatAction.UnBan & Double = js.native
  
  @js.native
  sealed trait UnlockChat
    extends StObject
       with EChatAction
  /* 8 */ val UnlockChat: typingsJapgolly.steamClient.mod.EChatAction.UnlockChat & Double = js.native
}
