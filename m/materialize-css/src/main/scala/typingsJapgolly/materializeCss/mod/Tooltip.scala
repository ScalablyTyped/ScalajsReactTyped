package typingsJapgolly.materializeCss.mod

import org.scalajs.dom.raw.Element
import typingsJapgolly.materializeCss.MElements
import typingsJapgolly.materializeCss.PartialTooltipOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", "Tooltip")
@js.native
class Tooltip ()
  extends typingsJapgolly.materializeCss.M.Tooltip

/* static members */
@JSImport("materialize-css", "Tooltip")
@js.native
object Tooltip extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typingsJapgolly.materializeCss.M.Tooltip = js.native
  /**
    * Init Tooltips
    */
  def init(els: MElements): js.Array[typingsJapgolly.materializeCss.M.Tooltip] = js.native
  def init(els: MElements, options: PartialTooltipOptions): js.Array[typingsJapgolly.materializeCss.M.Tooltip] = js.native
  /**
    * Init Tooltip
    */
  def init(els: typingsJapgolly.std.Element): typingsJapgolly.materializeCss.M.Tooltip = js.native
  def init(els: typingsJapgolly.std.Element, options: PartialTooltipOptions): typingsJapgolly.materializeCss.M.Tooltip = js.native
}

