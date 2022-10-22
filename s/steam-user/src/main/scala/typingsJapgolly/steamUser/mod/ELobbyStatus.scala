package typingsJapgolly.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ELobbyStatus extends StObject
@JSImport("steam-user", "ELobbyStatus")
@js.native
object ELobbyStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ELobbyStatus & Double] = js.native
  
  @js.native
  sealed trait DoesNotExist
    extends StObject
       with ELobbyStatus
  /* 2 */ val DoesNotExist: typingsJapgolly.steamUser.mod.ELobbyStatus.DoesNotExist & Double = js.native
  
  @js.native
  sealed trait Exists
    extends StObject
       with ELobbyStatus
  /* 1 */ val Exists: typingsJapgolly.steamUser.mod.ELobbyStatus.Exists & Double = js.native
  
  @js.native
  sealed trait Invalid
    extends StObject
       with ELobbyStatus
  /* 0 */ val Invalid: typingsJapgolly.steamUser.mod.ELobbyStatus.Invalid & Double = js.native
  
  @js.native
  sealed trait NotAMember
    extends StObject
       with ELobbyStatus
  /* 3 */ val NotAMember: typingsJapgolly.steamUser.mod.ELobbyStatus.NotAMember & Double = js.native
}
