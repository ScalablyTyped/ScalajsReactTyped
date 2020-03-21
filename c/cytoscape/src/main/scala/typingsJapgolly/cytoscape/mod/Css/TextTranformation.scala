package typingsJapgolly.cytoscape.mod.Css

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** http://js.cytoscape.org/#style/labels */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.cytoscape.cytoscapeStrings.none
  - typingsJapgolly.cytoscape.cytoscapeStrings.uppercase
  - typingsJapgolly.cytoscape.cytoscapeStrings.lowercase
*/
trait TextTranformation extends js.Object

object TextTranformation {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def lowercase: typingsJapgolly.cytoscape.cytoscapeStrings.lowercase = this.cast("lowercase")
  @scala.inline
  def none: typingsJapgolly.cytoscape.cytoscapeStrings.none = this.cast("none")
  @scala.inline
  def uppercase: typingsJapgolly.cytoscape.cytoscapeStrings.uppercase = this.cast("uppercase")
}

