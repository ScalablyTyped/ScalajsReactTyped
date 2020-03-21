package typingsJapgolly.cytoscape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * These are normal browser events that you can bind to via Cytoscape.js.
  * You can bind these events to the core and to collections.
  * http://js.cytoscape.org/#events/user-input-device-events
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.cytoscape.cytoscapeStrings.mousedown
  - typingsJapgolly.cytoscape.cytoscapeStrings.mouseup
  - typingsJapgolly.cytoscape.cytoscapeStrings.click
  - typingsJapgolly.cytoscape.cytoscapeStrings.mouseover
  - typingsJapgolly.cytoscape.cytoscapeStrings.mouseout
  - typingsJapgolly.cytoscape.cytoscapeStrings.mousemove
  - typingsJapgolly.cytoscape.cytoscapeStrings.touchstart
  - typingsJapgolly.cytoscape.cytoscapeStrings.touchmove
  - typingsJapgolly.cytoscape.cytoscapeStrings.touchend
*/
trait UserInputDeviceEventName extends js.Object

object UserInputDeviceEventName {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def click: typingsJapgolly.cytoscape.cytoscapeStrings.click = this.cast("click")
  @scala.inline
  def mousedown: typingsJapgolly.cytoscape.cytoscapeStrings.mousedown = this.cast("mousedown")
  @scala.inline
  def mousemove: typingsJapgolly.cytoscape.cytoscapeStrings.mousemove = this.cast("mousemove")
  @scala.inline
  def mouseout: typingsJapgolly.cytoscape.cytoscapeStrings.mouseout = this.cast("mouseout")
  @scala.inline
  def mouseover: typingsJapgolly.cytoscape.cytoscapeStrings.mouseover = this.cast("mouseover")
  @scala.inline
  def mouseup: typingsJapgolly.cytoscape.cytoscapeStrings.mouseup = this.cast("mouseup")
  @scala.inline
  def touchend: typingsJapgolly.cytoscape.cytoscapeStrings.touchend = this.cast("touchend")
  @scala.inline
  def touchmove: typingsJapgolly.cytoscape.cytoscapeStrings.touchmove = this.cast("touchmove")
  @scala.inline
  def touchstart: typingsJapgolly.cytoscape.cytoscapeStrings.touchstart = this.cast("touchstart")
}

