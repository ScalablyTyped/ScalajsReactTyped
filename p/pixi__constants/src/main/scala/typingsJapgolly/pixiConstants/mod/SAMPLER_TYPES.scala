package typingsJapgolly.pixiConstants.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SAMPLER_TYPES extends StObject
@JSImport("@pixi/constants", "SAMPLER_TYPES")
@js.native
object SAMPLER_TYPES extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SAMPLER_TYPES & Double] = js.native
  
  @js.native
  sealed trait FLOAT
    extends StObject
       with SAMPLER_TYPES
  /* 0 */ val FLOAT: typingsJapgolly.pixiConstants.mod.SAMPLER_TYPES.FLOAT & Double = js.native
  
  @js.native
  sealed trait INT
    extends StObject
       with SAMPLER_TYPES
  /* 1 */ val INT: typingsJapgolly.pixiConstants.mod.SAMPLER_TYPES.INT & Double = js.native
  
  @js.native
  sealed trait UINT
    extends StObject
       with SAMPLER_TYPES
  /* 2 */ val UINT: typingsJapgolly.pixiConstants.mod.SAMPLER_TYPES.UINT & Double = js.native
}
