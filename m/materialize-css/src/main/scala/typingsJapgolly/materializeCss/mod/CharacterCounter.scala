package typingsJapgolly.materializeCss.mod

import org.scalajs.dom.raw.Element
import typingsJapgolly.materializeCss.MElements
import typingsJapgolly.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", "CharacterCounter")
@js.native
class CharacterCounter ()
  extends typingsJapgolly.materializeCss.M.CharacterCounter

/* static members */
@JSImport("materialize-css", "CharacterCounter")
@js.native
object CharacterCounter extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typingsJapgolly.materializeCss.M.CharacterCounter = js.native
  /**
    * Init CharacterCounters
    */
  def init(els: MElements): js.Array[typingsJapgolly.materializeCss.M.CharacterCounter] = js.native
  def init(els: MElements, options: Partial[js.UndefOr[scala.Nothing]]): js.Array[typingsJapgolly.materializeCss.M.CharacterCounter] = js.native
  /**
    * Init CharacterCounter
    */
  def init(els: typingsJapgolly.std.Element): typingsJapgolly.materializeCss.M.CharacterCounter = js.native
  def init(els: typingsJapgolly.std.Element, options: Partial[js.UndefOr[scala.Nothing]]): typingsJapgolly.materializeCss.M.CharacterCounter = js.native
}

