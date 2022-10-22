package typingsJapgolly.sharepoint.global.SP

import typingsJapgolly.sharepoint.SP.Sharing.Role
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Sharing {
  
  @JSGlobal("SP.Sharing.DocumentSharingManager")
  @js.native
  open class DocumentSharingManager ()
    extends StObject
       with typingsJapgolly.sharepoint.SP.Sharing.DocumentSharingManager
  object DocumentSharingManager {
    
    @JSGlobal("SP.Sharing.DocumentSharingManager")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def getRoleDefinition(context: typingsJapgolly.sharepoint.SP.ClientRuntimeContext, role: Role): typingsJapgolly.sharepoint.SP.RoleDefinition = (^.asInstanceOf[js.Dynamic].applyDynamic("getRoleDefinition")(context.asInstanceOf[js.Any], role.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.sharepoint.SP.RoleDefinition]
    
    /* static member */
    inline def isDocumentSharingEnabled(
      context: typingsJapgolly.sharepoint.SP.ClientRuntimeContext,
      list: typingsJapgolly.sharepoint.SP.List[Any]
    ): typingsJapgolly.sharepoint.SP.BooleanResult = (^.asInstanceOf[js.Dynamic].applyDynamic("isDocumentSharingEnabled")(context.asInstanceOf[js.Any], list.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.sharepoint.SP.BooleanResult]
    
    /* static member */
    inline def updateDocumentSharingInfo(
      context: typingsJapgolly.sharepoint.SP.ClientRuntimeContext,
      resourceAddress: String,
      userRoleAssignments: js.Array[typingsJapgolly.sharepoint.SP.Sharing.UserRoleAssignment],
      validateExistingPermissions: Boolean,
      additiveMode: Boolean,
      sendServerManagedNotification: Boolean,
      customMessage: String,
      includeAnonymousLinksInNotification: Boolean
    ): js.Array[typingsJapgolly.sharepoint.SP.Sharing.UserSharingResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateDocumentSharingInfo")(context.asInstanceOf[js.Any], resourceAddress.asInstanceOf[js.Any], userRoleAssignments.asInstanceOf[js.Any], validateExistingPermissions.asInstanceOf[js.Any], additiveMode.asInstanceOf[js.Any], sendServerManagedNotification.asInstanceOf[js.Any], customMessage.asInstanceOf[js.Any], includeAnonymousLinksInNotification.asInstanceOf[js.Any])).asInstanceOf[js.Array[typingsJapgolly.sharepoint.SP.Sharing.UserSharingResult]]
  }
  
  @JSGlobal("SP.Sharing.Role")
  @js.native
  object Role extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.sharepoint.SP.Sharing.Role & Double] = js.native
    
    /* 2 */ val edit: typingsJapgolly.sharepoint.SP.Sharing.Role.edit & Double = js.native
    
    /* 0 */ val none: typingsJapgolly.sharepoint.SP.Sharing.Role.none & Double = js.native
    
    /* 3 */ val owner: typingsJapgolly.sharepoint.SP.Sharing.Role.owner & Double = js.native
    
    /* 1 */ val view: typingsJapgolly.sharepoint.SP.Sharing.Role.view & Double = js.native
  }
  
  @JSGlobal("SP.Sharing.UserRoleAssignment")
  @js.native
  open class UserRoleAssignment ()
    extends StObject
       with typingsJapgolly.sharepoint.SP.Sharing.UserRoleAssignment {
    
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
    override def get_role(): Role = js.native
    
    /* CompleteClass */
    override def get_typeId(): String = js.native
    
    /* CompleteClass */
    override def get_userId(): String = js.native
    
    /* CompleteClass */
    override def set_role(value: Role): Unit = js.native
    
    /* CompleteClass */
    override def set_userId(value: String): Unit = js.native
    
    /* CompleteClass */
    override def writeToXml(
      writer: typingsJapgolly.sharepoint.SP.XmlWriter,
      serializationContext: typingsJapgolly.sharepoint.SP.SerializationContext
    ): Unit = js.native
  }
  
  @JSGlobal("SP.Sharing.UserSharingResult")
  @js.native
  open class UserSharingResult ()
    extends StObject
       with typingsJapgolly.sharepoint.SP.Sharing.UserSharingResult {
    
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
    override def get_allowedRoles(): js.Array[Role] = js.native
    
    /* CompleteClass */
    override def get_currentRole(): Role = js.native
    
    /* CompleteClass */
    override def get_isUserKnown(): Boolean = js.native
    
    /* CompleteClass */
    override def get_message(): String = js.native
    
    /* CompleteClass */
    override def get_status(): Boolean = js.native
    
    /* CompleteClass */
    override def get_typeId(): String = js.native
    
    /* CompleteClass */
    override def get_user(): String = js.native
    
    /* CompleteClass */
    override def writeToXml(
      writer: typingsJapgolly.sharepoint.SP.XmlWriter,
      serializationContext: typingsJapgolly.sharepoint.SP.SerializationContext
    ): Unit = js.native
  }
}
