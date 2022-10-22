package typingsJapgolly.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EUCMFilePrivacyState extends StObject
@JSImport("steam-user", "EUCMFilePrivacyState")
@js.native
object EUCMFilePrivacyState extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EUCMFilePrivacyState & Double] = js.native
  
  @js.native
  sealed trait FriendsOnly
    extends StObject
       with EUCMFilePrivacyState
  /* 4 */ val FriendsOnly: typingsJapgolly.steamUser.mod.EUCMFilePrivacyState.FriendsOnly & Double = js.native
  
  @js.native
  sealed trait Invalid
    extends StObject
       with EUCMFilePrivacyState
  /* -1 */ val Invalid: typingsJapgolly.steamUser.mod.EUCMFilePrivacyState.Invalid & Double = js.native
  
  @js.native
  sealed trait Private
    extends StObject
       with EUCMFilePrivacyState
  /* 2 */ val Private: typingsJapgolly.steamUser.mod.EUCMFilePrivacyState.Private & Double = js.native
  
  @js.native
  sealed trait Public
    extends StObject
       with EUCMFilePrivacyState
  /* 8 */ val Public: typingsJapgolly.steamUser.mod.EUCMFilePrivacyState.Public & Double = js.native
}
