package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mfiles.MFiles.MFACLEnforcingMode
import typingsJapgolly.mfiles.MFiles.MFMetadataSyncFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVaultObjectPropertyOperations extends js.Object {
  def ApproveOrRejectAssignment(ObjVer: IObjVer, Approve: Boolean): IObjectVersionAndProperties
  def ApproveOrRejectAssignmentByUser(ObjVer: IObjVer, Approve: Boolean, UserID: Double): IObjectVersionAndProperties
  def CreatePropertiesFromFileInformation(FileInformation: IFileInformation): IPropertyValues
  def GenerateAutomaticPermissionsFromPropertyValues(PropertyValues: IPropertyValues): IAccessControlList
  def GetProperties(ObjVer: IObjVer, UpdateFromServer: Boolean): IPropertyValues
  def GetPropertiesAsXML(ObjVer: IObjVer, UpdateFromServer: Boolean): String
  def GetPropertiesForDisplay(ObjVer: IObjVer, UpdateFromServer: Boolean): IPropertyValuesForDisplay
  def GetPropertiesForMetadataSync(ObjVer: IObjVer, Format: MFMetadataSyncFormat): INamedValues
  def GetPropertiesOfMultipleObjects(ObjectVersions: IObjVers): IPropertyValuesOfMultipleObjects
  def GetPropertiesWithIconClues(ObjVer: IObjVer, UpdateFromServer: Boolean): IPropertyValuesWithIconClues
  def GetPropertiesWithIconCluesOfMultipleObjects(ObjectVersions: IObjVers): IPropertyValuesWithIconCluesOfMultipleObjects
  def GetProperty(ObjVer: IObjVer, Property: Double): IPropertyValue
  def GetVersionComment(ObjVer: IObjVer): IVersionComment
  def GetVersionCommentHistory(ObjVer: IObjVer): IVersionComments
  def GetWorkflowState(ObjVer: IObjVer, UpdateFromServer: Boolean): IObjectVersionWorkflowState
  def MarkAssignmentComplete(ObjVer: IObjVer): IObjectVersionAndProperties
  def MarkAssignmentCompleteByUser(ObjVer: IObjVer, UserID: Double): IObjectVersionAndProperties
  def RemoveProperty(ObjVer: IObjVer, Property: Double): IObjectVersionAndProperties
  def SetAllProperties(ObjVer: IObjVer, AllowModifyingCheckedInObject: Boolean, PropertyValues: IPropertyValues): IObjectVersionAndProperties
  def SetAllPropertiesWithPermissions(
    ObjVer: IObjVer,
    AllowModifyingCheckedInObject: Boolean,
    PropertyValues: IPropertyValues,
    ACLEnforcingMode: MFACLEnforcingMode,
    ACLProvided: IAccessControlList
  ): IObjectVersionAndProperties
  def SetAllPropertiesWithPermissionsEx(
    ObjVer: IObjVer,
    AllowModifyingCheckedInObject: Boolean,
    PropertyValues: IPropertyValues,
    ACLEnforcingMode: MFACLEnforcingMode,
    ACLProvided: IAccessControlList,
    ElectronicSignature: js.Any
  ): IObjectVersionAndProperties
  def SetCreationInfoAdmin(
    ObjVer: IObjVer,
    UpdateCreatedBy: Boolean,
    CreatedBy: ITypedValue,
    UpdateCreated: Boolean,
    CreatedUtc: ITypedValue
  ): IObjectVersionAndProperties
  def SetLastModificationInfoAdmin(
    ObjVer: IObjVer,
    UpdateLastModifiedBy: Boolean,
    LastModifiedBy: ITypedValue,
    UpdateLastModified: Boolean,
    LastModifiedUtc: ITypedValue
  ): IObjectVersionAndProperties
  def SetProperties(ObjVer: IObjVer, PropertyValues: IPropertyValues): IObjectVersionAndProperties
  def SetPropertiesOfMultipleObjects(SetPropertiesParamsOfObjects: ISetPropertiesParamsOfMultipleObjects): IObjectVersionAndPropertiesOfMultipleObjects
  def SetPropertiesWithPermissions(
    ObjVer: IObjVer,
    PropertyValues: IPropertyValues,
    ACLEnforcingMode: MFACLEnforcingMode,
    ACLProvided: IAccessControlList
  ): IObjectVersionAndProperties
  def SetPropertiesWithPermissionsEx(
    ObjVer: IObjVer,
    PropertyValues: IPropertyValues,
    ACLEnforcingMode: MFACLEnforcingMode,
    ACLProvided: IAccessControlList,
    ElectronicSignature: js.Any
  ): IObjectVersionAndProperties
  def SetProperty(ObjVer: IObjVer, PropertyValue: IPropertyValue): IObjectVersionAndProperties
  def SetVersionComment(ObjVer: IObjVer, VersionComment: IPropertyValue): IObjectVersionAndProperties
  def SetWorkflowState(ObjVer: IObjVer, WorkflowState: IObjectVersionWorkflowState): IObjectVersionAndProperties
  def SetWorkflowStateEx(ObjVer: IObjVer, WorkflowState: IObjectVersionWorkflowState, ElectronicSignature: js.Any): IObjectVersionAndProperties
  def SetWorkflowStateTransition(ObjVer: IObjVer, Workflow: Double, lStateTransition: Double, lVersionComment: String): IObjectVersionAndProperties
  def SetWorkflowStateTransitionEx(
    ObjVer: IObjVer,
    Workflow: Double,
    StateTransition: Double,
    VersionComment: String,
    ElectronicSignature: js.Any
  ): IObjectVersionAndProperties
}

