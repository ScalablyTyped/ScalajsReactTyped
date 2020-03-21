package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`direct-line`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`nautical-miles`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`square-feet`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`square-inches`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`square-kilometers`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`square-meters`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`square-miles`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`square-us-feet`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`square-yards`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`us-feet`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.acres
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.area
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.ares
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.distance
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.feet_
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.hectares
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.imperial
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.inches
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.kilometers_
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.meters_
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.metric
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.miles_
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.yards
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MeasurementViewModelProperties extends js.Object {
  /**
    * Specifies the current measurement tool to display. Setting its value to `area` activates the area measurement tool and it works for both [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) and [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). To measure distance in a [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) set the property to `distance` and in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) set it to `direct-line`. If this property is not set, the widget will not be displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Measurement-MeasurementViewModel.html#activeTool)
    *
    * @default null
    */
  var activeTool: js.UndefOr[area | distance | `direct-line`] = js.undefined
  /**
    * View model of the active measurement widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Measurement-MeasurementViewModel.html#activeViewModel)
    */
  var activeViewModel: js.UndefOr[
    AreaMeasurement2DViewModel | AreaMeasurement3DViewModelProperties | DirectLineMeasurement3DViewModelProperties | DistanceMeasurement2DViewModel
  ] = js.undefined
  /**
    * Unit system (imperial, metric) or specific unit used for displaying the area values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Measurement-MeasurementViewModel.html#areaUnit)
    */
  var areaUnit: js.UndefOr[
    metric | imperial | `square-inches` | `square-feet` | `square-us-feet` | `square-yards` | `square-miles` | `square-meters` | `square-kilometers` | acres | ares | hectares
  ] = js.undefined
  /**
    * Unit system (imperial, metric) or specific unit used for displaying the distance values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Measurement-MeasurementViewModel.html#linearUnit)
    */
  var linearUnit: js.UndefOr[
    metric | imperial | inches | feet_ | `us-feet` | yards | miles_ | `nautical-miles` | meters_ | kilometers_
  ] = js.undefined
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Measurement-MeasurementViewModel.html#view)
    */
  var view: js.UndefOr[MapViewProperties | SceneViewProperties] = js.undefined
}

object MeasurementViewModelProperties {
  @scala.inline
  def apply(
    activeTool: area | distance | `direct-line` = null,
    activeViewModel: AreaMeasurement2DViewModel | AreaMeasurement3DViewModelProperties | DirectLineMeasurement3DViewModelProperties | DistanceMeasurement2DViewModel = null,
    areaUnit: metric | imperial | `square-inches` | `square-feet` | `square-us-feet` | `square-yards` | `square-miles` | `square-meters` | `square-kilometers` | acres | ares | hectares = null,
    linearUnit: metric | imperial | inches | feet_ | `us-feet` | yards | miles_ | `nautical-miles` | meters_ | kilometers_ = null,
    view: MapViewProperties | SceneViewProperties = null
  ): MeasurementViewModelProperties = {
    val __obj = js.Dynamic.literal()
    if (activeTool != null) __obj.updateDynamic("activeTool")(activeTool.asInstanceOf[js.Any])
    if (activeViewModel != null) __obj.updateDynamic("activeViewModel")(activeViewModel.asInstanceOf[js.Any])
    if (areaUnit != null) __obj.updateDynamic("areaUnit")(areaUnit.asInstanceOf[js.Any])
    if (linearUnit != null) __obj.updateDynamic("linearUnit")(linearUnit.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeasurementViewModelProperties]
  }
}

