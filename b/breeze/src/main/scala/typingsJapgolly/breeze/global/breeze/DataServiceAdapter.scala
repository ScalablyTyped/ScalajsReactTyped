package typingsJapgolly.breeze.global.breeze

import typingsJapgolly.breeze.anon.Done
import typingsJapgolly.breeze.anon.InterfaceName
import typingsJapgolly.breeze.breeze.DataServiceSaveContext
import typingsJapgolly.breeze.breeze.MappingContext
import typingsJapgolly.breeze.breeze.SaveBundle
import typingsJapgolly.breeze.breeze.SaveResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("breeze.DataServiceAdapter")
@js.native
open class DataServiceAdapter ()
  extends StObject
     with typingsJapgolly.breeze.breeze.DataServiceAdapter {
  
  /* CompleteClass */
  var JsonResultsAdapter: typingsJapgolly.breeze.breeze.JsonResultsAdapter = js.native
  
  /* CompleteClass */
  override def _catchNoConnectionError(err: js.Error): Any = js.native
  
  /* CompleteClass */
  override def _createChangeRequestInterceptor(saveContext: DataServiceSaveContext, saveBundle: SaveBundle): Done = js.native
  
  /* CompleteClass */
  override def _prepareSaveBundle(saveContext: DataServiceSaveContext, saveBundle: SaveBundle): SaveBundle = js.native
  
  /* CompleteClass */
  override def _prepareSaveResult(saveContext: DataServiceSaveContext, data: SaveResult): SaveResult = js.native
  
  /* CompleteClass */
  var changeRequestInterceptor: Done = js.native
  
  /* CompleteClass */
  override def checkForRecomposition(interfaceInitializedArgs: InterfaceName): Unit = js.native
  
  /* CompleteClass */
  override def executeQuery(mappingContext: MappingContext): js.Promise[Any] = js.native
  
  /* CompleteClass */
  override def fetchMetadata(
    metadataStore: typingsJapgolly.breeze.breeze.MetadataStore,
    dataService: typingsJapgolly.breeze.breeze.DataService
  ): js.Promise[Any] = js.native
  
  /* CompleteClass */
  override def initialize(): Unit = js.native
  
  /* CompleteClass */
  override def saveChanges(saveContext: typingsJapgolly.breeze.anon.DataService, saveBundle: SaveBundle): js.Promise[SaveResult] = js.native
}
