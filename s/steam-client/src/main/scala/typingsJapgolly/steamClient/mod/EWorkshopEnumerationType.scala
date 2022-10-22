package typingsJapgolly.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EWorkshopEnumerationType extends StObject
@JSImport("steam-client", "EWorkshopEnumerationType")
@js.native
object EWorkshopEnumerationType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EWorkshopEnumerationType & Double] = js.native
  
  @js.native
  sealed trait ContentByFriends
    extends StObject
       with EWorkshopEnumerationType
  /* 5 */ val ContentByFriends: typingsJapgolly.steamClient.mod.EWorkshopEnumerationType.ContentByFriends & Double = js.native
  
  @js.native
  sealed trait FavoriteOfFriends
    extends StObject
       with EWorkshopEnumerationType
  /* 3 */ val FavoriteOfFriends: typingsJapgolly.steamClient.mod.EWorkshopEnumerationType.FavoriteOfFriends & Double = js.native
  
  @js.native
  sealed trait RankedByVote
    extends StObject
       with EWorkshopEnumerationType
  /* 0 */ val RankedByVote: typingsJapgolly.steamClient.mod.EWorkshopEnumerationType.RankedByVote & Double = js.native
  
  @js.native
  sealed trait Recent
    extends StObject
       with EWorkshopEnumerationType
  /* 1 */ val Recent: typingsJapgolly.steamClient.mod.EWorkshopEnumerationType.Recent & Double = js.native
  
  @js.native
  sealed trait RecentFromFollowedUsers
    extends StObject
       with EWorkshopEnumerationType
  /* 6 */ val RecentFromFollowedUsers: typingsJapgolly.steamClient.mod.EWorkshopEnumerationType.RecentFromFollowedUsers & Double = js.native
  
  @js.native
  sealed trait Trending
    extends StObject
       with EWorkshopEnumerationType
  /* 2 */ val Trending: typingsJapgolly.steamClient.mod.EWorkshopEnumerationType.Trending & Double = js.native
  
  @js.native
  sealed trait VotedByFriends
    extends StObject
       with EWorkshopEnumerationType
  /* 4 */ val VotedByFriends: typingsJapgolly.steamClient.mod.EWorkshopEnumerationType.VotedByFriends & Double = js.native
}
