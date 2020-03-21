package typingsJapgolly.braftEditor

import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.braftEditor.mod.BuiltInControlType
import typingsJapgolly.braftEditor.mod.ControlType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKey extends ControlType {
  var key: BuiltInControlType
  var text: js.UndefOr[String | Node] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object AnonKey {
  @scala.inline
  def apply(key: BuiltInControlType, text: String | Node = null, title: String = null): AnonKey = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonKey]
  }
}

