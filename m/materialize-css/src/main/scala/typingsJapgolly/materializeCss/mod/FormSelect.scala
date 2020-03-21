package typingsJapgolly.materializeCss.mod

import org.scalajs.dom.raw.Element
import typingsJapgolly.materializeCss.MElements
import typingsJapgolly.materializeCss.PartialFormSelectOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", "FormSelect")
@js.native
class FormSelect ()
  extends typingsJapgolly.materializeCss.M.FormSelect

/* static members */
@JSImport("materialize-css", "FormSelect")
@js.native
object FormSelect extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typingsJapgolly.materializeCss.M.FormSelect = js.native
  /**
    * Init FormSelects
    */
  def init(els: MElements): js.Array[typingsJapgolly.materializeCss.M.FormSelect] = js.native
  def init(els: MElements, options: PartialFormSelectOptions): js.Array[typingsJapgolly.materializeCss.M.FormSelect] = js.native
  /**
    * Init FormSelect
    */
  def init(els: typingsJapgolly.std.Element): typingsJapgolly.materializeCss.M.FormSelect = js.native
  def init(els: typingsJapgolly.std.Element, options: PartialFormSelectOptions): typingsJapgolly.materializeCss.M.FormSelect = js.native
}

