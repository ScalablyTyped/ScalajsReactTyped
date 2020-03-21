package typingsJapgolly.ejWebAll.ej.datavisualization.Diagram

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Triggers When auto scroll is changed
    */
  var autoScrollChange: js.UndefOr[js.Function1[/* e */ AutoScrollChangeEventArgs, Unit]] = js.undefined
  /** Defines the background color of diagram elements
    * @Default {transparent}
    */
  var backgroundColor: js.UndefOr[String] = js.undefined
  /** Defines the path of the background image of diagram elements
    */
  var backgroundImage: js.UndefOr[String] = js.undefined
  /** Sets the direction of line bridges.
    * @Default {ej.datavisualization.Diagram.BridgeDirection.Top}
    */
  var bridgeDirection: js.UndefOr[BridgeDirection | String] = js.undefined
  /** Triggers when a node, connector or diagram is clicked
    */
  var click: js.UndefOr[js.Function1[/* e */ ClickEventArgs, Unit]] = js.undefined
  /** Defines a set of custom commands and binds them with a set of desired key gestures.
    */
  var commandManager: js.UndefOr[CommandManager] = js.undefined
  /** Triggers when the connection is changed
    */
  var connectionChange: js.UndefOr[js.Function1[/* e */ ConnectionChangeEventArgs, Unit]] = js.undefined
  /** Triggers when the connector collection is changed
    */
  var connectorCollectionChange: js.UndefOr[js.Function1[/* e */ ConnectorCollectionChangeEventArgs, Unit]] = js.undefined
  /** Triggers when the connectors' source point is changed
    */
  var connectorSourceChange: js.UndefOr[js.Function1[/* e */ ConnectorSourceChangeEventArgs, Unit]] = js.undefined
  /** Triggers when the connectors' target point is changed
    */
  var connectorTargetChange: js.UndefOr[js.Function1[/* e */ ConnectorTargetChangeEventArgs, Unit]] = js.undefined
  /** Binds the custom JSON data with connector properties
    * @Default {null}
    */
  var connectorTemplate: js.UndefOr[js.Any] = js.undefined
  /** A collection of JSON objects where each object represents a connector
    * @Default {[]}
    */
  var connectors: js.UndefOr[js.Array[Connector]] = js.undefined
  /** Enables/Disables the default behaviors of the diagram.
    * @Default {ej.datavisualization.Diagram.DiagramConstraints.All}
    */
  var constraints: js.UndefOr[DiagramConstraints | String] = js.undefined
  /** An object to customize the context menu of diagram
    */
  var contextMenu: js.UndefOr[ContextMenu] = js.undefined
  /** Triggers before opening the context menu
    */
  var contextMenuBeforeOpen: js.UndefOr[js.Function1[/* e */ ContextMenuBeforeOpenEventArgs, Unit]] = js.undefined
  /** Triggers when a context menu item is clicked
    */
  var contextMenuClick: js.UndefOr[js.Function1[/* e */ ContextMenuClickEventArgs, Unit]] = js.undefined
  /** Triggered when the diagram is rendered completely.
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.undefined
  /** Configures the data source that is to be bound with diagram
    */
  var dataSourceSettings: js.UndefOr[DataSourceSettings] = js.undefined
  /** Initializes the default values for nodes and connectors
    * @Default {{}}
    */
  var defaultSettings: js.UndefOr[DefaultSettings] = js.undefined
  /** Triggers when a node, connector or diagram model is clicked twice
    */
  var doubleClick: js.UndefOr[js.Function1[/* e */ DoubleClickEventArgs, Unit]] = js.undefined
  /** Triggers while dragging the elements in diagram
    */
  var drag: js.UndefOr[js.Function1[/* e */ DragEventArgs, Unit]] = js.undefined
  /** Triggers when a symbol is dragged into diagram from symbol palette
    */
  var dragEnter: js.UndefOr[js.Function1[/* e */ DragEnterEventArgs, Unit]] = js.undefined
  /** Triggers when a symbol is dragged outside of the diagram.
    */
  var dragLeave: js.UndefOr[js.Function1[/* e */ DragLeaveEventArgs, Unit]] = js.undefined
  /** Triggers when a symbol is dragged over diagram
    */
  var dragOver: js.UndefOr[js.Function1[/* e */ DragOverEventArgs, Unit]] = js.undefined
  /** Sets the type of JSON object to be drawn through drawing tool
    * @Default {{}}
    */
  var drawType: js.UndefOr[js.Any] = js.undefined
  /** Triggers when a symbol is dragged and dropped from symbol palette to drawing area
    */
  var drop: js.UndefOr[js.Function1[/* e */ DropEventArgs, Unit]] = js.undefined
  /** Triggers when editor got focus at the time of node's label or text node editing.
    */
  var editorFocusChange: js.UndefOr[js.Function1[/* e */ EditorFocusChangeEventArgs, Unit]] = js.undefined
  /** Enables or disables auto scroll in diagram
    * @Default {true}
    */
  var enableAutoScroll: js.UndefOr[Boolean] = js.undefined
  /** Enables or disables diagram context menu
    * @Default {true}
    */
  var enableContextMenu: js.UndefOr[Boolean] = js.undefined
  /** Triggers when a child is added to or removed from a group
    */
  var groupChange: js.UndefOr[js.Function1[/* e */ GroupChangeEventArgs, Unit]] = js.undefined
  /** Specifies the height of the diagram
    * @Default {null}
    */
  var height: js.UndefOr[String] = js.undefined
  /** Triggers when a change is reverted or restored(undo/redo)
    */
  var historyChange: js.UndefOr[js.Function1[/* e */ HistoryChangeEventArgs, Unit]] = js.undefined
  /** Customizes the undo redo functionality
    */
  var historyManager: js.UndefOr[HistoryManager] = js.undefined
  /** Triggers when a diagram element is clicked
    */
  var itemClick: js.UndefOr[js.Function1[/* e */ ItemClickEventArgs, Unit]] = js.undefined
  /** Defines the type of the rendering mode of label.
    * @Default {HTML}
    */
  var labelRenderingMode: js.UndefOr[LabelRenderingMode | String] = js.undefined
  /** A collection of JSON objects where each object represents a layer. Layer is a named category of diagram shapes.
    * @Default {[]}
    */
  var layers: js.UndefOr[js.Array[Layer]] = js.undefined
  /** Automatically arranges the nodes and connectors in a predefined manner.
    */
  var layout: js.UndefOr[Layout] = js.undefined
  /** Defines the current culture of diagram
    * @Default {en-US}
    */
  var locale: js.UndefOr[String] = js.undefined
  /** Triggers when mouse enters a node/connector
    */
  var mouseEnter: js.UndefOr[js.Function1[/* e */ MouseEnterEventArgs, Unit]] = js.undefined
  /** Triggers when mouse leaves node/connector
    */
  var mouseLeave: js.UndefOr[js.Function1[/* e */ MouseLeaveEventArgs, Unit]] = js.undefined
  /** Triggers when mouse hovers over a node/connector
    */
  var mouseOver: js.UndefOr[js.Function1[/* e */ MouseOverEventArgs, Unit]] = js.undefined
  /** Triggers when node collection is changed
    */
  var nodeCollectionChange: js.UndefOr[js.Function1[/* e */ NodeCollectionChangeEventArgs, Unit]] = js.undefined
  /** Binds the custom JSON data with node properties
    * @Default {null}
    */
  var nodeTemplate: js.UndefOr[js.Any] = js.undefined
  /** Array of JSON objects where each object represents a node
    * @Default {[]}
    */
  var nodes: js.UndefOr[js.Array[Node]] = js.undefined
  /** Defines the size and appearance of diagram page
    */
  var pageSettings: js.UndefOr[PageSettings] = js.undefined
  /** Triggers when the node properties(x, y,width and height alone) are changed using nudge commands or updateNode API.
    */
  var propertyChange: js.UndefOr[js.Function1[/* e */ PropertyChangeEventArgs, Unit]] = js.undefined
  /** Triggers when the diagram elements are rotated
    */
  var rotationChange: js.UndefOr[js.Function1[/* e */ RotationChangeEventArgs, Unit]] = js.undefined
  /** Defines the properties of the both the horizontal and vertical gauge to measure the diagram area.
    */
  var rulerSettings: js.UndefOr[RulerSettings] = js.undefined
  /** Triggers when the diagram is zoomed or panned
    */
  var scrollChange: js.UndefOr[js.Function1[/* e */ ScrollChangeEventArgs, Unit]] = js.undefined
  /** Defines the zoom value, zoom factor, scroll status and view port size of the diagram
    */
  var scrollSettings: js.UndefOr[ScrollSettings] = js.undefined
  /** Triggers when a connector segment is edited
    */
  var segmentChange: js.UndefOr[js.Function1[/* e */ SegmentChangeEventArgs, Unit]] = js.undefined
  /** Defines the size and position of selected items and defines the appearance of selector
    */
  var selectedItems: js.UndefOr[SelectedItems] = js.undefined
  /** Triggers when the selection is changed in diagram
    */
  var selectionChange: js.UndefOr[js.Function1[/* e */ SelectionChangeEventArgs, Unit]] = js.undefined
  /** Defines diagram serialization properties that would defines how the serialization content would be.
    */
  var serializationSettings: js.UndefOr[SerializationSettings] = js.undefined
  /** Used to decide on the action on Diagramming elements at runtime.
    */
  var setTool: js.UndefOr[js.Function1[/* e */ SetToolEventArgs, Unit]] = js.undefined
  /** Enables or disables tooltip of diagram
    * @Default {true}
    */
  var showTooltip: js.UndefOr[Boolean] = js.undefined
  /** Triggers when a node is resized
    */
  var sizeChange: js.UndefOr[js.Function1[/* e */ SizeChangeEventArgs, Unit]] = js.undefined
  /** Defines the gridlines and defines how and when the objects have to be snapped
    */
  var snapSettings: js.UndefOr[SnapSettings] = js.undefined
  /** Triggers when label editing is ended
    */
  var textChange: js.UndefOr[js.Function1[/* e */ TextChangeEventArgs, Unit]] = js.undefined
  /** Enables/Disables the interactive behaviors of diagram.
    * @Default {ej.datavisualization.Diagram.Tool.All}
    */
  var tool: js.UndefOr[Tool | String] = js.undefined
  /** An object that defines the description, appearance and alignments of tooltips
    * @Default {null}
    */
  var tooltip: js.UndefOr[Tooltip] = js.undefined
  /** Specifies the width of the diagram
    * @Default {null}
    */
  var width: js.UndefOr[String] = js.undefined
  /** Sets the factor by which we can zoom in or zoom out
    * @Default {0.2}
    */
  var zoomFactor: js.UndefOr[Double] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    autoScrollChange: /* e */ AutoScrollChangeEventArgs => Callback = null,
    backgroundColor: String = null,
    backgroundImage: String = null,
    bridgeDirection: BridgeDirection | String = null,
    click: /* e */ ClickEventArgs => Callback = null,
    commandManager: CommandManager = null,
    connectionChange: /* e */ ConnectionChangeEventArgs => Callback = null,
    connectorCollectionChange: /* e */ ConnectorCollectionChangeEventArgs => Callback = null,
    connectorSourceChange: /* e */ ConnectorSourceChangeEventArgs => Callback = null,
    connectorTargetChange: /* e */ ConnectorTargetChangeEventArgs => Callback = null,
    connectorTemplate: js.Any = null,
    connectors: js.Array[Connector] = null,
    constraints: DiagramConstraints | String = null,
    contextMenu: ContextMenu = null,
    contextMenuBeforeOpen: /* e */ ContextMenuBeforeOpenEventArgs => Callback = null,
    contextMenuClick: /* e */ ContextMenuClickEventArgs => Callback = null,
    create: /* e */ CreateEventArgs => Callback = null,
    dataSourceSettings: DataSourceSettings = null,
    defaultSettings: DefaultSettings = null,
    doubleClick: /* e */ DoubleClickEventArgs => Callback = null,
    drag: /* e */ DragEventArgs => Callback = null,
    dragEnter: /* e */ DragEnterEventArgs => Callback = null,
    dragLeave: /* e */ DragLeaveEventArgs => Callback = null,
    dragOver: /* e */ DragOverEventArgs => Callback = null,
    drawType: js.Any = null,
    drop: /* e */ DropEventArgs => Callback = null,
    editorFocusChange: /* e */ EditorFocusChangeEventArgs => Callback = null,
    enableAutoScroll: js.UndefOr[Boolean] = js.undefined,
    enableContextMenu: js.UndefOr[Boolean] = js.undefined,
    groupChange: /* e */ GroupChangeEventArgs => Callback = null,
    height: String = null,
    historyChange: /* e */ HistoryChangeEventArgs => Callback = null,
    historyManager: HistoryManager = null,
    itemClick: /* e */ ItemClickEventArgs => Callback = null,
    labelRenderingMode: LabelRenderingMode | String = null,
    layers: js.Array[Layer] = null,
    layout: Layout = null,
    locale: String = null,
    mouseEnter: /* e */ MouseEnterEventArgs => Callback = null,
    mouseLeave: /* e */ MouseLeaveEventArgs => Callback = null,
    mouseOver: /* e */ MouseOverEventArgs => Callback = null,
    nodeCollectionChange: /* e */ NodeCollectionChangeEventArgs => Callback = null,
    nodeTemplate: js.Any = null,
    nodes: js.Array[Node] = null,
    pageSettings: PageSettings = null,
    propertyChange: /* e */ PropertyChangeEventArgs => Callback = null,
    rotationChange: /* e */ RotationChangeEventArgs => Callback = null,
    rulerSettings: RulerSettings = null,
    scrollChange: /* e */ ScrollChangeEventArgs => Callback = null,
    scrollSettings: ScrollSettings = null,
    segmentChange: /* e */ SegmentChangeEventArgs => Callback = null,
    selectedItems: SelectedItems = null,
    selectionChange: /* e */ SelectionChangeEventArgs => Callback = null,
    serializationSettings: SerializationSettings = null,
    setTool: /* e */ SetToolEventArgs => Callback = null,
    showTooltip: js.UndefOr[Boolean] = js.undefined,
    sizeChange: /* e */ SizeChangeEventArgs => Callback = null,
    snapSettings: SnapSettings = null,
    textChange: /* e */ TextChangeEventArgs => Callback = null,
    tool: Tool | String = null,
    tooltip: Tooltip = null,
    width: String = null,
    zoomFactor: Int | Double = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (autoScrollChange != null) __obj.updateDynamic("autoScrollChange")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.AutoScrollChangeEventArgs) => autoScrollChange(t0).runNow()))
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (backgroundImage != null) __obj.updateDynamic("backgroundImage")(backgroundImage.asInstanceOf[js.Any])
    if (bridgeDirection != null) __obj.updateDynamic("bridgeDirection")(bridgeDirection.asInstanceOf[js.Any])
    if (click != null) __obj.updateDynamic("click")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.ClickEventArgs) => click(t0).runNow()))
    if (commandManager != null) __obj.updateDynamic("commandManager")(commandManager.asInstanceOf[js.Any])
    if (connectionChange != null) __obj.updateDynamic("connectionChange")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.ConnectionChangeEventArgs) => connectionChange(t0).runNow()))
    if (connectorCollectionChange != null) __obj.updateDynamic("connectorCollectionChange")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.ConnectorCollectionChangeEventArgs) => connectorCollectionChange(t0).runNow()))
    if (connectorSourceChange != null) __obj.updateDynamic("connectorSourceChange")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.ConnectorSourceChangeEventArgs) => connectorSourceChange(t0).runNow()))
    if (connectorTargetChange != null) __obj.updateDynamic("connectorTargetChange")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.ConnectorTargetChangeEventArgs) => connectorTargetChange(t0).runNow()))
    if (connectorTemplate != null) __obj.updateDynamic("connectorTemplate")(connectorTemplate.asInstanceOf[js.Any])
    if (connectors != null) __obj.updateDynamic("connectors")(connectors.asInstanceOf[js.Any])
    if (constraints != null) __obj.updateDynamic("constraints")(constraints.asInstanceOf[js.Any])
    if (contextMenu != null) __obj.updateDynamic("contextMenu")(contextMenu.asInstanceOf[js.Any])
    if (contextMenuBeforeOpen != null) __obj.updateDynamic("contextMenuBeforeOpen")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.ContextMenuBeforeOpenEventArgs) => contextMenuBeforeOpen(t0).runNow()))
    if (contextMenuClick != null) __obj.updateDynamic("contextMenuClick")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.ContextMenuClickEventArgs) => contextMenuClick(t0).runNow()))
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.CreateEventArgs) => create(t0).runNow()))
    if (dataSourceSettings != null) __obj.updateDynamic("dataSourceSettings")(dataSourceSettings.asInstanceOf[js.Any])
    if (defaultSettings != null) __obj.updateDynamic("defaultSettings")(defaultSettings.asInstanceOf[js.Any])
    if (doubleClick != null) __obj.updateDynamic("doubleClick")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.DoubleClickEventArgs) => doubleClick(t0).runNow()))
    if (drag != null) __obj.updateDynamic("drag")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.DragEventArgs) => drag(t0).runNow()))
    if (dragEnter != null) __obj.updateDynamic("dragEnter")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.DragEnterEventArgs) => dragEnter(t0).runNow()))
    if (dragLeave != null) __obj.updateDynamic("dragLeave")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.DragLeaveEventArgs) => dragLeave(t0).runNow()))
    if (dragOver != null) __obj.updateDynamic("dragOver")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.DragOverEventArgs) => dragOver(t0).runNow()))
    if (drawType != null) __obj.updateDynamic("drawType")(drawType.asInstanceOf[js.Any])
    if (drop != null) __obj.updateDynamic("drop")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.DropEventArgs) => drop(t0).runNow()))
    if (editorFocusChange != null) __obj.updateDynamic("editorFocusChange")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.EditorFocusChangeEventArgs) => editorFocusChange(t0).runNow()))
    if (!js.isUndefined(enableAutoScroll)) __obj.updateDynamic("enableAutoScroll")(enableAutoScroll.asInstanceOf[js.Any])
    if (!js.isUndefined(enableContextMenu)) __obj.updateDynamic("enableContextMenu")(enableContextMenu.asInstanceOf[js.Any])
    if (groupChange != null) __obj.updateDynamic("groupChange")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.GroupChangeEventArgs) => groupChange(t0).runNow()))
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (historyChange != null) __obj.updateDynamic("historyChange")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.HistoryChangeEventArgs) => historyChange(t0).runNow()))
    if (historyManager != null) __obj.updateDynamic("historyManager")(historyManager.asInstanceOf[js.Any])
    if (itemClick != null) __obj.updateDynamic("itemClick")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.ItemClickEventArgs) => itemClick(t0).runNow()))
    if (labelRenderingMode != null) __obj.updateDynamic("labelRenderingMode")(labelRenderingMode.asInstanceOf[js.Any])
    if (layers != null) __obj.updateDynamic("layers")(layers.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (mouseEnter != null) __obj.updateDynamic("mouseEnter")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.MouseEnterEventArgs) => mouseEnter(t0).runNow()))
    if (mouseLeave != null) __obj.updateDynamic("mouseLeave")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.MouseLeaveEventArgs) => mouseLeave(t0).runNow()))
    if (mouseOver != null) __obj.updateDynamic("mouseOver")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.MouseOverEventArgs) => mouseOver(t0).runNow()))
    if (nodeCollectionChange != null) __obj.updateDynamic("nodeCollectionChange")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.NodeCollectionChangeEventArgs) => nodeCollectionChange(t0).runNow()))
    if (nodeTemplate != null) __obj.updateDynamic("nodeTemplate")(nodeTemplate.asInstanceOf[js.Any])
    if (nodes != null) __obj.updateDynamic("nodes")(nodes.asInstanceOf[js.Any])
    if (pageSettings != null) __obj.updateDynamic("pageSettings")(pageSettings.asInstanceOf[js.Any])
    if (propertyChange != null) __obj.updateDynamic("propertyChange")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.PropertyChangeEventArgs) => propertyChange(t0).runNow()))
    if (rotationChange != null) __obj.updateDynamic("rotationChange")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.RotationChangeEventArgs) => rotationChange(t0).runNow()))
    if (rulerSettings != null) __obj.updateDynamic("rulerSettings")(rulerSettings.asInstanceOf[js.Any])
    if (scrollChange != null) __obj.updateDynamic("scrollChange")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.ScrollChangeEventArgs) => scrollChange(t0).runNow()))
    if (scrollSettings != null) __obj.updateDynamic("scrollSettings")(scrollSettings.asInstanceOf[js.Any])
    if (segmentChange != null) __obj.updateDynamic("segmentChange")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.SegmentChangeEventArgs) => segmentChange(t0).runNow()))
    if (selectedItems != null) __obj.updateDynamic("selectedItems")(selectedItems.asInstanceOf[js.Any])
    if (selectionChange != null) __obj.updateDynamic("selectionChange")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.SelectionChangeEventArgs) => selectionChange(t0).runNow()))
    if (serializationSettings != null) __obj.updateDynamic("serializationSettings")(serializationSettings.asInstanceOf[js.Any])
    if (setTool != null) __obj.updateDynamic("setTool")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.SetToolEventArgs) => setTool(t0).runNow()))
    if (!js.isUndefined(showTooltip)) __obj.updateDynamic("showTooltip")(showTooltip.asInstanceOf[js.Any])
    if (sizeChange != null) __obj.updateDynamic("sizeChange")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.SizeChangeEventArgs) => sizeChange(t0).runNow()))
    if (snapSettings != null) __obj.updateDynamic("snapSettings")(snapSettings.asInstanceOf[js.Any])
    if (textChange != null) __obj.updateDynamic("textChange")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.datavisualization.Diagram.TextChangeEventArgs) => textChange(t0).runNow()))
    if (tool != null) __obj.updateDynamic("tool")(tool.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (zoomFactor != null) __obj.updateDynamic("zoomFactor")(zoomFactor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
}

