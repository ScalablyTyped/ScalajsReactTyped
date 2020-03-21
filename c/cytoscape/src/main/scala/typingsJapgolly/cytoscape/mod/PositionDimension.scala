package typingsJapgolly.cytoscape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 'x' : x coordinate
  * 'y' : y coordinate
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.cytoscape.cytoscapeStrings.x
  - typingsJapgolly.cytoscape.cytoscapeStrings.y
*/
trait PositionDimension extends js.Object

object PositionDimension {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def x: typingsJapgolly.cytoscape.cytoscapeStrings.x = this.cast("x")
  @scala.inline
  def y: typingsJapgolly.cytoscape.cytoscapeStrings.y = this.cast("y")
}

