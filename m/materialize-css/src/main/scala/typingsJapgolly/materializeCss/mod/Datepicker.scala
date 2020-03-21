package typingsJapgolly.materializeCss.mod

import org.scalajs.dom.raw.Element
import typingsJapgolly.materializeCss.MElements
import typingsJapgolly.materializeCss.PartialDatepickerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", "Datepicker")
@js.native
class Datepicker ()
  extends typingsJapgolly.materializeCss.M.Datepicker

/* static members */
@JSImport("materialize-css", "Datepicker")
@js.native
object Datepicker extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typingsJapgolly.materializeCss.M.Datepicker = js.native
  /**
    * Init Datepickers
    */
  def init(els: MElements): js.Array[typingsJapgolly.materializeCss.M.Datepicker] = js.native
  def init(els: MElements, options: PartialDatepickerOptions): js.Array[typingsJapgolly.materializeCss.M.Datepicker] = js.native
  /**
    * Init Datepicker
    */
  def init(els: typingsJapgolly.std.Element): typingsJapgolly.materializeCss.M.Datepicker = js.native
  def init(els: typingsJapgolly.std.Element, options: PartialDatepickerOptions): typingsJapgolly.materializeCss.M.Datepicker = js.native
}

