package typingsJapgolly.markJs.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkRangesOptions extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var debug: js.UndefOr[Boolean] = js.undefined
  var done: js.UndefOr[js.Function1[/* marksTotal */ Double, Unit]] = js.undefined
  var each: js.UndefOr[js.Function2[/* element */ Element, /* range */ Range, Unit]] = js.undefined
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
  var log: js.UndefOr[js.Object] = js.undefined
  var noMatch: js.UndefOr[js.Function1[/* term */ String, Unit]] = js.undefined
}

object MarkRangesOptions {
  @scala.inline
  def apply(
    className: String = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    done: /* marksTotal */ Double => Callback = null,
    each: (/* element */ Element, /* range */ Range) => Callback = null,
    element: String = null,
    exclude: js.Array[String] = null,
    filter: (/* textNode */ Element, /* term */ String, /* marksSoFar */ Double, /* marksTotal */ Double) => CallbackTo[Boolean] = null,
    iframes: js.UndefOr[Boolean] = js.undefined,
    iframesTimeout: Int | Double = null,
    log: js.Object = null,
    noMatch: /* term */ String => Callback = null
  ): MarkRangesOptions = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (done != null) __obj.updateDynamic("done")(js.Any.fromFunction1((t0: /* marksTotal */ scala.Double) => done(t0).runNow()))
    if (each != null) __obj.updateDynamic("each")(js.Any.fromFunction2((t0: /* element */ org.scalajs.dom.raw.Element, t1: /* range */ typingsJapgolly.markJs.mod.Range) => each(t0, t1).runNow()))
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction4((t0: /* textNode */ org.scalajs.dom.raw.Element, t1: /* term */ java.lang.String, t2: /* marksSoFar */ scala.Double, t3: /* marksTotal */ scala.Double) => filter(t0, t1, t2, t3).runNow()))
    if (!js.isUndefined(iframes)) __obj.updateDynamic("iframes")(iframes.asInstanceOf[js.Any])
    if (iframesTimeout != null) __obj.updateDynamic("iframesTimeout")(iframesTimeout.asInstanceOf[js.Any])
    if (log != null) __obj.updateDynamic("log")(log.asInstanceOf[js.Any])
    if (noMatch != null) __obj.updateDynamic("noMatch")(js.Any.fromFunction1((t0: /* term */ java.lang.String) => noMatch(t0).runNow()))
    __obj.asInstanceOf[MarkRangesOptions]
  }
}

