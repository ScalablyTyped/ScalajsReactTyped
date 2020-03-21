package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachmentEdit extends Object {
  /**
    * The attachment to be added, updated or deleted.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#AttachmentEdit)
    */
  var attachment: AttachmentEditAttachment
  /**
    * The feature, `objectId` or `globalId` of feature associated with the attachment.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#AttachmentEdit)
    */
  var feature: Graphic | Double | String
}

object AttachmentEdit {
  @scala.inline
  def apply(
    attachment: AttachmentEditAttachment,
    constructor: js.Function,
    feature: Graphic | Double | String,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean]
  ): AttachmentEdit = {
    val __obj = js.Dynamic.literal(attachment = attachment.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], feature = feature.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    __obj.asInstanceOf[AttachmentEdit]
  }
}

