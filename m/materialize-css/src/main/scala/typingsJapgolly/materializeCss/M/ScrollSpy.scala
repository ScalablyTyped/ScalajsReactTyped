package typingsJapgolly.materializeCss.M

import org.scalajs.dom.raw.Element
import typingsJapgolly.materializeCss.MElements
import typingsJapgolly.materializeCss.PartialScrollSpyOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("M.ScrollSpy")
@js.native
class ScrollSpy () extends Component[ScrollSpyOptions]

/* static members */
@JSGlobal("M.ScrollSpy")
@js.native
object ScrollSpy extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): ScrollSpy = js.native
  /**
    * Init ScrollSpies
    */
  def init(els: MElements): js.Array[ScrollSpy] = js.native
  def init(els: MElements, options: PartialScrollSpyOptions): js.Array[ScrollSpy] = js.native
  /**
    * Init ScrollSpy
    */
  def init(els: typingsJapgolly.std.Element): ScrollSpy = js.native
  def init(els: typingsJapgolly.std.Element, options: PartialScrollSpyOptions): ScrollSpy = js.native
}

