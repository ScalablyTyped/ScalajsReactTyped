package typingsJapgolly.cytoscape.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#collection/metadata
  */
trait NodeSingularMetadata extends js.Object {
  /**
    * Get the degree of a node.
    * @param includeLoops A boolean, indicating whether loops are to be included in degree calculations.
    */
  def degree(includeLoops: Boolean): Double
  /**
    * Get the indegree of a node.
    * @param includeLoops A boolean, indicating whether loops are to be included in degree calculations.
    */
  def indegree(includeLoops: Boolean): Double
  /**
    * Get the outdegree of a node.
    * @param includeLoops A boolean, indicating whether loops are to be included in degree calculations.
    */
  def outdegree(includeLoops: Boolean): Double
}

object NodeSingularMetadata {
  @scala.inline
  def apply(
    degree: Boolean => CallbackTo[Double],
    indegree: Boolean => CallbackTo[Double],
    outdegree: Boolean => CallbackTo[Double]
  ): NodeSingularMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("degree")(js.Any.fromFunction1((t0: scala.Boolean) => degree(t0).runNow()))
    __obj.updateDynamic("indegree")(js.Any.fromFunction1((t0: scala.Boolean) => indegree(t0).runNow()))
    __obj.updateDynamic("outdegree")(js.Any.fromFunction1((t0: scala.Boolean) => outdegree(t0).runNow()))
    __obj.asInstanceOf[NodeSingularMetadata]
  }
}

