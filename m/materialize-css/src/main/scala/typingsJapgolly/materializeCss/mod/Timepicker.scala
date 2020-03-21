package typingsJapgolly.materializeCss.mod

import org.scalajs.dom.raw.Element
import typingsJapgolly.materializeCss.MElements
import typingsJapgolly.materializeCss.PartialTimepickerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", "Timepicker")
@js.native
class Timepicker ()
  extends typingsJapgolly.materializeCss.M.Timepicker

/* static members */
@JSImport("materialize-css", "Timepicker")
@js.native
object Timepicker extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typingsJapgolly.materializeCss.M.Timepicker = js.native
  /**
    * Init Timepickers
    */
  def init(els: MElements): js.Array[typingsJapgolly.materializeCss.M.Timepicker] = js.native
  def init(els: MElements, options: PartialTimepickerOptions): js.Array[typingsJapgolly.materializeCss.M.Timepicker] = js.native
  /**
    * Init Timepicker
    */
  def init(els: typingsJapgolly.std.Element): typingsJapgolly.materializeCss.M.Timepicker = js.native
  def init(els: typingsJapgolly.std.Element, options: PartialTimepickerOptions): typingsJapgolly.materializeCss.M.Timepicker = js.native
}

