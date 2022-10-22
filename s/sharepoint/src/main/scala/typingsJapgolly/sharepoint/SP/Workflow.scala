package typingsJapgolly.sharepoint.SP

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Workflow {
  
  @js.native
  trait WorkflowAssociation
    extends StObject
       with ClientObject {
    
    def deleteObject(): Unit = js.native
    
    def get_allowManual(): Boolean = js.native
    
    def get_associationData(): String = js.native
    
    def get_autoStartChange(): Boolean = js.native
    
    def get_autoStartCreate(): Boolean = js.native
    
    def get_baseId(): Guid = js.native
    
    def get_created(): js.Date = js.native
    
    def get_description(): String = js.native
    
    def get_enabled(): Boolean = js.native
    
    def get_historyListTitle(): String = js.native
    
    def get_id(): Guid = js.native
    
    def get_instantiationUrl(): String = js.native
    
    def get_internalName(): String = js.native
    
    def get_isDeclarative(): Boolean = js.native
    
    def get_listId(): Guid = js.native
    
    def get_modified(): js.Date = js.native
    
    def get_name(): String = js.native
    
    def get_taskListTitle(): String = js.native
    
    def get_webId(): Guid = js.native
    
    def set_allowManual(value: Boolean): Unit = js.native
    
    def set_associationData(value: String): Unit = js.native
    
    def set_autoStartChange(value: Boolean): Unit = js.native
    
    def set_autoStartCreate(value: Boolean): Unit = js.native
    
    def set_description(value: String): Unit = js.native
    
    def set_enabled(value: Boolean): Unit = js.native
    
    def set_historyListTitle(value: String): Unit = js.native
    
    def set_name(value: String): Unit = js.native
    
    def set_taskListTitle(value: String): Unit = js.native
    
    def update(): Unit = js.native
  }
  
  @js.native
  trait WorkflowAssociationCollection
    extends StObject
       with ClientObjectCollection[WorkflowAssociation] {
    
    def add(parameters: WorkflowAssociationCreationInformation): WorkflowAssociation = js.native
    
    def getById(associationId: Guid): WorkflowAssociation = js.native
    
    def getByName(name: String): WorkflowAssociation = js.native
    
    def get_item(index: Double): WorkflowAssociation = js.native
    
    def itemAt(index: Double): WorkflowAssociation = js.native
  }
  
  trait WorkflowAssociationCreationInformation
    extends StObject
       with ClientValueObject {
    
    def get_contentTypeAssociationHistoryListName(): String
    
    def get_contentTypeAssociationTaskListName(): String
    
    def get_historyList(): typingsJapgolly.sharepoint.SP.List[Any]
    
    def get_name(): String
    
    def get_taskList(): typingsJapgolly.sharepoint.SP.List[Any]
    
    def get_template(): WorkflowTemplate
    
    def set_contentTypeAssociationHistoryListName(value: String): Unit
    
    def set_contentTypeAssociationTaskListName(value: String): Unit
    
    def set_historyList(value: typingsJapgolly.sharepoint.SP.List[Any]): Unit
    
    def set_name(value: String): Unit
    
    def set_taskList(value: typingsJapgolly.sharepoint.SP.List[Any]): Unit
    
    def set_template(value: WorkflowTemplate): Unit
  }
  object WorkflowAssociationCreationInformation {
    
    inline def apply(
      customFromJson: Any => Boolean,
      customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
      fromJson: Any => Callback,
      get_contentTypeAssociationHistoryListName: CallbackTo[String],
      get_contentTypeAssociationTaskListName: CallbackTo[String],
      get_historyList: CallbackTo[typingsJapgolly.sharepoint.SP.List[Any]],
      get_name: CallbackTo[String],
      get_taskList: CallbackTo[typingsJapgolly.sharepoint.SP.List[Any]],
      get_template: CallbackTo[WorkflowTemplate],
      get_typeId: CallbackTo[String],
      set_contentTypeAssociationHistoryListName: String => Callback,
      set_contentTypeAssociationTaskListName: String => Callback,
      set_historyList: typingsJapgolly.sharepoint.SP.List[Any] => Callback,
      set_name: String => Callback,
      set_taskList: typingsJapgolly.sharepoint.SP.List[Any] => Callback,
      set_template: WorkflowTemplate => Callback,
      writeToXml: (XmlWriter, SerializationContext) => Callback
    ): WorkflowAssociationCreationInformation = {
      val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1((t0: Any) => fromJson(t0).runNow()), get_contentTypeAssociationHistoryListName = get_contentTypeAssociationHistoryListName.toJsFn, get_contentTypeAssociationTaskListName = get_contentTypeAssociationTaskListName.toJsFn, get_historyList = get_historyList.toJsFn, get_name = get_name.toJsFn, get_taskList = get_taskList.toJsFn, get_template = get_template.toJsFn, get_typeId = get_typeId.toJsFn, set_contentTypeAssociationHistoryListName = js.Any.fromFunction1((t0: String) => set_contentTypeAssociationHistoryListName(t0).runNow()), set_contentTypeAssociationTaskListName = js.Any.fromFunction1((t0: String) => set_contentTypeAssociationTaskListName(t0).runNow()), set_historyList = js.Any.fromFunction1((t0: typingsJapgolly.sharepoint.SP.List[Any]) => set_historyList(t0).runNow()), set_name = js.Any.fromFunction1((t0: String) => set_name(t0).runNow()), set_taskList = js.Any.fromFunction1((t0: typingsJapgolly.sharepoint.SP.List[Any]) => set_taskList(t0).runNow()), set_template = js.Any.fromFunction1((t0: WorkflowTemplate) => set_template(t0).runNow()), writeToXml = js.Any.fromFunction2((t0: XmlWriter, t1: SerializationContext) => (writeToXml(t0, t1)).runNow()))
      __obj.asInstanceOf[WorkflowAssociationCreationInformation]
    }
    
    extension [Self <: WorkflowAssociationCreationInformation](x: Self) {
      
      inline def setGet_contentTypeAssociationHistoryListName(value: CallbackTo[String]): Self = StObject.set(x, "get_contentTypeAssociationHistoryListName", value.toJsFn)
      
      inline def setGet_contentTypeAssociationTaskListName(value: CallbackTo[String]): Self = StObject.set(x, "get_contentTypeAssociationTaskListName", value.toJsFn)
      
      inline def setGet_historyList(value: CallbackTo[typingsJapgolly.sharepoint.SP.List[Any]]): Self = StObject.set(x, "get_historyList", value.toJsFn)
      
      inline def setGet_name(value: CallbackTo[String]): Self = StObject.set(x, "get_name", value.toJsFn)
      
      inline def setGet_taskList(value: CallbackTo[typingsJapgolly.sharepoint.SP.List[Any]]): Self = StObject.set(x, "get_taskList", value.toJsFn)
      
      inline def setGet_template(value: CallbackTo[WorkflowTemplate]): Self = StObject.set(x, "get_template", value.toJsFn)
      
      inline def setSet_contentTypeAssociationHistoryListName(value: String => Callback): Self = StObject.set(x, "set_contentTypeAssociationHistoryListName", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setSet_contentTypeAssociationTaskListName(value: String => Callback): Self = StObject.set(x, "set_contentTypeAssociationTaskListName", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setSet_historyList(value: typingsJapgolly.sharepoint.SP.List[Any] => Callback): Self = StObject.set(x, "set_historyList", js.Any.fromFunction1((t0: typingsJapgolly.sharepoint.SP.List[Any]) => value(t0).runNow()))
      
      inline def setSet_name(value: String => Callback): Self = StObject.set(x, "set_name", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setSet_taskList(value: typingsJapgolly.sharepoint.SP.List[Any] => Callback): Self = StObject.set(x, "set_taskList", js.Any.fromFunction1((t0: typingsJapgolly.sharepoint.SP.List[Any]) => value(t0).runNow()))
      
      inline def setSet_template(value: WorkflowTemplate => Callback): Self = StObject.set(x, "set_template", js.Any.fromFunction1((t0: WorkflowTemplate) => value(t0).runNow()))
    }
  }
  
  @js.native
  trait WorkflowTemplate
    extends StObject
       with ClientObject {
    
    def get_allowManual(): Boolean = js.native
    
    def get_associationUrl(): String = js.native
    
    def get_autoStartChange(): Boolean = js.native
    
    def get_autoStartCreate(): Boolean = js.native
    
    def get_description(): String = js.native
    
    def get_id(): Guid = js.native
    
    def get_isDeclarative(): Boolean = js.native
    
    def get_name(): String = js.native
    
    def get_permissionsManual(): BasePermissions = js.native
  }
  
  @js.native
  trait WorkflowTemplateCollection
    extends StObject
       with ClientObjectCollection[WorkflowTemplate] {
    
    def getById(templateId: Guid): WorkflowTemplate = js.native
    
    def getByName(name: String): WorkflowTemplate = js.native
    
    def get_item(index: Double): WorkflowTemplate = js.native
    
    def itemAt(index: Double): WorkflowTemplate = js.native
  }
}
