package typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GitRefUpdateStatus extends StObject
@JSImport("vso-node-api/interfaces/GitInterfaces", "GitRefUpdateStatus")
@js.native
object GitRefUpdateStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GitRefUpdateStatus & Double] = js.native
  
  /**
    * The ref update request could not be completed because the user lacks the permission to create a branch
    */
  @js.native
  sealed trait CreateBranchPermissionRequired
    extends StObject
       with GitRefUpdateStatus
  /* 8 */ val CreateBranchPermissionRequired: typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.GitRefUpdateStatus.CreateBranchPermissionRequired & Double = js.native
  
  /**
    * The ref update request could not be completed because the user lacks the permission to create a tag
    */
  @js.native
  sealed trait CreateTagPermissionRequired
    extends StObject
       with GitRefUpdateStatus
  /* 9 */ val CreateTagPermissionRequired: typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.GitRefUpdateStatus.CreateTagPermissionRequired & Double = js.native
  
  /**
    * Indicates that the ref update request could not be completed because part of the graph would be disconnected by this change, and the caller does not have ForcePush permission on the repository.
    */
  @js.native
  sealed trait ForcePushRequired
    extends StObject
       with GitRefUpdateStatus
  /* 1 */ val ForcePushRequired: typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.GitRefUpdateStatus.ForcePushRequired & Double = js.native
  
  /**
    * Indicates that the ref update request could not be completed because the ref name presented in the request was not valid.
    */
  @js.native
  sealed trait InvalidRefName
    extends StObject
       with GitRefUpdateStatus
  /* 3 */ val InvalidRefName: typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.GitRefUpdateStatus.InvalidRefName & Double = js.native
  
  /**
    * The ref update could not be completed because the ref is locked by another user.
    */
  @js.native
  sealed trait Locked
    extends StObject
       with GitRefUpdateStatus
  /* 11 */ val Locked: typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.GitRefUpdateStatus.Locked & Double = js.native
  
  /**
    * The ref update request could not be completed because the user lacks note creation permissions required to write this note
    */
  @js.native
  sealed trait ManageNotePermissionRequired
    extends StObject
       with GitRefUpdateStatus
  /* 7 */ val ManageNotePermissionRequired: typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.GitRefUpdateStatus.ManageNotePermissionRequired & Double = js.native
  
  /**
    * The ref update could not be completed because, in case-insensitive mode, the ref name conflicts with an existing, differently-cased ref name.
    */
  @js.native
  sealed trait RefNameConflict
    extends StObject
       with GitRefUpdateStatus
  /* 12 */ val RefNameConflict: typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.GitRefUpdateStatus.RefNameConflict & Double = js.native
  
  /**
    * The ref update could not be completed because it was rejected by the plugin.
    */
  @js.native
  sealed trait RejectedByPlugin
    extends StObject
       with GitRefUpdateStatus
  /* 10 */ val RejectedByPlugin: typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.GitRefUpdateStatus.RejectedByPlugin & Double = js.native
  
  /**
    * The ref update could not be completed because it was rejected by policy.
    */
  @js.native
  sealed trait RejectedByPolicy
    extends StObject
       with GitRefUpdateStatus
  /* 13 */ val RejectedByPolicy: typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.GitRefUpdateStatus.RejectedByPolicy & Double = js.native
  
  /**
    * Indicates that the ref update request could not be completed because the old object ID presented in the request was not the object ID of the ref when the database attempted the update. The most likely scenario is that the caller lost a race to update the ref.
    */
  @js.native
  sealed trait StaleOldObjectId
    extends StObject
       with GitRefUpdateStatus
  /* 2 */ val StaleOldObjectId: typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.GitRefUpdateStatus.StaleOldObjectId & Double = js.native
  
  /**
    * Indicates that the ref update request was completed successfully.
    */
  @js.native
  sealed trait Succeeded
    extends StObject
       with GitRefUpdateStatus
  /* 0 */ val Succeeded: typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.GitRefUpdateStatus.Succeeded & Double = js.native
  
  /**
    * Indicates that the ref update request was completed successfully, but the passed-in ref was corrupt - as in, the old object ID was bad.  This should only happen during deletes.
    */
  @js.native
  sealed trait SucceededCorruptRef
    extends StObject
       with GitRefUpdateStatus
  /* 15 */ val SucceededCorruptRef: typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.GitRefUpdateStatus.SucceededCorruptRef & Double = js.native
  
  /**
    * Indicates that the ref update request was completed successfully, but the ref doesn't actually exist so no changes were made.  This should only happen during deletes.
    */
  @js.native
  sealed trait SucceededNonExistentRef
    extends StObject
       with GitRefUpdateStatus
  /* 14 */ val SucceededNonExistentRef: typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.GitRefUpdateStatus.SucceededNonExistentRef & Double = js.native
  
  /**
    * The request was not processed
    */
  @js.native
  sealed trait Unprocessed
    extends StObject
       with GitRefUpdateStatus
  /* 4 */ val Unprocessed: typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.GitRefUpdateStatus.Unprocessed & Double = js.native
  
  /**
    * The ref update request could not be completed because the new object ID for the ref could not be resolved to a commit object (potentially through any number of tags)
    */
  @js.native
  sealed trait UnresolvableToCommit
    extends StObject
       with GitRefUpdateStatus
  /* 5 */ val UnresolvableToCommit: typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.GitRefUpdateStatus.UnresolvableToCommit & Double = js.native
  
  /**
    * The ref update request could not be completed because the user lacks write permissions required to write this ref
    */
  @js.native
  sealed trait WritePermissionRequired
    extends StObject
       with GitRefUpdateStatus
  /* 6 */ val WritePermissionRequired: typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.GitRefUpdateStatus.WritePermissionRequired & Double = js.native
}
