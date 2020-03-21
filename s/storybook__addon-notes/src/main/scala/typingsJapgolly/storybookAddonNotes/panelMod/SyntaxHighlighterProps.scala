package typingsJapgolly.storybookAddonNotes.panelMod

import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SyntaxHighlighterProps
  extends /* key */ StringDictionary[js.Any] {
  var children: Element
  var className: js.UndefOr[String] = js.undefined
}

object SyntaxHighlighterProps {
  @scala.inline
  def apply(
    children: VdomElement,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    className: String = null
  ): SyntaxHighlighterProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.rawElement.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyntaxHighlighterProps]
  }
}

