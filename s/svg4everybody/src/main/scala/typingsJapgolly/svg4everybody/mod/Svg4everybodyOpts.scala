package typingsJapgolly.svg4everybody.mod

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.SVGElement
import org.scalajs.dom.raw.SVGUseElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Svg4everybodyOpts extends js.Object {
  var attributeName: js.UndefOr[String] = js.undefined
  var fallback: js.UndefOr[
    js.Function3[/* src */ String, /* svg */ SVGElement, /* use */ SVGUseElement, String]
  ] = js.undefined
  var nosvg: js.UndefOr[Boolean] = js.undefined
  var polyfill: js.UndefOr[Boolean] = js.undefined
  var validate: js.UndefOr[
    js.Function3[/* src */ String, /* svg */ SVGElement, /* use */ SVGUseElement, Boolean]
  ] = js.undefined
}

object Svg4everybodyOpts {
  @scala.inline
  def apply(
    attributeName: String = null,
    fallback: (/* src */ String, /* svg */ SVGElement, /* use */ SVGUseElement) => CallbackTo[String] = null,
    nosvg: js.UndefOr[Boolean] = js.undefined,
    polyfill: js.UndefOr[Boolean] = js.undefined,
    validate: (/* src */ String, /* svg */ SVGElement, /* use */ SVGUseElement) => CallbackTo[Boolean] = null
  ): Svg4everybodyOpts = {
    val __obj = js.Dynamic.literal()
    if (attributeName != null) __obj.updateDynamic("attributeName")(attributeName.asInstanceOf[js.Any])
    if (fallback != null) __obj.updateDynamic("fallback")(js.Any.fromFunction3((t0: /* src */ java.lang.String, t1: /* svg */ org.scalajs.dom.raw.SVGElement, t2: /* use */ org.scalajs.dom.raw.SVGUseElement) => fallback(t0, t1, t2).runNow()))
    if (!js.isUndefined(nosvg)) __obj.updateDynamic("nosvg")(nosvg.asInstanceOf[js.Any])
    if (!js.isUndefined(polyfill)) __obj.updateDynamic("polyfill")(polyfill.asInstanceOf[js.Any])
    if (validate != null) __obj.updateDynamic("validate")(js.Any.fromFunction3((t0: /* src */ java.lang.String, t1: /* svg */ org.scalajs.dom.raw.SVGElement, t2: /* use */ org.scalajs.dom.raw.SVGUseElement) => validate(t0, t1, t2).runNow()))
    __obj.asInstanceOf[Svg4everybodyOpts]
  }
}

