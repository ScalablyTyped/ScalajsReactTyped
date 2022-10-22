package typingsJapgolly.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EUCMFilePrivacyState extends StObject
@JSImport("steam-client", "EUCMFilePrivacyState")
@js.native
object EUCMFilePrivacyState extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EUCMFilePrivacyState & Double] = js.native
  
  @js.native
  sealed trait All
    extends StObject
       with EUCMFilePrivacyState
  /* 8 | 4 | 2 */ val All: typingsJapgolly.steamClient.mod.EUCMFilePrivacyState.All & Double = js.native
  
  @js.native
  sealed trait FriendsOnly
    extends StObject
       with EUCMFilePrivacyState
  /* 4 */ val FriendsOnly: typingsJapgolly.steamClient.mod.EUCMFilePrivacyState.FriendsOnly & Double = js.native
  
  @js.native
  sealed trait Invalid
    extends StObject
       with EUCMFilePrivacyState
  /* -1 */ val Invalid: typingsJapgolly.steamClient.mod.EUCMFilePrivacyState.Invalid & Double = js.native
  
  @js.native
  sealed trait Private
    extends StObject
       with EUCMFilePrivacyState
  /* 2 */ val Private: typingsJapgolly.steamClient.mod.EUCMFilePrivacyState.Private & Double = js.native
  
  @js.native
  sealed trait Public
    extends StObject
       with EUCMFilePrivacyState
  /* 8 */ val Public: typingsJapgolly.steamClient.mod.EUCMFilePrivacyState.Public & Double = js.native
}
