package typingsJapgolly.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ELauncherType extends StObject
@JSImport("steam-user", "ELauncherType")
@js.native
object ELauncherType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ELauncherType & Double] = js.native
  
  @js.native
  sealed trait CSGO
    extends StObject
       with ELauncherType
  /* 4 */ val CSGO: typingsJapgolly.steamUser.mod.ELauncherType.CSGO & Double = js.native
  
  @js.native
  sealed trait ClientUI
    extends StObject
       with ELauncherType
  /* 5 */ val ClientUI: typingsJapgolly.steamUser.mod.ELauncherType.ClientUI & Double = js.native
  
  @js.native
  sealed trait CmdLine
    extends StObject
       with ELauncherType
  /* 3 */ val CmdLine: typingsJapgolly.steamUser.mod.ELauncherType.CmdLine & Double = js.native
  
  @js.native
  sealed trait Default
    extends StObject
       with ELauncherType
  /* 0 */ val Default: typingsJapgolly.steamUser.mod.ELauncherType.Default & Double = js.native
  
  @js.native
  sealed trait Headless
    extends StObject
       with ELauncherType
  /* 6 */ val Headless: typingsJapgolly.steamUser.mod.ELauncherType.Headless & Double = js.native
  
  @js.native
  sealed trait Nexon
    extends StObject
       with ELauncherType
  /* 2 */ val Nexon: typingsJapgolly.steamUser.mod.ELauncherType.Nexon & Double = js.native
  
  @js.native
  sealed trait PerfectWorld
    extends StObject
       with ELauncherType
  /* 1 */ val PerfectWorld: typingsJapgolly.steamUser.mod.ELauncherType.PerfectWorld & Double = js.native
  
  @js.native
  sealed trait SingleApp
    extends StObject
       with ELauncherType
  /* 8 */ val SingleApp: typingsJapgolly.steamUser.mod.ELauncherType.SingleApp & Double = js.native
  
  @js.native
  sealed trait SteamChina
    extends StObject
       with ELauncherType
  /* 7 */ val SteamChina: typingsJapgolly.steamUser.mod.ELauncherType.SteamChina & Double = js.native
}
