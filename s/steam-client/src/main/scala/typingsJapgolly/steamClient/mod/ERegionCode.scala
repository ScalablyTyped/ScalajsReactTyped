package typingsJapgolly.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ERegionCode extends StObject
@JSImport("steam-client", "ERegionCode")
@js.native
object ERegionCode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ERegionCode & Double] = js.native
  
  @js.native
  sealed trait Africa
    extends StObject
       with ERegionCode
  /* 0x07 */ val Africa: typingsJapgolly.steamClient.mod.ERegionCode.Africa & Double = js.native
  
  @js.native
  sealed trait Asia
    extends StObject
       with ERegionCode
  /* 0x04 */ val Asia: typingsJapgolly.steamClient.mod.ERegionCode.Asia & Double = js.native
  
  @js.native
  sealed trait Australia
    extends StObject
       with ERegionCode
  /* 0x05 */ val Australia: typingsJapgolly.steamClient.mod.ERegionCode.Australia & Double = js.native
  
  @js.native
  sealed trait Europe
    extends StObject
       with ERegionCode
  /* 0x03 */ val Europe: typingsJapgolly.steamClient.mod.ERegionCode.Europe & Double = js.native
  
  @js.native
  sealed trait MiddleEast
    extends StObject
       with ERegionCode
  /* 0x06 */ val MiddleEast: typingsJapgolly.steamClient.mod.ERegionCode.MiddleEast & Double = js.native
  
  @js.native
  sealed trait SouthAmerica
    extends StObject
       with ERegionCode
  /* 0x02 */ val SouthAmerica: typingsJapgolly.steamClient.mod.ERegionCode.SouthAmerica & Double = js.native
  
  @js.native
  sealed trait USEast
    extends StObject
       with ERegionCode
  /* 0x00 */ val USEast: typingsJapgolly.steamClient.mod.ERegionCode.USEast & Double = js.native
  
  @js.native
  sealed trait USWest
    extends StObject
       with ERegionCode
  /* 0x01 */ val USWest: typingsJapgolly.steamClient.mod.ERegionCode.USWest & Double = js.native
  
  @js.native
  sealed trait World
    extends StObject
       with ERegionCode
  /* 0xFF */ val World: typingsJapgolly.steamClient.mod.ERegionCode.World & Double = js.native
}
