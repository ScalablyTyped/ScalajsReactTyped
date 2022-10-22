package typingsJapgolly.breeze.breeze

import japgolly.scalajs.react.Callback
import typingsJapgolly.breeze.anon.Done
import typingsJapgolly.breeze.anon.InterfaceName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataServiceAdapter extends StObject {
  
  var JsonResultsAdapter: typingsJapgolly.breeze.breeze.JsonResultsAdapter
  
  def _catchNoConnectionError(err: js.Error): Any
  
  def _createChangeRequestInterceptor(saveContext: DataServiceSaveContext, saveBundle: SaveBundle): Done
  
  def _prepareSaveBundle(saveContext: DataServiceSaveContext, saveBundle: SaveBundle): SaveBundle
  
  def _prepareSaveResult(saveContext: DataServiceSaveContext, data: SaveResult): SaveResult
  
  var changeRequestInterceptor: Done
  
  def checkForRecomposition(interfaceInitializedArgs: InterfaceName): Unit
  
  def executeQuery(mappingContext: MappingContext): js.Promise[Any]
  
  def fetchMetadata(metadataStore: MetadataStore, dataService: DataService): js.Promise[Any]
  
  def initialize(): Unit
  
  def saveChanges(saveContext: typingsJapgolly.breeze.anon.DataService, saveBundle: SaveBundle): js.Promise[SaveResult]
}
object DataServiceAdapter {
  
  inline def apply(
    JsonResultsAdapter: JsonResultsAdapter,
    _catchNoConnectionError: js.Error => Any,
    _createChangeRequestInterceptor: (DataServiceSaveContext, SaveBundle) => Done,
    _prepareSaveBundle: (DataServiceSaveContext, SaveBundle) => SaveBundle,
    _prepareSaveResult: (DataServiceSaveContext, SaveResult) => SaveResult,
    changeRequestInterceptor: Done,
    checkForRecomposition: InterfaceName => Callback,
    executeQuery: MappingContext => js.Promise[Any],
    fetchMetadata: (MetadataStore, DataService) => js.Promise[Any],
    initialize: Callback,
    saveChanges: (typingsJapgolly.breeze.anon.DataService, SaveBundle) => js.Promise[SaveResult]
  ): DataServiceAdapter = {
    val __obj = js.Dynamic.literal(JsonResultsAdapter = JsonResultsAdapter.asInstanceOf[js.Any], _catchNoConnectionError = js.Any.fromFunction1(_catchNoConnectionError), _createChangeRequestInterceptor = js.Any.fromFunction2(_createChangeRequestInterceptor), _prepareSaveBundle = js.Any.fromFunction2(_prepareSaveBundle), _prepareSaveResult = js.Any.fromFunction2(_prepareSaveResult), changeRequestInterceptor = changeRequestInterceptor.asInstanceOf[js.Any], checkForRecomposition = js.Any.fromFunction1((t0: InterfaceName) => checkForRecomposition(t0).runNow()), executeQuery = js.Any.fromFunction1(executeQuery), fetchMetadata = js.Any.fromFunction2(fetchMetadata), initialize = initialize.toJsFn, saveChanges = js.Any.fromFunction2(saveChanges))
    __obj.asInstanceOf[DataServiceAdapter]
  }
  
  extension [Self <: DataServiceAdapter](x: Self) {
    
    inline def setChangeRequestInterceptor(value: Done): Self = StObject.set(x, "changeRequestInterceptor", value.asInstanceOf[js.Any])
    
    inline def setCheckForRecomposition(value: InterfaceName => Callback): Self = StObject.set(x, "checkForRecomposition", js.Any.fromFunction1((t0: InterfaceName) => value(t0).runNow()))
    
    inline def setExecuteQuery(value: MappingContext => js.Promise[Any]): Self = StObject.set(x, "executeQuery", js.Any.fromFunction1(value))
    
    inline def setFetchMetadata(value: (MetadataStore, DataService) => js.Promise[Any]): Self = StObject.set(x, "fetchMetadata", js.Any.fromFunction2(value))
    
    inline def setInitialize(value: Callback): Self = StObject.set(x, "initialize", value.toJsFn)
    
    inline def setJsonResultsAdapter(value: JsonResultsAdapter): Self = StObject.set(x, "JsonResultsAdapter", value.asInstanceOf[js.Any])
    
    inline def setSaveChanges(value: (typingsJapgolly.breeze.anon.DataService, SaveBundle) => js.Promise[SaveResult]): Self = StObject.set(x, "saveChanges", js.Any.fromFunction2(value))
    
    inline def set_catchNoConnectionError(value: js.Error => Any): Self = StObject.set(x, "_catchNoConnectionError", js.Any.fromFunction1(value))
    
    inline def set_createChangeRequestInterceptor(value: (DataServiceSaveContext, SaveBundle) => Done): Self = StObject.set(x, "_createChangeRequestInterceptor", js.Any.fromFunction2(value))
    
    inline def set_prepareSaveBundle(value: (DataServiceSaveContext, SaveBundle) => SaveBundle): Self = StObject.set(x, "_prepareSaveBundle", js.Any.fromFunction2(value))
    
    inline def set_prepareSaveResult(value: (DataServiceSaveContext, SaveResult) => SaveResult): Self = StObject.set(x, "_prepareSaveResult", js.Any.fromFunction2(value))
  }
}
