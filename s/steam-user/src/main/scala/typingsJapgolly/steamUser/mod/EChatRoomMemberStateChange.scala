package typingsJapgolly.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EChatRoomMemberStateChange extends StObject
@JSImport("steam-user", "EChatRoomMemberStateChange")
@js.native
object EChatRoomMemberStateChange extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EChatRoomMemberStateChange & Double] = js.native
  
  @js.native
  sealed trait Banned
    extends StObject
       with EChatRoomMemberStateChange
  /* 10 */ val Banned: typingsJapgolly.steamUser.mod.EChatRoomMemberStateChange.Banned & Double = js.native
  
  @js.native
  sealed trait Invalid
    extends StObject
       with EChatRoomMemberStateChange
  /* 0 */ val Invalid: typingsJapgolly.steamUser.mod.EChatRoomMemberStateChange.Invalid & Double = js.native
  
  @js.native
  sealed trait InviteDismissed
    extends StObject
       with EChatRoomMemberStateChange
  /* 8 */ val InviteDismissed: typingsJapgolly.steamUser.mod.EChatRoomMemberStateChange.InviteDismissed & Double = js.native
  
  @js.native
  sealed trait Invited
    extends StObject
       with EChatRoomMemberStateChange
  /* 4 */ val Invited: typingsJapgolly.steamUser.mod.EChatRoomMemberStateChange.Invited & Double = js.native
  
  @js.native
  sealed trait Joined
    extends StObject
       with EChatRoomMemberStateChange
  /* 1 */ val Joined: typingsJapgolly.steamUser.mod.EChatRoomMemberStateChange.Joined & Double = js.native
  
  @js.native
  sealed trait Kicked
    extends StObject
       with EChatRoomMemberStateChange
  /* 3 */ val Kicked: typingsJapgolly.steamUser.mod.EChatRoomMemberStateChange.Kicked & Double = js.native
  
  @js.native
  sealed trait Muted
    extends StObject
       with EChatRoomMemberStateChange
  /* 9 */ val Muted: typingsJapgolly.steamUser.mod.EChatRoomMemberStateChange.Muted & Double = js.native
  
  @js.native
  sealed trait Parted
    extends StObject
       with EChatRoomMemberStateChange
  /* 2 */ val Parted: typingsJapgolly.steamUser.mod.EChatRoomMemberStateChange.Parted & Double = js.native
  
  @js.native
  sealed trait RankChanged
    extends StObject
       with EChatRoomMemberStateChange
  /* 7 */ val RankChanged: typingsJapgolly.steamUser.mod.EChatRoomMemberStateChange.RankChanged & Double = js.native
  
  @js.native
  sealed trait RolesChanged
    extends StObject
       with EChatRoomMemberStateChange
  /* 12 */ val RolesChanged: typingsJapgolly.steamUser.mod.EChatRoomMemberStateChange.RolesChanged & Double = js.native
}
