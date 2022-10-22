package typingsJapgolly.mfiles.global.MFiles

import typingsJapgolly.mfiles.IAccessControlList
import typingsJapgolly.mfiles.IFileInformation
import typingsJapgolly.mfiles.INamedValues
import typingsJapgolly.mfiles.IObjVer
import typingsJapgolly.mfiles.IObjVers
import typingsJapgolly.mfiles.IObjectVersionAndProperties
import typingsJapgolly.mfiles.IObjectVersionAndPropertiesOfMultipleObjects
import typingsJapgolly.mfiles.IObjectVersionWorkflowState
import typingsJapgolly.mfiles.IPropertyValue
import typingsJapgolly.mfiles.IPropertyValues
import typingsJapgolly.mfiles.IPropertyValuesForDisplay
import typingsJapgolly.mfiles.IPropertyValuesOfMultipleObjects
import typingsJapgolly.mfiles.IPropertyValuesWithIconClues
import typingsJapgolly.mfiles.IPropertyValuesWithIconCluesOfMultipleObjects
import typingsJapgolly.mfiles.ISetPropertiesParamsOfMultipleObjects
import typingsJapgolly.mfiles.ITypedValue
import typingsJapgolly.mfiles.IVaultObjectPropertyOperations
import typingsJapgolly.mfiles.IVersionComment
import typingsJapgolly.mfiles.IVersionComments
import typingsJapgolly.mfiles.MFiles.MFACLEnforcingMode
import typingsJapgolly.mfiles.MFiles.MFMetadataSyncFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.VaultObjectPropertyOperations")
@js.native
open class VaultObjectPropertyOperations ()
  extends StObject
     with IVaultObjectPropertyOperations {
  
  /* CompleteClass */
  override def ApproveOrRejectAssignment(ObjVer: IObjVer, Approve: Boolean): IObjectVersionAndProperties = js.native
  
  /* CompleteClass */
  override def ApproveOrRejectAssignmentByUser(ObjVer: IObjVer, Approve: Boolean, UserID: Double): IObjectVersionAndProperties = js.native
  
  /* CompleteClass */
  override def CreatePropertiesFromFileInformation(FileInformation: IFileInformation): IPropertyValues = js.native
  
  /* CompleteClass */
  override def GenerateAutomaticPermissionsFromPropertyValues(PropertyValues: IPropertyValues): IAccessControlList = js.native
  
  /* CompleteClass */
  override def GetProperties(ObjVer: IObjVer, UpdateFromServer: Boolean): IPropertyValues = js.native
  
  /* CompleteClass */
  override def GetPropertiesAsXML(ObjVer: IObjVer, UpdateFromServer: Boolean): String = js.native
  
  /* CompleteClass */
  override def GetPropertiesForDisplay(ObjVer: IObjVer, UpdateFromServer: Boolean): IPropertyValuesForDisplay = js.native
  
  /* CompleteClass */
  override def GetPropertiesForMetadataSync(ObjVer: IObjVer, Format: MFMetadataSyncFormat): INamedValues = js.native
  
  /* CompleteClass */
  override def GetPropertiesOfMultipleObjects(ObjectVersions: IObjVers): IPropertyValuesOfMultipleObjects = js.native
  
  /* CompleteClass */
  override def GetPropertiesWithIconClues(ObjVer: IObjVer, UpdateFromServer: Boolean): IPropertyValuesWithIconClues = js.native
  
  /* CompleteClass */
  override def GetPropertiesWithIconCluesOfMultipleObjects(ObjectVersions: IObjVers): IPropertyValuesWithIconCluesOfMultipleObjects = js.native
  
  /* CompleteClass */
  override def GetProperty(ObjVer: IObjVer, Property: Double): IPropertyValue = js.native
  
  /* CompleteClass */
  override def GetVersionComment(ObjVer: IObjVer): IVersionComment = js.native
  
  /* CompleteClass */
  override def GetVersionCommentHistory(ObjVer: IObjVer): IVersionComments = js.native
  
  /* CompleteClass */
  override def GetWorkflowState(ObjVer: IObjVer, UpdateFromServer: Boolean): IObjectVersionWorkflowState = js.native
  
  /* CompleteClass */
  override def MarkAssignmentComplete(ObjVer: IObjVer): IObjectVersionAndProperties = js.native
  
  /* CompleteClass */
  override def MarkAssignmentCompleteByUser(ObjVer: IObjVer, UserID: Double): IObjectVersionAndProperties = js.native
  
  /* CompleteClass */
  override def RemoveProperty(ObjVer: IObjVer, Property: Double): IObjectVersionAndProperties = js.native
  
  /* CompleteClass */
  override def SetAllProperties(ObjVer: IObjVer, AllowModifyingCheckedInObject: Boolean, PropertyValues: IPropertyValues): IObjectVersionAndProperties = js.native
  
  /* CompleteClass */
  override def SetAllPropertiesWithPermissions(
    ObjVer: IObjVer,
    AllowModifyingCheckedInObject: Boolean,
    PropertyValues: IPropertyValues,
    ACLEnforcingMode: MFACLEnforcingMode,
    ACLProvided: IAccessControlList
  ): IObjectVersionAndProperties = js.native
  
  /* CompleteClass */
  override def SetAllPropertiesWithPermissionsEx(
    ObjVer: IObjVer,
    AllowModifyingCheckedInObject: Boolean,
    PropertyValues: IPropertyValues,
    ACLEnforcingMode: MFACLEnforcingMode,
    ACLProvided: IAccessControlList,
    ElectronicSignature: Any
  ): IObjectVersionAndProperties = js.native
  
  /* CompleteClass */
  override def SetCreationInfoAdmin(
    ObjVer: IObjVer,
    UpdateCreatedBy: Boolean,
    CreatedBy: ITypedValue,
    UpdateCreated: Boolean,
    CreatedUtc: ITypedValue
  ): IObjectVersionAndProperties = js.native
  
  /* CompleteClass */
  override def SetLastModificationInfoAdmin(
    ObjVer: IObjVer,
    UpdateLastModifiedBy: Boolean,
    LastModifiedBy: ITypedValue,
    UpdateLastModified: Boolean,
    LastModifiedUtc: ITypedValue
  ): IObjectVersionAndProperties = js.native
  
  /* CompleteClass */
  override def SetProperties(ObjVer: IObjVer, PropertyValues: IPropertyValues): IObjectVersionAndProperties = js.native
  
  /* CompleteClass */
  override def SetPropertiesOfMultipleObjects(SetPropertiesParamsOfObjects: ISetPropertiesParamsOfMultipleObjects): IObjectVersionAndPropertiesOfMultipleObjects = js.native
  
  /* CompleteClass */
  override def SetPropertiesWithPermissions(
    ObjVer: IObjVer,
    PropertyValues: IPropertyValues,
    ACLEnforcingMode: MFACLEnforcingMode,
    ACLProvided: IAccessControlList
  ): IObjectVersionAndProperties = js.native
  
  /* CompleteClass */
  override def SetPropertiesWithPermissionsEx(
    ObjVer: IObjVer,
    PropertyValues: IPropertyValues,
    ACLEnforcingMode: MFACLEnforcingMode,
    ACLProvided: IAccessControlList,
    ElectronicSignature: Any
  ): IObjectVersionAndProperties = js.native
  
  /* CompleteClass */
  override def SetProperty(ObjVer: IObjVer, PropertyValue: IPropertyValue): IObjectVersionAndProperties = js.native
  
  /* CompleteClass */
  override def SetVersionComment(ObjVer: IObjVer, VersionComment: IPropertyValue): IObjectVersionAndProperties = js.native
  
  /* CompleteClass */
  override def SetWorkflowState(ObjVer: IObjVer, WorkflowState: IObjectVersionWorkflowState): IObjectVersionAndProperties = js.native
  
  /* CompleteClass */
  override def SetWorkflowStateEx(ObjVer: IObjVer, WorkflowState: IObjectVersionWorkflowState, ElectronicSignature: Any): IObjectVersionAndProperties = js.native
  
  /* CompleteClass */
  override def SetWorkflowStateTransition(ObjVer: IObjVer, Workflow: Double, lStateTransition: Double, lVersionComment: String): IObjectVersionAndProperties = js.native
  
  /* CompleteClass */
  override def SetWorkflowStateTransitionEx(
    ObjVer: IObjVer,
    Workflow: Double,
    StateTransition: Double,
    VersionComment: String,
    ElectronicSignature: Any
  ): IObjectVersionAndProperties = js.native
}
