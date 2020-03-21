package typingsJapgolly.cytoscape.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#eles.betweennessCentrality
  */
trait SearchBetweennessResult extends js.Object {
  /** returns the betweenness centrality of the specified node */
  def betweenness(node: NodeSingular): Double
  def betweennessNormalised(node: NodeSingular): Double
  /** returns the normalised betweenness centrality of the specified node */
  def betweennessNormalized(node: NodeSingular): Double
}

object SearchBetweennessResult {
  @scala.inline
  def apply(
    betweenness: NodeSingular => CallbackTo[Double],
    betweennessNormalised: NodeSingular => CallbackTo[Double],
    betweennessNormalized: NodeSingular => CallbackTo[Double]
  ): SearchBetweennessResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("betweenness")(js.Any.fromFunction1((t0: typingsJapgolly.cytoscape.mod.NodeSingular) => betweenness(t0).runNow()))
    __obj.updateDynamic("betweennessNormalised")(js.Any.fromFunction1((t0: typingsJapgolly.cytoscape.mod.NodeSingular) => betweennessNormalised(t0).runNow()))
    __obj.updateDynamic("betweennessNormalized")(js.Any.fromFunction1((t0: typingsJapgolly.cytoscape.mod.NodeSingular) => betweennessNormalized(t0).runNow()))
    __obj.asInstanceOf[SearchBetweennessResult]
  }
}

