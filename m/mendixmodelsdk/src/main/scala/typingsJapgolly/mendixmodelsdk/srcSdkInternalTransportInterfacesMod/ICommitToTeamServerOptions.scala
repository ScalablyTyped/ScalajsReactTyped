package typingsJapgolly.mendixmodelsdk.srcSdkInternalTransportInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.mendixmodelsdk.srcSdkInternalTransportInterfacesMod.ICommitToGitTeamServerOptions
  - typingsJapgolly.mendixmodelsdk.srcSdkInternalTransportInterfacesMod.ICommitToSVNTeamServerOptions
*/
trait ICommitToTeamServerOptions extends StObject
object ICommitToTeamServerOptions {
  
  inline def ICommitToGitTeamServerOptions(
    authorEmail: String,
    authorName: String,
    commitMessage: String,
    targetBranch: String,
    targetCommitId: String,
    teamServerGitUrl: String
  ): typingsJapgolly.mendixmodelsdk.srcSdkInternalTransportInterfacesMod.ICommitToGitTeamServerOptions = {
    val __obj = js.Dynamic.literal(authorEmail = authorEmail.asInstanceOf[js.Any], authorName = authorName.asInstanceOf[js.Any], commitMessage = commitMessage.asInstanceOf[js.Any], repositoryType = "git", targetBranch = targetBranch.asInstanceOf[js.Any], targetCommitId = targetCommitId.asInstanceOf[js.Any], teamServerGitUrl = teamServerGitUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.mendixmodelsdk.srcSdkInternalTransportInterfacesMod.ICommitToGitTeamServerOptions]
  }
  
  inline def ICommitToSVNTeamServerOptions(
    commitMessage: String,
    targetBranch: String,
    targetRevision: Double,
    teamServerPassword: String,
    teamServerUsername: String
  ): typingsJapgolly.mendixmodelsdk.srcSdkInternalTransportInterfacesMod.ICommitToSVNTeamServerOptions = {
    val __obj = js.Dynamic.literal(commitMessage = commitMessage.asInstanceOf[js.Any], targetBranch = targetBranch.asInstanceOf[js.Any], targetRevision = targetRevision.asInstanceOf[js.Any], teamServerPassword = teamServerPassword.asInstanceOf[js.Any], teamServerUsername = teamServerUsername.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.mendixmodelsdk.srcSdkInternalTransportInterfacesMod.ICommitToSVNTeamServerOptions]
  }
}
