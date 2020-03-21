package typingsJapgolly.reactToastNotifications

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.reactToastNotifications.mod.AppearanceTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAppearance extends js.Object {
  var appearance: AppearanceTypes
  var content: Node
  var id: String
}

object AnonAppearance {
  @scala.inline
  def apply(appearance: AppearanceTypes, id: String, content: VdomNode = null): AnonAppearance = {
    val __obj = js.Dynamic.literal(appearance = appearance.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAppearance]
  }
}

