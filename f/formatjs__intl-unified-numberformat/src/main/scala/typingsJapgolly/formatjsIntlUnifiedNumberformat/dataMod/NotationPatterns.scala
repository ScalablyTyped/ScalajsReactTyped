package typingsJapgolly.formatjsIntlUnifiedNumberformat.dataMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.formatjsIntlUnifiedNumberformat.RecordDecimalFormatNumSig
import typingsJapgolly.formatjsIntlUnifiedNumberformat.formatjsIntlUnifiedNumberformatStrings.compactLong
import typingsJapgolly.formatjsIntlUnifiedNumberformat.formatjsIntlUnifiedNumberformatStrings.compactShort
import typingsJapgolly.formatjsIntlUtils.numberTypesMod.CompactSignPattern
import typingsJapgolly.formatjsIntlUtils.numberTypesMod.DecimalFormatNum
import typingsJapgolly.formatjsIntlUtils.numberTypesMod.SignPattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotationPatterns extends CompactSignPattern {
  var decimalNum: js.UndefOr[DecimalFormatNum] = js.undefined
  var notation: js.UndefOr[compactShort | compactLong] = js.undefined
  @JSName("100000000000000")
  def `100000000000000_MNotationPatterns`(): SignPattern
  @JSName("10000000000000")
  def `10000000000000_MNotationPatterns`(): SignPattern
  @JSName("1000000000000")
  def `1000000000000_MNotationPatterns`(): SignPattern
  @JSName("100000000000")
  def `100000000000_MNotationPatterns`(): SignPattern
  @JSName("10000000000")
  def `10000000000_MNotationPatterns`(): SignPattern
  @JSName("1000000000")
  def `1000000000_MNotationPatterns`(): SignPattern
  @JSName("100000000")
  def `100000000_MNotationPatterns`(): SignPattern
  @JSName("10000000")
  def `10000000_MNotationPatterns`(): SignPattern
  @JSName("1000000")
  def `1000000_MNotationPatterns`(): SignPattern
  @JSName("100000")
  def `100000_MNotationPatterns`(): SignPattern
  @JSName("10000")
  def `10000_MNotationPatterns`(): SignPattern
  @JSName("1000")
  def `1000_MNotationPatterns`(): SignPattern
  def compactLong(): RecordDecimalFormatNumSig
  def compactShort(): RecordDecimalFormatNumSig
  def produceCompactSignPattern(decimalNum: DecimalFormatNum): SignPattern
}

object NotationPatterns {
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
    compactLong: CallbackTo[RecordDecimalFormatNumSig],
    compactShort: CallbackTo[RecordDecimalFormatNumSig],
    produceCompactSignPattern: DecimalFormatNum => CallbackTo[SignPattern],
    decimalNum: DecimalFormatNum = null,
    notation: compactShort | compactLong = null
  ): NotationPatterns = {
    val __obj = js.Dynamic.literal()
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
    __obj.updateDynamic("compactLong")(compactLong.toJsFn)
    __obj.updateDynamic("compactShort")(compactShort.toJsFn)
    __obj.updateDynamic("produceCompactSignPattern")(js.Any.fromFunction1((t0: typingsJapgolly.formatjsIntlUtils.numberTypesMod.DecimalFormatNum) => produceCompactSignPattern(t0).runNow()))
    if (decimalNum != null) __obj.updateDynamic("decimalNum")(decimalNum.asInstanceOf[js.Any])
    if (notation != null) __obj.updateDynamic("notation")(notation.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotationPatterns]
  }
}

