package typingsJapgolly.storybookAddonNotes.panelMod

import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotesLinkProps extends js.Object {
  var children: Element
  var href: String
}

object NotesLinkProps {
  @scala.inline
  def apply(children: VdomElement, href: String): NotesLinkProps = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotesLinkProps]
  }
}

