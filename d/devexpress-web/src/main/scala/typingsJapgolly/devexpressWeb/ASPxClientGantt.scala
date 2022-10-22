package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A client-side equivalent of the ASPxGantt control.
  */
trait ASPxClientGantt
  extends StObject
     with ASPxClientControl {
  
  /**
    * Assigns a resource to a task.
    * @param resourceKey The resource's key.
    * @param taskKey The task's key.
    */
  def AssignResourceToTask(resourceKey: Any, taskKey: Any): Unit
  
  /**
    * Occurs when a callback for server-side processing is initiated.
    */
  var BeginCallback: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientGantt]]
  
  /**
    * Fires on the client if any server error occurs during server-side processing of a callback sent by the ASPxClientGantt.
    */
  var CallbackError: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientGantt]]
  
  /**
    * Collapses all tasks.
    */
  def CollapseAll(): Unit
  
  /**
    * Collapses the specified parent task.
    * @param key The task key.
    */
  def CollapseTask(key: Any): Unit
  
  /**
    * Occurs when a user right-clicks a task or dependency to open the context menu.
    */
  var ContextMenu: ASPxClientEvent[ASPxClientGanttContextMenuEventHandler[ASPxClientGantt]]
  
  /**
    * Occurs before the built-in context menu is rendered.
    */
  var ContextMenuCustomization: ASPxClientEvent[ASPxClientGanttContextMenuCustomizationEventHandler[ASPxClientGantt]]
  
  /**
    * Enables you to implement a custom command's logic.
    */
  var CustomCommand: ASPxClientEvent[ASPxClientGanttCustomCommandEventHandler[ASPxClientGantt]]
  
  /**
    * Deletes a dependency.
    * @param key The dependency's key.
    */
  def DeleteDependency(key: Any): Unit
  
  /**
    * Deletes a resource.
    * @param key The resource's key.
    */
  def DeleteResource(key: Any): Unit
  
  /**
    * Deletes a task.
    * @param key The task's key.
    */
  def DeleteTask(key: Any): Unit
  
  /**
    * Occurs after a user deleted a dependency.
    */
  var DependencyDeleted: ASPxClientEvent[ASPxClientGanttDependencyDeletedEventHandler[ASPxClientGantt]]
  
  /**
    * Occurs before a user deletes a dependency.
    */
  var DependencyDeleting: ASPxClientEvent[ASPxClientGanttDependencyDeletingEventHandler[ASPxClientGantt]]
  
  /**
    * Occurs after a user inserted a dependency.
    */
  var DependencyInserted: ASPxClientEvent[ASPxClientGanttDependencyInsertedEventHandler[ASPxClientGantt]]
  
  /**
    * Occurs before a user inserts a dependency.
    */
  var DependencyInserting: ASPxClientEvent[ASPxClientGanttDependencyInsertingEventHandler[ASPxClientGantt]]
  
  /**
    * Occurs on the client side after a callback's server-side processing has been completed.
    */
  var EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientGantt]]
  
  /**
    * Occurs before a user finishes editing a cell.
    */
  var EndCellEditing: ASPxClientEvent[ASPxClientGanttEndCellEditingEventHandler[ASPxClientGantt]]
  
  /**
    * Expands all tasks.
    */
  def ExpandAll(): Unit
  
  /**
    * Expands the specified task.
    * @param key The task key.
    */
  def ExpandTask(key: Any): Unit
  
  /**
    * Occurs when a task is focused.
    */
  var FocusedTaskChanged: ASPxClientEvent[ASPxClientGanttFocusedTaskChangedEventHandler[ASPxClientGantt]]
  
  /**
    * Occurs before a task is focused.
    */
  var FocusedTaskChanging: ASPxClientEvent[ASPxClientGanttFocusedTaskChangingEventHandler[ASPxClientGantt]]
  
  /**
    * Gets the dependency data. The dependency's data.
    * @param key The dependency's key.
    */
  def GetDependencyData(key: Any): Any
  
  /**
    * Gets the focused task's key.
    */
  def GetFocusedTaskKey(): Any
  
  /**
    * Gets the resource assignment data. The resource assignment data.
    * @param key The resource assignment's key.
    */
  def GetResourceAssignmentData(key: Any): Any
  
  /**
    * Gets the resource data. The resource's data.
    * @param key The resource's key.
    */
  def GetResourceData(key: Any): Any
  
  /**
    * Gets the task data. The task data.
    * @param key The task's key.
    */
  def GetTaskData(key: Any): Any
  
  /**
    * Gets resources assigned to a task. The resources.
    * @param key The task's key.
    */
  def GetTaskResources(key: Any): js.Array[Any]
  
  /**
    * Gets the keys of the visible dependencies.
    */
  def GetVisibleDependencyKeys(): js.Array[Any]
  
  /**
    * Gets the keys of the visible resource assignments.
    */
  def GetVisibleResourceAssignmentKeys(): js.Array[Any]
  
  /**
    * Gets the keys of the visible resources.
    */
  def GetVisibleResourceKeys(): js.Array[Any]
  
  /**
    * Gets the keys of the visible tasks.
    */
  def GetVisibleTaskKeys(): js.Array[Any]
  
  /**
    * Inserts a new dependency.
    * @param data The dependency data.
    */
  def InsertDependency(data: Any): Unit
  
  /**
    * Inserts a new resource.
    * @param data The resource data.
    * @param taskKeys An array of tasks' keys.
    */
  def InsertResource(data: Any, taskKeys: js.Array[Any]): Unit
  
  /**
    * Inserts a new task.
    * @param data The task data.
    */
  def InsertTask(data: Any): Unit
  
  /**
    * Occurs after a user assigned a resource to a task.
    */
  var ResourceAssigned: ASPxClientEvent[ASPxClientGanttResourceAssignedEventHandler[ASPxClientGantt]]
  
  /**
    * Occurs before a user assigns a resource to a task.
    */
  var ResourceAssigning: ASPxClientEvent[ASPxClientGanttResourceAssigningEventHandler[ASPxClientGantt]]
  
  /**
    * Occurs after a user deleted a resource.
    */
  var ResourceDeleted: ASPxClientEvent[ASPxClientGanttResourceDeletedEventHandler[ASPxClientGantt]]
  
  /**
    * Occurs before a user deletes a resource.
    */
  var ResourceDeleting: ASPxClientEvent[ASPxClientGanttResourceDeletingEventHandler[ASPxClientGantt]]
  
  /**
    * Occurs after a user inserted a new resource.
    */
  var ResourceInserted: ASPxClientEvent[ASPxClientGanttResourceInsertedEventHandler[ASPxClientGantt]]
  
  /**
    * Occurs before a user inserts a new resource.
    */
  var ResourceInserting: ASPxClientEvent[ASPxClientGanttResourceInsertingEventHandler[ASPxClientGantt]]
  
  /**
    * Occurs after a user removed a resource from a task.
    */
  var ResourceUnassigned: ASPxClientEvent[ASPxClientGanttResourceUnassignedEventHandler[ASPxClientGantt]]
  
  /**
    * Occurs before a user removes a resource from a task.
    */
  var ResourceUnassigning: ASPxClientEvent[ASPxClientGanttResourceUnassigningEventHandler[ASPxClientGantt]]
  
  /**
    * Sets the focused task.
    * @param key The task's key.
    */
  def SetFocusedTaskKey(key: Any): Unit
  
  /**
    * Sets the task's title position.
    * @param position The task position.
    */
  def SetTaskTitlePosition(position: ASPxClientGanttTaskTitlePosition): Unit
  
  /**
    * Specifies the view type.
    * @param viewType The control's view type.
    */
  def SetViewType(viewType: ASPxClientGanttViewType): Unit
  
  /**
    * Specifies whether the resources are visible in the Gantt.
    * @param value true, to show resources in the Gantt; otherwise, false.
    */
  def ShowResources(value: Boolean): Unit
  
  /**
    * Occurs before a user starts to edit a cell.
    */
  var StartCellEditing: ASPxClientEvent[ASPxClientGanttStartCellEditingEventHandler[ASPxClientGantt]]
  
  /**
    * Occurs when a user clicks a task.
    */
  var TaskClick: ASPxClientEvent[ASPxClientGanttTaskEventHandler[ASPxClientGantt]]
  
  /**
    * Occurs when a user double-clicks a task.
    */
  var TaskDblClick: ASPxClientEvent[ASPxClientGanttTaskEventHandler[ASPxClientGantt]]
  
  /**
    * Occurs after a user deleted a task.
    */
  var TaskDeleted: ASPxClientEvent[ASPxClientGanttTaskDeletedEventHandler[ASPxClientGantt]]
  
  /**
    * Occurs before a user deletes a task.
    */
  var TaskDeleting: ASPxClientEvent[ASPxClientGanttTaskDeletingEventHandler[ASPxClientGantt]]
  
  /**
    * Occurs before the edit dialog is shown.
    */
  var TaskEditDialogShowing: ASPxClientEvent[ASPxClientGanttTaskEditDialogShowingEventHandler[ASPxClientGantt]]
  
  /**
    * Occurs after a user inserted a task.
    */
  var TaskInserted: ASPxClientEvent[ASPxClientGanttTaskInsertedEventHandler[ASPxClientGantt]]
  
  /**
    * Occurs before a user inserts a task.
    */
  var TaskInserting: ASPxClientEvent[ASPxClientGanttTaskInsertingEventHandler[ASPxClientGantt]]
  
  /**
    * Occurs before a user moves a task.
    */
  var TaskMoving: ASPxClientEvent[ASPxClientGanttTaskMovingEventHandler[ASPxClientGantt]]
  
  /**
    * Occurs after a user updated a task.
    */
  var TaskUpdated: ASPxClientEvent[ASPxClientGanttTaskUpdatedEventHandler[ASPxClientGantt]]
  
  /**
    * Occurs before a user updates a task.
    */
  var TaskUpdating: ASPxClientEvent[ASPxClientGanttTaskUpdatingEventHandler[ASPxClientGantt]]
  
  /**
    * Occurs before a tooltip is displayed.
    */
  var TooltipShowing: ASPxClientEvent[ASPxClientGanttTooltipShowingEventHandler[ASPxClientGantt]]
  
  /**
    * Removes a resource from the task.
    * @param resourceKey The resource's key.
    * @param taskKey The task's key.
    */
  def UnassignResourceFromTask(resourceKey: Any, taskKey: Any): Unit
  
  /**
    * Updates the task data.
    * @param key The task's key.
    * @param data The task data.
    */
  def UpdateTask(key: Any, data: Any): Unit
}
object ASPxClientGantt {
  
