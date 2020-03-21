package typingsJapgolly.ejWebAll.ej.TreeView

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Gets or sets a value that indicates whether to enable drag and drop a node within the same tree.
    * @Default {false}
    */
  var allowDragAndDrop: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable drag and drop a node in inter ej.TreeView.
    * @Default {true}
    */
  var allowDragAndDropAcrossControl: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to drop a node to a child of particular node.
    * @Default {true}
    */
  var allowDropChild: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to drop a node to a sibling of particular node.
    * @Default {true}
    */
  var allowDropSibling: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable node editing support for TreeView.
    * @Default {false}
    */
  var allowEditing: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable keyboard support for TreeView actions like nodeSelection, nodeEditing, nodeExpand, nodeCollapse, nodeCut and Paste.
    * @Default {true}
    */
  var allowKeyboardNavigation: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable multi selection support for TreeView.
    * @Default {false}
    */
  var allowMultiSelection: js.UndefOr[Boolean] = js.undefined
  /** Allow us to specify the parent and child nodes to get auto check while we check or uncheck a node.
    * @Default {true}
    */
  var autoCheck: js.UndefOr[Boolean] = js.undefined
  /** Allow us to specify the parent node to be retain in checked or unchecked state instead of going for indeterminate state.
    * @Default {false}
    */
  var autoCheckParentNode: js.UndefOr[Boolean] = js.undefined
  /** Fires before adding node to TreeView.
    */
  var beforeAdd: js.UndefOr[js.Function1[/* e */ BeforeAddEventArgs, Unit]] = js.undefined
  /** Fires before collapse a node.
    */
  var beforeCollapse: js.UndefOr[js.Function1[/* e */ BeforeCollapseEventArgs, Unit]] = js.undefined
  /** Fires before cut node in TreeView.
    */
  var beforeCut: js.UndefOr[js.Function1[/* e */ BeforeCutEventArgs, Unit]] = js.undefined
  /** Fires before deleting node in TreeView.
    */
  var beforeDelete: js.UndefOr[js.Function1[/* e */ BeforeDeleteEventArgs, Unit]] = js.undefined
  /** Fires before editing the node in TreeView.
    */
  var beforeEdit: js.UndefOr[js.Function1[/* e */ BeforeEditEventArgs, Unit]] = js.undefined
  /** Fires before expanding the node.
    */
  var beforeExpand: js.UndefOr[js.Function1[/* e */ BeforeExpandEventArgs, Unit]] = js.undefined
  /** Fires before loading nodes to TreeView.
    */
  var beforeLoad: js.UndefOr[js.Function1[/* e */ BeforeLoadEventArgs, Unit]] = js.undefined
  /** Fires before paste node in TreeView.
    */
  var beforePaste: js.UndefOr[js.Function1[/* e */ BeforePasteEventArgs, Unit]] = js.undefined
  /** Fires before selecting node in TreeView.
    */
  var beforeSelect: js.UndefOr[js.Function1[/* e */ BeforeSelectEventArgs, Unit]] = js.undefined
  /** Gets or sets a value that indicates the checkedNodes index collection as an array. The given array index position denotes the nodes, that are checked while rendering TreeView.
    * @Default {[]}
    */
  var checkedNodes: js.UndefOr[js.Array[_]] = js.undefined
  /** Fires when TreeView created successfully.
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.undefined
  /** Sets the root CSS class for TreeView which allow us to customize the appearance.
    */
  var cssClass: js.UndefOr[String] = js.undefined
  /** Fires when TreeView destroyed successfully.
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.undefined
  /** Gets or sets a value that indicates whether to enable or disable the animation effect while expanding or collapsing a node.
    * @Default {true}
    */
  var enableAnimation: js.UndefOr[Boolean] = js.undefined
  /** Allow us to prevent multiple nodes to be in expanded state. If it set to false, previously expanded node will be collapsed automatically, while we expand a node.
    * @Default {true}
    */
  var enableMultipleExpand: js.UndefOr[Boolean] = js.undefined
  /** Sets a value that indicates whether to persist the TreeView model state in page using applicable medium i.e., HTML5 localStorage or cookies
    * @Default {false}
    */
  var enablePersistence: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates to align content in the TreeView control from right to left by setting the property as true.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates whether a TreeView can be enabled or disabled. No actions can be performed while this property is set as false
    * @Default {true}
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates the TreeView node can be expand or collapse by using the specified action.
    * @Default {dblclick}
    */
  var expandOn: js.UndefOr[String] = js.undefined
  /** Gets or sets a array of value that indicates the expandedNodes index collection as an array. The given array index position denotes the nodes, that are expanded while rendering
    * TreeView.
    * @Default {[]}
    */
  var expandedNodes: js.UndefOr[js.Array[_]] = js.undefined
  /** Gets or sets a fields object that allow us to map the data members with field properties in order to make the data binding easier.
    * @Default {null}
    */
  var fields: js.UndefOr[Fields] = js.undefined
  /** Gets or sets a value that indicates whether to enable full row selection support for TreeView.
    * @Default {false}
    */
  var fullRowSelect: js.UndefOr[Boolean] = js.undefined
  /** Defines the height of the TreeView.
    * @Default {Null}
    */
  var height: js.UndefOr[String | Double] = js.undefined
  /** Specifies the HTML Attributes for the TreeView. Using this API we can add custom attributes in TreeView control.
    * @Default {{}}
    */
  var htmlAttributes: js.UndefOr[js.Any] = js.undefined
  /** Fires before nodeEdit Successful.
    */
  var inlineEditValidation: js.UndefOr[js.Function1[/* e */ InlineEditValidationEventArgs, Unit]] = js.undefined
  /** Fires when key pressed successfully.
    */
  var keyPress: js.UndefOr[js.Function1[/* e */ KeyPressEventArgs, Unit]] = js.undefined
  /** Fires when data load fails.
    */
  var loadError: js.UndefOr[js.Function1[/* e */ LoadErrorEventArgs, Unit]] = js.undefined
  /** Specifies the child nodes to be loaded on demand
    * @Default {false}
    */
  var loadOnDemand: js.UndefOr[Boolean] = js.undefined
  /** Fires when data loaded successfully.
    */
  var loadSuccess: js.UndefOr[js.Function1[/* e */ LoadSuccessEventArgs, Unit]] = js.undefined
  /** Fires once node added successfully.
    */
  var nodeAdd: js.UndefOr[js.Function1[/* e */ NodeAddEventArgs, Unit]] = js.undefined
  /** Fires once node checked successfully.
    */
  var nodeCheck: js.UndefOr[js.Function1[/* e */ NodeCheckEventArgs, Unit]] = js.undefined
  /** Fires when node clicked successfully.
    */
  var nodeClick: js.UndefOr[js.Function1[/* e */ NodeClickEventArgs, Unit]] = js.undefined
  /** Fires when node collapsed successfully.
    */
  var nodeCollapse: js.UndefOr[js.Function1[/* e */ NodeCollapseEventArgs, Unit]] = js.undefined
  /** Fires when node cut successfully.
    */
  var nodeCut: js.UndefOr[js.Function1[/* e */ NodeCutEventArgs, Unit]] = js.undefined
  /** Fires when node deleted successfully.
    */
  var nodeDelete: js.UndefOr[js.Function1[/* e */ NodeDeleteEventArgs, Unit]] = js.undefined
  /** Fires when node dragging.
    */
  var nodeDrag: js.UndefOr[js.Function1[/* e */ NodeDragEventArgs, Unit]] = js.undefined
  /** Fires once node drag start successfully.
    */
  var nodeDragStart: js.UndefOr[js.Function1[/* e */ NodeDragStartEventArgs, Unit]] = js.undefined
  /** Fires before the dragged node to be dropped.
    */
  var nodeDragStop: js.UndefOr[js.Function1[/* e */ NodeDragStopEventArgs, Unit]] = js.undefined
  /** Fires once node dropped successfully.
    */
  var nodeDropped: js.UndefOr[js.Function1[/* e */ NodeDroppedEventArgs, Unit]] = js.undefined
  /** Fires once node edited successfully.
    */
  var nodeEdit: js.UndefOr[js.Function1[/* e */ NodeEditEventArgs, Unit]] = js.undefined
  /** Fires once node expanded successfully.
    */
  var nodeExpand: js.UndefOr[js.Function1[/* e */ NodeExpandEventArgs, Unit]] = js.undefined
  /** Fires once node pasted successfully.
    */
  var nodePaste: js.UndefOr[js.Function1[/* e */ NodePasteEventArgs, Unit]] = js.undefined
  /** Fires when node selected successfully.
    */
  var nodeSelect: js.UndefOr[js.Function1[/* e */ NodeSelectEventArgs, Unit]] = js.undefined
  /** Fires once node unchecked successfully.
    */
  var nodeUncheck: js.UndefOr[js.Function1[/* e */ NodeUncheckEventArgs, Unit]] = js.undefined
  /** Fires once node unselected successfully.
    */
  var nodeUnselect: js.UndefOr[js.Function1[/* e */ NodeUnselectEventArgs, Unit]] = js.undefined
  /** Fires when TreeView nodes are loaded successfully
    */
  var ready: js.UndefOr[js.Function1[/* e */ ReadyEventArgs, Unit]] = js.undefined
  /** Gets or Sets a value that indicates the index position of a tree node. The particular index tree node will be selected while rendering the TreeView.
    * @Default {-1}
    */
  var selectedNode: js.UndefOr[Double] = js.undefined
  /** Gets or sets a value that indicates the selectedNodes index collection as an array. The given array index position denotes the nodes, that are selected while rendering TreeView.
    * @Default {[]}
    */
  var selectedNodes: js.UndefOr[js.Array[_]] = js.undefined
  /** Gets or sets a value that indicates whether to display or hide checkbox for all TreeView nodes.
    * @Default {false}
    */
  var showCheckbox: js.UndefOr[Boolean] = js.undefined
  /** By using sortSettings property, you can customize the sorting option in TreeView control.
    */
  var sortSettings: js.UndefOr[SortSettings] = js.undefined
  /** Allow us to use custom template in order to create TreeView.
    * @Default {null}
    */
  var template: js.UndefOr[String] = js.undefined
  /** Defines the width of the TreeView.
    * @Default {Null}
    */
  var width: js.UndefOr[String | Double] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    allowDragAndDrop: js.UndefOr[Boolean] = js.undefined,
    allowDragAndDropAcrossControl: js.UndefOr[Boolean] = js.undefined,
    allowDropChild: js.UndefOr[Boolean] = js.undefined,
    allowDropSibling: js.UndefOr[Boolean] = js.undefined,
    allowEditing: js.UndefOr[Boolean] = js.undefined,
    allowKeyboardNavigation: js.UndefOr[Boolean] = js.undefined,
    allowMultiSelection: js.UndefOr[Boolean] = js.undefined,
    autoCheck: js.UndefOr[Boolean] = js.undefined,
    autoCheckParentNode: js.UndefOr[Boolean] = js.undefined,
    beforeAdd: /* e */ BeforeAddEventArgs => Callback = null,
    beforeCollapse: /* e */ BeforeCollapseEventArgs => Callback = null,
    beforeCut: /* e */ BeforeCutEventArgs => Callback = null,
    beforeDelete: /* e */ BeforeDeleteEventArgs => Callback = null,
    beforeEdit: /* e */ BeforeEditEventArgs => Callback = null,
    beforeExpand: /* e */ BeforeExpandEventArgs => Callback = null,
    beforeLoad: /* e */ BeforeLoadEventArgs => Callback = null,
    beforePaste: /* e */ BeforePasteEventArgs => Callback = null,
    beforeSelect: /* e */ BeforeSelectEventArgs => Callback = null,
    checkedNodes: js.Array[_] = null,
    create: /* e */ CreateEventArgs => Callback = null,
    cssClass: String = null,
    destroy: /* e */ DestroyEventArgs => Callback = null,
    enableAnimation: js.UndefOr[Boolean] = js.undefined,
    enableMultipleExpand: js.UndefOr[Boolean] = js.undefined,
    enablePersistence: js.UndefOr[Boolean] = js.undefined,
    enableRTL: js.UndefOr[Boolean] = js.undefined,
    enabled: js.UndefOr[Boolean] = js.undefined,
    expandOn: String = null,
    expandedNodes: js.Array[_] = null,
    fields: Fields = null,
    fullRowSelect: js.UndefOr[Boolean] = js.undefined,
    height: String | Double = null,
    htmlAttributes: js.Any = null,
    inlineEditValidation: /* e */ InlineEditValidationEventArgs => Callback = null,
    keyPress: /* e */ KeyPressEventArgs => Callback = null,
    loadError: /* e */ LoadErrorEventArgs => Callback = null,
    loadOnDemand: js.UndefOr[Boolean] = js.undefined,
    loadSuccess: /* e */ LoadSuccessEventArgs => Callback = null,
    nodeAdd: /* e */ NodeAddEventArgs => Callback = null,
    nodeCheck: /* e */ NodeCheckEventArgs => Callback = null,
    nodeClick: /* e */ NodeClickEventArgs => Callback = null,
    nodeCollapse: /* e */ NodeCollapseEventArgs => Callback = null,
    nodeCut: /* e */ NodeCutEventArgs => Callback = null,
    nodeDelete: /* e */ NodeDeleteEventArgs => Callback = null,
    nodeDrag: /* e */ NodeDragEventArgs => Callback = null,
    nodeDragStart: /* e */ NodeDragStartEventArgs => Callback = null,
    nodeDragStop: /* e */ NodeDragStopEventArgs => Callback = null,
    nodeDropped: /* e */ NodeDroppedEventArgs => Callback = null,
    nodeEdit: /* e */ NodeEditEventArgs => Callback = null,
    nodeExpand: /* e */ NodeExpandEventArgs => Callback = null,
    nodePaste: /* e */ NodePasteEventArgs => Callback = null,
    nodeSelect: /* e */ NodeSelectEventArgs => Callback = null,
    nodeUncheck: /* e */ NodeUncheckEventArgs => Callback = null,
    nodeUnselect: /* e */ NodeUnselectEventArgs => Callback = null,
    ready: /* e */ ReadyEventArgs => Callback = null,
    selectedNode: Int | Double = null,
    selectedNodes: js.Array[_] = null,
    showCheckbox: js.UndefOr[Boolean] = js.undefined,
    sortSettings: SortSettings = null,
    template: String = null,
    width: String | Double = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowDragAndDrop)) __obj.updateDynamic("allowDragAndDrop")(allowDragAndDrop.asInstanceOf[js.Any])
    if (!js.isUndefined(allowDragAndDropAcrossControl)) __obj.updateDynamic("allowDragAndDropAcrossControl")(allowDragAndDropAcrossControl.asInstanceOf[js.Any])
    if (!js.isUndefined(allowDropChild)) __obj.updateDynamic("allowDropChild")(allowDropChild.asInstanceOf[js.Any])
    if (!js.isUndefined(allowDropSibling)) __obj.updateDynamic("allowDropSibling")(allowDropSibling.asInstanceOf[js.Any])
    if (!js.isUndefined(allowEditing)) __obj.updateDynamic("allowEditing")(allowEditing.asInstanceOf[js.Any])
    if (!js.isUndefined(allowKeyboardNavigation)) __obj.updateDynamic("allowKeyboardNavigation")(allowKeyboardNavigation.asInstanceOf[js.Any])
    if (!js.isUndefined(allowMultiSelection)) __obj.updateDynamic("allowMultiSelection")(allowMultiSelection.asInstanceOf[js.Any])
    if (!js.isUndefined(autoCheck)) __obj.updateDynamic("autoCheck")(autoCheck.asInstanceOf[js.Any])
    if (!js.isUndefined(autoCheckParentNode)) __obj.updateDynamic("autoCheckParentNode")(autoCheckParentNode.asInstanceOf[js.Any])
    if (beforeAdd != null) __obj.updateDynamic("beforeAdd")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.TreeView.BeforeAddEventArgs) => beforeAdd(t0).runNow()))
    if (beforeCollapse != null) __obj.updateDynamic("beforeCollapse")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.TreeView.BeforeCollapseEventArgs) => beforeCollapse(t0).runNow()))
    if (beforeCut != null) __obj.updateDynamic("beforeCut")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.TreeView.BeforeCutEventArgs) => beforeCut(t0).runNow()))
    if (beforeDelete != null) __obj.updateDynamic("beforeDelete")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.TreeView.BeforeDeleteEventArgs) => beforeDelete(t0).runNow()))
    if (beforeEdit != null) __obj.updateDynamic("beforeEdit")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.TreeView.BeforeEditEventArgs) => beforeEdit(t0).runNow()))
    if (beforeExpand != null) __obj.updateDynamic("beforeExpand")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.TreeView.BeforeExpandEventArgs) => beforeExpand(t0).runNow()))
    if (beforeLoad != null) __obj.updateDynamic("beforeLoad")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.TreeView.BeforeLoadEventArgs) => beforeLoad(t0).runNow()))
    if (beforePaste != null) __obj.updateDynamic("beforePaste")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.TreeView.BeforePasteEventArgs) => beforePaste(t0).runNow()))
    if (beforeSelect != null) __obj.updateDynamic("beforeSelect")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.TreeView.BeforeSelectEventArgs) => beforeSelect(t0).runNow()))
    if (checkedNodes != null) __obj.updateDynamic("checkedNodes")(checkedNodes.asInstanceOf[js.Any])
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.TreeView.CreateEventArgs) => create(t0).runNow()))
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.TreeView.DestroyEventArgs) => destroy(t0).runNow()))
    if (!js.isUndefined(enableAnimation)) __obj.updateDynamic("enableAnimation")(enableAnimation.asInstanceOf[js.Any])
    if (!js.isUndefined(enableMultipleExpand)) __obj.updateDynamic("enableMultipleExpand")(enableMultipleExpand.asInstanceOf[js.Any])
    if (!js.isUndefined(enablePersistence)) __obj.updateDynamic("enablePersistence")(enablePersistence.asInstanceOf[js.Any])
    if (!js.isUndefined(enableRTL)) __obj.updateDynamic("enableRTL")(enableRTL.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (expandOn != null) __obj.updateDynamic("expandOn")(expandOn.asInstanceOf[js.Any])
    if (expandedNodes != null) __obj.updateDynamic("expandedNodes")(expandedNodes.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (!js.isUndefined(fullRowSelect)) __obj.updateDynamic("fullRowSelect")(fullRowSelect.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (htmlAttributes != null) __obj.updateDynamic("htmlAttributes")(htmlAttributes.asInstanceOf[js.Any])
    if (inlineEditValidation != null) __obj.updateDynamic("inlineEditValidation")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.TreeView.InlineEditValidationEventArgs) => inlineEditValidation(t0).runNow()))
    if (keyPress != null) __obj.updateDynamic("keyPress")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.TreeView.KeyPressEventArgs) => keyPress(t0).runNow()))
    if (loadError != null) __obj.updateDynamic("loadError")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.TreeView.LoadErrorEventArgs) => loadError(t0).runNow()))
    if (!js.isUndefined(loadOnDemand)) __obj.updateDynamic("loadOnDemand")(loadOnDemand.asInstanceOf[js.Any])
    if (loadSuccess != null) __obj.updateDynamic("loadSuccess")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.TreeView.LoadSuccessEventArgs) => loadSuccess(t0).runNow()))
    if (nodeAdd != null) __obj.updateDynamic("nodeAdd")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.TreeView.NodeAddEventArgs) => nodeAdd(t0).runNow()))
    if (nodeCheck != null) __obj.updateDynamic("nodeCheck")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.TreeView.NodeCheckEventArgs) => nodeCheck(t0).runNow()))
    if (nodeClick != null) __obj.updateDynamic("nodeClick")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.TreeView.NodeClickEventArgs) => nodeClick(t0).runNow()))
    if (nodeCollapse != null) __obj.updateDynamic("nodeCollapse")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.TreeView.NodeCollapseEventArgs) => nodeCollapse(t0).runNow()))
    if (nodeCut != null) __obj.updateDynamic("nodeCut")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.TreeView.NodeCutEventArgs) => nodeCut(t0).runNow()))
    if (nodeDelete != null) __obj.updateDynamic("nodeDelete")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.TreeView.NodeDeleteEventArgs) => nodeDelete(t0).runNow()))
    if (nodeDrag != null) __obj.updateDynamic("nodeDrag")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.TreeView.NodeDragEventArgs) => nodeDrag(t0).runNow()))
    if (nodeDragStart != null) __obj.updateDynamic("nodeDragStart")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.TreeView.NodeDragStartEventArgs) => nodeDragStart(t0).runNow()))
    if (nodeDragStop != null) __obj.updateDynamic("nodeDragStop")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.TreeView.NodeDragStopEventArgs) => nodeDragStop(t0).runNow()))
    if (nodeDropped != null) __obj.updateDynamic("nodeDropped")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.TreeView.NodeDroppedEventArgs) => nodeDropped(t0).runNow()))
    if (nodeEdit != null) __obj.updateDynamic("nodeEdit")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.TreeView.NodeEditEventArgs) => nodeEdit(t0).runNow()))
    if (nodeExpand != null) __obj.updateDynamic("nodeExpand")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.TreeView.NodeExpandEventArgs) => nodeExpand(t0).runNow()))
    if (nodePaste != null) __obj.updateDynamic("nodePaste")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.TreeView.NodePasteEventArgs) => nodePaste(t0).runNow()))
    if (nodeSelect != null) __obj.updateDynamic("nodeSelect")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.TreeView.NodeSelectEventArgs) => nodeSelect(t0).runNow()))
    if (nodeUncheck != null) __obj.updateDynamic("nodeUncheck")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.TreeView.NodeUncheckEventArgs) => nodeUncheck(t0).runNow()))
    if (nodeUnselect != null) __obj.updateDynamic("nodeUnselect")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.TreeView.NodeUnselectEventArgs) => nodeUnselect(t0).runNow()))
    if (ready != null) __obj.updateDynamic("ready")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.TreeView.ReadyEventArgs) => ready(t0).runNow()))
    if (selectedNode != null) __obj.updateDynamic("selectedNode")(selectedNode.asInstanceOf[js.Any])
    if (selectedNodes != null) __obj.updateDynamic("selectedNodes")(selectedNodes.asInstanceOf[js.Any])
    if (!js.isUndefined(showCheckbox)) __obj.updateDynamic("showCheckbox")(showCheckbox.asInstanceOf[js.Any])
    if (sortSettings != null) __obj.updateDynamic("sortSettings")(sortSettings.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
}

