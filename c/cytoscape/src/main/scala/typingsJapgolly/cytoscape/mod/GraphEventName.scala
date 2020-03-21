package typingsJapgolly.cytoscape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * These events are custom to Cytoscape.js, and they occur on the core.
  * http://js.cytoscape.org/#events/graph-events
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.cytoscape.cytoscapeStrings.layoutstart
  - typingsJapgolly.cytoscape.cytoscapeStrings.layoutready
  - typingsJapgolly.cytoscape.cytoscapeStrings.layoutstop
  - typingsJapgolly.cytoscape.cytoscapeStrings.ready
  - typingsJapgolly.cytoscape.cytoscapeStrings.destroy
  - typingsJapgolly.cytoscape.cytoscapeStrings.render
  - typingsJapgolly.cytoscape.cytoscapeStrings.pan
  - typingsJapgolly.cytoscape.cytoscapeStrings.zoom
  - typingsJapgolly.cytoscape.cytoscapeStrings.resize
*/
trait GraphEventName extends js.Object

object GraphEventName {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def destroy: typingsJapgolly.cytoscape.cytoscapeStrings.destroy = this.cast("destroy")
  @scala.inline
  def layoutready: typingsJapgolly.cytoscape.cytoscapeStrings.layoutready = this.cast("layoutready")
  @scala.inline
  def layoutstart: typingsJapgolly.cytoscape.cytoscapeStrings.layoutstart = this.cast("layoutstart")
  @scala.inline
  def layoutstop: typingsJapgolly.cytoscape.cytoscapeStrings.layoutstop = this.cast("layoutstop")
  @scala.inline
  def pan: typingsJapgolly.cytoscape.cytoscapeStrings.pan = this.cast("pan")
  @scala.inline
  def ready: typingsJapgolly.cytoscape.cytoscapeStrings.ready = this.cast("ready")
  @scala.inline
  def render: typingsJapgolly.cytoscape.cytoscapeStrings.render = this.cast("render")
  @scala.inline
  def resize: typingsJapgolly.cytoscape.cytoscapeStrings.resize = this.cast("resize")
  @scala.inline
  def zoom: typingsJapgolly.cytoscape.cytoscapeStrings.zoom = this.cast("zoom")
}

