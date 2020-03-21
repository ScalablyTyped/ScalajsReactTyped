package typingsJapgolly.sugarCore.sugarjs

import typingsJapgolly.std.Intl.NumberFormatOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sugarjs.Number")
@js.native
object Number extends js.Object {
  @js.native
  trait ChainableBase[RawValue] extends js.Object {
    var raw: RawValue = js.native
    def toExponential(): SugarDefaultChainable[java.lang.String] = js.native
    def toExponential(fractionDigits: Double): SugarDefaultChainable[java.lang.String] = js.native
    def toFixed(): SugarDefaultChainable[java.lang.String] = js.native
    def toFixed(fractionDigits: Double): SugarDefaultChainable[java.lang.String] = js.native
    def toLocaleString(locales: java.lang.String): SugarDefaultChainable[java.lang.String] = js.native
    def toLocaleString(locales: java.lang.String, options: NumberFormatOptions): SugarDefaultChainable[java.lang.String] = js.native
    def toLocaleString(locales: js.Array[java.lang.String]): SugarDefaultChainable[java.lang.String] = js.native
    def toLocaleString(locales: js.Array[java.lang.String], options: NumberFormatOptions): SugarDefaultChainable[java.lang.String] = js.native
    def toPrecision(): SugarDefaultChainable[java.lang.String] = js.native
    def toPrecision(precision: Double): SugarDefaultChainable[java.lang.String] = js.native
  }
  
  type Chainable[RawValue] = ChainableBase[RawValue] with typingsJapgolly.sugarCore.sugarjs.Object.ChainableBase[RawValue]
}

