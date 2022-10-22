package typingsJapgolly.bitwise

import typingsJapgolly.bitwise.esmTypesMod.Bit
import typingsJapgolly.bitwise.esmTypesMod.Bits
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmBitsReduceOrMod {
  
  @JSImport("bitwise/esm/bits/reduce-or", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(bits: Bits): Bit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(bits.asInstanceOf[js.Any]).asInstanceOf[Bit]
}
