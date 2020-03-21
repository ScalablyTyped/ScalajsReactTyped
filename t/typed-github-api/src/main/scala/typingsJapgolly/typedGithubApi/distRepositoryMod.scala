package typingsJapgolly.typedGithubApi

import typingsJapgolly.moment.mod.Moment
import typingsJapgolly.typedGithubApi.githubRefMod.OptionsOrRef
import typingsJapgolly.typedGithubApi.interfacesUserMod.UserSummary
import typingsJapgolly.typedGithubApi.repositoryMod.Repository
import typingsJapgolly.typedGithubApi.repositoryRefMod.RepositoryRefClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typed-github-api/dist/repository", JSImport.Namespace)
@js.native
object distRepositoryMod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typingsJapgolly.typedGithubApi.interfacesRepositoryMod.RepositoryRef because Already inherited
  - typingsJapgolly.typedGithubApi.interfacesRepositoryMod.Repository because var conflicts: owner. Inlined id, fullName, description, isPrivate, isFork, htmlUri, homePage, language, forksCount, starGazersCount, watchersCount, size, defaultBranch, openIssuesCount, topics, hasIssues, hasWiki, hasPages, hasDownloads, pushed, created, updated, permissions, allowRebasemerge, allowSquashMerge, allowMergeCommit, subscribersCount, networkCount */ @js.native
  class RepositoryClass protected () extends RepositoryRefClass {
    def this(repository: Repository, options: OptionsOrRef) = this()
    var allowMergeCommit: Boolean = js.native
    var allowRebasemerge: Boolean = js.native
    var allowSquashMerge: Boolean = js.native
    var created: Moment = js.native
    var defaultBranch: String = js.native
    var description: String = js.native
    var forksCount: Double = js.native
    var fullName: String = js.native
    var hasDownloads: Boolean = js.native
    var hasIssues: Boolean = js.native
    var hasPages: Boolean = js.native
    var hasWiki: Boolean = js.native
    var homePage: String = js.native
    var htmlUri: String = js.native
    var id: Double = js.native
    var isFork: Boolean = js.native
    var isPrivate: Boolean = js.native
    var language: js.UndefOr[String] = js.native
    var networkCount: Double = js.native
    var openIssuesCount: Double = js.native
    @JSName("owner")
    var owner_RepositoryClass: UserSummary = js.native
    var permissions: AnonAdmin = js.native
    var pushed: Moment = js.native
    var size: Double = js.native
    var starGazersCount: Double = js.native
    var subscribersCount: Double = js.native
    var topics: js.Array[String] = js.native
    var updated: Moment = js.native
    var watchersCount: Double = js.native
  }
  
}

