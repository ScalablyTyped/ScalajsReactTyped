package typingsJapgolly.mapboxMapboxSdk.datasetsMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mapboxMapboxSdk.AnonDatasetId
import typingsJapgolly.mapboxMapboxSdk.AnonDatasetIdString
import typingsJapgolly.mapboxMapboxSdk.AnonDescription
import typingsJapgolly.mapboxMapboxSdk.AnonFeature
import typingsJapgolly.mapboxMapboxSdk.AnonFeatureId
import typingsJapgolly.mapboxMapboxSdk.AnonLimit
import typingsJapgolly.mapboxMapboxSdk.AnonName
import typingsJapgolly.mapboxMapboxSdk.mapiRequestMod.MapiRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatasetsService extends js.Object {
  /**
    *  Create a new, empty dataset.
    * @param config Object
    */
  def createDataset(config: AnonDescription): MapiRequest
  /**
    * Delete a dataset, including all features it contains.
    * @param config
    */
  def deleteDataset(config: AnonDatasetIdString): MapiRequest
  /**
    * Delete a feature in a dataset.
    * @param config
    */
  // implicit any
  def deleteFeature(config: AnonFeatureId): js.Any
  /**
    * Get a feature in a dataset.
    * @param config
    */
  // implicit any
  def getFeature(config: AnonFeatureId): js.Any
  /**
    * Get metadata about a dataset.
    * @param config
    */
  def getMetadata(config: AnonDatasetId): MapiRequest
  /**
    * List datasets in your account.
    */
  def listDatasets(): MapiRequest
  /**
    * List features in a dataset.
    * This endpoint supports pagination. Use MapiRequest#eachPage or manually specify the limit and start options.
    * @param config
    */
  // implicit any
  def listFeatures(config: AnonLimit): js.Any
  /**
    * Add a feature to a dataset or update an existing one.
    * @param config
    */
  def putFeature(config: AnonFeature): MapiRequest
  /**
    * Update user-defined properties of a dataset's metadata.
    * @param config
    */
  def updateMetadata(config: AnonName): MapiRequest
}

object DatasetsService {
  @scala.inline
  def apply(
    createDataset: AnonDescription => CallbackTo[MapiRequest],
    deleteDataset: AnonDatasetIdString => CallbackTo[MapiRequest],
    deleteFeature: AnonFeatureId => CallbackTo[js.Any],
    getFeature: AnonFeatureId => CallbackTo[js.Any],
    getMetadata: AnonDatasetId => CallbackTo[MapiRequest],
    listDatasets: CallbackTo[MapiRequest],
    listFeatures: AnonLimit => CallbackTo[js.Any],
    putFeature: AnonFeature => CallbackTo[MapiRequest],
    updateMetadata: AnonName => CallbackTo[MapiRequest]
  ): DatasetsService = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createDataset")(js.Any.fromFunction1((t0: typingsJapgolly.mapboxMapboxSdk.AnonDescription) => createDataset(t0).runNow()))
    __obj.updateDynamic("deleteDataset")(js.Any.fromFunction1((t0: typingsJapgolly.mapboxMapboxSdk.AnonDatasetIdString) => deleteDataset(t0).runNow()))
    __obj.updateDynamic("deleteFeature")(js.Any.fromFunction1((t0: typingsJapgolly.mapboxMapboxSdk.AnonFeatureId) => deleteFeature(t0).runNow()))
    __obj.updateDynamic("getFeature")(js.Any.fromFunction1((t0: typingsJapgolly.mapboxMapboxSdk.AnonFeatureId) => getFeature(t0).runNow()))
    __obj.updateDynamic("getMetadata")(js.Any.fromFunction1((t0: typingsJapgolly.mapboxMapboxSdk.AnonDatasetId) => getMetadata(t0).runNow()))
    __obj.updateDynamic("listDatasets")(listDatasets.toJsFn)
    __obj.updateDynamic("listFeatures")(js.Any.fromFunction1((t0: typingsJapgolly.mapboxMapboxSdk.AnonLimit) => listFeatures(t0).runNow()))
    __obj.updateDynamic("putFeature")(js.Any.fromFunction1((t0: typingsJapgolly.mapboxMapboxSdk.AnonFeature) => putFeature(t0).runNow()))
    __obj.updateDynamic("updateMetadata")(js.Any.fromFunction1((t0: typingsJapgolly.mapboxMapboxSdk.AnonName) => updateMetadata(t0).runNow()))
    __obj.asInstanceOf[DatasetsService]
  }
}

