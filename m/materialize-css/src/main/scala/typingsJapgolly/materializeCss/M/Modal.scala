package typingsJapgolly.materializeCss.M

import org.scalajs.dom.raw.Element
import typingsJapgolly.materializeCss.MElements
import typingsJapgolly.materializeCss.PartialModalOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("M.Modal")
@js.native
class Modal ()
  extends Component[ModalOptions]
     with Openable {
  /**
    * ID of the modal element
    */
  var id: String = js.native
  /* CompleteClass */
  override var isOpen: Boolean = js.native
  /* CompleteClass */
  override def close(): Unit = js.native
  /* CompleteClass */
  override def open(): Unit = js.native
}

/* static members */
@JSGlobal("M.Modal")
@js.native
object Modal extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): Modal = js.native
  /**
    * Init Modals
    */
  def init(els: MElements): js.Array[Modal] = js.native
  def init(els: MElements, options: PartialModalOptions): js.Array[Modal] = js.native
  /**
    * Init Modal
    */
  def init(els: typingsJapgolly.std.Element): Modal = js.native
  def init(els: typingsJapgolly.std.Element, options: PartialModalOptions): Modal = js.native
}

