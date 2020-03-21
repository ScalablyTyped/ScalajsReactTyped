package typingsJapgolly.cytoscape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#eles.degreeCentrality
  */
trait SearchDegreeCentralityResultUndirected extends js.Object {
  /** the degree centrality of the root node */
  var degree: Double
}

object SearchDegreeCentralityResultUndirected {
  @scala.inline
  def apply(degree: Double): SearchDegreeCentralityResultUndirected = {
    val __obj = js.Dynamic.literal(degree = degree.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SearchDegreeCentralityResultUndirected]
  }
}

