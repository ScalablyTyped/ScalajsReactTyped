package typingsJapgolly.ejWebAll.ej.datavisualization

import org.scalajs.dom.raw.Element
import typingsJapgolly.ejWebAll.JQuery
import typingsJapgolly.ejWebAll.ej.Model
import typingsJapgolly.ejWebAll.ej.Widget_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.datavisualization.Barcode")
@js.native
class Barcode_ protected () extends Widget_ {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: Model) = this()
  def this(element: Element, options: Model) = this()
  var defaults: Model = js.native
  @JSName("model")
  var model_Barcode_ : Model = js.native
  /** To disable the barcode
    * @returns {void}
    */
  def disable(): Unit = js.native
  /** To enable the barcode
    * @returns {void}
    */
  def enable(): Unit = js.native
}

