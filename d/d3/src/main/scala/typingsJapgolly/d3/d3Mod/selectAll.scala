package typingsJapgolly.d3.d3Mod

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.d3DashSelection.d3DashSelectionMod.ArrayLike
import typingsJapgolly.d3DashSelection.d3DashSelectionMod.BaseType
import typingsJapgolly.d3DashSelection.d3DashSelectionMod.Selection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3", "selectAll")
@js.native
object selectAll extends js.Object {
  def apply(): Selection[Null, js.UndefOr[scala.Nothing], Null, js.UndefOr[scala.Nothing]] = js.native
  def apply[GElement /* <: BaseType */, OldDatum](nodes: js.Array[GElement]): Selection[GElement, OldDatum, Null, js.UndefOr[scala.Nothing]] = js.native
  def apply[GElement /* <: BaseType */, OldDatum](nodes: ArrayLike[GElement]): Selection[GElement, OldDatum, Null, js.UndefOr[scala.Nothing]] = js.native
  def apply[GElement /* <: BaseType */, OldDatum](selector: String): Selection[GElement, OldDatum, HTMLElement, _] = js.native
}

