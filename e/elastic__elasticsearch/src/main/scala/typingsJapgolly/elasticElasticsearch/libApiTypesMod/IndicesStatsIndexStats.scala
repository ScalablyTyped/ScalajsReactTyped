package typingsJapgolly.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesStatsIndexStats extends StObject {
  
  var bulk: js.UndefOr[BulkStats] = js.undefined
  
  var completion: js.UndefOr[CompletionStats] = js.undefined
  
  var docs: js.UndefOr[DocStats] = js.undefined
  
  var fielddata: js.UndefOr[FielddataStats] = js.undefined
  
  var flush: js.UndefOr[FlushStats] = js.undefined
  
  var get: js.UndefOr[GetStats] = js.undefined
  
  var indexing: js.UndefOr[IndexingStats] = js.undefined
  
  var indices: js.UndefOr[IndicesStatsIndicesStats] = js.undefined
  
  var merges: js.UndefOr[MergesStats] = js.undefined
  
  var query_cache: js.UndefOr[QueryCacheStats] = js.undefined
  
  var recovery: js.UndefOr[RecoveryStats] = js.undefined
  
  var refresh: js.UndefOr[RefreshStats] = js.undefined
  
  var request_cache: js.UndefOr[RequestCacheStats] = js.undefined
  
  var search: js.UndefOr[SearchStats] = js.undefined
  
  var segments: js.UndefOr[SegmentsStats] = js.undefined
  
  var shard_stats: js.UndefOr[IndicesStatsShardsTotalStats] = js.undefined
  
  var store: js.UndefOr[StoreStats] = js.undefined
  
  var translog: js.UndefOr[TranslogStats] = js.undefined
  
  var warmer: js.UndefOr[WarmerStats] = js.undefined
}
object IndicesStatsIndexStats {
  
  inline def apply(): IndicesStatsIndexStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndicesStatsIndexStats]
  }
  
  extension [Self <: IndicesStatsIndexStats](x: Self) {
    
    inline def setBulk(value: BulkStats): Self = StObject.set(x, "bulk", value.asInstanceOf[js.Any])
    
    inline def setBulkUndefined: Self = StObject.set(x, "bulk", js.undefined)
    
    inline def setCompletion(value: CompletionStats): Self = StObject.set(x, "completion", value.asInstanceOf[js.Any])
    
    inline def setCompletionUndefined: Self = StObject.set(x, "completion", js.undefined)
    
    inline def setDocs(value: DocStats): Self = StObject.set(x, "docs", value.asInstanceOf[js.Any])
    
    inline def setDocsUndefined: Self = StObject.set(x, "docs", js.undefined)
    
    inline def setFielddata(value: FielddataStats): Self = StObject.set(x, "fielddata", value.asInstanceOf[js.Any])
    
    inline def setFielddataUndefined: Self = StObject.set(x, "fielddata", js.undefined)
    
    inline def setFlush(value: FlushStats): Self = StObject.set(x, "flush", value.asInstanceOf[js.Any])
    
    inline def setFlushUndefined: Self = StObject.set(x, "flush", js.undefined)
    
    inline def setGet(value: GetStats): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setGetUndefined: Self = StObject.set(x, "get", js.undefined)
    
    inline def setIndexing(value: IndexingStats): Self = StObject.set(x, "indexing", value.asInstanceOf[js.Any])
    
    inline def setIndexingUndefined: Self = StObject.set(x, "indexing", js.undefined)
    
    inline def setIndices(value: IndicesStatsIndicesStats): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    
    inline def setIndicesUndefined: Self = StObject.set(x, "indices", js.undefined)
    
    inline def setMerges(value: MergesStats): Self = StObject.set(x, "merges", value.asInstanceOf[js.Any])
    
    inline def setMergesUndefined: Self = StObject.set(x, "merges", js.undefined)
    
    inline def setQuery_cache(value: QueryCacheStats): Self = StObject.set(x, "query_cache", value.asInstanceOf[js.Any])
    
    inline def setQuery_cacheUndefined: Self = StObject.set(x, "query_cache", js.undefined)
    
    inline def setRecovery(value: RecoveryStats): Self = StObject.set(x, "recovery", value.asInstanceOf[js.Any])
    
    inline def setRecoveryUndefined: Self = StObject.set(x, "recovery", js.undefined)
    
    inline def setRefresh(value: RefreshStats): Self = StObject.set(x, "refresh", value.asInstanceOf[js.Any])
    
    inline def setRefreshUndefined: Self = StObject.set(x, "refresh", js.undefined)
    
    inline def setRequest_cache(value: RequestCacheStats): Self = StObject.set(x, "request_cache", value.asInstanceOf[js.Any])
    
    inline def setRequest_cacheUndefined: Self = StObject.set(x, "request_cache", js.undefined)
    
    inline def setSearch(value: SearchStats): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    
    inline def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
    
    inline def setSegments(value: SegmentsStats): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
    
    inline def setSegmentsUndefined: Self = StObject.set(x, "segments", js.undefined)
    
    inline def setShard_stats(value: IndicesStatsShardsTotalStats): Self = StObject.set(x, "shard_stats", value.asInstanceOf[js.Any])
    
    inline def setShard_statsUndefined: Self = StObject.set(x, "shard_stats", js.undefined)
    
    inline def setStore(value: StoreStats): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
    
    inline def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
    
    inline def setTranslog(value: TranslogStats): Self = StObject.set(x, "translog", value.asInstanceOf[js.Any])
    
    inline def setTranslogUndefined: Self = StObject.set(x, "translog", js.undefined)
    
    inline def setWarmer(value: WarmerStats): Self = StObject.set(x, "warmer", value.asInstanceOf[js.Any])
    
    inline def setWarmerUndefined: Self = StObject.set(x, "warmer", js.undefined)
  }
}
