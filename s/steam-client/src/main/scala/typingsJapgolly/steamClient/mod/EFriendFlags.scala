package typingsJapgolly.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EFriendFlags extends StObject
@JSImport("steam-client", "EFriendFlags")
@js.native
object EFriendFlags extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EFriendFlags & Double] = js.native
  
  @js.native
  sealed trait Blocked
    extends StObject
       with EFriendFlags
  /* 1 */ val Blocked: typingsJapgolly.steamClient.mod.EFriendFlags.Blocked & Double = js.native
  
  @js.native
  sealed trait ChatMember
    extends StObject
       with EFriendFlags
  /* 4096 */ val ChatMember: typingsJapgolly.steamClient.mod.EFriendFlags.ChatMember & Double = js.native
  
  @js.native
  sealed trait ClanMember
    extends StObject
       with EFriendFlags
  /* 8 */ val ClanMember: typingsJapgolly.steamClient.mod.EFriendFlags.ClanMember & Double = js.native
  
  @js.native
  sealed trait FlagAll
    extends StObject
       with EFriendFlags
  /* 65535 */ val FlagAll: typingsJapgolly.steamClient.mod.EFriendFlags.FlagAll & Double = js.native
  
  @js.native
  sealed trait FriendshipRequested
    extends StObject
       with EFriendFlags
  /* 2 */ val FriendshipRequested: typingsJapgolly.steamClient.mod.EFriendFlags.FriendshipRequested & Double = js.native
  
  @js.native
  sealed trait Ignored
    extends StObject
       with EFriendFlags
  /* 512 */ val Ignored: typingsJapgolly.steamClient.mod.EFriendFlags.Ignored & Double = js.native
  
  @js.native
  sealed trait IgnoredFriend
    extends StObject
       with EFriendFlags
  /* 1024 */ val IgnoredFriend: typingsJapgolly.steamClient.mod.EFriendFlags.IgnoredFriend & Double = js.native
  
  @js.native
  sealed trait Immediate
    extends StObject
       with EFriendFlags
  /* 4 */ val Immediate: typingsJapgolly.steamClient.mod.EFriendFlags.Immediate & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with EFriendFlags
  /* 0 */ val None: typingsJapgolly.steamClient.mod.EFriendFlags.None & Double = js.native
  
  @js.native
  sealed trait OnGameServer
    extends StObject
       with EFriendFlags
  /* 16 */ val OnGameServer: typingsJapgolly.steamClient.mod.EFriendFlags.OnGameServer & Double = js.native
  
  @js.native
  sealed trait RequestingFriendship
    extends StObject
       with EFriendFlags
  /* 128 */ val RequestingFriendship: typingsJapgolly.steamClient.mod.EFriendFlags.RequestingFriendship & Double = js.native
  
  @js.native
  sealed trait RequestingInfo
    extends StObject
       with EFriendFlags
  /* 256 */ val RequestingInfo: typingsJapgolly.steamClient.mod.EFriendFlags.RequestingInfo & Double = js.native
  
  @js.native
  sealed trait Suggested
    extends StObject
       with EFriendFlags
  /* 2048 */ val Suggested: typingsJapgolly.steamClient.mod.EFriendFlags.Suggested & Double = js.native
}
