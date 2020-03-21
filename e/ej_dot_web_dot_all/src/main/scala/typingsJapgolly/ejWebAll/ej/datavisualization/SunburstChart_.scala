package typingsJapgolly.ejWebAll.ej.datavisualization

import org.scalajs.dom.raw.Element
import typingsJapgolly.ejWebAll.JQuery
import typingsJapgolly.ejWebAll.ej.Widget_
import typingsJapgolly.ejWebAll.ej.datavisualization.SunburstChart.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.datavisualization.SunburstChart")
@js.native
class SunburstChart_ protected () extends Widget_ {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: Model) = this()
  def this(element: Element, options: Model) = this()
  var defaults: Model = js.native
  @JSName("model")
  var model_SunburstChart_ : Model = js.native
  /** Redraws the entire sunburst. You can call this method whenever you update, add or remove points from the data source or whenever you want to refresh the UI.
    * @returns {void}
    */
  def redraw(): Unit = js.native
}

