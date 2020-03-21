package typingsJapgolly.antdMobile.actionSheetMod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShareOption extends js.Object {
  var icon: Node
  var title: String
}

object ShareOption {
  @scala.inline
  def apply(title: String, icon: VdomNode = null): ShareOption = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareOption]
  }
}

