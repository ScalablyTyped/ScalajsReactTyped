package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VisibleContentElements extends Object {
  /**
    * Indicates whether to display any [AttachmentsContent](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-AttachmentsContent.html) elements. Default is `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature.html#VisibleContentElements)
    */
  var attachments: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates whether to display any [FieldsContent](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-FieldsContent.html) elements. Default is `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature.html#VisibleContentElements)
    */
  var fields: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates whether to display any [MediaContent](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-MediaContent.html) elements. Default is `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature.html#VisibleContentElements)
    */
  var media: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates whether to display any [TextContent](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-TextContent.html) elements. Default is `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature.html#VisibleContentElements)
    */
  var text: js.UndefOr[Boolean] = js.undefined
}

object VisibleContentElements {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    attachments: js.UndefOr[Boolean] = js.undefined,
    fields: js.UndefOr[Boolean] = js.undefined,
    media: js.UndefOr[Boolean] = js.undefined,
    text: js.UndefOr[Boolean] = js.undefined
  ): VisibleContentElements = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    if (!js.isUndefined(attachments)) __obj.updateDynamic("attachments")(attachments.asInstanceOf[js.Any])
    if (!js.isUndefined(fields)) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (!js.isUndefined(media)) __obj.updateDynamic("media")(media.asInstanceOf[js.Any])
    if (!js.isUndefined(text)) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisibleContentElements]
  }
}

