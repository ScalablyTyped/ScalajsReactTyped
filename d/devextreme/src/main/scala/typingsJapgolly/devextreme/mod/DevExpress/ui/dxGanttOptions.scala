package typingsJapgolly.devextreme.mod.DevExpress.ui

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import typingsJapgolly.devextreme.anon.AllowDependencyAdding
import typingsJapgolly.devextreme.anon.AutoUpdateParentTasks
import typingsJapgolly.devextreme.anon.ColorExpr
import typingsJapgolly.devextreme.anon.DataSource
import typingsJapgolly.devextreme.anon.EndExpr
import typingsJapgolly.devextreme.anon.KeyExpr
import typingsJapgolly.devextreme.anon.Max
import typingsJapgolly.devextreme.mod.DevExpress.common.FirstDayOfWeek
import typingsJapgolly.devextreme.mod.DevExpress.core.DxElement_
import typingsJapgolly.devextreme.mod.DevExpress.core.UserDefinedElement
import typingsJapgolly.devextreme.mod.DevExpress.core.template
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxGantt.Column
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxGantt.ContextMenuPreparingEvent
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxGantt.CustomCommandEvent
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxGantt.DependencyDeletedEvent
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxGantt.DependencyDeletingEvent
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxGantt.DependencyInsertedEvent
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxGantt.DependencyInsertingEvent
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxGantt.GanttScaleType
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxGantt.GanttTaskTitlePosition
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxGantt.ProgressTooltipTemplateData
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxGantt.ResourceAssignedEvent
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxGantt.ResourceAssigningEvent
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxGantt.ResourceDeletedEvent
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxGantt.ResourceDeletingEvent
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxGantt.ResourceInsertedEvent
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxGantt.ResourceInsertingEvent
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxGantt.ResourceManagerDialogShowingEvent
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxGantt.ResourceUnassignedEvent
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxGantt.ResourceUnassigningEvent
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxGantt.ScaleCellPreparedEvent
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxGantt.SelectionChangedEvent
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxGantt.TaskClickEvent
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxGantt.TaskContentTemplateData
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxGantt.TaskDblClickEvent
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxGantt.TaskDeletedEvent
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxGantt.TaskDeletingEvent
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxGantt.TaskEditDialogShowingEvent
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxGantt.TaskInsertedEvent
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxGantt.TaskInsertingEvent
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxGantt.TaskMovingEvent
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxGantt.TaskUpdatedEvent
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxGantt.TaskUpdatingEvent
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxGantt.TimeTooltipTemplateData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxGanttOptions
  extends StObject
     with WidgetOptions[dxGantt] {
  
  /**
    * Specifies whether users can select tasks in the Gantt.
    */
  var allowSelection: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An array of columns in the Gantt.
    */
  var columns: js.UndefOr[js.Array[(Column[Any, Any]) | String]] = js.undefined
  
  /**
    * Configures the context menu settings.
    */
  var contextMenu: js.UndefOr[dxGanttContextMenu] = js.undefined
  
  /**
    * Configures dependencies.
    */
  var dependencies: js.UndefOr[DataSource] = js.undefined
  
  /**
    * Configures edit properties.
    */
  var editing: js.UndefOr[AllowDependencyAdding] = js.undefined
  
  /**
    * Specifies the end date of the date interval in the Gantt chart.
    */
  var endDateRange: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Configures filter row settings.
    */
  var filterRow: js.UndefOr[dxGanttFilterRow] = js.undefined
  
  /**
    * Specifies the first day of a week.
    */
  var firstDayOfWeek: js.UndefOr[FirstDayOfWeek] = js.undefined
  
  /**
    * Configures the header filter settings.
    */
  var headerFilter: js.UndefOr[dxGanttHeaderFilter] = js.undefined
  
  /**
    * A function that is executed before the context menu is rendered.
    */
  var onContextMenuPreparing: js.UndefOr[js.Function1[/* e */ ContextMenuPreparingEvent, Unit]] = js.undefined
  
  /**
    * A function that is executed after a custom command item was clicked. Allows you to implement a custom command&apos;s functionality.
    */
  var onCustomCommand: js.UndefOr[js.Function1[/* e */ CustomCommandEvent, Unit]] = js.undefined
  
  /**
    * A function that is executed when a dependency is deleted.
    */
  var onDependencyDeleted: js.UndefOr[js.Function1[/* e */ DependencyDeletedEvent, Unit]] = js.undefined
  
  /**
    * A function that is executed before a dependency is deleted.
    */
  var onDependencyDeleting: js.UndefOr[js.Function1[/* e */ DependencyDeletingEvent, Unit]] = js.undefined
  
  /**
    * A function that is executed when a dependency is inserted.
    */
  var onDependencyInserted: js.UndefOr[js.Function1[/* e */ DependencyInsertedEvent, Unit]] = js.undefined
  
  /**
    * A function that is executed before a dependency is inserted.
    */
  var onDependencyInserting: js.UndefOr[js.Function1[/* e */ DependencyInsertingEvent, Unit]] = js.undefined
  
  /**
    * A function that is executed when a resource is assigned to a task.
    */
  var onResourceAssigned: js.UndefOr[js.Function1[/* e */ ResourceAssignedEvent, Unit]] = js.undefined
  
  /**
    * A function that is executed before a resource is assigned to a task.
    */
  var onResourceAssigning: js.UndefOr[js.Function1[/* e */ ResourceAssigningEvent, Unit]] = js.undefined
  
  /**
    * A function that is executed when a resource is deleted.
    */
  var onResourceDeleted: js.UndefOr[js.Function1[/* e */ ResourceDeletedEvent, Unit]] = js.undefined
  
  /**
    * A function that is executed before a resource is deleted.
    */
  var onResourceDeleting: js.UndefOr[js.Function1[/* e */ ResourceDeletingEvent, Unit]] = js.undefined
  
  /**
    * A function that is executed when a resource is inserted.
    */
  var onResourceInserted: js.UndefOr[js.Function1[/* e */ ResourceInsertedEvent, Unit]] = js.undefined
  
  /**
    * A function that is executed before a resource is inserted.
    */
  var onResourceInserting: js.UndefOr[js.Function1[/* e */ ResourceInsertingEvent, Unit]] = js.undefined
  
  /**
    * A function that is executed before the Resource Manager dialog is shown.
    */
  var onResourceManagerDialogShowing: js.UndefOr[js.Function1[/* e */ ResourceManagerDialogShowingEvent, Unit]] = js.undefined
  
  /**
    * A function that is executed when a resource is unassigned from a task.
    */
  var onResourceUnassigned: js.UndefOr[js.Function1[/* e */ ResourceUnassignedEvent, Unit]] = js.undefined
  
  /**
    * A function that is executed before a resource is unassigned from a task.
    */
  var onResourceUnassigning: js.UndefOr[js.Function1[/* e */ ResourceUnassigningEvent, Unit]] = js.undefined
  
  /**
    * 
    */
  var onScaleCellPrepared: js.UndefOr[js.Function1[/* e */ ScaleCellPreparedEvent, Unit]] = js.undefined
  
  /**
    * A function that is executed after users select a task or clear its selection.
    */
  var onSelectionChanged: js.UndefOr[js.Function1[/* e */ SelectionChangedEvent, Unit]] = js.undefined
  
  /**
    * A function that is executed when a user clicks a task.
    */
  var onTaskClick: js.UndefOr[js.Function1[/* e */ TaskClickEvent, Unit]] = js.undefined
  
  /**
    * A function that is executed when a user double-clicks a task.
    */
  var onTaskDblClick: js.UndefOr[js.Function1[/* e */ TaskDblClickEvent, Unit]] = js.undefined
  
  /**
    * A function that is executed when a task is deleted.
    */
  var onTaskDeleted: js.UndefOr[js.Function1[/* e */ TaskDeletedEvent, Unit]] = js.undefined
  
  /**
    * A function that is executed before a task is deleted.
    */
  var onTaskDeleting: js.UndefOr[js.Function1[/* e */ TaskDeletingEvent, Unit]] = js.undefined
  
  /**
    * A function that is executed before the edit dialog is shown.
    */
  var onTaskEditDialogShowing: js.UndefOr[js.Function1[/* e */ TaskEditDialogShowingEvent, Unit]] = js.undefined
  
  /**
    * A function that is executed when a task is inserted.
    */
  var onTaskInserted: js.UndefOr[js.Function1[/* e */ TaskInsertedEvent, Unit]] = js.undefined
  
  /**
    * A function that is executed before a task is inserted.
    */
  var onTaskInserting: js.UndefOr[js.Function1[/* e */ TaskInsertingEvent, Unit]] = js.undefined
  
  /**
    * A function that is executed before a task is moved.
    */
  var onTaskMoving: js.UndefOr[js.Function1[/* e */ TaskMovingEvent, Unit]] = js.undefined
  
  /**
    * A function that is executed when a task is updated.
    */
  var onTaskUpdated: js.UndefOr[js.Function1[/* e */ TaskUpdatedEvent, Unit]] = js.undefined
  
  /**
    * A function that is executed before a task is updated.
    */
  var onTaskUpdating: js.UndefOr[js.Function1[/* e */ TaskUpdatingEvent, Unit]] = js.undefined
  
  /**
    * Configures resource assignments.
    */
  var resourceAssignments: js.UndefOr[KeyExpr] = js.undefined
  
  /**
    * Configures task resources.
    */
  var resources: js.UndefOr[ColorExpr] = js.undefined
  
  /**
    * Specifies the root task&apos;s identifier.
    */
  var rootValue: js.UndefOr[Any] = js.undefined
  
  /**
    * Specifies the zoom level of tasks in the Gantt chart.
    */
  var scaleType: js.UndefOr[GanttScaleType] = js.undefined
  
  /**
    * Configures zoom range settings.
    */
  var scaleTypeRange: js.UndefOr[Max] = js.undefined
  
  /**
    * Allows you to select a row or determine which row is selected.
    */
  var selectedRowKey: js.UndefOr[Any] = js.undefined
  
  /**
    * Specifies whether to display dependencies between tasks.
    */
  var showDependencies: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether to display task resources.
    */
  var showResources: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether to show/hide horizontal faint lines that separate tasks.
    */
  var showRowLines: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Configures sort settings.
    */
  var sorting: js.UndefOr[dxGanttSorting] = js.undefined
  
  /**
    * Specifies the start date of the date interval in the Gantt chart.
    */
  var startDateRange: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Configures strip lines.
    */
  var stripLines: js.UndefOr[js.Array[dxGanttStripLine]] = js.undefined
  
  /**
    * Specifies custom content for the task.
    */
  var taskContentTemplate: js.UndefOr[
    template | (js.Function2[
      /* container */ DxElement_[HTMLElement], 
      /* item */ TaskContentTemplateData, 
      String | UserDefinedElement[Element]
    ])
  ] = js.undefined
  
  /**
    * Specifies the width of the task list in pixels.
    */
  var taskListWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies custom content for the tooltip that displays the task&apos;s progress while the progress handler is resized in the UI.
    */
  var taskProgressTooltipContentTemplate: js.UndefOr[
    template | (js.Function2[
      /* container */ DxElement_[HTMLElement], 
      /* item */ ProgressTooltipTemplateData, 
      String | UserDefinedElement[Element]
    ])
  ] = js.undefined
  
  /**
    * Specifies custom content for the tooltip that displays the task&apos;s start and end time while the task is resized in the UI.
    */
  var taskTimeTooltipContentTemplate: js.UndefOr[
    template | (js.Function2[
      /* container */ DxElement_[HTMLElement], 
      /* item */ TimeTooltipTemplateData, 
      String | UserDefinedElement[Element]
    ])
  ] = js.undefined
  
  /**
    * Specifies a task&apos;s title position.
    */
  var taskTitlePosition: js.UndefOr[GanttTaskTitlePosition] = js.undefined
  
  /**
    * Specifies custom content for the task tooltip.
    */
  var taskTooltipContentTemplate: js.UndefOr[
    template | (js.Function2[
      /* container */ DxElement_[HTMLElement], 
      /* task */ Any, 
      String | UserDefinedElement[Element]
    ])
  ] = js.undefined
  
  /**
    * Configures tasks.
    */
  var tasks: js.UndefOr[EndExpr] = js.undefined
  
  /**
    * Configures toolbar settings.
    */
  var toolbar: js.UndefOr[dxGanttToolbar] = js.undefined
  
  /**
    * Configures validation properties.
    */
  var validation: js.UndefOr[AutoUpdateParentTasks] = js.undefined
}
object dxGanttOptions {
  
