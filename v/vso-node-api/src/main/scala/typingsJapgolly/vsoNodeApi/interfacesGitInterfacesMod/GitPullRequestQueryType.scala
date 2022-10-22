package typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GitPullRequestQueryType extends StObject
@JSImport("vso-node-api/interfaces/GitInterfaces", "GitPullRequestQueryType")
@js.native
object GitPullRequestQueryType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GitPullRequestQueryType & Double] = js.native
  
  /**
    * Search for pull requests that merged the suppliest commits.
    */
  @js.native
  sealed trait Commit
    extends StObject
       with GitPullRequestQueryType
  /* 2 */ val Commit: typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.GitPullRequestQueryType.Commit & Double = js.native
  
  /**
    * Search for pull requests that created the supplied merge commits.
    */
  @js.native
  sealed trait LastMergeCommit
    extends StObject
       with GitPullRequestQueryType
  /* 1 */ val LastMergeCommit: typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.GitPullRequestQueryType.LastMergeCommit & Double = js.native
  
  /**
    * No query type set.
    */
  @js.native
  sealed trait NotSet
    extends StObject
       with GitPullRequestQueryType
  /* 0 */ val NotSet: typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.GitPullRequestQueryType.NotSet & Double = js.native
}
