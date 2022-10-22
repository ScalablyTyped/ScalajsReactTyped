package typingsJapgolly.mongodb.mod

import typingsJapgolly.bson.mod.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FindOptions[TSchema /* <: Document */]
  extends StObject
     with CommandOperationOptions {
  
  /** Allows disk use for blocking sort operations exceeding 100MB memory. (MongoDB 3.2 or higher) */
  var allowDiskUse: js.UndefOr[Boolean] = js.undefined
  
  /** For queries against a sharded collection, allows the command (or subsequent getMore commands) to return partial results, rather than an error, if one or more queried shards are unavailable. */
  var allowPartialResults: js.UndefOr[Boolean] = js.undefined
  
  /** Specify if the cursor is a tailable-await cursor. Requires `tailable` to be true */
  var awaitData: js.UndefOr[Boolean] = js.undefined
  
  /** Set the batchSize for the getMoreCommand when iterating over the query results. */
  var batchSize: js.UndefOr[scala.Double] = js.undefined
  
  /** Tell the query to use specific indexes in the query. Object of indexes to use, `{'_id':1}` */
  var hint: js.UndefOr[Hint] = js.undefined
  
  /** Map of parameter names and values that can be accessed using $$var (requires MongoDB 5.0). */
  var let: js.UndefOr[Document] = js.undefined
  
  /** Sets the limit of documents returned in the query. */
  var limit: js.UndefOr[scala.Double] = js.undefined
  
  /** The exclusive upper bound for a specific index */
  var max: js.UndefOr[Document] = js.undefined
  
  /** The maximum amount of time for the server to wait on new documents to satisfy a tailable cursor query. Requires `tailable` and `awaitData` to be true */
  var maxAwaitTimeMS: js.UndefOr[scala.Double] = js.undefined
  
  /** The inclusive lower bound for a specific index */
  var min: js.UndefOr[Document] = js.undefined
  
  /** The server normally times out idle cursors after an inactivity period (10 minutes) to prevent excess memory use. Set this option to prevent that. */
  var noCursorTimeout: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Option to enable an optimized code path for queries looking for a particular range of `ts` values in the oplog. Requires `tailable` to be true.
    * @deprecated Starting from MongoDB 4.4 this flag is not needed and will be ignored.
    */
  var oplogReplay: js.UndefOr[Boolean] = js.undefined
  
  /** The fields to return in the query. Object of fields to either include or exclude (one of, not both), `{'a':1, 'b': 1}` **or** `{'a': 0, 'b': 0}` */
  var projection: js.UndefOr[Document] = js.undefined
  
  /** If true, returns only the index keys in the resulting documents. */
  var returnKey: js.UndefOr[Boolean] = js.undefined
  
  /** Determines whether to return the record identifier for each document. If true, adds a field $recordId to the returned documents. */
  var showRecordId: js.UndefOr[Boolean] = js.undefined
  
  /** Determines whether to close the cursor after the first batch. Defaults to false. */
  var singleBatch: js.UndefOr[Boolean] = js.undefined
  
  /** Set to skip N documents ahead in your query (useful for pagination). */
  var skip: js.UndefOr[scala.Double] = js.undefined
  
  /** Set to sort the documents coming back from the query. Array of indexes, `[['a', 1]]` etc. */
  var sort: js.UndefOr[Sort] = js.undefined
  
  /** Specify if the cursor is tailable. */
  var tailable: js.UndefOr[Boolean] = js.undefined
  
  /** Specify if the cursor can timeout. */
  var timeout: js.UndefOr[Boolean] = js.undefined
}
object FindOptions {
  
  inline def apply[TSchema /* <: Document */](): FindOptions[TSchema] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindOptions[TSchema]]
  }
  
  extension [Self <: FindOptions[?], TSchema /* <: Document */](x: Self & FindOptions[TSchema]) {
    
    inline def setAllowDiskUse(value: Boolean): Self = StObject.set(x, "allowDiskUse", value.asInstanceOf[js.Any])
    
    inline def setAllowDiskUseUndefined: Self = StObject.set(x, "allowDiskUse", js.undefined)
    
    inline def setAllowPartialResults(value: Boolean): Self = StObject.set(x, "allowPartialResults", value.asInstanceOf[js.Any])
    
    inline def setAllowPartialResultsUndefined: Self = StObject.set(x, "allowPartialResults", js.undefined)
    
    inline def setAwaitData(value: Boolean): Self = StObject.set(x, "awaitData", value.asInstanceOf[js.Any])
    
    inline def setAwaitDataUndefined: Self = StObject.set(x, "awaitData", js.undefined)
    
    inline def setBatchSize(value: scala.Double): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
    
    inline def setBatchSizeUndefined: Self = StObject.set(x, "batchSize", js.undefined)
    
    inline def setHint(value: Hint): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
    
    inline def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
    
    inline def setLet(value: Document): Self = StObject.set(x, "let", value.asInstanceOf[js.Any])
    
    inline def setLetUndefined: Self = StObject.set(x, "let", js.undefined)
    
    inline def setLimit(value: scala.Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setMax(value: Document): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxAwaitTimeMS(value: scala.Double): Self = StObject.set(x, "maxAwaitTimeMS", value.asInstanceOf[js.Any])
    
    inline def setMaxAwaitTimeMSUndefined: Self = StObject.set(x, "maxAwaitTimeMS", js.undefined)
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Document): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setNoCursorTimeout(value: Boolean): Self = StObject.set(x, "noCursorTimeout", value.asInstanceOf[js.Any])
    
    inline def setNoCursorTimeoutUndefined: Self = StObject.set(x, "noCursorTimeout", js.undefined)
    
    inline def setOplogReplay(value: Boolean): Self = StObject.set(x, "oplogReplay", value.asInstanceOf[js.Any])
    
    inline def setOplogReplayUndefined: Self = StObject.set(x, "oplogReplay", js.undefined)
    
    inline def setProjection(value: Document): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
    
    inline def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
    
    inline def setReturnKey(value: Boolean): Self = StObject.set(x, "returnKey", value.asInstanceOf[js.Any])
    
    inline def setReturnKeyUndefined: Self = StObject.set(x, "returnKey", js.undefined)
    
    inline def setShowRecordId(value: Boolean): Self = StObject.set(x, "showRecordId", value.asInstanceOf[js.Any])
    
    inline def setShowRecordIdUndefined: Self = StObject.set(x, "showRecordId", js.undefined)
    
    inline def setSingleBatch(value: Boolean): Self = StObject.set(x, "singleBatch", value.asInstanceOf[js.Any])
    
    inline def setSingleBatchUndefined: Self = StObject.set(x, "singleBatch", js.undefined)
    
    inline def setSkip(value: scala.Double): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
    
    inline def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
    
    inline def setSort(value: Sort): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    inline def setSortVarargs(value: (String | (js.Tuple2[String, SortDirection]))*): Self = StObject.set(x, "sort", js.Array(value*))
    
    inline def setTailable(value: Boolean): Self = StObject.set(x, "tailable", value.asInstanceOf[js.Any])
    
    inline def setTailableUndefined: Self = StObject.set(x, "tailable", js.undefined)
    
    inline def setTimeout(value: Boolean): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
