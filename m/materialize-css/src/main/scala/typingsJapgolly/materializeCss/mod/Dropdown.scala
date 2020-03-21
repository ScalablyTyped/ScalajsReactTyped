package typingsJapgolly.materializeCss.mod

import org.scalajs.dom.raw.Element
import typingsJapgolly.materializeCss.MElements
import typingsJapgolly.materializeCss.PartialDropdownOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", "Dropdown")
@js.native
class Dropdown ()
  extends typingsJapgolly.materializeCss.M.Dropdown

/* static members */
@JSImport("materialize-css", "Dropdown")
@js.native
object Dropdown extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typingsJapgolly.materializeCss.M.Dropdown = js.native
  /**
    * Init Dropdowns
    */
  def init(els: MElements): js.Array[typingsJapgolly.materializeCss.M.Dropdown] = js.native
  def init(els: MElements, options: PartialDropdownOptions): js.Array[typingsJapgolly.materializeCss.M.Dropdown] = js.native
  /**
    * Init Dropdown
    */
  def init(els: typingsJapgolly.std.Element): typingsJapgolly.materializeCss.M.Dropdown = js.native
  def init(els: typingsJapgolly.std.Element, options: PartialDropdownOptions): typingsJapgolly.materializeCss.M.Dropdown = js.native
}

