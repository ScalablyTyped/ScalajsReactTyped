package typingsJapgolly.ejWebAll.ej.Kanban

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Triggered for every Kanban action before its starts.
    */
  var actionBegin: js.UndefOr[js.Function1[/* e */ ActionBeginEventArgs, Unit]] = js.undefined
  /** Triggered for every Kanban action success event.
    */
  var actionComplete: js.UndefOr[js.Function1[/* e */ ActionCompleteEventArgs, Unit]] = js.undefined
  /** Triggered for every Kanban action server failure event.
    */
  var actionFailure: js.UndefOr[js.Function1[/* e */ ActionFailureEventArgs, Unit]] = js.undefined
  /** Gets or sets a value that indicates whether to enable allowDragAndDrop behavior on Kanban.
    * @Default {true}
    */
  var allowDragAndDrop: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable drag and drop behavior between Kanban controls.
    * @Default {false}
    */
  var allowExternalDragAndDrop: js.UndefOr[Boolean] = js.undefined
  /** To enable filtering behavior on Kanban.User can specify query in filterSettings collection after enabling allowFiltering.
    * @Default {false}
    */
  var allowFiltering: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to allow card hover actions.
    * @Default {true}
    */
  var allowHover: js.UndefOr[Boolean] = js.undefined
  /** To allow keyboard navigation actions.
    * @Default {false}
    */
  var allowKeyboardNavigation: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable printing option.
    * @Default {false}
    */
  var allowPrinting: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable the scrollbar in the Kanban and view the card by scroll through the Kanban manually.
    * @Default {false}
    */
  var allowScrolling: js.UndefOr[Boolean] = js.undefined
  /** To enable Searching operation in Kanban.
    * @Default {false}
    */
  var allowSearching: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable allowSelection behavior on Kanban.User can select card and the selected card will be highlighted on Kanban.
    * @Default {true}
    */
  var allowSelection: js.UndefOr[Boolean] = js.undefined
  /** To enable or disable the title of the card.
    * @Default {false}
    */
  var allowTitle: js.UndefOr[Boolean] = js.undefined
  /** To enable or disable the column expand /collapse.
    * @Default {false}
    */
  var allowToggleColumn: js.UndefOr[Boolean] = js.undefined
  /** Triggered before the card is selected.
    */
  var beforeCardSelect: js.UndefOr[js.Function1[/* e */ BeforeCardSelectEventArgs, Unit]] = js.undefined
  /** Triggered before the task is going to be edited.
    */
  var beginEdit: js.UndefOr[js.Function1[/* e */ BeginEditEventArgs, Unit]] = js.undefined
  /** Trigger after the card is clicked.
    */
  var cardClick: js.UndefOr[js.Function1[/* e */ CardClickEventArgs, Unit]] = js.undefined
  /** Triggered when card is double clicked.
    */
  var cardDoubleClick: js.UndefOr[js.Function1[/* e */ CardDoubleClickEventArgs, Unit]] = js.undefined
  /** Triggered when the card is being dragged.
    */
  var cardDrag: js.UndefOr[js.Function1[/* e */ CardDragEventArgs, Unit]] = js.undefined
  /** Triggered when card dragging start.
    */
  var cardDragStart: js.UndefOr[js.Function1[/* e */ CardDragStartEventArgs, Unit]] = js.undefined
  /** Triggered when card dragging stops.
    */
  var cardDragStop: js.UndefOr[js.Function1[/* e */ CardDragStopEventArgs, Unit]] = js.undefined
  /** Triggered when the card is Dropped.
    */
  var cardDrop: js.UndefOr[js.Function1[/* e */ CardDropEventArgs, Unit]] = js.undefined
  /** Triggered after the card is selected.
    */
  var cardSelect: js.UndefOr[js.Function1[/* e */ CardSelectEventArgs, Unit]] = js.undefined
  /** Triggered before the card is selected.
    */
  var cardSelecting: js.UndefOr[js.Function1[/* e */ CardSelectingEventArgs, Unit]] = js.undefined
  /** Gets or sets an object that indicates whether to Customize the card settings.
    * @Default {Object}
    */
  var cardSettings: js.UndefOr[CardSettings] = js.undefined
  /** Triggers after the cell is clicked.
    */
  var cellClick: js.UndefOr[js.Function1[/* e */ CellClickEventArgs, Unit]] = js.undefined
  /** Gets or sets an object that indicates to render the Kanban with specified columns.
    * @Default {Array}
    */
  var columns: js.UndefOr[js.Array[Column]] = js.undefined
  /** Triggered when context menu item is clicked in Kanban
    */
  var contextClick: js.UndefOr[js.Function1[/* e */ ContextClickEventArgs, Unit]] = js.undefined
  /** Gets or sets an object that indicates whether to customize the context menu behavior of the Kanban.
    * @Default {Object}
    */
  var contextMenuSettings: js.UndefOr[ContextMenuSettings] = js.undefined
  /** Triggered before the context menu is opened.
    */
  var contextOpen: js.UndefOr[js.Function1[/* e */ ContextOpenEventArgs, Unit]] = js.undefined
  /** Triggered when the Kanban is rendered completely
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.undefined
  /** Gets or sets a value that indicates to render the Kanban with custom theme.
    */
  var cssClass: js.UndefOr[String] = js.undefined
  /** Gets or sets a value that indicates whether to add customToolbarItems within the toolbar to perform any action in the Kanban.
    * @Default {[]}
    */
  var customToolbarItems: js.UndefOr[js.Array[CustomToolbarItem]] = js.undefined
  /** Triggered the Kanban is bound with data during initial rendering.
    */
  var dataBound: js.UndefOr[js.Function1[/* e */ DataBoundEventArgs, Unit]] = js.undefined
  /** Gets or sets the data to render the Kanban with cards.
    * @Default {null}
    */
  var dataSource: js.UndefOr[js.Any] = js.undefined
  /** Triggered when Kanban going to destroy.
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.undefined
  /** Get or sets an object that indicates whether to customize the editing behavior of the Kanban.
    * @Default {Object}
    */
  var editSettings: js.UndefOr[EditSettings] = js.undefined
  /** Align content in the Kanban control align from right to left by setting the property as true.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[Boolean] = js.undefined
  /** To show total count of cards in each column.
    * @Default {false}
    */
  var enableTotalCount: js.UndefOr[Boolean] = js.undefined
  /** To perform kanban functionalities with touch interaction.
    * @Default {true}
    */
  var enableTouch: js.UndefOr[Boolean] = js.undefined
  /** Triggered after the card is deleted.
    */
  var endDelete: js.UndefOr[js.Function1[/* e */ EndDeleteEventArgs, Unit]] = js.undefined
  /** Triggered after the card is edited.
    */
  var endEdit: js.UndefOr[js.Function1[/* e */ EndEditEventArgs, Unit]] = js.undefined
  /** To customize field mappings for card , editing title and control key parameters
    * @Default {Object}
    */
  var fields: js.UndefOr[Fields] = js.undefined
  /** To customize the filtering behavior based on queries given.
    * @Default {Array}
    */
  var filterSettings: js.UndefOr[js.Array[FilterSetting]] = js.undefined
  /** Triggers after the header is clicked.
    */
  var headerClick: js.UndefOr[js.Function1[/* e */ HeaderClickEventArgs, Unit]] = js.undefined
  /** When set to true, adapts the Kanban layout to fit the screen size of devices on which it renders.
    * @Default {false}
    */
  var isResponsive: js.UndefOr[Boolean] = js.undefined
  /** To map datasource field for column values mapping
    * @Default {null}
    */
  var keyField: js.UndefOr[String] = js.undefined
  /** To change the key in keyboard interaction to Kanban control.
    * @Default {null}
    */
  var keySettings: js.UndefOr[js.Any] = js.undefined
  /** Triggered initial load.
    */
  var load: js.UndefOr[js.Function1[/* e */ LoadEventArgs, Unit]] = js.undefined
  /** Gets or sets a value that indicates whether to customizing the user interface (UI) as locale-specific in order to display regional data i.e. in a language and culture specific to
    * a particular country or region.
    * @Default {en-US}
    */
  var locale: js.UndefOr[String] = js.undefined
  /** Gets or sets a value that indicates whether to set the minimum width of the responsive Kanban while isResponsive property is true.
    * @Default {0}
    */
  var minWidth: js.UndefOr[Double] = js.undefined
  /** ej Query to query database of Kanban.
    * @Default {null}
    */
  var query: js.UndefOr[js.Any] = js.undefined
  /** Triggered every time a single card rendered request is made to access particular card information.
    */
  var queryCellInfo: js.UndefOr[js.Function1[/* e */ QueryCellInfoEventArgs, Unit]] = js.undefined
  /** Gets or sets an object that indicates whether to customize the scrolling behavior of the Kanban.
    * @Default {Object}
    */
  var scrollSettings: js.UndefOr[ScrollSettings] = js.undefined
  /** To customize the searching behavior of the Kanban.
    * @Default {Object}
    */
  var searchSettings: js.UndefOr[SearchSettings] = js.undefined
  /** To allow customize selection type. Accepting types are &quot;single&quot; and &quot;multiple&quot;.
    * @Default {ej.Kanban.SelectionType.Single}
    */
  var selectionType: js.UndefOr[SelectionType | String] = js.undefined
  /** Gets or sets a value that indicates whether to render kanban columns using without data source.
    * @Default {false}
    */
  var showColumnWhenEmpty: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets an object that indicates to managing the collection of stacked header rows for the Kanban.
    * @Default {Array}
    */
  var stackedHeaderRows: js.UndefOr[js.Array[StackedHeaderRow]] = js.undefined
  /** Triggers before swim lane expand or collapse icon is clicked.
    */
  var swimlaneClick: js.UndefOr[js.Function1[/* e */ SwimlaneClickEventArgs, Unit]] = js.undefined
  /** Customize the settings for swim lane.
    * @Default {Object}
    */
  var swimlaneSettings: js.UndefOr[SwimlaneSettings] = js.undefined
  /** Triggered when toolbar item is clicked in Kanban.
    */
  var toolbarClick: js.UndefOr[js.Function1[/* e */ ToolbarClickEventArgs, Unit]] = js.undefined
  /** The tooltip allows to display card details in a tooltip while hovering on it.
    */
  var tooltipSettings: js.UndefOr[TooltipSettings] = js.undefined
  /** Gets or sets an object that indicates to render the Kanban with specified workflows.
    * @Default {Array}
    */
  var workflows: js.UndefOr[js.Array[Workflow]] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    actionBegin: /* e */ ActionBeginEventArgs => Callback = null,
    actionComplete: /* e */ ActionCompleteEventArgs => Callback = null,
    actionFailure: /* e */ ActionFailureEventArgs => Callback = null,
    allowDragAndDrop: js.UndefOr[Boolean] = js.undefined,
    allowExternalDragAndDrop: js.UndefOr[Boolean] = js.undefined,
    allowFiltering: js.UndefOr[Boolean] = js.undefined,
    allowHover: js.UndefOr[Boolean] = js.undefined,
    allowKeyboardNavigation: js.UndefOr[Boolean] = js.undefined,
    allowPrinting: js.UndefOr[Boolean] = js.undefined,
    allowScrolling: js.UndefOr[Boolean] = js.undefined,
    allowSearching: js.UndefOr[Boolean] = js.undefined,
    allowSelection: js.UndefOr[Boolean] = js.undefined,
    allowTitle: js.UndefOr[Boolean] = js.undefined,
    allowToggleColumn: js.UndefOr[Boolean] = js.undefined,
    beforeCardSelect: /* e */ BeforeCardSelectEventArgs => Callback = null,
    beginEdit: /* e */ BeginEditEventArgs => Callback = null,
    cardClick: /* e */ CardClickEventArgs => Callback = null,
    cardDoubleClick: /* e */ CardDoubleClickEventArgs => Callback = null,
    cardDrag: /* e */ CardDragEventArgs => Callback = null,
    cardDragStart: /* e */ CardDragStartEventArgs => Callback = null,
    cardDragStop: /* e */ CardDragStopEventArgs => Callback = null,
    cardDrop: /* e */ CardDropEventArgs => Callback = null,
    cardSelect: /* e */ CardSelectEventArgs => Callback = null,
    cardSelecting: /* e */ CardSelectingEventArgs => Callback = null,
    cardSettings: CardSettings = null,
    cellClick: /* e */ CellClickEventArgs => Callback = null,
    columns: js.Array[Column] = null,
    contextClick: /* e */ ContextClickEventArgs => Callback = null,
    contextMenuSettings: ContextMenuSettings = null,
    contextOpen: /* e */ ContextOpenEventArgs => Callback = null,
    create: /* e */ CreateEventArgs => Callback = null,
    cssClass: String = null,
    customToolbarItems: js.Array[CustomToolbarItem] = null,
    dataBound: /* e */ DataBoundEventArgs => Callback = null,
    dataSource: js.Any = null,
    destroy: /* e */ DestroyEventArgs => Callback = null,
    editSettings: EditSettings = null,
    enableRTL: js.UndefOr[Boolean] = js.undefined,
    enableTotalCount: js.UndefOr[Boolean] = js.undefined,
    enableTouch: js.UndefOr[Boolean] = js.undefined,
    endDelete: /* e */ EndDeleteEventArgs => Callback = null,
    endEdit: /* e */ EndEditEventArgs => Callback = null,
    fields: Fields = null,
    filterSettings: js.Array[FilterSetting] = null,
    headerClick: /* e */ HeaderClickEventArgs => Callback = null,
    isResponsive: js.UndefOr[Boolean] = js.undefined,
    keyField: String = null,
    keySettings: js.Any = null,
    load: /* e */ LoadEventArgs => Callback = null,
    locale: String = null,
    minWidth: Int | Double = null,
    query: js.Any = null,
    queryCellInfo: /* e */ QueryCellInfoEventArgs => Callback = null,
    scrollSettings: ScrollSettings = null,
    searchSettings: SearchSettings = null,
    selectionType: SelectionType | String = null,
    showColumnWhenEmpty: js.UndefOr[Boolean] = js.undefined,
    stackedHeaderRows: js.Array[StackedHeaderRow] = null,
    swimlaneClick: /* e */ SwimlaneClickEventArgs => Callback = null,
    swimlaneSettings: SwimlaneSettings = null,
    toolbarClick: /* e */ ToolbarClickEventArgs => Callback = null,
    tooltipSettings: TooltipSettings = null,
    workflows: js.Array[Workflow] = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (actionBegin != null) __obj.updateDynamic("actionBegin")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Kanban.ActionBeginEventArgs) => actionBegin(t0).runNow()))
    if (actionComplete != null) __obj.updateDynamic("actionComplete")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Kanban.ActionCompleteEventArgs) => actionComplete(t0).runNow()))
    if (actionFailure != null) __obj.updateDynamic("actionFailure")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Kanban.ActionFailureEventArgs) => actionFailure(t0).runNow()))
    if (!js.isUndefined(allowDragAndDrop)) __obj.updateDynamic("allowDragAndDrop")(allowDragAndDrop.asInstanceOf[js.Any])
    if (!js.isUndefined(allowExternalDragAndDrop)) __obj.updateDynamic("allowExternalDragAndDrop")(allowExternalDragAndDrop.asInstanceOf[js.Any])
    if (!js.isUndefined(allowFiltering)) __obj.updateDynamic("allowFiltering")(allowFiltering.asInstanceOf[js.Any])
    if (!js.isUndefined(allowHover)) __obj.updateDynamic("allowHover")(allowHover.asInstanceOf[js.Any])
    if (!js.isUndefined(allowKeyboardNavigation)) __obj.updateDynamic("allowKeyboardNavigation")(allowKeyboardNavigation.asInstanceOf[js.Any])
    if (!js.isUndefined(allowPrinting)) __obj.updateDynamic("allowPrinting")(allowPrinting.asInstanceOf[js.Any])
    if (!js.isUndefined(allowScrolling)) __obj.updateDynamic("allowScrolling")(allowScrolling.asInstanceOf[js.Any])
    if (!js.isUndefined(allowSearching)) __obj.updateDynamic("allowSearching")(allowSearching.asInstanceOf[js.Any])
    if (!js.isUndefined(allowSelection)) __obj.updateDynamic("allowSelection")(allowSelection.asInstanceOf[js.Any])
    if (!js.isUndefined(allowTitle)) __obj.updateDynamic("allowTitle")(allowTitle.asInstanceOf[js.Any])
    if (!js.isUndefined(allowToggleColumn)) __obj.updateDynamic("allowToggleColumn")(allowToggleColumn.asInstanceOf[js.Any])
    if (beforeCardSelect != null) __obj.updateDynamic("beforeCardSelect")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Kanban.BeforeCardSelectEventArgs) => beforeCardSelect(t0).runNow()))
    if (beginEdit != null) __obj.updateDynamic("beginEdit")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Kanban.BeginEditEventArgs) => beginEdit(t0).runNow()))
    if (cardClick != null) __obj.updateDynamic("cardClick")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Kanban.CardClickEventArgs) => cardClick(t0).runNow()))
    if (cardDoubleClick != null) __obj.updateDynamic("cardDoubleClick")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Kanban.CardDoubleClickEventArgs) => cardDoubleClick(t0).runNow()))
    if (cardDrag != null) __obj.updateDynamic("cardDrag")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Kanban.CardDragEventArgs) => cardDrag(t0).runNow()))
    if (cardDragStart != null) __obj.updateDynamic("cardDragStart")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Kanban.CardDragStartEventArgs) => cardDragStart(t0).runNow()))
    if (cardDragStop != null) __obj.updateDynamic("cardDragStop")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Kanban.CardDragStopEventArgs) => cardDragStop(t0).runNow()))
    if (cardDrop != null) __obj.updateDynamic("cardDrop")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Kanban.CardDropEventArgs) => cardDrop(t0).runNow()))
    if (cardSelect != null) __obj.updateDynamic("cardSelect")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Kanban.CardSelectEventArgs) => cardSelect(t0).runNow()))
    if (cardSelecting != null) __obj.updateDynamic("cardSelecting")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Kanban.CardSelectingEventArgs) => cardSelecting(t0).runNow()))
    if (cardSettings != null) __obj.updateDynamic("cardSettings")(cardSettings.asInstanceOf[js.Any])
    if (cellClick != null) __obj.updateDynamic("cellClick")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Kanban.CellClickEventArgs) => cellClick(t0).runNow()))
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (contextClick != null) __obj.updateDynamic("contextClick")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Kanban.ContextClickEventArgs) => contextClick(t0).runNow()))
    if (contextMenuSettings != null) __obj.updateDynamic("contextMenuSettings")(contextMenuSettings.asInstanceOf[js.Any])
    if (contextOpen != null) __obj.updateDynamic("contextOpen")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Kanban.ContextOpenEventArgs) => contextOpen(t0).runNow()))
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Kanban.CreateEventArgs) => create(t0).runNow()))
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (customToolbarItems != null) __obj.updateDynamic("customToolbarItems")(customToolbarItems.asInstanceOf[js.Any])
    if (dataBound != null) __obj.updateDynamic("dataBound")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Kanban.DataBoundEventArgs) => dataBound(t0).runNow()))
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Kanban.DestroyEventArgs) => destroy(t0).runNow()))
    if (editSettings != null) __obj.updateDynamic("editSettings")(editSettings.asInstanceOf[js.Any])
    if (!js.isUndefined(enableRTL)) __obj.updateDynamic("enableRTL")(enableRTL.asInstanceOf[js.Any])
    if (!js.isUndefined(enableTotalCount)) __obj.updateDynamic("enableTotalCount")(enableTotalCount.asInstanceOf[js.Any])
    if (!js.isUndefined(enableTouch)) __obj.updateDynamic("enableTouch")(enableTouch.asInstanceOf[js.Any])
    if (endDelete != null) __obj.updateDynamic("endDelete")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Kanban.EndDeleteEventArgs) => endDelete(t0).runNow()))
    if (endEdit != null) __obj.updateDynamic("endEdit")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Kanban.EndEditEventArgs) => endEdit(t0).runNow()))
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (filterSettings != null) __obj.updateDynamic("filterSettings")(filterSettings.asInstanceOf[js.Any])
    if (headerClick != null) __obj.updateDynamic("headerClick")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Kanban.HeaderClickEventArgs) => headerClick(t0).runNow()))
    if (!js.isUndefined(isResponsive)) __obj.updateDynamic("isResponsive")(isResponsive.asInstanceOf[js.Any])
    if (keyField != null) __obj.updateDynamic("keyField")(keyField.asInstanceOf[js.Any])
    if (keySettings != null) __obj.updateDynamic("keySettings")(keySettings.asInstanceOf[js.Any])
    if (load != null) __obj.updateDynamic("load")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Kanban.LoadEventArgs) => load(t0).runNow()))
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (queryCellInfo != null) __obj.updateDynamic("queryCellInfo")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Kanban.QueryCellInfoEventArgs) => queryCellInfo(t0).runNow()))
    if (scrollSettings != null) __obj.updateDynamic("scrollSettings")(scrollSettings.asInstanceOf[js.Any])
    if (searchSettings != null) __obj.updateDynamic("searchSettings")(searchSettings.asInstanceOf[js.Any])
    if (selectionType != null) __obj.updateDynamic("selectionType")(selectionType.asInstanceOf[js.Any])
    if (!js.isUndefined(showColumnWhenEmpty)) __obj.updateDynamic("showColumnWhenEmpty")(showColumnWhenEmpty.asInstanceOf[js.Any])
    if (stackedHeaderRows != null) __obj.updateDynamic("stackedHeaderRows")(stackedHeaderRows.asInstanceOf[js.Any])
    if (swimlaneClick != null) __obj.updateDynamic("swimlaneClick")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Kanban.SwimlaneClickEventArgs) => swimlaneClick(t0).runNow()))
    if (swimlaneSettings != null) __obj.updateDynamic("swimlaneSettings")(swimlaneSettings.asInstanceOf[js.Any])
    if (toolbarClick != null) __obj.updateDynamic("toolbarClick")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Kanban.ToolbarClickEventArgs) => toolbarClick(t0).runNow()))
    if (tooltipSettings != null) __obj.updateDynamic("tooltipSettings")(tooltipSettings.asInstanceOf[js.Any])
    if (workflows != null) __obj.updateDynamic("workflows")(workflows.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
}

