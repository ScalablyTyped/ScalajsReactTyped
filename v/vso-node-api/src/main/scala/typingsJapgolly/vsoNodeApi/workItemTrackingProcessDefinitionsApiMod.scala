package typingsJapgolly.vsoNodeApi

import typingsJapgolly.vsoNodeApi.clientApiBasesMod.ClientApiBase
import typingsJapgolly.vsoNodeApi.interfacesCommonVsoBaseInterfacesMod.IRequestHandler
import typingsJapgolly.vsoNodeApi.interfacesCommonVsoBaseInterfacesMod.IRequestOptions
import typingsJapgolly.vsoNodeApi.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod.BehaviorCreateModel
import typingsJapgolly.vsoNodeApi.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod.BehaviorModel
import typingsJapgolly.vsoNodeApi.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod.BehaviorReplaceModel
import typingsJapgolly.vsoNodeApi.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod.Control
import typingsJapgolly.vsoNodeApi.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod.FieldModel
import typingsJapgolly.vsoNodeApi.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod.FieldUpdate
import typingsJapgolly.vsoNodeApi.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod.FormLayout
import typingsJapgolly.vsoNodeApi.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod.GetWorkItemTypeExpand
import typingsJapgolly.vsoNodeApi.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod.Group
import typingsJapgolly.vsoNodeApi.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod.HideStateModel
import typingsJapgolly.vsoNodeApi.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod.Page
import typingsJapgolly.vsoNodeApi.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod.PickListMetadataModel
import typingsJapgolly.vsoNodeApi.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod.PickListModel
import typingsJapgolly.vsoNodeApi.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod.WorkItemStateInputModel
import typingsJapgolly.vsoNodeApi.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod.WorkItemStateResultModel
import typingsJapgolly.vsoNodeApi.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod.WorkItemTypeBehavior
import typingsJapgolly.vsoNodeApi.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod.WorkItemTypeFieldModel
import typingsJapgolly.vsoNodeApi.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod.WorkItemTypeModel
import typingsJapgolly.vsoNodeApi.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod.WorkItemTypeUpdateModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object workItemTrackingProcessDefinitionsApiMod {
  
  @JSImport("vso-node-api/WorkItemTrackingProcessDefinitionsApi", "WorkItemTrackingProcessDefinitionsApi")
  @js.native
  open class WorkItemTrackingProcessDefinitionsApi protected () extends IWorkItemTrackingProcessDefinitionsApi {
    def this(baseUrl: String, handlers: js.Array[IRequestHandler]) = this()
    def this(baseUrl: String, handlers: js.Array[IRequestHandler], options: IRequestOptions) = this()
  }
  
  @js.native
  trait IWorkItemTrackingProcessDefinitionsApi extends ClientApiBase {
    
    def addBehaviorToWorkItemType(behavior: WorkItemTypeBehavior, processId: String, witRefNameForBehaviors: String): js.Promise[WorkItemTypeBehavior] = js.native
    
    def addControlToGroup(control: Control, processId: String, witRefName: String, groupId: String): js.Promise[Control] = js.native
    
    def addFieldToWorkItemType(field: WorkItemTypeFieldModel, processId: String, witRefNameForFields: String): js.Promise[WorkItemTypeFieldModel] = js.native
    
    def addGroup(group: Group, processId: String, witRefName: String, pageId: String, sectionId: String): js.Promise[Group] = js.native
    
    def addPage(page: Page, processId: String, witRefName: String): js.Promise[Page] = js.native
    
    def createBehavior(behavior: BehaviorCreateModel, processId: String): js.Promise[BehaviorModel] = js.native
    
    def createField(field: FieldModel, processId: String): js.Promise[FieldModel] = js.native
    
    def createList(picklist: PickListModel): js.Promise[PickListModel] = js.native
    
    def createStateDefinition(stateModel: WorkItemStateInputModel, processId: String, witRefName: String): js.Promise[WorkItemStateResultModel] = js.native
    
    def createWorkItemType(workItemType: WorkItemTypeModel, processId: String): js.Promise[WorkItemTypeModel] = js.native
    
    def deleteBehavior(processId: String, behaviorId: String): js.Promise[Unit] = js.native
    
    def deleteList(listId: String): js.Promise[Unit] = js.native
    
    def deleteStateDefinition(processId: String, witRefName: String, stateId: String): js.Promise[Unit] = js.native
    
    def deleteWorkItemType(processId: String, witRefName: String): js.Promise[Unit] = js.native
    
    def editControl(control: Control, processId: String, witRefName: String, groupId: String, controlId: String): js.Promise[Control] = js.native
    
    def editGroup(
      group: Group,
      processId: String,
      witRefName: String,
      pageId: String,
      sectionId: String,
      groupId: String
    ): js.Promise[Group] = js.native
    
    def editPage(page: Page, processId: String, witRefName: String): js.Promise[Page] = js.native
    
    def getBehavior(processId: String, behaviorId: String): js.Promise[BehaviorModel] = js.native
    
    def getBehaviorForWorkItemType(processId: String, witRefNameForBehaviors: String, behaviorRefName: String): js.Promise[WorkItemTypeBehavior] = js.native
    
    def getBehaviors(processId: String): js.Promise[js.Array[BehaviorModel]] = js.native
    
    def getBehaviorsForWorkItemType(processId: String, witRefNameForBehaviors: String): js.Promise[js.Array[WorkItemTypeBehavior]] = js.native
    
    def getFormLayout(processId: String, witRefName: String): js.Promise[FormLayout] = js.native
    
    def getList(listId: String): js.Promise[PickListModel] = js.native
    
    def getListsMetadata(): js.Promise[js.Array[PickListMetadataModel]] = js.native
    
    def getStateDefinition(processId: String, witRefName: String, stateId: String): js.Promise[WorkItemStateResultModel] = js.native
    
    def getStateDefinitions(processId: String, witRefName: String): js.Promise[js.Array[WorkItemStateResultModel]] = js.native
    
    def getWorkItemType(processId: String, witRefName: String): js.Promise[WorkItemTypeModel] = js.native
    def getWorkItemType(processId: String, witRefName: String, expand: GetWorkItemTypeExpand): js.Promise[WorkItemTypeModel] = js.native
    
    def getWorkItemTypeField(processId: String, witRefNameForFields: String, fieldRefName: String): js.Promise[WorkItemTypeFieldModel] = js.native
    
    def getWorkItemTypeFields(processId: String, witRefNameForFields: String): js.Promise[js.Array[WorkItemTypeFieldModel]] = js.native
    
    def getWorkItemTypes(processId: String): js.Promise[js.Array[WorkItemTypeModel]] = js.native
    def getWorkItemTypes(processId: String, expand: GetWorkItemTypeExpand): js.Promise[js.Array[WorkItemTypeModel]] = js.native
    
    def hideStateDefinition(hideStateModel: HideStateModel, processId: String, witRefName: String, stateId: String): js.Promise[WorkItemStateResultModel] = js.native
    
    def removeBehaviorFromWorkItemType(processId: String, witRefNameForBehaviors: String, behaviorRefName: String): js.Promise[Unit] = js.native
    
    def removeControlFromGroup(processId: String, witRefName: String, groupId: String, controlId: String): js.Promise[Unit] = js.native
    
    def removeFieldFromWorkItemType(processId: String, witRefNameForFields: String, fieldRefName: String): js.Promise[Unit] = js.native
    
    def removeGroup(processId: String, witRefName: String, pageId: String, sectionId: String, groupId: String): js.Promise[Unit] = js.native
    
    def removePage(processId: String, witRefName: String, pageId: String): js.Promise[Unit] = js.native
    
    def replaceBehavior(behaviorData: BehaviorReplaceModel, processId: String, behaviorId: String): js.Promise[BehaviorModel] = js.native
    
    def setControlInGroup(control: Control, processId: String, witRefName: String, groupId: String, controlId: String): js.Promise[Control] = js.native
    def setControlInGroup(
      control: Control,
      processId: String,
      witRefName: String,
      groupId: String,
      controlId: String,
      removeFromGroupId: String
    ): js.Promise[Control] = js.native
    
    def setGroupInPage(
      group: Group,
      processId: String,
      witRefName: String,
      pageId: String,
      sectionId: String,
      groupId: String,
      removeFromPageId: String,
      removeFromSectionId: String
    ): js.Promise[Group] = js.native
    
    def setGroupInSection(
      group: Group,
      processId: String,
      witRefName: String,
      pageId: String,
      sectionId: String,
      groupId: String,
      removeFromSectionId: String
    ): js.Promise[Group] = js.native
    
    def updateBehaviorToWorkItemType(behavior: WorkItemTypeBehavior, processId: String, witRefNameForBehaviors: String): js.Promise[WorkItemTypeBehavior] = js.native
    
    def updateField(field: FieldUpdate, processId: String): js.Promise[FieldModel] = js.native
    
    def updateList(picklist: PickListModel, listId: String): js.Promise[PickListModel] = js.native
    
    def updateStateDefinition(stateModel: WorkItemStateInputModel, processId: String, witRefName: String, stateId: String): js.Promise[WorkItemStateResultModel] = js.native
    
    def updateWorkItemType(workItemTypeUpdate: WorkItemTypeUpdateModel, processId: String, witRefName: String): js.Promise[WorkItemTypeModel] = js.native
  }
}
