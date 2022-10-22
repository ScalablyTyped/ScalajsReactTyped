package typingsJapgolly.typedGithubApi

import typingsJapgolly.typedGithubApi.distApiInterfacesCommitMod.Commit
import typingsJapgolly.typedGithubApi.distCommitRefMod.CommitRefClass
import typingsJapgolly.typedGithubApi.distInterfacesCommitMod.CommitRef
import typingsJapgolly.typedGithubApi.distInterfacesCommitMod.CommitSummary
import typingsJapgolly.typedGithubApi.distInterfacesCommitMod.GitActor
import typingsJapgolly.typedGithubApi.distInterfacesCommitMod.GitChanges
import typingsJapgolly.typedGithubApi.distInterfacesCommitMod.GitCommit
import typingsJapgolly.typedGithubApi.distInterfacesCommitMod.GitCommitSummary
import typingsJapgolly.typedGithubApi.distInterfacesCommitMod.GitFile
import typingsJapgolly.typedGithubApi.distInterfacesRepositoryMod.RepositoryRef
import typingsJapgolly.typedGithubApi.distRepositoryRefMod.RepositoryRefClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommitMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.typedGithubApi.distInterfacesCommitMod.CommitRef because Already inherited
  - typingsJapgolly.typedGithubApi.distInterfacesCommitMod.CommitSummary because Already inherited
  - typingsJapgolly.typedGithubApi.distInterfacesCommitMod.Commit because var conflicts: author, committer, gitCommit, htmlUri, parents. Inlined changes, files */ @JSImport("typed-github-api/dist/commit", "CommitClass")
  @js.native
  open class CommitClass protected () extends CommitSummaryClass {
    def this(repository: RepositoryRefClass, data: Commit) = this()
    
    var changes: GitChanges = js.native
    
    var files: js.Array[GitFile] = js.native
  }
  
  @JSImport("typed-github-api/dist/commit", "CommitSummaryClass")
  @js.native
  open class CommitSummaryClass protected ()
    extends CommitRefClass
       with CommitSummary {
    def this(
      repository: RepositoryRefClass,
      data: typingsJapgolly.typedGithubApi.distApiInterfacesCommitMod.CommitSummary
    ) = this()
    
    /* CompleteClass */
    var gitCommit: GitCommitSummary = js.native
    
    /* CompleteClass */
    var htmlUri: String = js.native
    
    /* CompleteClass */
    override def loadAsync(): js.Promise[typingsJapgolly.typedGithubApi.distInterfacesCommitMod.Commit | Null] = js.native
    
    /* CompleteClass */
    override def loadGitAsync(): js.Promise[GitCommit | Null] = js.native
    
    /* CompleteClass */
    var parents: js.Array[CommitRef] = js.native
    
    /* CompleteClass */
    override val repository: RepositoryRef = js.native
    
    /* CompleteClass */
    override val sha: String = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.typedGithubApi.distInterfacesCommitMod.CommitRef because Already inherited
  - typingsJapgolly.typedGithubApi.distInterfacesCommitMod.GitCommitSummary because Already inherited
  - typingsJapgolly.typedGithubApi.distInterfacesCommitMod.GitCommit because var conflicts: author, committer, message. Inlined parents */ @JSImport("typed-github-api/dist/commit", "GitCommitClass")
  @js.native
  open class GitCommitClass protected () extends GitCommitSummaryClass {
    def this(
      repository: RepositoryRefClass,
      data: typingsJapgolly.typedGithubApi.distApiInterfacesCommitMod.GitCommit
    ) = this()
    
    var parents: js.Array[CommitRef] = js.native
  }
  
  @JSImport("typed-github-api/dist/commit", "GitCommitSummaryClass")
  @js.native
  open class GitCommitSummaryClass protected ()
    extends CommitRefClass
       with GitCommitSummary {
    def this(
      repository: RepositoryRefClass,
      sha: String,
      data: typingsJapgolly.typedGithubApi.distApiInterfacesCommitMod.GitCommitSummary
    ) = this()
    
    /* CompleteClass */
    var author: GitActor = js.native
    
    /* CompleteClass */
    var committer: GitActor = js.native
    
    /* CompleteClass */
    override def loadAsync(): js.Promise[typingsJapgolly.typedGithubApi.distInterfacesCommitMod.Commit | Null] = js.native
    
    /* CompleteClass */
    override def loadGitAsync(): js.Promise[GitCommit | Null] = js.native
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    override val repository: RepositoryRef = js.native
    
    /* CompleteClass */
    override val sha: String = js.native
  }
}
