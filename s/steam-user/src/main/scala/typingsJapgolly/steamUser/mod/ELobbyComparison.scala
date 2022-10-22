package typingsJapgolly.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ELobbyComparison extends StObject
@JSImport("steam-user", "ELobbyComparison")
@js.native
object ELobbyComparison extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ELobbyComparison & Double] = js.native
  
  @js.native
  sealed trait Equal
    extends StObject
       with ELobbyComparison
  /* 0 */ val Equal: typingsJapgolly.steamUser.mod.ELobbyComparison.Equal & Double = js.native
  
  @js.native
  sealed trait EqualToOrGreaterThan
    extends StObject
       with ELobbyComparison
  /* 2 */ val EqualToOrGreaterThan: typingsJapgolly.steamUser.mod.ELobbyComparison.EqualToOrGreaterThan & Double = js.native
  
  @js.native
  sealed trait EqualToOrLessThan
    extends StObject
       with ELobbyComparison
  /* -2 */ val EqualToOrLessThan: typingsJapgolly.steamUser.mod.ELobbyComparison.EqualToOrLessThan & Double = js.native
  
  @js.native
  sealed trait GreaterThan
    extends StObject
       with ELobbyComparison
  /* 1 */ val GreaterThan: typingsJapgolly.steamUser.mod.ELobbyComparison.GreaterThan & Double = js.native
  
  @js.native
  sealed trait LessThan
    extends StObject
       with ELobbyComparison
  /* -1 */ val LessThan: typingsJapgolly.steamUser.mod.ELobbyComparison.LessThan & Double = js.native
  
  @js.native
  sealed trait NotEqual
    extends StObject
       with ELobbyComparison
  /* 3 */ val NotEqual: typingsJapgolly.steamUser.mod.ELobbyComparison.NotEqual & Double = js.native
}
