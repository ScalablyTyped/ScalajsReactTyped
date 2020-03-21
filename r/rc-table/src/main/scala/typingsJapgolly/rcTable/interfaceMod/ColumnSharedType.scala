package typingsJapgolly.rcTable.interfaceMod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.react.mod.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnSharedType[RecordType] extends js.Object {
  var align: js.UndefOr[AlignType] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var ellipsis: js.UndefOr[Boolean] = js.undefined
  var fixed: js.UndefOr[FixedType] = js.undefined
  var key: js.UndefOr[Key] = js.undefined
  var onHeaderCell: js.UndefOr[
    GetComponentProps[
      /* import warning: importer.ImportType#apply Failed type conversion: rc-table.rc-table/lib/interface.ColumnsType<RecordType>[number] */ js.Any
    ]
  ] = js.undefined
  var title: js.UndefOr[Node] = js.undefined
}

object ColumnSharedType {
  @scala.inline
  def apply[RecordType](
    align: AlignType = null,
    className: String = null,
    ellipsis: js.UndefOr[Boolean] = js.undefined,
    fixed: FixedType = null,
    key: Key = null,
    onHeaderCell: (/* import warning: importer.ImportType#apply Failed type conversion: rc-table.rc-table/lib/interface.ColumnsType<RecordType>[number] */ js.Any, /* index */ js.UndefOr[Double]) => CallbackTo[HTMLAttributes[HTMLElement]] = null,
    title: VdomNode = null
  ): ColumnSharedType[RecordType] = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(ellipsis)) __obj.updateDynamic("ellipsis")(ellipsis.asInstanceOf[js.Any])
    if (fixed != null) __obj.updateDynamic("fixed")(fixed.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (onHeaderCell != null) __obj.updateDynamic("onHeaderCell")(js.Any.fromFunction2((t0: /* import warning: importer.ImportType#apply Failed type conversion: rc-table.rc-table/lib/interface.ColumnsType<RecordType>[number] */ js.Any, t1: /* index */ js.UndefOr[scala.Double]) => onHeaderCell(t0, t1).runNow()))
    if (title != null) __obj.updateDynamic("title")(title.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnSharedType[RecordType]]
  }
}

