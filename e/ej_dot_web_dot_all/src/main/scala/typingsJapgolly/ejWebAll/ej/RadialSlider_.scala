package typingsJapgolly.ejWebAll.ej

import org.scalajs.dom.raw.Element
import typingsJapgolly.ejWebAll.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.RadialSlider")
@js.native
class RadialSlider_ protected () extends Widget_ {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typingsJapgolly.ejWebAll.ej.RadialSlider.Model) = this()
  def this(element: Element, options: typingsJapgolly.ejWebAll.ej.RadialSlider.Model) = this()
  var defaults: typingsJapgolly.ejWebAll.ej.RadialSlider.Model = js.native
  @JSName("model")
  var model_RadialSlider_ : typingsJapgolly.ejWebAll.ej.RadialSlider.Model = js.native
  /** To hide the radialslider
    * @returns {void}
    */
  def hide(): Unit = js.native
  /** To show the radialslider
    * @returns {void}
    */
  def show(): Unit = js.native
}

