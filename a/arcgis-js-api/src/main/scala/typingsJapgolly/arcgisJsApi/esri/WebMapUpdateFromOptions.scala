package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebMapUpdateFromOptions extends Object {
  /**
    * When `true`, the thumbnail will not be updated for the webmap. Defaults to `false`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#updateFrom)
    */
  var thumbnailExcluded: js.UndefOr[Boolean] = js.undefined
  /**
    * The size of the thumbnail. Defaults to 600x400 (ratio 1.5:1). Note that the thumbnail size may currently not be larger than the size of the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#updateFrom)
    */
  var thumbnailSize: js.UndefOr[WebMapUpdateFromOptionsThumbnailSize] = js.undefined
  /**
    * When `true`, the initial viewpoint of the view will be updated for the webmap. Defaults to `false`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#updateFrom)
    */
  var viewpointExcluded: js.UndefOr[Boolean] = js.undefined
}

object WebMapUpdateFromOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    thumbnailExcluded: js.UndefOr[Boolean] = js.undefined,
    thumbnailSize: WebMapUpdateFromOptionsThumbnailSize = null,
    viewpointExcluded: js.UndefOr[Boolean] = js.undefined
  ): WebMapUpdateFromOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    if (!js.isUndefined(thumbnailExcluded)) __obj.updateDynamic("thumbnailExcluded")(thumbnailExcluded.asInstanceOf[js.Any])
    if (thumbnailSize != null) __obj.updateDynamic("thumbnailSize")(thumbnailSize.asInstanceOf[js.Any])
    if (!js.isUndefined(viewpointExcluded)) __obj.updateDynamic("viewpointExcluded")(viewpointExcluded.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebMapUpdateFromOptions]
  }
}

