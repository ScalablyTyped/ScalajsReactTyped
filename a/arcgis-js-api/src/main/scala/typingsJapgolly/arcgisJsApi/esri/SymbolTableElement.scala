package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SymbolTableElement
  extends Object
     with LegendElement {
  /**
    * An array of each symbol/category/break rendered for the symbol table. For example, this may be individual breaks for a ClassBreaksRenderer, or unique values for a UniqueValueRenderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#SymbolTableElement)
    */
  var infos: js.Array[SymbolTableElementType]
  /**
    * Only used for renderers set to ImageryLayers. Indicates the type of renderer set on the layer (e.g. `stretched` or `Unique Values`).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#SymbolTableElement)
    */
  var legendType: js.UndefOr[String] = js.undefined
  /**
    * The title of the renderer as displayed in the legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#SymbolTableElement)
    */
  var title: js.UndefOr[String | RendererTitle] = js.undefined
  /**
    * The type of this element is always `symbol-table`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#SymbolTableElement)
    */
  var `type`: String
}

object SymbolTableElement {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    infos: js.Array[SymbolTableElementType],
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    `type`: String,
    legendType: String = null,
    title: String | RendererTitle = null
  ): SymbolTableElement = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], infos = infos.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (legendType != null) __obj.updateDynamic("legendType")(legendType.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[SymbolTableElement]
  }
}

