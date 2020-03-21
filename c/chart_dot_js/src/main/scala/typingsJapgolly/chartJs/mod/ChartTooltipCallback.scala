package typingsJapgolly.chartJs.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartTooltipCallback extends js.Object {
  var afterBody: js.UndefOr[
    js.Function2[
      /* item */ js.Array[ChartTooltipItem], 
      /* data */ ChartData, 
      String | js.Array[String]
    ]
  ] = js.undefined
  var afterFooter: js.UndefOr[
    js.Function2[
      /* item */ js.Array[ChartTooltipItem], 
      /* data */ ChartData, 
      String | js.Array[String]
    ]
  ] = js.undefined
  var afterLabel: js.UndefOr[
    js.Function2[/* tooltipItem */ ChartTooltipItem, /* data */ ChartData, String | js.Array[String]]
  ] = js.undefined
  var afterTitle: js.UndefOr[
    js.Function2[
      /* item */ js.Array[ChartTooltipItem], 
      /* data */ ChartData, 
      String | js.Array[String]
    ]
  ] = js.undefined
  var beforeBody: js.UndefOr[
    js.Function2[
      /* item */ js.Array[ChartTooltipItem], 
      /* data */ ChartData, 
      String | js.Array[String]
    ]
  ] = js.undefined
  var beforeFooter: js.UndefOr[
    js.Function2[
      /* item */ js.Array[ChartTooltipItem], 
      /* data */ ChartData, 
      String | js.Array[String]
    ]
  ] = js.undefined
  var beforeLabel: js.UndefOr[
    js.Function2[/* tooltipItem */ ChartTooltipItem, /* data */ ChartData, String | js.Array[String]]
  ] = js.undefined
  var beforeTitle: js.UndefOr[
    js.Function2[
      /* item */ js.Array[ChartTooltipItem], 
      /* data */ ChartData, 
      String | js.Array[String]
    ]
  ] = js.undefined
  var footer: js.UndefOr[
    js.Function2[
      /* item */ js.Array[ChartTooltipItem], 
      /* data */ ChartData, 
      String | js.Array[String]
    ]
  ] = js.undefined
  var label: js.UndefOr[
    js.Function2[/* tooltipItem */ ChartTooltipItem, /* data */ ChartData, String | js.Array[String]]
  ] = js.undefined
  var labelColor: js.UndefOr[
    js.Function2[/* tooltipItem */ ChartTooltipItem, /* chart */ Chart, ChartTooltipLabelColor]
  ] = js.undefined
  var labelTextColor: js.UndefOr[js.Function2[/* tooltipItem */ ChartTooltipItem, /* chart */ Chart, String]] = js.undefined
  var title: js.UndefOr[
    js.Function2[
      /* item */ js.Array[ChartTooltipItem], 
      /* data */ ChartData, 
      String | js.Array[String]
    ]
  ] = js.undefined
}

