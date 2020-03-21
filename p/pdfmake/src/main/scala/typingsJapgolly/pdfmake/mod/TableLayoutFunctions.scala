package typingsJapgolly.pdfmake.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableLayoutFunctions extends js.Object {
  var fillColor: js.UndefOr[js.Function2[/* i */ Double, /* node */ js.Any, String]] = js.undefined
  var hLineColor: js.UndefOr[js.Function2[/* i */ Double, /* node */ js.Any, String]] = js.undefined
  var hLineWidth: js.UndefOr[js.Function2[/* i */ Double, /* node */ js.Any, Double]] = js.undefined
  var paddingBottom: js.UndefOr[js.Function2[/* i */ Double, /* node */ js.Any, Double]] = js.undefined
  var paddingLeft: js.UndefOr[js.Function2[/* i */ Double, /* node */ js.Any, Double]] = js.undefined
  var paddingRight: js.UndefOr[js.Function2[/* i */ Double, /* node */ js.Any, Double]] = js.undefined
  var paddingTop: js.UndefOr[js.Function2[/* i */ Double, /* node */ js.Any, Double]] = js.undefined
  var vLineColor: js.UndefOr[js.Function2[/* i */ Double, /* node */ js.Any, String]] = js.undefined
  var vLineWidth: js.UndefOr[js.Function2[/* i */ Double, /* node */ js.Any, Double]] = js.undefined
}

object TableLayoutFunctions {
  @scala.inline
  def apply(
    fillColor: (/* i */ Double, /* node */ js.Any) => CallbackTo[String] = null,
    hLineColor: (/* i */ Double, /* node */ js.Any) => CallbackTo[String] = null,
    hLineWidth: (/* i */ Double, /* node */ js.Any) => CallbackTo[Double] = null,
    paddingBottom: (/* i */ Double, /* node */ js.Any) => CallbackTo[Double] = null,
    paddingLeft: (/* i */ Double, /* node */ js.Any) => CallbackTo[Double] = null,
    paddingRight: (/* i */ Double, /* node */ js.Any) => CallbackTo[Double] = null,
    paddingTop: (/* i */ Double, /* node */ js.Any) => CallbackTo[Double] = null,
    vLineColor: (/* i */ Double, /* node */ js.Any) => CallbackTo[String] = null,
    vLineWidth: (/* i */ Double, /* node */ js.Any) => CallbackTo[Double] = null
  ): TableLayoutFunctions = {
    val __obj = js.Dynamic.literal()
    if (fillColor != null) __obj.updateDynamic("fillColor")(js.Any.fromFunction2((t0: /* i */ scala.Double, t1: /* node */ js.Any) => fillColor(t0, t1).runNow()))
    if (hLineColor != null) __obj.updateDynamic("hLineColor")(js.Any.fromFunction2((t0: /* i */ scala.Double, t1: /* node */ js.Any) => hLineColor(t0, t1).runNow()))
    if (hLineWidth != null) __obj.updateDynamic("hLineWidth")(js.Any.fromFunction2((t0: /* i */ scala.Double, t1: /* node */ js.Any) => hLineWidth(t0, t1).runNow()))
    if (paddingBottom != null) __obj.updateDynamic("paddingBottom")(js.Any.fromFunction2((t0: /* i */ scala.Double, t1: /* node */ js.Any) => paddingBottom(t0, t1).runNow()))
    if (paddingLeft != null) __obj.updateDynamic("paddingLeft")(js.Any.fromFunction2((t0: /* i */ scala.Double, t1: /* node */ js.Any) => paddingLeft(t0, t1).runNow()))
    if (paddingRight != null) __obj.updateDynamic("paddingRight")(js.Any.fromFunction2((t0: /* i */ scala.Double, t1: /* node */ js.Any) => paddingRight(t0, t1).runNow()))
    if (paddingTop != null) __obj.updateDynamic("paddingTop")(js.Any.fromFunction2((t0: /* i */ scala.Double, t1: /* node */ js.Any) => paddingTop(t0, t1).runNow()))
    if (vLineColor != null) __obj.updateDynamic("vLineColor")(js.Any.fromFunction2((t0: /* i */ scala.Double, t1: /* node */ js.Any) => vLineColor(t0, t1).runNow()))
    if (vLineWidth != null) __obj.updateDynamic("vLineWidth")(js.Any.fromFunction2((t0: /* i */ scala.Double, t1: /* node */ js.Any) => vLineWidth(t0, t1).runNow()))
    __obj.asInstanceOf[TableLayoutFunctions]
  }
}

