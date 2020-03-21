package typingsJapgolly.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlacesNearbyRequest extends js.Object {
  /**
    * A term to be matched against all content that Google has indexed for this place, including but not limited to
    * name, type, and address, as well as customer reviews and other third-party content.
    */
  var keyword: js.UndefOr[String] = js.undefined
  /**
    * The language code, indicating in which language the results should be returned, if possible.
    * Note that we often update supported languages so this list may not be exhaustive.
    */
  var language: js.UndefOr[Language] = js.undefined
  /** The latitude/longitude around which to retrieve place information. This must be specified as latitude,longitude. */
  var location: LatLng
  /**
    * Restricts results to only those places within the specified range.
    * Valid values range between 0 (most affordable) to 4 (most expensive), inclusive.
    * The exact amount indicated by a specific value will vary from region to region.
    */
  var maxprice: js.UndefOr[Double] = js.undefined
  /**
    * Restricts results to only those places within the specified range.
    * Valid values range between 0 (most affordable) to 4 (most expensive), inclusive.
    * The exact amount indicated by a specific value will vary from region to region.
    */
  var minprice: js.UndefOr[Double] = js.undefined
  /**
    * A term to be matched against all content that Google has indexed for this place.
    * Equivalent to `keyword`. The `name` field is no longer restricted to place names.
    * Values in this field are combined with values in the `keyword` field and passed as part of the same search string.
    * We recommend using only the `keyword` parameter for all search terms.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Returns only those places that are open for business at the time the query is sent.
    * Places that do not specify opening hours in the Google Places database will not be returned if you include this parameter in your query.
    */
  var opennow: js.UndefOr[Boolean] = js.undefined
  /**
    * Returns the next 20 results from a previously run search.
    * Setting a pagetoken parameter will execute a search with the same parameters used previously —
    * all parameters other than pagetoken will be ignored.
    */
  var pagetoken: js.UndefOr[String] = js.undefined
  /**
    * Defines the distance (in meters) within which to return place results.
    * The maximum allowed radius is 50 000 meters.
    * Note that `radius` must not be included if `rankby=distance` is specified.
    */
  var radius: js.UndefOr[Double] = js.undefined
  /**
    * Specifies the order in which results are listed.
    * Note that `rankby` must not be included if `radius` is specified.
    *
    * @default PlacesNearbyRanking.prominence
    */
  var rankby: js.UndefOr[PlacesNearbyRanking] = js.undefined
  /**
    * Restricts the results to places matching the specified type.
    * Only one type may be specified (if more than one type is provided, all types following the first entry are ignored).
    */
  var `type`: js.UndefOr[PlaceType1 | PlaceType2] = js.undefined
}

object PlacesNearbyRequest {
  @scala.inline
  def apply(
    location: LatLng,
    keyword: String = null,
    language: Language = null,
    maxprice: Int | Double = null,
    minprice: Int | Double = null,
    name: String = null,
    opennow: js.UndefOr[Boolean] = js.undefined,
    pagetoken: String = null,
    radius: Int | Double = null,
    rankby: PlacesNearbyRanking = null,
    `type`: PlaceType1 | PlaceType2 = null
  ): PlacesNearbyRequest = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any])
    if (keyword != null) __obj.updateDynamic("keyword")(keyword.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (maxprice != null) __obj.updateDynamic("maxprice")(maxprice.asInstanceOf[js.Any])
    if (minprice != null) __obj.updateDynamic("minprice")(minprice.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(opennow)) __obj.updateDynamic("opennow")(opennow.asInstanceOf[js.Any])
    if (pagetoken != null) __obj.updateDynamic("pagetoken")(pagetoken.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (rankby != null) __obj.updateDynamic("rankby")(rankby.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlacesNearbyRequest]
  }
}

