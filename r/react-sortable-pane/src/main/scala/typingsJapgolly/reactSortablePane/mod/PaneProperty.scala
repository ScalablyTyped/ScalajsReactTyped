package typingsJapgolly.reactSortablePane.mod

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaneProperty extends js.Object {
  var key: PaneKey
  var ref: Element | Null
}

object PaneProperty {
  @scala.inline
  def apply(key: PaneKey = null, ref: Element = null): PaneProperty = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaneProperty]
  }
}

