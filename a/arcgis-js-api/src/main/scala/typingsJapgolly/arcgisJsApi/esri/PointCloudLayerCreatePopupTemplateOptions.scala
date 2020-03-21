package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointCloudLayerCreatePopupTemplateOptions extends Object {
  /**
    * Field types to ignore when creating the popup. By default the `geometry`, `blob`, `raster`, `guid` and `xml` field types are ignored.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-PointCloudLayer.html#createPopupTemplate)
    */
  var ignoreFieldTypes: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The maximum number of fields to include in the popup template.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-PointCloudLayer.html#createPopupTemplate)
    *
    * @default 75
    */
  var maximumFields: js.UndefOr[Double] = js.undefined
}

object PointCloudLayerCreatePopupTemplateOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    ignoreFieldTypes: js.Array[String] = null,
    maximumFields: Int | Double = null
  ): PointCloudLayerCreatePopupTemplateOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    if (ignoreFieldTypes != null) __obj.updateDynamic("ignoreFieldTypes")(ignoreFieldTypes.asInstanceOf[js.Any])
    if (maximumFields != null) __obj.updateDynamic("maximumFields")(maximumFields.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointCloudLayerCreatePopupTemplateOptions]
  }
}

