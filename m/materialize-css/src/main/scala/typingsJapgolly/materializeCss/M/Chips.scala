package typingsJapgolly.materializeCss.M

import org.scalajs.dom.raw.Element
import typingsJapgolly.materializeCss.MElements
import typingsJapgolly.materializeCss.PartialChipsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("M.Chips")
@js.native
class Chips () extends Component[ChipsOptions] {
  /**
    * Autocomplete instance, if any
    */
  var autocomplete: Autocomplete = js.native
  /**
    * Array of the current chips data
    */
  var chipsData: js.Array[ChipData] = js.native
  /**
    * If the chips has autocomplete enabled
    */
  var hasAutocomplete: Boolean = js.native
  /**
    * Add chip to input
    * @param data Chip data object
    */
  def addChip(chip: ChipData): Unit = js.native
  /**
    * Delete nth chip
    * @param n  Index of chip
    */
  def deleteChip(): Unit = js.native
  def deleteChip(n: Double): Unit = js.native
  /**
    * Select nth chip
    * @param n Index of chip
    */
  def selectChip(n: Double): Unit = js.native
}

/* static members */
@JSGlobal("M.Chips")
@js.native
object Chips extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): Chips = js.native
  /**
    * Init Chipses
    */
  def init(els: MElements): js.Array[Chips] = js.native
  def init(els: MElements, options: PartialChipsOptions): js.Array[Chips] = js.native
  /**
    * Init Chips
    */
  def init(els: typingsJapgolly.std.Element): Chips = js.native
  def init(els: typingsJapgolly.std.Element, options: PartialChipsOptions): Chips = js.native
}

