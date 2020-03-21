package typingsJapgolly.exceljs

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.exceljs.mod.Cell
import typingsJapgolly.exceljs.mod.CellValue
import typingsJapgolly.exceljs.mod.Column
import typingsJapgolly.exceljs.mod.Fill
import typingsJapgolly.exceljs.mod.Worksheet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<exceljs.exceljs.Column> */
trait PartialColumn extends js.Object {
  var alignment: js.UndefOr[PartialAlignment] = js.undefined
  var border: js.UndefOr[PartialBordersBottom] = js.undefined
  var collapsed: js.UndefOr[Boolean] = js.undefined
  var defn: js.UndefOr[js.Any] = js.undefined
  var eachCell: js.UndefOr[
    js.Function1[/* callback */ js.Function2[/* cell */ Cell, /* rowNumber */ Double, Unit], Unit]
  ] = js.undefined
  var equivalentTo: js.UndefOr[js.Function1[/* other */ Column, Boolean]] = js.undefined
  var fill: js.UndefOr[Fill] = js.undefined
  var font: js.UndefOr[PartialFont] = js.undefined
  var header: js.UndefOr[String | js.Array[String]] = js.undefined
  var headerCount: js.UndefOr[Double] = js.undefined
  var headers: js.UndefOr[js.Array[String]] = js.undefined
  var hidden: js.UndefOr[Boolean] = js.undefined
  var isCustomWidth: js.UndefOr[Boolean] = js.undefined
  var isDefault: js.UndefOr[Boolean] = js.undefined
  var key: js.UndefOr[String] = js.undefined
  var letter: js.UndefOr[String] = js.undefined
  var numFmt: js.UndefOr[String] = js.undefined
  var number: js.UndefOr[Double] = js.undefined
  var outlineLevel: js.UndefOr[Double] = js.undefined
  var protection: js.UndefOr[PartialProtection] = js.undefined
  var style: js.UndefOr[PartialStyleAlignment] = js.undefined
  @JSName("toString")
  var toString_FPartialColumn: js.UndefOr[js.Function0[String]] = js.undefined
  var values: js.UndefOr[js.Array[CellValue]] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
  var worksheet: js.UndefOr[Worksheet] = js.undefined
}

object PartialColumn {
  @scala.inline
  def apply(
    alignment: PartialAlignment = null,
    border: PartialBordersBottom = null,
    collapsed: js.UndefOr[Boolean] = js.undefined,
    defn: js.Any = null,
    eachCell: /* callback */ js.Function2[/* cell */ Cell, /* rowNumber */ Double, Unit] => Callback = null,
    equivalentTo: /* other */ Column => CallbackTo[Boolean] = null,
    fill: Fill = null,
    font: PartialFont = null,
    header: String | js.Array[String] = null,
    headerCount: Int | Double = null,
    headers: js.Array[String] = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    isCustomWidth: js.UndefOr[Boolean] = js.undefined,
    isDefault: js.UndefOr[Boolean] = js.undefined,
    key: String = null,
    letter: String = null,
    numFmt: String = null,
    number: Int | Double = null,
    outlineLevel: Int | Double = null,
    protection: PartialProtection = null,
    style: PartialStyleAlignment = null,
    toString: js.UndefOr[CallbackTo[String]] = js.undefined,
    values: js.Array[CellValue] = null,
    width: Int | Double = null,
    worksheet: Worksheet = null
  ): PartialColumn = {
    val __obj = js.Dynamic.literal()
    if (alignment != null) __obj.updateDynamic("alignment")(alignment.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (!js.isUndefined(collapsed)) __obj.updateDynamic("collapsed")(collapsed.asInstanceOf[js.Any])
    if (defn != null) __obj.updateDynamic("defn")(defn.asInstanceOf[js.Any])
    if (eachCell != null) __obj.updateDynamic("eachCell")(js.Any.fromFunction1((t0: /* callback */ js.Function2[
  /* cell */ typingsJapgolly.exceljs.mod.Cell, 
  /* rowNumber */ scala.Double, 
  scala.Unit]) => eachCell(t0).runNow()))
    if (equivalentTo != null) __obj.updateDynamic("equivalentTo")(js.Any.fromFunction1((t0: /* other */ typingsJapgolly.exceljs.mod.Column) => equivalentTo(t0).runNow()))
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (headerCount != null) __obj.updateDynamic("headerCount")(headerCount.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (!js.isUndefined(isCustomWidth)) __obj.updateDynamic("isCustomWidth")(isCustomWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(isDefault)) __obj.updateDynamic("isDefault")(isDefault.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (letter != null) __obj.updateDynamic("letter")(letter.asInstanceOf[js.Any])
    if (numFmt != null) __obj.updateDynamic("numFmt")(numFmt.asInstanceOf[js.Any])
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    if (outlineLevel != null) __obj.updateDynamic("outlineLevel")(outlineLevel.asInstanceOf[js.Any])
    if (protection != null) __obj.updateDynamic("protection")(protection.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    toString.foreach(p => __obj.updateDynamic("toString")(p.toJsFn))
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (worksheet != null) __obj.updateDynamic("worksheet")(worksheet.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialColumn]
  }
}

