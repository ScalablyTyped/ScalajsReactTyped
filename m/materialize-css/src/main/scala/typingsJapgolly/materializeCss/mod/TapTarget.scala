package typingsJapgolly.materializeCss.mod

import org.scalajs.dom.raw.Element
import typingsJapgolly.materializeCss.MElements
import typingsJapgolly.materializeCss.PartialTapTargetOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", "TapTarget")
@js.native
class TapTarget ()
  extends typingsJapgolly.materializeCss.M.TapTarget

/* static members */
@JSImport("materialize-css", "TapTarget")
@js.native
object TapTarget extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typingsJapgolly.materializeCss.M.TapTarget = js.native
  /**
    * Init TapTargets
    */
  def init(els: MElements): js.Array[typingsJapgolly.materializeCss.M.TapTarget] = js.native
  def init(els: MElements, options: PartialTapTargetOptions): js.Array[typingsJapgolly.materializeCss.M.TapTarget] = js.native
  /**
    * Init TapTarget
    */
  def init(els: typingsJapgolly.std.Element): typingsJapgolly.materializeCss.M.TapTarget = js.native
  def init(els: typingsJapgolly.std.Element, options: PartialTapTargetOptions): typingsJapgolly.materializeCss.M.TapTarget = js.native
}

