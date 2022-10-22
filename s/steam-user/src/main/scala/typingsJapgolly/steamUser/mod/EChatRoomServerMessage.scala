package typingsJapgolly.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EChatRoomServerMessage extends StObject
@JSImport("steam-user", "EChatRoomServerMessage")
@js.native
object EChatRoomServerMessage extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EChatRoomServerMessage & Double] = js.native
  
  @js.native
  sealed trait AppCustom
    extends StObject
       with EChatRoomServerMessage
  /* 11 */ val AppCustom: typingsJapgolly.steamUser.mod.EChatRoomServerMessage.AppCustom & Double = js.native
  
  @js.native
  sealed trait ChatRoomAvatarChanged
    extends StObject
       with EChatRoomServerMessage
  /* 10 */ val ChatRoomAvatarChanged: typingsJapgolly.steamUser.mod.EChatRoomServerMessage.ChatRoomAvatarChanged & Double = js.native
  
  @js.native
  sealed trait ChatRoomTaglineChanged
    extends StObject
       with EChatRoomServerMessage
  /* 9 */ val ChatRoomTaglineChanged: typingsJapgolly.steamUser.mod.EChatRoomServerMessage.ChatRoomTaglineChanged & Double = js.native
  
  @js.native
  sealed trait Invalid
    extends StObject
       with EChatRoomServerMessage
  /* 0 */ val Invalid: typingsJapgolly.steamUser.mod.EChatRoomServerMessage.Invalid & Double = js.native
  
  @js.native
  sealed trait InviteDismissed
    extends StObject
       with EChatRoomServerMessage
  /* 8 */ val InviteDismissed: typingsJapgolly.steamUser.mod.EChatRoomServerMessage.InviteDismissed & Double = js.native
  
  @js.native
  sealed trait Invited
    extends StObject
       with EChatRoomServerMessage
  /* 5 */ val Invited: typingsJapgolly.steamUser.mod.EChatRoomServerMessage.Invited & Double = js.native
  
  @js.native
  sealed trait Joined
    extends StObject
       with EChatRoomServerMessage
  /* 2 */ val Joined: typingsJapgolly.steamUser.mod.EChatRoomServerMessage.Joined & Double = js.native
  
  @js.native
  sealed trait Kicked
    extends StObject
       with EChatRoomServerMessage
  /* 4 */ val Kicked: typingsJapgolly.steamUser.mod.EChatRoomServerMessage.Kicked & Double = js.native
  
  @js.native
  sealed trait Parted
    extends StObject
       with EChatRoomServerMessage
  /* 3 */ val Parted: typingsJapgolly.steamUser.mod.EChatRoomServerMessage.Parted & Double = js.native
  
  @js.native
  sealed trait RenameChatRoom
    extends StObject
       with EChatRoomServerMessage
  /* 1 */ val RenameChatRoom: typingsJapgolly.steamUser.mod.EChatRoomServerMessage.RenameChatRoom & Double = js.native
}
