package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SizeRampElement
  extends Object
     with LegendElement {
  /**
    * The individual size stops rendered in the legend that correspond to the size visual variable in the renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#SizeRampElement)
    */
  var infos: js.Array[SizeRampStop]
  /**
    * The title of the size ramp as displayed in the legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#SizeRampElement)
    */
  var title: js.UndefOr[String | RampTitle] = js.undefined
  /**
    * The type of this element is always `size-ramp`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#SizeRampElement)
    */
  var `type`: String
}

object SizeRampElement {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    infos: js.Array[SizeRampStop],
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    `type`: String,
    title: String | RampTitle = null
  ): SizeRampElement = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], infos = infos.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[SizeRampElement]
  }
}

