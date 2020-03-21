package typingsJapgolly.cytoscape.mod.Css

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The line style; may be solid, dotted, dashed, or double
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.cytoscape.cytoscapeStrings.solid
  - typingsJapgolly.cytoscape.cytoscapeStrings.dotted
  - typingsJapgolly.cytoscape.cytoscapeStrings.dashed
  - typingsJapgolly.cytoscape.cytoscapeStrings.double
*/
trait LineStyle extends js.Object

object LineStyle {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dashed: typingsJapgolly.cytoscape.cytoscapeStrings.dashed = this.cast("dashed")
  @scala.inline
  def dotted: typingsJapgolly.cytoscape.cytoscapeStrings.dotted = this.cast("dotted")
  @scala.inline
  def double: typingsJapgolly.cytoscape.cytoscapeStrings.double = this.cast("double")
  @scala.inline
  def solid: typingsJapgolly.cytoscape.cytoscapeStrings.solid = this.cast("solid")
}

