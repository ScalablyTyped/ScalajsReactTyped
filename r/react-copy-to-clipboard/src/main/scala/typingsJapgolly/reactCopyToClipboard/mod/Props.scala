package typingsJapgolly.reactCopyToClipboard.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var children: Node
  var onCopy: js.UndefOr[js.Function2[/* text */ String, /* result */ Boolean, Unit]] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var text: String
}

object Props {
  @scala.inline
  def apply(
    text: String,
    children: VdomNode = null,
    onCopy: (/* text */ String, /* result */ Boolean) => Callback = null,
    options: Options = null
  ): Props = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (onCopy != null) __obj.updateDynamic("onCopy")(js.Any.fromFunction2((t0: /* text */ java.lang.String, t1: /* result */ scala.Boolean) => onCopy(t0, t1).runNow()))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

