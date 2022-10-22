package typingsJapgolly.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FluidType extends StObject
@JSImport("mojang-minecraft", "FluidType")
@js.native
object FluidType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[FluidType & String] = js.native
  
  /**
    * Represents lava as a type of fluid.
    */
  @js.native
  sealed trait lava
    extends StObject
       with FluidType
  /* "lava" */ val lava: typingsJapgolly.mojangMinecraft.mod.FluidType.lava & String = js.native
  
  /**
    * Represents a potion as a type of fluid.
    */
  @js.native
  sealed trait potion
    extends StObject
       with FluidType
  /* "potion" */ val potion: typingsJapgolly.mojangMinecraft.mod.FluidType.potion & String = js.native
  
  /**
    * Represents powder snow as a type of fluid.
    */
  @js.native
  sealed trait powderSnow
    extends StObject
       with FluidType
  /* "powderSnow" */ val powderSnow: typingsJapgolly.mojangMinecraft.mod.FluidType.powderSnow & String = js.native
  
  /**
    * Represents water as a type of fluida.
    */
  @js.native
  sealed trait water
    extends StObject
       with FluidType
  /* "water" */ val water: typingsJapgolly.mojangMinecraft.mod.FluidType.water & String = js.native
}
