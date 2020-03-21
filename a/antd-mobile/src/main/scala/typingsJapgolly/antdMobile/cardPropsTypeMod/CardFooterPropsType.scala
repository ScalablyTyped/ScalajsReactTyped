package typingsJapgolly.antdMobile.cardPropsTypeMod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardFooterPropsType extends js.Object {
  var content: js.UndefOr[Node] = js.undefined
  var extra: js.UndefOr[Node] = js.undefined
}

object CardFooterPropsType {
  @scala.inline
  def apply(content: VdomNode = null, extra: VdomNode = null): CardFooterPropsType = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.rawNode.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardFooterPropsType]
  }
}

