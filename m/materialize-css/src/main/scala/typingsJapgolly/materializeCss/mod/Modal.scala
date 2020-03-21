package typingsJapgolly.materializeCss.mod

import org.scalajs.dom.raw.Element
import typingsJapgolly.materializeCss.MElements
import typingsJapgolly.materializeCss.PartialModalOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", "Modal")
@js.native
class Modal ()
  extends typingsJapgolly.materializeCss.M.Modal

/* static members */
@JSImport("materialize-css", "Modal")
@js.native
object Modal extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typingsJapgolly.materializeCss.M.Modal = js.native
  /**
    * Init Modals
    */
  def init(els: MElements): js.Array[typingsJapgolly.materializeCss.M.Modal] = js.native
  def init(els: MElements, options: PartialModalOptions): js.Array[typingsJapgolly.materializeCss.M.Modal] = js.native
  /**
    * Init Modal
    */
  def init(els: typingsJapgolly.std.Element): typingsJapgolly.materializeCss.M.Modal = js.native
  def init(els: typingsJapgolly.std.Element, options: PartialModalOptions): typingsJapgolly.materializeCss.M.Modal = js.native
}

