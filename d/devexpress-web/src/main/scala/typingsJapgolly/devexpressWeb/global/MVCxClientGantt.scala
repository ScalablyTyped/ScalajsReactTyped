package typingsJapgolly.devexpressWeb.global

import typingsJapgolly.devexpressWeb.ASPxClientBeginCallbackEventHandler
import typingsJapgolly.devexpressWeb.ASPxClientCallbackErrorEventHandler
import typingsJapgolly.devexpressWeb.ASPxClientEndCallbackEventHandler
import typingsJapgolly.devexpressWeb.ASPxClientEventHandler
import typingsJapgolly.devexpressWeb.ASPxClientGanttContextMenuCustomizationEventHandler
import typingsJapgolly.devexpressWeb.ASPxClientGanttContextMenuEventHandler
import typingsJapgolly.devexpressWeb.ASPxClientGanttCustomCommandEventHandler
import typingsJapgolly.devexpressWeb.ASPxClientGanttDependencyDeletedEventHandler
import typingsJapgolly.devexpressWeb.ASPxClientGanttDependencyDeletingEventHandler
import typingsJapgolly.devexpressWeb.ASPxClientGanttDependencyInsertedEventHandler
import typingsJapgolly.devexpressWeb.ASPxClientGanttDependencyInsertingEventHandler
import typingsJapgolly.devexpressWeb.ASPxClientGanttEndCellEditingEventHandler
import typingsJapgolly.devexpressWeb.ASPxClientGanttFocusedTaskChangedEventHandler
import typingsJapgolly.devexpressWeb.ASPxClientGanttFocusedTaskChangingEventHandler
import typingsJapgolly.devexpressWeb.ASPxClientGanttResourceAssignedEventHandler
import typingsJapgolly.devexpressWeb.ASPxClientGanttResourceAssigningEventHandler
import typingsJapgolly.devexpressWeb.ASPxClientGanttResourceDeletedEventHandler
import typingsJapgolly.devexpressWeb.ASPxClientGanttResourceDeletingEventHandler
import typingsJapgolly.devexpressWeb.ASPxClientGanttResourceInsertedEventHandler
import typingsJapgolly.devexpressWeb.ASPxClientGanttResourceInsertingEventHandler
import typingsJapgolly.devexpressWeb.ASPxClientGanttResourceUnassignedEventHandler
import typingsJapgolly.devexpressWeb.ASPxClientGanttResourceUnassigningEventHandler
import typingsJapgolly.devexpressWeb.ASPxClientGanttStartCellEditingEventHandler
import typingsJapgolly.devexpressWeb.ASPxClientGanttTaskDeletedEventHandler
import typingsJapgolly.devexpressWeb.ASPxClientGanttTaskDeletingEventHandler
import typingsJapgolly.devexpressWeb.ASPxClientGanttTaskEditDialogShowingEventHandler
import typingsJapgolly.devexpressWeb.ASPxClientGanttTaskEventHandler
import typingsJapgolly.devexpressWeb.ASPxClientGanttTaskInsertedEventHandler
import typingsJapgolly.devexpressWeb.ASPxClientGanttTaskInsertingEventHandler
import typingsJapgolly.devexpressWeb.ASPxClientGanttTaskMovingEventHandler
import typingsJapgolly.devexpressWeb.ASPxClientGanttTaskUpdatedEventHandler
import typingsJapgolly.devexpressWeb.ASPxClientGanttTaskUpdatingEventHandler
import typingsJapgolly.devexpressWeb.ASPxClientGanttTooltipShowingEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A client-side counterpart of the Gantt extension.
  */
