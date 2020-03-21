package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`hide-children`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.hide
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.mesh
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.multipatch
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.multipoint
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.point
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.polygon
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.polyline
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.show
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamLayerProperties extends FeatureLayerProperties {
  /**
    * Configures the method for reducing the number of point features in the view. By default this property is `null`, which indicates the layer view should draw every feature.  StreamLayer supports one type feature reduction: `selection`. [Selection](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureReductionSelection.html) only applies to points in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) and involves thinning overlapping features so no features intersect on screen.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#featureReduction)
    */
  @JSName("featureReduction")
  var featureReduction_StreamLayerProperties: js.UndefOr[FeatureReductionSelectionProperties] = js.undefined
  /**
    * An extent object used to filter features. Only features intersecting the extent are displayed in the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#geometryDefinition)
    */
  var geometryDefinition: js.UndefOr[ExtentProperties] = js.undefined
  /**
    * Maximum number of features to show per [trackId](https://enterprise.arcgis.com/en/geoevent/latest/get-started/essential-geoevent-server-vocabulary.htm#ESRI_SECTION1_F45BBCE9ADFA4E57AF38DD225921EFCD). If `trackId` is not configured on the GeoEvent Service, the `maximumTrackPoints` property will have no effect and an error will be logged in the console.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#maximumTrackPoints)
    */
  var maximumTrackPoints: js.UndefOr[Double] = js.undefined
  /**
    * Options for purging stale features. Use these options to avoid overloading the browser with graphics.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#purgeOptions)
    */
  var purgeOptions: js.UndefOr[StreamLayerPurgeOptions] = js.undefined
}

