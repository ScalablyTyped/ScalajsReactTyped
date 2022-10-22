package typingsJapgolly.elasticsearch.mod

import typingsJapgolly.elasticsearch.elasticsearchStrings.dfs_query_then_fetch
import typingsJapgolly.elasticsearch.elasticsearchStrings.query_then_fetch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDocumentByQueryParams
  extends StObject
     with GenericParams {
  
  var _source: js.UndefOr[NameList] = js.undefined
  
  var _sourceExclude: js.UndefOr[NameList] = js.undefined
  
  var _sourceInclude: js.UndefOr[NameList] = js.undefined
  
  var allowNoIndices: js.UndefOr[Boolean] = js.undefined
  
  var analyzeWildcard: js.UndefOr[Boolean] = js.undefined
  
  var analyzer: js.UndefOr[String] = js.undefined
  
  var conflicts: js.UndefOr[Conflicts] = js.undefined
  
  var defaultOperator: js.UndefOr[DefaultOperator] = js.undefined
  
  var df: js.UndefOr[String] = js.undefined
  
  var expandWildcards: js.UndefOr[ExpandWildcards] = js.undefined
  
  var from: js.UndefOr[Double] = js.undefined
  
  var ignoreUnavailable: js.UndefOr[Boolean] = js.undefined
  
  var index: js.UndefOr[String] = js.undefined
  
  var lenient: js.UndefOr[Boolean] = js.undefined
  
  var lowercaseExpandedTerms: js.UndefOr[Boolean] = js.undefined
  
  var preference: js.UndefOr[String] = js.undefined
  
  var q: js.UndefOr[String] = js.undefined
  
  var refresh: js.UndefOr[Refresh] = js.undefined
  
  var requestCache: js.UndefOr[Boolean] = js.undefined
  
  var requestsPerSecond: js.UndefOr[Double] = js.undefined
  
  var routing: js.UndefOr[String | js.Array[String] | Boolean] = js.undefined
  
  var scroll: js.UndefOr[String] = js.undefined
  
  var scrollSize: js.UndefOr[Double] = js.undefined
  
  var searchTimeout: js.UndefOr[TimeSpan] = js.undefined
  
  var searchType: js.UndefOr[query_then_fetch | dfs_query_then_fetch] = js.undefined
  
  var size: js.UndefOr[Double] = js.undefined
  
  var slices: js.UndefOr[Double] = js.undefined
  
  var sort: js.UndefOr[NameList] = js.undefined
  
  var stats: js.UndefOr[String | js.Array[String] | Boolean] = js.undefined
  
  var terminateAfter: js.UndefOr[Double] = js.undefined
  
  var timeout: js.UndefOr[TimeSpan] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
  
  var version: js.UndefOr[Double] = js.undefined
  
  var waitForActiveShards: js.UndefOr[String] = js.undefined
  
  var waitForCompletion: js.UndefOr[Boolean] = js.undefined
}
object DeleteDocumentByQueryParams {
  
  inline def apply(): DeleteDocumentByQueryParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteDocumentByQueryParams]
  }
  
  extension [Self <: DeleteDocumentByQueryParams](x: Self) {
    
    inline def setAllowNoIndices(value: Boolean): Self = StObject.set(x, "allowNoIndices", value.asInstanceOf[js.Any])
    
    inline def setAllowNoIndicesUndefined: Self = StObject.set(x, "allowNoIndices", js.undefined)
    
    inline def setAnalyzeWildcard(value: Boolean): Self = StObject.set(x, "analyzeWildcard", value.asInstanceOf[js.Any])
    
    inline def setAnalyzeWildcardUndefined: Self = StObject.set(x, "analyzeWildcard", js.undefined)
    
    inline def setAnalyzer(value: String): Self = StObject.set(x, "analyzer", value.asInstanceOf[js.Any])
    
    inline def setAnalyzerUndefined: Self = StObject.set(x, "analyzer", js.undefined)
    
    inline def setConflicts(value: Conflicts): Self = StObject.set(x, "conflicts", value.asInstanceOf[js.Any])
    
    inline def setConflictsUndefined: Self = StObject.set(x, "conflicts", js.undefined)
    
    inline def setDefaultOperator(value: DefaultOperator): Self = StObject.set(x, "defaultOperator", value.asInstanceOf[js.Any])
    
    inline def setDefaultOperatorUndefined: Self = StObject.set(x, "defaultOperator", js.undefined)
    
    inline def setDf(value: String): Self = StObject.set(x, "df", value.asInstanceOf[js.Any])
    
    inline def setDfUndefined: Self = StObject.set(x, "df", js.undefined)
    
    inline def setExpandWildcards(value: ExpandWildcards): Self = StObject.set(x, "expandWildcards", value.asInstanceOf[js.Any])
    
    inline def setExpandWildcardsUndefined: Self = StObject.set(x, "expandWildcards", js.undefined)
    
    inline def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setIgnoreUnavailable(value: Boolean): Self = StObject.set(x, "ignoreUnavailable", value.asInstanceOf[js.Any])
    
    inline def setIgnoreUnavailableUndefined: Self = StObject.set(x, "ignoreUnavailable", js.undefined)
    
    inline def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setLenient(value: Boolean): Self = StObject.set(x, "lenient", value.asInstanceOf[js.Any])
    
    inline def setLenientUndefined: Self = StObject.set(x, "lenient", js.undefined)
    
    inline def setLowercaseExpandedTerms(value: Boolean): Self = StObject.set(x, "lowercaseExpandedTerms", value.asInstanceOf[js.Any])
    
    inline def setLowercaseExpandedTermsUndefined: Self = StObject.set(x, "lowercaseExpandedTerms", js.undefined)
    
    inline def setPreference(value: String): Self = StObject.set(x, "preference", value.asInstanceOf[js.Any])
    
    inline def setPreferenceUndefined: Self = StObject.set(x, "preference", js.undefined)
    
    inline def setQ(value: String): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
    
    inline def setQUndefined: Self = StObject.set(x, "q", js.undefined)
    
    inline def setRefresh(value: Refresh): Self = StObject.set(x, "refresh", value.asInstanceOf[js.Any])
    
    inline def setRefreshUndefined: Self = StObject.set(x, "refresh", js.undefined)
    
    inline def setRequestCache(value: Boolean): Self = StObject.set(x, "requestCache", value.asInstanceOf[js.Any])
    
    inline def setRequestCacheUndefined: Self = StObject.set(x, "requestCache", js.undefined)
    
    inline def setRequestsPerSecond(value: Double): Self = StObject.set(x, "requestsPerSecond", value.asInstanceOf[js.Any])
    
    inline def setRequestsPerSecondUndefined: Self = StObject.set(x, "requestsPerSecond", js.undefined)
    
    inline def setRouting(value: String | js.Array[String] | Boolean): Self = StObject.set(x, "routing", value.asInstanceOf[js.Any])
    
    inline def setRoutingUndefined: Self = StObject.set(x, "routing", js.undefined)
    
    inline def setRoutingVarargs(value: String*): Self = StObject.set(x, "routing", js.Array(value*))
    
    inline def setScroll(value: String): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
    
    inline def setScrollSize(value: Double): Self = StObject.set(x, "scrollSize", value.asInstanceOf[js.Any])
    
    inline def setScrollSizeUndefined: Self = StObject.set(x, "scrollSize", js.undefined)
    
    inline def setScrollUndefined: Self = StObject.set(x, "scroll", js.undefined)
    
    inline def setSearchTimeout(value: TimeSpan): Self = StObject.set(x, "searchTimeout", value.asInstanceOf[js.Any])
    
    inline def setSearchTimeoutUndefined: Self = StObject.set(x, "searchTimeout", js.undefined)
    
    inline def setSearchType(value: query_then_fetch | dfs_query_then_fetch): Self = StObject.set(x, "searchType", value.asInstanceOf[js.Any])
    
    inline def setSearchTypeUndefined: Self = StObject.set(x, "searchType", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSlices(value: Double): Self = StObject.set(x, "slices", value.asInstanceOf[js.Any])
    
    inline def setSlicesUndefined: Self = StObject.set(x, "slices", js.undefined)
    
    inline def setSort(value: NameList): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    inline def setSortVarargs(value: String*): Self = StObject.set(x, "sort", js.Array(value*))
    
    inline def setStats(value: String | js.Array[String] | Boolean): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    
    inline def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
    
    inline def setStatsVarargs(value: String*): Self = StObject.set(x, "stats", js.Array(value*))
    
    inline def setTerminateAfter(value: Double): Self = StObject.set(x, "terminateAfter", value.asInstanceOf[js.Any])
    
    inline def setTerminateAfterUndefined: Self = StObject.set(x, "terminateAfter", js.undefined)
    
    inline def setTimeout(value: TimeSpan): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def setWaitForActiveShards(value: String): Self = StObject.set(x, "waitForActiveShards", value.asInstanceOf[js.Any])
    
    inline def setWaitForActiveShardsUndefined: Self = StObject.set(x, "waitForActiveShards", js.undefined)
    
    inline def setWaitForCompletion(value: Boolean): Self = StObject.set(x, "waitForCompletion", value.asInstanceOf[js.Any])
    
    inline def setWaitForCompletionUndefined: Self = StObject.set(x, "waitForCompletion", js.undefined)
    
    inline def set_source(value: NameList): Self = StObject.set(x, "_source", value.asInstanceOf[js.Any])
    
    inline def set_sourceExclude(value: NameList): Self = StObject.set(x, "_sourceExclude", value.asInstanceOf[js.Any])
    
    inline def set_sourceExcludeUndefined: Self = StObject.set(x, "_sourceExclude", js.undefined)
    
    inline def set_sourceExcludeVarargs(value: String*): Self = StObject.set(x, "_sourceExclude", js.Array(value*))
    
    inline def set_sourceInclude(value: NameList): Self = StObject.set(x, "_sourceInclude", value.asInstanceOf[js.Any])
    
    inline def set_sourceIncludeUndefined: Self = StObject.set(x, "_sourceInclude", js.undefined)
    
    inline def set_sourceIncludeVarargs(value: String*): Self = StObject.set(x, "_sourceInclude", js.Array(value*))
    
    inline def set_sourceUndefined: Self = StObject.set(x, "_source", js.undefined)
    
    inline def set_sourceVarargs(value: String*): Self = StObject.set(x, "_source", js.Array(value*))
  }
}
