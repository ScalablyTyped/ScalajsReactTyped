package typingsJapgolly.bootstrapTreeview

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BootstrapTreeViewOptions extends js.Object {
  var backColor: js.UndefOr[String] = js.undefined
  var borderColor: js.UndefOr[String] = js.undefined
  var checkedIcon: js.UndefOr[String] = js.undefined
  var collapseIcon: js.UndefOr[String] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var data: js.UndefOr[js.Array[BootstrapTreeViewNodeData]] = js.undefined
  var emptyIcon: js.UndefOr[String] = js.undefined
  var enableLinks: js.UndefOr[Boolean] = js.undefined
  var expandIcon: js.UndefOr[String] = js.undefined
  var highlightSearchResults: js.UndefOr[Boolean] = js.undefined
  var highlightSelected: js.UndefOr[Boolean] = js.undefined
  var levels: js.UndefOr[Double] = js.undefined
  var multiSelect: js.UndefOr[Boolean] = js.undefined
  var nodeIcon: js.UndefOr[String] = js.undefined
  var onNodeChecked: js.UndefOr[js.Function2[/* event */ js.Any, /* node */ BootstrapTreeViewNodeData, Unit]] = js.undefined
  var onNodeCollapsed: js.UndefOr[js.Function2[/* event */ js.Any, /* node */ BootstrapTreeViewNodeData, Unit]] = js.undefined
  var onNodeDisabled: js.UndefOr[js.Function2[/* event */ js.Any, /* node */ BootstrapTreeViewNodeData, Unit]] = js.undefined
  var onNodeEnabled: js.UndefOr[js.Function2[/* event */ js.Any, /* node */ BootstrapTreeViewNodeData, Unit]] = js.undefined
  var onNodeExpanded: js.UndefOr[js.Function2[/* event */ js.Any, /* node */ BootstrapTreeViewNodeData, Unit]] = js.undefined
  var onNodeSelected: js.UndefOr[js.Function2[/* event */ js.Any, /* node */ BootstrapTreeViewNodeData, Unit]] = js.undefined
  var onNodeUnchecked: js.UndefOr[js.Function2[/* event */ js.Any, /* node */ BootstrapTreeViewNodeData, Unit]] = js.undefined
  var onNodeUnselected: js.UndefOr[js.Function2[/* event */ js.Any, /* node */ BootstrapTreeViewNodeData, Unit]] = js.undefined
  var onSearchCleared: js.UndefOr[js.Function2[/* event */ js.Any, /* node */ BootstrapTreeViewNodeData, Unit]] = js.undefined
  var onSearchComplete: js.UndefOr[js.Function2[/* event */ js.Any, /* node */ BootstrapTreeViewNodeData, Unit]] = js.undefined
  var onhoverColor: js.UndefOr[String] = js.undefined
  var searchResultBackColor: js.UndefOr[String] = js.undefined
  var searchResultColor: js.UndefOr[String] = js.undefined
  var selectedBackColor: js.UndefOr[String] = js.undefined
  var selectedColor: js.UndefOr[String] = js.undefined
  var selectedIcon: js.UndefOr[String] = js.undefined
  var showBorder: js.UndefOr[Boolean] = js.undefined
  var showCheckbox: js.UndefOr[Boolean] = js.undefined
  var showIcon: js.UndefOr[Boolean] = js.undefined
  var showTags: js.UndefOr[Boolean] = js.undefined
  var uncheckedIcon: js.UndefOr[Boolean] = js.undefined
}

