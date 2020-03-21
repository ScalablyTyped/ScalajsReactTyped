package typingsJapgolly.materializeCss.mod

import org.scalajs.dom.raw.Element
import typingsJapgolly.materializeCss.MElements
import typingsJapgolly.materializeCss.PartialFloatingActionButt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", "FloatingActionButton")
@js.native
class FloatingActionButton ()
  extends typingsJapgolly.materializeCss.M.FloatingActionButton

/* static members */
@JSImport("materialize-css", "FloatingActionButton")
@js.native
object FloatingActionButton extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typingsJapgolly.materializeCss.M.FloatingActionButton = js.native
  /**
    * Init FloatingActionButtons
    */
  def init(els: MElements): js.Array[typingsJapgolly.materializeCss.M.FloatingActionButton] = js.native
  def init(els: MElements, options: PartialFloatingActionButt): js.Array[typingsJapgolly.materializeCss.M.FloatingActionButton] = js.native
  /**
    * Init FloatingActionButton
    */
  def init(els: typingsJapgolly.std.Element): typingsJapgolly.materializeCss.M.FloatingActionButton = js.native
  def init(els: typingsJapgolly.std.Element, options: PartialFloatingActionButt): typingsJapgolly.materializeCss.M.FloatingActionButton = js.native
}