object IVaultObjectPropertyOperations {
  @scala.inline
  def apply(
    ApproveOrRejectAssignment: (IObjVer, Boolean) => CallbackTo[IObjectVersionAndProperties],
    ApproveOrRejectAssignmentByUser: (IObjVer, Boolean, Double) => CallbackTo[IObjectVersionAndProperties],
    CreatePropertiesFromFileInformation: IFileInformation => CallbackTo[IPropertyValues],
    GenerateAutomaticPermissionsFromPropertyValues: IPropertyValues => CallbackTo[IAccessControlList],
    GetProperties: (IObjVer, Boolean) => CallbackTo[IPropertyValues],
    GetPropertiesAsXML: (IObjVer, Boolean) => CallbackTo[String],
    GetPropertiesForDisplay: (IObjVer, Boolean) => CallbackTo[IPropertyValuesForDisplay],
    GetPropertiesForMetadataSync: (IObjVer, MFMetadataSyncFormat) => CallbackTo[INamedValues],
    GetPropertiesOfMultipleObjects: IObjVers => CallbackTo[IPropertyValuesOfMultipleObjects],
    GetPropertiesWithIconClues: (IObjVer, Boolean) => CallbackTo[IPropertyValuesWithIconClues],
    GetPropertiesWithIconCluesOfMultipleObjects: IObjVers => CallbackTo[IPropertyValuesWithIconCluesOfMultipleObjects],
    GetProperty: (IObjVer, Double) => CallbackTo[IPropertyValue],
    GetVersionComment: IObjVer => CallbackTo[IVersionComment],
    GetVersionCommentHistory: IObjVer => CallbackTo[IVersionComments],
    GetWorkflowState: (IObjVer, Boolean) => CallbackTo[IObjectVersionWorkflowState],
    MarkAssignmentComplete: IObjVer => CallbackTo[IObjectVersionAndProperties],
    MarkAssignmentCompleteByUser: (IObjVer, Double) => CallbackTo[IObjectVersionAndProperties],
    RemoveProperty: (IObjVer, Double) => CallbackTo[IObjectVersionAndProperties],
    SetAllProperties: (IObjVer, Boolean, IPropertyValues) => CallbackTo[IObjectVersionAndProperties],
    SetAllPropertiesWithPermissions: (IObjVer, Boolean, IPropertyValues, MFACLEnforcingMode, IAccessControlList) => CallbackTo[IObjectVersionAndProperties],
    SetAllPropertiesWithPermissionsEx: (IObjVer, Boolean, IPropertyValues, MFACLEnforcingMode, IAccessControlList, js.Any) => CallbackTo[IObjectVersionAndProperties],
    SetCreationInfoAdmin: (IObjVer, Boolean, ITypedValue, Boolean, ITypedValue) => CallbackTo[IObjectVersionAndProperties],
    SetLastModificationInfoAdmin: (IObjVer, Boolean, ITypedValue, Boolean, ITypedValue) => CallbackTo[IObjectVersionAndProperties],
    SetProperties: (IObjVer, IPropertyValues) => CallbackTo[IObjectVersionAndProperties],
    SetPropertiesOfMultipleObjects: ISetPropertiesParamsOfMultipleObjects => CallbackTo[IObjectVersionAndPropertiesOfMultipleObjects],
    SetPropertiesWithPermissions: (IObjVer, IPropertyValues, MFACLEnforcingMode, IAccessControlList) => CallbackTo[IObjectVersionAndProperties],
    SetPropertiesWithPermissionsEx: (IObjVer, IPropertyValues, MFACLEnforcingMode, IAccessControlList, js.Any) => CallbackTo[IObjectVersionAndProperties],
    SetProperty: (IObjVer, IPropertyValue) => CallbackTo[IObjectVersionAndProperties],
    SetVersionComment: (IObjVer, IPropertyValue) => CallbackTo[IObjectVersionAndProperties],
    SetWorkflowState: (IObjVer, IObjectVersionWorkflowState) => CallbackTo[IObjectVersionAndProperties],
    SetWorkflowStateEx: (IObjVer, IObjectVersionWorkflowState, js.Any) => CallbackTo[IObjectVersionAndProperties],
    SetWorkflowStateTransition: (IObjVer, Double, Double, String) => CallbackTo[IObjectVersionAndProperties],
    SetWorkflowStateTransitionEx: (IObjVer, Double, Double, String, js.Any) => CallbackTo[IObjectVersionAndProperties]
  ): IVaultObjectPropertyOperations = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ApproveOrRejectAssignment")(js.Any.fromFunction2((t0: typingsJapgolly.mfiles.IObjVer, t1: scala.Boolean) => ApproveOrRejectAssignment(t0, t1).runNow()))
    __obj.updateDynamic("ApproveOrRejectAssignmentByUser")(js.Any.fromFunction3((t0: typingsJapgolly.mfiles.IObjVer, t1: scala.Boolean, t2: scala.Double) => ApproveOrRejectAssignmentByUser(t0, t1, t2).runNow()))
    __obj.updateDynamic("CreatePropertiesFromFileInformation")(js.Any.fromFunction1((t0: typingsJapgolly.mfiles.IFileInformation) => CreatePropertiesFromFileInformation(t0).runNow()))
    __obj.updateDynamic("GenerateAutomaticPermissionsFromPropertyValues")(js.Any.fromFunction1((t0: typingsJapgolly.mfiles.IPropertyValues) => GenerateAutomaticPermissionsFromPropertyValues(t0).runNow()))
    __obj.updateDynamic("GetProperties")(js.Any.fromFunction2((t0: typingsJapgolly.mfiles.IObjVer, t1: scala.Boolean) => GetProperties(t0, t1).runNow()))
    __obj.updateDynamic("GetPropertiesAsXML")(js.Any.fromFunction2((t0: typingsJapgolly.mfiles.IObjVer, t1: scala.Boolean) => GetPropertiesAsXML(t0, t1).runNow()))
    __obj.updateDynamic("GetPropertiesForDisplay")(js.Any.fromFunction2((t0: typingsJapgolly.mfiles.IObjVer, t1: scala.Boolean) => GetPropertiesForDisplay(t0, t1).runNow()))
    __obj.updateDynamic("GetPropertiesForMetadataSync")(js.Any.fromFunction2((t0: typingsJapgolly.mfiles.IObjVer, t1: typingsJapgolly.mfiles.MFiles.MFMetadataSyncFormat) => GetPropertiesForMetadataSync(t0, t1).runNow()))
    __obj.updateDynamic("GetPropertiesOfMultipleObjects")(js.Any.fromFunction1((t0: typingsJapgolly.mfiles.IObjVers) => GetPropertiesOfMultipleObjects(t0).runNow()))
    __obj.updateDynamic("GetPropertiesWithIconClues")(js.Any.fromFunction2((t0: typingsJapgolly.mfiles.IObjVer, t1: scala.Boolean) => GetPropertiesWithIconClues(t0, t1).runNow()))
    __obj.updateDynamic("GetPropertiesWithIconCluesOfMultipleObjects")(js.Any.fromFunction1((t0: typingsJapgolly.mfiles.IObjVers) => GetPropertiesWithIconCluesOfMultipleObjects(t0).runNow()))
    __obj.updateDynamic("GetProperty")(js.Any.fromFunction2((t0: typingsJapgolly.mfiles.IObjVer, t1: scala.Double) => GetProperty(t0, t1).runNow()))
    __obj.updateDynamic("GetVersionComment")(js.Any.fromFunction1((t0: typingsJapgolly.mfiles.IObjVer) => GetVersionComment(t0).runNow()))
    __obj.updateDynamic("GetVersionCommentHistory")(js.Any.fromFunction1((t0: typingsJapgolly.mfiles.IObjVer) => GetVersionCommentHistory(t0).runNow()))
    __obj.updateDynamic("GetWorkflowState")(js.Any.fromFunction2((t0: typingsJapgolly.mfiles.IObjVer, t1: scala.Boolean) => GetWorkflowState(t0, t1).runNow()))
    __obj.updateDynamic("MarkAssignmentComplete")(js.Any.fromFunction1((t0: typingsJapgolly.mfiles.IObjVer) => MarkAssignmentComplete(t0).runNow()))
    __obj.updateDynamic("MarkAssignmentCompleteByUser")(js.Any.fromFunction2((t0: typingsJapgolly.mfiles.IObjVer, t1: scala.Double) => MarkAssignmentCompleteByUser(t0, t1).runNow()))
    __obj.updateDynamic("RemoveProperty")(js.Any.fromFunction2((t0: typingsJapgolly.mfiles.IObjVer, t1: scala.Double) => RemoveProperty(t0, t1).runNow()))
    __obj.updateDynamic("SetAllProperties")(js.Any.fromFunction3((t0: typingsJapgolly.mfiles.IObjVer, t1: scala.Boolean, t2: typingsJapgolly.mfiles.IPropertyValues) => SetAllProperties(t0, t1, t2).runNow()))
    __obj.updateDynamic("SetAllPropertiesWithPermissions")(js.Any.fromFunction5((t0: typingsJapgolly.mfiles.IObjVer, t1: scala.Boolean, t2: typingsJapgolly.mfiles.IPropertyValues, t3: typingsJapgolly.mfiles.MFiles.MFACLEnforcingMode, t4: typingsJapgolly.mfiles.IAccessControlList) => SetAllPropertiesWithPermissions(t0, t1, t2, t3, t4).runNow()))
    __obj.updateDynamic("SetAllPropertiesWithPermissionsEx")(js.Any.fromFunction6((t0: typingsJapgolly.mfiles.IObjVer, t1: scala.Boolean, t2: typingsJapgolly.mfiles.IPropertyValues, t3: typingsJapgolly.mfiles.MFiles.MFACLEnforcingMode, t4: typingsJapgolly.mfiles.IAccessControlList, t5: js.Any) => SetAllPropertiesWithPermissionsEx(t0, t1, t2, t3, t4, t5).runNow()))
    __obj.updateDynamic("SetCreationInfoAdmin")(js.Any.fromFunction5((t0: typingsJapgolly.mfiles.IObjVer, t1: scala.Boolean, t2: typingsJapgolly.mfiles.ITypedValue, t3: scala.Boolean, t4: typingsJapgolly.mfiles.ITypedValue) => SetCreationInfoAdmin(t0, t1, t2, t3, t4).runNow()))
    __obj.updateDynamic("SetLastModificationInfoAdmin")(js.Any.fromFunction5((t0: typingsJapgolly.mfiles.IObjVer, t1: scala.Boolean, t2: typingsJapgolly.mfiles.ITypedValue, t3: scala.Boolean, t4: typingsJapgolly.mfiles.ITypedValue) => SetLastModificationInfoAdmin(t0, t1, t2, t3, t4).runNow()))
    __obj.updateDynamic("SetProperties")(js.Any.fromFunction2((t0: typingsJapgolly.mfiles.IObjVer, t1: typingsJapgolly.mfiles.IPropertyValues) => SetProperties(t0, t1).runNow()))
    __obj.updateDynamic("SetPropertiesOfMultipleObjects")(js.Any.fromFunction1((t0: typingsJapgolly.mfiles.ISetPropertiesParamsOfMultipleObjects) => SetPropertiesOfMultipleObjects(t0).runNow()))
    __obj.updateDynamic("SetPropertiesWithPermissions")(js.Any.fromFunction4((t0: typingsJapgolly.mfiles.IObjVer, t1: typingsJapgolly.mfiles.IPropertyValues, t2: typingsJapgolly.mfiles.MFiles.MFACLEnforcingMode, t3: typingsJapgolly.mfiles.IAccessControlList) => SetPropertiesWithPermissions(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("SetPropertiesWithPermissionsEx")(js.Any.fromFunction5((t0: typingsJapgolly.mfiles.IObjVer, t1: typingsJapgolly.mfiles.IPropertyValues, t2: typingsJapgolly.mfiles.MFiles.MFACLEnforcingMode, t3: typingsJapgolly.mfiles.IAccessControlList, t4: js.Any) => SetPropertiesWithPermissionsEx(t0, t1, t2, t3, t4).runNow()))
    __obj.updateDynamic("SetProperty")(js.Any.fromFunction2((t0: typingsJapgolly.mfiles.IObjVer, t1: typingsJapgolly.mfiles.IPropertyValue) => SetProperty(t0, t1).runNow()))
    __obj.updateDynamic("SetVersionComment")(js.Any.fromFunction2((t0: typingsJapgolly.mfiles.IObjVer, t1: typingsJapgolly.mfiles.IPropertyValue) => SetVersionComment(t0, t1).runNow()))
    __obj.updateDynamic("SetWorkflowState")(js.Any.fromFunction2((t0: typingsJapgolly.mfiles.IObjVer, t1: typingsJapgolly.mfiles.IObjectVersionWorkflowState) => SetWorkflowState(t0, t1).runNow()))
    __obj.updateDynamic("SetWorkflowStateEx")(js.Any.fromFunction3((t0: typingsJapgolly.mfiles.IObjVer, t1: typingsJapgolly.mfiles.IObjectVersionWorkflowState, t2: js.Any) => SetWorkflowStateEx(t0, t1, t2).runNow()))
    __obj.updateDynamic("SetWorkflowStateTransition")(js.Any.fromFunction4((t0: typingsJapgolly.mfiles.IObjVer, t1: scala.Double, t2: scala.Double, t3: java.lang.String) => SetWorkflowStateTransition(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("SetWorkflowStateTransitionEx")(js.Any.fromFunction5((t0: typingsJapgolly.mfiles.IObjVer, t1: scala.Double, t2: scala.Double, t3: java.lang.String, t4: js.Any) => SetWorkflowStateTransitionEx(t0, t1, t2, t3, t4).runNow()))
    __obj.asInstanceOf[IVaultObjectPropertyOperations]
  }
}

