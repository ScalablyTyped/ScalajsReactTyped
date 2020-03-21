package typingsJapgolly.cleanCss.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.cleanCss.cleanCssBooleans.`false`
import typingsJapgolly.cleanCss.cleanCssBooleans.`true`
import typingsJapgolly.cleanCss.cleanCssNumbers.`0`
import typingsJapgolly.cleanCss.cleanCssNumbers.`1`
import typingsJapgolly.cleanCss.cleanCssNumbers.`2`
import typingsJapgolly.cleanCss.cleanCssStrings.Asterisk
import typingsJapgolly.cleanCss.cleanCssStrings.`keep-breaks`
import typingsJapgolly.cleanCss.cleanCssStrings.beautify
import typingsJapgolly.cleanCss.cleanCssStrings.ie7
import typingsJapgolly.cleanCss.cleanCssStrings.ie8
import typingsJapgolly.cleanCss.cleanCssStrings.ie9
import typingsJapgolly.node.httpMod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Discriminant union of both sets of options types.  If you initialize without setting `returnPromise: true`
  *  and want to return a promise, you will need to cast to the correct options type so that TypeScript
  *  knows what the expected return type will be:
  *  `(options = options as CleanCSS.OptionsPromise).returnPromise = true`
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.cleanCss.mod.OptionsPromise
  - typingsJapgolly.cleanCss.mod.OptionsOutput
*/
trait Options extends js.Object

object Options {
  @scala.inline
  def OptionsPromise(
    returnPromise: `true`,
    compatibility: Asterisk | ie9 | ie8 | ie7 | CompatibilityOptions = null,
    fetch: (/* uri */ String, /* inlineRequest */ RequestOptions | typingsJapgolly.node.httpsMod.RequestOptions, /* inlineTimeout */ Double, /* done */ js.Function2[/* message */ String | Double, /* body */ String, Unit]) => Callback = null,
    format: beautify | `keep-breaks` | FormatOptions | `false` = null,
    `inline`: js.Array[String] | `false` = null,
    inlineRequest: RequestOptions | typingsJapgolly.node.httpsMod.RequestOptions = null,
    inlineTimeout: Int | Double = null,
    level: `0` | `1` | `2` | OptimizationsOptions = null,
    rebase: js.UndefOr[Boolean] = js.undefined,
    rebaseTo: String = null,
    sourceMap: js.UndefOr[Boolean] = js.undefined,
    sourceMapInlineSources: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal(returnPromise = returnPromise.asInstanceOf[js.Any])
    if (compatibility != null) __obj.updateDynamic("compatibility")(compatibility.asInstanceOf[js.Any])
    if (fetch != null) __obj.updateDynamic("fetch")(js.Any.fromFunction4((t0: /* uri */ java.lang.String, t1: /* inlineRequest */ typingsJapgolly.node.httpMod.RequestOptions | typingsJapgolly.node.httpsMod.RequestOptions, t2: /* inlineTimeout */ scala.Double, t3: /* done */ js.Function2[
  /* message */ java.lang.String | scala.Double, 
  /* body */ java.lang.String, 
  scala.Unit]) => fetch(t0, t1, t2, t3).runNow()))
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (`inline` != null) __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
    if (inlineRequest != null) __obj.updateDynamic("inlineRequest")(inlineRequest.asInstanceOf[js.Any])
    if (inlineTimeout != null) __obj.updateDynamic("inlineTimeout")(inlineTimeout.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (!js.isUndefined(rebase)) __obj.updateDynamic("rebase")(rebase.asInstanceOf[js.Any])
    if (rebaseTo != null) __obj.updateDynamic("rebaseTo")(rebaseTo.asInstanceOf[js.Any])
    if (!js.isUndefined(sourceMap)) __obj.updateDynamic("sourceMap")(sourceMap.asInstanceOf[js.Any])
    if (!js.isUndefined(sourceMapInlineSources)) __obj.updateDynamic("sourceMapInlineSources")(sourceMapInlineSources.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  def OptionsOutput(
    compatibility: Asterisk | ie9 | ie8 | ie7 | CompatibilityOptions = null,
    fetch: (/* uri */ String, /* inlineRequest */ RequestOptions | typingsJapgolly.node.httpsMod.RequestOptions, /* inlineTimeout */ Double, /* done */ js.Function2[/* message */ String | Double, /* body */ String, Unit]) => Callback = null,
    format: beautify | `keep-breaks` | FormatOptions | `false` = null,
    `inline`: js.Array[String] | `false` = null,
    inlineRequest: RequestOptions | typingsJapgolly.node.httpsMod.RequestOptions = null,
    inlineTimeout: Int | Double = null,
    level: `0` | `1` | `2` | OptimizationsOptions = null,
    rebase: js.UndefOr[Boolean] = js.undefined,
    rebaseTo: String = null,
    returnPromise: `false` = null,
    sourceMap: js.UndefOr[Boolean] = js.undefined,
    sourceMapInlineSources: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (compatibility != null) __obj.updateDynamic("compatibility")(compatibility.asInstanceOf[js.Any])
    if (fetch != null) __obj.updateDynamic("fetch")(js.Any.fromFunction4((t0: /* uri */ java.lang.String, t1: /* inlineRequest */ typingsJapgolly.node.httpMod.RequestOptions | typingsJapgolly.node.httpsMod.RequestOptions, t2: /* inlineTimeout */ scala.Double, t3: /* done */ js.Function2[
  /* message */ java.lang.String | scala.Double, 
  /* body */ java.lang.String, 
  scala.Unit]) => fetch(t0, t1, t2, t3).runNow()))
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (`inline` != null) __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
    if (inlineRequest != null) __obj.updateDynamic("inlineRequest")(inlineRequest.asInstanceOf[js.Any])
    if (inlineTimeout != null) __obj.updateDynamic("inlineTimeout")(inlineTimeout.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (!js.isUndefined(rebase)) __obj.updateDynamic("rebase")(rebase.asInstanceOf[js.Any])
    if (rebaseTo != null) __obj.updateDynamic("rebaseTo")(rebaseTo.asInstanceOf[js.Any])
    if (returnPromise != null) __obj.updateDynamic("returnPromise")(returnPromise.asInstanceOf[js.Any])
    if (!js.isUndefined(sourceMap)) __obj.updateDynamic("sourceMap")(sourceMap.asInstanceOf[js.Any])
    if (!js.isUndefined(sourceMapInlineSources)) __obj.updateDynamic("sourceMapInlineSources")(sourceMapInlineSources.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