object StreamLayerProperties {
  @scala.inline
  def apply(
    copyright: String = null,
    definitionExpression: String = null,
    displayField: String = null,
    dynamicDataSource: DynamicMapLayer | DynamicDataLayer = null,
    elevationInfo: FeatureLayerElevationInfo = null,
    featureReduction: FeatureReductionSelectionProperties = null,
    fields: js.Array[FieldProperties] = null,
    fullExtent: ExtentProperties = null,
    gdbVersion: String = null,
    geometryDefinition: ExtentProperties = null,
    geometryType: point | multipoint | polyline | polygon | multipatch | mesh = null,
    historicMoment: DateProperties = null,
    id: String = null,
    isTable: js.UndefOr[Boolean] = js.undefined,
    labelingInfo: js.Array[LabelClassProperties] = null,
    labelsVisible: js.UndefOr[Boolean] = js.undefined,
    layerId: Int | Double = null,
    legendEnabled: js.UndefOr[Boolean] = js.undefined,
    listMode: show | hide | `hide-children` = null,
    maxScale: Int | Double = null,
    maximumTrackPoints: Int | Double = null,
    minScale: Int | Double = null,
    objectIdField: String = null,
    opacity: Int | Double = null,
    outFields: js.Array[String] = null,
    popupEnabled: js.UndefOr[Boolean] = js.undefined,
    popupTemplate: PopupTemplateProperties = null,
    portalItem: PortalItemProperties = null,
    purgeOptions: StreamLayerPurgeOptions = null,
    refreshInterval: Int | Double = null,
    renderer: RendererProperties = null,
    returnM: js.UndefOr[Boolean] = js.undefined,
    returnZ: js.UndefOr[Boolean] = js.undefined,
    screenSizePerspectiveEnabled: js.UndefOr[Boolean] = js.undefined,
    source: CollectionProperties[GraphicProperties] = null,
    sourceJSON: js.Any = null,
    spatialReference: SpatialReferenceProperties = null,
    templates: js.Array[FeatureTemplateProperties] = null,
    timeExtent: TimeExtentProperties = null,
    timeInfo: TimeInfoProperties = null,
    timeOffset: TimeIntervalProperties = null,
    title: String = null,
    typeIdField: String = null,
    types: js.Array[FeatureTypeProperties] = null,
    url: String = null,
    useViewTime: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined
  ): StreamLayerProperties = {
    val __obj = js.Dynamic.literal()
    if (copyright != null) __obj.updateDynamic("copyright")(copyright.asInstanceOf[js.Any])
    if (definitionExpression != null) __obj.updateDynamic("definitionExpression")(definitionExpression.asInstanceOf[js.Any])
    if (displayField != null) __obj.updateDynamic("displayField")(displayField.asInstanceOf[js.Any])
    if (dynamicDataSource != null) __obj.updateDynamic("dynamicDataSource")(dynamicDataSource.asInstanceOf[js.Any])
    if (elevationInfo != null) __obj.updateDynamic("elevationInfo")(elevationInfo.asInstanceOf[js.Any])
    if (featureReduction != null) __obj.updateDynamic("featureReduction")(featureReduction.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (fullExtent != null) __obj.updateDynamic("fullExtent")(fullExtent.asInstanceOf[js.Any])
    if (gdbVersion != null) __obj.updateDynamic("gdbVersion")(gdbVersion.asInstanceOf[js.Any])
    if (geometryDefinition != null) __obj.updateDynamic("geometryDefinition")(geometryDefinition.asInstanceOf[js.Any])
    if (geometryType != null) __obj.updateDynamic("geometryType")(geometryType.asInstanceOf[js.Any])
    if (historicMoment != null) __obj.updateDynamic("historicMoment")(historicMoment.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(isTable)) __obj.updateDynamic("isTable")(isTable.asInstanceOf[js.Any])
    if (labelingInfo != null) __obj.updateDynamic("labelingInfo")(labelingInfo.asInstanceOf[js.Any])
    if (!js.isUndefined(labelsVisible)) __obj.updateDynamic("labelsVisible")(labelsVisible.asInstanceOf[js.Any])
    if (layerId != null) __obj.updateDynamic("layerId")(layerId.asInstanceOf[js.Any])
    if (!js.isUndefined(legendEnabled)) __obj.updateDynamic("legendEnabled")(legendEnabled.asInstanceOf[js.Any])
    if (listMode != null) __obj.updateDynamic("listMode")(listMode.asInstanceOf[js.Any])
    if (maxScale != null) __obj.updateDynamic("maxScale")(maxScale.asInstanceOf[js.Any])
    if (maximumTrackPoints != null) __obj.updateDynamic("maximumTrackPoints")(maximumTrackPoints.asInstanceOf[js.Any])
    if (minScale != null) __obj.updateDynamic("minScale")(minScale.asInstanceOf[js.Any])
    if (objectIdField != null) __obj.updateDynamic("objectIdField")(objectIdField.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (outFields != null) __obj.updateDynamic("outFields")(outFields.asInstanceOf[js.Any])
    if (!js.isUndefined(popupEnabled)) __obj.updateDynamic("popupEnabled")(popupEnabled.asInstanceOf[js.Any])
    if (popupTemplate != null) __obj.updateDynamic("popupTemplate")(popupTemplate.asInstanceOf[js.Any])
    if (portalItem != null) __obj.updateDynamic("portalItem")(portalItem.asInstanceOf[js.Any])
    if (purgeOptions != null) __obj.updateDynamic("purgeOptions")(purgeOptions.asInstanceOf[js.Any])
    if (refreshInterval != null) __obj.updateDynamic("refreshInterval")(refreshInterval.asInstanceOf[js.Any])
    if (renderer != null) __obj.updateDynamic("renderer")(renderer.asInstanceOf[js.Any])
    if (!js.isUndefined(returnM)) __obj.updateDynamic("returnM")(returnM.asInstanceOf[js.Any])
    if (!js.isUndefined(returnZ)) __obj.updateDynamic("returnZ")(returnZ.asInstanceOf[js.Any])
    if (!js.isUndefined(screenSizePerspectiveEnabled)) __obj.updateDynamic("screenSizePerspectiveEnabled")(screenSizePerspectiveEnabled.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (sourceJSON != null) __obj.updateDynamic("sourceJSON")(sourceJSON.asInstanceOf[js.Any])
    if (spatialReference != null) __obj.updateDynamic("spatialReference")(spatialReference.asInstanceOf[js.Any])
    if (templates != null) __obj.updateDynamic("templates")(templates.asInstanceOf[js.Any])
    if (timeExtent != null) __obj.updateDynamic("timeExtent")(timeExtent.asInstanceOf[js.Any])
    if (timeInfo != null) __obj.updateDynamic("timeInfo")(timeInfo.asInstanceOf[js.Any])
    if (timeOffset != null) __obj.updateDynamic("timeOffset")(timeOffset.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (typeIdField != null) __obj.updateDynamic("typeIdField")(typeIdField.asInstanceOf[js.Any])
    if (types != null) __obj.updateDynamic("types")(types.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (!js.isUndefined(useViewTime)) __obj.updateDynamic("useViewTime")(useViewTime.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamLayerProperties]
  }
}

