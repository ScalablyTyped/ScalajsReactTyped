package typingsJapgolly.antDesignReactNative.imageRollMod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageRollTexts extends js.Object {
  var cancelText: js.UndefOr[Node] = js.undefined
  var title: js.UndefOr[Node] = js.undefined
}

object ImageRollTexts {
  @scala.inline
  def apply(cancelText: VdomNode = null, title: VdomNode = null): ImageRollTexts = {
    val __obj = js.Dynamic.literal()
    if (cancelText != null) __obj.updateDynamic("cancelText")(cancelText.rawNode.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageRollTexts]
  }
}

