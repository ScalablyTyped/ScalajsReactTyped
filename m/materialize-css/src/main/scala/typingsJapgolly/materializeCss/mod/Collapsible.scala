package typingsJapgolly.materializeCss.mod

import org.scalajs.dom.raw.Element
import typingsJapgolly.materializeCss.MElements
import typingsJapgolly.materializeCss.PartialCollapsibleOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", "Collapsible")
@js.native
class Collapsible ()
  extends typingsJapgolly.materializeCss.M.Collapsible

/* static members */
@JSImport("materialize-css", "Collapsible")
@js.native
object Collapsible extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typingsJapgolly.materializeCss.M.Collapsible = js.native
  /**
    * Init Collapsibles
    */
  def init(els: MElements): js.Array[typingsJapgolly.materializeCss.M.Collapsible] = js.native
  def init(els: MElements, options: PartialCollapsibleOptions): js.Array[typingsJapgolly.materializeCss.M.Collapsible] = js.native
  /**
    * Init Collapsible
    */
  def init(els: typingsJapgolly.std.Element): typingsJapgolly.materializeCss.M.Collapsible = js.native
  def init(els: typingsJapgolly.std.Element, options: PartialCollapsibleOptions): typingsJapgolly.materializeCss.M.Collapsible = js.native
}

