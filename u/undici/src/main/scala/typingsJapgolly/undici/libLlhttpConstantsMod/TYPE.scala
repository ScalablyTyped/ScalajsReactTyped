package typingsJapgolly.undici.libLlhttpConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TYPE extends StObject
@JSImport("undici/lib/llhttp/constants", "TYPE")
@js.native
object TYPE extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TYPE & Double] = js.native
  
  @js.native
  sealed trait BOTH
    extends StObject
       with TYPE
  /* 0 */ val BOTH: typingsJapgolly.undici.libLlhttpConstantsMod.TYPE.BOTH & Double = js.native
  
  @js.native
  sealed trait REQUEST
    extends StObject
       with TYPE
  /* 1 */ val REQUEST: typingsJapgolly.undici.libLlhttpConstantsMod.TYPE.REQUEST & Double = js.native
  
  @js.native
  sealed trait RESPONSE
    extends StObject
       with TYPE
  /* 2 */ val RESPONSE: typingsJapgolly.undici.libLlhttpConstantsMod.TYPE.RESPONSE & Double = js.native
}
