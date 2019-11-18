package typingsJapgolly.antd.esTableInterfaceMod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableLocale extends js.Object {
  var collapse: js.UndefOr[String] = js.undefined
  var emptyText: js.UndefOr[Node | js.Function0[Node]] = js.undefined
  var expand: js.UndefOr[String] = js.undefined
  var filterConfirm: js.UndefOr[Node] = js.undefined
  var filterReset: js.UndefOr[Node] = js.undefined
  var filterTitle: js.UndefOr[String] = js.undefined
  var selectAll: js.UndefOr[Node] = js.undefined
  var selectInvert: js.UndefOr[Node] = js.undefined
  var sortTitle: js.UndefOr[String] = js.undefined
}

object TableLocale {
  @scala.inline
  def apply(
    collapse: String = null,
    emptyText: Node | js.Function0[Node] = null,
    expand: String = null,
    filterConfirm: VdomNode = null,
    filterReset: VdomNode = null,
    filterTitle: String = null,
    selectAll: VdomNode = null,
    selectInvert: VdomNode = null,
    sortTitle: String = null
  ): TableLocale = {
    val __obj = js.Dynamic.literal()
    if (collapse != null) __obj.updateDynamic("collapse")(collapse.asInstanceOf[js.Any])
    if (emptyText != null) __obj.updateDynamic("emptyText")(emptyText.asInstanceOf[js.Any])
    if (expand != null) __obj.updateDynamic("expand")(expand.asInstanceOf[js.Any])
    if (filterConfirm != null) __obj.updateDynamic("filterConfirm")(filterConfirm.rawNode.asInstanceOf[js.Any])
    if (filterReset != null) __obj.updateDynamic("filterReset")(filterReset.rawNode.asInstanceOf[js.Any])
    if (filterTitle != null) __obj.updateDynamic("filterTitle")(filterTitle.asInstanceOf[js.Any])
    if (selectAll != null) __obj.updateDynamic("selectAll")(selectAll.rawNode.asInstanceOf[js.Any])
    if (selectInvert != null) __obj.updateDynamic("selectInvert")(selectInvert.rawNode.asInstanceOf[js.Any])
    if (sortTitle != null) __obj.updateDynamic("sortTitle")(sortTitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableLocale]
  }
}

