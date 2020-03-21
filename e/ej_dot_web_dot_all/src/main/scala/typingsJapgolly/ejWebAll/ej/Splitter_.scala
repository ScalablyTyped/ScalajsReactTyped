package typingsJapgolly.ejWebAll.ej

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.ejWebAll.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.Splitter")
@js.native
class Splitter_ protected () extends Widget_ {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typingsJapgolly.ejWebAll.ej.Splitter.Model) = this()
  def this(element: Element, options: typingsJapgolly.ejWebAll.ej.Splitter.Model) = this()
  var defaults: typingsJapgolly.ejWebAll.ej.Splitter.Model = js.native
  @JSName("model")
  var model_Splitter_ : typingsJapgolly.ejWebAll.ej.Splitter.Model = js.native
  /** To add a new pane to splitter control.
    * @param {string} content of pane.
    * @param {any} pane properties.
    * @param {number} index of pane.
    * @returns {HTMLElement}
    */
  def addItem(content: String, property: js.Any, index: Double): HTMLElement = js.native
  /** To collapse the splitter control pane.
    * @param {number} index number of pane.
    * @returns {void}
    */
  def collapse(paneIndex: Double): Unit = js.native
  /** To expand the splitter control pane.
    * @param {number} index number of pane.
    * @returns {void}
    */
  def expand(paneIndex: Double): Unit = js.native
  /** To refresh the splitter control pane resizing.
    * @returns {void}
    */
  def refresh(): Unit = js.native
  /** To remove a specified pane from the splitter control.
    * @param {number} index of pane.
    * @returns {void}
    */
  def removeItem(index: Double): Unit = js.native
}

