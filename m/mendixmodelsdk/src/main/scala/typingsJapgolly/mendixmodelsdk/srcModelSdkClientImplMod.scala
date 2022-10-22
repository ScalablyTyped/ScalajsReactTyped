package typingsJapgolly.mendixmodelsdk

import typingsJapgolly.mendixmodelsdk.anon.Instantiable
import typingsJapgolly.mendixmodelsdk.srcCommonMod.common.ICallback
import typingsJapgolly.mendixmodelsdk.srcCommonMod.common.IErrorCallback
import typingsJapgolly.mendixmodelsdk.srcCommonMod.common.IVoidCallback
import typingsJapgolly.mendixmodelsdk.srcSdkConfigurationMod.configuration.ICreateWorkingCopyFromTeamServerParameters
import typingsJapgolly.mendixmodelsdk.srcSdkConfigurationMod.configuration.ICreateWorkingCopyParameters
import typingsJapgolly.mendixmodelsdk.srcSdkConfigurationMod.configuration.ISdkConfig
import typingsJapgolly.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalAbstractModelMod.IExportMpkCallback
import typingsJapgolly.mendixmodelsdk.srcSdkInternalAbstractModelMod.IExportMpkResponse
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalTransportInterfacesMod.ICommitToTeamServerOptions
import typingsJapgolly.mendixmodelsdk.srcSdkInternalTransportInterfacesMod.ILockWorkingCopyOptions
import typingsJapgolly.mendixmodelsdk.srcSdkInternalTransportInterfacesMod.ILockWorkingCopyResponse
import typingsJapgolly.mendixmodelsdk.srcSdkInternalTransportInterfacesMod.IWorkingCopy
import typingsJapgolly.mendixmodelsdk.srcSdkInternalTransportInterfacesMod.LockType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcModelSdkClientImplMod {
  
  @JSImport("mendixmodelsdk/src/ModelSdkClientImpl", "ModelSdkClientImpl")
  @js.native
  open class ModelSdkClientImpl[IT /* <: IAbstractModel */, CT /* <: AbstractModel & IT */] protected () extends StObject {
    def this(connectionConfig: ISdkConfig, modelConstructor: Instantiable[CT, IT]) = this()
    
    def checkAccess(workingCopyId: String, memberOpenId: String): js.Promise[Boolean] = js.native
    /**
      * Returns whether the member specified to his/her OpenID has (been granted) access to this working copy.
      */
    def checkAccess(
      workingCopyId: String,
      memberOpenId: String,
      callback: ICallback[Boolean],
      errorCallback: IErrorCallback
    ): Unit = js.native
    
    /* private */ var client: Any = js.native
    
    def commitToTeamServer(workingCopyId: String, options: ICommitToTeamServerOptions): js.Promise[Unit] = js.native
    /**
      * Commits the contents of the working copy with the given id to the team server
      */
    def commitToTeamServer(
      workingCopyId: String,
      options: ICommitToTeamServerOptions,
      callback: IVoidCallback,
      errorCallback: IErrorCallback
    ): Unit = js.native
    
    /* private */ var connectionConfig: Any = js.native
    
    def createAndOpenWorkingCopy(workingCopyParameters: ICreateWorkingCopyParameters): js.Promise[IT] = js.native
    /**
      * Create a new working copy on the model server, and reads it for immediate editing.
      */
    def createAndOpenWorkingCopy(
      workingCopyParameters: ICreateWorkingCopyParameters,
      callback: ICallback[IT],
      errorCallback: IErrorCallback
    ): Unit = js.native
    
    def createWorkingCopy(workingCopyParameters: ICreateWorkingCopyParameters): js.Promise[IWorkingCopy] = js.native
    /**
      * Create a new working copy on the model server.
      */
    def createWorkingCopy(
      workingCopyParameters: ICreateWorkingCopyParameters,
      callback: ICallback[IWorkingCopy],
      errorCallback: IErrorCallback
    ): Unit = js.native
    
    def createWorkingCopyFromTeamServer(workingCopyParameters: ICreateWorkingCopyFromTeamServerParameters): js.Promise[IWorkingCopy] = js.native
    /**
      * Create a new working copy on the model server from a team server repository.
      */
    def createWorkingCopyFromTeamServer(
      workingCopyParameters: ICreateWorkingCopyFromTeamServerParameters,
      callback: ICallback[IWorkingCopy],
      errorCallback: IErrorCallback
    ): Unit = js.native
    
    def deleteWorkingCopy(workingCopyId: String): js.Promise[Unit] = js.native
    /**
      * Deletes this working copy from the server, and the (SDK) client.
      */
    def deleteWorkingCopy(workingCopyId: String, callback: IVoidCallback, errorCallback: IErrorCallback): Unit = js.native
    
    def deleteWorkingCopyByProject(projectId: String): js.Promise[Unit] = js.native
    /**
      * Deletes the project-to-working copy mapping for given project ID.
      */
    def deleteWorkingCopyByProject(projectId: String, callback: IVoidCallback, errorCallback: IErrorCallback): Unit = js.native
    
    def exportModuleMpk(workingCopyId: String, moduleId: String, outFilePath: String): js.Promise[Unit] = js.native
    /**
      * Exports the module with the specified ID as MPK.
      */
    def exportModuleMpk(
      workingCopyId: String,
      moduleId: String,
      outFilePath: String,
      callback: IVoidCallback,
      errorCallback: IErrorCallback
    ): Unit = js.native
    
    def exportMpk(workingCopyId: String, outFilePath: String): js.Promise[IExportMpkResponse] = js.native
    /**
      * Exports this working copy as MPK.
      */
    def exportMpk(
      workingCopyId: String,
      outFilePath: String,
      callback: IExportMpkCallback,
      errorCallback: IErrorCallback
    ): Unit = js.native
    
    def getMyWorkingCopies(): js.Promise[js.Array[IWorkingCopy]] = js.native
    /**
      * Retrieves an array of all working copies you are a member of.
      */
    def getMyWorkingCopies(callback: ICallback[js.Array[IWorkingCopy]], errorCallback: IErrorCallback): Unit = js.native
    
    def getWorkingCopyByProject(projectId: String): js.Promise[String] = js.native
    /**
      * Retrieves the working copy id that the given project ID maps to.
      */
    def getWorkingCopyByProject(projectId: String, callback: ICallback[String], errorCallback: IErrorCallback): Unit = js.native
    
    def grantAccess(workingCopyId: String, memberOpenId: String): js.Promise[Unit] = js.native
    /**
      * Grants access to the member specified to his/her OpenID on this working copy.
      */
    def grantAccess(
      workingCopyId: String,
      memberOpenId: String,
      callback: IVoidCallback,
      errorCallback: IErrorCallback
    ): Unit = js.native
    
    def grantAccessByProject(projectId: String, memberOpenId: String): js.Promise[Unit] = js.native
    /**
      * Grants access to the member specified to his/her OpenID to the default working copy of this project.
      */
    def grantAccessByProject(projectId: String, memberOpenId: String, callback: IVoidCallback, errorCallback: IErrorCallback): Unit = js.native
    
    def loadWorkingCopyMetaData(workingCopyId: String): js.Promise[IWorkingCopy] = js.native
    /**
      * Gets meta data of a working copy
      */
    def loadWorkingCopyMetaData(workingCopyId: String, callback: ICallback[IWorkingCopy], errorCallback: IErrorCallback): Unit = js.native
    
    /**
      * Lock the working copy (will be locked for the currently authenticated openid)
      */
    def lockWorkingCopy(
      workingCopyId: String,
      callback: ICallback[ILockWorkingCopyResponse],
      errorCallback: IErrorCallback
    ): Unit = js.native
    def lockWorkingCopy(workingCopyId: String, lockOptions: ILockWorkingCopyOptions): js.Promise[ILockWorkingCopyResponse] = js.native
    def lockWorkingCopy(
      workingCopyId: String,
      lockOptions: ILockWorkingCopyOptions,
      callback: ICallback[ILockWorkingCopyResponse],
      errorCallback: IErrorCallback
    ): Unit = js.native
    def lockWorkingCopy(workingCopyId: String, lockOptions: LockType): js.Promise[ILockWorkingCopyResponse] = js.native
    def lockWorkingCopy(
      workingCopyId: String,
      lockOptions: LockType,
      callback: ICallback[ILockWorkingCopyResponse],
      errorCallback: IErrorCallback
    ): Unit = js.native
    
    /* private */ var modelConstructor: Any = js.native
    
    def openWorkingCopy(workingCopyId: String): js.Promise[IT] = js.native
    /**
      * Reads a working copy on the model server so it can be edited.
      */
    def openWorkingCopy(workingCopyId: String, callback: ICallback[IT], errorCallback: IErrorCallback): Unit = js.native
    
    def revokeAccess(workingCopyId: String, memberOpenId: String): js.Promise[Unit] = js.native
    /**
      * Revokes access of the member specified to his/her OpenID on this working copy.
      */
    def revokeAccess(
      workingCopyId: String,
      memberOpenId: String,
      callback: IVoidCallback,
      errorCallback: IErrorCallback
    ): Unit = js.native
    
    def revokeAccessByProject(projectId: String, memberOpenId: String): js.Promise[Unit] = js.native
    /**
      * Revokes access of the member specified to his/her OpenID to the default working copy of this project.
      */
    def revokeAccessByProject(projectId: String, memberOpenId: String, callback: IVoidCallback, errorCallback: IErrorCallback): Unit = js.native
    
    def setProjectMembers(projectId: String, memberOpenids: js.Array[String]): js.Promise[Unit] = js.native
    /**
      * Sets all members that have access specified by their OpenID to the default working copy of this project.
      */
    def setProjectMembers(
      projectId: String,
      memberOpenids: js.Array[String],
      callback: IVoidCallback,
      errorCallback: IErrorCallback
    ): Unit = js.native
    
    def setWorkingCopyMembers(workingCopyId: String, memberOpenIds: js.Array[String]): js.Promise[Unit] = js.native
    /**
      * Sets the members specified by their OpenID on the specified working copy.
      */
    def setWorkingCopyMembers(
      workingCopyId: String,
      memberOpenIds: js.Array[String],
      callback: IVoidCallback,
      errorCallback: IErrorCallback
    ): Unit = js.native
    
    def unlockWorkingCopy(workingCopyId: String): js.Promise[Unit] = js.native
    /**
      * Unlock the working copy (will be unlocked for the currently authenticated openid, will fail if it's locked by another openid).
      *
      * Provide a lockType to only unlock the working copy if it is locked with this specific type.
      */
    def unlockWorkingCopy(workingCopyId: String, callback: IVoidCallback, errorCallback: IErrorCallback): Unit = js.native
    def unlockWorkingCopy(workingCopyId: String, lockType: LockType): js.Promise[Unit] = js.native
    def unlockWorkingCopy(workingCopyId: String, lockType: LockType, callback: IVoidCallback, errorCallback: IErrorCallback): Unit = js.native
    
    def updateWorkingCopyByProject(projectId: String, workingCopyId: String): js.Promise[Unit] = js.native
    /**
      * Update the project-to-working copy mapping with the given data.
      */
    def updateWorkingCopyByProject(projectId: String, workingCopyId: String, callback: IVoidCallback, errorCallback: IErrorCallback): Unit = js.native
  }
}
