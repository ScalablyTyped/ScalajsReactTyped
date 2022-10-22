package typingsJapgolly.pixiConstants.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MSAA_QUALITY extends StObject
@JSImport("@pixi/constants", "MSAA_QUALITY")
@js.native
object MSAA_QUALITY extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MSAA_QUALITY & Double] = js.native
  
  @js.native
  sealed trait HIGH
    extends StObject
       with MSAA_QUALITY
  /* 8 */ val HIGH: typingsJapgolly.pixiConstants.mod.MSAA_QUALITY.HIGH & Double = js.native
  
  @js.native
  sealed trait LOW
    extends StObject
       with MSAA_QUALITY
  /* 2 */ val LOW: typingsJapgolly.pixiConstants.mod.MSAA_QUALITY.LOW & Double = js.native
  
  @js.native
  sealed trait MEDIUM
    extends StObject
       with MSAA_QUALITY
  /* 4 */ val MEDIUM: typingsJapgolly.pixiConstants.mod.MSAA_QUALITY.MEDIUM & Double = js.native
  
  @js.native
  sealed trait NONE
    extends StObject
       with MSAA_QUALITY
  /* 0 */ val NONE: typingsJapgolly.pixiConstants.mod.MSAA_QUALITY.NONE & Double = js.native
}
