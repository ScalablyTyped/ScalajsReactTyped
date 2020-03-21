package typingsJapgolly.materializeCss.mod

import org.scalajs.dom.raw.Element
import typingsJapgolly.materializeCss.MElements
import typingsJapgolly.materializeCss.PartialPushpinOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", "Pushpin")
@js.native
class Pushpin ()
  extends typingsJapgolly.materializeCss.M.Pushpin

/* static members */
@JSImport("materialize-css", "Pushpin")
@js.native
object Pushpin extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typingsJapgolly.materializeCss.M.Pushpin = js.native
  /**
    * Init Pushpins
    */
  def init(els: MElements): js.Array[typingsJapgolly.materializeCss.M.Pushpin] = js.native
  def init(els: MElements, options: PartialPushpinOptions): js.Array[typingsJapgolly.materializeCss.M.Pushpin] = js.native
  /**
    * Init Pushpin
    */
  def init(els: typingsJapgolly.std.Element): typingsJapgolly.materializeCss.M.Pushpin = js.native
  def init(els: typingsJapgolly.std.Element, options: PartialPushpinOptions): typingsJapgolly.materializeCss.M.Pushpin = js.native
}

