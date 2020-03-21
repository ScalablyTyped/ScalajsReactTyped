package typingsJapgolly.officeUiFabricReact.detailsRowFieldsTypesMod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.officeUiFabricReact.detailsListTypesMod.IColumn
import typingsJapgolly.officeUiFabricReact.detailsRowTypesMod.ICellStyleProps
import typingsJapgolly.officeUiFabricReact.kinkeyofPickIDetailsRowSt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDetailsRowFieldsProps extends IOverrideColumnRenderProps {
  /**
    * Style properties to customize cell render output.
    */
  var cellStyleProps: js.UndefOr[ICellStyleProps] = js.undefined
  /**
    * Index to start for the column
    */
  var columnStartIndex: Double
  /**
    * Columns metadata
    */
  var columns: js.Array[IColumn]
  /**
    * whether to render as a compact field
    */
  var compact: js.UndefOr[Boolean] = js.undefined
  var enableUpdateAnimations: js.UndefOr[Boolean] = js.undefined
  /**
    * Data source for this component
    */
  var item: js.Any
  /**
    * The item index of the collection for the DetailsList
    */
  var itemIndex: Double
  /**
    * Subset of classnames currently generated in DetailsRow that are used within DetailsRowFields.
    */
  var rowClassNames: kinkeyofPickIDetailsRowSt
}

object IDetailsRowFieldsProps {
  @scala.inline
  def apply(
    columnStartIndex: Double,
    columns: js.Array[IColumn],
    item: js.Any,
    itemIndex: Double,
    rowClassNames: kinkeyofPickIDetailsRowSt,
    cellStyleProps: ICellStyleProps = null,
    cellsByColumn: StringDictionary[Node] = null,
    compact: js.UndefOr[Boolean] = js.undefined,
    enableUpdateAnimations: js.UndefOr[Boolean] = js.undefined,
    getCellValueKey: (/* item */ js.UndefOr[js.Any], /* index */ js.UndefOr[Double], /* column */ js.UndefOr[IColumn]) => CallbackTo[String] = null,
    onRenderItemColumn: (/* item */ js.UndefOr[js.Any], /* index */ js.UndefOr[Double], /* column */ js.UndefOr[IColumn]) => CallbackTo[Node] = null
  ): IDetailsRowFieldsProps = {
    val __obj = js.Dynamic.literal(columnStartIndex = columnStartIndex.asInstanceOf[js.Any], columns = columns.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], itemIndex = itemIndex.asInstanceOf[js.Any], rowClassNames = rowClassNames.asInstanceOf[js.Any])
    if (cellStyleProps != null) __obj.updateDynamic("cellStyleProps")(cellStyleProps.asInstanceOf[js.Any])
    if (cellsByColumn != null) __obj.updateDynamic("cellsByColumn")(cellsByColumn.asInstanceOf[js.Any])
    if (!js.isUndefined(compact)) __obj.updateDynamic("compact")(compact.asInstanceOf[js.Any])
    if (!js.isUndefined(enableUpdateAnimations)) __obj.updateDynamic("enableUpdateAnimations")(enableUpdateAnimations.asInstanceOf[js.Any])
    if (getCellValueKey != null) __obj.updateDynamic("getCellValueKey")(js.Any.fromFunction3((t0: /* item */ js.UndefOr[js.Any], t1: /* index */ js.UndefOr[scala.Double], t2: /* column */ js.UndefOr[typingsJapgolly.officeUiFabricReact.detailsListTypesMod.IColumn]) => getCellValueKey(t0, t1, t2).runNow()))
    if (onRenderItemColumn != null) __obj.updateDynamic("onRenderItemColumn")(js.Any.fromFunction3((t0: /* item */ js.UndefOr[js.Any], t1: /* index */ js.UndefOr[scala.Double], t2: /* column */ js.UndefOr[typingsJapgolly.officeUiFabricReact.detailsListTypesMod.IColumn]) => onRenderItemColumn(t0, t1, t2).runNow()))
    __obj.asInstanceOf[IDetailsRowFieldsProps]
  }
}

