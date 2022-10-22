package typingsJapgolly.sharepoint.global.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Workflow {
  
  @JSGlobal("SP.Workflow.WorkflowAssociation")
  @js.native
  open class WorkflowAssociation ()
    extends StObject
       with typingsJapgolly.sharepoint.SP.Workflow.WorkflowAssociation
  
  @JSGlobal("SP.Workflow.WorkflowAssociationCreationInformation")
  @js.native
  open class WorkflowAssociationCreationInformation ()
    extends StObject
       with typingsJapgolly.sharepoint.SP.Workflow.WorkflowAssociationCreationInformation {
    
    /* CompleteClass */
    override def customFromJson(obj: Any): Boolean = js.native
    
    /* CompleteClass */
    override def customWriteToXml(
      writer: typingsJapgolly.sharepoint.SP.XmlWriter,
      serializationContext: typingsJapgolly.sharepoint.SP.SerializationContext
    ): Boolean = js.native
    
    /* CompleteClass */
    override def fromJson(obj: Any): Unit = js.native
    
    /* CompleteClass */
    override def get_contentTypeAssociationHistoryListName(): String = js.native
    
    /* CompleteClass */
    override def get_contentTypeAssociationTaskListName(): String = js.native
    
    /* CompleteClass */
    override def get_historyList(): typingsJapgolly.sharepoint.SP.List[Any] = js.native
    
    /* CompleteClass */
    override def get_name(): String = js.native
    
    /* CompleteClass */
    override def get_taskList(): typingsJapgolly.sharepoint.SP.List[Any] = js.native
    
    /* CompleteClass */
    override def get_template(): typingsJapgolly.sharepoint.SP.Workflow.WorkflowTemplate = js.native
    
    /* CompleteClass */
    override def get_typeId(): String = js.native
    
    /* CompleteClass */
    override def set_contentTypeAssociationHistoryListName(value: String): Unit = js.native
    
    /* CompleteClass */
    override def set_contentTypeAssociationTaskListName(value: String): Unit = js.native
    
    /* CompleteClass */
    override def set_historyList(value: typingsJapgolly.sharepoint.SP.List[Any]): Unit = js.native
    
    /* CompleteClass */
    override def set_name(value: String): Unit = js.native
    
    /* CompleteClass */
    override def set_taskList(value: typingsJapgolly.sharepoint.SP.List[Any]): Unit = js.native
    
    /* CompleteClass */
    override def set_template(value: typingsJapgolly.sharepoint.SP.Workflow.WorkflowTemplate): Unit = js.native
    
    /* CompleteClass */
    override def writeToXml(
      writer: typingsJapgolly.sharepoint.SP.XmlWriter,
      serializationContext: typingsJapgolly.sharepoint.SP.SerializationContext
    ): Unit = js.native
  }
  
  @JSGlobal("SP.Workflow.WorkflowTemplate")
  @js.native
  open class WorkflowTemplate ()
    extends StObject
       with typingsJapgolly.sharepoint.SP.Workflow.WorkflowTemplate
}
