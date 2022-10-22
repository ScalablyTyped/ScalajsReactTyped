package typingsJapgolly.bitwise

import typingsJapgolly.bitwise.esmTypesMod.Bits
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmBitsNandMod {
  
  @JSImport("bitwise/esm/bits/nand", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(bits1: Bits, bits2: Bits): Bits = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(bits1.asInstanceOf[js.Any], bits2.asInstanceOf[js.Any])).asInstanceOf[Bits]
}
