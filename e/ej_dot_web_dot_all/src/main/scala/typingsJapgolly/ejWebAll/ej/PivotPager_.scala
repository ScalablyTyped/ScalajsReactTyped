package typingsJapgolly.ejWebAll.ej

import org.scalajs.dom.raw.Element
import typingsJapgolly.ejWebAll.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.PivotPager")
@js.native
class PivotPager_ protected () extends Widget_ {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typingsJapgolly.ejWebAll.ej.PivotPager.Model) = this()
  def this(element: Element, options: typingsJapgolly.ejWebAll.ej.PivotPager.Model) = this()
  var defaults: typingsJapgolly.ejWebAll.ej.PivotPager.Model = js.native
  @JSName("model")
  var model_PivotPager_ : typingsJapgolly.ejWebAll.ej.PivotPager.Model = js.native
  /** This function initializes the page counts and page numbers for the PivotPager.
    * @returns {void}
    */
  def initPagerProperties(): Unit = js.native
}

