package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`adding-attachment`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`awaiting-feature-creation-info`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`awaiting-feature-to-create`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`awaiting-feature-to-update`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`awaiting-update-feature-candidate`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`create-features`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`creating-features`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`editing-attachment`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`editing-existing-feature`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`editing-new-feature`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.create
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.disabled
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.global
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.local
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.ready
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.update
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Note: reserved for internal use only, this is not part of the stable public API.
  *
  * Various utilities for the Scene Viewer application.
  */
@js.native
trait sceneViewerUtils extends StObject {
  
  /**
    * Note: reserved for internal use only, this is not part of the stable public API.
    *
    * Checks for relative urls and returns whether or not this webscene allows the `saveAs()` operation.
    */
  def canSaveAs(webscene: WebScene): Boolean = js.native
  
  /**
    * Note: reserved for internal use only, this is not part of the stable public API.
    *
    * Returns the number of pending features of an active [CreateFeaturesWorkflow](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-CreateFeaturesWorkflow.html).
    */
  def createFeaturesWorkflowGetNumPendingFeatures(viewModel: EditorViewModel): Double = js.native
  
  /**
    * Note: reserved for internal use only, this is not part of the stable public API.
    *
    * Create a new TilingScheme based on the tileInfo
    */
  def createTilingScheme(TileInfo: TileInfo): Any = js.native
  
  /**
    * Note: reserved for internal use only, this is not part of the stable public API.
    *
    * Get the active workflow state.
    */
  def getActiveWorkflowState(viewModel: EditorViewModel): `adding-attachment` | `awaiting-feature-creation-info` | `awaiting-feature-to-create` | `awaiting-feature-to-update` | `awaiting-update-feature-candidate` | `creating-features` | disabled | `editing-attachment` | `editing-existing-feature` | `editing-new-feature` | ready = js.native
  
  /**
    * Note: reserved for internal use only, this is not part of the stable public API.
    *
    * Get the active workflow type.
    */
  def getActiveWorkflowType(viewModel: EditorViewModel): create | `create-features` | update = js.native
  
  /**
    * Note: reserved for internal use only, this is not part of the stable public API.
    *
    * Generates if necessary an equivalent tileinfo but with a different pixel size (256 or 512).
    */
  def getOrCreateCompatibleTileInfo(TileInfo: TileInfo, expectedTileSize: Double, resolutionModifier: Double): Any = js.native
  
  def isHostedAgolServiceUrl(url: String): Boolean = js.native
  
  /**
    * Note: reserved for internal use only, this is not part of the stable public API.
    *
    * Checks whether the provided spatial reference is supported in the provided viewing mode.
    */
  def isSpatialReferenceSupported(spatialReference: SpatialReference, viewingMode: global | local): Boolean = js.native
  
  /**
    * Note: reserved for internal use only, this is not part of the stable public API.
    *
    * Check if a given TileInfo is supported.
    */
  def isSupportedTileInfo(TileInfo: TileInfo): Boolean = js.native
  
  /**
    * Note: reserved for internal use only, this is not part of the stable public API.
    *
    * Get number of feature templates available in a FeatureTemplatesViewModel (before filtering).
    */
  def numberOfFeatureTemplates(viewModel: FeatureTemplatesViewModel): Double = js.native
  
  /**
    * Note: reserved for internal use only, this is not part of the stable public API.
    *
    * Render svg vnode for elements provided in the descriptor
    */
  def renderSVG(swatch: js.Array[js.Array[Any]], width: Double, height: Double): Any = js.native
  def renderSVG(swatch: js.Array[js.Array[Any]], width: Double, height: Double, options: Any): Any = js.native
  
  /**
    * Note: reserved for internal use only, this is not part of the stable public API.
    *
    * Warn about problem when trying to display message about the save state.
    */
  def saveStateWarning(warningMessage: String, error: Any): scala.Unit = js.native
  
  /**
    * Note: reserved for internal use only, this is not part of the stable public API.
    *
    * Starts a create features workflow on the given editor view model
    */
  def startCreateFeaturesWorkflow(editorVM: EditorViewModel, creationInfo: CreationInfo, startAt: String): js.Promise[scala.Unit] = js.native
}
