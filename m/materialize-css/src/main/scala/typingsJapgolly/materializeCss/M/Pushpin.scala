package typingsJapgolly.materializeCss.M

import org.scalajs.dom.raw.Element
import typingsJapgolly.materializeCss.MElements
import typingsJapgolly.materializeCss.PartialPushpinOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("M.Pushpin")
@js.native
class Pushpin () extends Component[PushpinOptions] {
  /**
    * Original offsetTop of element
    */
  var originalOffset: Double = js.native
}

/* static members */
@JSGlobal("M.Pushpin")
@js.native
object Pushpin extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): Pushpin = js.native
  /**
    * Init Pushpins
    */
  def init(els: MElements): js.Array[Pushpin] = js.native
  def init(els: MElements, options: PartialPushpinOptions): js.Array[Pushpin] = js.native
  /**
    * Init Pushpin
    */
  def init(els: typingsJapgolly.std.Element): Pushpin = js.native
  def init(els: typingsJapgolly.std.Element, options: PartialPushpinOptions): Pushpin = js.native
}

