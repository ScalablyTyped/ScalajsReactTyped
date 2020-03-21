package typingsJapgolly.oracleOraclejet.ojthematicmapMod.ojThematicMap

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.Element
import typingsJapgolly.oracleOraclejet.AnonFocused
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait RendererContext[K1, K2, K3, D1, D2, D3] extends js.Object {
  var color: String
  var componentElement: Element
  var data: js.Object
  var id: K1 | K2 | K3
  var itemData: D1 | D2 | D3
  var label: String
  var location: String | Null
  var parentElement: Element
  var previousState: AnonFocused
  var root: Element | Null
  var state: AnonFocused
  var x: Double | Null
  var y: Double | Null
  def renderDefaultFocus(): Unit
  def renderDefaultHover(): Unit
  def renderDefaultSelection(): Unit
}

object RendererContext {
  @scala.inline
  def apply[K1, K2, K3, D1, D2, D3](
    color: String,
    componentElement: Element,
    data: js.Object,
    id: K1 | K2 | K3,
    itemData: D1 | D2 | D3,
    label: String,
    parentElement: Element,
    previousState: AnonFocused,
    renderDefaultFocus: Callback,
    renderDefaultHover: Callback,
    renderDefaultSelection: Callback,
    state: AnonFocused,
    location: String = null,
    root: Element = null,
    x: Int | Double = null,
    y: Int | Double = null
  ): RendererContext[K1, K2, K3, D1, D2, D3] = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], componentElement = componentElement.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], itemData = itemData.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], parentElement = parentElement.asInstanceOf[js.Any], previousState = previousState.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.updateDynamic("renderDefaultFocus")(renderDefaultFocus.toJsFn)
    __obj.updateDynamic("renderDefaultHover")(renderDefaultHover.toJsFn)
    __obj.updateDynamic("renderDefaultSelection")(renderDefaultSelection.toJsFn)
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[RendererContext[K1, K2, K3, D1, D2, D3]]
  }
}

