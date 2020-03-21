package typingsJapgolly.ejWebAll.ej

import org.scalajs.dom.raw.Element
import typingsJapgolly.ejWebAll.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.Signature")
@js.native
class Signature_ protected () extends Widget_ {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typingsJapgolly.ejWebAll.ej.Signature.Model) = this()
  def this(element: Element, options: typingsJapgolly.ejWebAll.ej.Signature.Model) = this()
  var defaults: typingsJapgolly.ejWebAll.ej.Signature.Model = js.native
  @JSName("model")
  var model_Signature_ : typingsJapgolly.ejWebAll.ej.Signature.Model = js.native
  /** Clears the strokes in the signature.
    * @returns {void}
    */
  def clear(): Unit = js.native
  /** Disables the signature widget.
    * @returns {void}
    */
  def disable(): Unit = js.native
  /** Enables the signature widget.
    * @returns {void}
    */
  def enable(): Unit = js.native
  /** Hides the signature widget.
    * @returns {void}
    */
  def hide(): Unit = js.native
  /** redo the last drawn stroke of the signature
    * @returns {void}
    */
  def redo(): Unit = js.native
  /** Refreshes the Signature widget
    * @returns {void}
    */
  def refresh(): Unit = js.native
  /** used to save the drawn image.
    * @param {string} The file name of the signature to be downloaded.
    * @returns {void}
    */
  def save(Filename: String): Unit = js.native
  /** Used to Show the signature widget, if it is already hidden.
    * @returns {void}
    */
  def show(): Unit = js.native
  /** undo the last drawn stroke of the signature.
    * @returns {void}
    */
  def undo(): Unit = js.native
}

