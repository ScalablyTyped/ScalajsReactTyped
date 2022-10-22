package typingsJapgolly.typedGithubApi

import typingsJapgolly.typedGithubApi.distGithubRefMod.GitHubRef
import typingsJapgolly.typedGithubApi.distInterfacesCommitMod.Commit
import typingsJapgolly.typedGithubApi.distInterfacesCommitMod.CommitRef
import typingsJapgolly.typedGithubApi.distInterfacesCommitMod.GitCommit
import typingsJapgolly.typedGithubApi.distInterfacesRepositoryMod.RepositoryRef
import typingsJapgolly.typedGithubApi.distRepositoryRefMod.RepositoryRefClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommitRefMod {
  
  @JSImport("typed-github-api/dist/commit-ref", "CommitRefClass")
  @js.native
  open class CommitRefClass protected ()
    extends GitHubRef
       with CommitRef {
    def this(repository: RepositoryRefClass, sha: String) = this()
    
    /* CompleteClass */
    override def loadAsync(): js.Promise[Commit | Null] = js.native
    
    /* CompleteClass */
    override def loadGitAsync(): js.Promise[GitCommit | Null] = js.native
    
    /* CompleteClass */
    override val repository: RepositoryRef = js.native
    @JSName("repository")
    val repository_CommitRefClass: RepositoryRefClass = js.native
    
    /* CompleteClass */
    override val sha: String = js.native
  }
}
