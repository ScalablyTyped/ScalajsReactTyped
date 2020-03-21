package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`default-curve-extension`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`keep-end-attributes`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`no-end-attributes`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`no-extend-at-from`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`no-extend-at-to`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`relocate-ends`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrimExtendParametersProperties extends js.Object {
  /**
    * A flag used with the `trimExtend` operation.
    *
    * Possible Value | Description
    * ---------------|-------------
    * default-curve-extension | The extension considers both ends of the path. The old ends remain and new points are added to the extended ends. The new points have attributes that are extrapolated from existing adjacent segments.
    * relocate-ends | When an extension is performed at an end, relocate the end point to the new position.
    * keep-end-attributes | When an extension is performed at an end, do not extrapolate the end segments attributes for the new point. Instead, the attributes will be the same as the current end.
    * no-end-attributes | When an extension is performed at an end, do not extrapolate the end segments attributes for the new point. Instead the attributes will be empty.
    * no-extend-at-from | Do not extend the 'from' end of any path.
    * no-extend-at-to | Do not extend the 'to' end of any path.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-TrimExtendParameters.html#extendHow)
    *
    * @default "default-curve-extension"
    */
  var extendHow: js.UndefOr[
    `default-curve-extension` | `relocate-ends` | `keep-end-attributes` | `no-end-attributes` | `no-extend-at-from` | `no-extend-at-to`
  ] = js.undefined
  /**
    * The array of polylines to trim or extend. The structure of each geometry in the array is the same as the structure of the JSON polyline objects returned by the ArcGIS REST API.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-TrimExtendParameters.html#polylines)
    */
  var polylines: js.UndefOr[js.Array[PolylineProperties]] = js.undefined
  /**
    * A polyline used as a guide for trimming or extending input polylines. The structure of the polyline is the same as the structure of the JSON polyline object returned by the ArcGIS REST API.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-TrimExtendParameters.html#trimExtendTo)
    */
  var trimExtendTo: js.UndefOr[PolylineProperties] = js.undefined
}

object TrimExtendParametersProperties {
  @scala.inline
  def apply(
    extendHow: `default-curve-extension` | `relocate-ends` | `keep-end-attributes` | `no-end-attributes` | `no-extend-at-from` | `no-extend-at-to` = null,
    polylines: js.Array[PolylineProperties] = null,
    trimExtendTo: PolylineProperties = null
  ): TrimExtendParametersProperties = {
    val __obj = js.Dynamic.literal()
    if (extendHow != null) __obj.updateDynamic("extendHow")(extendHow.asInstanceOf[js.Any])
    if (polylines != null) __obj.updateDynamic("polylines")(polylines.asInstanceOf[js.Any])
    if (trimExtendTo != null) __obj.updateDynamic("trimExtendTo")(trimExtendTo.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrimExtendParametersProperties]
  }
}

