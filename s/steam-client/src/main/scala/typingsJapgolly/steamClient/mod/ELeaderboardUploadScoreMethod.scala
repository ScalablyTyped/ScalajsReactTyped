package typingsJapgolly.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ELeaderboardUploadScoreMethod extends StObject
@JSImport("steam-client", "ELeaderboardUploadScoreMethod")
@js.native
object ELeaderboardUploadScoreMethod extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ELeaderboardUploadScoreMethod & Double] = js.native
  
  @js.native
  sealed trait ForceUpdate
    extends StObject
       with ELeaderboardUploadScoreMethod
  /* 2 */ val ForceUpdate: typingsJapgolly.steamClient.mod.ELeaderboardUploadScoreMethod.ForceUpdate & Double = js.native
  
  @js.native
  sealed trait KeepBest
    extends StObject
       with ELeaderboardUploadScoreMethod
  /* 1 */ val KeepBest: typingsJapgolly.steamClient.mod.ELeaderboardUploadScoreMethod.KeepBest & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with ELeaderboardUploadScoreMethod
  /* 0 */ val None: typingsJapgolly.steamClient.mod.ELeaderboardUploadScoreMethod.None & Double = js.native
}
