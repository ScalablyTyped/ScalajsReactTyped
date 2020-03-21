package typingsJapgolly.table.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableUserConfig extends js.Object {
  var border: js.UndefOr[JoinStruct] = js.undefined
  var columnCount: js.UndefOr[Double] = js.undefined
  var columnDefault: js.UndefOr[ColumnConfig] = js.undefined
  var columns: js.UndefOr[NumberDictionary[ColumnConfig]] = js.undefined
  var drawHorizontalLine: js.UndefOr[js.Function2[/* index */ Double, /* size */ Double, Boolean]] = js.undefined
  var singleLine: js.UndefOr[Boolean] = js.undefined
}

object TableUserConfig {
  @scala.inline
  def apply(
    border: JoinStruct = null,
    columnCount: Int | Double = null,
    columnDefault: ColumnConfig = null,
    columns: NumberDictionary[ColumnConfig] = null,
    drawHorizontalLine: (/* index */ Double, /* size */ Double) => CallbackTo[Boolean] = null,
    singleLine: js.UndefOr[Boolean] = js.undefined
  ): TableUserConfig = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (columnCount != null) __obj.updateDynamic("columnCount")(columnCount.asInstanceOf[js.Any])
    if (columnDefault != null) __obj.updateDynamic("columnDefault")(columnDefault.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (drawHorizontalLine != null) __obj.updateDynamic("drawHorizontalLine")(js.Any.fromFunction2((t0: /* index */ scala.Double, t1: /* size */ scala.Double) => drawHorizontalLine(t0, t1).runNow()))
    if (!js.isUndefined(singleLine)) __obj.updateDynamic("singleLine")(singleLine.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableUserConfig]
  }
}