  inline def apply(
    AdjustControl: Callback,
    AssignResourceToTask: (Any, Any) => Callback,
    BeginCallback: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientGantt]],
    CallbackError: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientGantt]],
    CollapseAll: Callback,
    CollapseTask: Any => Callback,
    ContextMenu: ASPxClientEvent[ASPxClientGanttContextMenuEventHandler[ASPxClientGantt]],
    ContextMenuCustomization: ASPxClientEvent[ASPxClientGanttContextMenuCustomizationEventHandler[ASPxClientGantt]],
    CustomCommand: ASPxClientEvent[ASPxClientGanttCustomCommandEventHandler[ASPxClientGantt]],
    DeleteDependency: Any => Callback,
    DeleteResource: Any => Callback,
    DeleteTask: Any => Callback,
    DependencyDeleted: ASPxClientEvent[ASPxClientGanttDependencyDeletedEventHandler[ASPxClientGantt]],
    DependencyDeleting: ASPxClientEvent[ASPxClientGanttDependencyDeletingEventHandler[ASPxClientGantt]],
    DependencyInserted: ASPxClientEvent[ASPxClientGanttDependencyInsertedEventHandler[ASPxClientGantt]],
    DependencyInserting: ASPxClientEvent[ASPxClientGanttDependencyInsertingEventHandler[ASPxClientGantt]],
    EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientGantt]],
    EndCellEditing: ASPxClientEvent[ASPxClientGanttEndCellEditingEventHandler[ASPxClientGantt]],
    ExpandAll: Callback,
    ExpandTask: Any => Callback,
    FocusedTaskChanged: ASPxClientEvent[ASPxClientGanttFocusedTaskChangedEventHandler[ASPxClientGantt]],
    FocusedTaskChanging: ASPxClientEvent[ASPxClientGanttFocusedTaskChangingEventHandler[ASPxClientGantt]],
    GetClientVisible: CallbackTo[Boolean],
    GetDependencyData: Any => Any,
    GetFocusedTaskKey: CallbackTo[Any],
    GetHeight: CallbackTo[Double],
    GetMainElement: CallbackTo[Any],
    GetParentControl: CallbackTo[Any],
    GetResourceAssignmentData: Any => Any,
    GetResourceData: Any => Any,
    GetTaskData: Any => Any,
    GetTaskResources: Any => js.Array[Any],
    GetVisible: CallbackTo[Boolean],
    GetVisibleDependencyKeys: CallbackTo[js.Array[Any]],
    GetVisibleResourceAssignmentKeys: CallbackTo[js.Array[Any]],
    GetVisibleResourceKeys: CallbackTo[js.Array[Any]],
    GetVisibleTaskKeys: CallbackTo[js.Array[Any]],
    GetWidth: CallbackTo[Double],
    InCallback: CallbackTo[Boolean],
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    InsertDependency: Any => Callback,
    InsertResource: (Any, js.Array[Any]) => Callback,
    InsertTask: Any => Callback,
    ResourceAssigned: ASPxClientEvent[ASPxClientGanttResourceAssignedEventHandler[ASPxClientGantt]],
    ResourceAssigning: ASPxClientEvent[ASPxClientGanttResourceAssigningEventHandler[ASPxClientGantt]],
    ResourceDeleted: ASPxClientEvent[ASPxClientGanttResourceDeletedEventHandler[ASPxClientGantt]],
    ResourceDeleting: ASPxClientEvent[ASPxClientGanttResourceDeletingEventHandler[ASPxClientGantt]],
    ResourceInserted: ASPxClientEvent[ASPxClientGanttResourceInsertedEventHandler[ASPxClientGantt]],
    ResourceInserting: ASPxClientEvent[ASPxClientGanttResourceInsertingEventHandler[ASPxClientGantt]],
    ResourceUnassigned: ASPxClientEvent[ASPxClientGanttResourceUnassignedEventHandler[ASPxClientGantt]],
    ResourceUnassigning: ASPxClientEvent[ASPxClientGanttResourceUnassigningEventHandler[ASPxClientGantt]],
    SendMessageToAssistiveTechnology: String => Callback,
    SetClientVisible: Boolean => Callback,
    SetFocusedTaskKey: Any => Callback,
    SetHeight: Double => Callback,
    SetTaskTitlePosition: ASPxClientGanttTaskTitlePosition => Callback,
    SetViewType: ASPxClientGanttViewType => Callback,
    SetVisible: Boolean => Callback,
    SetWidth: Double => Callback,
    ShowResources: Boolean => Callback,
    StartCellEditing: ASPxClientEvent[ASPxClientGanttStartCellEditingEventHandler[ASPxClientGantt]],
    TaskClick: ASPxClientEvent[ASPxClientGanttTaskEventHandler[ASPxClientGantt]],
    TaskDblClick: ASPxClientEvent[ASPxClientGanttTaskEventHandler[ASPxClientGantt]],
    TaskDeleted: ASPxClientEvent[ASPxClientGanttTaskDeletedEventHandler[ASPxClientGantt]],
    TaskDeleting: ASPxClientEvent[ASPxClientGanttTaskDeletingEventHandler[ASPxClientGantt]],
    TaskEditDialogShowing: ASPxClientEvent[ASPxClientGanttTaskEditDialogShowingEventHandler[ASPxClientGantt]],
    TaskInserted: ASPxClientEvent[ASPxClientGanttTaskInsertedEventHandler[ASPxClientGantt]],
    TaskInserting: ASPxClientEvent[ASPxClientGanttTaskInsertingEventHandler[ASPxClientGantt]],
    TaskMoving: ASPxClientEvent[ASPxClientGanttTaskMovingEventHandler[ASPxClientGantt]],
    TaskUpdated: ASPxClientEvent[ASPxClientGanttTaskUpdatedEventHandler[ASPxClientGantt]],
    TaskUpdating: ASPxClientEvent[ASPxClientGanttTaskUpdatingEventHandler[ASPxClientGantt]],
    TooltipShowing: ASPxClientEvent[ASPxClientGanttTooltipShowingEventHandler[ASPxClientGantt]],
    UnassignResourceFromTask: (Any, Any) => Callback,
    UpdateTask: (Any, Any) => Callback,
    name: String
  ): ASPxClientGantt = {
    val __obj = js.Dynamic.literal(AdjustControl = AdjustControl.toJsFn, AssignResourceToTask = js.Any.fromFunction2((t0: Any, t1: Any) => (AssignResourceToTask(t0, t1)).runNow()), BeginCallback = BeginCallback.asInstanceOf[js.Any], CallbackError = CallbackError.asInstanceOf[js.Any], CollapseAll = CollapseAll.toJsFn, CollapseTask = js.Any.fromFunction1((t0: Any) => CollapseTask(t0).runNow()), ContextMenu = ContextMenu.asInstanceOf[js.Any], ContextMenuCustomization = ContextMenuCustomization.asInstanceOf[js.Any], CustomCommand = CustomCommand.asInstanceOf[js.Any], DeleteDependency = js.Any.fromFunction1((t0: Any) => DeleteDependency(t0).runNow()), DeleteResource = js.Any.fromFunction1((t0: Any) => DeleteResource(t0).runNow()), DeleteTask = js.Any.fromFunction1((t0: Any) => DeleteTask(t0).runNow()), DependencyDeleted = DependencyDeleted.asInstanceOf[js.Any], DependencyDeleting = DependencyDeleting.asInstanceOf[js.Any], DependencyInserted = DependencyInserted.asInstanceOf[js.Any], DependencyInserting = DependencyInserting.asInstanceOf[js.Any], EndCallback = EndCallback.asInstanceOf[js.Any], EndCellEditing = EndCellEditing.asInstanceOf[js.Any], ExpandAll = ExpandAll.toJsFn, ExpandTask = js.Any.fromFunction1((t0: Any) => ExpandTask(t0).runNow()), FocusedTaskChanged = FocusedTaskChanged.asInstanceOf[js.Any], FocusedTaskChanging = FocusedTaskChanging.asInstanceOf[js.Any], GetClientVisible = GetClientVisible.toJsFn, GetDependencyData = js.Any.fromFunction1(GetDependencyData), GetFocusedTaskKey = GetFocusedTaskKey.toJsFn, GetHeight = GetHeight.toJsFn, GetMainElement = GetMainElement.toJsFn, GetParentControl = GetParentControl.toJsFn, GetResourceAssignmentData = js.Any.fromFunction1(GetResourceAssignmentData), GetResourceData = js.Any.fromFunction1(GetResourceData), GetTaskData = js.Any.fromFunction1(GetTaskData), GetTaskResources = js.Any.fromFunction1(GetTaskResources), GetVisible = GetVisible.toJsFn, GetVisibleDependencyKeys = GetVisibleDependencyKeys.toJsFn, GetVisibleResourceAssignmentKeys = GetVisibleResourceAssignmentKeys.toJsFn, GetVisibleResourceKeys = GetVisibleResourceKeys.toJsFn, GetVisibleTaskKeys = GetVisibleTaskKeys.toJsFn, GetWidth = GetWidth.toJsFn, InCallback = InCallback.toJsFn, Init = Init.asInstanceOf[js.Any], InsertDependency = js.Any.fromFunction1((t0: Any) => InsertDependency(t0).runNow()), InsertResource = js.Any.fromFunction2((t0: Any, t1: js.Array[Any]) => (InsertResource(t0, t1)).runNow()), InsertTask = js.Any.fromFunction1((t0: Any) => InsertTask(t0).runNow()), ResourceAssigned = ResourceAssigned.asInstanceOf[js.Any], ResourceAssigning = ResourceAssigning.asInstanceOf[js.Any], ResourceDeleted = ResourceDeleted.asInstanceOf[js.Any], ResourceDeleting = ResourceDeleting.asInstanceOf[js.Any], ResourceInserted = ResourceInserted.asInstanceOf[js.Any], ResourceInserting = ResourceInserting.asInstanceOf[js.Any], ResourceUnassigned = ResourceUnassigned.asInstanceOf[js.Any], ResourceUnassigning = ResourceUnassigning.asInstanceOf[js.Any], SendMessageToAssistiveTechnology = js.Any.fromFunction1((t0: String) => SendMessageToAssistiveTechnology(t0).runNow()), SetClientVisible = js.Any.fromFunction1((t0: Boolean) => SetClientVisible(t0).runNow()), SetFocusedTaskKey = js.Any.fromFunction1((t0: Any) => SetFocusedTaskKey(t0).runNow()), SetHeight = js.Any.fromFunction1((t0: Double) => SetHeight(t0).runNow()), SetTaskTitlePosition = js.Any.fromFunction1((t0: ASPxClientGanttTaskTitlePosition) => SetTaskTitlePosition(t0).runNow()), SetViewType = js.Any.fromFunction1((t0: ASPxClientGanttViewType) => SetViewType(t0).runNow()), SetVisible = js.Any.fromFunction1((t0: Boolean) => SetVisible(t0).runNow()), SetWidth = js.Any.fromFunction1((t0: Double) => SetWidth(t0).runNow()), ShowResources = js.Any.fromFunction1((t0: Boolean) => ShowResources(t0).runNow()), StartCellEditing = StartCellEditing.asInstanceOf[js.Any], TaskClick = TaskClick.asInstanceOf[js.Any], TaskDblClick = TaskDblClick.asInstanceOf[js.Any], TaskDeleted = TaskDeleted.asInstanceOf[js.Any], TaskDeleting = TaskDeleting.asInstanceOf[js.Any], TaskEditDialogShowing = TaskEditDialogShowing.asInstanceOf[js.Any], TaskInserted = TaskInserted.asInstanceOf[js.Any], TaskInserting = TaskInserting.asInstanceOf[js.Any], TaskMoving = TaskMoving.asInstanceOf[js.Any], TaskUpdated = TaskUpdated.asInstanceOf[js.Any], TaskUpdating = TaskUpdating.asInstanceOf[js.Any], TooltipShowing = TooltipShowing.asInstanceOf[js.Any], UnassignResourceFromTask = js.Any.fromFunction2((t0: Any, t1: Any) => (UnassignResourceFromTask(t0, t1)).runNow()), UpdateTask = js.Any.fromFunction2((t0: Any, t1: Any) => (UpdateTask(t0, t1)).runNow()), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientGantt]
  }
  
  extension [Self <: ASPxClientGantt](x: Self) {
    
    inline def setAssignResourceToTask(value: (Any, Any) => Callback): Self = StObject.set(x, "AssignResourceToTask", js.Any.fromFunction2((t0: Any, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def setBeginCallback(value: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientGantt]]): Self = StObject.set(x, "BeginCallback", value.asInstanceOf[js.Any])
    
    inline def setCallbackError(value: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientGantt]]): Self = StObject.set(x, "CallbackError", value.asInstanceOf[js.Any])
    
    inline def setCollapseAll(value: Callback): Self = StObject.set(x, "CollapseAll", value.toJsFn)
    
    inline def setCollapseTask(value: Any => Callback): Self = StObject.set(x, "CollapseTask", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setContextMenu(value: ASPxClientEvent[ASPxClientGanttContextMenuEventHandler[ASPxClientGantt]]): Self = StObject.set(x, "ContextMenu", value.asInstanceOf[js.Any])
    
    inline def setContextMenuCustomization(value: ASPxClientEvent[ASPxClientGanttContextMenuCustomizationEventHandler[ASPxClientGantt]]): Self = StObject.set(x, "ContextMenuCustomization", value.asInstanceOf[js.Any])
    
    inline def setCustomCommand(value: ASPxClientEvent[ASPxClientGanttCustomCommandEventHandler[ASPxClientGantt]]): Self = StObject.set(x, "CustomCommand", value.asInstanceOf[js.Any])
    
    inline def setDeleteDependency(value: Any => Callback): Self = StObject.set(x, "DeleteDependency", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setDeleteResource(value: Any => Callback): Self = StObject.set(x, "DeleteResource", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setDeleteTask(value: Any => Callback): Self = StObject.set(x, "DeleteTask", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setDependencyDeleted(value: ASPxClientEvent[ASPxClientGanttDependencyDeletedEventHandler[ASPxClientGantt]]): Self = StObject.set(x, "DependencyDeleted", value.asInstanceOf[js.Any])
    
    inline def setDependencyDeleting(value: ASPxClientEvent[ASPxClientGanttDependencyDeletingEventHandler[ASPxClientGantt]]): Self = StObject.set(x, "DependencyDeleting", value.asInstanceOf[js.Any])
    
    inline def setDependencyInserted(value: ASPxClientEvent[ASPxClientGanttDependencyInsertedEventHandler[ASPxClientGantt]]): Self = StObject.set(x, "DependencyInserted", value.asInstanceOf[js.Any])
    
    inline def setDependencyInserting(value: ASPxClientEvent[ASPxClientGanttDependencyInsertingEventHandler[ASPxClientGantt]]): Self = StObject.set(x, "DependencyInserting", value.asInstanceOf[js.Any])
    
    inline def setEndCallback(value: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientGantt]]): Self = StObject.set(x, "EndCallback", value.asInstanceOf[js.Any])
    
    inline def setEndCellEditing(value: ASPxClientEvent[ASPxClientGanttEndCellEditingEventHandler[ASPxClientGantt]]): Self = StObject.set(x, "EndCellEditing", value.asInstanceOf[js.Any])
    
    inline def setExpandAll(value: Callback): Self = StObject.set(x, "ExpandAll", value.toJsFn)
    
    inline def setExpandTask(value: Any => Callback): Self = StObject.set(x, "ExpandTask", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setFocusedTaskChanged(value: ASPxClientEvent[ASPxClientGanttFocusedTaskChangedEventHandler[ASPxClientGantt]]): Self = StObject.set(x, "FocusedTaskChanged", value.asInstanceOf[js.Any])
    
    inline def setFocusedTaskChanging(value: ASPxClientEvent[ASPxClientGanttFocusedTaskChangingEventHandler[ASPxClientGantt]]): Self = StObject.set(x, "FocusedTaskChanging", value.asInstanceOf[js.Any])
    
    inline def setGetDependencyData(value: Any => Any): Self = StObject.set(x, "GetDependencyData", js.Any.fromFunction1(value))
    
    inline def setGetFocusedTaskKey(value: CallbackTo[Any]): Self = StObject.set(x, "GetFocusedTaskKey", value.toJsFn)
    
    inline def setGetResourceAssignmentData(value: Any => Any): Self = StObject.set(x, "GetResourceAssignmentData", js.Any.fromFunction1(value))
    
    inline def setGetResourceData(value: Any => Any): Self = StObject.set(x, "GetResourceData", js.Any.fromFunction1(value))
    
    inline def setGetTaskData(value: Any => Any): Self = StObject.set(x, "GetTaskData", js.Any.fromFunction1(value))
    
    inline def setGetTaskResources(value: Any => js.Array[Any]): Self = StObject.set(x, "GetTaskResources", js.Any.fromFunction1(value))
    
    inline def setGetVisibleDependencyKeys(value: CallbackTo[js.Array[Any]]): Self = StObject.set(x, "GetVisibleDependencyKeys", value.toJsFn)
    
    inline def setGetVisibleResourceAssignmentKeys(value: CallbackTo[js.Array[Any]]): Self = StObject.set(x, "GetVisibleResourceAssignmentKeys", value.toJsFn)
    
    inline def setGetVisibleResourceKeys(value: CallbackTo[js.Array[Any]]): Self = StObject.set(x, "GetVisibleResourceKeys", value.toJsFn)
    
    inline def setGetVisibleTaskKeys(value: CallbackTo[js.Array[Any]]): Self = StObject.set(x, "GetVisibleTaskKeys", value.toJsFn)
    
    inline def setInsertDependency(value: Any => Callback): Self = StObject.set(x, "InsertDependency", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setInsertResource(value: (Any, js.Array[Any]) => Callback): Self = StObject.set(x, "InsertResource", js.Any.fromFunction2((t0: Any, t1: js.Array[Any]) => (value(t0, t1)).runNow()))
    
    inline def setInsertTask(value: Any => Callback): Self = StObject.set(x, "InsertTask", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setResourceAssigned(value: ASPxClientEvent[ASPxClientGanttResourceAssignedEventHandler[ASPxClientGantt]]): Self = StObject.set(x, "ResourceAssigned", value.asInstanceOf[js.Any])
    
    inline def setResourceAssigning(value: ASPxClientEvent[ASPxClientGanttResourceAssigningEventHandler[ASPxClientGantt]]): Self = StObject.set(x, "ResourceAssigning", value.asInstanceOf[js.Any])
    
    inline def setResourceDeleted(value: ASPxClientEvent[ASPxClientGanttResourceDeletedEventHandler[ASPxClientGantt]]): Self = StObject.set(x, "ResourceDeleted", value.asInstanceOf[js.Any])
    
    inline def setResourceDeleting(value: ASPxClientEvent[ASPxClientGanttResourceDeletingEventHandler[ASPxClientGantt]]): Self = StObject.set(x, "ResourceDeleting", value.asInstanceOf[js.Any])
    
    inline def setResourceInserted(value: ASPxClientEvent[ASPxClientGanttResourceInsertedEventHandler[ASPxClientGantt]]): Self = StObject.set(x, "ResourceInserted", value.asInstanceOf[js.Any])
    
    inline def setResourceInserting(value: ASPxClientEvent[ASPxClientGanttResourceInsertingEventHandler[ASPxClientGantt]]): Self = StObject.set(x, "ResourceInserting", value.asInstanceOf[js.Any])
    
    inline def setResourceUnassigned(value: ASPxClientEvent[ASPxClientGanttResourceUnassignedEventHandler[ASPxClientGantt]]): Self = StObject.set(x, "ResourceUnassigned", value.asInstanceOf[js.Any])
    
    inline def setResourceUnassigning(value: ASPxClientEvent[ASPxClientGanttResourceUnassigningEventHandler[ASPxClientGantt]]): Self = StObject.set(x, "ResourceUnassigning", value.asInstanceOf[js.Any])
    
    inline def setSetFocusedTaskKey(value: Any => Callback): Self = StObject.set(x, "SetFocusedTaskKey", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setSetTaskTitlePosition(value: ASPxClientGanttTaskTitlePosition => Callback): Self = StObject.set(x, "SetTaskTitlePosition", js.Any.fromFunction1((t0: ASPxClientGanttTaskTitlePosition) => value(t0).runNow()))
    
    inline def setSetViewType(value: ASPxClientGanttViewType => Callback): Self = StObject.set(x, "SetViewType", js.Any.fromFunction1((t0: ASPxClientGanttViewType) => value(t0).runNow()))
    
    inline def setShowResources(value: Boolean => Callback): Self = StObject.set(x, "ShowResources", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setStartCellEditing(value: ASPxClientEvent[ASPxClientGanttStartCellEditingEventHandler[ASPxClientGantt]]): Self = StObject.set(x, "StartCellEditing", value.asInstanceOf[js.Any])
    
    inline def setTaskClick(value: ASPxClientEvent[ASPxClientGanttTaskEventHandler[ASPxClientGantt]]): Self = StObject.set(x, "TaskClick", value.asInstanceOf[js.Any])
    
    inline def setTaskDblClick(value: ASPxClientEvent[ASPxClientGanttTaskEventHandler[ASPxClientGantt]]): Self = StObject.set(x, "TaskDblClick", value.asInstanceOf[js.Any])
    
    inline def setTaskDeleted(value: ASPxClientEvent[ASPxClientGanttTaskDeletedEventHandler[ASPxClientGantt]]): Self = StObject.set(x, "TaskDeleted", value.asInstanceOf[js.Any])
    
    inline def setTaskDeleting(value: ASPxClientEvent[ASPxClientGanttTaskDeletingEventHandler[ASPxClientGantt]]): Self = StObject.set(x, "TaskDeleting", value.asInstanceOf[js.Any])
    
    inline def setTaskEditDialogShowing(value: ASPxClientEvent[ASPxClientGanttTaskEditDialogShowingEventHandler[ASPxClientGantt]]): Self = StObject.set(x, "TaskEditDialogShowing", value.asInstanceOf[js.Any])
    
    inline def setTaskInserted(value: ASPxClientEvent[ASPxClientGanttTaskInsertedEventHandler[ASPxClientGantt]]): Self = StObject.set(x, "TaskInserted", value.asInstanceOf[js.Any])
    
    inline def setTaskInserting(value: ASPxClientEvent[ASPxClientGanttTaskInsertingEventHandler[ASPxClientGantt]]): Self = StObject.set(x, "TaskInserting", value.asInstanceOf[js.Any])
    
    inline def setTaskMoving(value: ASPxClientEvent[ASPxClientGanttTaskMovingEventHandler[ASPxClientGantt]]): Self = StObject.set(x, "TaskMoving", value.asInstanceOf[js.Any])
    
    inline def setTaskUpdated(value: ASPxClientEvent[ASPxClientGanttTaskUpdatedEventHandler[ASPxClientGantt]]): Self = StObject.set(x, "TaskUpdated", value.asInstanceOf[js.Any])
    
    inline def setTaskUpdating(value: ASPxClientEvent[ASPxClientGanttTaskUpdatingEventHandler[ASPxClientGantt]]): Self = StObject.set(x, "TaskUpdating", value.asInstanceOf[js.Any])
    
    inline def setTooltipShowing(value: ASPxClientEvent[ASPxClientGanttTooltipShowingEventHandler[ASPxClientGantt]]): Self = StObject.set(x, "TooltipShowing", value.asInstanceOf[js.Any])
    
    inline def setUnassignResourceFromTask(value: (Any, Any) => Callback): Self = StObject.set(x, "UnassignResourceFromTask", js.Any.fromFunction2((t0: Any, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def setUpdateTask(value: (Any, Any) => Callback): Self = StObject.set(x, "UpdateTask", js.Any.fromFunction2((t0: Any, t1: Any) => (value(t0, t1)).runNow()))
  }
}
