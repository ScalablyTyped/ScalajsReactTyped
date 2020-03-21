package typingsJapgolly.ejWebAll.ej

import org.scalajs.dom.raw.Element
import typingsJapgolly.ejWebAll.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.PivotTreeMap")
@js.native
class PivotTreeMap_ protected () extends Widget_ {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typingsJapgolly.ejWebAll.ej.PivotTreeMap.Model) = this()
  def this(element: Element, options: typingsJapgolly.ejWebAll.ej.PivotTreeMap.Model) = this()
  var defaults: typingsJapgolly.ejWebAll.ej.PivotTreeMap.Model = js.native
  @JSName("model")
  var model_PivotTreeMap_ : typingsJapgolly.ejWebAll.ej.PivotTreeMap.Model = js.native
  /** Performs an asynchronous HTTP (AJAX) request.
    * @returns {void}
    */
  def doAjaxPost(): Unit = js.native
  /** Performs an asynchronous HTTP (FullPost) submit.
    * @returns {void}
    */
  def doPostBack(): Unit = js.native
  /** Renders the control with the pivot engine obtained from OLAP cube.
    * @returns {void}
    */
  def generateJSON(): Unit = js.native
  /** Returns the JSON records formed to render the control.
    * @returns {any[]}
    */
  def getJSONRecords(): js.Array[_] = js.native
  /** Returns the OlapReport string maintained along with the axis elements information.
    * @returns {string}
    */
  def getOlapReport(): String = js.native
  /** This function receives the update from service-end, which would be utilized for rendering the widget.
    * @returns {void}
    */
  def renderControlSuccess(): Unit = js.native
  /** This function receives the JSON formatted datasource to render the PivotTreeMap control.
    * @returns {void}
    */
  def renderTreeMapFromJSON(): Unit = js.native
  /** Sets the JSON records to render the control.
    * @returns {void}
    */
  def setJSONRecords(): Unit = js.native
  /** Sets the OlapReport string along with the axis information and maintains it in a property.
    * @returns {void}
    */
  def setOlapReport(): Unit = js.native
}

