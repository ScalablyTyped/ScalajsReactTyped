package typingsJapgolly.pixiConstants.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BUFFER_TYPE extends StObject
@JSImport("@pixi/constants", "BUFFER_TYPE")
@js.native
object BUFFER_TYPE extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BUFFER_TYPE & Double] = js.native
  
  @js.native
  sealed trait ARRAY_BUFFER
    extends StObject
       with BUFFER_TYPE
  /* 34962 */ val ARRAY_BUFFER: typingsJapgolly.pixiConstants.mod.BUFFER_TYPE.ARRAY_BUFFER & Double = js.native
  
  @js.native
  sealed trait ELEMENT_ARRAY_BUFFER
    extends StObject
       with BUFFER_TYPE
  /* 34963 */ val ELEMENT_ARRAY_BUFFER: typingsJapgolly.pixiConstants.mod.BUFFER_TYPE.ELEMENT_ARRAY_BUFFER & Double = js.native
  
  @js.native
  sealed trait UNIFORM_BUFFER
    extends StObject
       with BUFFER_TYPE
  /* 35345 */ val UNIFORM_BUFFER: typingsJapgolly.pixiConstants.mod.BUFFER_TYPE.UNIFORM_BUFFER & Double = js.native
}
