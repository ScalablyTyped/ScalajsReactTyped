package typingsJapgolly.filesize.mod.Filesize

import typingsJapgolly.filesize.filesizeStrings.`object`
import typingsJapgolly.filesize.filesizeStrings.array
import typingsJapgolly.filesize.filesizeStrings.exponent
import typingsJapgolly.filesize.filesizeStrings.iec
import typingsJapgolly.filesize.filesizeStrings.jedec
import typingsJapgolly.filesize.filesizeStrings.string
import typingsJapgolly.std.Intl.NumberFormatOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Number base, default is 2
    */
  var base: js.UndefOr[Double] = js.undefined
  /**
    * Enables bit sizes, default is false
    */
  var bits: js.UndefOr[Boolean] = js.undefined
  /**
    * Specifies the SI suffix via exponent, e.g. 2 is MB for bytes, default is -1
    */
  var exponent: js.UndefOr[Double] = js.undefined
  /**
    * Enables full form of unit of measure, default is false
    */
  var fullform: js.UndefOr[Boolean] = js.undefined
  /**
    * Array of full form overrides, default is []
    */
  var fullforms: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * BCP 47 language tag to specify a locale, or true to use default locale, default is ""
    */
  var locale: js.UndefOr[String | Boolean] = js.undefined
  /**
    * ECMA-402 number format option overrides, default is "{}"
    */
  var localeOptions: js.UndefOr[NumberFormatOptions] = js.undefined
  /**
    * Output of function (array, exponent, object, or string), default is string
    */
  var output: js.UndefOr[array | exponent | `object` | string] = js.undefined
  /**
    * Decimal place, default is 2
    */
  var round: js.UndefOr[Double] = js.undefined
  /**
    * Decimal separator character, default is `.`
    */
  var separator: js.UndefOr[String] = js.undefined
  /**
    * Character between the result and suffix, default is ` `
    */
  var spacer: js.UndefOr[String] = js.undefined
  /**
    * Standard unit of measure, can be iec or jedec, default is jedec; can be overruled by base
    */
  var standard: js.UndefOr[iec | jedec] = js.undefined
  /**
    * Dictionary of SI/JEDEC symbols to replace for localization, defaults to english if no match is found
    */
  var symbols: js.UndefOr[SiJedec] = js.undefined
  /**
    *  Enables unix style human readable output, e.g ls -lh, default is false
    */
  var unix: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    base: Int | Double = null,
    bits: js.UndefOr[Boolean] = js.undefined,
    exponent: Int | Double = null,
    fullform: js.UndefOr[Boolean] = js.undefined,
    fullforms: js.Array[String] = null,
    locale: String | Boolean = null,
    localeOptions: NumberFormatOptions = null,
    output: array | exponent | `object` | string = null,
    round: Int | Double = null,
    separator: String = null,
    spacer: String = null,
    standard: iec | jedec = null,
    symbols: SiJedec = null,
    unix: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (base != null) __obj.updateDynamic("base")(base.asInstanceOf[js.Any])
    if (!js.isUndefined(bits)) __obj.updateDynamic("bits")(bits.asInstanceOf[js.Any])
    if (exponent != null) __obj.updateDynamic("exponent")(exponent.asInstanceOf[js.Any])
    if (!js.isUndefined(fullform)) __obj.updateDynamic("fullform")(fullform.asInstanceOf[js.Any])
    if (fullforms != null) __obj.updateDynamic("fullforms")(fullforms.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (localeOptions != null) __obj.updateDynamic("localeOptions")(localeOptions.asInstanceOf[js.Any])
    if (output != null) __obj.updateDynamic("output")(output.asInstanceOf[js.Any])
    if (round != null) __obj.updateDynamic("round")(round.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    if (spacer != null) __obj.updateDynamic("spacer")(spacer.asInstanceOf[js.Any])
    if (standard != null) __obj.updateDynamic("standard")(standard.asInstanceOf[js.Any])
    if (symbols != null) __obj.updateDynamic("symbols")(symbols.asInstanceOf[js.Any])
    if (!js.isUndefined(unix)) __obj.updateDynamic("unix")(unix.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

