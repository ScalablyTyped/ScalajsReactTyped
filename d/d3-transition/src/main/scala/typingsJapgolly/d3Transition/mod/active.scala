package typingsJapgolly.d3Transition.mod

import typingsJapgolly.d3Selection.mod.BaseType
import typingsJapgolly.d3Selection.mod.EnterElement
import typingsJapgolly.std.Document_
import typingsJapgolly.std.Element
import typingsJapgolly.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3-transition", "active")
@js.native
object active extends js.Object {
  def apply[Datum, PElement /* <: BaseType */, PDatum](): (Transition_[Null, Datum, PElement, PDatum]) | Null = js.native
  def apply[Datum, PElement /* <: BaseType */, PDatum](node: Null, name: String): (Transition_[Null, Datum, PElement, PDatum]) | Null = js.native
  def apply[Datum, PElement /* <: BaseType */, PDatum](node: EnterElement): (Transition_[EnterElement, Datum, PElement, PDatum]) | Null = js.native
  def apply[Datum, PElement /* <: BaseType */, PDatum](node: EnterElement, name: String): (Transition_[EnterElement, Datum, PElement, PDatum]) | Null = js.native
  def apply[Datum, PElement /* <: BaseType */, PDatum](node: Document_): (Transition_[Document_, Datum, PElement, PDatum]) | Null = js.native
  def apply[Datum, PElement /* <: BaseType */, PDatum](node: Document_, name: String): (Transition_[Document_, Datum, PElement, PDatum]) | Null = js.native
  def apply[Datum, PElement /* <: BaseType */, PDatum](node: Element): (Transition_[org.scalajs.dom.raw.Element, Datum, PElement, PDatum]) | Null = js.native
  def apply[Datum, PElement /* <: BaseType */, PDatum](node: Element, name: String): (Transition_[org.scalajs.dom.raw.Element, Datum, PElement, PDatum]) | Null = js.native
  def apply[Datum, PElement /* <: BaseType */, PDatum](node: Window_): (Transition_[Window_, Datum, PElement, PDatum]) | Null = js.native
  def apply[Datum, PElement /* <: BaseType */, PDatum](node: Window_, name: String): (Transition_[Window_, Datum, PElement, PDatum]) | Null = js.native
}

