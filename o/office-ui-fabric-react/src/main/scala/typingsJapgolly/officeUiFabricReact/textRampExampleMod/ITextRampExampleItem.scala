package typingsJapgolly.officeUiFabricReact.textRampExampleMod

import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITextRampExampleItem extends js.Object {
  var example: Element
  var key: String
  var variant: String
}

object ITextRampExampleItem {
  @scala.inline
  def apply(example: VdomElement, key: String, variant: String): ITextRampExampleItem = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], variant = variant.asInstanceOf[js.Any])
    if (example != null) __obj.updateDynamic("example")(example.rawElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITextRampExampleItem]
  }
}

