package typingsJapgolly.tensorflowTfjsCore.indexedDbMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.tensorflowTfjsCore.typesMod.ModelArtifactsInfo
import typingsJapgolly.tensorflowTfjsCore.typesMod.ModelStoreManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/io/indexed_db", "BrowserIndexedDBManager")
@js.native
class BrowserIndexedDBManager () extends ModelStoreManager {
  var indexedDB: js.Any = js.native
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

