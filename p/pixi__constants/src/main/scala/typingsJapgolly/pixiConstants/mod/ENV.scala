package typingsJapgolly.pixiConstants.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ENV extends StObject
@JSImport("@pixi/constants", "ENV")
@js.native
object ENV extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ENV & Double] = js.native
  
  @js.native
  sealed trait WEBGL
    extends StObject
       with ENV
  /* 1 */ val WEBGL: typingsJapgolly.pixiConstants.mod.ENV.WEBGL & Double = js.native
  
  @js.native
  sealed trait WEBGL2
    extends StObject
       with ENV
  /* 2 */ val WEBGL2: typingsJapgolly.pixiConstants.mod.ENV.WEBGL2 & Double = js.native
  
  @js.native
  sealed trait WEBGL_LEGACY
    extends StObject
       with ENV
  /* 0 */ val WEBGL_LEGACY: typingsJapgolly.pixiConstants.mod.ENV.WEBGL_LEGACY & Double = js.native
}
