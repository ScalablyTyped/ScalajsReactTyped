package typingsJapgolly.materializeCss.mod

import org.scalajs.dom.raw.Element
import typingsJapgolly.materializeCss.MElements
import typingsJapgolly.materializeCss.PartialMaterialboxOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", "Materialbox")
@js.native
class Materialbox ()
  extends typingsJapgolly.materializeCss.M.Materialbox

/* static members */
@JSImport("materialize-css", "Materialbox")
@js.native
object Materialbox extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typingsJapgolly.materializeCss.M.Materialbox = js.native
  /**
    * Init Materialboxes
    */
  def init(els: MElements): js.Array[typingsJapgolly.materializeCss.M.Materialbox] = js.native
  def init(els: MElements, options: PartialMaterialboxOptions): js.Array[typingsJapgolly.materializeCss.M.Materialbox] = js.native
  /**
    * Init Materialbox
    */
  def init(els: typingsJapgolly.std.Element): typingsJapgolly.materializeCss.M.Materialbox = js.native
  def init(els: typingsJapgolly.std.Element, options: PartialMaterialboxOptions): typingsJapgolly.materializeCss.M.Materialbox = js.native
}

