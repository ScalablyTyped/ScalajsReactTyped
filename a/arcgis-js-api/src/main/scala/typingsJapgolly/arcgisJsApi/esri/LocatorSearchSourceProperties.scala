package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocatorSearchSourceProperties extends SearchSourceProperties {
  /**
    * A string array which limits the results to one or more categories. For example, `Populated Place` or `airport`. Only applicable when using the World Geocode Service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LocatorSearchSource.html#categories)
    */
  var categories: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Constricts search results to a specified country code. For example, `US` for United States or `SE` for Sweden. Only applies to the World Geocode Service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LocatorSearchSource.html#countryCode)
    */
  var countryCode: js.UndefOr[String] = js.undefined
  /**
    * Sets the scale of the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#scale) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#scale) for the resulting search result. This is useful if the locator service doesn’t return an extent with a scale.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LocatorSearchSource.html#defaultZoomScale)
    *
    * @default null
    */
  var defaultZoomScale: js.UndefOr[Double] = js.undefined
  /**
    * Define the type of location, either `"street"` or `"rooftop"`, of the point returned from the [World Geocoding Service](https://developers.arcgis.com/rest/geocode/api-reference/geocoding-category-filtering.htm).  **Possible Values:** rooftop | street | null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LocatorSearchSource.html#locationType)
    *
    * @default null
    */
  var locationType: js.UndefOr[String] = js.undefined
  /**
    * The locator task used to search. This is **required** and defaults to the [World Geocoding Service](https://developers.arcgis.com/rest/geocode/api-reference/geocoding-category-filtering.htm).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LocatorSearchSource.html#locator)
    */
  var locator: js.UndefOr[LocatorProperties] = js.undefined
  /**
    * The name of the source for display.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LocatorSearchSource.html#name)
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * A template string used to display multiple fields in a defined order when results are displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LocatorSearchSource.html#searchTemplate)
    */
  var searchTemplate: js.UndefOr[String] = js.undefined
  /**
    * The field name of the Single Line Address Field in the REST services directory for the locator service. Common values are `SingleLine` and `SingleLineFieldName`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LocatorSearchSource.html#singleLineFieldName)
    */
  var singleLineFieldName: js.UndefOr[String] = js.undefined
}

object LocatorSearchSourceProperties {
  @scala.inline
  def apply(
    autoNavigate: js.UndefOr[Boolean] = js.undefined,
    categories: js.Array[String] = null,
    countryCode: String = null,
    defaultZoomScale: Int | Double = null,
    filter: SearchSourceFilter = null,
    getResults: /* params */ js.Any => CallbackTo[js.Promise[js.Array[SearchResult]]] = null,
    getSuggestions: /* params */ js.Any => CallbackTo[js.Promise[js.Array[SuggestResult]]] = null,
    locationType: String = null,
    locator: LocatorProperties = null,
    maxResults: Int | Double = null,
    maxSuggestions: Int | Double = null,
    minSuggestCharacters: Int | Double = null,
    name: String = null,
    outFields: js.Array[String] = null,
    placeholder: String = null,
    popupEnabled: js.UndefOr[Boolean] = js.undefined,
    popupTemplate: PopupTemplateProperties = null,
    prefix: String = null,
    resultGraphicEnabled: js.UndefOr[Boolean] = js.undefined,
    resultSymbol: SymbolProperties = null,
    searchTemplate: String = null,
    singleLineFieldName: String = null,
    suffix: String = null,
    suggestionsEnabled: js.UndefOr[Boolean] = js.undefined,
    withinViewEnabled: js.UndefOr[Boolean] = js.undefined,
    zoomScale: Int | Double = null
  ): LocatorSearchSourceProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoNavigate)) __obj.updateDynamic("autoNavigate")(autoNavigate.asInstanceOf[js.Any])
    if (categories != null) __obj.updateDynamic("categories")(categories.asInstanceOf[js.Any])
    if (countryCode != null) __obj.updateDynamic("countryCode")(countryCode.asInstanceOf[js.Any])
    if (defaultZoomScale != null) __obj.updateDynamic("defaultZoomScale")(defaultZoomScale.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (getResults != null) __obj.updateDynamic("getResults")(js.Any.fromFunction1((t0: /* params */ js.Any) => getResults(t0).runNow()))
    if (getSuggestions != null) __obj.updateDynamic("getSuggestions")(js.Any.fromFunction1((t0: /* params */ js.Any) => getSuggestions(t0).runNow()))
    if (locationType != null) __obj.updateDynamic("locationType")(locationType.asInstanceOf[js.Any])
    if (locator != null) __obj.updateDynamic("locator")(locator.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (maxSuggestions != null) __obj.updateDynamic("maxSuggestions")(maxSuggestions.asInstanceOf[js.Any])
    if (minSuggestCharacters != null) __obj.updateDynamic("minSuggestCharacters")(minSuggestCharacters.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (outFields != null) __obj.updateDynamic("outFields")(outFields.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (!js.isUndefined(popupEnabled)) __obj.updateDynamic("popupEnabled")(popupEnabled.asInstanceOf[js.Any])
    if (popupTemplate != null) __obj.updateDynamic("popupTemplate")(popupTemplate.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (!js.isUndefined(resultGraphicEnabled)) __obj.updateDynamic("resultGraphicEnabled")(resultGraphicEnabled.asInstanceOf[js.Any])
    if (resultSymbol != null) __obj.updateDynamic("resultSymbol")(resultSymbol.asInstanceOf[js.Any])
    if (searchTemplate != null) __obj.updateDynamic("searchTemplate")(searchTemplate.asInstanceOf[js.Any])
    if (singleLineFieldName != null) __obj.updateDynamic("singleLineFieldName")(singleLineFieldName.asInstanceOf[js.Any])
    if (suffix != null) __obj.updateDynamic("suffix")(suffix.asInstanceOf[js.Any])
    if (!js.isUndefined(suggestionsEnabled)) __obj.updateDynamic("suggestionsEnabled")(suggestionsEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(withinViewEnabled)) __obj.updateDynamic("withinViewEnabled")(withinViewEnabled.asInstanceOf[js.Any])
    if (zoomScale != null) __obj.updateDynamic("zoomScale")(zoomScale.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocatorSearchSourceProperties]
  }
}

