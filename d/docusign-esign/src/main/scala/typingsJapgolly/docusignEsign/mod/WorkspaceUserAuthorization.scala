package typingsJapgolly.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkspaceUserAuthorization extends StObject {
  
  /**
    * When set to **true**, the workspace user can delete items from the workspace.
    */
  var canDelete: js.UndefOr[String] = js.undefined
  
  /**
    * When set to **true**, the workspace user can move the items in the workspace.
    */
  var canMove: js.UndefOr[String] = js.undefined
  
  /**
    * When set to **true**, the workspace user can create transactions from the workspace.
    */
  var canTransact: js.UndefOr[String] = js.undefined
  
  /**
    * When set to **true**, the workspace user can view the items in the workspace.
    */
  var canView: js.UndefOr[String] = js.undefined
  
  /**
    * The UTC DateTime when the workspace user authorization was created.
    */
  var created: js.UndefOr[String] = js.undefined
  
  /**
    * The id of the user who created the workspace user authorization.
    */
  var createdById: js.UndefOr[String] = js.undefined
  
  /**
    * This object describes errors that occur. It is only valid for responses and ignored in requests.
    */
  var errorDetails: js.UndefOr[
    /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
  ] = js.undefined
  
  /**
    * The UTC DateTime when the workspace user authorization was last modified.
    */
  var modified: js.UndefOr[String] = js.undefined
  
  /**
    * The id of the user who last modified the workspace user authorization.
    */
  var modifiedById: js.UndefOr[String] = js.undefined
  
  /**
    * The id of the workspace user.
    */
  var workspaceUserId: js.UndefOr[String] = js.undefined
  
  /**
    * An object that provides details about the workspace user.
    */
  var workspaceUserInformation: js.UndefOr[
    /* This object represents the workspace user. This property is only returned in response to user specific GET call.  */ WorkspaceUser
  ] = js.undefined
}
object WorkspaceUserAuthorization {
  
  inline def apply(): WorkspaceUserAuthorization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkspaceUserAuthorization]
  }
  
  extension [Self <: WorkspaceUserAuthorization](x: Self) {
    
    inline def setCanDelete(value: String): Self = StObject.set(x, "canDelete", value.asInstanceOf[js.Any])
    
    inline def setCanDeleteUndefined: Self = StObject.set(x, "canDelete", js.undefined)
    
    inline def setCanMove(value: String): Self = StObject.set(x, "canMove", value.asInstanceOf[js.Any])
    
    inline def setCanMoveUndefined: Self = StObject.set(x, "canMove", js.undefined)
    
    inline def setCanTransact(value: String): Self = StObject.set(x, "canTransact", value.asInstanceOf[js.Any])
    
    inline def setCanTransactUndefined: Self = StObject.set(x, "canTransact", js.undefined)
    
    inline def setCanView(value: String): Self = StObject.set(x, "canView", value.asInstanceOf[js.Any])
    
    inline def setCanViewUndefined: Self = StObject.set(x, "canView", js.undefined)
    
    inline def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCreatedById(value: String): Self = StObject.set(x, "createdById", value.asInstanceOf[js.Any])
    
    inline def setCreatedByIdUndefined: Self = StObject.set(x, "createdById", js.undefined)
    
    inline def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    inline def setErrorDetails(
      value: /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
    ): Self = StObject.set(x, "errorDetails", value.asInstanceOf[js.Any])
    
    inline def setErrorDetailsUndefined: Self = StObject.set(x, "errorDetails", js.undefined)
    
    inline def setModified(value: String): Self = StObject.set(x, "modified", value.asInstanceOf[js.Any])
    
    inline def setModifiedById(value: String): Self = StObject.set(x, "modifiedById", value.asInstanceOf[js.Any])
    
    inline def setModifiedByIdUndefined: Self = StObject.set(x, "modifiedById", js.undefined)
    
    inline def setModifiedUndefined: Self = StObject.set(x, "modified", js.undefined)
    
    inline def setWorkspaceUserId(value: String): Self = StObject.set(x, "workspaceUserId", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceUserIdUndefined: Self = StObject.set(x, "workspaceUserId", js.undefined)
    
    inline def setWorkspaceUserInformation(
      value: /* This object represents the workspace user. This property is only returned in response to user specific GET call.  */ WorkspaceUser
    ): Self = StObject.set(x, "workspaceUserInformation", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceUserInformationUndefined: Self = StObject.set(x, "workspaceUserInformation", js.undefined)
  }
}
