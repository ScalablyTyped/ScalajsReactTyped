package typingsJapgolly.bitwise

import typingsJapgolly.bitwise.typesMod.Bit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object integerGetBitMod {
  
  @JSImport("bitwise/integer/get-bit", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(int32: Double, position: Double): Bit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(int32.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Bit]
}
