package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeatureLayerApplyEditsEdits extends Object {
  /**
    * An array of attachments to be added. Applies only when the `options.globalIdUsed` parameter is set to `true`. User must provide [globalId](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#AttachmentEdit)s for all attachments to be added.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#applyEdits)
    */
  var addAttachments: js.UndefOr[js.Array[AttachmentEdit]] = js.undefined
  /**
    * An array or a [collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html) of features to be added. Values of non nullable fields must be provided when adding new features. Date fields must have [numeric](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/getTime) values representing universal time.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#applyEdits)
    */
  var addFeatures: js.UndefOr[js.Array[Graphic] | Collection[Graphic]] = js.undefined
  /**
    * An array of [globalId](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#AttachmentEdit)s for attachments to be deleted. Applies only when the `options.globalIdUsed` parameter is set to `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#applyEdits)
    */
  var deleteAttachments: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * An array or a [collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html) of features, or an array of objects with `objectId` or `globalId` of each feature to be deleted. When an array or collection of features is passed, each feature must have a valid [objectId](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#objectIdField). When an array of objects is used, each object must have a valid value set for `objectId` or `globalId` property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#applyEdits)
    */
  var deleteFeatures: js.UndefOr[(js.Array[_ | Graphic]) | Collection[Graphic]] = js.undefined
  /**
    * An array of attachments to be updated. Applies only when the `options.globalIdUsed` parameter is set to `true`. User must provide [globalId](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#AttachmentEdit)s for all attachments to be updated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#applyEdits)
    */
  var updateAttachments: js.UndefOr[js.Array[AttachmentEdit]] = js.undefined
  /**
    * An array or a [collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html) of features to be updated. Each feature must have valid [objectId](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#objectIdField). Values of non nullable fields must be provided when updating features. Date fields must have [numeric](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/getTime) values representing universal time.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#applyEdits)
    */
  var updateFeatures: js.UndefOr[js.Array[Graphic] | Collection[Graphic]] = js.undefined
}

object FeatureLayerApplyEditsEdits {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    addAttachments: js.Array[AttachmentEdit] = null,
    addFeatures: js.Array[Graphic] | Collection[Graphic] = null,
    deleteAttachments: js.Array[String] = null,
    deleteFeatures: (js.Array[_ | Graphic]) | Collection[Graphic] = null,
    updateAttachments: js.Array[AttachmentEdit] = null,
    updateFeatures: js.Array[Graphic] | Collection[Graphic] = null
  ): FeatureLayerApplyEditsEdits = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    if (addAttachments != null) __obj.updateDynamic("addAttachments")(addAttachments.asInstanceOf[js.Any])
    if (addFeatures != null) __obj.updateDynamic("addFeatures")(addFeatures.asInstanceOf[js.Any])
    if (deleteAttachments != null) __obj.updateDynamic("deleteAttachments")(deleteAttachments.asInstanceOf[js.Any])
    if (deleteFeatures != null) __obj.updateDynamic("deleteFeatures")(deleteFeatures.asInstanceOf[js.Any])
    if (updateAttachments != null) __obj.updateDynamic("updateAttachments")(updateAttachments.asInstanceOf[js.Any])
    if (updateFeatures != null) __obj.updateDynamic("updateFeatures")(updateFeatures.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureLayerApplyEditsEdits]
  }
}

