package typingsJapgolly.bitwise

import typingsJapgolly.bitwise.typesMod.Bits
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bitsXnorMod {
  
  @JSImport("bitwise/bits/xnor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(bits1: Bits, bits2: Bits): Bits = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(bits1.asInstanceOf[js.Any], bits2.asInstanceOf[js.Any])).asInstanceOf[Bits]
}
