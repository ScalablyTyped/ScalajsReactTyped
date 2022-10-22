package typingsJapgolly.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EClientPersonaStateFlag extends StObject
@JSImport("steam-client", "EClientPersonaStateFlag")
@js.native
object EClientPersonaStateFlag extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EClientPersonaStateFlag & Double] = js.native
  
  @js.native
  sealed trait ClanInfo
    extends StObject
       with EClientPersonaStateFlag
  /* 128 */ val ClanInfo: typingsJapgolly.steamClient.mod.EClientPersonaStateFlag.ClanInfo & Double = js.native
  
  @js.native
  sealed trait ClanTag
    extends StObject
       with EClientPersonaStateFlag
  /* 1024 */ val ClanTag: typingsJapgolly.steamClient.mod.EClientPersonaStateFlag.ClanTag & Double = js.native
  
  @js.native
  sealed trait Facebook
    extends StObject
       with EClientPersonaStateFlag
  /* 2048 */ val Facebook: typingsJapgolly.steamClient.mod.EClientPersonaStateFlag.Facebook & Double = js.native
  
  @js.native
  sealed trait GameDataBlob
    extends StObject
       with EClientPersonaStateFlag
  /* 512 */ val GameDataBlob: typingsJapgolly.steamClient.mod.EClientPersonaStateFlag.GameDataBlob & Double = js.native
  
  @js.native
  sealed trait GameExtraInfo
    extends StObject
       with EClientPersonaStateFlag
  /* 256 */ val GameExtraInfo: typingsJapgolly.steamClient.mod.EClientPersonaStateFlag.GameExtraInfo & Double = js.native
  
  // removed
  @js.native
  sealed trait LastSeen
    extends StObject
       with EClientPersonaStateFlag
  /* 64 */ val LastSeen: typingsJapgolly.steamClient.mod.EClientPersonaStateFlag.LastSeen & Double = js.native
  
  @js.native
  sealed trait Metadata
    extends StObject
       with EClientPersonaStateFlag
  /* 32 */ val Metadata: typingsJapgolly.steamClient.mod.EClientPersonaStateFlag.Metadata & Double = js.native
  
  @js.native
  sealed trait PlayerName
    extends StObject
       with EClientPersonaStateFlag
  /* 2 */ val PlayerName: typingsJapgolly.steamClient.mod.EClientPersonaStateFlag.PlayerName & Double = js.native
  
  @js.native
  sealed trait Presence
    extends StObject
       with EClientPersonaStateFlag
  /* 16 */ val Presence: typingsJapgolly.steamClient.mod.EClientPersonaStateFlag.Presence & Double = js.native
  
  @js.native
  sealed trait QueryPort
    extends StObject
       with EClientPersonaStateFlag
  /* 4 */ val QueryPort: typingsJapgolly.steamClient.mod.EClientPersonaStateFlag.QueryPort & Double = js.native
  
  @js.native
  sealed trait SourceID
    extends StObject
       with EClientPersonaStateFlag
  /* 8 */ val SourceID: typingsJapgolly.steamClient.mod.EClientPersonaStateFlag.SourceID & Double = js.native
  
  @js.native
  sealed trait Status
    extends StObject
       with EClientPersonaStateFlag
  /* 1 */ val Status: typingsJapgolly.steamClient.mod.EClientPersonaStateFlag.Status & Double = js.native
}
