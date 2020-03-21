package typingsJapgolly.aframe.mod._Global_

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Node
import org.scalajs.dom.raw.NodeListOf
import typingsJapgolly.aframe.aframeStrings.`a-scene`
import typingsJapgolly.aframe.mod.Component
import typingsJapgolly.aframe.mod.Entity
import typingsJapgolly.aframe.mod.ObjectMap
import typingsJapgolly.aframe.mod.Scene
import typingsJapgolly.aframe.mod.System
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * Custom elements augment document methods to return custom HTML
	 */
@js.native
trait Document extends js.Object {
  def createElement(tagName: String): Entity[ObjectMap[Component[_, System[_]]]] = js.native
  def querySelector(selectors: String): Entity[_] = js.native
  def querySelectorAll(selectors: String): NodeListOf[(Entity[_] | Element) with Node] = js.native
  @JSName("querySelector")
  def querySelector_ascene(selectors: `a-scene`): Scene = js.native
}

