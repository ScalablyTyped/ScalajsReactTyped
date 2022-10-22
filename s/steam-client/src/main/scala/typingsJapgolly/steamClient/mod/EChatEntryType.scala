package typingsJapgolly.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EChatEntryType extends StObject
@JSImport("steam-client", "EChatEntryType")
@js.native
object EChatEntryType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EChatEntryType & Double] = js.native
  
  @js.native
  sealed trait ChatMsg
    extends StObject
       with EChatEntryType
  /* 1 */ val ChatMsg: typingsJapgolly.steamClient.mod.EChatEntryType.ChatMsg & Double = js.native
  
  @js.native
  sealed trait Disconnected
    extends StObject
       with EChatEntryType
  /* 10 */ val Disconnected: typingsJapgolly.steamClient.mod.EChatEntryType.Disconnected & Double = js.native
  
  @js.native
  sealed trait Emote
    extends StObject
       with EChatEntryType
  /* 4 */ val Emote: typingsJapgolly.steamClient.mod.EChatEntryType.Emote & Double = js.native
  
  @js.native
  sealed trait Entered
    extends StObject
       with EChatEntryType
  /* 7 */ val Entered: typingsJapgolly.steamClient.mod.EChatEntryType.Entered & Double = js.native
  
  @js.native
  sealed trait HistoricalChat
    extends StObject
       with EChatEntryType
  /* 11 */ val HistoricalChat: typingsJapgolly.steamClient.mod.EChatEntryType.HistoricalChat & Double = js.native
  
  @js.native
  sealed trait Invalid
    extends StObject
       with EChatEntryType
  /* 0 */ val Invalid: typingsJapgolly.steamClient.mod.EChatEntryType.Invalid & Double = js.native
  
  @js.native
  sealed trait InviteGame
    extends StObject
       with EChatEntryType
  /* 3 */ val InviteGame: typingsJapgolly.steamClient.mod.EChatEntryType.InviteGame & Double = js.native
  
  // removed "Listen for LobbyGameCreated_t callback instead"
  @js.native
  sealed trait LeftConversation
    extends StObject
       with EChatEntryType
  /* 6 */ val LeftConversation: typingsJapgolly.steamClient.mod.EChatEntryType.LeftConversation & Double = js.native
  
  @js.native
  sealed trait LinkBlocked
    extends StObject
       with EChatEntryType
  /* 14 */ val LinkBlocked: typingsJapgolly.steamClient.mod.EChatEntryType.LinkBlocked & Double = js.native
  
  // removed "No longer supported by clients"
  @js.native
  sealed trait LobbyGameStart
    extends StObject
       with EChatEntryType
  /* 5 */ val LobbyGameStart: typingsJapgolly.steamClient.mod.EChatEntryType.LobbyGameStart & Double = js.native
  
  @js.native
  sealed trait Reserved1
    extends StObject
       with EChatEntryType
  /* 12 */ val Reserved1: typingsJapgolly.steamClient.mod.EChatEntryType.Reserved1 & Double = js.native
  
  @js.native
  sealed trait Reserved2
    extends StObject
       with EChatEntryType
  /* 13 */ val Reserved2: typingsJapgolly.steamClient.mod.EChatEntryType.Reserved2 & Double = js.native
  
  @js.native
  sealed trait Typing
    extends StObject
       with EChatEntryType
  /* 2 */ val Typing: typingsJapgolly.steamClient.mod.EChatEntryType.Typing & Double = js.native
  
  @js.native
  sealed trait WasBanned
    extends StObject
       with EChatEntryType
  /* 9 */ val WasBanned: typingsJapgolly.steamClient.mod.EChatEntryType.WasBanned & Double = js.native
  
  @js.native
  sealed trait WasKicked
    extends StObject
       with EChatEntryType
  /* 8 */ val WasKicked: typingsJapgolly.steamClient.mod.EChatEntryType.WasKicked & Double = js.native
}
