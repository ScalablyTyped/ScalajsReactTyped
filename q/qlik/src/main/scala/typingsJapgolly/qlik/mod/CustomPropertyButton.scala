package typingsJapgolly.qlik.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.qlik.qlikStrings.array
import typingsJapgolly.qlik.qlikStrings.boolean
import typingsJapgolly.qlik.qlikStrings.button
import typingsJapgolly.qlik.qlikStrings.integer
import typingsJapgolly.qlik.qlikStrings.items
import typingsJapgolly.qlik.qlikStrings.number
import typingsJapgolly.qlik.qlikStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomPropertyButton
  extends CustomPropertyCommon
     with CustomProperty {
  var component: button
  def action(data: VisualizationOptions): Unit
}

object CustomPropertyButton {
  @scala.inline
  def apply(
    action: VisualizationOptions => Callback,
    component: button,
    label: String = null,
    ref: String = null,
    show: Boolean | ShowFunction = null,
    `type`: string | integer | number | array | boolean | items = null
  ): CustomPropertyButton = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.updateDynamic("action")(js.Any.fromFunction1((t0: typingsJapgolly.qlik.mod.VisualizationOptions) => action(t0).runNow()))
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomPropertyButton]
  }
}

