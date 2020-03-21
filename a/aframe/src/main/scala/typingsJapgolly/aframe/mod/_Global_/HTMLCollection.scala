package typingsJapgolly.aframe.mod._Global_

import org.scalajs.dom.raw.Element
import typingsJapgolly.aframe.mod.Component
import typingsJapgolly.aframe.mod.Entity
import typingsJapgolly.aframe.mod.ObjectMap
import typingsJapgolly.aframe.mod.System
import typingsJapgolly.std.HTMLCollectionBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLCollection extends HTMLCollectionBase {
  /**
  		 * Retrieves a select object or an object from an options collection.
  		 */
  def namedItem(name: String): Element | (Entity[ObjectMap[Component[_, System[_]]]]) | Null = js.native
}

