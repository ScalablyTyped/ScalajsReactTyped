package typingsJapgolly.antvG2.libConstantMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LAYER extends StObject
@JSImport("@antv/g2/lib/constant", "LAYER")
@js.native
object LAYER extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[LAYER & String] = js.native
  
  /** 背景层 */
  @js.native
  sealed trait BG
    extends StObject
       with LAYER
  /* "bg" */ val BG: typingsJapgolly.antvG2.libConstantMod.LAYER.BG & String = js.native
  
  /** 前景层 */
  @js.native
  sealed trait FORE
    extends StObject
       with LAYER
  /* "fore" */ val FORE: typingsJapgolly.antvG2.libConstantMod.LAYER.FORE & String = js.native
  
  /** 中间层 */
  @js.native
  sealed trait MID
    extends StObject
       with LAYER
  /* "mid" */ val MID: typingsJapgolly.antvG2.libConstantMod.LAYER.MID & String = js.native
}
