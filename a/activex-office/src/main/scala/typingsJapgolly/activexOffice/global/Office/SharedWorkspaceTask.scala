package typingsJapgolly.activexOffice.global.Office

import typingsJapgolly.activexOffice.Office.MsoSharedWorkspaceTaskPriority
import typingsJapgolly.activexOffice.Office.MsoSharedWorkspaceTaskStatus
import typingsJapgolly.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Office.SharedWorkspaceTask")
@js.native
/* private */ open class SharedWorkspaceTask ()
  extends StObject
     with typingsJapgolly.activexOffice.Office.SharedWorkspaceTask {
  
  /* CompleteClass */
  override val Application: Any = js.native
  
  /* CompleteClass */
  var AssignedTo: String = js.native
  
  /* CompleteClass */
  override val CreatedBy: String = js.native
  
  /* CompleteClass */
  override val CreatedDate: VarDate = js.native
  
  /* CompleteClass */
  override val Creator: Double = js.native
  
  /* CompleteClass */
  override def Delete(): Unit = js.native
  
  /* CompleteClass */
  var Description: String = js.native
  
  /* CompleteClass */
  var DueDate: VarDate = js.native
  
  /* CompleteClass */
  override val ModifiedBy: String = js.native
  
  /* CompleteClass */
  override val ModifiedDate: VarDate = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Office.SharedWorkspaceTask_typekey")
  var OfficeDotSharedWorkspaceTask_typekey: typingsJapgolly.activexOffice.Office.SharedWorkspaceTask = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  var Priority: MsoSharedWorkspaceTaskPriority = js.native
  
  /* CompleteClass */
  override def Save(): Unit = js.native
  
  /* CompleteClass */
  var Status: MsoSharedWorkspaceTaskStatus = js.native
  
  /* CompleteClass */
  var Title: String = js.native
}
