package typingsJapgolly.pixiConstants.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RENDERER_TYPE extends StObject
@JSImport("@pixi/constants", "RENDERER_TYPE")
@js.native
object RENDERER_TYPE extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RENDERER_TYPE & Double] = js.native
  
  @js.native
  sealed trait CANVAS
    extends StObject
       with RENDERER_TYPE
  /* 2 */ val CANVAS: typingsJapgolly.pixiConstants.mod.RENDERER_TYPE.CANVAS & Double = js.native
  
  @js.native
  sealed trait UNKNOWN
    extends StObject
       with RENDERER_TYPE
  /* 0 */ val UNKNOWN: typingsJapgolly.pixiConstants.mod.RENDERER_TYPE.UNKNOWN & Double = js.native
  
  @js.native
  sealed trait WEBGL
    extends StObject
       with RENDERER_TYPE
  /* 1 */ val WEBGL: typingsJapgolly.pixiConstants.mod.RENDERER_TYPE.WEBGL & Double = js.native
}
