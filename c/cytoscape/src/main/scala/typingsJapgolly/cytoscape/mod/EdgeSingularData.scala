package typingsJapgolly.cytoscape.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#collection/data
  */
trait EdgeSingularData extends js.Object {
  /**
    * Get whether the edge is a loop (i.e. source same as target).
    * http://js.cytoscape.org/#edge.isLoop
    */
  def isLoop(): Boolean
  /**
    * Get whether the edge is simple (i.e. source different than target).
    * http://js.cytoscape.org/#edge.isSimple
    */
  def isSimple(): Boolean
}

object EdgeSingularData {
  @scala.inline
  def apply(isLoop: CallbackTo[Boolean], isSimple: CallbackTo[Boolean]): EdgeSingularData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isLoop")(isLoop.toJsFn)
    __obj.updateDynamic("isSimple")(isSimple.toJsFn)
    __obj.asInstanceOf[EdgeSingularData]
  }
}

