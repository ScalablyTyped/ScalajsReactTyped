package typingsJapgolly.openlayers.mod.olx.control

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Node
import typingsJapgolly.openlayers.mod.Collection
import typingsJapgolly.openlayers.mod.MapEvent
import typingsJapgolly.openlayers.mod.View
import typingsJapgolly.openlayers.mod.layer.Layer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OverviewMapOptions extends js.Object {
  var collapseLabel: js.UndefOr[String | Node] = js.undefined
  var collapsed: js.UndefOr[Boolean] = js.undefined
  var collapsible: js.UndefOr[Boolean] = js.undefined
  var label: js.UndefOr[String | Node] = js.undefined
  var layers: js.UndefOr[js.Array[Layer] | Collection[Layer]] = js.undefined
  var render: js.UndefOr[js.Function1[/* event */ MapEvent, _]] = js.undefined
  var target: js.UndefOr[Element] = js.undefined
  var tipLabel: js.UndefOr[String] = js.undefined
  var view: js.UndefOr[View] = js.undefined
}

object OverviewMapOptions {
  @scala.inline
  def apply(
    collapseLabel: String | Node = null,
    collapsed: js.UndefOr[Boolean] = js.undefined,
    collapsible: js.UndefOr[Boolean] = js.undefined,
    label: String | Node = null,
    layers: js.Array[Layer] | Collection[Layer] = null,
    render: /* event */ MapEvent => CallbackTo[js.Any] = null,
    target: Element = null,
    tipLabel: String = null,
    view: View = null
  ): OverviewMapOptions = {
    val __obj = js.Dynamic.literal()
    if (collapseLabel != null) __obj.updateDynamic("collapseLabel")(collapseLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(collapsed)) __obj.updateDynamic("collapsed")(collapsed.asInstanceOf[js.Any])
    if (!js.isUndefined(collapsible)) __obj.updateDynamic("collapsible")(collapsible.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (layers != null) __obj.updateDynamic("layers")(layers.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.openlayers.mod.MapEvent) => render(t0).runNow()))
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (tipLabel != null) __obj.updateDynamic("tipLabel")(tipLabel.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverviewMapOptions]
  }
}

