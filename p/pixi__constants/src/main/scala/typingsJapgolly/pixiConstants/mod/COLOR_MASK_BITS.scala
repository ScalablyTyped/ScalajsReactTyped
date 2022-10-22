package typingsJapgolly.pixiConstants.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait COLOR_MASK_BITS extends StObject
@JSImport("@pixi/constants", "COLOR_MASK_BITS")
@js.native
object COLOR_MASK_BITS extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[COLOR_MASK_BITS & Double] = js.native
  
  @js.native
  sealed trait ALPHA
    extends StObject
       with COLOR_MASK_BITS
  /* 8 */ val ALPHA: typingsJapgolly.pixiConstants.mod.COLOR_MASK_BITS.ALPHA & Double = js.native
  
  @js.native
  sealed trait BLUE
    extends StObject
       with COLOR_MASK_BITS
  /* 4 */ val BLUE: typingsJapgolly.pixiConstants.mod.COLOR_MASK_BITS.BLUE & Double = js.native
  
  @js.native
  sealed trait GREEN
    extends StObject
       with COLOR_MASK_BITS
  /* 2 */ val GREEN: typingsJapgolly.pixiConstants.mod.COLOR_MASK_BITS.GREEN & Double = js.native
  
  @js.native
  sealed trait RED
    extends StObject
       with COLOR_MASK_BITS
  /* 1 */ val RED: typingsJapgolly.pixiConstants.mod.COLOR_MASK_BITS.RED & Double = js.native
}
