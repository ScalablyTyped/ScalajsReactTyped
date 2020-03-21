package typingsJapgolly.cytoscape.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#eles.pageRank
  */
trait SearchPageRankResult extends js.Object {
  /** function that computes the rank of a given node (either object or selector string) */
  def rank(node: NodeCollection): Double
}

object SearchPageRankResult {
  @scala.inline
  def apply(rank: NodeCollection => CallbackTo[Double]): SearchPageRankResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("rank")(js.Any.fromFunction1((t0: typingsJapgolly.cytoscape.mod.NodeCollection) => rank(t0).runNow()))
    __obj.asInstanceOf[SearchPageRankResult]
  }
}

