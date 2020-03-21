package typingsJapgolly.qs.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.qs.qsBooleans.`false`
import typingsJapgolly.qs.qsStrings.`iso-8859-1`
import typingsJapgolly.qs.qsStrings.`utf-8`
import typingsJapgolly.qs.qsStrings.key
import typingsJapgolly.qs.qsStrings.value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IParseOptions extends js.Object {
  var allowDots: js.UndefOr[Boolean] = js.undefined
  var allowPrototypes: js.UndefOr[Boolean] = js.undefined
  var arrayLimit: js.UndefOr[Double] = js.undefined
  var charset: js.UndefOr[`utf-8` | `iso-8859-1`] = js.undefined
  var charsetSentinel: js.UndefOr[Boolean] = js.undefined
  var comma: js.UndefOr[Boolean] = js.undefined
  var decoder: js.UndefOr[
    js.Function4[
      /* str */ String, 
      /* defaultDecoder */ defaultDecoder, 
      /* charset */ String, 
      /* type */ key | value, 
      _
    ]
  ] = js.undefined
  var delimiter: js.UndefOr[String | js.RegExp] = js.undefined
  var depth: js.UndefOr[Double | `false`] = js.undefined
  var ignoreQueryPrefix: js.UndefOr[Boolean] = js.undefined
  var interpretNumericEntities: js.UndefOr[Boolean] = js.undefined
  var parameterLimit: js.UndefOr[Double] = js.undefined
  var parseArrays: js.UndefOr[Boolean] = js.undefined
  var plainObjects: js.UndefOr[Boolean] = js.undefined
  var strictNullHandling: js.UndefOr[Boolean] = js.undefined
}

object IParseOptions {
  @scala.inline
  def apply(
    allowDots: js.UndefOr[Boolean] = js.undefined,
    allowPrototypes: js.UndefOr[Boolean] = js.undefined,
    arrayLimit: Int | Double = null,
    charset: `utf-8` | `iso-8859-1` = null,
    charsetSentinel: js.UndefOr[Boolean] = js.undefined,
    comma: js.UndefOr[Boolean] = js.undefined,
    decoder: (/* str */ String, /* defaultDecoder */ defaultDecoder, /* charset */ String, /* type */ key | value) => CallbackTo[js.Any] = null,
    delimiter: String | js.RegExp = null,
    depth: Double | `false` = null,
    ignoreQueryPrefix: js.UndefOr[Boolean] = js.undefined,
    interpretNumericEntities: js.UndefOr[Boolean] = js.undefined,
    parameterLimit: Int | Double = null,
    parseArrays: js.UndefOr[Boolean] = js.undefined,
    plainObjects: js.UndefOr[Boolean] = js.undefined,
    strictNullHandling: js.UndefOr[Boolean] = js.undefined
  ): IParseOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowDots)) __obj.updateDynamic("allowDots")(allowDots.asInstanceOf[js.Any])
    if (!js.isUndefined(allowPrototypes)) __obj.updateDynamic("allowPrototypes")(allowPrototypes.asInstanceOf[js.Any])
    if (arrayLimit != null) __obj.updateDynamic("arrayLimit")(arrayLimit.asInstanceOf[js.Any])
    if (charset != null) __obj.updateDynamic("charset")(charset.asInstanceOf[js.Any])
    if (!js.isUndefined(charsetSentinel)) __obj.updateDynamic("charsetSentinel")(charsetSentinel.asInstanceOf[js.Any])
    if (!js.isUndefined(comma)) __obj.updateDynamic("comma")(comma.asInstanceOf[js.Any])
    if (decoder != null) __obj.updateDynamic("decoder")(js.Any.fromFunction4((t0: /* str */ java.lang.String, t1: /* defaultDecoder */ typingsJapgolly.qs.mod.defaultDecoder, t2: /* charset */ java.lang.String, t3: /* type */ typingsJapgolly.qs.qsStrings.key | typingsJapgolly.qs.qsStrings.value) => decoder(t0, t1, t2, t3).runNow()))
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter.asInstanceOf[js.Any])
    if (depth != null) __obj.updateDynamic("depth")(depth.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreQueryPrefix)) __obj.updateDynamic("ignoreQueryPrefix")(ignoreQueryPrefix.asInstanceOf[js.Any])
    if (!js.isUndefined(interpretNumericEntities)) __obj.updateDynamic("interpretNumericEntities")(interpretNumericEntities.asInstanceOf[js.Any])
    if (parameterLimit != null) __obj.updateDynamic("parameterLimit")(parameterLimit.asInstanceOf[js.Any])
    if (!js.isUndefined(parseArrays)) __obj.updateDynamic("parseArrays")(parseArrays.asInstanceOf[js.Any])
    if (!js.isUndefined(plainObjects)) __obj.updateDynamic("plainObjects")(plainObjects.asInstanceOf[js.Any])
    if (!js.isUndefined(strictNullHandling)) __obj.updateDynamic("strictNullHandling")(strictNullHandling.asInstanceOf[js.Any])
    __obj.asInstanceOf[IParseOptions]
  }
}

