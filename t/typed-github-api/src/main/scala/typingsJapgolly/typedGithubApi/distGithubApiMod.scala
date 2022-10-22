package typingsJapgolly.typedGithubApi

import typingsJapgolly.moment.mod.Moment
import typingsJapgolly.typedGithubApi.distGithubRefMod.GitHubRef
import typingsJapgolly.typedGithubApi.distGithubRefMod.OptionsOrRef
import typingsJapgolly.typedGithubApi.distInterfacesIssueMod.Issue
import typingsJapgolly.typedGithubApi.distInterfacesOwnerRefMod.OwnerRef
import typingsJapgolly.typedGithubApi.distInterfacesRepositoryMod.Repository
import typingsJapgolly.typedGithubApi.distOrganizationMod.OrganizationSummaryClass
import typingsJapgolly.typedGithubApi.distOwnerRefMod.OwnerRefClass
import typingsJapgolly.typedGithubApi.typedGithubApiStrings.`best match`
import typingsJapgolly.typedGithubApi.typedGithubApiStrings.`private`
import typingsJapgolly.typedGithubApi.typedGithubApiStrings.all
import typingsJapgolly.typedGithubApi.typedGithubApiStrings.assigned
import typingsJapgolly.typedGithubApi.typedGithubApiStrings.closed
import typingsJapgolly.typedGithubApi.typedGithubApiStrings.collaborator
import typingsJapgolly.typedGithubApi.typedGithubApiStrings.comments
import typingsJapgolly.typedGithubApi.typedGithubApiStrings.created
import typingsJapgolly.typedGithubApi.typedGithubApiStrings.forks
import typingsJapgolly.typedGithubApi.typedGithubApiStrings.full_name
import typingsJapgolly.typedGithubApi.typedGithubApiStrings.mentioned
import typingsJapgolly.typedGithubApi.typedGithubApiStrings.open
import typingsJapgolly.typedGithubApi.typedGithubApiStrings.organization_member
import typingsJapgolly.typedGithubApi.typedGithubApiStrings.owner
import typingsJapgolly.typedGithubApi.typedGithubApiStrings.public
import typingsJapgolly.typedGithubApi.typedGithubApiStrings.pushed
import typingsJapgolly.typedGithubApi.typedGithubApiStrings.stars
import typingsJapgolly.typedGithubApi.typedGithubApiStrings.subscribed
import typingsJapgolly.typedGithubApi.typedGithubApiStrings.updated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distGithubApiMod {
  
  @JSImport("typed-github-api/dist/github-api", "GitHubApi")
  @js.native
  open class GitHubApi protected () extends GitHubRef {
    def this(options: OptionsOrRef) = this()
    
    /* private */ def getAllSearchPagesAsync[TApiData](uri: Any): Any = js.native
    
    /* private */ def getIssue(issue: Any): Any = js.native
    
    /**
      * @deprecated Use getOwner instead
      */
    def getOrganization(login: String): OwnerRefClass = js.native
    
    def getOwner(login: String): OwnerRef = js.native
    
    /* private */ def getRepository(repository: Any): Any = js.native
    
    /**
      * @deprecated Use getOwner instead
      */
    def getUser(login: String): OwnerRefClass = js.native
    
    def loadIssuesAsync(
      filter: js.UndefOr[assigned | created | mentioned | subscribed | all],
      state: js.UndefOr[open | closed | all],
      labels: js.UndefOr[js.Array[String]],
      sort: js.UndefOr[created | updated | comments],
      ascending: js.UndefOr[Boolean],
      updatedSince: js.UndefOr[Moment]
    ): js.Promise[js.Array[Issue]] = js.native
    
    def loadMyOrganizationsAsync(): js.Promise[js.Array[OrganizationSummaryClass]] = js.native
    
    def loadMyRepositoriesAsync(visibility: all | public | `private`): js.Promise[js.Array[Repository]] = js.native
    def loadMyRepositoriesAsync(
      visibility: all | public | `private`,
      affiliation: js.Array[owner | collaborator | organization_member]
    ): js.Promise[js.Array[Repository]] = js.native
    def loadMyRepositoriesAsync(
      visibility: all | public | `private`,
      affiliation: js.Array[owner | collaborator | organization_member],
      sort: created | updated | pushed | full_name
    ): js.Promise[js.Array[Repository]] = js.native
    def loadMyRepositoriesAsync(
      visibility: all | public | `private`,
      affiliation: js.Array[owner | collaborator | organization_member],
      sort: created | updated | pushed | full_name,
      ascending: Boolean
    ): js.Promise[js.Array[Repository]] = js.native
    def loadMyRepositoriesAsync(
      visibility: all | public | `private`,
      affiliation: js.Array[owner | collaborator | organization_member],
      sort: Unit,
      ascending: Boolean
    ): js.Promise[js.Array[Repository]] = js.native
    def loadMyRepositoriesAsync(
      visibility: all | public | `private`,
      affiliation: Unit,
      sort: created | updated | pushed | full_name
    ): js.Promise[js.Array[Repository]] = js.native
    def loadMyRepositoriesAsync(
      visibility: all | public | `private`,
      affiliation: Unit,
      sort: created | updated | pushed | full_name,
      ascending: Boolean
    ): js.Promise[js.Array[Repository]] = js.native
    def loadMyRepositoriesAsync(visibility: all | public | `private`, affiliation: Unit, sort: Unit, ascending: Boolean): js.Promise[js.Array[Repository]] = js.native
    
    /* private */ def searchAsync[TData, TApiData](uri: Any, query: Any, sort: Any, ascending: Any, perPage: Any, mapping: Any): Any = js.native
    
    /**
      * Loads issues matching search query.
      * @param query     The query used for the search
      * @param sort      The field to sort by (default best match)
      * @param ascending If a field to sort by is specified, whether to sort ascending rather than descending (default false)
      * @param perPage   How many results to return per page (default 100) - pages are concatentated to produce the results array
      * @returns         An array of issues that match the query
      */
    def searchIssuesAsync(query: String): js.Promise[js.Array[Issue]] = js.native
    def searchIssuesAsync(query: String, sort: comments | created | updated | (`best match`)): js.Promise[js.Array[Issue]] = js.native
    def searchIssuesAsync(query: String, sort: comments | created | updated | (`best match`), ascending: Boolean): js.Promise[js.Array[Issue]] = js.native
    def searchIssuesAsync(
      query: String,
      sort: comments | created | updated | (`best match`),
      ascending: Boolean,
      perPage: Double
    ): js.Promise[js.Array[Issue]] = js.native
    def searchIssuesAsync(
      query: String,
      sort: comments | created | updated | (`best match`),
      ascending: Unit,
      perPage: Double
    ): js.Promise[js.Array[Issue]] = js.native
    def searchIssuesAsync(query: String, sort: Unit, ascending: Boolean): js.Promise[js.Array[Issue]] = js.native
    def searchIssuesAsync(query: String, sort: Unit, ascending: Boolean, perPage: Double): js.Promise[js.Array[Issue]] = js.native
    def searchIssuesAsync(query: String, sort: Unit, ascending: Unit, perPage: Double): js.Promise[js.Array[Issue]] = js.native
    
    /**
      * Loads issues matching search query with a score as to how well they matched.
      * @param query     The query used for the search
      * @param sort      The field to sort by (default best match)
      * @param ascending If a field to sort by is specified, whether to sort ascending rather than descending (default false)
      * @param perPage   How many results to return per page (default 100) - pages are concatentated to produce the results array
      * @returns         An array of issues that match the query with a score as to how well they matched
      */
    def searchIssuesWithScoreAsync(query: String): js.Promise[js.Array[SearchResult[Issue]]] = js.native
    def searchIssuesWithScoreAsync(query: String, sort: comments | created | updated | (`best match`)): js.Promise[js.Array[SearchResult[Issue]]] = js.native
    def searchIssuesWithScoreAsync(query: String, sort: comments | created | updated | (`best match`), ascending: Boolean): js.Promise[js.Array[SearchResult[Issue]]] = js.native
    def searchIssuesWithScoreAsync(
      query: String,
      sort: comments | created | updated | (`best match`),
      ascending: Boolean,
      perPage: Double
    ): js.Promise[js.Array[SearchResult[Issue]]] = js.native
    def searchIssuesWithScoreAsync(
      query: String,
      sort: comments | created | updated | (`best match`),
      ascending: Unit,
      perPage: Double
    ): js.Promise[js.Array[SearchResult[Issue]]] = js.native
    def searchIssuesWithScoreAsync(query: String, sort: Unit, ascending: Boolean): js.Promise[js.Array[SearchResult[Issue]]] = js.native
    def searchIssuesWithScoreAsync(query: String, sort: Unit, ascending: Boolean, perPage: Double): js.Promise[js.Array[SearchResult[Issue]]] = js.native
    def searchIssuesWithScoreAsync(query: String, sort: Unit, ascending: Unit, perPage: Double): js.Promise[js.Array[SearchResult[Issue]]] = js.native
    
    /**
      * Loads repositories matching search query.
      * @param query     The query used for the search
      * @param sort      The field to sort by (default best match)
      * @param ascending If a field to sort by is specified, whether to sort ascending rather than descending (default false)
      * @param perPage   How many results to return per page (default 100) - pages are concatentated to produce the results array
      * @returns         An array of repositories that match the query
      */
    def searchRepositoriesAsync(query: String): js.Promise[js.Array[Repository]] = js.native
    def searchRepositoriesAsync(query: String, sort: stars | forks | updated | (`best match`)): js.Promise[js.Array[Repository]] = js.native
    def searchRepositoriesAsync(query: String, sort: stars | forks | updated | (`best match`), ascending: Boolean): js.Promise[js.Array[Repository]] = js.native
    def searchRepositoriesAsync(query: String, sort: stars | forks | updated | (`best match`), ascending: Boolean, perPage: Double): js.Promise[js.Array[Repository]] = js.native
    def searchRepositoriesAsync(query: String, sort: stars | forks | updated | (`best match`), ascending: Unit, perPage: Double): js.Promise[js.Array[Repository]] = js.native
    def searchRepositoriesAsync(query: String, sort: Unit, ascending: Boolean): js.Promise[js.Array[Repository]] = js.native
    def searchRepositoriesAsync(query: String, sort: Unit, ascending: Boolean, perPage: Double): js.Promise[js.Array[Repository]] = js.native
    def searchRepositoriesAsync(query: String, sort: Unit, ascending: Unit, perPage: Double): js.Promise[js.Array[Repository]] = js.native
    
    /**
      * Loads repositories matching search query with a score as to how well they matched.
      * @param query     The query used for the search
      * @param sort      The field to sort by (default best match)
      * @param ascending If a field to sort by is specified, whether to sort ascending rather than descending (default false)
      * @param perPage   How many results to return per page (default 100) - pages are concatentated to produce the results array
      * @returns         An array of repositories that match the query with a score as to how well they matched
      */
    def searchRepositoriesWithScoreAsync(query: String): js.Promise[js.Array[SearchResult[Repository]]] = js.native
    def searchRepositoriesWithScoreAsync(query: String, sort: stars | forks | updated | (`best match`)): js.Promise[js.Array[SearchResult[Repository]]] = js.native
    def searchRepositoriesWithScoreAsync(query: String, sort: stars | forks | updated | (`best match`), ascending: Boolean): js.Promise[js.Array[SearchResult[Repository]]] = js.native
    def searchRepositoriesWithScoreAsync(query: String, sort: stars | forks | updated | (`best match`), ascending: Boolean, perPage: Double): js.Promise[js.Array[SearchResult[Repository]]] = js.native
    def searchRepositoriesWithScoreAsync(query: String, sort: stars | forks | updated | (`best match`), ascending: Unit, perPage: Double): js.Promise[js.Array[SearchResult[Repository]]] = js.native
    def searchRepositoriesWithScoreAsync(query: String, sort: Unit, ascending: Boolean): js.Promise[js.Array[SearchResult[Repository]]] = js.native
    def searchRepositoriesWithScoreAsync(query: String, sort: Unit, ascending: Boolean, perPage: Double): js.Promise[js.Array[SearchResult[Repository]]] = js.native
    def searchRepositoriesWithScoreAsync(query: String, sort: Unit, ascending: Unit, perPage: Double): js.Promise[js.Array[SearchResult[Repository]]] = js.native
  }
  
  trait SearchResult[T] extends StObject {
    
    var result: T
    
    var score: Double
  }
  object SearchResult {
    
    inline def apply[T](result: T, score: Double): SearchResult[T] = {
      val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any])
      __obj.asInstanceOf[SearchResult[T]]
    }
    
    extension [Self <: SearchResult[?], T](x: Self & SearchResult[T]) {
      
      inline def setResult(value: T): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      inline def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    }
  }
}
