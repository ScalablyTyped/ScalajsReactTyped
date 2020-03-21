package typingsJapgolly.ejWebAll.ej

import org.scalajs.dom.raw.Element
import typingsJapgolly.ejWebAll.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.Tile")
@js.native
class Tile_ protected () extends Widget_ {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typingsJapgolly.ejWebAll.ej.Tile.Model) = this()
  def this(element: Element, options: typingsJapgolly.ejWebAll.ej.Tile.Model) = this()
  var defaults: typingsJapgolly.ejWebAll.ej.Tile.Model = js.native
  @JSName("model")
  var model_Tile_ : typingsJapgolly.ejWebAll.ej.Tile.Model = js.native
  /** Update the image template of tile item to another one.
    * @param {string} UpdateTemplate by using id
    * @param {number} index of the tile
    * @returns {void}
    */
  def updateTemplate(id: String, index: Double): Unit = js.native
}

