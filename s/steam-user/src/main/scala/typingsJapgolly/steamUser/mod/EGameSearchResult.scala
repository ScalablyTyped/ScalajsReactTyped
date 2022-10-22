package typingsJapgolly.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EGameSearchResult extends StObject
@JSImport("steam-user", "EGameSearchResult")
@js.native
object EGameSearchResult extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EGameSearchResult & Double] = js.native
  
  @js.native
  sealed trait Invalid
    extends StObject
       with EGameSearchResult
  /* 0 */ val Invalid: typingsJapgolly.steamUser.mod.EGameSearchResult.Invalid & Double = js.native
  
  @js.native
  sealed trait SearchCanceled
    extends StObject
       with EGameSearchResult
  /* 6 */ val SearchCanceled: typingsJapgolly.steamUser.mod.EGameSearchResult.SearchCanceled & Double = js.native
  
  @js.native
  sealed trait SearchCompleteAccepted
    extends StObject
       with EGameSearchResult
  /* 4 */ val SearchCompleteAccepted: typingsJapgolly.steamUser.mod.EGameSearchResult.SearchCompleteAccepted & Double = js.native
  
  @js.native
  sealed trait SearchCompleteDeclined
    extends StObject
       with EGameSearchResult
  /* 5 */ val SearchCompleteDeclined: typingsJapgolly.steamUser.mod.EGameSearchResult.SearchCompleteDeclined & Double = js.native
  
  @js.native
  sealed trait SearchFailedNoHosts
    extends StObject
       with EGameSearchResult
  /* 2 */ val SearchFailedNoHosts: typingsJapgolly.steamUser.mod.EGameSearchResult.SearchFailedNoHosts & Double = js.native
  
  @js.native
  sealed trait SearchGameFound
    extends StObject
       with EGameSearchResult
  /* 3 */ val SearchGameFound: typingsJapgolly.steamUser.mod.EGameSearchResult.SearchGameFound & Double = js.native
  
  @js.native
  sealed trait SearchInProgress
    extends StObject
       with EGameSearchResult
  /* 1 */ val SearchInProgress: typingsJapgolly.steamUser.mod.EGameSearchResult.SearchInProgress & Double = js.native
}
