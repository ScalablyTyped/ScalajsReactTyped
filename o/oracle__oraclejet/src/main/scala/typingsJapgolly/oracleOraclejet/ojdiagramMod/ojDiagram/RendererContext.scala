package typingsJapgolly.oracleOraclejet.ojdiagramMod.ojDiagram

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.Element
import typingsJapgolly.oracleOraclejet.AnonElementHeight
import typingsJapgolly.oracleOraclejet.AnonExpanded
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait RendererContext[K1, D1] extends js.Object {
  var componentElement: Element
  var content: AnonElementHeight
  var data: js.Object
  var id: K1
  var itemData: D1
  var parentElement: Element
  var previousState: AnonExpanded
  var state: AnonExpanded
  var `type`: String
  def renderDefaultFocus(): Unit
  def renderDefaultHover(): Unit
  def renderDefaultSelection(): Unit
}

object RendererContext {
  @scala.inline
  def apply[K1, D1](
    componentElement: Element,
    content: AnonElementHeight,
    data: js.Object,
    id: K1,
    itemData: D1,
    parentElement: Element,
    previousState: AnonExpanded,
    renderDefaultFocus: Callback,
    renderDefaultHover: Callback,
    renderDefaultSelection: Callback,
    state: AnonExpanded,
    `type`: String
  ): RendererContext[K1, D1] = {
    val __obj = js.Dynamic.literal(componentElement = componentElement.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], itemData = itemData.asInstanceOf[js.Any], parentElement = parentElement.asInstanceOf[js.Any], previousState = previousState.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.updateDynamic("renderDefaultFocus")(renderDefaultFocus.toJsFn)
    __obj.updateDynamic("renderDefaultHover")(renderDefaultHover.toJsFn)
    __obj.updateDynamic("renderDefaultSelection")(renderDefaultSelection.toJsFn)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RendererContext[K1, D1]]
  }
}

