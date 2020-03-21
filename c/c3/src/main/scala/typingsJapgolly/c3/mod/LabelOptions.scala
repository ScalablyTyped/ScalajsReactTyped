package typingsJapgolly.c3.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelOptions extends js.Object {
  /**
    * Set formatter for the label on each pie piece.
    */
  var format: js.UndefOr[
    js.Function3[/* value */ Double, /* ratio */ Double, /* id */ String, String | Double]
  ] = js.undefined
  /**
    * Show or hide label on each pie piece.
    */
  var show: js.UndefOr[Boolean] = js.undefined
}

object LabelOptions {
  @scala.inline
  def apply(
    format: (/* value */ Double, /* ratio */ Double, /* id */ String) => CallbackTo[String | Double] = null,
    show: js.UndefOr[Boolean] = js.undefined
  ): LabelOptions = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(js.Any.fromFunction3((t0: /* value */ scala.Double, t1: /* ratio */ scala.Double, t2: /* id */ java.lang.String) => format(t0, t1, t2).runNow()))
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelOptions]
  }
}