object ChartTooltipCallback {
  @scala.inline
  def apply(
    afterBody: (/* item */ js.Array[ChartTooltipItem], /* data */ ChartData) => CallbackTo[String | js.Array[String]] = null,
    afterFooter: (/* item */ js.Array[ChartTooltipItem], /* data */ ChartData) => CallbackTo[String | js.Array[String]] = null,
    afterLabel: (/* tooltipItem */ ChartTooltipItem, /* data */ ChartData) => CallbackTo[String | js.Array[String]] = null,
    afterTitle: (/* item */ js.Array[ChartTooltipItem], /* data */ ChartData) => CallbackTo[String | js.Array[String]] = null,
    beforeBody: (/* item */ js.Array[ChartTooltipItem], /* data */ ChartData) => CallbackTo[String | js.Array[String]] = null,
    beforeFooter: (/* item */ js.Array[ChartTooltipItem], /* data */ ChartData) => CallbackTo[String | js.Array[String]] = null,
    beforeLabel: (/* tooltipItem */ ChartTooltipItem, /* data */ ChartData) => CallbackTo[String | js.Array[String]] = null,
    beforeTitle: (/* item */ js.Array[ChartTooltipItem], /* data */ ChartData) => CallbackTo[String | js.Array[String]] = null,
    footer: (/* item */ js.Array[ChartTooltipItem], /* data */ ChartData) => CallbackTo[String | js.Array[String]] = null,
    label: (/* tooltipItem */ ChartTooltipItem, /* data */ ChartData) => CallbackTo[String | js.Array[String]] = null,
    labelColor: (/* tooltipItem */ ChartTooltipItem, /* chart */ Chart) => CallbackTo[ChartTooltipLabelColor] = null,
    labelTextColor: (/* tooltipItem */ ChartTooltipItem, /* chart */ Chart) => CallbackTo[String] = null,
    title: (/* item */ js.Array[ChartTooltipItem], /* data */ ChartData) => CallbackTo[String | js.Array[String]] = null
  ): ChartTooltipCallback = {
    val __obj = js.Dynamic.literal()
    if (afterBody != null) __obj.updateDynamic("afterBody")(js.Any.fromFunction2((t0: /* item */ js.Array[typingsJapgolly.chartJs.mod.ChartTooltipItem], t1: /* data */ typingsJapgolly.chartJs.mod.ChartData) => afterBody(t0, t1).runNow()))
    if (afterFooter != null) __obj.updateDynamic("afterFooter")(js.Any.fromFunction2((t0: /* item */ js.Array[typingsJapgolly.chartJs.mod.ChartTooltipItem], t1: /* data */ typingsJapgolly.chartJs.mod.ChartData) => afterFooter(t0, t1).runNow()))
    if (afterLabel != null) __obj.updateDynamic("afterLabel")(js.Any.fromFunction2((t0: /* tooltipItem */ typingsJapgolly.chartJs.mod.ChartTooltipItem, t1: /* data */ typingsJapgolly.chartJs.mod.ChartData) => afterLabel(t0, t1).runNow()))
    if (afterTitle != null) __obj.updateDynamic("afterTitle")(js.Any.fromFunction2((t0: /* item */ js.Array[typingsJapgolly.chartJs.mod.ChartTooltipItem], t1: /* data */ typingsJapgolly.chartJs.mod.ChartData) => afterTitle(t0, t1).runNow()))
    if (beforeBody != null) __obj.updateDynamic("beforeBody")(js.Any.fromFunction2((t0: /* item */ js.Array[typingsJapgolly.chartJs.mod.ChartTooltipItem], t1: /* data */ typingsJapgolly.chartJs.mod.ChartData) => beforeBody(t0, t1).runNow()))
    if (beforeFooter != null) __obj.updateDynamic("beforeFooter")(js.Any.fromFunction2((t0: /* item */ js.Array[typingsJapgolly.chartJs.mod.ChartTooltipItem], t1: /* data */ typingsJapgolly.chartJs.mod.ChartData) => beforeFooter(t0, t1).runNow()))
    if (beforeLabel != null) __obj.updateDynamic("beforeLabel")(js.Any.fromFunction2((t0: /* tooltipItem */ typingsJapgolly.chartJs.mod.ChartTooltipItem, t1: /* data */ typingsJapgolly.chartJs.mod.ChartData) => beforeLabel(t0, t1).runNow()))
    if (beforeTitle != null) __obj.updateDynamic("beforeTitle")(js.Any.fromFunction2((t0: /* item */ js.Array[typingsJapgolly.chartJs.mod.ChartTooltipItem], t1: /* data */ typingsJapgolly.chartJs.mod.ChartData) => beforeTitle(t0, t1).runNow()))
    if (footer != null) __obj.updateDynamic("footer")(js.Any.fromFunction2((t0: /* item */ js.Array[typingsJapgolly.chartJs.mod.ChartTooltipItem], t1: /* data */ typingsJapgolly.chartJs.mod.ChartData) => footer(t0, t1).runNow()))
    if (label != null) __obj.updateDynamic("label")(js.Any.fromFunction2((t0: /* tooltipItem */ typingsJapgolly.chartJs.mod.ChartTooltipItem, t1: /* data */ typingsJapgolly.chartJs.mod.ChartData) => label(t0, t1).runNow()))
    if (labelColor != null) __obj.updateDynamic("labelColor")(js.Any.fromFunction2((t0: /* tooltipItem */ typingsJapgolly.chartJs.mod.ChartTooltipItem, t1: /* chart */ typingsJapgolly.chartJs.mod.Chart) => labelColor(t0, t1).runNow()))
    if (labelTextColor != null) __obj.updateDynamic("labelTextColor")(js.Any.fromFunction2((t0: /* tooltipItem */ typingsJapgolly.chartJs.mod.ChartTooltipItem, t1: /* chart */ typingsJapgolly.chartJs.mod.Chart) => labelTextColor(t0, t1).runNow()))
    if (title != null) __obj.updateDynamic("title")(js.Any.fromFunction2((t0: /* item */ js.Array[typingsJapgolly.chartJs.mod.ChartTooltipItem], t1: /* data */ typingsJapgolly.chartJs.mod.ChartData) => title(t0, t1).runNow()))
    __obj.asInstanceOf[ChartTooltipCallback]
  }
}

