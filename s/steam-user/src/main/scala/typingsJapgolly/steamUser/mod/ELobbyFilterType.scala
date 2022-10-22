package typingsJapgolly.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ELobbyFilterType extends StObject
@JSImport("steam-user", "ELobbyFilterType")
@js.native
object ELobbyFilterType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ELobbyFilterType & Double] = js.native
  
  @js.native
  sealed trait Distance
    extends StObject
       with ELobbyFilterType
  /* 4 */ val Distance: typingsJapgolly.steamUser.mod.ELobbyFilterType.Distance & Double = js.native
  
  @js.native
  sealed trait NearValue
    extends StObject
       with ELobbyFilterType
  /* 3 */ val NearValue: typingsJapgolly.steamUser.mod.ELobbyFilterType.NearValue & Double = js.native
  
  @js.native
  sealed trait Numerical
    extends StObject
       with ELobbyFilterType
  /* 1 */ val Numerical: typingsJapgolly.steamUser.mod.ELobbyFilterType.Numerical & Double = js.native
  
  @js.native
  sealed trait SlotsAvailable
    extends StObject
       with ELobbyFilterType
  /* 2 */ val SlotsAvailable: typingsJapgolly.steamUser.mod.ELobbyFilterType.SlotsAvailable & Double = js.native
  
  @js.native
  sealed trait String
    extends StObject
       with ELobbyFilterType
  /* 0 */ val String: typingsJapgolly.steamUser.mod.ELobbyFilterType.String & Double = js.native
}
