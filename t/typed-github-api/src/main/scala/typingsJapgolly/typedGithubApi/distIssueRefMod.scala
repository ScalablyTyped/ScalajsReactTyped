package typingsJapgolly.typedGithubApi

import typingsJapgolly.typedGithubApi.distGithubRefMod.GitHubRef
import typingsJapgolly.typedGithubApi.distInterfacesIssueMod.Issue
import typingsJapgolly.typedGithubApi.distInterfacesIssueMod.IssueRef
import typingsJapgolly.typedGithubApi.distInterfacesRepositoryMod.Repository
import typingsJapgolly.typedGithubApi.distInterfacesRepositoryMod.RepositoryRef
import typingsJapgolly.typedGithubApi.distRepositoryRefMod.RepositoryRefClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distIssueRefMod {
  
  @JSImport("typed-github-api/dist/issue-ref", "IssueRefClass")
  @js.native
  open class IssueRefClass protected ()
    extends GitHubRef
       with IssueRef {
    def this(repository: RepositoryRefClass, issueNumber: Double) = this()
    
    /* CompleteClass */
    override def loadAsync(): js.Promise[Issue | Null] = js.native
    
    /* CompleteClass */
    override def loadRepositoryAsync(): js.Promise[Repository] = js.native
    
    /* CompleteClass */
    override val number: Double = js.native
    
    val repository: RepositoryRef = js.native
  }
}
