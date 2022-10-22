package typingsJapgolly.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EClientPersonaStateFlag extends StObject
@JSImport("steam-user", "EClientPersonaStateFlag")
@js.native
object EClientPersonaStateFlag extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EClientPersonaStateFlag & Double] = js.native
  
  @js.native
  sealed trait Broadcast
    extends StObject
       with EClientPersonaStateFlag
  /* 8192 */ val Broadcast: typingsJapgolly.steamUser.mod.EClientPersonaStateFlag.Broadcast & Double = js.native
  
  @js.native
  sealed trait ClanData
    extends StObject
       with EClientPersonaStateFlag
  /* 1024 */ val ClanData: typingsJapgolly.steamUser.mod.EClientPersonaStateFlag.ClanData & Double = js.native
  
  @js.native
  sealed trait ClanInfo
    extends StObject
       with EClientPersonaStateFlag
  /* 128 */ val ClanInfo: typingsJapgolly.steamUser.mod.EClientPersonaStateFlag.ClanInfo & Double = js.native
  
  @js.native
  sealed trait ClanTag
    extends StObject
       with EClientPersonaStateFlag
  /* 1024 */ val ClanTag: typingsJapgolly.steamUser.mod.EClientPersonaStateFlag.ClanTag & Double = js.native
  
  @js.native
  sealed trait Facebook
    extends StObject
       with EClientPersonaStateFlag
  /* 2048 */ val Facebook: typingsJapgolly.steamUser.mod.EClientPersonaStateFlag.Facebook & Double = js.native
  
  @js.native
  sealed trait GameDataBlob
    extends StObject
       with EClientPersonaStateFlag
  /* 512 */ val GameDataBlob: typingsJapgolly.steamUser.mod.EClientPersonaStateFlag.GameDataBlob & Double = js.native
  
  @js.native
  sealed trait GameExtraInfo
    extends StObject
       with EClientPersonaStateFlag
  /* 256 */ val GameExtraInfo: typingsJapgolly.steamUser.mod.EClientPersonaStateFlag.GameExtraInfo & Double = js.native
  
  @js.native
  sealed trait LastSeen
    extends StObject
       with EClientPersonaStateFlag
  /* 64 */ val LastSeen: typingsJapgolly.steamUser.mod.EClientPersonaStateFlag.LastSeen & Double = js.native
  
  @js.native
  sealed trait Metadata
    extends StObject
       with EClientPersonaStateFlag
  /* 32 */ val Metadata: typingsJapgolly.steamUser.mod.EClientPersonaStateFlag.Metadata & Double = js.native
  
  @js.native
  sealed trait PlayerName
    extends StObject
       with EClientPersonaStateFlag
  /* 2 */ val PlayerName: typingsJapgolly.steamUser.mod.EClientPersonaStateFlag.PlayerName & Double = js.native
  
  @js.native
  sealed trait Presence
    extends StObject
       with EClientPersonaStateFlag
  /* 16 */ val Presence: typingsJapgolly.steamUser.mod.EClientPersonaStateFlag.Presence & Double = js.native
  
  @js.native
  sealed trait QueryPort
    extends StObject
       with EClientPersonaStateFlag
  /* 4 */ val QueryPort: typingsJapgolly.steamUser.mod.EClientPersonaStateFlag.QueryPort & Double = js.native
  
  @js.native
  sealed trait RichPresence
    extends StObject
       with EClientPersonaStateFlag
  /* 4096 */ val RichPresence: typingsJapgolly.steamUser.mod.EClientPersonaStateFlag.RichPresence & Double = js.native
  
  @js.native
  sealed trait SourceID
    extends StObject
       with EClientPersonaStateFlag
  /* 8 */ val SourceID: typingsJapgolly.steamUser.mod.EClientPersonaStateFlag.SourceID & Double = js.native
  
  @js.native
  sealed trait Status
    extends StObject
       with EClientPersonaStateFlag
  /* 1 */ val Status: typingsJapgolly.steamUser.mod.EClientPersonaStateFlag.Status & Double = js.native
  
  @js.native
  sealed trait UserClanRank
    extends StObject
       with EClientPersonaStateFlag
  /* 128 */ val UserClanRank: typingsJapgolly.steamUser.mod.EClientPersonaStateFlag.UserClanRank & Double = js.native
  
  @js.native
  sealed trait Watching
    extends StObject
       with EClientPersonaStateFlag
  /* 16384 */ val Watching: typingsJapgolly.steamUser.mod.EClientPersonaStateFlag.Watching & Double = js.native
}
