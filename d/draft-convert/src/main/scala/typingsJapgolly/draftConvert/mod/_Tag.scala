package typingsJapgolly.draftConvert.mod

import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Tag extends js.Object

object _Tag {
  @scala.inline
  def AnonEmpty(end: String, start: String, empty: String = null): _Tag = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    if (empty != null) __obj.updateDynamic("empty")(empty.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Tag]
  }
  @scala.inline
  def AnonElement(element: VdomNode = null, empty: VdomNode = null): _Tag = {
    val __obj = js.Dynamic.literal()
    if (element != null) __obj.updateDynamic("element")(element.rawNode.asInstanceOf[js.Any])
    if (empty != null) __obj.updateDynamic("empty")(empty.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Tag]
  }
}

