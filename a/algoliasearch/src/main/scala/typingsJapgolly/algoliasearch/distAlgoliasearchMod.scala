package typingsJapgolly.algoliasearch

import typingsJapgolly.algoliaClientAnalytics.mod.ABTest
import typingsJapgolly.algoliaClientAnalytics.mod.GetABTestsOptions
import typingsJapgolly.algoliaClientCommon.mod.ClientTransporterOptions
import typingsJapgolly.algoliaClientPersonalization.mod.PersonalizationStrategy
import typingsJapgolly.algoliaClientSearch.mod.ApiKeyACLType
import typingsJapgolly.algoliaClientSearch.mod.BatchRequest
import typingsJapgolly.algoliaClientSearch.mod.BrowseOptions
import typingsJapgolly.algoliaClientSearch.mod.ChunkOptions
import typingsJapgolly.algoliaClientSearch.mod.ClearRulesOptions
import typingsJapgolly.algoliaClientSearch.mod.ClearSynonymsOptions
import typingsJapgolly.algoliaClientSearch.mod.CopyIndexOptions
import typingsJapgolly.algoliaClientSearch.mod.DeleteByFiltersOptions
import typingsJapgolly.algoliaClientSearch.mod.DeleteSynonymOptions
import typingsJapgolly.algoliaClientSearch.mod.DictionaryEntriesOptions
import typingsJapgolly.algoliaClientSearch.mod.DictionaryEntry
import typingsJapgolly.algoliaClientSearch.mod.DictionaryName
import typingsJapgolly.algoliaClientSearch.mod.DictionarySettings
import typingsJapgolly.algoliaClientSearch.mod.FindAnswersOptions
import typingsJapgolly.algoliaClientSearch.mod.FindAnswersResponse
import typingsJapgolly.algoliaClientSearch.mod.FindObjectOptions
import typingsJapgolly.algoliaClientSearch.mod.FindObjectResponse
import typingsJapgolly.algoliaClientSearch.mod.GetObjectOptions
import typingsJapgolly.algoliaClientSearch.mod.GetObjectsOptions
import typingsJapgolly.algoliaClientSearch.mod.GetObjectsResponse
import typingsJapgolly.algoliaClientSearch.mod.HasPendingMappingsOptions
import typingsJapgolly.algoliaClientSearch.mod.ListUserIDsOptions
import typingsJapgolly.algoliaClientSearch.mod.MultipleBatchRequest
import typingsJapgolly.algoliaClientSearch.mod.MultipleGetObject
import typingsJapgolly.algoliaClientSearch.mod.MultipleGetObjectsResponse
import typingsJapgolly.algoliaClientSearch.mod.MultipleQueriesOptions
import typingsJapgolly.algoliaClientSearch.mod.MultipleQueriesQuery
import typingsJapgolly.algoliaClientSearch.mod.MultipleQueriesResponse
import typingsJapgolly.algoliaClientSearch.mod.ObjectWithObjectID
import typingsJapgolly.algoliaClientSearch.mod.PartialUpdateObjectsOptions
import typingsJapgolly.algoliaClientSearch.mod.ReplaceAllObjectsOptions
import typingsJapgolly.algoliaClientSearch.mod.Rule
import typingsJapgolly.algoliaClientSearch.mod.SaveObjectsOptions
import typingsJapgolly.algoliaClientSearch.mod.SaveRulesOptions
import typingsJapgolly.algoliaClientSearch.mod.SaveSynonymsOptions
import typingsJapgolly.algoliaClientSearch.mod.SearchOptions
import typingsJapgolly.algoliaClientSearch.mod.SearchResponse
import typingsJapgolly.algoliaClientSearch.mod.SearchRulesOptions
import typingsJapgolly.algoliaClientSearch.mod.SearchSynonymsOptions
import typingsJapgolly.algoliaClientSearch.mod.SearchUserIDsOptions
import typingsJapgolly.algoliaClientSearch.mod.SecuredApiKeyRestrictions
import typingsJapgolly.algoliaClientSearch.mod.Settings
import typingsJapgolly.algoliaClientSearch.mod.Synonym
import typingsJapgolly.algoliaRequesterCommon.mod.Destroyable
import typingsJapgolly.algoliaTransporter.mod.Request
import typingsJapgolly.algoliaTransporter.mod.RequestOptions
import typingsJapgolly.algoliasearch.algoliasearchStrings.apiKey
import typingsJapgolly.algoliasearch.algoliasearchStrings.appId
import typingsJapgolly.algoliasearch.anon.AddApiKeyOptionsPickReque
import typingsJapgolly.algoliasearch.anon.IndexName
import typingsJapgolly.algoliasearch.anon.OptionalCredentialsAnalyt
import typingsJapgolly.algoliasearch.anon.OptionalCredentialsPerson
import typingsJapgolly.algoliasearch.anon.ReadonlyPromiseAddABTestR
import typingsJapgolly.algoliasearch.anon.ReadonlyPromiseArraySearc
import typingsJapgolly.algoliasearch.anon.ReadonlyPromiseAssignUser
import typingsJapgolly.algoliasearch.anon.ReadonlyPromiseAssignUserCatch
import typingsJapgolly.algoliasearch.anon.ReadonlyPromiseDeleteABTe
import typingsJapgolly.algoliasearch.anon.ReadonlyPromiseGetABTestR
import typingsJapgolly.algoliasearch.anon.ReadonlyPromiseGetABTests
import typingsJapgolly.algoliasearch.anon.ReadonlyPromiseGetApiKeyR
import typingsJapgolly.algoliasearch.anon.ReadonlyPromiseGetDiction
import typingsJapgolly.algoliasearch.anon.ReadonlyPromiseGetLogsRes
import typingsJapgolly.algoliasearch.anon.ReadonlyPromiseGetPersona
import typingsJapgolly.algoliasearch.anon.ReadonlyPromiseGetTopUser
import typingsJapgolly.algoliasearch.anon.ReadonlyPromiseHasPending
import typingsJapgolly.algoliasearch.anon.ReadonlyPromiseListApiKey
import typingsJapgolly.algoliasearch.anon.ReadonlyPromiseListCluste
import typingsJapgolly.algoliasearch.anon.ReadonlyPromiseListIndice
import typingsJapgolly.algoliasearch.anon.ReadonlyPromiseListUserID
import typingsJapgolly.algoliasearch.anon.ReadonlyPromiseRemoveUser
import typingsJapgolly.algoliasearch.anon.ReadonlyPromiseRule
import typingsJapgolly.algoliasearch.anon.ReadonlyPromiseSearchDict
import typingsJapgolly.algoliasearch.anon.ReadonlyPromiseSearchForF
import typingsJapgolly.algoliasearch.anon.ReadonlyPromiseSearchResp
import typingsJapgolly.algoliasearch.anon.ReadonlyPromiseSearchSyno
import typingsJapgolly.algoliasearch.anon.ReadonlyPromiseSearchUser
import typingsJapgolly.algoliasearch.anon.ReadonlyPromiseSetPersona
import typingsJapgolly.algoliasearch.anon.ReadonlyPromiseSettings
import typingsJapgolly.algoliasearch.anon.ReadonlyPromiseStopABTest
import typingsJapgolly.algoliasearch.anon.ReadonlyPromiseSynonym
import typingsJapgolly.algoliasearch.anon.ReadonlyPromiseTaskStatus
import typingsJapgolly.algoliasearch.anon.ReadonlyPromiseUserIDResp
import typingsJapgolly.algoliasearch.anon.ReadonlyPromiseboolean
import typingsJapgolly.algoliasearch.anon.ReadonlyPromisevoid
import typingsJapgolly.algoliasearch.anon.ReadonlyWaitablePromiseAd
import typingsJapgolly.algoliasearch.anon.ReadonlyWaitablePromiseBa
import typingsJapgolly.algoliasearch.anon.ReadonlyWaitablePromiseCh
import typingsJapgolly.algoliasearch.anon.ReadonlyWaitablePromiseDe
import typingsJapgolly.algoliasearch.anon.ReadonlyWaitablePromiseDeCatch
import typingsJapgolly.algoliasearch.anon.ReadonlyWaitablePromiseDi
import typingsJapgolly.algoliasearch.anon.ReadonlyWaitablePromiseIn
import typingsJapgolly.algoliasearch.anon.ReadonlyWaitablePromiseMu
import typingsJapgolly.algoliasearch.anon.ReadonlyWaitablePromisePa
import typingsJapgolly.algoliasearch.anon.ReadonlyWaitablePromiseRe
import typingsJapgolly.algoliasearch.anon.ReadonlyWaitablePromiseSa
import typingsJapgolly.algoliasearch.anon.ReadonlyWaitablePromiseSaCatch
import typingsJapgolly.algoliasearch.anon.ReadonlyWaitablePromiseSaFinally
import typingsJapgolly.algoliasearch.anon.ReadonlyWaitablePromiseSaThen
import typingsJapgolly.algoliasearch.anon.ReadonlyWaitablePromiseSaWait
import typingsJapgolly.algoliasearch.anon.ReadonlyWaitablePromiseSe
import typingsJapgolly.algoliasearch.anon.ReadonlyWaitablePromiseUp
import typingsJapgolly.algoliasearch.anon.RequestOptionsPickSaveSyn
import typingsJapgolly.algoliasearch.anon.UpdateApiKeyOptionsPickRe
import typingsJapgolly.algoliasearch.anon.WithoutCredentialsSearchC
import typingsJapgolly.std.Omit
import typingsJapgolly.std.Partial
import typingsJapgolly.std.Pick
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAlgoliasearchMod {
  
  object default {
    
    inline def apply(appId: String, apiKey: String): SearchClient = (^.asInstanceOf[js.Dynamic].apply(appId.asInstanceOf[js.Any], apiKey.asInstanceOf[js.Any])).asInstanceOf[SearchClient]
    inline def apply(appId: String, apiKey: String, options: AlgoliaSearchOptions): SearchClient = (^.asInstanceOf[js.Dynamic].apply(appId.asInstanceOf[js.Any], apiKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SearchClient]
    
    @JSImport("algoliasearch/dist/algoliasearch", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("algoliasearch/dist/algoliasearch", "default.version")
    @js.native
    def version: String = js.native
    inline def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
  }
  
  type AlgoliaSearchOptions = Partial[ClientTransporterOptions] & WithoutCredentialsSearchC
  
  @js.native
  trait AnalyticsClient
    extends StObject
       with typingsJapgolly.algoliaClientAnalytics.mod.AnalyticsClient {
    
    def addABTest(abTest: ABTest): ReadonlyPromiseAddABTestR = js.native
    def addABTest(abTest: ABTest, requestOptions: RequestOptions): ReadonlyPromiseAddABTestR = js.native
    
    def deleteABTest(abTestID: Double): ReadonlyPromiseDeleteABTe = js.native
    def deleteABTest(abTestID: Double, requestOptions: RequestOptions): ReadonlyPromiseDeleteABTe = js.native
    
    def getABTest(abTestID: Double): ReadonlyPromiseGetABTestR = js.native
    def getABTest(abTestID: Double, requestOptions: RequestOptions): ReadonlyPromiseGetABTestR = js.native
    
    def getABTests(): ReadonlyPromiseGetABTests = js.native
    def getABTests(requestOptions: RequestOptions & GetABTestsOptions): ReadonlyPromiseGetABTests = js.native
    
    def stopABTest(abTestID: Double): ReadonlyPromiseStopABTest = js.native
    def stopABTest(abTestID: Double, requestOptions: RequestOptions): ReadonlyPromiseStopABTest = js.native
  }
  
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
  
  type InitAnalyticsOptions = Partial[ClientTransporterOptions] & OptionalCredentialsAnalyt
  
  type InitPersonalizationOptions = Partial[ClientTransporterOptions] & OptionalCredentialsPerson
  
  type InitRecommendationOptions = InitPersonalizationOptions
  
  type OptionalCredentials[TClientOptions /* <: Credentials */] = (Omit[
    TClientOptions, 
    /* keyof algoliasearch.algoliasearch/dist/algoliasearch.Credentials */ appId | apiKey
  ]) & (Pick[
    Partial[TClientOptions], 
    /* keyof algoliasearch.algoliasearch/dist/algoliasearch.Credentials */ appId | apiKey
  ])
  
  @js.native
  trait PersonalizationClient
    extends StObject
       with typingsJapgolly.algoliaClientPersonalization.mod.PersonalizationClient {
    
    def getPersonalizationStrategy(): ReadonlyPromiseGetPersona = js.native
    def getPersonalizationStrategy(requestOptions: RequestOptions): ReadonlyPromiseGetPersona = js.native
    
    def setPersonalizationStrategy(personalizationStrategy: PersonalizationStrategy): ReadonlyPromiseSetPersona = js.native
    def setPersonalizationStrategy(personalizationStrategy: PersonalizationStrategy, requestOptions: RequestOptions): ReadonlyPromiseSetPersona = js.native
  }
  
  type RecommendationClient = PersonalizationClient
  
  @js.native
  trait SearchClient
    extends StObject
       with typingsJapgolly.algoliaClientSearch.mod.SearchClient
       with Destroyable {
    
    def addApiKey(acl: js.Array[ApiKeyACLType]): ReadonlyWaitablePromiseAd = js.native
    def addApiKey(acl: js.Array[ApiKeyACLType], requestOptions: AddApiKeyOptionsPickReque): ReadonlyWaitablePromiseAd = js.native
    
    def assignUserID(userID: String, clusterName: String): ReadonlyPromiseAssignUser = js.native
    def assignUserID(userID: String, clusterName: String, requestOptions: RequestOptions): ReadonlyPromiseAssignUser = js.native
    
    def assignUserIDs(userIDs: js.Array[String], clusterName: String): ReadonlyPromiseAssignUserCatch = js.native
    def assignUserIDs(userIDs: js.Array[String], clusterName: String, requestOptions: RequestOptions): ReadonlyPromiseAssignUserCatch = js.native
    
    def clearDictionaryEntries(dictionary: DictionaryName): ReadonlyWaitablePromiseDi = js.native
    def clearDictionaryEntries(dictionary: DictionaryName, requestOptions: RequestOptions & DictionaryEntriesOptions): ReadonlyWaitablePromiseDi = js.native
    
    def copyIndex(from: String, to: String): ReadonlyWaitablePromiseIn = js.native
    def copyIndex(from: String, to: String, requestOptions: CopyIndexOptions & RequestOptions): ReadonlyWaitablePromiseIn = js.native
    
    def copyRules(from: String, to: String): ReadonlyWaitablePromiseIn = js.native
    def copyRules(from: String, to: String, requestOptions: RequestOptions): ReadonlyWaitablePromiseIn = js.native
    
    def copySettings(from: String, to: String): ReadonlyWaitablePromiseIn = js.native
    def copySettings(from: String, to: String, requestOptions: RequestOptions): ReadonlyWaitablePromiseIn = js.native
    
    def copySynonyms(from: String, to: String): ReadonlyWaitablePromiseIn = js.native
    def copySynonyms(from: String, to: String, requestOptions: RequestOptions): ReadonlyWaitablePromiseIn = js.native
    
    def customRequest[TResponse](request: Request): js.Promise[TResponse] = js.native
    def customRequest[TResponse](request: Request, requestOptions: RequestOptions): js.Promise[TResponse] = js.native
    
    def deleteApiKey(apiKey: String): ReadonlyWaitablePromiseDe = js.native
    def deleteApiKey(apiKey: String, requestOptions: RequestOptions): ReadonlyWaitablePromiseDe = js.native
    
    def deleteDictionaryEntries(dictionary: DictionaryName, objectIDs: js.Array[String]): ReadonlyWaitablePromiseDi = js.native
    def deleteDictionaryEntries(
      dictionary: DictionaryName,
      objectIDs: js.Array[String],
      requestOptions: RequestOptions & DictionaryEntriesOptions
    ): ReadonlyWaitablePromiseDi = js.native
    
    def generateSecuredApiKey(parentApiKey: String, restrictions: SecuredApiKeyRestrictions): String = js.native
    
    def getApiKey(apiKey: String): ReadonlyPromiseGetApiKeyR = js.native
    def getApiKey(apiKey: String, requestOptions: RequestOptions): ReadonlyPromiseGetApiKeyR = js.native
    
    def getAppTask(taskID: Double): ReadonlyPromiseTaskStatus = js.native
    def getAppTask(taskID: Double, requestOptions: RequestOptions): ReadonlyPromiseTaskStatus = js.native
    
    def getDictionarySettings(): ReadonlyPromiseGetDiction = js.native
    def getDictionarySettings(requestOptions: RequestOptions): ReadonlyPromiseGetDiction = js.native
    
    def getLogs(): ReadonlyPromiseGetLogsRes = js.native
    def getLogs(requestOptions: RequestOptions): ReadonlyPromiseGetLogsRes = js.native
    
    def getSecuredApiKeyRemainingValidity(securedApiKey: String): Double = js.native
    
    def getTopUserIDs(): ReadonlyPromiseGetTopUser = js.native
    def getTopUserIDs(requestOptions: RequestOptions): ReadonlyPromiseGetTopUser = js.native
    
    def getUserID(userID: String): ReadonlyPromiseUserIDResp = js.native
    def getUserID(userID: String, requestOptions: RequestOptions): ReadonlyPromiseUserIDResp = js.native
    
    def hasPendingMappings(): ReadonlyPromiseHasPending = js.native
    def hasPendingMappings(requestOptions: HasPendingMappingsOptions & RequestOptions): ReadonlyPromiseHasPending = js.native
    
    def initAnalytics(): AnalyticsClient = js.native
    def initAnalytics(options: InitAnalyticsOptions): AnalyticsClient = js.native
    
    def initIndex(indexName: String): SearchIndex = js.native
    
    def initPersonalization(): PersonalizationClient = js.native
    def initPersonalization(options: InitPersonalizationOptions): PersonalizationClient = js.native
    
    /**
      * @deprecated Use `initPersonalization` instead.
      */
    def initRecommendation(): PersonalizationClient = js.native
    def initRecommendation(options: InitPersonalizationOptions): PersonalizationClient = js.native
    
    def listApiKeys(): ReadonlyPromiseListApiKey = js.native
    def listApiKeys(requestOptions: RequestOptions): ReadonlyPromiseListApiKey = js.native
    
    def listClusters(): ReadonlyPromiseListCluste = js.native
    def listClusters(requestOptions: RequestOptions): ReadonlyPromiseListCluste = js.native
    
    def listIndices(): ReadonlyPromiseListIndice = js.native
    def listIndices(requestOptions: RequestOptions): ReadonlyPromiseListIndice = js.native
    
    def listUserIDs(): ReadonlyPromiseListUserID = js.native
    def listUserIDs(requestOptions: ListUserIDsOptions & RequestOptions): ReadonlyPromiseListUserID = js.native
    
    def moveIndex(from: String, to: String): ReadonlyWaitablePromiseIn = js.native
    def moveIndex(from: String, to: String, requestOptions: RequestOptions): ReadonlyWaitablePromiseIn = js.native
    
    def multipleBatch(requests: js.Array[MultipleBatchRequest]): ReadonlyWaitablePromiseMu = js.native
    def multipleBatch(requests: js.Array[MultipleBatchRequest], requestOptions: RequestOptions): ReadonlyWaitablePromiseMu = js.native
    
    def multipleGetObjects[TObject](requests: js.Array[MultipleGetObject]): js.Promise[MultipleGetObjectsResponse[TObject]] = js.native
    def multipleGetObjects[TObject](requests: js.Array[MultipleGetObject], requestOptions: RequestOptions): js.Promise[MultipleGetObjectsResponse[TObject]] = js.native
    
    def multipleQueries[TObject](queries: js.Array[MultipleQueriesQuery]): js.Promise[MultipleQueriesResponse[TObject]] = js.native
    def multipleQueries[TObject](queries: js.Array[MultipleQueriesQuery], requestOptions: RequestOptions & MultipleQueriesOptions): js.Promise[MultipleQueriesResponse[TObject]] = js.native
    
    def multipleSearchForFacetValues(queries: js.Array[IndexName]): ReadonlyPromiseArraySearc = js.native
    def multipleSearchForFacetValues(queries: js.Array[IndexName], requestOptions: RequestOptions): ReadonlyPromiseArraySearc = js.native
    
    def removeUserID(userID: String): ReadonlyPromiseRemoveUser = js.native
    def removeUserID(userID: String, requestOptions: RequestOptions): ReadonlyPromiseRemoveUser = js.native
    
    def replaceDictionaryEntries(dictionary: DictionaryName, entries: js.Array[DictionaryEntry]): ReadonlyWaitablePromiseDi = js.native
    def replaceDictionaryEntries(
      dictionary: DictionaryName,
      entries: js.Array[DictionaryEntry],
      requestOptions: RequestOptions & DictionaryEntriesOptions
    ): ReadonlyWaitablePromiseDi = js.native
    
    def restoreApiKey(apiKey: String): ReadonlyWaitablePromiseRe = js.native
    def restoreApiKey(apiKey: String, requestOptions: RequestOptions): ReadonlyWaitablePromiseRe = js.native
    
    def saveDictionaryEntries(dictionary: DictionaryName, entries: js.Array[DictionaryEntry]): ReadonlyWaitablePromiseDi = js.native
    def saveDictionaryEntries(
      dictionary: DictionaryName,
      entries: js.Array[DictionaryEntry],
      requestOptions: RequestOptions & DictionaryEntriesOptions
    ): ReadonlyWaitablePromiseDi = js.native
    
    def search[TObject](queries: js.Array[MultipleQueriesQuery]): js.Promise[MultipleQueriesResponse[TObject]] = js.native
    def search[TObject](queries: js.Array[MultipleQueriesQuery], requestOptions: RequestOptions & MultipleQueriesOptions): js.Promise[MultipleQueriesResponse[TObject]] = js.native
    
    def searchDictionaryEntries(dictionary: DictionaryName, query: String): ReadonlyPromiseSearchDict = js.native
    def searchDictionaryEntries(dictionary: DictionaryName, query: String, requestOptions: RequestOptions): ReadonlyPromiseSearchDict = js.native
    
    def searchForFacetValues(queries: js.Array[IndexName]): ReadonlyPromiseArraySearc = js.native
    def searchForFacetValues(queries: js.Array[IndexName], requestOptions: RequestOptions): ReadonlyPromiseArraySearc = js.native
    
    def searchUserIDs(query: String): ReadonlyPromiseSearchUser = js.native
    def searchUserIDs(query: String, requestOptions: SearchUserIDsOptions & RequestOptions): ReadonlyPromiseSearchUser = js.native
    
    def setDictionarySettings(settings: DictionarySettings): ReadonlyWaitablePromiseDi = js.native
    def setDictionarySettings(settings: DictionarySettings, requestOptions: RequestOptions): ReadonlyWaitablePromiseDi = js.native
    
    def updateApiKey(apiKey: String): ReadonlyWaitablePromiseUp = js.native
    def updateApiKey(apiKey: String, requestOptions: UpdateApiKeyOptionsPickRe): ReadonlyWaitablePromiseUp = js.native
  }
  
  @js.native
  trait SearchIndex
    extends StObject
       with typingsJapgolly.algoliaClientSearch.mod.SearchIndex {
    
    def batch(requests: js.Array[BatchRequest]): ReadonlyWaitablePromiseBa = js.native
    def batch(requests: js.Array[BatchRequest], requestOptions: RequestOptions): ReadonlyWaitablePromiseBa = js.native
    
    def browseObjects[TObject](): ReadonlyPromisevoid = js.native
    def browseObjects[TObject](requestOptions: SearchOptions & BrowseOptions[TObject] & RequestOptions): ReadonlyPromisevoid = js.native
    
    def browseRules(): ReadonlyPromisevoid = js.native
    def browseRules(requestOptions: SearchRulesOptions & BrowseOptions[Rule] & RequestOptions): ReadonlyPromisevoid = js.native
    
    def browseSynonyms(): ReadonlyPromisevoid = js.native
    def browseSynonyms(requestOptions: SearchSynonymsOptions & BrowseOptions[Synonym] & RequestOptions): ReadonlyPromisevoid = js.native
    
    def clearObjects(): ReadonlyWaitablePromiseDeCatch = js.native
    def clearObjects(requestOptions: RequestOptions): ReadonlyWaitablePromiseDeCatch = js.native
    
    def clearRules(): ReadonlyWaitablePromiseDeCatch = js.native
    def clearRules(requestOptions: RequestOptions & ClearRulesOptions): ReadonlyWaitablePromiseDeCatch = js.native
    
    def clearSynonyms(): ReadonlyWaitablePromiseDeCatch = js.native
    def clearSynonyms(requestOptions: ClearSynonymsOptions & RequestOptions): ReadonlyWaitablePromiseDeCatch = js.native
    
    def delete(): ReadonlyWaitablePromiseDeCatch = js.native
    def delete(requestOptions: RequestOptions): ReadonlyWaitablePromiseDeCatch = js.native
    
    def deleteBy(filters: DeleteByFiltersOptions): ReadonlyWaitablePromiseDeCatch = js.native
    def deleteBy(filters: DeleteByFiltersOptions, requestOptions: RequestOptions): ReadonlyWaitablePromiseDeCatch = js.native
    
    def deleteObject(objectID: String): ReadonlyWaitablePromiseDeCatch = js.native
    def deleteObject(objectID: String, requestOptions: RequestOptions): ReadonlyWaitablePromiseDeCatch = js.native
    
    def deleteObjects(objectIDs: js.Array[String]): ReadonlyWaitablePromiseCh = js.native
    def deleteObjects(objectIDs: js.Array[String], requestOptions: RequestOptions & ChunkOptions): ReadonlyWaitablePromiseCh = js.native
    
    def deleteRule(objectID: String): ReadonlyWaitablePromiseDeCatch = js.native
    def deleteRule(objectID: String, requestOptions: RequestOptions): ReadonlyWaitablePromiseDeCatch = js.native
    
    def deleteSynonym(objectID: String): ReadonlyWaitablePromiseDeCatch = js.native
    def deleteSynonym(objectID: String, requestOptions: DeleteSynonymOptions & RequestOptions): ReadonlyWaitablePromiseDeCatch = js.native
    
    def exists(): ReadonlyPromiseboolean = js.native
    def exists(requestOptions: RequestOptions): ReadonlyPromiseboolean = js.native
    
    def findAnswers[TObject](query: String, queryLanguages: js.Array[String]): js.Promise[FindAnswersResponse[TObject]] = js.native
    def findAnswers[TObject](
      query: String,
      queryLanguages: js.Array[String],
      requestOptions: RequestOptions & FindAnswersOptions
    ): js.Promise[FindAnswersResponse[TObject]] = js.native
    
    def findObject[TObject](callback: js.Function1[/* object */ TObject & ObjectWithObjectID, Boolean]): js.Promise[FindObjectResponse[TObject]] = js.native
    def findObject[TObject](
      callback: js.Function1[/* object */ TObject & ObjectWithObjectID, Boolean],
      requestOptions: FindObjectOptions & RequestOptions
    ): js.Promise[FindObjectResponse[TObject]] = js.native
    
    def getObject[TObject](objectID: String): js.Promise[TObject & ObjectWithObjectID] = js.native
    def getObject[TObject](objectID: String, requestOptions: RequestOptions & GetObjectOptions): js.Promise[TObject & ObjectWithObjectID] = js.native
    
    def getObjectPosition(searchResponse: SearchResponse[js.Object], objectID: String): Double = js.native
    
    def getObjects[TObject](objectIDs: js.Array[String]): js.Promise[GetObjectsResponse[TObject]] = js.native
    def getObjects[TObject](objectIDs: js.Array[String], requestOptions: RequestOptions & GetObjectsOptions): js.Promise[GetObjectsResponse[TObject]] = js.native
    
    def getRule(objectID: String): ReadonlyPromiseRule = js.native
    def getRule(objectID: String, requestOptions: RequestOptions): ReadonlyPromiseRule = js.native
    
    def getSettings(): ReadonlyPromiseSettings = js.native
    def getSettings(requestOptions: RequestOptions): ReadonlyPromiseSettings = js.native
    
    def getSynonym(objectID: String): ReadonlyPromiseSynonym = js.native
    def getSynonym(objectID: String, requestOptions: RequestOptions): ReadonlyPromiseSynonym = js.native
    
    def partialUpdateObject(`object`: Record[String, Any]): ReadonlyWaitablePromisePa = js.native
    def partialUpdateObject(
      `object`: Record[String, Any],
      requestOptions: RequestOptions & ChunkOptions & PartialUpdateObjectsOptions
    ): ReadonlyWaitablePromisePa = js.native
    
    def partialUpdateObjects(objects: js.Array[Record[String, Any]]): ReadonlyWaitablePromiseCh = js.native
    def partialUpdateObjects(
      objects: js.Array[Record[String, Any]],
      requestOptions: RequestOptions & ChunkOptions & PartialUpdateObjectsOptions
    ): ReadonlyWaitablePromiseCh = js.native
    
    def replaceAllObjects(objects: js.Array[Record[String, Any]]): ReadonlyWaitablePromiseCh = js.native
    def replaceAllObjects(
      objects: js.Array[Record[String, Any]],
      requestOptions: ReplaceAllObjectsOptions & ChunkOptions & SaveObjectsOptions & RequestOptions
    ): ReadonlyWaitablePromiseCh = js.native
    
    def replaceAllRules(rules: js.Array[Rule]): ReadonlyWaitablePromiseSaWait = js.native
    def replaceAllRules(rules: js.Array[Rule], requestOptions: RequestOptions & SaveRulesOptions): ReadonlyWaitablePromiseSaWait = js.native
    
    def replaceAllSynonyms(synonyms: js.Array[Synonym]): ReadonlyWaitablePromiseSaFinally = js.native
    def replaceAllSynonyms(synonyms: js.Array[Synonym], requestOptions: RequestOptionsPickSaveSyn): ReadonlyWaitablePromiseSaFinally = js.native
    
    def saveObject(`object`: Record[String, Any]): ReadonlyWaitablePromiseSa = js.native
    def saveObject(`object`: Record[String, Any], requestOptions: RequestOptions & ChunkOptions & SaveObjectsOptions): ReadonlyWaitablePromiseSa = js.native
    
    def saveObjects(objects: js.Array[Record[String, Any]]): ReadonlyWaitablePromiseCh = js.native
    def saveObjects(
      objects: js.Array[Record[String, Any]],
      requestOptions: RequestOptions & ChunkOptions & SaveObjectsOptions
    ): ReadonlyWaitablePromiseCh = js.native
    
    def saveRule(rule: Rule): ReadonlyWaitablePromiseSaThen = js.native
    def saveRule(rule: Rule, requestOptions: RequestOptions & SaveRulesOptions): ReadonlyWaitablePromiseSaThen = js.native
    
    def saveRules(rules: js.Array[Rule]): ReadonlyWaitablePromiseSaWait = js.native
    def saveRules(rules: js.Array[Rule], requestOptions: RequestOptions & SaveRulesOptions): ReadonlyWaitablePromiseSaWait = js.native
    
    def saveSynonym(synonym: Synonym): ReadonlyWaitablePromiseSaCatch = js.native
    def saveSynonym(synonym: Synonym, requestOptions: RequestOptions & SaveSynonymsOptions): ReadonlyWaitablePromiseSaCatch = js.native
    
    def saveSynonyms(synonyms: js.Array[Synonym]): ReadonlyWaitablePromiseSaFinally = js.native
    def saveSynonyms(synonyms: js.Array[Synonym], requestOptions: SaveSynonymsOptions & RequestOptions): ReadonlyWaitablePromiseSaFinally = js.native
    
    def search[TObject](query: String): js.Promise[SearchResponse[TObject]] = js.native
    def search[TObject](query: String, requestOptions: RequestOptions & SearchOptions): js.Promise[SearchResponse[TObject]] = js.native
    
    def searchForFacetValues(facetName: String, facetQuery: String): ReadonlyPromiseSearchForF = js.native
    def searchForFacetValues(facetName: String, facetQuery: String, requestOptions: RequestOptions & SearchOptions): ReadonlyPromiseSearchForF = js.native
    
    def searchRules(query: String): ReadonlyPromiseSearchResp = js.native
    def searchRules(query: String, requestOptions: RequestOptions & SearchRulesOptions): ReadonlyPromiseSearchResp = js.native
    
    def searchSynonyms(query: String): ReadonlyPromiseSearchSyno = js.native
    def searchSynonyms(query: String, requestOptions: SearchSynonymsOptions & RequestOptions): ReadonlyPromiseSearchSyno = js.native
    
    def setSettings(settings: Settings): ReadonlyWaitablePromiseSe = js.native
    def setSettings(settings: Settings, requestOptions: RequestOptions): ReadonlyWaitablePromiseSe = js.native
    
    def waitTask(taskID: Double): ReadonlyPromisevoid = js.native
    def waitTask(taskID: Double, requestOptions: RequestOptions): ReadonlyPromisevoid = js.native
  }
  
  type WithoutCredentials[TClientOptions /* <: Credentials */] = Omit[
    TClientOptions, 
    /* keyof algoliasearch.algoliasearch/dist/algoliasearch.Credentials */ appId | apiKey
  ]
}
