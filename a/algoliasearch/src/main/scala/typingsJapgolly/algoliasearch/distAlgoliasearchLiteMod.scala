package typingsJapgolly.algoliasearch

import typingsJapgolly.algoliaClientCommon.mod.ClientTransporterOptions
import typingsJapgolly.algoliaClientSearch.mod.FindAnswersOptions
import typingsJapgolly.algoliaClientSearch.mod.FindAnswersResponse
import typingsJapgolly.algoliaClientSearch.mod.MultipleQueriesOptions
import typingsJapgolly.algoliaClientSearch.mod.MultipleQueriesQuery
import typingsJapgolly.algoliaClientSearch.mod.MultipleQueriesResponse
import typingsJapgolly.algoliaClientSearch.mod.SearchOptions
import typingsJapgolly.algoliaClientSearch.mod.SearchResponse
import typingsJapgolly.algoliaTransporter.mod.Request
import typingsJapgolly.algoliaTransporter.mod.RequestOptions
import typingsJapgolly.algoliasearch.algoliasearchStrings.apiKey
import typingsJapgolly.algoliasearch.algoliasearchStrings.appId
import typingsJapgolly.algoliasearch.anon.IndexName
import typingsJapgolly.algoliasearch.anon.ReadonlyPromiseArraySearc
import typingsJapgolly.algoliasearch.anon.ReadonlyPromiseSearchForF
import typingsJapgolly.algoliasearch.anon.WithoutCredentialsSearchC
import typingsJapgolly.std.Omit
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAlgoliasearchLiteMod {
  
  object default {
    
    inline def apply(appId: String, apiKey: String): SearchClient = (^.asInstanceOf[js.Dynamic].apply(appId.asInstanceOf[js.Any], apiKey.asInstanceOf[js.Any])).asInstanceOf[SearchClient]
    inline def apply(appId: String, apiKey: String, options: AlgoliaSearchOptions): SearchClient = (^.asInstanceOf[js.Dynamic].apply(appId.asInstanceOf[js.Any], apiKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SearchClient]
    
    @JSImport("algoliasearch/dist/algoliasearch-lite", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("algoliasearch/dist/algoliasearch-lite", "default.version")
    @js.native
    def version: String = js.native
    inline def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
  }
  
  type AlgoliaSearchOptions = Partial[ClientTransporterOptions] & WithoutCredentialsSearchC
  
  trait Credentials extends StObject {
    
    val apiKey: String
    
    val appId: String
  }
  object Credentials {
    
    inline def apply(apiKey: String, appId: String): Credentials = {
      val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any], appId = appId.asInstanceOf[js.Any])
      __obj.asInstanceOf[Credentials]
    }
    
    extension [Self <: Credentials](x: Self) {
      
      inline def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
      
      inline def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SearchClient
    extends StObject
       with typingsJapgolly.algoliaClientSearch.mod.SearchClient {
    
    def customRequest[TResponse](request: Request): js.Promise[TResponse] = js.native
    def customRequest[TResponse](request: Request, requestOptions: RequestOptions): js.Promise[TResponse] = js.native
    
    def initIndex(indexName: String): SearchIndex = js.native
    
    def search[TObject](queries: js.Array[MultipleQueriesQuery]): js.Promise[MultipleQueriesResponse[TObject]] = js.native
    def search[TObject](queries: js.Array[MultipleQueriesQuery], requestOptions: RequestOptions & MultipleQueriesOptions): js.Promise[MultipleQueriesResponse[TObject]] = js.native
    
    def searchForFacetValues(queries: js.Array[IndexName]): ReadonlyPromiseArraySearc = js.native
    def searchForFacetValues(queries: js.Array[IndexName], requestOptions: RequestOptions): ReadonlyPromiseArraySearc = js.native
  }
  
  @js.native
  trait SearchIndex
    extends StObject
       with typingsJapgolly.algoliaClientSearch.mod.SearchIndex {
    
    def findAnswers[TObject](query: String, queryLanguages: js.Array[String]): js.Promise[FindAnswersResponse[TObject]] = js.native
    def findAnswers[TObject](
      query: String,
      queryLanguages: js.Array[String],
      requestOptions: RequestOptions & FindAnswersOptions
    ): js.Promise[FindAnswersResponse[TObject]] = js.native
    
    def search[TObject](query: String): js.Promise[SearchResponse[TObject]] = js.native
    def search[TObject](query: String, requestOptions: RequestOptions & SearchOptions): js.Promise[SearchResponse[TObject]] = js.native
    
    def searchForFacetValues(facetName: String, facetQuery: String): ReadonlyPromiseSearchForF = js.native
    def searchForFacetValues(facetName: String, facetQuery: String, requestOptions: RequestOptions & SearchOptions): ReadonlyPromiseSearchForF = js.native
  }
  
  type WithoutCredentials[TClientOptions /* <: Credentials */] = Omit[
    TClientOptions, 
    /* keyof algoliasearch.algoliasearch/dist/algoliasearch-lite.Credentials */ appId | apiKey
  ]
}