  inline def apply(): dxGanttOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxGanttOptions]
  }
  
  extension [Self <: dxGanttOptions](x: Self) {
    
    inline def setAllowSelection(value: Boolean): Self = StObject.set(x, "allowSelection", value.asInstanceOf[js.Any])
    
    inline def setAllowSelectionUndefined: Self = StObject.set(x, "allowSelection", js.undefined)
    
    inline def setColumns(value: js.Array[(Column[Any, Any]) | String]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setColumnsVarargs(value: ((Column[Any, Any]) | String)*): Self = StObject.set(x, "columns", js.Array(value*))
    
    inline def setContextMenu(value: dxGanttContextMenu): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
    
    inline def setContextMenuUndefined: Self = StObject.set(x, "contextMenu", js.undefined)
    
    inline def setDependencies(value: DataSource): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
    
    inline def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
    
    inline def setEditing(value: AllowDependencyAdding): Self = StObject.set(x, "editing", value.asInstanceOf[js.Any])
    
    inline def setEditingUndefined: Self = StObject.set(x, "editing", js.undefined)
    
    inline def setEndDateRange(value: js.Date): Self = StObject.set(x, "endDateRange", value.asInstanceOf[js.Any])
    
    inline def setEndDateRangeUndefined: Self = StObject.set(x, "endDateRange", js.undefined)
    
    inline def setFilterRow(value: dxGanttFilterRow): Self = StObject.set(x, "filterRow", value.asInstanceOf[js.Any])
    
    inline def setFilterRowUndefined: Self = StObject.set(x, "filterRow", js.undefined)
    
    inline def setFirstDayOfWeek(value: FirstDayOfWeek): Self = StObject.set(x, "firstDayOfWeek", value.asInstanceOf[js.Any])
    
    inline def setFirstDayOfWeekUndefined: Self = StObject.set(x, "firstDayOfWeek", js.undefined)
    
    inline def setHeaderFilter(value: dxGanttHeaderFilter): Self = StObject.set(x, "headerFilter", value.asInstanceOf[js.Any])
    
    inline def setHeaderFilterUndefined: Self = StObject.set(x, "headerFilter", js.undefined)
    
    inline def setOnContextMenuPreparing(value: /* e */ ContextMenuPreparingEvent => Callback): Self = StObject.set(x, "onContextMenuPreparing", js.Any.fromFunction1((t0: /* e */ ContextMenuPreparingEvent) => value(t0).runNow()))
    
    inline def setOnContextMenuPreparingUndefined: Self = StObject.set(x, "onContextMenuPreparing", js.undefined)
    
    inline def setOnCustomCommand(value: /* e */ CustomCommandEvent => Callback): Self = StObject.set(x, "onCustomCommand", js.Any.fromFunction1((t0: /* e */ CustomCommandEvent) => value(t0).runNow()))
    
    inline def setOnCustomCommandUndefined: Self = StObject.set(x, "onCustomCommand", js.undefined)
    
    inline def setOnDependencyDeleted(value: /* e */ DependencyDeletedEvent => Callback): Self = StObject.set(x, "onDependencyDeleted", js.Any.fromFunction1((t0: /* e */ DependencyDeletedEvent) => value(t0).runNow()))
    
    inline def setOnDependencyDeletedUndefined: Self = StObject.set(x, "onDependencyDeleted", js.undefined)
    
    inline def setOnDependencyDeleting(value: /* e */ DependencyDeletingEvent => Callback): Self = StObject.set(x, "onDependencyDeleting", js.Any.fromFunction1((t0: /* e */ DependencyDeletingEvent) => value(t0).runNow()))
    
    inline def setOnDependencyDeletingUndefined: Self = StObject.set(x, "onDependencyDeleting", js.undefined)
    
    inline def setOnDependencyInserted(value: /* e */ DependencyInsertedEvent => Callback): Self = StObject.set(x, "onDependencyInserted", js.Any.fromFunction1((t0: /* e */ DependencyInsertedEvent) => value(t0).runNow()))
    
    inline def setOnDependencyInsertedUndefined: Self = StObject.set(x, "onDependencyInserted", js.undefined)
    
    inline def setOnDependencyInserting(value: /* e */ DependencyInsertingEvent => Callback): Self = StObject.set(x, "onDependencyInserting", js.Any.fromFunction1((t0: /* e */ DependencyInsertingEvent) => value(t0).runNow()))
    
    inline def setOnDependencyInsertingUndefined: Self = StObject.set(x, "onDependencyInserting", js.undefined)
    
    inline def setOnResourceAssigned(value: /* e */ ResourceAssignedEvent => Callback): Self = StObject.set(x, "onResourceAssigned", js.Any.fromFunction1((t0: /* e */ ResourceAssignedEvent) => value(t0).runNow()))
    
    inline def setOnResourceAssignedUndefined: Self = StObject.set(x, "onResourceAssigned", js.undefined)
    
    inline def setOnResourceAssigning(value: /* e */ ResourceAssigningEvent => Callback): Self = StObject.set(x, "onResourceAssigning", js.Any.fromFunction1((t0: /* e */ ResourceAssigningEvent) => value(t0).runNow()))
    
    inline def setOnResourceAssigningUndefined: Self = StObject.set(x, "onResourceAssigning", js.undefined)
    
    inline def setOnResourceDeleted(value: /* e */ ResourceDeletedEvent => Callback): Self = StObject.set(x, "onResourceDeleted", js.Any.fromFunction1((t0: /* e */ ResourceDeletedEvent) => value(t0).runNow()))
    
    inline def setOnResourceDeletedUndefined: Self = StObject.set(x, "onResourceDeleted", js.undefined)
    
    inline def setOnResourceDeleting(value: /* e */ ResourceDeletingEvent => Callback): Self = StObject.set(x, "onResourceDeleting", js.Any.fromFunction1((t0: /* e */ ResourceDeletingEvent) => value(t0).runNow()))
    
    inline def setOnResourceDeletingUndefined: Self = StObject.set(x, "onResourceDeleting", js.undefined)
    
    inline def setOnResourceInserted(value: /* e */ ResourceInsertedEvent => Callback): Self = StObject.set(x, "onResourceInserted", js.Any.fromFunction1((t0: /* e */ ResourceInsertedEvent) => value(t0).runNow()))
    
    inline def setOnResourceInsertedUndefined: Self = StObject.set(x, "onResourceInserted", js.undefined)
    
    inline def setOnResourceInserting(value: /* e */ ResourceInsertingEvent => Callback): Self = StObject.set(x, "onResourceInserting", js.Any.fromFunction1((t0: /* e */ ResourceInsertingEvent) => value(t0).runNow()))
    
    inline def setOnResourceInsertingUndefined: Self = StObject.set(x, "onResourceInserting", js.undefined)
    
    inline def setOnResourceManagerDialogShowing(value: /* e */ ResourceManagerDialogShowingEvent => Callback): Self = StObject.set(x, "onResourceManagerDialogShowing", js.Any.fromFunction1((t0: /* e */ ResourceManagerDialogShowingEvent) => value(t0).runNow()))
    
    inline def setOnResourceManagerDialogShowingUndefined: Self = StObject.set(x, "onResourceManagerDialogShowing", js.undefined)
    
    inline def setOnResourceUnassigned(value: /* e */ ResourceUnassignedEvent => Callback): Self = StObject.set(x, "onResourceUnassigned", js.Any.fromFunction1((t0: /* e */ ResourceUnassignedEvent) => value(t0).runNow()))
    
    inline def setOnResourceUnassignedUndefined: Self = StObject.set(x, "onResourceUnassigned", js.undefined)
    
    inline def setOnResourceUnassigning(value: /* e */ ResourceUnassigningEvent => Callback): Self = StObject.set(x, "onResourceUnassigning", js.Any.fromFunction1((t0: /* e */ ResourceUnassigningEvent) => value(t0).runNow()))
    
    inline def setOnResourceUnassigningUndefined: Self = StObject.set(x, "onResourceUnassigning", js.undefined)
    
    inline def setOnScaleCellPrepared(value: /* e */ ScaleCellPreparedEvent => Callback): Self = StObject.set(x, "onScaleCellPrepared", js.Any.fromFunction1((t0: /* e */ ScaleCellPreparedEvent) => value(t0).runNow()))
    
    inline def setOnScaleCellPreparedUndefined: Self = StObject.set(x, "onScaleCellPrepared", js.undefined)
    
    inline def setOnSelectionChanged(value: /* e */ SelectionChangedEvent => Callback): Self = StObject.set(x, "onSelectionChanged", js.Any.fromFunction1((t0: /* e */ SelectionChangedEvent) => value(t0).runNow()))
    
    inline def setOnSelectionChangedUndefined: Self = StObject.set(x, "onSelectionChanged", js.undefined)
    
    inline def setOnTaskClick(value: /* e */ TaskClickEvent => Callback): Self = StObject.set(x, "onTaskClick", js.Any.fromFunction1((t0: /* e */ TaskClickEvent) => value(t0).runNow()))
    
    inline def setOnTaskClickUndefined: Self = StObject.set(x, "onTaskClick", js.undefined)
    
    inline def setOnTaskDblClick(value: /* e */ TaskDblClickEvent => Callback): Self = StObject.set(x, "onTaskDblClick", js.Any.fromFunction1((t0: /* e */ TaskDblClickEvent) => value(t0).runNow()))
    
    inline def setOnTaskDblClickUndefined: Self = StObject.set(x, "onTaskDblClick", js.undefined)
    
    inline def setOnTaskDeleted(value: /* e */ TaskDeletedEvent => Callback): Self = StObject.set(x, "onTaskDeleted", js.Any.fromFunction1((t0: /* e */ TaskDeletedEvent) => value(t0).runNow()))
    
    inline def setOnTaskDeletedUndefined: Self = StObject.set(x, "onTaskDeleted", js.undefined)
    
    inline def setOnTaskDeleting(value: /* e */ TaskDeletingEvent => Callback): Self = StObject.set(x, "onTaskDeleting", js.Any.fromFunction1((t0: /* e */ TaskDeletingEvent) => value(t0).runNow()))
    
    inline def setOnTaskDeletingUndefined: Self = StObject.set(x, "onTaskDeleting", js.undefined)
    
    inline def setOnTaskEditDialogShowing(value: /* e */ TaskEditDialogShowingEvent => Callback): Self = StObject.set(x, "onTaskEditDialogShowing", js.Any.fromFunction1((t0: /* e */ TaskEditDialogShowingEvent) => value(t0).runNow()))
    
    inline def setOnTaskEditDialogShowingUndefined: Self = StObject.set(x, "onTaskEditDialogShowing", js.undefined)
    
    inline def setOnTaskInserted(value: /* e */ TaskInsertedEvent => Callback): Self = StObject.set(x, "onTaskInserted", js.Any.fromFunction1((t0: /* e */ TaskInsertedEvent) => value(t0).runNow()))
    
    inline def setOnTaskInsertedUndefined: Self = StObject.set(x, "onTaskInserted", js.undefined)
    
    inline def setOnTaskInserting(value: /* e */ TaskInsertingEvent => Callback): Self = StObject.set(x, "onTaskInserting", js.Any.fromFunction1((t0: /* e */ TaskInsertingEvent) => value(t0).runNow()))
    
    inline def setOnTaskInsertingUndefined: Self = StObject.set(x, "onTaskInserting", js.undefined)
    
    inline def setOnTaskMoving(value: /* e */ TaskMovingEvent => Callback): Self = StObject.set(x, "onTaskMoving", js.Any.fromFunction1((t0: /* e */ TaskMovingEvent) => value(t0).runNow()))
    
    inline def setOnTaskMovingUndefined: Self = StObject.set(x, "onTaskMoving", js.undefined)
    
    inline def setOnTaskUpdated(value: /* e */ TaskUpdatedEvent => Callback): Self = StObject.set(x, "onTaskUpdated", js.Any.fromFunction1((t0: /* e */ TaskUpdatedEvent) => value(t0).runNow()))
    
    inline def setOnTaskUpdatedUndefined: Self = StObject.set(x, "onTaskUpdated", js.undefined)
    
    inline def setOnTaskUpdating(value: /* e */ TaskUpdatingEvent => Callback): Self = StObject.set(x, "onTaskUpdating", js.Any.fromFunction1((t0: /* e */ TaskUpdatingEvent) => value(t0).runNow()))
    
    inline def setOnTaskUpdatingUndefined: Self = StObject.set(x, "onTaskUpdating", js.undefined)
    
    inline def setResourceAssignments(value: KeyExpr): Self = StObject.set(x, "resourceAssignments", value.asInstanceOf[js.Any])
    
    inline def setResourceAssignmentsUndefined: Self = StObject.set(x, "resourceAssignments", js.undefined)
    
    inline def setResources(value: ColorExpr): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    inline def setRootValue(value: Any): Self = StObject.set(x, "rootValue", value.asInstanceOf[js.Any])
    
    inline def setRootValueUndefined: Self = StObject.set(x, "rootValue", js.undefined)
    
    inline def setScaleType(value: GanttScaleType): Self = StObject.set(x, "scaleType", value.asInstanceOf[js.Any])
    
    inline def setScaleTypeRange(value: Max): Self = StObject.set(x, "scaleTypeRange", value.asInstanceOf[js.Any])
    
    inline def setScaleTypeRangeUndefined: Self = StObject.set(x, "scaleTypeRange", js.undefined)
    
    inline def setScaleTypeUndefined: Self = StObject.set(x, "scaleType", js.undefined)
    
    inline def setSelectedRowKey(value: Any): Self = StObject.set(x, "selectedRowKey", value.asInstanceOf[js.Any])
    
    inline def setSelectedRowKeyUndefined: Self = StObject.set(x, "selectedRowKey", js.undefined)
    
    inline def setShowDependencies(value: Boolean): Self = StObject.set(x, "showDependencies", value.asInstanceOf[js.Any])
    
    inline def setShowDependenciesUndefined: Self = StObject.set(x, "showDependencies", js.undefined)
    
    inline def setShowResources(value: Boolean): Self = StObject.set(x, "showResources", value.asInstanceOf[js.Any])
    
    inline def setShowResourcesUndefined: Self = StObject.set(x, "showResources", js.undefined)
    
    inline def setShowRowLines(value: Boolean): Self = StObject.set(x, "showRowLines", value.asInstanceOf[js.Any])
    
    inline def setShowRowLinesUndefined: Self = StObject.set(x, "showRowLines", js.undefined)
    
    inline def setSorting(value: dxGanttSorting): Self = StObject.set(x, "sorting", value.asInstanceOf[js.Any])
    
    inline def setSortingUndefined: Self = StObject.set(x, "sorting", js.undefined)
    
    inline def setStartDateRange(value: js.Date): Self = StObject.set(x, "startDateRange", value.asInstanceOf[js.Any])
    
    inline def setStartDateRangeUndefined: Self = StObject.set(x, "startDateRange", js.undefined)
    
    inline def setStripLines(value: js.Array[dxGanttStripLine]): Self = StObject.set(x, "stripLines", value.asInstanceOf[js.Any])
    
    inline def setStripLinesUndefined: Self = StObject.set(x, "stripLines", js.undefined)
    
    inline def setStripLinesVarargs(value: dxGanttStripLine*): Self = StObject.set(x, "stripLines", js.Array(value*))
    
    inline def setTaskContentTemplate(
      value: template | (js.Function2[
          /* container */ DxElement_[HTMLElement], 
          /* item */ TaskContentTemplateData, 
          String | UserDefinedElement[Element]
        ])
    ): Self = StObject.set(x, "taskContentTemplate", value.asInstanceOf[js.Any])
    
    inline def setTaskContentTemplateFunction2(
      value: (/* container */ DxElement_[HTMLElement], /* item */ TaskContentTemplateData) => String | UserDefinedElement[Element]
    ): Self = StObject.set(x, "taskContentTemplate", js.Any.fromFunction2(value))
    
    inline def setTaskContentTemplateUndefined: Self = StObject.set(x, "taskContentTemplate", js.undefined)
    
    inline def setTaskListWidth(value: Double): Self = StObject.set(x, "taskListWidth", value.asInstanceOf[js.Any])
    
    inline def setTaskListWidthUndefined: Self = StObject.set(x, "taskListWidth", js.undefined)
    
    inline def setTaskProgressTooltipContentTemplate(
      value: template | (js.Function2[
          /* container */ DxElement_[HTMLElement], 
          /* item */ ProgressTooltipTemplateData, 
          String | UserDefinedElement[Element]
        ])
    ): Self = StObject.set(x, "taskProgressTooltipContentTemplate", value.asInstanceOf[js.Any])
    
    inline def setTaskProgressTooltipContentTemplateFunction2(
      value: (/* container */ DxElement_[HTMLElement], /* item */ ProgressTooltipTemplateData) => String | UserDefinedElement[Element]
    ): Self = StObject.set(x, "taskProgressTooltipContentTemplate", js.Any.fromFunction2(value))
    
    inline def setTaskProgressTooltipContentTemplateUndefined: Self = StObject.set(x, "taskProgressTooltipContentTemplate", js.undefined)
    
    inline def setTaskTimeTooltipContentTemplate(
      value: template | (js.Function2[
          /* container */ DxElement_[HTMLElement], 
          /* item */ TimeTooltipTemplateData, 
          String | UserDefinedElement[Element]
        ])
    ): Self = StObject.set(x, "taskTimeTooltipContentTemplate", value.asInstanceOf[js.Any])
    
    inline def setTaskTimeTooltipContentTemplateFunction2(
      value: (/* container */ DxElement_[HTMLElement], /* item */ TimeTooltipTemplateData) => String | UserDefinedElement[Element]
    ): Self = StObject.set(x, "taskTimeTooltipContentTemplate", js.Any.fromFunction2(value))
    
    inline def setTaskTimeTooltipContentTemplateUndefined: Self = StObject.set(x, "taskTimeTooltipContentTemplate", js.undefined)
    
    inline def setTaskTitlePosition(value: GanttTaskTitlePosition): Self = StObject.set(x, "taskTitlePosition", value.asInstanceOf[js.Any])
    
    inline def setTaskTitlePositionUndefined: Self = StObject.set(x, "taskTitlePosition", js.undefined)
    
    inline def setTaskTooltipContentTemplate(
      value: template | (js.Function2[
          /* container */ DxElement_[HTMLElement], 
          /* task */ Any, 
          String | UserDefinedElement[Element]
        ])
    ): Self = StObject.set(x, "taskTooltipContentTemplate", value.asInstanceOf[js.Any])
    
    inline def setTaskTooltipContentTemplateFunction2(
      value: (/* container */ DxElement_[HTMLElement], /* task */ Any) => String | UserDefinedElement[Element]
    ): Self = StObject.set(x, "taskTooltipContentTemplate", js.Any.fromFunction2(value))
    
    inline def setTaskTooltipContentTemplateUndefined: Self = StObject.set(x, "taskTooltipContentTemplate", js.undefined)
    
    inline def setTasks(value: EndExpr): Self = StObject.set(x, "tasks", value.asInstanceOf[js.Any])
    
    inline def setTasksUndefined: Self = StObject.set(x, "tasks", js.undefined)
    
    inline def setToolbar(value: dxGanttToolbar): Self = StObject.set(x, "toolbar", value.asInstanceOf[js.Any])
    
    inline def setToolbarUndefined: Self = StObject.set(x, "toolbar", js.undefined)
    
    inline def setValidation(value: AutoUpdateParentTasks): Self = StObject.set(x, "validation", value.asInstanceOf[js.Any])
    
    inline def setValidationUndefined: Self = StObject.set(x, "validation", js.undefined)
  }
}
