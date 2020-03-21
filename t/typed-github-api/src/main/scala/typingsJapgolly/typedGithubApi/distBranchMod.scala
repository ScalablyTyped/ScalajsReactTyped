package typingsJapgolly.typedGithubApi

import typingsJapgolly.typedGithubApi.branchRefMod.BranchRefClass
import typingsJapgolly.typedGithubApi.interfacesBranchMod.Branch
import typingsJapgolly.typedGithubApi.interfacesCommitMod.CommitSummary
import typingsJapgolly.typedGithubApi.interfacesRepositoryMod.RepositoryRef
import typingsJapgolly.typedGithubApi.repositoryRefMod.RepositoryRefClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typed-github-api/dist/branch", JSImport.Namespace)
@js.native
object distBranchMod extends js.Object {
  @js.native
  class BranchClass protected ()
    extends BranchRefClass
       with Branch {
    def this(repository: RepositoryRefClass, data: typingsJapgolly.typedGithubApi.branchMod.Branch) = this()
    /* CompleteClass */
    override var commit: CommitSummary = js.native
    /* CompleteClass */
    override val name: String = js.native
    /* CompleteClass */
    override val repository: RepositoryRef = js.native
    /* CompleteClass */
    override def loadAsync(): js.Promise[Branch | Null] = js.native
  }
  
}

