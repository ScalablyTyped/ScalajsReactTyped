package typingsJapgolly.materializeCss.mod

import org.scalajs.dom.raw.Element
import typingsJapgolly.materializeCss.MElements
import typingsJapgolly.materializeCss.PartialChipsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", "Chips")
@js.native
class Chips ()
  extends typingsJapgolly.materializeCss.M.Chips

/* static members */
@JSImport("materialize-css", "Chips")
@js.native
object Chips extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typingsJapgolly.materializeCss.M.Chips = js.native
  /**
    * Init Chipses
    */
  def init(els: MElements): js.Array[typingsJapgolly.materializeCss.M.Chips] = js.native
  def init(els: MElements, options: PartialChipsOptions): js.Array[typingsJapgolly.materializeCss.M.Chips] = js.native
  /**
    * Init Chips
    */
  def init(els: typingsJapgolly.std.Element): typingsJapgolly.materializeCss.M.Chips = js.native
  def init(els: typingsJapgolly.std.Element, options: PartialChipsOptions): typingsJapgolly.materializeCss.M.Chips = js.native
}

