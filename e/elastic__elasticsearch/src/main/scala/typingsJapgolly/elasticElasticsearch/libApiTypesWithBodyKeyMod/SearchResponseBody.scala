package typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchResponseBody[TDocument, TAggregations] extends StObject {
  
  var _clusters: js.UndefOr[ClusterStatistics] = js.undefined
  
  var _scroll_id: js.UndefOr[ScrollId] = js.undefined
  
  var _shards: ShardStatistics
  
  var aggregations: js.UndefOr[TAggregations] = js.undefined
  
  var fields: js.UndefOr[Record[String, Any]] = js.undefined
  
  var hits: SearchHitsMetadata[TDocument]
  
  var max_score: js.UndefOr[double] = js.undefined
  
  var num_reduce_phases: js.UndefOr[long] = js.undefined
  
  var pit_id: js.UndefOr[Id] = js.undefined
  
  var profile: js.UndefOr[SearchProfile] = js.undefined
  
  var suggest: js.UndefOr[Record[SuggestionName, js.Array[SearchSuggest[TDocument]]]] = js.undefined
  
  var terminated_early: js.UndefOr[Boolean] = js.undefined
  
  var timed_out: Boolean
  
  var took: long
}
object SearchResponseBody {
  
  inline def apply[TDocument, TAggregations](_shards: ShardStatistics, hits: SearchHitsMetadata[TDocument], timed_out: Boolean, took: long): SearchResponseBody[TDocument, TAggregations] = {
    val __obj = js.Dynamic.literal(_shards = _shards.asInstanceOf[js.Any], hits = hits.asInstanceOf[js.Any], timed_out = timed_out.asInstanceOf[js.Any], took = took.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchResponseBody[TDocument, TAggregations]]
  }
  
  extension [Self <: SearchResponseBody[?, ?], TDocument, TAggregations](x: Self & (SearchResponseBody[TDocument, TAggregations])) {
    
    inline def setAggregations(value: TAggregations): Self = StObject.set(x, "aggregations", value.asInstanceOf[js.Any])
    
    inline def setAggregationsUndefined: Self = StObject.set(x, "aggregations", js.undefined)
    
    inline def setFields(value: Record[String, Any]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setHits(value: SearchHitsMetadata[TDocument]): Self = StObject.set(x, "hits", value.asInstanceOf[js.Any])
    
    inline def setMax_score(value: double): Self = StObject.set(x, "max_score", value.asInstanceOf[js.Any])
    
    inline def setMax_scoreUndefined: Self = StObject.set(x, "max_score", js.undefined)
    
    inline def setNum_reduce_phases(value: long): Self = StObject.set(x, "num_reduce_phases", value.asInstanceOf[js.Any])
    
    inline def setNum_reduce_phasesUndefined: Self = StObject.set(x, "num_reduce_phases", js.undefined)
    
    inline def setPit_id(value: Id): Self = StObject.set(x, "pit_id", value.asInstanceOf[js.Any])
    
    inline def setPit_idUndefined: Self = StObject.set(x, "pit_id", js.undefined)
    
    inline def setProfile(value: SearchProfile): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    
    inline def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
    
    inline def setSuggest(value: Record[SuggestionName, js.Array[SearchSuggest[TDocument]]]): Self = StObject.set(x, "suggest", value.asInstanceOf[js.Any])
    
    inline def setSuggestUndefined: Self = StObject.set(x, "suggest", js.undefined)
    
    inline def setTerminated_early(value: Boolean): Self = StObject.set(x, "terminated_early", value.asInstanceOf[js.Any])
    
    inline def setTerminated_earlyUndefined: Self = StObject.set(x, "terminated_early", js.undefined)
    
    inline def setTimed_out(value: Boolean): Self = StObject.set(x, "timed_out", value.asInstanceOf[js.Any])
    
    inline def setTook(value: long): Self = StObject.set(x, "took", value.asInstanceOf[js.Any])
    
    inline def set_clusters(value: ClusterStatistics): Self = StObject.set(x, "_clusters", value.asInstanceOf[js.Any])
    
    inline def set_clustersUndefined: Self = StObject.set(x, "_clusters", js.undefined)
    
    inline def set_scroll_id(value: ScrollId): Self = StObject.set(x, "_scroll_id", value.asInstanceOf[js.Any])
    
    inline def set_scroll_idUndefined: Self = StObject.set(x, "_scroll_id", js.undefined)
    
    inline def set_shards(value: ShardStatistics): Self = StObject.set(x, "_shards", value.asInstanceOf[js.Any])
  }
}
