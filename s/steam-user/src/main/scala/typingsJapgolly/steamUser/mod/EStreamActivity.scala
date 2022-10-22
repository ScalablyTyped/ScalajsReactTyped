package typingsJapgolly.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EStreamActivity extends StObject
@JSImport("steam-user", "EStreamActivity")
@js.native
object EStreamActivity extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EStreamActivity & Double] = js.native
  
  @js.native
  sealed trait Desktop
    extends StObject
       with EStreamActivity
  /* 3 */ val Desktop: typingsJapgolly.steamUser.mod.EStreamActivity.Desktop & Double = js.native
  
  @js.native
  sealed trait Game
    extends StObject
       with EStreamActivity
  /* 2 */ val Game: typingsJapgolly.steamUser.mod.EStreamActivity.Game & Double = js.native
  
  @js.native
  sealed trait Idle
    extends StObject
       with EStreamActivity
  /* 1 */ val Idle: typingsJapgolly.steamUser.mod.EStreamActivity.Idle & Double = js.native
  
  @js.native
  sealed trait SecureDesktop
    extends StObject
       with EStreamActivity
  /* 4 */ val SecureDesktop: typingsJapgolly.steamUser.mod.EStreamActivity.SecureDesktop & Double = js.native
}
