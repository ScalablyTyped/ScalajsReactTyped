package typingsJapgolly.materializeCss.M

import org.scalajs.dom.raw.Element
import typingsJapgolly.materializeCss.MElements
import typingsJapgolly.materializeCss.PartialSidenavOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("M.Sidenav")
@js.native
class Sidenav ()
  extends Component[SidenavOptions]
     with Openable {
  /**
    * Describes if Sidenav is being dragged
    */
  var isDragged: Boolean = js.native
  /**
    * Describes if sidenav is fixed
    */
  var isFixed: Boolean = js.native
  /* CompleteClass */
  override var isOpen: Boolean = js.native
  /* CompleteClass */
  override def close(): Unit = js.native
  /* CompleteClass */
  override def open(): Unit = js.native
}

/* static members */
@JSGlobal("M.Sidenav")
@js.native
object Sidenav extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): Sidenav = js.native
  /**
    * Init Sidenavs
    */
  def init(els: MElements): js.Array[Sidenav] = js.native
  def init(els: MElements, options: PartialSidenavOptions): js.Array[Sidenav] = js.native
  /**
    * Init Sidenav
    */
  def init(els: typingsJapgolly.std.Element): Sidenav = js.native
  def init(els: typingsJapgolly.std.Element, options: PartialSidenavOptions): Sidenav = js.native
}

