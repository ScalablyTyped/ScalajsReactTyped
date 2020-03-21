package typingsJapgolly.cytoscape.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#collection/metadata
  */
trait NodeCollectionMetadata extends js.Object {
  /**
    * Get the maximum degree of the nodes in the collection.
    * @param includeLoops A boolean, indicating whether loops are to be included in degree calculations.
    */
  def maxDegree(includeLoops: Boolean): Double
  /**
    * Get the maximum indegree of the nodes in the collection.
    * @param includeLoops A boolean, indicating whether loops are to be included in degree calculations.
    */
  def maxIndegree(includeLoops: Boolean): Double
  /**
    * Get the maximum outdegree of the nodes in the collection.
    * @param includeLoops A boolean, indicating whether loops are to be included in degree calculations.
    */
  def maxOutdegree(includeLoops: Boolean): Double
  /**
    * Get the minimum degree of the nodes in the collection.
    * @param includeLoops A boolean, indicating whether loops are to be included in degree calculations.
    */
  def minDegree(includeLoops: Boolean): Double
  /**
    * Get the minimum indegree of the nodes in the collection.
    * @param includeLoops A boolean, indicating whether loops are to be included in degree calculations.
    */
  def minIndegree(includeLoops: Boolean): Double
  /**
    * Get the minimum outdegree of the nodes in the collection.
    * @param includeLoops A boolean, indicating whether loops are to be included in degree calculations.
    */
  def minOutdegree(includeLoops: Boolean): Double
  /**
    * Get the total degree of a collection of nodes.
    * @param includeLoops A boolean, indicating whether loops are to be included in degree calculations.
    */
  def totalDegree(includeLoops: Boolean): Double
}

object NodeCollectionMetadata {
  @scala.inline
  def apply(
    maxDegree: Boolean => CallbackTo[Double],
    maxIndegree: Boolean => CallbackTo[Double],
    maxOutdegree: Boolean => CallbackTo[Double],
    minDegree: Boolean => CallbackTo[Double],
    minIndegree: Boolean => CallbackTo[Double],
    minOutdegree: Boolean => CallbackTo[Double],
    totalDegree: Boolean => CallbackTo[Double]
  ): NodeCollectionMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("maxDegree")(js.Any.fromFunction1((t0: scala.Boolean) => maxDegree(t0).runNow()))
    __obj.updateDynamic("maxIndegree")(js.Any.fromFunction1((t0: scala.Boolean) => maxIndegree(t0).runNow()))
    __obj.updateDynamic("maxOutdegree")(js.Any.fromFunction1((t0: scala.Boolean) => maxOutdegree(t0).runNow()))
    __obj.updateDynamic("minDegree")(js.Any.fromFunction1((t0: scala.Boolean) => minDegree(t0).runNow()))
    __obj.updateDynamic("minIndegree")(js.Any.fromFunction1((t0: scala.Boolean) => minIndegree(t0).runNow()))
    __obj.updateDynamic("minOutdegree")(js.Any.fromFunction1((t0: scala.Boolean) => minOutdegree(t0).runNow()))
    __obj.updateDynamic("totalDegree")(js.Any.fromFunction1((t0: scala.Boolean) => totalDegree(t0).runNow()))
    __obj.asInstanceOf[NodeCollectionMetadata]
  }
}

