package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`absolute-height`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`on-the-ground`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`relative-to-ground`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`relative-to-scene`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`us-feet`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.feet_
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.kilometers_
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.meters_
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.miles_
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.yards
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoJSONLayerElevationInfo extends Object {
  /**
    * This object contains information about setting a custom z-value on the feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#elevationInfo)
    */
  var featureExpressionInfo: js.UndefOr[GeoJSONLayerElevationInfoFeatureExpressionInfo] = js.undefined
  /**
    * Defines how the graphic is placed with respect to the terrain surface. See the table below for a list of possible values.
    *
    * Mode | Description
    * ------|------------
    * on-the-ground | Graphics are draped on the terrain surface. This is the default value for [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) geometries rendered with [ObjectSymbol3DLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html).
    * relative-to-ground | Graphics are placed at an elevation relative to the terrain surface. The graphic's elevation is determined by summing up the terrain elevation and the result of `featureExpressionInfo` (if defined). This is the default value for [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) geometries rendered with [IconSymbol3DLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html).
    * absolute-height | Graphics are placed at an absolute elevation (z-value) above sea level. This z-value is determined by the result of `featureExpressionInfo` (if defined). This mode doesn't take the elevation of the terrain into account.
    * relative-to-scene | Features are aligned to [extruded polygons](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ExtrudeSymbol3DLayer.html) and objects part of 3D Object [SceneLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html) or [IntegratedMeshLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-IntegratedMeshLayer.html), depending on which has higher elevation. If the graphic is not directly above a building or any other feature, it is aligned to the terrain surface elevation. If defined, the result of `featureExpressionInfo` is added to the 3D Object/terrain surface elevation.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#elevationInfo)
    */
  var mode: `on-the-ground` | `relative-to-ground` | `absolute-height` | `relative-to-scene`
  /**
    * An elevation offset, which is added to the vertical position of the graphic. If `unit` is not defined, the offset is in `meters`. When `mode = "on-the-ground"`, this property has no effect.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#elevationInfo)
    */
  var offset: js.UndefOr[Double] = js.undefined
  /**
    * The unit for `featureExpressionInfo` and `offset` values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#elevationInfo)
    */
  var unit: js.UndefOr[feet_ | meters_ | kilometers_ | miles_ | `us-feet` | yards] = js.undefined
}

object GeoJSONLayerElevationInfo {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    mode: `on-the-ground` | `relative-to-ground` | `absolute-height` | `relative-to-scene`,
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    featureExpressionInfo: GeoJSONLayerElevationInfoFeatureExpressionInfo = null,
    offset: Int | Double = null,
    unit: feet_ | meters_ | kilometers_ | miles_ | `us-feet` | yards = null
  ): GeoJSONLayerElevationInfo = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    if (featureExpressionInfo != null) __obj.updateDynamic("featureExpressionInfo")(featureExpressionInfo.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoJSONLayerElevationInfo]
  }
}

