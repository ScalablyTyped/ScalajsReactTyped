package typingsJapgolly.cytoscape.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#collection/selection
  */
trait SingularSelection extends js.Object {
  /**
    * Get whether the element's selection state is mutable.
    * http://js.cytoscape.org/#ele.selectable
    */
  def selectable(): Boolean
  /**
    * Get whether the element is selected.
    * http://js.cytoscape.org/#ele.selected
    */
  def selected(): Boolean
}

object SingularSelection {
  @scala.inline
  def apply(selectable: CallbackTo[Boolean], selected: CallbackTo[Boolean]): SingularSelection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("selectable")(selectable.toJsFn)
    __obj.updateDynamic("selected")(selected.toJsFn)
    __obj.asInstanceOf[SingularSelection]
  }
}

