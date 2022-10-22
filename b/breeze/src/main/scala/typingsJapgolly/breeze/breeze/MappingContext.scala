package typingsJapgolly.breeze.breeze

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MappingContext extends StObject {
  
  var dataService: DataService
  
  var deferredFns: js.Array[Any]
  
  var entityManager: EntityManager
  
  def getUrl(): String
  
  var jsonResultsAdapter: JsonResultsAdapter
  
  var mergeOptions: MergeOptions
  
  var metadataStore: MetadataStore
  
  def processDeferred(): Unit
  
  var query: EntityQuery | String
  
  def rawValueFn(rawEntity: Any, dp: Any): Any
  
  var url: String
  
  def visitAndMerge(nodes: js.Array[Any], nodeContext: NodeContext): js.Array[Any]
}
object MappingContext {
  
  inline def apply(
    dataService: DataService,
    deferredFns: js.Array[Any],
    entityManager: EntityManager,
    getUrl: CallbackTo[String],
    jsonResultsAdapter: JsonResultsAdapter,
    mergeOptions: MergeOptions,
    metadataStore: MetadataStore,
    processDeferred: Callback,
    query: EntityQuery | String,
    rawValueFn: (Any, Any) => Any,
    url: String,
    visitAndMerge: (js.Array[Any], NodeContext) => js.Array[Any]
  ): MappingContext = {
    val __obj = js.Dynamic.literal(dataService = dataService.asInstanceOf[js.Any], deferredFns = deferredFns.asInstanceOf[js.Any], entityManager = entityManager.asInstanceOf[js.Any], getUrl = getUrl.toJsFn, jsonResultsAdapter = jsonResultsAdapter.asInstanceOf[js.Any], mergeOptions = mergeOptions.asInstanceOf[js.Any], metadataStore = metadataStore.asInstanceOf[js.Any], processDeferred = processDeferred.toJsFn, query = query.asInstanceOf[js.Any], rawValueFn = js.Any.fromFunction2(rawValueFn), url = url.asInstanceOf[js.Any], visitAndMerge = js.Any.fromFunction2(visitAndMerge))
    __obj.asInstanceOf[MappingContext]
  }
  
  extension [Self <: MappingContext](x: Self) {
    
    inline def setDataService(value: DataService): Self = StObject.set(x, "dataService", value.asInstanceOf[js.Any])
    
    inline def setDeferredFns(value: js.Array[Any]): Self = StObject.set(x, "deferredFns", value.asInstanceOf[js.Any])
    
    inline def setDeferredFnsVarargs(value: Any*): Self = StObject.set(x, "deferredFns", js.Array(value*))
    
    inline def setEntityManager(value: EntityManager): Self = StObject.set(x, "entityManager", value.asInstanceOf[js.Any])
    
    inline def setGetUrl(value: CallbackTo[String]): Self = StObject.set(x, "getUrl", value.toJsFn)
    
    inline def setJsonResultsAdapter(value: JsonResultsAdapter): Self = StObject.set(x, "jsonResultsAdapter", value.asInstanceOf[js.Any])
    
    inline def setMergeOptions(value: MergeOptions): Self = StObject.set(x, "mergeOptions", value.asInstanceOf[js.Any])
    
    inline def setMetadataStore(value: MetadataStore): Self = StObject.set(x, "metadataStore", value.asInstanceOf[js.Any])
    
    inline def setProcessDeferred(value: Callback): Self = StObject.set(x, "processDeferred", value.toJsFn)
    
    inline def setQuery(value: EntityQuery | String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setRawValueFn(value: (Any, Any) => Any): Self = StObject.set(x, "rawValueFn", js.Any.fromFunction2(value))
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setVisitAndMerge(value: (js.Array[Any], NodeContext) => js.Array[Any]): Self = StObject.set(x, "visitAndMerge", js.Any.fromFunction2(value))
  }
}
