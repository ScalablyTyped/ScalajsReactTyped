package typingsJapgolly.formatjsIntlUnifiedNumberformat.dataMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.formatjsIntlUnifiedNumberformat.RecordDecimalFormatNumSig
import typingsJapgolly.formatjsIntlUnifiedNumberformat.formatjsIntlUnifiedNumberformatStrings.compactLong
import typingsJapgolly.formatjsIntlUnifiedNumberformat.formatjsIntlUnifiedNumberformatStrings.compactShort
import typingsJapgolly.formatjsIntlUtils.numberTypesMod.DecimalFormatNum
import typingsJapgolly.formatjsIntlUtils.numberTypesMod.NotationPattern
import typingsJapgolly.formatjsIntlUtils.numberTypesMod.SignDisplayPattern
import typingsJapgolly.formatjsIntlUtils.numberTypesMod.SignPattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.formatjsIntlUtils.numberTypesMod.NotationPattern because var conflicts: compactLong, compactShort. Inlined scientific, standard */ trait CurrencySignDisplayPatterns
  extends NotationPatterns
     with SignDisplayPattern {
  var compactSignPattern: js.UndefOr[js.Any] = js.undefined
  var currency: js.Any
  var currencySign: js.UndefOr[js.Any] = js.undefined
  var currencySlotToken: js.Any
  var numberingSystem: js.Any
  var numbers: js.Any
  @JSName("scientific")
  var scientific_FCurrencySignDisplayPatterns: SignPattern
  var signDisplay: js.UndefOr[js.Any] = js.undefined
  var signPattern: js.UndefOr[js.Any] = js.undefined
  @JSName("standard")
  var standard_FCurrencySignDisplayPatterns: SignPattern
  @JSName("always")
  def always_MCurrencySignDisplayPatterns(): NotationPattern
  @JSName("auto")
  def auto_MCurrencySignDisplayPatterns(): NotationPattern
  @JSName("exceptZero")
  def exceptZero_MCurrencySignDisplayPatterns(): NotationPattern
  @JSName("never")
  def never_MCurrencySignDisplayPatterns(): NotationPattern
  def scientific(): SignPattern
  def standard(): SignPattern
}

object CurrencySignDisplayPatterns {
  @scala.inline
  def apply(
    `1000`: CallbackTo[SignPattern],
    `10000`: CallbackTo[SignPattern],
    `100000`: CallbackTo[SignPattern],
    `1000000`: CallbackTo[SignPattern],
    `10000000`: CallbackTo[SignPattern],
    `100000000`: CallbackTo[SignPattern],
    `1000000000`: CallbackTo[SignPattern],
    `10000000000`: CallbackTo[SignPattern],
    `100000000000`: CallbackTo[SignPattern],
    `1000000000000`: CallbackTo[SignPattern],
    `10000000000000`: CallbackTo[SignPattern],
    `100000000000000`: CallbackTo[SignPattern],
    always: CallbackTo[NotationPattern],
    auto: CallbackTo[NotationPattern],
    compactLong: CallbackTo[RecordDecimalFormatNumSig],
    compactShort: CallbackTo[RecordDecimalFormatNumSig],
    currency: js.Any,
    currencySlotToken: js.Any,
    exceptZero: CallbackTo[NotationPattern],
    never: CallbackTo[NotationPattern],
    numberingSystem: js.Any,
    numbers: js.Any,
    produceCompactSignPattern: DecimalFormatNum => CallbackTo[SignPattern],
    scientific: CallbackTo[SignPattern],
    standard: CallbackTo[SignPattern],
    compactSignPattern: js.Any = null,
    currencySign: js.Any = null,
    decimalNum: DecimalFormatNum = null,
    notation: compactShort | compactLong = null,
    signDisplay: js.Any = null,
    signPattern: js.Any = null
  ): CurrencySignDisplayPatterns = {
    val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], currencySlotToken = currencySlotToken.asInstanceOf[js.Any], numberingSystem = numberingSystem.asInstanceOf[js.Any], numbers = numbers.asInstanceOf[js.Any])
    __obj.updateDynamic("1000")(`1000`.toJsFn)
    __obj.updateDynamic("10000")(`10000`.toJsFn)
    __obj.updateDynamic("100000")(`100000`.toJsFn)
    __obj.updateDynamic("1000000")(`1000000`.toJsFn)
    __obj.updateDynamic("10000000")(`10000000`.toJsFn)
    __obj.updateDynamic("100000000")(`100000000`.toJsFn)
    __obj.updateDynamic("1000000000")(`1000000000`.toJsFn)
    __obj.updateDynamic("10000000000")(`10000000000`.toJsFn)
    __obj.updateDynamic("100000000000")(`100000000000`.toJsFn)
    __obj.updateDynamic("1000000000000")(`1000000000000`.toJsFn)
    __obj.updateDynamic("10000000000000")(`10000000000000`.toJsFn)
    __obj.updateDynamic("100000000000000")(`100000000000000`.toJsFn)
    __obj.updateDynamic("always")(always.toJsFn)
    __obj.updateDynamic("auto")(auto.toJsFn)
    __obj.updateDynamic("compactLong")(compactLong.toJsFn)
    __obj.updateDynamic("compactShort")(compactShort.toJsFn)
    __obj.updateDynamic("exceptZero")(exceptZero.toJsFn)
    __obj.updateDynamic("never")(never.toJsFn)
    __obj.updateDynamic("produceCompactSignPattern")(js.Any.fromFunction1((t0: typingsJapgolly.formatjsIntlUtils.numberTypesMod.DecimalFormatNum) => produceCompactSignPattern(t0).runNow()))
    __obj.updateDynamic("scientific")(scientific.toJsFn)
    __obj.updateDynamic("standard")(standard.toJsFn)
    if (compactSignPattern != null) __obj.updateDynamic("compactSignPattern")(compactSignPattern.asInstanceOf[js.Any])
    if (currencySign != null) __obj.updateDynamic("currencySign")(currencySign.asInstanceOf[js.Any])
    if (decimalNum != null) __obj.updateDynamic("decimalNum")(decimalNum.asInstanceOf[js.Any])
    if (notation != null) __obj.updateDynamic("notation")(notation.asInstanceOf[js.Any])
    if (signDisplay != null) __obj.updateDynamic("signDisplay")(signDisplay.asInstanceOf[js.Any])
    if (signPattern != null) __obj.updateDynamic("signPattern")(signPattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrencySignDisplayPatterns]
  }
}

