package typingsJapgolly.tensorflowTfjsCore

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.IDBFactory
import typingsJapgolly.tensorflowTfjsCore.distIoRouterRegistryMod.IORouter
import typingsJapgolly.tensorflowTfjsCore.distIoTypesMod.IOHandler
import typingsJapgolly.tensorflowTfjsCore.distIoTypesMod.ModelArtifacts
import typingsJapgolly.tensorflowTfjsCore.distIoTypesMod.ModelArtifactsInfo
import typingsJapgolly.tensorflowTfjsCore.distIoTypesMod.ModelStoreManager
import typingsJapgolly.tensorflowTfjsCore.distIoTypesMod.SaveResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distIoIndexedDbMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/io/indexed_db", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/io/indexed_db", "BrowserIndexedDBManager")
  @js.native
  open class BrowserIndexedDBManager ()
    extends StObject
       with ModelStoreManager {
    
    /* private */ var indexedDB: Any = js.native
    
    /**
      * List all models in the model store.
      *
      * @returns A dictionary mapping paths of existing models to their
      *   model artifacts info. Model artifacts info include type of the model's
      *   topology, byte sizes of the topology, weights, etc.
      */
    /* CompleteClass */
    override def listModels(): js.Promise[StringDictionary[ModelArtifactsInfo]] = js.native
    
    /**
      * Remove a model specified by `path`.
      *
      * @param path
      * @returns ModelArtifactsInfo of the deleted model (if and only if deletion
      *   is successful).
      * @throws Error if deletion fails, e.g., if no model exists at `path`.
      */
    /* CompleteClass */
    override def removeModel(path: String): js.Promise[ModelArtifactsInfo] = js.native
  }
  
  @JSImport("@tensorflow/tfjs-core/dist/io/indexed_db", "BrowserIndexedDB")
  @js.native
  open class BrowserIndexedDB_ protected ()
    extends StObject
       with IOHandler {
    def this(modelPath: String) = this()
    
    /**
      * Perform database action to put model artifacts into or read model artifacts
      * from IndexedDB object store.
      *
      * Whether the action is put or get depends on whether `modelArtifacts` is
      * specified. If it is specified, the action will be put; otherwise the action
      * will be get.
      *
      * @param modelPath A unique string path for the model.
      * @param modelArtifacts If specified, it will be the model artifacts to be
      *   stored in IndexedDB.
      * @returns A `Promise` of `SaveResult`, if the action is put, or a `Promise`
      *   of `ModelArtifacts`, if the action is get.
      */
    /* private */ var databaseAction: Any = js.native
    
    /* protected */ val indexedDB: IDBFactory = js.native
    
    @JSName("load")
    def load_MBrowserIndexedDB_(): js.Promise[ModelArtifacts] = js.native
    
    /* protected */ val modelPath: String = js.native
    
    @JSName("save")
    def save_MBrowserIndexedDB_(modelArtifacts: ModelArtifacts): js.Promise[SaveResult] = js.native
  }
  /* static members */
  object BrowserIndexedDB_ {
    
    @JSImport("@tensorflow/tfjs-core/dist/io/indexed_db", "BrowserIndexedDB.URL_SCHEME")
    @js.native
    val URL_SCHEME: /* "indexeddb://" */ String = js.native
  }
  
  inline def browserIndexedDB(modelPath: String): IOHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("browserIndexedDB")(modelPath.asInstanceOf[js.Any]).asInstanceOf[IOHandler]
  
  inline def deleteDatabase(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteDatabase")().asInstanceOf[js.Promise[Unit]]
  
  @JSImport("@tensorflow/tfjs-core/dist/io/indexed_db", "indexedDBRouter")
  @js.native
  val indexedDBRouter: IORouter = js.native
}
