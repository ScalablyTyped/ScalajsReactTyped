package typingsJapgolly.formatjsIntlUnifiedNumberformat.dataMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.formatjsIntlUnifiedNumberformat.RecordDecimalFormatNumSig
import typingsJapgolly.formatjsIntlUnifiedNumberformat.formatjsIntlUnifiedNumberformatStrings.compactLong
import typingsJapgolly.formatjsIntlUnifiedNumberformat.formatjsIntlUnifiedNumberformatStrings.compactShort
import typingsJapgolly.formatjsIntlUtils.numberTypesMod.CompactSignPattern
import typingsJapgolly.formatjsIntlUtils.numberTypesMod.DecimalFormatNum
import typingsJapgolly.formatjsIntlUtils.numberTypesMod.NotationPattern
import typingsJapgolly.formatjsIntlUtils.numberTypesMod.RawNumberData
import typingsJapgolly.formatjsIntlUtils.numberTypesMod.SignDisplayPattern
import typingsJapgolly.formatjsIntlUtils.numberTypesMod.SignPattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.formatjsIntlUtils.numberTypesMod.NotationPattern because var conflicts: compactLong, compactShort. Inlined scientific, standard */ trait DecimalPatterns
  extends NotationPatterns
     with SignDisplayPattern {
  var compactSignPattern: js.UndefOr[CompactSignPattern] = js.undefined
  var numberingSystem: String
  var numbers: RawNumberData
  @JSName("scientific")
  var scientific_FDecimalPatterns: SignPattern
  var signDisplay: js.UndefOr[String] = js.undefined
  var signPattern: js.UndefOr[SignPattern] = js.undefined
  @JSName("standard")
  var standard_FDecimalPatterns: SignPattern
  @JSName("always")
  def always_MDecimalPatterns(): NotationPattern
  @JSName("auto")
  def auto_MDecimalPatterns(): NotationPattern
  @JSName("exceptZero")
  def exceptZero_MDecimalPatterns(): NotationPattern
  @JSName("never")
  def never_MDecimalPatterns(): NotationPattern
  def scientific(): SignPattern
  def standard(): SignPattern
}

object DecimalPatterns {
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
    exceptZero: CallbackTo[NotationPattern],
    never: CallbackTo[NotationPattern],
    numberingSystem: String,
    numbers: RawNumberData,
    produceCompactSignPattern: DecimalFormatNum => CallbackTo[SignPattern],
    scientific: CallbackTo[SignPattern],
    standard: CallbackTo[SignPattern],
    compactSignPattern: CompactSignPattern = null,
    decimalNum: DecimalFormatNum = null,
    notation: compactShort | compactLong = null,
    signDisplay: String = null,
    signPattern: SignPattern = null
  ): DecimalPatterns = {
    val __obj = js.Dynamic.literal(numberingSystem = numberingSystem.asInstanceOf[js.Any], numbers = numbers.asInstanceOf[js.Any])
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
    if (decimalNum != null) __obj.updateDynamic("decimalNum")(decimalNum.asInstanceOf[js.Any])
    if (notation != null) __obj.updateDynamic("notation")(notation.asInstanceOf[js.Any])
    if (signDisplay != null) __obj.updateDynamic("signDisplay")(signDisplay.asInstanceOf[js.Any])
    if (signPattern != null) __obj.updateDynamic("signPattern")(signPattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecimalPatterns]
  }
}

