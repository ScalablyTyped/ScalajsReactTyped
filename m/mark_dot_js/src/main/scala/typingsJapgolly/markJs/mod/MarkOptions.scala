package typingsJapgolly.markJs.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import typingsJapgolly.markJs.markJsStrings.disabled
import typingsJapgolly.markJs.markJsStrings.enabled
import typingsJapgolly.markJs.markJsStrings.withSpaces
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkOptions extends js.Object {
  var accuracy: js.UndefOr[MarkAccuracy | MarkAccuracyObject] = js.undefined
  var acrossElements: js.UndefOr[Boolean] = js.undefined
  var caseSensitive: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var debug: js.UndefOr[Boolean] = js.undefined
  var diacritics: js.UndefOr[Boolean] = js.undefined
  var done: js.UndefOr[js.Function1[/* marksTotal */ Double, Unit]] = js.undefined
  var each: js.UndefOr[js.Function1[/* element */ Element, Unit]] = js.undefined
  var element: js.UndefOr[String] = js.undefined
  var exclude: js.UndefOr[js.Array[String]] = js.undefined
  var filter: js.UndefOr[
    js.Function4[
      /* textNode */ Element, 
      /* term */ String, 
      /* marksSoFar */ Double, 
      /* marksTotal */ Double, 
      Boolean
    ]
  ] = js.undefined
  var iframes: js.UndefOr[Boolean] = js.undefined
  var iframesTimeout: js.UndefOr[Double] = js.undefined
  var ignoreJoiners: js.UndefOr[Boolean] = js.undefined
  var ignorePunctuation: js.UndefOr[js.Array[String]] = js.undefined
  var log: js.UndefOr[js.Object] = js.undefined
  var noMatch: js.UndefOr[js.Function1[/* term */ String, Unit]] = js.undefined
  var separateWordSearch: js.UndefOr[Boolean] = js.undefined
  var synonyms: js.UndefOr[StringDictionary[String]] = js.undefined
  var wildcards: js.UndefOr[disabled | enabled | withSpaces] = js.undefined
}

object MarkOptions {
  @scala.inline
  def apply(
    accuracy: MarkAccuracy | MarkAccuracyObject = null,
    acrossElements: js.UndefOr[Boolean] = js.undefined,
    caseSensitive: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    diacritics: js.UndefOr[Boolean] = js.undefined,
    done: /* marksTotal */ Double => Callback = null,
    each: /* element */ Element => Callback = null,
    element: String = null,
    exclude: js.Array[String] = null,
    filter: (/* textNode */ Element, /* term */ String, /* marksSoFar */ Double, /* marksTotal */ Double) => CallbackTo[Boolean] = null,
    iframes: js.UndefOr[Boolean] = js.undefined,
    iframesTimeout: Int | Double = null,
    ignoreJoiners: js.UndefOr[Boolean] = js.undefined,
    ignorePunctuation: js.Array[String] = null,
    log: js.Object = null,
    noMatch: /* term */ String => Callback = null,
    separateWordSearch: js.UndefOr[Boolean] = js.undefined,
    synonyms: StringDictionary[String] = null,
    wildcards: disabled | enabled | withSpaces = null
  ): MarkOptions = {
    val __obj = js.Dynamic.literal()
    if (accuracy != null) __obj.updateDynamic("accuracy")(accuracy.asInstanceOf[js.Any])
    if (!js.isUndefined(acrossElements)) __obj.updateDynamic("acrossElements")(acrossElements.asInstanceOf[js.Any])
    if (!js.isUndefined(caseSensitive)) __obj.updateDynamic("caseSensitive")(caseSensitive.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (!js.isUndefined(diacritics)) __obj.updateDynamic("diacritics")(diacritics.asInstanceOf[js.Any])
    if (done != null) __obj.updateDynamic("done")(js.Any.fromFunction1((t0: /* marksTotal */ scala.Double) => done(t0).runNow()))
    if (each != null) __obj.updateDynamic("each")(js.Any.fromFunction1((t0: /* element */ org.scalajs.dom.raw.Element) => each(t0).runNow()))
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction4((t0: /* textNode */ org.scalajs.dom.raw.Element, t1: /* term */ java.lang.String, t2: /* marksSoFar */ scala.Double, t3: /* marksTotal */ scala.Double) => filter(t0, t1, t2, t3).runNow()))
    if (!js.isUndefined(iframes)) __obj.updateDynamic("iframes")(iframes.asInstanceOf[js.Any])
    if (iframesTimeout != null) __obj.updateDynamic("iframesTimeout")(iframesTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreJoiners)) __obj.updateDynamic("ignoreJoiners")(ignoreJoiners.asInstanceOf[js.Any])
    if (ignorePunctuation != null) __obj.updateDynamic("ignorePunctuation")(ignorePunctuation.asInstanceOf[js.Any])
    if (log != null) __obj.updateDynamic("log")(log.asInstanceOf[js.Any])
    if (noMatch != null) __obj.updateDynamic("noMatch")(js.Any.fromFunction1((t0: /* term */ java.lang.String) => noMatch(t0).runNow()))
    if (!js.isUndefined(separateWordSearch)) __obj.updateDynamic("separateWordSearch")(separateWordSearch.asInstanceOf[js.Any])
    if (synonyms != null) __obj.updateDynamic("synonyms")(synonyms.asInstanceOf[js.Any])
    if (wildcards != null) __obj.updateDynamic("wildcards")(wildcards.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkOptions]
  }
}

