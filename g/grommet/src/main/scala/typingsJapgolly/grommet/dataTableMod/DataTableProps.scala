package typingsJapgolly.grommet.dataTableMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import typingsJapgolly.grommet.AnonAlign
import typingsJapgolly.grommet.AnonBackground
import typingsJapgolly.grommet.AnonBody
import typingsJapgolly.grommet.AnonDatum
import typingsJapgolly.grommet.AnonExpand
import typingsJapgolly.grommet.AnonFooter
import typingsJapgolly.grommet.AnonHeader
import typingsJapgolly.grommet.grommetStrings.all
import typingsJapgolly.grommet.grommetStrings.bottom
import typingsJapgolly.grommet.grommetStrings.horizontal
import typingsJapgolly.grommet.grommetStrings.large
import typingsJapgolly.grommet.grommetStrings.left
import typingsJapgolly.grommet.grommetStrings.medium
import typingsJapgolly.grommet.grommetStrings.none
import typingsJapgolly.grommet.grommetStrings.right
import typingsJapgolly.grommet.grommetStrings.small
import typingsJapgolly.grommet.grommetStrings.top
import typingsJapgolly.grommet.grommetStrings.vertical
import typingsJapgolly.grommet.grommetStrings.xlarge
import typingsJapgolly.grommet.grommetStrings.xsmall
import typingsJapgolly.grommet.grommetStrings.xxsmall
import typingsJapgolly.grommet.utilsMod.A11yTitleType
import typingsJapgolly.grommet.utilsMod.AlignSelfType
import typingsJapgolly.grommet.utilsMod.GridAreaType
import typingsJapgolly.grommet.utilsMod.MarginType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataTableProps extends js.Object {
  var a11yTitle: js.UndefOr[A11yTitleType] = js.undefined
  var alignSelf: js.UndefOr[AlignSelfType] = js.undefined
  var background: js.UndefOr[String | AnonBody] = js.undefined
  var border: js.UndefOr[Boolean | top | left | bottom | right | horizontal | vertical | all | AnonFooter] = js.undefined
  var columns: js.UndefOr[js.Array[AnonAlign]] = js.undefined
  var data: js.UndefOr[js.Array[js.Object]] = js.undefined
  var gridArea: js.UndefOr[GridAreaType] = js.undefined
  var groupBy: js.UndefOr[String | AnonExpand] = js.undefined
  var margin: js.UndefOr[MarginType] = js.undefined
  var onClickRow: js.UndefOr[
    js.Function1[(/* event */ AnonDatum) | (/* event */ ReactMouseEventFrom[Element]), Unit]
  ] = js.undefined
  var onMore: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var onSearch: js.UndefOr[js.Function1[/* search */ String, Unit]] = js.undefined
  var pad: js.UndefOr[none | xxsmall | xsmall | small | medium | large | xlarge | AnonHeader | String] = js.undefined
  var primaryKey: js.UndefOr[String] = js.undefined
  var replace: js.UndefOr[Boolean] = js.undefined
  var resizeable: js.UndefOr[Boolean] = js.undefined
  var rowProps: js.UndefOr[StringDictionary[AnonBackground]] = js.undefined
  var size: js.UndefOr[small | medium | large | xlarge | String] = js.undefined
  var sortable: js.UndefOr[Boolean] = js.undefined
  var step: js.UndefOr[Double] = js.undefined
}

object DataTableProps {
  @scala.inline
  def apply(
    a11yTitle: A11yTitleType = null,
    alignSelf: AlignSelfType = null,
    background: String | AnonBody = null,
    border: Boolean | top | left | bottom | right | horizontal | vertical | all | AnonFooter = null,
    columns: js.Array[AnonAlign] = null,
    data: js.Array[js.Object] = null,
    gridArea: GridAreaType = null,
    groupBy: String | AnonExpand = null,
    margin: MarginType = null,
    onClickRow: (/* event */ AnonDatum) | (/* event */ ReactMouseEventFrom[Element]) => Callback = null,
    onMore: /* repeated */ js.Any => CallbackTo[js.Any] = null,
    onSearch: /* search */ String => Callback = null,
    pad: none | xxsmall | xsmall | small | medium | large | xlarge | AnonHeader | String = null,
    primaryKey: String = null,
    replace: js.UndefOr[Boolean] = js.undefined,
    resizeable: js.UndefOr[Boolean] = js.undefined,
    rowProps: StringDictionary[AnonBackground] = null,
    size: small | medium | large | xlarge | String = null,
    sortable: js.UndefOr[Boolean] = js.undefined,
    step: Int | Double = null
  ): DataTableProps = {
    val __obj = js.Dynamic.literal()
    if (a11yTitle != null) __obj.updateDynamic("a11yTitle")(a11yTitle.asInstanceOf[js.Any])
    if (alignSelf != null) __obj.updateDynamic("alignSelf")(alignSelf.asInstanceOf[js.Any])
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (gridArea != null) __obj.updateDynamic("gridArea")(gridArea.asInstanceOf[js.Any])
    if (groupBy != null) __obj.updateDynamic("groupBy")(groupBy.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (onClickRow != null) __obj.updateDynamic("onClickRow")(js.Any.fromFunction1((t0: (/* event */ typingsJapgolly.grommet.AnonDatum) | (/* event */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.Element])) => onClickRow(t0).runNow()))
    if (onMore != null) __obj.updateDynamic("onMore")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onMore(t0).runNow()))
    if (onSearch != null) __obj.updateDynamic("onSearch")(js.Any.fromFunction1((t0: /* search */ java.lang.String) => onSearch(t0).runNow()))
    if (pad != null) __obj.updateDynamic("pad")(pad.asInstanceOf[js.Any])
    if (primaryKey != null) __obj.updateDynamic("primaryKey")(primaryKey.asInstanceOf[js.Any])
    if (!js.isUndefined(replace)) __obj.updateDynamic("replace")(replace.asInstanceOf[js.Any])
    if (!js.isUndefined(resizeable)) __obj.updateDynamic("resizeable")(resizeable.asInstanceOf[js.Any])
    if (rowProps != null) __obj.updateDynamic("rowProps")(rowProps.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(sortable)) __obj.updateDynamic("sortable")(sortable.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTableProps]
  }
}

