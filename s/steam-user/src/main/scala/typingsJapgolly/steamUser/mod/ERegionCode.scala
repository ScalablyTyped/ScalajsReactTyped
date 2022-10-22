package typingsJapgolly.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ERegionCode extends StObject
@JSImport("steam-user", "ERegionCode")
@js.native
object ERegionCode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ERegionCode & Double] = js.native
  
  @js.native
  sealed trait Africa
    extends StObject
       with ERegionCode
  /* 7 */ val Africa: typingsJapgolly.steamUser.mod.ERegionCode.Africa & Double = js.native
  
  @js.native
  sealed trait Asia
    extends StObject
       with ERegionCode
  /* 4 */ val Asia: typingsJapgolly.steamUser.mod.ERegionCode.Asia & Double = js.native
  
  @js.native
  sealed trait Australia
    extends StObject
       with ERegionCode
  /* 5 */ val Australia: typingsJapgolly.steamUser.mod.ERegionCode.Australia & Double = js.native
  
  @js.native
  sealed trait Europe
    extends StObject
       with ERegionCode
  /* 3 */ val Europe: typingsJapgolly.steamUser.mod.ERegionCode.Europe & Double = js.native
  
  @js.native
  sealed trait MiddleEast
    extends StObject
       with ERegionCode
  /* 6 */ val MiddleEast: typingsJapgolly.steamUser.mod.ERegionCode.MiddleEast & Double = js.native
  
  @js.native
  sealed trait SouthAmerica
    extends StObject
       with ERegionCode
  /* 2 */ val SouthAmerica: typingsJapgolly.steamUser.mod.ERegionCode.SouthAmerica & Double = js.native
  
  @js.native
  sealed trait USEast
    extends StObject
       with ERegionCode
  /* 0 */ val USEast: typingsJapgolly.steamUser.mod.ERegionCode.USEast & Double = js.native
  
  @js.native
  sealed trait USWest
    extends StObject
       with ERegionCode
  /* 1 */ val USWest: typingsJapgolly.steamUser.mod.ERegionCode.USWest & Double = js.native
  
  @js.native
  sealed trait World
    extends StObject
       with ERegionCode
  /* 255 */ val World: typingsJapgolly.steamUser.mod.ERegionCode.World & Double = js.native
}
