package typingsJapgolly.activexOffice.Office

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkflowTask extends StObject {
  
  val Application: Any
  
  val AssignedTo: String
  
  val CreatedBy: String
  
  val CreatedDate: VarDate
  
  val Creator: Double
  
  val Description: String
  
  val DueDate: VarDate
  
  val Id: String
  
  val ListID: String
  
  val Name: String
  
  /* private */ @JSName("Office.WorkflowTask_typekey")
  var OfficeDotWorkflowTask_typekey: WorkflowTask
  
  def Show(): Double
  
  val WorkflowID: String
}
object WorkflowTask {
  
  inline def apply(
    Application: Any,
    AssignedTo: String,
    CreatedBy: String,
    CreatedDate: VarDate,
    Creator: Double,
    Description: String,
    DueDate: VarDate,
    Id: String,
    ListID: String,
    Name: String,
    OfficeDotWorkflowTask_typekey: WorkflowTask,
    Show: CallbackTo[Double],
    WorkflowID: String
  ): WorkflowTask = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], AssignedTo = AssignedTo.asInstanceOf[js.Any], CreatedBy = CreatedBy.asInstanceOf[js.Any], CreatedDate = CreatedDate.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], DueDate = DueDate.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], ListID = ListID.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Show = Show.toJsFn, WorkflowID = WorkflowID.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.WorkflowTask_typekey")(OfficeDotWorkflowTask_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkflowTask]
  }
  
  extension [Self <: WorkflowTask](x: Self) {
    
    inline def setApplication(value: Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setAssignedTo(value: String): Self = StObject.set(x, "AssignedTo", value.asInstanceOf[js.Any])
    
    inline def setCreatedBy(value: String): Self = StObject.set(x, "CreatedBy", value.asInstanceOf[js.Any])
    
    inline def setCreatedDate(value: VarDate): Self = StObject.set(x, "CreatedDate", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDueDate(value: VarDate): Self = StObject.set(x, "DueDate", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setListID(value: String): Self = StObject.set(x, "ListID", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setOfficeDotWorkflowTask_typekey(value: WorkflowTask): Self = StObject.set(x, "Office.WorkflowTask_typekey", value.asInstanceOf[js.Any])
    
    inline def setShow(value: CallbackTo[Double]): Self = StObject.set(x, "Show", value.toJsFn)
    
    inline def setWorkflowID(value: String): Self = StObject.set(x, "WorkflowID", value.asInstanceOf[js.Any])
  }
}
