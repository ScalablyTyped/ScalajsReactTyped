package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SlideVisibleLayersProperties extends Object {
  /**
    * The ID of a [layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html#id) in the [WebScene](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#layers) or [Ground](https://developers.arcgis.com/javascript/latest/api-reference/esri-Ground.html#layers) that is made `visible` in the [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) when the slide is applied to the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#visibleLayers)
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * The service ids of the visible sublayers on the layer specified by the layer id. If this is not present, the visibilities of the sublayers are not changed when applying the slide.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#visibleLayers)
    */
  var sublayerIds: js.UndefOr[js.Array[Double]] = js.undefined
}

object SlideVisibleLayersProperties {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    id: String = null,
    sublayerIds: js.Array[Double] = null
  ): SlideVisibleLayersProperties = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (sublayerIds != null) __obj.updateDynamic("sublayerIds")(sublayerIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlideVisibleLayersProperties]
  }
}

