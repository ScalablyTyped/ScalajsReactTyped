package typingsJapgolly.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EUniverse extends StObject
@JSImport("steam-user", "EUniverse")
@js.native
object EUniverse extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EUniverse & Double] = js.native
  
  @js.native
  sealed trait Beta
    extends StObject
       with EUniverse
  /* 2 */ val Beta: typingsJapgolly.steamUser.mod.EUniverse.Beta & Double = js.native
  
  @js.native
  sealed trait Dev
    extends StObject
       with EUniverse
  /* 4 */ val Dev: typingsJapgolly.steamUser.mod.EUniverse.Dev & Double = js.native
  
  @js.native
  sealed trait Internal
    extends StObject
       with EUniverse
  /* 3 */ val Internal: typingsJapgolly.steamUser.mod.EUniverse.Internal & Double = js.native
  
  @js.native
  sealed trait Invalid
    extends StObject
       with EUniverse
  /* 0 */ val Invalid: typingsJapgolly.steamUser.mod.EUniverse.Invalid & Double = js.native
  
  @js.native
  sealed trait Public
    extends StObject
       with EUniverse
  /* 1 */ val Public: typingsJapgolly.steamUser.mod.EUniverse.Public & Double = js.native
}
