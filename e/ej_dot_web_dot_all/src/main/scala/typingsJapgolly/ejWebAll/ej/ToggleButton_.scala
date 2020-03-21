package typingsJapgolly.ejWebAll.ej

import org.scalajs.dom.raw.Element
import typingsJapgolly.ejWebAll.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.ToggleButton")
@js.native
class ToggleButton_ protected () extends Widget_ {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typingsJapgolly.ejWebAll.ej.ToggleButton.Model) = this()
  def this(element: Element, options: typingsJapgolly.ejWebAll.ej.ToggleButton.Model) = this()
  var defaults: typingsJapgolly.ejWebAll.ej.ToggleButton.Model = js.native
  @JSName("model")
  var model_ToggleButton_ : typingsJapgolly.ejWebAll.ej.ToggleButton.Model = js.native
  /** To disable the ToggleButton to prevent all user interactions.
    * @returns {void}
    */
  def disable(): Unit = js.native
  /** To enable the ToggleButton.
    * @returns {void}
    */
  def enable(): Unit = js.native
}

