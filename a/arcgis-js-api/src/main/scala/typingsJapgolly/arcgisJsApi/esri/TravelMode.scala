package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TravelMode extends Object {
  /**
    * The description explaining the selected travel mode. A listing of these descriptions can be found in the [ArcGIS Online documentation](https://doc.arcgis.com/en/arcgis-online/reference/travel-modes.htm#GUID-96DF7F50-E0B2-4BF3-8271-EB515D3F0107).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#TravelMode)
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * The unique identifier specific for this travel mode.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#TravelMode)
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * The cost attribute on which to optimize the analysis. For example `Miles`, `Minutes`, `Travel Time`, `Kilometers`, `TimeAt1KPH`, `WalkTime`, and `TruckTravelTime`. Take note that attribute names are specific to the network dataset. They may be different if using another Network Analysis service besides the one hosted via ArcGIS Online.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#TravelMode)
    */
  var impedanceAttributeName: js.UndefOr[String] = js.undefined
  /**
    * Name of the travel mode. Users of ArcGIS Online or ArcGIS Enterprise can define custom travel modes inside their Organization settings. Authors of stand alone Network Analysis Services can define their own travel modes inside a network dataset.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#TravelMode)
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * The time-based cost attribute for reporting directions. For example, `Minutes`, `Travel Time`, `TimeAt1KPH`, `WalkTime`, and `TruckTravelTime`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#TravelMode)
    */
  var timeAttributeName: js.UndefOr[String] = js.undefined
}

object TravelMode {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    description: String = null,
    id: String = null,
    impedanceAttributeName: String = null,
    name: String = null,
    timeAttributeName: String = null
  ): TravelMode = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (impedanceAttributeName != null) __obj.updateDynamic("impedanceAttributeName")(impedanceAttributeName.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (timeAttributeName != null) __obj.updateDynamic("timeAttributeName")(timeAttributeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TravelMode]
  }
}

