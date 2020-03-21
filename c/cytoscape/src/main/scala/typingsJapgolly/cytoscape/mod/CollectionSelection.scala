package typingsJapgolly.cytoscape.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#collection/layout
  */
trait CollectionSelection extends js.Object {
  def deselect(): this.type
  /**
    * Make the elements selected (NB other elements outside the collection are not affected).
    * http://js.cytoscape.org/#eles.select
    */
  def select(): this.type
  /**
    * Make the selection states of the elements mutable.
    * http://js.cytoscape.org/#eles.selectify
    */
  def selectify(): this.type
  /**
    * Make the elements not selected (NB other elements outside the collection are not affected).
    * http://js.cytoscape.org/#eles.unselect
    */
  def unselect(): this.type
  /**
    * Make the selection states of the elements immutable.
    * http://js.cytoscape.org/#eles.unselectify
    */
  def unselectify(): this.type
}

object CollectionSelection {
  @scala.inline
  def apply(
    deselect: CallbackTo[CollectionSelection],
    select: CallbackTo[CollectionSelection],
    selectify: CallbackTo[CollectionSelection],
    unselect: CallbackTo[CollectionSelection],
    unselectify: CallbackTo[CollectionSelection]
  ): CollectionSelection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("deselect")(deselect.toJsFn)
    __obj.updateDynamic("select")(select.toJsFn)
    __obj.updateDynamic("selectify")(selectify.toJsFn)
    __obj.updateDynamic("unselect")(unselect.toJsFn)
    __obj.updateDynamic("unselectify")(unselectify.toJsFn)
    __obj.asInstanceOf[CollectionSelection]
  }
}

