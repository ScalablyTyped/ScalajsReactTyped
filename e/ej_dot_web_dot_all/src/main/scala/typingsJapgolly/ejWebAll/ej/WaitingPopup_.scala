package typingsJapgolly.ejWebAll.ej

import org.scalajs.dom.raw.Element
import typingsJapgolly.ejWebAll.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.WaitingPopup")
@js.native
class WaitingPopup_ protected () extends Widget_ {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typingsJapgolly.ejWebAll.ej.WaitingPopup.Model) = this()
  def this(element: Element, options: typingsJapgolly.ejWebAll.ej.WaitingPopup.Model) = this()
  var defaults: typingsJapgolly.ejWebAll.ej.WaitingPopup.Model = js.native
  @JSName("model")
  var model_WaitingPopup_ : typingsJapgolly.ejWebAll.ej.WaitingPopup.Model = js.native
  /** To hide the waiting popup
    * @returns {void}
    */
  def hide(): Unit = js.native
  /** Refreshes the WaitingPopup control by resetting the pop-up panel position and content position
    * @returns {void}
    */
  def refresh(): Unit = js.native
  /** To show the waiting popup
    * @returns {void}
    */
  def show(): Unit = js.native
}

