package typingsJapgolly.qs.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.qs.qsStrings.RFC1738
import typingsJapgolly.qs.qsStrings.RFC3986
import typingsJapgolly.qs.qsStrings.`iso-8859-1`
import typingsJapgolly.qs.qsStrings.`utf-8`
import typingsJapgolly.qs.qsStrings.brackets
import typingsJapgolly.qs.qsStrings.comma
import typingsJapgolly.qs.qsStrings.indices
import typingsJapgolly.qs.qsStrings.key
import typingsJapgolly.qs.qsStrings.repeat
import typingsJapgolly.qs.qsStrings.value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStringifyOptions extends js.Object {
  var addQueryPrefix: js.UndefOr[Boolean] = js.undefined
  var allowDots: js.UndefOr[Boolean] = js.undefined
  var arrayFormat: js.UndefOr[indices | brackets | repeat | comma] = js.undefined
  var charset: js.UndefOr[`utf-8` | `iso-8859-1`] = js.undefined
  var charsetSentinel: js.UndefOr[Boolean] = js.undefined
  var delimiter: js.UndefOr[String] = js.undefined
  var encode: js.UndefOr[Boolean] = js.undefined
  var encodeValuesOnly: js.UndefOr[Boolean] = js.undefined
  var encoder: js.UndefOr[
    js.Function4[
      /* str */ js.Any, 
      /* defaultEncoder */ defaultEncoder, 
      /* charset */ String, 
      /* type */ key | value, 
      String
    ]
  ] = js.undefined
  var filter: js.UndefOr[
    (js.Array[String | Double]) | (js.Function2[/* prefix */ String, /* value */ js.Any, _])
  ] = js.undefined
  var format: js.UndefOr[RFC1738 | RFC3986] = js.undefined
  var indices: js.UndefOr[Boolean] = js.undefined
  var serializeDate: js.UndefOr[js.Function1[/* d */ js.Date, String]] = js.undefined
  var skipNulls: js.UndefOr[Boolean] = js.undefined
  var sort: js.UndefOr[js.Function2[/* a */ js.Any, /* b */ js.Any, Double]] = js.undefined
  var strictNullHandling: js.UndefOr[Boolean] = js.undefined
}

object IStringifyOptions {
  @scala.inline
  def apply(
    addQueryPrefix: js.UndefOr[Boolean] = js.undefined,
    allowDots: js.UndefOr[Boolean] = js.undefined,
    arrayFormat: indices | brackets | repeat | comma = null,
    charset: `utf-8` | `iso-8859-1` = null,
    charsetSentinel: js.UndefOr[Boolean] = js.undefined,
    delimiter: String = null,
    encode: js.UndefOr[Boolean] = js.undefined,
    encodeValuesOnly: js.UndefOr[Boolean] = js.undefined,
    encoder: (/* str */ js.Any, /* defaultEncoder */ defaultEncoder, /* charset */ String, /* type */ key | value) => CallbackTo[String] = null,
    filter: (js.Array[String | Double]) | (js.Function2[/* prefix */ String, /* value */ js.Any, _]) = null,
    format: RFC1738 | RFC3986 = null,
    indices: js.UndefOr[Boolean] = js.undefined,
    serializeDate: /* d */ js.Date => CallbackTo[String] = null,
    skipNulls: js.UndefOr[Boolean] = js.undefined,
    sort: (/* a */ js.Any, /* b */ js.Any) => CallbackTo[Double] = null,
    strictNullHandling: js.UndefOr[Boolean] = js.undefined
  ): IStringifyOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(addQueryPrefix)) __obj.updateDynamic("addQueryPrefix")(addQueryPrefix.asInstanceOf[js.Any])
    if (!js.isUndefined(allowDots)) __obj.updateDynamic("allowDots")(allowDots.asInstanceOf[js.Any])
    if (arrayFormat != null) __obj.updateDynamic("arrayFormat")(arrayFormat.asInstanceOf[js.Any])
    if (charset != null) __obj.updateDynamic("charset")(charset.asInstanceOf[js.Any])
    if (!js.isUndefined(charsetSentinel)) __obj.updateDynamic("charsetSentinel")(charsetSentinel.asInstanceOf[js.Any])
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter.asInstanceOf[js.Any])
    if (!js.isUndefined(encode)) __obj.updateDynamic("encode")(encode.asInstanceOf[js.Any])
    if (!js.isUndefined(encodeValuesOnly)) __obj.updateDynamic("encodeValuesOnly")(encodeValuesOnly.asInstanceOf[js.Any])
    if (encoder != null) __obj.updateDynamic("encoder")(js.Any.fromFunction4((t0: /* str */ js.Any, t1: /* defaultEncoder */ typingsJapgolly.qs.mod.defaultEncoder, t2: /* charset */ java.lang.String, t3: /* type */ typingsJapgolly.qs.qsStrings.key | typingsJapgolly.qs.qsStrings.value) => encoder(t0, t1, t2, t3).runNow()))
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(indices)) __obj.updateDynamic("indices")(indices.asInstanceOf[js.Any])
    if (serializeDate != null) __obj.updateDynamic("serializeDate")(js.Any.fromFunction1((t0: /* d */ js.Date) => serializeDate(t0).runNow()))
    if (!js.isUndefined(skipNulls)) __obj.updateDynamic("skipNulls")(skipNulls.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(js.Any.fromFunction2((t0: /* a */ js.Any, t1: /* b */ js.Any) => sort(t0, t1).runNow()))
    if (!js.isUndefined(strictNullHandling)) __obj.updateDynamic("strictNullHandling")(strictNullHandling.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStringifyOptions]
  }
}

