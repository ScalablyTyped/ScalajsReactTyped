package typingsJapgolly.crc

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.crc.mjsTypesMod.CRCCalculator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object calculatorsCrc16xmodemMod extends Shortcut {
  
  @JSImport("crc/calculators/crc16xmodem", JSImport.Default)
  @js.native
  val default: CRCCalculator[js.typedarray.Uint8Array] = js.native
  
  type _To = CRCCalculator[js.typedarray.Uint8Array]
  
  /* This means you don't have to write `default`, but can instead just say `calculatorsCrc16xmodemMod.foo` */
  override def _to: CRCCalculator[js.typedarray.Uint8Array] = default
}
