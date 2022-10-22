package typingsJapgolly.officeJsPreview.Excel.Interfaces

import typingsJapgolly.officeJsPreview.Excel.Identity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `documentTask.toJSON()`. */
trait DocumentTaskData extends StObject {
  
  /**
    * Returns a collection of assignees of the task.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var assignees: js.UndefOr[js.Array[Identity]] = js.undefined
  
  /**
    * Gets the most recent user to have completed the task.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var completedBy: js.UndefOr[Identity] = js.undefined
  
  /**
    * Gets the date and time that the task was completed. All dates are in UTC.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var completedDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Gets the user who created the task.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var createdBy: js.UndefOr[Identity] = js.undefined
  
  /**
    * Gets the date and time that the task was created. All dates are in UTC.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var createdDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Gets or sets the date and time the task is due.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var dueDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Gets the ID of the task.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the completion percentage of the task. This is a value between 0 and 100, where 100 represents a completed task.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var percentComplete: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the priority of the task. This is a value between 0 and 10, where 0 represents the highest priority.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var priority: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets or sets the date and time the task starts.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var startDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Specifies title of the task.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var title: js.UndefOr[String] = js.undefined
}
object DocumentTaskData {
  
  inline def apply(): DocumentTaskData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentTaskData]
  }
  
  extension [Self <: DocumentTaskData](x: Self) {
    
    inline def setAssignees(value: js.Array[Identity]): Self = StObject.set(x, "assignees", value.asInstanceOf[js.Any])
    
    inline def setAssigneesUndefined: Self = StObject.set(x, "assignees", js.undefined)
    
    inline def setAssigneesVarargs(value: Identity*): Self = StObject.set(x, "assignees", js.Array(value*))
    
    inline def setCompletedBy(value: Identity): Self = StObject.set(x, "completedBy", value.asInstanceOf[js.Any])
    
    inline def setCompletedByUndefined: Self = StObject.set(x, "completedBy", js.undefined)
    
    inline def setCompletedDateTime(value: js.Date): Self = StObject.set(x, "completedDateTime", value.asInstanceOf[js.Any])
    
    inline def setCompletedDateTimeUndefined: Self = StObject.set(x, "completedDateTime", js.undefined)
    
    inline def setCreatedBy(value: Identity): Self = StObject.set(x, "createdBy", value.asInstanceOf[js.Any])
    
    inline def setCreatedByUndefined: Self = StObject.set(x, "createdBy", js.undefined)
    
    inline def setCreatedDateTime(value: js.Date): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
    inline def setDueDateTime(value: js.Date): Self = StObject.set(x, "dueDateTime", value.asInstanceOf[js.Any])
    
    inline def setDueDateTimeUndefined: Self = StObject.set(x, "dueDateTime", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setPercentComplete(value: Double): Self = StObject.set(x, "percentComplete", value.asInstanceOf[js.Any])
    
    inline def setPercentCompleteUndefined: Self = StObject.set(x, "percentComplete", js.undefined)
    
    inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setStartDateTime(value: js.Date): Self = StObject.set(x, "startDateTime", value.asInstanceOf[js.Any])
    
    inline def setStartDateTimeUndefined: Self = StObject.set(x, "startDateTime", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