object BootstrapTreeViewOptions {
  @scala.inline
  def apply(
    backColor: String = null,
    borderColor: String = null,
    checkedIcon: String = null,
    collapseIcon: String = null,
    color: String = null,
    data: js.Array[BootstrapTreeViewNodeData] = null,
    emptyIcon: String = null,
    enableLinks: js.UndefOr[Boolean] = js.undefined,
    expandIcon: String = null,
    highlightSearchResults: js.UndefOr[Boolean] = js.undefined,
    highlightSelected: js.UndefOr[Boolean] = js.undefined,
    levels: Int | Double = null,
    multiSelect: js.UndefOr[Boolean] = js.undefined,
    nodeIcon: String = null,
    onNodeChecked: (/* event */ js.Any, /* node */ BootstrapTreeViewNodeData) => Callback = null,
    onNodeCollapsed: (/* event */ js.Any, /* node */ BootstrapTreeViewNodeData) => Callback = null,
    onNodeDisabled: (/* event */ js.Any, /* node */ BootstrapTreeViewNodeData) => Callback = null,
    onNodeEnabled: (/* event */ js.Any, /* node */ BootstrapTreeViewNodeData) => Callback = null,
    onNodeExpanded: (/* event */ js.Any, /* node */ BootstrapTreeViewNodeData) => Callback = null,
    onNodeSelected: (/* event */ js.Any, /* node */ BootstrapTreeViewNodeData) => Callback = null,
    onNodeUnchecked: (/* event */ js.Any, /* node */ BootstrapTreeViewNodeData) => Callback = null,
    onNodeUnselected: (/* event */ js.Any, /* node */ BootstrapTreeViewNodeData) => Callback = null,
    onSearchCleared: (/* event */ js.Any, /* node */ BootstrapTreeViewNodeData) => Callback = null,
    onSearchComplete: (/* event */ js.Any, /* node */ BootstrapTreeViewNodeData) => Callback = null,
    onhoverColor: String = null,
    searchResultBackColor: String = null,
    searchResultColor: String = null,
    selectedBackColor: String = null,
    selectedColor: String = null,
    selectedIcon: String = null,
    showBorder: js.UndefOr[Boolean] = js.undefined,
    showCheckbox: js.UndefOr[Boolean] = js.undefined,
    showIcon: js.UndefOr[Boolean] = js.undefined,
    showTags: js.UndefOr[Boolean] = js.undefined,
    uncheckedIcon: js.UndefOr[Boolean] = js.undefined
  ): BootstrapTreeViewOptions = {
    val __obj = js.Dynamic.literal()
    if (backColor != null) __obj.updateDynamic("backColor")(backColor.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (checkedIcon != null) __obj.updateDynamic("checkedIcon")(checkedIcon.asInstanceOf[js.Any])
    if (collapseIcon != null) __obj.updateDynamic("collapseIcon")(collapseIcon.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (emptyIcon != null) __obj.updateDynamic("emptyIcon")(emptyIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(enableLinks)) __obj.updateDynamic("enableLinks")(enableLinks.asInstanceOf[js.Any])
    if (expandIcon != null) __obj.updateDynamic("expandIcon")(expandIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(highlightSearchResults)) __obj.updateDynamic("highlightSearchResults")(highlightSearchResults.asInstanceOf[js.Any])
    if (!js.isUndefined(highlightSelected)) __obj.updateDynamic("highlightSelected")(highlightSelected.asInstanceOf[js.Any])
    if (levels != null) __obj.updateDynamic("levels")(levels.asInstanceOf[js.Any])
    if (!js.isUndefined(multiSelect)) __obj.updateDynamic("multiSelect")(multiSelect.asInstanceOf[js.Any])
    if (nodeIcon != null) __obj.updateDynamic("nodeIcon")(nodeIcon.asInstanceOf[js.Any])
    if (onNodeChecked != null) __obj.updateDynamic("onNodeChecked")(js.Any.fromFunction2((t0: /* event */ js.Any, t1: /* node */ typingsJapgolly.bootstrapTreeview.BootstrapTreeViewNodeData) => onNodeChecked(t0, t1).runNow()))
    if (onNodeCollapsed != null) __obj.updateDynamic("onNodeCollapsed")(js.Any.fromFunction2((t0: /* event */ js.Any, t1: /* node */ typingsJapgolly.bootstrapTreeview.BootstrapTreeViewNodeData) => onNodeCollapsed(t0, t1).runNow()))
    if (onNodeDisabled != null) __obj.updateDynamic("onNodeDisabled")(js.Any.fromFunction2((t0: /* event */ js.Any, t1: /* node */ typingsJapgolly.bootstrapTreeview.BootstrapTreeViewNodeData) => onNodeDisabled(t0, t1).runNow()))
    if (onNodeEnabled != null) __obj.updateDynamic("onNodeEnabled")(js.Any.fromFunction2((t0: /* event */ js.Any, t1: /* node */ typingsJapgolly.bootstrapTreeview.BootstrapTreeViewNodeData) => onNodeEnabled(t0, t1).runNow()))
    if (onNodeExpanded != null) __obj.updateDynamic("onNodeExpanded")(js.Any.fromFunction2((t0: /* event */ js.Any, t1: /* node */ typingsJapgolly.bootstrapTreeview.BootstrapTreeViewNodeData) => onNodeExpanded(t0, t1).runNow()))
    if (onNodeSelected != null) __obj.updateDynamic("onNodeSelected")(js.Any.fromFunction2((t0: /* event */ js.Any, t1: /* node */ typingsJapgolly.bootstrapTreeview.BootstrapTreeViewNodeData) => onNodeSelected(t0, t1).runNow()))
    if (onNodeUnchecked != null) __obj.updateDynamic("onNodeUnchecked")(js.Any.fromFunction2((t0: /* event */ js.Any, t1: /* node */ typingsJapgolly.bootstrapTreeview.BootstrapTreeViewNodeData) => onNodeUnchecked(t0, t1).runNow()))
    if (onNodeUnselected != null) __obj.updateDynamic("onNodeUnselected")(js.Any.fromFunction2((t0: /* event */ js.Any, t1: /* node */ typingsJapgolly.bootstrapTreeview.BootstrapTreeViewNodeData) => onNodeUnselected(t0, t1).runNow()))
    if (onSearchCleared != null) __obj.updateDynamic("onSearchCleared")(js.Any.fromFunction2((t0: /* event */ js.Any, t1: /* node */ typingsJapgolly.bootstrapTreeview.BootstrapTreeViewNodeData) => onSearchCleared(t0, t1).runNow()))
    if (onSearchComplete != null) __obj.updateDynamic("onSearchComplete")(js.Any.fromFunction2((t0: /* event */ js.Any, t1: /* node */ typingsJapgolly.bootstrapTreeview.BootstrapTreeViewNodeData) => onSearchComplete(t0, t1).runNow()))
    if (onhoverColor != null) __obj.updateDynamic("onhoverColor")(onhoverColor.asInstanceOf[js.Any])
    if (searchResultBackColor != null) __obj.updateDynamic("searchResultBackColor")(searchResultBackColor.asInstanceOf[js.Any])
    if (searchResultColor != null) __obj.updateDynamic("searchResultColor")(searchResultColor.asInstanceOf[js.Any])
    if (selectedBackColor != null) __obj.updateDynamic("selectedBackColor")(selectedBackColor.asInstanceOf[js.Any])
    if (selectedColor != null) __obj.updateDynamic("selectedColor")(selectedColor.asInstanceOf[js.Any])
    if (selectedIcon != null) __obj.updateDynamic("selectedIcon")(selectedIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(showBorder)) __obj.updateDynamic("showBorder")(showBorder.asInstanceOf[js.Any])
    if (!js.isUndefined(showCheckbox)) __obj.updateDynamic("showCheckbox")(showCheckbox.asInstanceOf[js.Any])
    if (!js.isUndefined(showIcon)) __obj.updateDynamic("showIcon")(showIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(showTags)) __obj.updateDynamic("showTags")(showTags.asInstanceOf[js.Any])
    if (!js.isUndefined(uncheckedIcon)) __obj.updateDynamic("uncheckedIcon")(uncheckedIcon.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapTreeViewOptions]
  }
}

