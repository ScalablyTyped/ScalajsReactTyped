package typingsJapgolly.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EStreamInterface extends StObject
@JSImport("steam-user", "EStreamInterface")
@js.native
object EStreamInterface extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EStreamInterface & Double] = js.native
  
  @js.native
  sealed trait BigPicture
    extends StObject
       with EStreamInterface
  /* 2 */ val BigPicture: typingsJapgolly.steamUser.mod.EStreamInterface.BigPicture & Double = js.native
  
  @js.native
  sealed trait Default
    extends StObject
       with EStreamInterface
  /* 0 */ val Default: typingsJapgolly.steamUser.mod.EStreamInterface.Default & Double = js.native
  
  @js.native
  sealed trait Desktop
    extends StObject
       with EStreamInterface
  /* 3 */ val Desktop: typingsJapgolly.steamUser.mod.EStreamInterface.Desktop & Double = js.native
  
  @js.native
  sealed trait RecentGames
    extends StObject
       with EStreamInterface
  /* 1 */ val RecentGames: typingsJapgolly.steamUser.mod.EStreamInterface.RecentGames & Double = js.native
}
