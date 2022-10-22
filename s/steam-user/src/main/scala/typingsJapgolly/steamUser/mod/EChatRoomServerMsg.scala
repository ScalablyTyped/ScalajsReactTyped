package typingsJapgolly.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EChatRoomServerMsg extends StObject
@JSImport("steam-user", "EChatRoomServerMsg")
@js.native
object EChatRoomServerMsg extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EChatRoomServerMsg & Double] = js.native
  
  @js.native
  sealed trait AppCustom
    extends StObject
       with EChatRoomServerMsg
  /* 11 */ val AppCustom: typingsJapgolly.steamUser.mod.EChatRoomServerMsg.AppCustom & Double = js.native
  
  @js.native
  sealed trait ChatRoomAvatarChanged
    extends StObject
       with EChatRoomServerMsg
  /* 10 */ val ChatRoomAvatarChanged: typingsJapgolly.steamUser.mod.EChatRoomServerMsg.ChatRoomAvatarChanged & Double = js.native
  
  @js.native
  sealed trait ChatRoomTaglineChanged
    extends StObject
       with EChatRoomServerMsg
  /* 9 */ val ChatRoomTaglineChanged: typingsJapgolly.steamUser.mod.EChatRoomServerMsg.ChatRoomTaglineChanged & Double = js.native
  
  @js.native
  sealed trait Invalid
    extends StObject
       with EChatRoomServerMsg
  /* 0 */ val Invalid: typingsJapgolly.steamUser.mod.EChatRoomServerMsg.Invalid & Double = js.native
  
  @js.native
  sealed trait InviteDismissed
    extends StObject
       with EChatRoomServerMsg
  /* 8 */ val InviteDismissed: typingsJapgolly.steamUser.mod.EChatRoomServerMsg.InviteDismissed & Double = js.native
  
  @js.native
  sealed trait Invited
    extends StObject
       with EChatRoomServerMsg
  /* 5 */ val Invited: typingsJapgolly.steamUser.mod.EChatRoomServerMsg.Invited & Double = js.native
  
  @js.native
  sealed trait Joined
    extends StObject
       with EChatRoomServerMsg
  /* 2 */ val Joined: typingsJapgolly.steamUser.mod.EChatRoomServerMsg.Joined & Double = js.native
  
  @js.native
  sealed trait Kicked
    extends StObject
       with EChatRoomServerMsg
  /* 4 */ val Kicked: typingsJapgolly.steamUser.mod.EChatRoomServerMsg.Kicked & Double = js.native
  
  @js.native
  sealed trait Parted
    extends StObject
       with EChatRoomServerMsg
  /* 3 */ val Parted: typingsJapgolly.steamUser.mod.EChatRoomServerMsg.Parted & Double = js.native
  
  @js.native
  sealed trait RenameChatRoom
    extends StObject
       with EChatRoomServerMsg
  /* 1 */ val RenameChatRoom: typingsJapgolly.steamUser.mod.EChatRoomServerMsg.RenameChatRoom & Double = js.native
}
