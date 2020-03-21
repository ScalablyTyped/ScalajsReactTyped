package typingsJapgolly.cytoscape.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeCollectionLayout extends js.Object {
  /**
    * Position the nodes for a discrete/synchronous layout.
    * http://js.cytoscape.org/#nodes.layoutPositions
    * @param layout The layout.
    * @param options The layout options object.
    */
  def layoutPositions(layout: String, options: LayoutPositionOptions, handler: ElementPositionFunction): Unit
}

object NodeCollectionLayout {
  @scala.inline
  def apply(layoutPositions: (String, LayoutPositionOptions, ElementPositionFunction) => Callback): NodeCollectionLayout = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("layoutPositions")(js.Any.fromFunction3((t0: java.lang.String, t1: typingsJapgolly.cytoscape.mod.LayoutPositionOptions, t2: typingsJapgolly.cytoscape.mod.ElementPositionFunction) => layoutPositions(t0, t1, t2).runNow()))
    __obj.asInstanceOf[NodeCollectionLayout]
  }
}

