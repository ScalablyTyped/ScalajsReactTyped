package typingsJapgolly.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EMMSLobbyStatus extends StObject
@JSImport("steam-user", "EMMSLobbyStatus")
@js.native
object EMMSLobbyStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EMMSLobbyStatus & Double] = js.native
  
  @js.native
  sealed trait DoesNotExist
    extends StObject
       with EMMSLobbyStatus
  /* 2 */ val DoesNotExist: typingsJapgolly.steamUser.mod.EMMSLobbyStatus.DoesNotExist & Double = js.native
  
  @js.native
  sealed trait Exists
    extends StObject
       with EMMSLobbyStatus
  /* 1 */ val Exists: typingsJapgolly.steamUser.mod.EMMSLobbyStatus.Exists & Double = js.native
  
  @js.native
  sealed trait Invalid
    extends StObject
       with EMMSLobbyStatus
  /* 0 */ val Invalid: typingsJapgolly.steamUser.mod.EMMSLobbyStatus.Invalid & Double = js.native
  
  @js.native
  sealed trait NotAMember
    extends StObject
       with EMMSLobbyStatus
  /* 3 */ val NotAMember: typingsJapgolly.steamUser.mod.EMMSLobbyStatus.NotAMember & Double = js.native
}
