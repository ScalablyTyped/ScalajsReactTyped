package typingsJapgolly.d3.mod

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.d3Selection.mod.BaseType
import typingsJapgolly.d3Transition.mod.Transition_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3", "transition")
@js.native
object transition extends js.Object {
  def apply[OldDatum](): Transition_[HTMLElement, OldDatum, Null, js.UndefOr[scala.Nothing]] = js.native
  def apply[OldDatum](name: String): Transition_[HTMLElement, OldDatum, Null, js.UndefOr[scala.Nothing]] = js.native
  def apply[OldDatum](transition: Transition_[BaseType, _, BaseType, _]): Transition_[HTMLElement, OldDatum, Null, js.UndefOr[scala.Nothing]] = js.native
}

