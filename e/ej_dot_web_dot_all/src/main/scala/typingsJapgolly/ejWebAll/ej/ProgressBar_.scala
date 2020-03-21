package typingsJapgolly.ejWebAll.ej

import org.scalajs.dom.raw.Element
import typingsJapgolly.ejWebAll.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.ProgressBar")
@js.native
class ProgressBar_ protected () extends Widget_ {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typingsJapgolly.ejWebAll.ej.ProgressBar.Model) = this()
  def this(element: Element, options: typingsJapgolly.ejWebAll.ej.ProgressBar.Model) = this()
  var defaults: typingsJapgolly.ejWebAll.ej.ProgressBar.Model = js.native
  @JSName("model")
  var model_ProgressBar_ : typingsJapgolly.ejWebAll.ej.ProgressBar.Model = js.native
  /** Disables the progressbar control
    * @returns {void}
    */
  def disable(): Unit = js.native
  /** Enables the progressbar control
    * @returns {void}
    */
  def enable(): Unit = js.native
  /** Returns the current progress value in percent.
    * @returns {number}
    */
  def getPercentage(): Double = js.native
  /** Returns the current progress value
    * @returns {number}
    */
  def getValue(): Double = js.native
}

