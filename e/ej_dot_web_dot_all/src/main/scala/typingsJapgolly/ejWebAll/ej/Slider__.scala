package typingsJapgolly.ejWebAll.ej

import org.scalajs.dom.raw.Element
import typingsJapgolly.ejWebAll.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.Slider")
@js.native
class Slider__ protected () extends Widget_ {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typingsJapgolly.ejWebAll.ej.Slider_.Model) = this()
  def this(element: Element, options: typingsJapgolly.ejWebAll.ej.Slider_.Model) = this()
  var defaults: typingsJapgolly.ejWebAll.ej.Slider_.Model = js.native
  @JSName("model")
  var model_Slider__ : typingsJapgolly.ejWebAll.ej.Slider_.Model = js.native
  /** To disable the slider
    * @returns {void}
    */
  def disable(): Unit = js.native
  /** To enable the slider
    * @returns {void}
    */
  def enable(): Unit = js.native
  /** To get value from slider handle
    * @returns {number}
    */
  def getValue(): Double = js.native
  /** To set value to slider handle.By default animation is false while set the value. If you want to enable the animation, pass the enableAnimation as true to this method.
    * @returns {void}
    */
  def setValue(): Unit = js.native
}

