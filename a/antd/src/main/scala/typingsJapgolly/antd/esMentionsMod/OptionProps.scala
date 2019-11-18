package typingsJapgolly.antd.esMentionsMod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionProps
  extends /* key */ StringDictionary[js.Any] {
  var children: Node
  var value: String
}

object OptionProps {
  @scala.inline
  def apply(children: VdomNode, value: String, StringDictionary: /* key */ StringDictionary[js.Any] = null): OptionProps = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[OptionProps]
  }
}