@JSGlobal("MVCxClientGantt")
@js.native
open class MVCxClientGantt ()
  extends StObject
     with typingsJapgolly.devexpressWeb.ASPxClientGantt {
  
  /**
    * Modifies the control's size against the control's container.
    */
  /* CompleteClass */
  override def AdjustControl(): Unit = js.native
  
  /**
    * Assigns a resource to a task.
    * @param resourceKey The resource's key.
    * @param taskKey The task's key.
    */
  /* CompleteClass */
  override def AssignResourceToTask(resourceKey: Any, taskKey: Any): Unit = js.native
  
  /**
    * Occurs when a callback for server-side processing is initiated.
    */
  /* CompleteClass */
  var BeginCallback: typingsJapgolly.devexpressWeb.ASPxClientEvent[
    ASPxClientBeginCallbackEventHandler[typingsJapgolly.devexpressWeb.ASPxClientGantt]
  ] = js.native
  
  /**
    * Fires on the client if any server error occurs during server-side processing of a callback sent by the ASPxClientGantt.
    */
  /* CompleteClass */
  var CallbackError: typingsJapgolly.devexpressWeb.ASPxClientEvent[
    ASPxClientCallbackErrorEventHandler[typingsJapgolly.devexpressWeb.ASPxClientGantt]
  ] = js.native
  
  /**
    * Collapses all tasks.
    */
  /* CompleteClass */
  override def CollapseAll(): Unit = js.native
  
  /**
    * Collapses the specified parent task.
    * @param key The task key.
    */
  /* CompleteClass */
  override def CollapseTask(key: Any): Unit = js.native
  
  /**
    * Occurs when a user right-clicks a task or dependency to open the context menu.
    */
  /* CompleteClass */
  var ContextMenu: typingsJapgolly.devexpressWeb.ASPxClientEvent[
    ASPxClientGanttContextMenuEventHandler[typingsJapgolly.devexpressWeb.ASPxClientGantt]
  ] = js.native
  
  /**
    * Occurs before the built-in context menu is rendered.
    */
  /* CompleteClass */
  var ContextMenuCustomization: typingsJapgolly.devexpressWeb.ASPxClientEvent[
    ASPxClientGanttContextMenuCustomizationEventHandler[typingsJapgolly.devexpressWeb.ASPxClientGantt]
  ] = js.native
  
  /**
    * Enables you to implement a custom command's logic.
    */
  /* CompleteClass */
  var CustomCommand: typingsJapgolly.devexpressWeb.ASPxClientEvent[
    ASPxClientGanttCustomCommandEventHandler[typingsJapgolly.devexpressWeb.ASPxClientGantt]
  ] = js.native
  
  /**
    * Deletes a dependency.
    * @param key The dependency's key.
    */
  /* CompleteClass */
  override def DeleteDependency(key: Any): Unit = js.native
  
  /**
    * Deletes a resource.
    * @param key The resource's key.
    */
  /* CompleteClass */
  override def DeleteResource(key: Any): Unit = js.native
  
  /**
    * Deletes a task.
    * @param key The task's key.
    */
  /* CompleteClass */
  override def DeleteTask(key: Any): Unit = js.native
  
  /**
    * Occurs after a user deleted a dependency.
    */
  /* CompleteClass */
  var DependencyDeleted: typingsJapgolly.devexpressWeb.ASPxClientEvent[
    ASPxClientGanttDependencyDeletedEventHandler[typingsJapgolly.devexpressWeb.ASPxClientGantt]
  ] = js.native
  
  /**
    * Occurs before a user deletes a dependency.
    */
  /* CompleteClass */
  var DependencyDeleting: typingsJapgolly.devexpressWeb.ASPxClientEvent[
    ASPxClientGanttDependencyDeletingEventHandler[typingsJapgolly.devexpressWeb.ASPxClientGantt]
  ] = js.native
  
  /**
    * Occurs after a user inserted a dependency.
    */
  /* CompleteClass */
  var DependencyInserted: typingsJapgolly.devexpressWeb.ASPxClientEvent[
    ASPxClientGanttDependencyInsertedEventHandler[typingsJapgolly.devexpressWeb.ASPxClientGantt]
  ] = js.native
  
  /**
    * Occurs before a user inserts a dependency.
    */
  /* CompleteClass */
  var DependencyInserting: typingsJapgolly.devexpressWeb.ASPxClientEvent[
    ASPxClientGanttDependencyInsertingEventHandler[typingsJapgolly.devexpressWeb.ASPxClientGantt]
  ] = js.native
  
  /**
    * Occurs on the client side after a callback's server-side processing has been completed.
    */
  /* CompleteClass */
  var EndCallback: typingsJapgolly.devexpressWeb.ASPxClientEvent[ASPxClientEndCallbackEventHandler[typingsJapgolly.devexpressWeb.ASPxClientGantt]] = js.native
  
  /**
    * Occurs before a user finishes editing a cell.
    */
  /* CompleteClass */
  var EndCellEditing: typingsJapgolly.devexpressWeb.ASPxClientEvent[
    ASPxClientGanttEndCellEditingEventHandler[typingsJapgolly.devexpressWeb.ASPxClientGantt]
  ] = js.native
  
  /**
    * Expands all tasks.
    */
  /* CompleteClass */
  override def ExpandAll(): Unit = js.native
  
  /**
    * Expands the specified task.
    * @param key The task key.
    */
  /* CompleteClass */
  override def ExpandTask(key: Any): Unit = js.native
  
  /**
    * Occurs when a task is focused.
    */
  /* CompleteClass */
  var FocusedTaskChanged: typingsJapgolly.devexpressWeb.ASPxClientEvent[
    ASPxClientGanttFocusedTaskChangedEventHandler[typingsJapgolly.devexpressWeb.ASPxClientGantt]
  ] = js.native
  
  /**
    * Occurs before a task is focused.
    */
  /* CompleteClass */
  var FocusedTaskChanging: typingsJapgolly.devexpressWeb.ASPxClientEvent[
    ASPxClientGanttFocusedTaskChangingEventHandler[typingsJapgolly.devexpressWeb.ASPxClientGantt]
  ] = js.native
  
  /** @deprecated Use the GetVisible method instead. */
  /**
    * Returns a value specifying whether a control is displayed.
    */
  /* CompleteClass */
  override def GetClientVisible(): Boolean = js.native
  
  /**
    * Gets the dependency data. The dependency's data.
    * @param key The dependency's key.
    */
  /* CompleteClass */
  override def GetDependencyData(key: Any): Any = js.native
  
  /**
    * Gets the focused task's key.
    */
  /* CompleteClass */
  override def GetFocusedTaskKey(): Any = js.native
  
  /**
    * Returns the control's height.
    */
  /* CompleteClass */
  override def GetHeight(): Double = js.native
  
  /**
    * Returns an HTML element that is the root of the control's hierarchy.
    */
  /* CompleteClass */
  override def GetMainElement(): Any = js.native
  
  /**
    * Returns a client instance of the control that is the parent for a specified control.
    */
  /* CompleteClass */
  override def GetParentControl(): Any = js.native
  
  /**
    * Gets the resource assignment data. The resource assignment data.
    * @param key The resource assignment's key.
    */
  /* CompleteClass */
  override def GetResourceAssignmentData(key: Any): Any = js.native
  
  /**
    * Gets the resource data. The resource's data.
    * @param key The resource's key.
    */
  /* CompleteClass */
  override def GetResourceData(key: Any): Any = js.native
  
  /**
    * Gets the task data. The task data.
    * @param key The task's key.
    */
  /* CompleteClass */
  override def GetTaskData(key: Any): Any = js.native
  
  /**
    * Gets resources assigned to a task. The resources.
    * @param key The task's key.
    */
  /* CompleteClass */
  override def GetTaskResources(key: Any): js.Array[Any] = js.native
  
  /**
    * Returns a value specifying whether a control is displayed.
    */
  /* CompleteClass */
  override def GetVisible(): Boolean = js.native
  
  /**
    * Gets the keys of the visible dependencies.
    */
  /* CompleteClass */
  override def GetVisibleDependencyKeys(): js.Array[Any] = js.native
  
  /**
    * Gets the keys of the visible resource assignments.
    */
  /* CompleteClass */
  override def GetVisibleResourceAssignmentKeys(): js.Array[Any] = js.native
  
  /**
    * Gets the keys of the visible resources.
    */
  /* CompleteClass */
  override def GetVisibleResourceKeys(): js.Array[Any] = js.native
  
  /**
    * Gets the keys of the visible tasks.
    */
  /* CompleteClass */
  override def GetVisibleTaskKeys(): js.Array[Any] = js.native
  
  /**
    * Returns the control's width.
    */
  /* CompleteClass */
  override def GetWidth(): Double = js.native
  
  /**
    * Returns a value that determines whether a callback request sent by a web control is being currently processed on the server side.
    */
  /* CompleteClass */
  override def InCallback(): Boolean = js.native
  
  /**
    * Occurs on the client side after the control has been initialized.
    */
  /* CompleteClass */
  var Init: typingsJapgolly.devexpressWeb.ASPxClientEvent[ASPxClientEventHandler[typingsJapgolly.devexpressWeb.ASPxClientControlBase]] = js.native
  
  /**
    * Inserts a new dependency.
    * @param data The dependency data.
    */
  /* CompleteClass */
  override def InsertDependency(data: Any): Unit = js.native
  
  /**
    * Inserts a new resource.
    * @param data The resource data.
    * @param taskKeys An array of tasks' keys.
    */
  /* CompleteClass */
  override def InsertResource(data: Any, taskKeys: js.Array[Any]): Unit = js.native
  
  /**
    * Inserts a new task.
    * @param data The task data.
    */
  /* CompleteClass */
  override def InsertTask(data: Any): Unit = js.native
  
  /**
    * Occurs after a user assigned a resource to a task.
    */
  /* CompleteClass */
  var ResourceAssigned: typingsJapgolly.devexpressWeb.ASPxClientEvent[
    ASPxClientGanttResourceAssignedEventHandler[typingsJapgolly.devexpressWeb.ASPxClientGantt]
  ] = js.native
  
  /**
    * Occurs before a user assigns a resource to a task.
    */
  /* CompleteClass */
  var ResourceAssigning: typingsJapgolly.devexpressWeb.ASPxClientEvent[
    ASPxClientGanttResourceAssigningEventHandler[typingsJapgolly.devexpressWeb.ASPxClientGantt]
  ] = js.native
  
  /**
    * Occurs after a user deleted a resource.
    */
  /* CompleteClass */
  var ResourceDeleted: typingsJapgolly.devexpressWeb.ASPxClientEvent[
    ASPxClientGanttResourceDeletedEventHandler[typingsJapgolly.devexpressWeb.ASPxClientGantt]
  ] = js.native
  
  /**
    * Occurs before a user deletes a resource.
    */
  /* CompleteClass */
  var ResourceDeleting: typingsJapgolly.devexpressWeb.ASPxClientEvent[
    ASPxClientGanttResourceDeletingEventHandler[typingsJapgolly.devexpressWeb.ASPxClientGantt]
  ] = js.native
  
  /**
    * Occurs after a user inserted a new resource.
    */
  /* CompleteClass */
  var ResourceInserted: typingsJapgolly.devexpressWeb.ASPxClientEvent[
    ASPxClientGanttResourceInsertedEventHandler[typingsJapgolly.devexpressWeb.ASPxClientGantt]
  ] = js.native
  
  /**
    * Occurs before a user inserts a new resource.
    */
  /* CompleteClass */
  var ResourceInserting: typingsJapgolly.devexpressWeb.ASPxClientEvent[
    ASPxClientGanttResourceInsertingEventHandler[typingsJapgolly.devexpressWeb.ASPxClientGantt]
  ] = js.native
  
  /**
    * Occurs after a user removed a resource from a task.
    */
  /* CompleteClass */
  var ResourceUnassigned: typingsJapgolly.devexpressWeb.ASPxClientEvent[
    ASPxClientGanttResourceUnassignedEventHandler[typingsJapgolly.devexpressWeb.ASPxClientGantt]
  ] = js.native
  
  /**
    * Occurs before a user removes a resource from a task.
    */
  /* CompleteClass */
  var ResourceUnassigning: typingsJapgolly.devexpressWeb.ASPxClientEvent[
    ASPxClientGanttResourceUnassigningEventHandler[typingsJapgolly.devexpressWeb.ASPxClientGantt]
  ] = js.native
  
  /**
    * Specifies the text that Assistive Technologies (screen readers or braille display, for example) will provide to a user.
    * @param message A String value that specifies a text.
    */
  /* CompleteClass */
  override def SendMessageToAssistiveTechnology(message: String): Unit = js.native
  
  /** @deprecated Use the SetVisible method instead. */
  /**
    * Specifies whether a control is displayed.
    */
  /* CompleteClass */
  override def SetClientVisible(visible: Boolean): Unit = js.native
  
  /**
    * Sets the focused task.
    * @param key The task's key.
    */
  /* CompleteClass */
  override def SetFocusedTaskKey(key: Any): Unit = js.native
  
  /**
    * Specifies the control's height.  Note that this method is not in effect for some controls.
    * @param height An integer value that specifies the control's height.
    */
  /* CompleteClass */
  override def SetHeight(height: Double): Unit = js.native
  
  /**
    * Sets the task's title position.
    * @param position The task position.
    */
  /* CompleteClass */
  override def SetTaskTitlePosition(position: typingsJapgolly.devexpressWeb.ASPxClientGanttTaskTitlePosition): Unit = js.native
  
  /**
    * Specifies the view type.
    * @param viewType The control's view type.
    */
  /* CompleteClass */
  override def SetViewType(viewType: typingsJapgolly.devexpressWeb.ASPxClientGanttViewType): Unit = js.native
  
  /**
    * Specifies whether a control is displayed.
    * @param visible true to make a control visible; false to make it hidden.
    */
  /* CompleteClass */
  override def SetVisible(visible: Boolean): Unit = js.native
  
  /**
    * Specifies the control's width in pixels.
    * @param width An integer value that specifies the control's width, in pixels.
    */
  /* CompleteClass */
  override def SetWidth(width: Double): Unit = js.native
  
  /**
    * Specifies whether the resources are visible in the Gantt.
    * @param value true, to show resources in the Gantt; otherwise, false.
    */
  /* CompleteClass */
  override def ShowResources(value: Boolean): Unit = js.native
  
  /**
    * Occurs before a user starts to edit a cell.
    */
  /* CompleteClass */
  var StartCellEditing: typingsJapgolly.devexpressWeb.ASPxClientEvent[
    ASPxClientGanttStartCellEditingEventHandler[typingsJapgolly.devexpressWeb.ASPxClientGantt]
  ] = js.native
  
  /**
    * Occurs when a user clicks a task.
    */
  /* CompleteClass */
  var TaskClick: typingsJapgolly.devexpressWeb.ASPxClientEvent[ASPxClientGanttTaskEventHandler[typingsJapgolly.devexpressWeb.ASPxClientGantt]] = js.native
  
  /**
    * Occurs when a user double-clicks a task.
    */
  /* CompleteClass */
  var TaskDblClick: typingsJapgolly.devexpressWeb.ASPxClientEvent[ASPxClientGanttTaskEventHandler[typingsJapgolly.devexpressWeb.ASPxClientGantt]] = js.native
  
  /**
    * Occurs after a user deleted a task.
    */
  /* CompleteClass */
  var TaskDeleted: typingsJapgolly.devexpressWeb.ASPxClientEvent[
    ASPxClientGanttTaskDeletedEventHandler[typingsJapgolly.devexpressWeb.ASPxClientGantt]
  ] = js.native
  
  /**
    * Occurs before a user deletes a task.
    */
  /* CompleteClass */
  var TaskDeleting: typingsJapgolly.devexpressWeb.ASPxClientEvent[
    ASPxClientGanttTaskDeletingEventHandler[typingsJapgolly.devexpressWeb.ASPxClientGantt]
  ] = js.native
  
  /**
    * Occurs before the edit dialog is shown.
    */
  /* CompleteClass */
  var TaskEditDialogShowing: typingsJapgolly.devexpressWeb.ASPxClientEvent[
    ASPxClientGanttTaskEditDialogShowingEventHandler[typingsJapgolly.devexpressWeb.ASPxClientGantt]
  ] = js.native
  
  /**
    * Occurs after a user inserted a task.
    */
  /* CompleteClass */
  var TaskInserted: typingsJapgolly.devexpressWeb.ASPxClientEvent[
    ASPxClientGanttTaskInsertedEventHandler[typingsJapgolly.devexpressWeb.ASPxClientGantt]
  ] = js.native
  
  /**
    * Occurs before a user inserts a task.
    */
  /* CompleteClass */
  var TaskInserting: typingsJapgolly.devexpressWeb.ASPxClientEvent[
    ASPxClientGanttTaskInsertingEventHandler[typingsJapgolly.devexpressWeb.ASPxClientGantt]
  ] = js.native
  
  /**
    * Occurs before a user moves a task.
    */
  /* CompleteClass */
  var TaskMoving: typingsJapgolly.devexpressWeb.ASPxClientEvent[
    ASPxClientGanttTaskMovingEventHandler[typingsJapgolly.devexpressWeb.ASPxClientGantt]
  ] = js.native
  
  /**
    * Occurs after a user updated a task.
    */
  /* CompleteClass */
  var TaskUpdated: typingsJapgolly.devexpressWeb.ASPxClientEvent[
    ASPxClientGanttTaskUpdatedEventHandler[typingsJapgolly.devexpressWeb.ASPxClientGantt]
  ] = js.native
  
  /**
    * Occurs before a user updates a task.
    */
  /* CompleteClass */
  var TaskUpdating: typingsJapgolly.devexpressWeb.ASPxClientEvent[
    ASPxClientGanttTaskUpdatingEventHandler[typingsJapgolly.devexpressWeb.ASPxClientGantt]
  ] = js.native
  
  /**
    * Occurs before a tooltip is displayed.
    */
  /* CompleteClass */
  var TooltipShowing: typingsJapgolly.devexpressWeb.ASPxClientEvent[
    ASPxClientGanttTooltipShowingEventHandler[typingsJapgolly.devexpressWeb.ASPxClientGantt]
  ] = js.native
  
  /**
    * Removes a resource from the task.
    * @param resourceKey The resource's key.
    * @param taskKey The task's key.
    */
  /* CompleteClass */
  override def UnassignResourceFromTask(resourceKey: Any, taskKey: Any): Unit = js.native
  
  /**
    * Updates the task data.
    * @param key The task's key.
    * @param data The task data.
    */
  /* CompleteClass */
  override def UpdateTask(key: Any, data: Any): Unit = js.native
  
  /**
    * Gets the unique, hierarchically-qualified identifier for the control.
    */
  /* CompleteClass */
  var name: String = js.native
}
object MVCxClientGantt {
  
  @JSGlobal("MVCxClientGantt")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Converts the specified object to the MVCxClientGantt type. The converted client object specified by the obj parameter.
    * @param obj The client object to be type cast.
    */
  /* static member */
  inline def Cast(obj: Any): typingsJapgolly.devexpressWeb.MVCxClientGantt = ^.asInstanceOf[js.Dynamic].applyDynamic("Cast")(obj.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.devexpressWeb.MVCxClientGantt]
}
