package typingsJapgolly.materializeCss.mod

import org.scalajs.dom.raw.Element
import typingsJapgolly.materializeCss.MElements
import typingsJapgolly.materializeCss.PartialScrollSpyOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", "ScrollSpy")
@js.native
class ScrollSpy ()
  extends typingsJapgolly.materializeCss.M.ScrollSpy

/* static members */
@JSImport("materialize-css", "ScrollSpy")
@js.native
object ScrollSpy extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typingsJapgolly.materializeCss.M.ScrollSpy = js.native
  /**
    * Init ScrollSpies
    */
  def init(els: MElements): js.Array[typingsJapgolly.materializeCss.M.ScrollSpy] = js.native
  def init(els: MElements, options: PartialScrollSpyOptions): js.Array[typingsJapgolly.materializeCss.M.ScrollSpy] = js.native
  /**
    * Init ScrollSpy
    */
  def init(els: typingsJapgolly.std.Element): typingsJapgolly.materializeCss.M.ScrollSpy = js.native
  def init(els: typingsJapgolly.std.Element, options: PartialScrollSpyOptions): typingsJapgolly.materializeCss.M.ScrollSpy = js.native
}

