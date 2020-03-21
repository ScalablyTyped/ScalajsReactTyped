package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.arcgisJsApi.esri.ImageSymbolTableElementInfo
  - typingsJapgolly.arcgisJsApi.esri.SymbolTableElementInfo
*/
trait SymbolTableElementType extends js.Object

object SymbolTableElementType {
  @scala.inline
  def ImageSymbolTableElementInfo(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    opacity: Double,
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    src: String,
    height: Int | Double = null,
    label: String = null,
    width: Int | Double = null
  ): SymbolTableElementType = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SymbolTableElementType]
  }
  @scala.inline
  def SymbolTableElementInfo(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    label: String | RampTitle,
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    symbol: Symbol,
    preview: HTMLElement = null,
    size: Int | Double = null,
    value: js.Any = null
  ): SymbolTableElementType = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    if (preview != null) __obj.updateDynamic("preview")(preview.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SymbolTableElementType]
  }
}

