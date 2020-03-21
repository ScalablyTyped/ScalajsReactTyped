package typingsJapgolly.officeUiFabricReact

import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSection extends js.Object {
  var section: Element
  var title: String
}

object AnonSection {
  @scala.inline
  def apply(section: VdomElement, title: String): AnonSection = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    if (section != null) __obj.updateDynamic("section")(section.rawElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSection]
  }
}

