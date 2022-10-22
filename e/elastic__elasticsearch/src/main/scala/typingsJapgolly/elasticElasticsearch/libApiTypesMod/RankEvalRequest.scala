package typingsJapgolly.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RankEvalRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var allow_no_indices: js.UndefOr[Boolean] = js.undefined
  
  var expand_wildcards: js.UndefOr[ExpandWildcards] = js.undefined
  
  var ignore_unavailable: js.UndefOr[Boolean] = js.undefined
  
  var index: Indices
  
  var metric: js.UndefOr[RankEvalRankEvalMetric] = js.undefined
  
  var requests: js.Array[RankEvalRankEvalRequestItem]
  
  var search_type: js.UndefOr[String] = js.undefined
}
object RankEvalRequest {
  
  inline def apply(index: Indices, requests: js.Array[RankEvalRankEvalRequestItem]): RankEvalRequest = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], requests = requests.asInstanceOf[js.Any])
    __obj.asInstanceOf[RankEvalRequest]
  }
  
  extension [Self <: RankEvalRequest](x: Self) {
    
    inline def setAllow_no_indices(value: Boolean): Self = StObject.set(x, "allow_no_indices", value.asInstanceOf[js.Any])
    
    inline def setAllow_no_indicesUndefined: Self = StObject.set(x, "allow_no_indices", js.undefined)
    
    inline def setExpand_wildcards(value: ExpandWildcards): Self = StObject.set(x, "expand_wildcards", value.asInstanceOf[js.Any])
    
    inline def setExpand_wildcardsUndefined: Self = StObject.set(x, "expand_wildcards", js.undefined)
    
    inline def setExpand_wildcardsVarargs(value: ExpandWildcard*): Self = StObject.set(x, "expand_wildcards", js.Array(value*))
    
    inline def setIgnore_unavailable(value: Boolean): Self = StObject.set(x, "ignore_unavailable", value.asInstanceOf[js.Any])
    
    inline def setIgnore_unavailableUndefined: Self = StObject.set(x, "ignore_unavailable", js.undefined)
    
    inline def setIndex(value: Indices): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexVarargs(value: IndexName*): Self = StObject.set(x, "index", js.Array(value*))
    
    inline def setMetric(value: RankEvalRankEvalMetric): Self = StObject.set(x, "metric", value.asInstanceOf[js.Any])
    
    inline def setMetricUndefined: Self = StObject.set(x, "metric", js.undefined)
    
    inline def setRequests(value: js.Array[RankEvalRankEvalRequestItem]): Self = StObject.set(x, "requests", value.asInstanceOf[js.Any])
    
    inline def setRequestsVarargs(value: RankEvalRankEvalRequestItem*): Self = StObject.set(x, "requests", js.Array(value*))
    
    inline def setSearch_type(value: String): Self = StObject.set(x, "search_type", value.asInstanceOf[js.Any])
    
    inline def setSearch_typeUndefined: Self = StObject.set(x, "search_type", js.undefined)
  }
}
