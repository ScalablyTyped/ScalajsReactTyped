package typingsJapgolly.cytoscape.mod.Css

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** https://developer.mozilla.org/en-US/docs/Web/CSS/font-style */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.cytoscape.cytoscapeStrings.normal
  - typingsJapgolly.cytoscape.cytoscapeStrings.italic
  - typingsJapgolly.cytoscape.cytoscapeStrings.oblique
*/
trait FontStyle extends js.Object

object FontStyle {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def italic: typingsJapgolly.cytoscape.cytoscapeStrings.italic = this.cast("italic")
  @scala.inline
  def normal: typingsJapgolly.cytoscape.cytoscapeStrings.normal = this.cast("normal")
  @scala.inline
  def oblique: typingsJapgolly.cytoscape.cytoscapeStrings.oblique = this.cast("oblique")
}

