package typingsJapgolly.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EWorkshopFileType extends StObject
@JSImport("steam-user", "EWorkshopFileType")
@js.native
object EWorkshopFileType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EWorkshopFileType & Double] = js.native
  
  @js.native
  sealed trait First
    extends StObject
       with EWorkshopFileType
  /* 0 */ val First: typingsJapgolly.steamUser.mod.EWorkshopFileType.First & Double = js.native
  
  @js.native
  sealed trait GameManagedItem
    extends StObject
       with EWorkshopFileType
  /* 15 */ val GameManagedItem: typingsJapgolly.steamUser.mod.EWorkshopFileType.GameManagedItem & Double = js.native
  
  @js.native
  sealed trait SteamVideo
    extends StObject
       with EWorkshopFileType
  /* 14 */ val SteamVideo: typingsJapgolly.steamUser.mod.EWorkshopFileType.SteamVideo & Double = js.native
  
  @js.native
  sealed trait SteamworksAccessInvite
    extends StObject
       with EWorkshopFileType
  /* 13 */ val SteamworksAccessInvite: typingsJapgolly.steamUser.mod.EWorkshopFileType.SteamworksAccessInvite & Double = js.native
}
