package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocatorAddressToLocationsParams extends Object {
  /**
    * The address argument is data object that contains properties representing the various address fields accepted by the corresponding geocode service. These fields are listed in the addressFields property of the associated geocode service resource. For example, if the *addressFields* of a geocode service resource includes fields with the following names: Street, City, State and Zone, then the address argument is of the form:
    * ```js
    * {
    *   Street: "1234 W Main St",
    *   City: "Small Town",
    *   State: "WA",
    *   Zone: "99027"
    * }
    * ```
    *
    * Locators published using ArcGIS 10 or later support a single line address field, which
    * can be specified using the following syntax where field_name is the name of the single
    * line address field. You can find this name by viewing the help or services directory for
    * your locator services. Common values are *SingleLine* and *SingleLineFieldName*:
    *
    * ```js
    * var address = { "field_name": "380 New York St, Redlands, CA 92373" };
    * ```
    * The Services Directory can be used to find out the required and optional address fields
    * and the correct names for the input name fields. If you are using the World Geocoding Service
    * visit the ArcGIS Online Geocoding Service help for more details on the World Geocoder.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Locator.html#addressToLocations)
    */
  var address: js.Any
  /**
    * Limit result to one or more categories. For example, "Populated Place" or "Scandinavian Food". Only applies to the World Geocode Service. See [Category filtering (World Geocoding Service)](https://developers.arcgis.com/rest/geocode/api-reference/geocoding-category-filtering.htm#ESRI_SECTION1_502B3FE2028145D7B189C25B1A00E17B) for more information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Locator.html#addressToLocations)
    */
  var categories: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Limit result to a specific country. For example, "US" for United States or "SE" for Sweden. Only applies to the World Geocode Service. See Geocode coverage (World Geocoding Service) for more information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Locator.html#addressToLocations)
    */
  var countryCode: js.UndefOr[String] = js.undefined
  /**
    * Allows the results of single geocode transactions to be persisted.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Locator.html#addressToLocations)
    */
  var forStorage: js.UndefOr[Boolean] = js.undefined
  /**
    * Used to weight returned results for a specified area.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Locator.html#addressToLocations)
    */
  var location: js.UndefOr[Point] = js.undefined
  /**
    * Define the type of location, either `"street"` or `"rooftop"`, of the point returned from the [World Geocoding Service](https://developers.arcgis.com/rest/geocode/api-reference/geocoding-category-filtering.htm).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Locator.html#addressToLocations)
    */
  var locationType: js.UndefOr[String] = js.undefined
  /**
    * A `suggestLocations` result ID (magicKey). Used to query for a specific results information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Locator.html#addressToLocations)
    */
  var magicKey: js.UndefOr[String] = js.undefined
  /**
    * Maximum results to return from the query.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Locator.html#addressToLocations)
    */
  var maxLocations: js.UndefOr[Double] = js.undefined
  /**
    * The list of fields included in the returned result set. This list is a comma delimited list of field names. If you specify the shape field in the list of return fields, it is ignored. For non-intersection addresses you can specify the candidate fields as defined in the geocode service. For intersection addresses you can specify the intersection candidate fields.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Locator.html#addressToLocations)
    */
  var outFields: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Defines the extent within which the geocode server will search. Requires ArcGIS Server version 10.1 or greater.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Locator.html#addressToLocations)
    */
  var searchExtent: js.UndefOr[Extent] = js.undefined
}

object LocatorAddressToLocationsParams {
  @scala.inline
  def apply(
    address: js.Any,
    constructor: js.Function,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    categories: js.Array[String] = null,
    countryCode: String = null,
    forStorage: js.UndefOr[Boolean] = js.undefined,
    location: Point = null,
    locationType: String = null,
    magicKey: String = null,
    maxLocations: Int | Double = null,
    outFields: js.Array[String] = null,
    searchExtent: Extent = null
  ): LocatorAddressToLocationsParams = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    if (categories != null) __obj.updateDynamic("categories")(categories.asInstanceOf[js.Any])
    if (countryCode != null) __obj.updateDynamic("countryCode")(countryCode.asInstanceOf[js.Any])
    if (!js.isUndefined(forStorage)) __obj.updateDynamic("forStorage")(forStorage.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (locationType != null) __obj.updateDynamic("locationType")(locationType.asInstanceOf[js.Any])
    if (magicKey != null) __obj.updateDynamic("magicKey")(magicKey.asInstanceOf[js.Any])
    if (maxLocations != null) __obj.updateDynamic("maxLocations")(maxLocations.asInstanceOf[js.Any])
    if (outFields != null) __obj.updateDynamic("outFields")(outFields.asInstanceOf[js.Any])
    if (searchExtent != null) __obj.updateDynamic("searchExtent")(searchExtent.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocatorAddressToLocationsParams]
  }
}

