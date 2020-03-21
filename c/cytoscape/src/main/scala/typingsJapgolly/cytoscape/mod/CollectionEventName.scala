package typingsJapgolly.cytoscape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * These events are custom to Cytoscape.js. You can bind to these events for collections.
  * http://js.cytoscape.org/#events/collection-events
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.cytoscape.cytoscapeStrings.add
  - typingsJapgolly.cytoscape.cytoscapeStrings.remove
  - typingsJapgolly.cytoscape.cytoscapeStrings.select
  - typingsJapgolly.cytoscape.cytoscapeStrings.unselect
  - typingsJapgolly.cytoscape.cytoscapeStrings.lock
  - typingsJapgolly.cytoscape.cytoscapeStrings.unlock
  - typingsJapgolly.cytoscape.cytoscapeStrings.grabon
  - typingsJapgolly.cytoscape.cytoscapeStrings.grab
  - typingsJapgolly.cytoscape.cytoscapeStrings.drag
  - typingsJapgolly.cytoscape.cytoscapeStrings.free
  - typingsJapgolly.cytoscape.cytoscapeStrings.position
  - typingsJapgolly.cytoscape.cytoscapeStrings.data
  - typingsJapgolly.cytoscape.cytoscapeStrings.scratch
  - typingsJapgolly.cytoscape.cytoscapeStrings.style
*/
trait CollectionEventName extends js.Object

object CollectionEventName {
  @scala.inline
  def add: typingsJapgolly.cytoscape.cytoscapeStrings.add = this.cast("add")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def data: typingsJapgolly.cytoscape.cytoscapeStrings.data = this.cast("data")
  @scala.inline
  def drag: typingsJapgolly.cytoscape.cytoscapeStrings.drag = this.cast("drag")
  @scala.inline
  def free: typingsJapgolly.cytoscape.cytoscapeStrings.free = this.cast("free")
  @scala.inline
  def grab: typingsJapgolly.cytoscape.cytoscapeStrings.grab = this.cast("grab")
  @scala.inline
  def grabon: typingsJapgolly.cytoscape.cytoscapeStrings.grabon = this.cast("grabon")
  @scala.inline
  def lock: typingsJapgolly.cytoscape.cytoscapeStrings.lock = this.cast("lock")
  @scala.inline
  def position: typingsJapgolly.cytoscape.cytoscapeStrings.position = this.cast("position")
  @scala.inline
  def remove: typingsJapgolly.cytoscape.cytoscapeStrings.remove = this.cast("remove")
  @scala.inline
  def scratch: typingsJapgolly.cytoscape.cytoscapeStrings.scratch = this.cast("scratch")
  @scala.inline
  def select: typingsJapgolly.cytoscape.cytoscapeStrings.select = this.cast("select")
  @scala.inline
  def style: typingsJapgolly.cytoscape.cytoscapeStrings.style = this.cast("style")
  @scala.inline
  def unlock: typingsJapgolly.cytoscape.cytoscapeStrings.unlock = this.cast("unlock")
  @scala.inline
  def unselect: typingsJapgolly.cytoscape.cytoscapeStrings.unselect = this.cast("unselect")
}

