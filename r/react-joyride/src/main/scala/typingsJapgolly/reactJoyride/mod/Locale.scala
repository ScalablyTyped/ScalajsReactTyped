package typingsJapgolly.reactJoyride.mod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Locale extends js.Object {
  var back: js.UndefOr[Node] = js.undefined
  var close: js.UndefOr[Node] = js.undefined
  var last: js.UndefOr[Node] = js.undefined
  var next: js.UndefOr[Node] = js.undefined
  var open: js.UndefOr[Node] = js.undefined
  var skip: js.UndefOr[Node] = js.undefined
}

object Locale {
  @scala.inline
  def apply(
    back: VdomNode = null,
    close: VdomNode = null,
    last: VdomNode = null,
    next: VdomNode = null,
    open: VdomNode = null,
    skip: VdomNode = null
  ): Locale = {
    val __obj = js.Dynamic.literal()
    if (back != null) __obj.updateDynamic("back")(back.rawNode.asInstanceOf[js.Any])
    if (close != null) __obj.updateDynamic("close")(close.rawNode.asInstanceOf[js.Any])
    if (last != null) __obj.updateDynamic("last")(last.rawNode.asInstanceOf[js.Any])
    if (next != null) __obj.updateDynamic("next")(next.rawNode.asInstanceOf[js.Any])
    if (open != null) __obj.updateDynamic("open")(open.rawNode.asInstanceOf[js.Any])
    if (skip != null) __obj.updateDynamic("skip")(skip.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Locale]
  }
}

