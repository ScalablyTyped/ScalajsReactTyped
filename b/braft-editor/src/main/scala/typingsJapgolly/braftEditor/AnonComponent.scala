package typingsJapgolly.braftEditor

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.braftEditor.braftEditorStrings.component
import typingsJapgolly.braftEditor.mod.ExtendControlType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonComponent extends ExtendControlType {
  var component: Node
  var key: String
  var `type`: component
}

object AnonComponent {
  @scala.inline
  def apply(key: String, `type`: component, component: VdomNode = null): AnonComponent = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonComponent]
  }
}

