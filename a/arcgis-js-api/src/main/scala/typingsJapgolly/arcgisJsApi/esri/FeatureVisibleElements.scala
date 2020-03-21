package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeatureVisibleElements extends Object {
  /**
    * Indicates whether content for the Feature displays, can also indicate the specific types of content elements by setting it via [VisibleContentElements](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature.html#VisibleContentElements). The default value is `true`, everything displays.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature.html#VisibleElements)
    */
  var content: js.UndefOr[Boolean | VisibleContentElements] = js.undefined
  /**
    * Indicates whether [lastEditInfo](esri-widgets-Feature-FeatureViewModel.html#lastEditInfo) is displayed within the feature. Default value is `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature.html#VisibleElements)
    */
  var lastEditInfo: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates whether the title associated with the feature displays. Default value is `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature.html#VisibleElements)
    */
  var title: js.UndefOr[Boolean] = js.undefined
}

object FeatureVisibleElements {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    content: Boolean | VisibleContentElements = null,
    lastEditInfo: js.UndefOr[Boolean] = js.undefined,
    title: js.UndefOr[Boolean] = js.undefined
  ): FeatureVisibleElements = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(lastEditInfo)) __obj.updateDynamic("lastEditInfo")(lastEditInfo.asInstanceOf[js.Any])
    if (!js.isUndefined(title)) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureVisibleElements]
  }
}

