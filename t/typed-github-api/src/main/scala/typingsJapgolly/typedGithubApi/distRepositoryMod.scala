package typingsJapgolly.typedGithubApi

import typingsJapgolly.moment.mod.Moment
import typingsJapgolly.typedGithubApi.anon.Admin
import typingsJapgolly.typedGithubApi.distApiInterfacesRepositoryMod.Repository
import typingsJapgolly.typedGithubApi.distGithubRefMod.OptionsOrRef
import typingsJapgolly.typedGithubApi.distInterfacesUserMod.UserSummary
import typingsJapgolly.typedGithubApi.distRepositoryRefMod.RepositoryRefClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distRepositoryMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.typedGithubApi.distInterfacesRepositoryMod.RepositoryRef because Already inherited
  - typingsJapgolly.typedGithubApi.distInterfacesRepositoryMod.Repository because var conflicts: owner. Inlined id, fullName, description, isPrivate, isFork, htmlUri, homePage, language, forksCount, starGazersCount, watchersCount, size, defaultBranch, openIssuesCount, topics, hasIssues, hasWiki, hasPages, hasDownloads, pushed, created, updated, permissions, allowRebasemerge, allowSquashMerge, allowMergeCommit, subscribersCount, networkCount */ @JSImport("typed-github-api/dist/repository", "RepositoryClass")
  @js.native
  open class RepositoryClass protected () extends RepositoryRefClass {
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
    
    var permissions: Admin = js.native
    
    var pushed: Moment = js.native
    
    var size: Double = js.native
    
    var starGazersCount: Double = js.native
    
    var subscribersCount: Double = js.native
    
    var topics: js.Array[String] = js.native
    
    var updated: Moment = js.native
    
    var watchersCount: Double = js.native
  }
}
