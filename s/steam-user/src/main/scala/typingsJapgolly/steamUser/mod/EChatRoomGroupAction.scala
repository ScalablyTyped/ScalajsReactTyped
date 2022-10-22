package typingsJapgolly.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EChatRoomGroupAction extends StObject
@JSImport("steam-user", "EChatRoomGroupAction")
@js.native
object EChatRoomGroupAction extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EChatRoomGroupAction & Double] = js.native
  
  @js.native
  sealed trait Ban
    extends StObject
       with EChatRoomGroupAction
  /* 3 */ val Ban: typingsJapgolly.steamUser.mod.EChatRoomGroupAction.Ban & Double = js.native
  
  @js.native
  sealed trait ChangeGroupRoles
    extends StObject
       with EChatRoomGroupAction
  /* 8 */ val ChangeGroupRoles: typingsJapgolly.steamUser.mod.EChatRoomGroupAction.ChangeGroupRoles & Double = js.native
  
  @js.native
  sealed trait ChangeTaglineAvatarName
    extends StObject
       with EChatRoomGroupAction
  /* 5 */ val ChangeTaglineAvatarName: typingsJapgolly.steamUser.mod.EChatRoomGroupAction.ChangeTaglineAvatarName & Double = js.native
  
  @js.native
  sealed trait ChangeUserRoles
    extends StObject
       with EChatRoomGroupAction
  /* 9 */ val ChangeUserRoles: typingsJapgolly.steamUser.mod.EChatRoomGroupAction.ChangeUserRoles & Double = js.native
  
  @js.native
  sealed trait Chat
    extends StObject
       with EChatRoomGroupAction
  /* 6 */ val Chat: typingsJapgolly.steamUser.mod.EChatRoomGroupAction.Chat & Double = js.native
  
  @js.native
  sealed trait CreateRenameDeleteChannel
    extends StObject
       with EChatRoomGroupAction
  /* 1 */ val CreateRenameDeleteChannel: typingsJapgolly.steamUser.mod.EChatRoomGroupAction.CreateRenameDeleteChannel & Double = js.native
  
  @js.native
  sealed trait Default
    extends StObject
       with EChatRoomGroupAction
  /* 0 */ val Default: typingsJapgolly.steamUser.mod.EChatRoomGroupAction.Default & Double = js.native
  
  @js.native
  sealed trait Invite
    extends StObject
       with EChatRoomGroupAction
  /* 4 */ val Invite: typingsJapgolly.steamUser.mod.EChatRoomGroupAction.Invite & Double = js.native
  
  @js.native
  sealed trait Kick
    extends StObject
       with EChatRoomGroupAction
  /* 2 */ val Kick: typingsJapgolly.steamUser.mod.EChatRoomGroupAction.Kick & Double = js.native
  
  @js.native
  sealed trait MentionAll
    extends StObject
       with EChatRoomGroupAction
  /* 10 */ val MentionAll: typingsJapgolly.steamUser.mod.EChatRoomGroupAction.MentionAll & Double = js.native
  
  @js.native
  sealed trait SetWatchingBroadcast
    extends StObject
       with EChatRoomGroupAction
  /* 11 */ val SetWatchingBroadcast: typingsJapgolly.steamUser.mod.EChatRoomGroupAction.SetWatchingBroadcast & Double = js.native
  
  @js.native
  sealed trait ViewHistory
    extends StObject
       with EChatRoomGroupAction
  /* 7 */ val ViewHistory: typingsJapgolly.steamUser.mod.EChatRoomGroupAction.ViewHistory & Double = js.native
}
