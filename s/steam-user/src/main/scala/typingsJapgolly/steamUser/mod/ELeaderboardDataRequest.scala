package typingsJapgolly.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ELeaderboardDataRequest extends StObject
@JSImport("steam-user", "ELeaderboardDataRequest")
@js.native
object ELeaderboardDataRequest extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ELeaderboardDataRequest & Double] = js.native
  
  @js.native
  sealed trait Friends
    extends StObject
       with ELeaderboardDataRequest
  /* 2 */ val Friends: typingsJapgolly.steamUser.mod.ELeaderboardDataRequest.Friends & Double = js.native
  
  @js.native
  sealed trait Global
    extends StObject
       with ELeaderboardDataRequest
  /* 0 */ val Global: typingsJapgolly.steamUser.mod.ELeaderboardDataRequest.Global & Double = js.native
  
  @js.native
  sealed trait GlobalAroundUser
    extends StObject
       with ELeaderboardDataRequest
  /* 1 */ val GlobalAroundUser: typingsJapgolly.steamUser.mod.ELeaderboardDataRequest.GlobalAroundUser & Double = js.native
  
  @js.native
  sealed trait Users
    extends StObject
       with ELeaderboardDataRequest
  /* 3 */ val Users: typingsJapgolly.steamUser.mod.ELeaderboardDataRequest.Users & Double = js.native
}
