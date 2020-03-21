package typingsJapgolly.dplayer.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DPlayerContextMenuItem extends js.Object {
  var click: js.UndefOr[js.Function0[Unit]] = js.undefined
  var link: js.UndefOr[String] = js.undefined
  var text: String
}

object DPlayerContextMenuItem {
  @scala.inline
  def apply(text: String, click: js.UndefOr[Callback] = js.undefined, link: String = null): DPlayerContextMenuItem = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    click.foreach(p => __obj.updateDynamic("click")(p.toJsFn))
    if (link != null) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    __obj.asInstanceOf[DPlayerContextMenuItem]
  }
}

