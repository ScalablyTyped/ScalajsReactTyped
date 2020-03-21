package typingsJapgolly.arcgisJsApi.distanceMeasurement2DViewModelMod

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`nautical-miles`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`us-feet`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.disabled
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.feet_
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.imperial
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.inches
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.kilometers_
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.measured
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.measuring
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.meters_
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.metric
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.miles_
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.ready
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.yards
import typingsJapgolly.arcgisJsApi.esri.DistanceMeasurement2DViewModel
import typingsJapgolly.arcgisJsApi.esri.DistanceMeasurement2DViewModelMeasurement
import typingsJapgolly.arcgisJsApi.esri.MapView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/widgets/DistanceMeasurement2D/DistanceMeasurement2DViewModel", JSImport.Namespace)
@js.native
class Class () extends DistanceMeasurement2DViewModel {
  def this(properties: js.Any) = this()
  /**
    * When the coordinate sustem is projected (other than web mercator) then distances less than this threshold will be computed planimetrically. Otherwise distances will be computed geodetically.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DistanceMeasurement2D-DistanceMeasurement2DViewModel.html#geodesicDistanceThreshold)
    *
    * @default 100000
    */
  /* CompleteClass */
  override var geodesicDistanceThreshold: Double = js.native
  /**
    * The length and geometry of the measurement polyline in meters.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DistanceMeasurement2D-DistanceMeasurement2DViewModel.html#measurement)
    */
  /* CompleteClass */
  override val measurement: DistanceMeasurement2DViewModelMeasurement = js.native
  /**
    * This property returns the locale specific representation of the length. Lengths are rounded to two decimal places. Lengths are sourced from the [measurement](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DistanceMeasurement2D-DistanceMeasurement2DViewModel.html#measurement) property (in meters) and converted to the user defined units or system.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DistanceMeasurement2D-DistanceMeasurement2DViewModel.html#measurementLabel)
    */
  /* CompleteClass */
  override val measurementLabel: String = js.native
  /**
    * The view model's state.
    *
    *    Value    | Description
    * ------------|-------------
    * disabled    | not ready yet
    * ready       | ready for measuring
    * measuring   | measuring has started
    * measured    | measuring has finished
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DistanceMeasurement2D-DistanceMeasurement2DViewModel.html#state)
    *
    * @default disabled
    */
  /* CompleteClass */
  override val state: disabled | ready | measuring | measured = js.native
  /**
    * Unit system (imperial, metric) or specific unit used for displaying the distance values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DistanceMeasurement2D-DistanceMeasurement2DViewModel.html#unit)
    */
  /* CompleteClass */
  override var unit: metric | imperial | inches | feet_ | `us-feet` | yards | miles_ | `nautical-miles` | meters_ | kilometers_ = js.native
  /**
    * List of available units and unit systems (imperial, metric) for displaying the distance values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DistanceMeasurement2D-DistanceMeasurement2DViewModel.html#unitOptions)
    */
  /* CompleteClass */
  override var unitOptions: js.Array[
    metric | imperial | inches | feet_ | `us-feet` | yards | miles_ | `nautical-miles` | meters_ | kilometers_
  ] = js.native
  /**
    * The view from which the widget will operate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DistanceMeasurement2D-DistanceMeasurement2DViewModel.html#view)
    */
  /* CompleteClass */
  override var view: MapView = js.native
  /**
    * Clears the current measurement.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DistanceMeasurement2D-DistanceMeasurement2DViewModel.html#clearMeasurement)
    *
    *
    */
  /* CompleteClass */
  override def clearMeasurement(): Unit = js.native
  /**
    * Starts a new measurement.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DistanceMeasurement2D-DistanceMeasurement2DViewModel.html#newMeasurement)
    *
    *
    */
  /* CompleteClass */
  override def newMeasurement(): Unit = js.native
}

