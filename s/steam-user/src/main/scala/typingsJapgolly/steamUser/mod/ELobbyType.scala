package typingsJapgolly.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ELobbyType extends StObject
@JSImport("steam-user", "ELobbyType")
@js.native
object ELobbyType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ELobbyType & Double] = js.native
  
  @js.native
  sealed trait FriendsOnly
    extends StObject
       with ELobbyType
  /* 1 */ val FriendsOnly: typingsJapgolly.steamUser.mod.ELobbyType.FriendsOnly & Double = js.native
  
  @js.native
  sealed trait Invisible
    extends StObject
       with ELobbyType
  /* 3 */ val Invisible: typingsJapgolly.steamUser.mod.ELobbyType.Invisible & Double = js.native
  
  @js.native
  sealed trait Private
    extends StObject
       with ELobbyType
  /* 0 */ val Private: typingsJapgolly.steamUser.mod.ELobbyType.Private & Double = js.native
  
  @js.native
  sealed trait PrivateUnique
    extends StObject
       with ELobbyType
  /* 4 */ val PrivateUnique: typingsJapgolly.steamUser.mod.ELobbyType.PrivateUnique & Double = js.native
  
  @js.native
  sealed trait Public
    extends StObject
       with ELobbyType
  /* 2 */ val Public: typingsJapgolly.steamUser.mod.ELobbyType.Public & Double = js.native
}
