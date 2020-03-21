package typingsJapgolly.formatjsIntlUnifiedNumberformat.dataMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.formatjsIntlUtils.numberTypesMod.CurrencyPattern
import typingsJapgolly.formatjsIntlUtils.numberTypesMod.CurrencySignPattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CurrencyPatterns
  extends CurrencyPattern
     with CurrencySignPattern {
  var currencies: js.Any
  var currency: js.Any
  var currencySign: js.Any
  var currencySlotToken: js.UndefOr[js.Any] = js.undefined
  var numberingSystem: js.Any
  var numbers: js.Any
  var resolvedCurrency: js.UndefOr[js.Any] = js.undefined
  var signDisplayPatterns: js.UndefOr[js.Any] = js.undefined
  @JSName("accounting")
  def accounting_MCurrencyPatterns(): CurrencySignDisplayPatterns
  @JSName("code")
  def code_MCurrencyPatterns(): this.type
  @JSName("name")
  def name_MCurrencyPatterns(): this.type
  @JSName("narrowSymbol")
  def narrowSymbol_MCurrencyPatterns(): this.type
  @JSName("standard")
  def standard_MCurrencyPatterns(): CurrencySignDisplayPatterns
  @JSName("symbol")
  def symbol_MCurrencyPatterns(): this.type
}

object CurrencyPatterns {
  @scala.inline
  def apply(
    accounting: CallbackTo[CurrencySignDisplayPatterns],
    code: CallbackTo[CurrencyPatterns],
    currencies: js.Any,
    currency: js.Any,
    currencySign: js.Any,
    name: CallbackTo[CurrencyPatterns],
    narrowSymbol: CallbackTo[CurrencyPatterns],
    numberingSystem: js.Any,
    numbers: js.Any,
    standard: CallbackTo[CurrencySignDisplayPatterns],
    symbol: CallbackTo[CurrencyPatterns],
    currencySlotToken: js.Any = null,
    resolvedCurrency: js.Any = null,
    signDisplayPatterns: js.Any = null
  ): CurrencyPatterns = {
    val __obj = js.Dynamic.literal(currencies = currencies.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], currencySign = currencySign.asInstanceOf[js.Any], numberingSystem = numberingSystem.asInstanceOf[js.Any], numbers = numbers.asInstanceOf[js.Any])
    __obj.updateDynamic("accounting")(accounting.toJsFn)
    __obj.updateDynamic("code")(code.toJsFn)
    __obj.updateDynamic("name")(name.toJsFn)
    __obj.updateDynamic("narrowSymbol")(narrowSymbol.toJsFn)
    __obj.updateDynamic("standard")(standard.toJsFn)
    __obj.updateDynamic("symbol")(symbol.toJsFn)
    if (currencySlotToken != null) __obj.updateDynamic("currencySlotToken")(currencySlotToken.asInstanceOf[js.Any])
    if (resolvedCurrency != null) __obj.updateDynamic("resolvedCurrency")(resolvedCurrency.asInstanceOf[js.Any])
    if (signDisplayPatterns != null) __obj.updateDynamic("signDisplayPatterns")(signDisplayPatterns.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrencyPatterns]
  }
}

