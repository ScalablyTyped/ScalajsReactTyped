package typingsJapgolly.formatjsIntlUtils.polyfillUtilsMod

import typingsJapgolly.formatjsIntlUtils.numberTypesMod.NumberFormatDigitInternalSlots
import typingsJapgolly.formatjsIntlUtils.numberTypesMod.NumberFormatDigitOptions
import typingsJapgolly.std.WeakMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@formatjs/intl-utils/dist/polyfill-utils", "setNumberFormatDigitOptions")
@js.native
object setNumberFormatDigitOptions extends js.Object {
  def apply[TObject /* <: js.Object */, TInternalSlots /* <: NumberFormatDigitInternalSlots */](
    internalSlotMap: WeakMap[TObject, TInternalSlots],
    intlObj: TObject,
    opts: NumberFormatDigitOptions,
    mnfdDefault: Double,
    mxfdDefault: Double
  ): Unit = js.native
}

