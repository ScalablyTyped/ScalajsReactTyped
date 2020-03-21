package typingsJapgolly.tensorflowTfjsCore.typesMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModelStoreManager extends js.Object {
  /**
    * List all models in the model store.
    *
    * @returns A dictionary mapping paths of existing models to their
    *   model artifacts info. Model artifacts info include type of the model's
    *   topology, byte sizes of the topology, weights, etc.
    */
  def listModels(): js.Promise[StringDictionary[ModelArtifactsInfo]]
  /**
    * Remove a model specified by `path`.
    *
    * @param path
    * @returns ModelArtifactsInfo of the deleted model (if and only if deletion
    *   is successful).
    * @throws Error if deletion fails, e.g., if no model exists at `path`.
    */
  def removeModel(path: String): js.Promise[ModelArtifactsInfo]
}

object ModelStoreManager {
  @scala.inline
  def apply(
    listModels: CallbackTo[js.Promise[StringDictionary[ModelArtifactsInfo]]],
    removeModel: String => CallbackTo[js.Promise[ModelArtifactsInfo]]
  ): ModelStoreManager = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("listModels")(listModels.toJsFn)
    __obj.updateDynamic("removeModel")(js.Any.fromFunction1((t0: java.lang.String) => removeModel(t0).runNow()))
    __obj.asInstanceOf[ModelStoreManager]
  }
}

